(ns cljc.java-time.offset-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [OffsetTime]]))

(def min (goog.object/get java.time.OffsetTime "MIN"))

(def max (goog.object/get java.time.OffsetTime "MAX"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this]
   (.hour this)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.LocalTime arg0 ^js/JSJoda.ZoneOffset arg1]
   (js-invoke java.time.OffsetTime "of" arg0 arg1))
  (^js/JSJoda.OffsetTime [^int arg0 ^int arg1 ^int arg2 ^int arg3 ^js/JSJoda.ZoneOffset arg4]
   (js-invoke java.time.OffsetTime "of" arg0 arg1 arg2 arg3 arg4)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this]
   (.nano this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.OffsetTime" "int"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.OffsetTime" "int"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn at-date
  {:arglists (quote (["java.time.OffsetTime" "java.time.LocalDate"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetTime this ^js/JSJoda.LocalDate arg0]
   (.atDate this arg0)))

(clojure.core/defn with-offset-same-instant
  {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.ZoneOffset arg0]
   (.withOffsetSameInstant this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^java.lang.String [^js/JSJoda.OffsetTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.OffsetTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-offset
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.OffsetTime this]
   (.offset this)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.OffsetTime" "int"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int arg0]
   (.withNano this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.OffsetTime this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn with-offset-same-local
  {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.ZoneOffset arg0]
   (.withOffsetSameLocal this arg0)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.OffsetTime "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]
                     ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.OffsetTime this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.OffsetTime [^java.lang.CharSequence arg0]
   (js-invoke java.time.OffsetTime "parse" arg0))
  (^js/JSJoda.OffsetTime [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.OffsetTime "parse" arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.OffsetTime" "int"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int arg0]
   (.withSecond this arg0)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.OffsetTime this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.OffsetTime []
   (js-invoke java.time.OffsetTime "now"))
  (^js/JSJoda.OffsetTime [arg0]
   (js-invoke java.time.OffsetTime "now" arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))}
  (^int [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.Instant arg0 ^js/JSJoda.ZoneId arg1]
   (js-invoke java.time.OffsetTime "ofInstant" arg0 arg1)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.OffsetTime" "long"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.OffsetTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.OffsetTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.OffsetTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.OffsetTime this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))
