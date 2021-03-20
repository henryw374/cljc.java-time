(ns defwrapper
  "based on gist by @plexus"
  (:require [clojure.string :as string]
            [medley.core :as m]
            [figwheel.main.logging :as log])
  (:import (java.time.format DateTimeFormatter)
           (java.time Instant)
           (java.lang.reflect Modifier Method)))

(set! *warn-on-reflection* true)
(set! *print-meta* true)

(defn class-methods [^Class class]
  (seq (.getMethods class)))

(defn constructors [^Class klazz]
  (.getDeclaredConstructors klazz))

(defn return-type [^java.lang.reflect.Method method]
  (.getReturnType method))

(defn parameter-types [^java.lang.reflect.Method method]
  (seq (.getParameterTypes method)))

(defn method-static? [^java.lang.reflect.Method method]
  (java.lang.reflect.Modifier/isStatic (.getModifiers method)))

(defn parameter-count [^java.lang.reflect.Method method]
  (.getParameterCount method))

(defn method-name [^java.lang.reflect.Method method]
  (.getName method))

(defn class-name [^Class klazz]
  (let [original-name (.getName klazz)]
    (symbol (if (= "java.time.temporal.TemporalUnit" (.getName klazz))
              "java.time.temporal.ChronoUnit"
              original-name))))

(defn camel->kebab
  [string]
  (-> string
      (clojure.string/replace #"(.)([A-Z][a-z]+)" "$1-$2")
      (clojure.string/replace #"([a-z0-9])([A-Z])" "$1-$2")
      (clojure.string/lower-case)))

(defn class->name [^Class class]
  (->
    (if (.isArray class)
      (str (.getName (.getComponentType class)) "-array")
      (.getName class))
    (string/replace "." "-")))

(defn method-public? [^java.lang.reflect.Method method]
  (java.lang.reflect.Modifier/isPublic (.getModifiers method)))

(defn primitive-class [sym]
  ('{byte    java.lang.Byte/TYPE
     short   java.lang.Short/TYPE
     int     java.lang.Integer/TYPE
     long    java.lang.Long/TYPE
     float   java.lang.Float/TYPE
     double  java.lang.Double/TYPE
     char    java.lang.Character/TYPE
     boolean java.lang.Boolean/TYPE} sym sym))

(defn array-class [klz]
  (class (into-array klz [])))

(defn ensure-boxed [t]
  (get '{byte    java.lang.Byte
         short   java.lang.Short
         int     java.lang.Number
         long    java.lang.Long
         float   java.lang.Float
         double  java.lang.Double
         char    java.lang.Character
         boolean java.lang.Boolean
         void    java.lang.Object}
    t t))

(defn ensure-boxed-long-double
  "Allow long and double, box everything else."
  [c]
  (let [t (if (instance? Class c)
            (class-name c)
            c)]
    (get '{byte    java.lang.Byte
           short   java.lang.Short
           int     java.lang.Integer
           float   java.lang.Float
           char    java.lang.Character
           boolean java.lang.Boolean
           void    java.lang.Object}
      t t)))

(defn joda-name [c]
  (if (and
        (instance? Class c)
        (string/starts-with? (.getName c) "java.time"))
    (symbol (str "js/JSJoda." (.getSimpleName c)))
    (if (and (instance? Class c) (.isArray ^Class c))
      (.getName (type c))
      c)))

(defn tagged [value tag ext]
  (if (= :clj ext)
    (let [tag (if (and (instance? Class tag) (.isArray ^Class tag))
                (.getName (type tag))
                tag)]
      (vary-meta value assoc :tag (ensure-boxed-long-double tag)))
    (vary-meta value assoc :tag (joda-name tag))))

(defn instance-method [nm ext]
  (if (and
        (= :cljs ext)
        (string/starts-with? nm "get")
        (not= "getLong" (str nm))
        (> (count (str nm)) 3))
    (list (let [[f & r] (subs (str nm) 3)]
            (symbol (apply str "." (string/lower-case f) r))))
    (list (symbol (str "." nm)))))

