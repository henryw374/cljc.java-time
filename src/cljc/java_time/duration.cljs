(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Duration]]))

(def zero (goog.object/get java.time.Duration "ZERO"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn to-nanos
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.toNanos this)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusMillis this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of-days
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofDays" arg0)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Duration"]))}
  (^boolean [^js/JSJoda.Duration this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Duration [^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (js-invoke java.time.Duration "of" arg0 arg1)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Duration"]))}
  (^boolean [^js/JSJoda.Duration this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.multipliedBy this arg0)))

(clojure.core/defn with-nanos
  {:arglists (quote (["java.time.Duration" "int"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^int arg0]
   (.withNanos this arg0)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Duration"]))}
  (^java.util.List [^js/JSJoda.Duration this]
   (.units this)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Duration"]))}
  (^int [^js/JSJoda.Duration this]
   (.nano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusMillis this arg0)))

(clojure.core/defn to-minutes
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.toMinutes this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^js/JSJoda.Duration arg0]
   (.plus this arg0))
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn divided-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.dividedBy this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.String [^js/JSJoda.Duration this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^js/JSJoda.Duration arg0]
   (.minus this arg0))
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Duration this ^js/JSJoda.Temporal arg0]
   (.addTo this arg0)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn of-hours
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofHours" arg0)))

(clojure.core/defn to-millis
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.toMillis this)))

(clojure.core/defn to-hours
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.toHours this)))

(clojure.core/defn of-nanos
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofNanos" arg0)))

(clojure.core/defn of-millis
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofMillis" arg0)))

(clojure.core/defn negated
  {:arglists (quote (["java.time.Duration"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this]
   (.negated this)))

(clojure.core/defn abs
  {:arglists (quote (["java.time.Duration"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this]
   (.abs this)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Temporal arg0 ^js/JSJoda.Temporal arg1]
   (js-invoke java.time.Duration "between" arg0 arg1)))

(clojure.core/defn get-seconds
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.seconds this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Duration [^js/JSJoda.TemporalAmount arg0]
   (js-invoke java.time.Duration "from" arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^js/JSJoda.Duration [^java.lang.CharSequence arg0]
   (js-invoke java.time.Duration "parse" arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Duration"]))}
  (^int [^js/JSJoda.Duration this]
   (.hashCode this)))

(clojure.core/defn with-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.withSeconds this arg0)))

(clojure.core/defn of-minutes
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofMinutes" arg0)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Duration this ^js/JSJoda.Temporal arg0]
   (.subtractFrom this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]))}
  (^int [^js/JSJoda.Duration this ^js/JSJoda.Duration arg0]
   (.compareTo this arg0)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Duration this ^js/JSJoda.TemporalUnit arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Duration" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Duration this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn of-seconds
  {:arglists (quote (["long"] ["long" "long"]))}
  (^js/JSJoda.Duration [^long arg0]
   (js-invoke java.time.Duration "ofSeconds" arg0))
  (^js/JSJoda.Duration [^long arg0 ^long arg1]
   (js-invoke java.time.Duration "ofSeconds" arg0 arg1)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long arg0]
   (.minusDays this arg0)))

(clojure.core/defn to-days
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^js/JSJoda.Duration this]
   (.toDays this)))
