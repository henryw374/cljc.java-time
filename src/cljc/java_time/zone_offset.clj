(ns cljc.java-time.zone-offset
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZoneOffset]))

(def max java.time.ZoneOffset/MAX)

(def min java.time.ZoneOffset/MIN)

(def utc java.time.ZoneOffset/UTC)

(clojure.core/defn get-available-zone-ids
  {:arglists (quote ([]))}
  (^java.util.Set []
   (java.time.ZoneOffset/getAvailableZoneIds)))

(clojure.core/defn range
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.ZoneOffset this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of-total-seconds
  {:arglists (quote (["int"]))}
  (^java.time.ZoneOffset [^java.lang.Integer arg0]
   (java.time.ZoneOffset/ofTotalSeconds arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))}
  (^java.lang.Object [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [arg0 ^"java.lang.String" arg0] (java.time.ZoneOffset/of arg0))
                      (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [arg0 ^"java.lang.String" arg0] (java.time.ZoneOffset/of arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.ZoneId [^java.lang.String arg0 ^java.util.Map arg1]
   (java.time.ZoneOffset/of arg0 arg1)))

(clojure.core/defn of-offset
  {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))}
  (^java.time.ZoneId [^java.lang.String arg0 ^java.time.ZoneOffset arg1]
   (java.time.ZoneOffset/ofOffset arg0 arg1)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.ZoneOffset this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.String [^java.time.ZoneOffset this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^java.time.ZoneOffset this ^java.time.format.TextStyle arg0 ^java.util.Locale arg1]
   (.getDisplayName this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.ZoneOffset this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-rules
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.time.zone.ZoneRules [^java.time.ZoneOffset this]
   (.getRules this)))

(clojure.core/defn of-hours
  {:arglists (quote (["int"]))}
  (^java.time.ZoneOffset [^java.lang.Integer arg0]
   (java.time.ZoneOffset/ofHours arg0)))

(clojure.core/defn get-id
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.String [^java.time.ZoneOffset this]
   (.getId this)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.time.ZoneId [^java.time.ZoneOffset this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists (quote ([]))}
  (^java.time.ZoneId []
   (java.time.ZoneOffset/systemDefault)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"]))}
  (^java.lang.Object [arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalAccessor" arg0] (java.time.ZoneOffset/from arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalAccessor" arg0] (java.time.ZoneOffset/from arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn of-hours-minutes-seconds
  {:arglists (quote (["int" "int" "int"]))}
  (^java.time.ZoneOffset [^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2]
   (java.time.ZoneOffset/ofHoursMinutesSeconds arg0 arg1 arg2)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.ZoneOffset this ^java.time.temporal.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.Integer [^java.time.ZoneOffset this]
   (.hashCode this)))

(clojure.core/defn get-total-seconds
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.Integer [^java.time.ZoneOffset this]
   (.getTotalSeconds this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.ZoneOffset this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn of-hours-minutes
  {:arglists (quote (["int" "int"]))}
  (^java.time.ZoneOffset [^java.lang.Integer arg0 ^java.lang.Integer arg1]
   (java.time.ZoneOffset/ofHoursMinutes arg0 arg1)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"]))}
  (^java.lang.Integer [^java.time.ZoneOffset this ^java.time.ZoneOffset arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.ZoneOffset this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.ZoneOffset this ^java.lang.Object arg0]
   (.equals this arg0)))
