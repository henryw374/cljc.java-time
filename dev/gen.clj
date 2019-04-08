 (ns gen
   (:require [clojure.reflect :as rf]
             [clojure.set :as set]
             [medley.core :as m]
             [clojure.string :as string]
             [camel-snake-kebab.core :as csk]
             [clojure.java.io :as io])
   (:import [java.time Period
                       LocalDate
                       LocalDateTime
                       ZonedDateTime
                       OffsetTime
                       Instant
                       OffsetDateTime
                       ZoneId
                       DayOfWeek
                       LocalTime
                       Month
                       Duration
                       Year
                       YearMonth]
            [java.time.format DateTimeFormatter
                              ResolverStyle]
            [java.time.temporal TemporalAdjusters
                                Temporal
                                TemporalAmount
                                ChronoUnit
                                ChronoField]))
 
 (defn header [class-name ns-name sub-p]
   (list 'ns (symbol (str "cljc.java-time." (when sub-p (str sub-p ".")) ns-name))
     (list :require
       ['cljs.java-time.interop :as 'jti]
       (symbol "#?") (list
                       :cljs [(symbol (str "cljs.java-time" (when sub-p (str "." sub-p)))) :refer [class-name]]))
     (symbol "#?") (list
                            :clj
                            (list :import [(symbol (str "java.time" (when sub-p (str "." sub-p)))) class-name]))))
 
 (defn type-hint [x]
   (let [x (str x)]
     (when (or (clojure.string/includes? x ".")
             ;(#{"long" "double"} x)
             )
       (symbol (str "^" x)))))

(defn gen-for-class [c sub-p]
  (println (header (.getSimpleName c) (csk/->kebab-case (.getSimpleName c))
             sub-p))
  (doseq [ms (vals (group-by :name (:members (rf/reflect c))))]
    (let [[m]  ms
          ;group ms by paramter count - if >1 in  a group, just one, without any type hints
          ms (if (and (= "Year" (.getSimpleName c)) (= "isLeap" (str (:name (first ms)))))
               (filter #(not-empty (set/intersection #{:static} (:flags %))) ms)
               (->> (group-by #(count (:parameter-types %)) ms)
                    vals
                    (map (fn [fs]
                           ;(println (str (:name (first fs))) " " (count fs))
                           (if (= (count fs) 1)
                             (first fs)
                             (do
                               (update (first fs)
                                 :parameter-types (fn [pt]
                                                    (map (fn [_] 'int) pt)))))))))]
      
      
      ;(println m)
      (println)
      (when (and (:return-type m) (not-empty (set/intersection #{:public} (:flags m))))
        (println
          (keep identity
            (concat (list 'defn (csk/->kebab-case (:name m)) (type-hint (.getName (:return-type m))))
              (map 
                (fn [m]
                  (let [static? (not-empty (set/intersection #{:static} (:flags m)))]
                    (let [o-sym (gensym)
                          p-syms (mapcat (fn [n]
                                           (if-let [th (type-hint n)]
                                             [th (gensym)]
                                             [(gensym)])) (:parameter-types m))
                          p-syms
                          (vec (flatten
                                 (if-not static? 
                                   (cons [(type-hint (.getName c)) o-sym] p-syms) p-syms)))]
                      (list (vec p-syms)
                        (concat
                          (if static?
                            (list '. c (:name m))
                            (if (and (string/starts-with? (:name m) "get") (> (count (str (:name m))) 3))
                              (list 'jti/getter (let [[f & r] (subs (str (:name m)) 3)]
                                                  (symbol (apply str (string/lower-case f) r))))
                              (list (symbol (str "." (:name m)))))
                            )
                          p-syms)))))
                ms)
              
              
              )))
        (println)))
    ))
 
 (comment 
   (def ms (:members (rf/reflect LocalDate)))
   (vals (group-by :name ms))
   (def m (->> (:members (rf/reflect java.time.Year))
               (m/find-first #(= "isLeap" (str (:name %))))))
   (def c LocalDate)
   (csk/->kebab-case (.getSimpleName LocalDate))
   (gen-for-class LocalDate)

   (do
     (doseq [c [Period
                LocalDate
                LocalDateTime
                ZonedDateTime
                OffsetTime
                Instant
                OffsetDateTime
                ZoneId
                DayOfWeek
                LocalTime
                Month
                Duration
                Year
                YearMonth]]
       (let [w (io/writer (str "./src/cljc/java_time/" (csk/->snake_case (.getSimpleName c)) ".cljc"))]
         (binding [*out* w]
           (gen-for-class c nil))))
     (doseq [c [TemporalAdjusters
                Temporal
                TemporalAmount
                ChronoUnit
                ChronoField]]
       (let [w (io/writer (str "./src/cljc/java_time/temporal/" (csk/->snake_case (.getSimpleName c)) ".cljc"))]
         (binding [*out* w]
           (gen-for-class c "temporal"))))
     (doseq [c [DateTimeFormatter
                ResolverStyle]]
       (let [w (io/writer (str "./src/cljc/java_time/format/" (csk/->snake_case (.getSimpleName c)) ".cljc"))]
         (binding [*out* w]
           (gen-for-class c "format"))))
     )

   
   (require '[clojure.tools.namespace.repl :as rep])
   (rep/refresh-all)
   )