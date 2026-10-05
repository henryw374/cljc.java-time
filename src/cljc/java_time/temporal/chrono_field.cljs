(ns cljc.java-time.temporal.chrono-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [ChronoField]]))

(def milli-of-second (goog.object/get java.time.temporal.ChronoField "MILLI_OF_SECOND"))

(def year-of-era (goog.object/get java.time.temporal.ChronoField "YEAR_OF_ERA"))

(def clock-hour-of-day (goog.object/get java.time.temporal.ChronoField "CLOCK_HOUR_OF_DAY"))

(def era (goog.object/get java.time.temporal.ChronoField "ERA"))

(def instant-seconds (goog.object/get java.time.temporal.ChronoField "INSTANT_SECONDS"))

(def ampm-of-day (goog.object/get java.time.temporal.ChronoField "AMPM_OF_DAY"))

(def offset-seconds (goog.object/get java.time.temporal.ChronoField "OFFSET_SECONDS"))

(def nano-of-second (goog.object/get java.time.temporal.ChronoField "NANO_OF_SECOND"))

(def nano-of-day (goog.object/get java.time.temporal.ChronoField "NANO_OF_DAY"))

(def aligned-day-of-week-in-month (goog.object/get java.time.temporal.ChronoField "ALIGNED_DAY_OF_WEEK_IN_MONTH"))

(def month-of-year (goog.object/get java.time.temporal.ChronoField "MONTH_OF_YEAR"))

(def hour-of-ampm (goog.object/get java.time.temporal.ChronoField "HOUR_OF_AMPM"))

(def year (goog.object/get java.time.temporal.ChronoField "YEAR"))

(def micro-of-second (goog.object/get java.time.temporal.ChronoField "MICRO_OF_SECOND"))

(def aligned-week-of-year (goog.object/get java.time.temporal.ChronoField "ALIGNED_WEEK_OF_YEAR"))

(def proleptic-month (goog.object/get java.time.temporal.ChronoField "PROLEPTIC_MONTH"))

(def day-of-month (goog.object/get java.time.temporal.ChronoField "DAY_OF_MONTH"))

(def second-of-minute (goog.object/get java.time.temporal.ChronoField "SECOND_OF_MINUTE"))

(def second-of-day (goog.object/get java.time.temporal.ChronoField "SECOND_OF_DAY"))

(def epoch-day (goog.object/get java.time.temporal.ChronoField "EPOCH_DAY"))

(def day-of-year (goog.object/get java.time.temporal.ChronoField "DAY_OF_YEAR"))

(def aligned-week-of-month (goog.object/get java.time.temporal.ChronoField "ALIGNED_WEEK_OF_MONTH"))

(def day-of-week (goog.object/get java.time.temporal.ChronoField "DAY_OF_WEEK"))

(def clock-hour-of-ampm (goog.object/get java.time.temporal.ChronoField "CLOCK_HOUR_OF_AMPM"))

(def minute-of-day (goog.object/get java.time.temporal.ChronoField "MINUTE_OF_DAY"))

(def aligned-day-of-week-in-year (goog.object/get java.time.temporal.ChronoField "ALIGNED_DAY_OF_WEEK_IN_YEAR"))

(def minute-of-hour (goog.object/get java.time.temporal.ChronoField "MINUTE_OF_HOUR"))

(def hour-of-day (goog.object/get java.time.temporal.ChronoField "HOUR_OF_DAY"))

(def milli-of-day (goog.object/get java.time.temporal.ChronoField "MILLI_OF_DAY"))

(def micro-of-day (goog.object/get java.time.temporal.ChronoField "MICRO_OF_DAY"))

(clojure.core/defn get-range-unit
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.ChronoField this]
   (.rangeUnit this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.ChronoField this]
   (.range this)))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.temporal.ChronoField "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.ChronoField [^java.lang.String arg0]
   (js-invoke java.time.temporal.ChronoField "valueOf" arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (js-invoke java.time.temporal.ChronoField "valueOf" arg0 arg1)))

(clojure.core/defn resolve
  {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                      "java.time.format.ResolverStyle"]))}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.ChronoField this ^java.util.Map arg0 ^js/JSJoda.TemporalAccessor arg1 ^js/JSJoda.ResolverStyle arg2]
   (.resolve this arg0 arg1 arg2)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^int [^js/JSJoda.ChronoField this]
   (.ordinal this)))

(clojure.core/defn check-valid-int-value
  {:arglists (quote (["java.time.temporal.ChronoField" "long"]))}
  (^int [^js/JSJoda.ChronoField this ^long arg0]
   (.checkValidIntValue this arg0)))

(clojure.core/defn get-base-unit
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.ChronoField this]
   (.baseUnit this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^java.lang.String [^js/JSJoda.ChronoField this]
   (.toString this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^boolean [^js/JSJoda.ChronoField this]
   (.isDateBased this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.ChronoField this ^java.util.Locale arg0]
   (.displayName this arg0)))

(clojure.core/defn name
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^java.lang.String [^js/JSJoda.ChronoField this]
   (.name this)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))}
  (^boolean [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor arg0]
   (.isSupportedBy this arg0)))

(clojure.core/defn range-refined-by
  {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor arg0]
   (.rangeRefinedBy this arg0)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^java.lang.Class [^js/JSJoda.ChronoField this]
   (.declaringClass this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^int [^js/JSJoda.ChronoField this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.Temporal" "long"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.ChronoField this ^js/JSJoda.Temporal arg0 ^long arg1]
   (.adjustInto this arg0 arg1)))

(clojure.core/defn get-from
  {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))}
  (^long [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor arg0]
   (.from this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Enum"]))}
  (^int [^js/JSJoda.ChronoField this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ChronoField this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.ChronoField"]))}
  (^boolean [^js/JSJoda.ChronoField this]
   (.isTimeBased this)))

(clojure.core/defn check-valid-value
  {:arglists (quote (["java.time.temporal.ChronoField" "long"]))}
  (^long [^js/JSJoda.ChronoField this ^long arg0]
   (.checkValidValue this arg0)))
