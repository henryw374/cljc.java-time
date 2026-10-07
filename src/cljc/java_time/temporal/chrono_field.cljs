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

(defn get-range-unit
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.ChronoField this]
   (.rangeUnit this)))

(defn range
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.ChronoField this]
   (.range this)))

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (js-invoke java.time.temporal.ChronoField "values")))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^js/JSJoda.ChronoField [^java.lang.String name]
   (js-invoke java.time.temporal.ChronoField "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.temporal.ChronoField "valueOf" enum-type name)))

(defn resolve
  {:arglists '(["java.time.temporal.ChronoField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                "java.time.format.ResolverStyle"])}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.ChronoField this ^java.util.Map field-values ^js/JSJoda.TemporalAccessor partial-temporal
    ^js/JSJoda.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(defn ordinal
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^int [^js/JSJoda.ChronoField this]
   (.ordinal this)))

(defn check-valid-int-value
  {:arglists '(["java.time.temporal.ChronoField" "long"])}
  (^int [^js/JSJoda.ChronoField this ^long value]
   (.checkValidIntValue this value)))

(defn get-base-unit
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.ChronoField this]
   (.baseUnit this)))

(defn to-string
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.String [^js/JSJoda.ChronoField this]
   (.toString this)))

(defn is-date-based
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^boolean [^js/JSJoda.ChronoField this]
   (.isDateBased this)))

(defn get-display-name
  {:arglists '(["java.time.temporal.ChronoField" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.ChronoField this ^java.util.Locale locale]
   (.displayName this locale)))

(defn name
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.String [^js/JSJoda.ChronoField this]
   (.name this)))

(defn is-supported-by
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^boolean [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(defn range-refined-by
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(defn get-declaring-class
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Class [^js/JSJoda.ChronoField this]
   (.declaringClass this)))

(defn hash-code
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^int [^js/JSJoda.ChronoField this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.Temporal" "long"])}
  (^js/JSJoda.Temporal [^js/JSJoda.ChronoField this ^js/JSJoda.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(defn get-from
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^long [^js/JSJoda.ChronoField this ^js/JSJoda.TemporalAccessor temporal]
   (.from this temporal)))

(defn compare-to
  {:arglists '(["java.time.temporal.ChronoField" "java.lang.Enum"])}
  (^int [^js/JSJoda.ChronoField this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  {:arglists '(["java.time.temporal.ChronoField" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ChronoField this ^java.lang.Object other]
   (.equals this other)))

(defn is-time-based
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^boolean [^js/JSJoda.ChronoField this]
   (.isTimeBased this)))

(defn check-valid-value
  {:arglists '(["java.time.temporal.ChronoField" "long"])}
  (^long [^js/JSJoda.ChronoField this ^long value]
   (.checkValidValue this value)))
