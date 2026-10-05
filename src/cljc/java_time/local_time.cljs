(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalTime]]))

(def max (goog.object/get java.time.LocalTime "MAX"))

(def noon (goog.object/get java.time.LocalTime "NOON"))

(def midnight (goog.object/get java.time.LocalTime "MIDNIGHT"))

(def min (goog.object/get java.time.LocalTime "MIN"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.hour this)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.LocalTime this ^js/JSJoda.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["int" "int" "int"] ["int" "int" "int" "int"]))}
  (^js/JSJoda.LocalTime [^int arg0 ^int arg1]
   (js-invoke java.time.LocalTime "of" arg0 arg1))
  (^js/JSJoda.LocalTime [^int arg0 ^int arg1 ^int arg2]
   (js-invoke java.time.LocalTime "of" arg0 arg1 arg2))
  (^js/JSJoda.LocalTime [^int arg0 ^int arg1 ^int arg2 ^int arg3]
   (js-invoke java.time.LocalTime "of" arg0 arg1 arg2 arg3)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.nano this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn at-date
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalTime this ^js/JSJoda.LocalDate arg0]
   (.atDate this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.String [^js/JSJoda.LocalTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn to-second-of-day
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.toSecondOfDay this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int arg0]
   (.withNano this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn of-nano-of-day
  {:arglists (quote (["long"]))}
  (^js/JSJoda.LocalTime [^long arg0]
   (js-invoke java.time.LocalTime "ofNanoOfDay" arg0)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.LocalTime "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]
                     ["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalTime this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.LocalTime [^java.lang.CharSequence arg0]
   (js-invoke java.time.LocalTime "parse" arg0))
  (^js/JSJoda.LocalTime [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.LocalTime "parse" arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int arg0]
   (.withSecond this arg0)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.LocalTime []
   (js-invoke java.time.LocalTime "now"))
  (^js/JSJoda.LocalTime [arg0]
   (js-invoke java.time.LocalTime "now" arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn to-nano-of-day
  {:arglists (quote (["java.time.LocalTime"]))}
  (^long [^js/JSJoda.LocalTime this]
   (.toNanoOfDay this)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn of-second-of-day
  {:arglists (quote (["long"]))}
  (^js/JSJoda.LocalTime [^long arg0]
   (js-invoke java.time.LocalTime "ofSecondOfDay" arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.LocalTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.LocalTime this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))
