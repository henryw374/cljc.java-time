(ns cljc.java-time.zone-offset
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZoneOffset]))

(def max java.time.ZoneOffset/MAX)

(def min java.time.ZoneOffset/MIN)

(def utc java.time.ZoneOffset/UTC)

(clojure.core/defn get-available-zone-ids
  {:arglists '([])}
  (^java.util.Set []
   (java.time.ZoneOffset/getAvailableZoneIds)))

(clojure.core/defn range
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.ZoneOffset this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn of-total-seconds
  {:arglists '(["int"])}
  (^java.time.ZoneOffset [^java.lang.Integer total-seconds]
   (java.time.ZoneOffset/ofTotalSeconds total-seconds)))

(clojure.core/defn of
  {:arglists '(["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"])}
  (^java.lang.Object [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [zone-id ^"java.lang.String" arg0] (java.time.ZoneOffset/of zone-id))
                      (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [offset-id ^"java.lang.String" arg0] (java.time.ZoneOffset/of offset-id))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (java.time.ZoneOffset/of zone-id alias-map)))

(clojure.core/defn of-offset
  {:arglists '(["java.lang.String" "java.time.ZoneOffset"])}
  (^java.time.ZoneId [^java.lang.String prefix ^java.time.ZoneOffset offset]
   (java.time.ZoneOffset/ofOffset prefix offset)))

(clojure.core/defn query
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.ZoneOffset this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.String [^java.time.ZoneOffset this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.ZoneOffset this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(clojure.core/defn get-long
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^long [^java.time.ZoneOffset this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-rules
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.time.zone.ZoneRules [^java.time.ZoneOffset this]
   (.getRules this)))

(clojure.core/defn of-hours
  {:arglists '(["int"])}
  (^java.time.ZoneOffset [^java.lang.Integer hours]
   (java.time.ZoneOffset/ofHours hours)))

(clojure.core/defn get-id
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.String [^java.time.ZoneOffset this]
   (.getId this)))

(clojure.core/defn normalized
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.time.ZoneId [^java.time.ZoneOffset this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists '([])}
  (^java.time.ZoneId []
   (java.time.ZoneOffset/systemDefault)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"])}
  (^java.lang.Object [arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor arg0))
       (clojure.core/let [temporal ^"java.time.temporal.TemporalAccessor" arg0] (java.time.ZoneOffset/from temporal))
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor arg0))
       (clojure.core/let [temporal ^"java.time.temporal.TemporalAccessor" arg0] (java.time.ZoneOffset/from temporal))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn of-hours-minutes-seconds
  {:arglists '(["int" "int" "int"])}
  (^java.time.ZoneOffset [^java.lang.Integer hours ^java.lang.Integer minutes ^java.lang.Integer seconds]
   (java.time.ZoneOffset/ofHoursMinutesSeconds hours minutes seconds)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.ZoneOffset this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.Integer [^java.time.ZoneOffset this]
   (.hashCode this)))

(clojure.core/defn get-total-seconds
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.Integer [^java.time.ZoneOffset this]
   (.getTotalSeconds this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.ZoneOffset this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn of-hours-minutes
  {:arglists '(["int" "int"])}
  (^java.time.ZoneOffset [^java.lang.Integer hours ^java.lang.Integer minutes]
   (java.time.ZoneOffset/ofHoursMinutes hours minutes)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.ZoneOffset" "java.time.ZoneOffset"])}
  (^java.lang.Integer [^java.time.ZoneOffset this ^java.time.ZoneOffset other]
   (.compareTo this other)))

(clojure.core/defn get
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.ZoneOffset this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.ZoneOffset" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.ZoneOffset this ^java.lang.Object obj]
   (.equals this obj)))
