(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Duration]))

(def zero java.time.Duration/ZERO)

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn to-nanos
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toNanos this)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusMillis this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of-days
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofDays arg0)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (java.time.Duration/of arg0 arg1)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.multipliedBy this arg0)))

(clojure.core/defn with-nanos
  {:arglists (quote (["java.time.Duration" "int"]))}
  (^java.time.Duration [^java.time.Duration this ^java.lang.Integer arg0]
   (.withNanos this arg0)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Duration"]))}
  (^java.util.List [^java.time.Duration this]
   (.getUnits this)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this]
   (.getNano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusMillis this arg0)))

(clojure.core/defn to-minutes
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toMinutes this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration arg0]
   (.plus this arg0))
  (^java.time.Duration [^java.time.Duration this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn divided-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.dividedBy this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.String [^java.time.Duration this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration arg0]
   (.minus this arg0))
  (^java.time.Duration [^java.time.Duration this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal arg0]
   (.addTo this arg0)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn of-hours
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofHours arg0)))

(clojure.core/defn to-millis
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toMillis this)))

(clojure.core/defn to-hours
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toHours this)))

(clojure.core/defn of-nanos
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofNanos arg0)))

(clojure.core/defn of-millis
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofMillis arg0)))

(clojure.core/defn negated
  {:arglists (quote (["java.time.Duration"]))}
  (^java.time.Duration [^java.time.Duration this]
   (.negated this)))

(clojure.core/defn abs
  {:arglists (quote (["java.time.Duration"]))}
  (^java.time.Duration [^java.time.Duration this]
   (.abs this)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^java.time.Duration [^java.time.temporal.Temporal arg0 ^java.time.temporal.Temporal arg1]
   (java.time.Duration/between arg0 arg1)))

(clojure.core/defn get-seconds
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.getSeconds this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^java.time.Duration [^java.time.temporal.TemporalAmount arg0]
   (java.time.Duration/from arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^java.time.Duration [^java.lang.CharSequence arg0]
   (java.time.Duration/parse arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this]
   (.hashCode this)))

(clojure.core/defn with-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.withSeconds this arg0)))

(clojure.core/defn of-minutes
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofMinutes arg0)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal arg0]
   (.subtractFrom this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this ^java.time.Duration arg0]
   (.compareTo this arg0)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.Duration this ^java.time.temporal.ChronoUnit arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Duration" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Duration this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn of-seconds
  {:arglists (quote (["long"] ["long" "long"]))}
  (^java.time.Duration [^long arg0]
   (java.time.Duration/ofSeconds arg0))
  (^java.time.Duration [^long arg0 ^long arg1]
   (java.time.Duration/ofSeconds arg0 arg1)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long arg0]
   (.minusDays this arg0)))

(clojure.core/defn to-days
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toDays this)))