(defn tagged-local [value tag]
  (let [tag (ensure-boxed-long-double tag)]
    (cond
      (= 'long tag)
      `(long ~value)

      (= 'double tag)
      `(double ~value)

      (= 'java.lang.Integer tag)
      `(int ~value)

      :else
      (vary-meta value assoc :tag (.getName tag)))))

(defn method-call [static? klazz nam ext]
  (if static?
    (if (= :clj ext)
      (list (symbol (str (.getName klazz) "/" nam)))
      ; interop hints don't appear to be respected for 'static fns'
      (list 'js-invoke (symbol (.getName klazz)) (symbol (str "\"" nam "\""))))
    (instance-method nam ext)))

(defn wrapper-multi-tail [klazz methods ext helpful?]
  (let [static? (method-static? (first methods))
        nam (method-name (first methods))
        this (gensym "this")
        arg-vec (take (parameter-count (first methods)) (repeatedly gensym))
        ret (if (apply = (map return-type methods))
              (return-type (first methods))
              java.lang.Object)
        method-call (method-call static? klazz nam ext)
        bod (if (= :cljs ext)
             `(~@method-call
                ~@(when-not static? [(tagged this klazz ext)])
                ~@arg-vec)
             `(cond
                ~@(mapcat
                  (fn [method]
                    `[(and ~@(map (fn [sym ^Class klz]
                                    (if (.isArray klz)
                                       `(= ~(.getComponentType klz)
                                          (.getComponentType (class ~sym)))
                                       `(instance? ~(ensure-boxed (class-name klz)) ~sym)))
                               arg-vec
                               (parameter-types method)))
                      (let [~@(mapcat (fn [sym ^Class klz]
                                        [sym (tagged-local sym klz)])
                                arg-vec
                                (parameter-types method))]
                        (~@method-call
                          ~@(when-not static? [(tagged this klazz ext)])
                          ~@arg-vec))])
                  methods)
                :else (throw (IllegalArgumentException. "no corresponding java.time method with these args"))))
        bod (if helpful?
              `(~(if (= :clj ext) 'cljc.java-time.extn.calendar-awareness/calendar-aware-clj
                                  'cljc.java-time.extn.calendar-awareness/calendar-aware-cljs)
                 ~bod)
              bod)]
    `(~(tagged `[~@(when-not static? [this]) ~@arg-vec] ret ext)
       ~bod)))

(defn wrapper-tail [klazz method ext helpful?]
  (let [nam (method-name method)
        ret (return-type method)
        par (parameter-types method)
        static? (method-static? method)
        arg-vec (into (if static? [] [(tagged (gensym "this") klazz ext)])
                  (map #(tagged (gensym (class->name %)) % ext))
                  par)
        method-call (method-call static? klazz nam ext)
        bod `(~@method-call ~@(map #(vary-meta % dissoc :tag) arg-vec))
        bod (if helpful?
              `(~(if (= :clj ext) 'cljc.java-time.extn.calendar-awareness/calendar-aware-clj
                                  'cljc.java-time.extn.calendar-awareness/calendar-aware-cljs)
                 ~bod)
              bod)]
    `(~(tagged arg-vec ret ext)
       ~bod)))

(defn method-wrapper-form [fname klazz methods ext helpful?]
  (let [arities (group-by parameter-count methods)
        static? (method-static? (first methods))]
    `(defn ~fname
       {:arglists '~(map (comp (partial into (if static? [] [(.getName klazz)]))
                           #(map (fn [x] (.getName x)) %)
                           parameter-types) methods)}
       ~@(map (fn [[cnt meths]]
                (if (= 1 (count meths))
                  (wrapper-tail klazz (first meths) ext helpful?)
                  (wrapper-multi-tail klazz meths ext helpful?)))
           arities))))


(defn concrete? [^Method m]
  (not (Modifier/isVolatile (.getModifiers m))))

(defn methods-for-class [klazz]
  (->> klazz
       class-methods
       (filter method-public?)
       (filter concrete?)
       (remove (set (class-methods Object)))
       (group-by method-name)))

(def helpful-exceptions
  {Instant           #{'minus
                       'plus
                       'range
                       'until
                       'from
                       'adjust-into
                       'with
                       'get}
   DateTimeFormatter #{'format}})

(defn defwrapper [klazz ext & [prefix]]
  (let [methods (methods-for-class klazz)
        helpful-fns (get helpful-exceptions klazz)]
    (do
      (for [[mname meths] methods
            :let [fname (symbol (str prefix (camel->kebab mname)))]]
        (method-wrapper-form fname klazz meths ext (contains? helpful-fns fname))))))

(comment
  (-> (methods-for-class java.time.LocalDateTime)
      (get "toLocalDate")
      ;last
      ;(.getModifiers)
      ;(Modifier/toString)
      )

  (-> (seq (.getDeclaredMethods java.time.LocalDateTime)))
  (method-wrapper-form "foo" java.time.LocalDateTime
    meths ext (contains? helpful-fns fname))
  )