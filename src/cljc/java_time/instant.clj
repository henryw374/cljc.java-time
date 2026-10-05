(ns cljc.java-time.instant
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Instant]))

(def min java.time.Instant/MIN)

(def epoch java.time.Instant/EPOCH)

(def max java.time.Instant/MAX)

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.ChronoUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.Instant this ^java.time.temporal.TemporalField arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.range this arg0))))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long"] ["long" "long"]))}
  (^java.time.Instant [^long arg0]
   (java.time.Instant/ofEpochSecond arg0))
  (^java.time.Instant [^long arg0 ^long arg1]
   (java.time.Instant/ofEpochSecond arg0 arg1)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.Instant" "java.time.ZoneOffset"]))}
  (^java.time.OffsetDateTime [^java.time.Instant this ^java.time.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.minusMillis this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Instant"]))}
  (^java.lang.Integer [^java.time.Instant this]
   (.getNano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.plusMillis this arg0)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this arg0)))
  (^java.time.Instant [^java.time.Instant this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this arg0 arg1))))

(clojure.core/defn query
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.Instant this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Instant"]))}
  (^java.lang.String [^java.time.Instant this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this arg0)))
  (^java.time.Instant [^java.time.Instant this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this arg0 arg1))))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.Instant this ^java.time.ZoneId arg0]
   (.atZone this arg0)))

(clojure.core/defn of-epoch-milli
  {:arglists (quote (["long"]))}
  (^java.time.Instant [^long arg0]
   (java.time.Instant/ofEpochMilli arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.Instant this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.Instant this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.until this arg0 arg1))))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.Instant [^java.time.temporal.TemporalAccessor arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (java.time.Instant/from arg0))))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]
                     ["java.time.Instant" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.Instant this arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.Instant this arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^java.time.Instant [^java.lang.CharSequence arg0]
   (java.time.Instant/parse arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Instant"]))}
  (^java.lang.Integer [^java.time.Instant this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Instant this ^java.time.temporal.Temporal arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.adjustInto this arg0))))

(clojure.core/defn with
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Instant" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAdjuster arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this arg0)))
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this arg0 arg1))))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"]))}
  (^java.time.Instant []
   (java.time.Instant/now))
  (^java.time.Instant [^java.time.Clock arg0]
   (java.time.Instant/now arg0)))

(clojure.core/defn to-epoch-milli
  {:arglists (quote (["java.time.Instant"]))}
  (^long [^java.time.Instant this]
   (.toEpochMilli this)))

(clojure.core/defn get-epoch-second
  {:arglists (quote (["java.time.Instant"]))}
  (^long [^java.time.Instant this]
   (.getEpochSecond this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^java.lang.Integer [^java.time.Instant this ^java.time.Instant arg0]
   (.compareTo this arg0)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^java.time.Instant [^java.time.Instant this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.Instant this ^java.time.temporal.TemporalField arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.get this arg0))))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Instant" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Instant this ^java.lang.Object arg0]
   (.equals this arg0)))
