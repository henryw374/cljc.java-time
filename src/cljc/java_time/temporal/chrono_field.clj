(ns cljc.java-time.temporal.chrono-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal ChronoField]))

(def milli-of-second java.time.temporal.ChronoField/MILLI_OF_SECOND)

(def year-of-era java.time.temporal.ChronoField/YEAR_OF_ERA)

(def clock-hour-of-day java.time.temporal.ChronoField/CLOCK_HOUR_OF_DAY)

(def era java.time.temporal.ChronoField/ERA)

(def instant-seconds java.time.temporal.ChronoField/INSTANT_SECONDS)

(def ampm-of-day java.time.temporal.ChronoField/AMPM_OF_DAY)

(def offset-seconds java.time.temporal.ChronoField/OFFSET_SECONDS)

(def nano-of-second java.time.temporal.ChronoField/NANO_OF_SECOND)

(def nano-of-day java.time.temporal.ChronoField/NANO_OF_DAY)

(def aligned-day-of-week-in-month java.time.temporal.ChronoField/ALIGNED_DAY_OF_WEEK_IN_MONTH)

(def month-of-year java.time.temporal.ChronoField/MONTH_OF_YEAR)

(def hour-of-ampm java.time.temporal.ChronoField/HOUR_OF_AMPM)

(def year java.time.temporal.ChronoField/YEAR)

(def micro-of-second java.time.temporal.ChronoField/MICRO_OF_SECOND)

(def aligned-week-of-year java.time.temporal.ChronoField/ALIGNED_WEEK_OF_YEAR)

(def proleptic-month java.time.temporal.ChronoField/PROLEPTIC_MONTH)

(def day-of-month java.time.temporal.ChronoField/DAY_OF_MONTH)

(def second-of-minute java.time.temporal.ChronoField/SECOND_OF_MINUTE)

(def second-of-day java.time.temporal.ChronoField/SECOND_OF_DAY)

(def epoch-day java.time.temporal.ChronoField/EPOCH_DAY)

(def day-of-year java.time.temporal.ChronoField/DAY_OF_YEAR)

(def aligned-week-of-month java.time.temporal.ChronoField/ALIGNED_WEEK_OF_MONTH)

(def day-of-week java.time.temporal.ChronoField/DAY_OF_WEEK)

(def clock-hour-of-ampm java.time.temporal.ChronoField/CLOCK_HOUR_OF_AMPM)

(def minute-of-day java.time.temporal.ChronoField/MINUTE_OF_DAY)

(def aligned-day-of-week-in-year java.time.temporal.ChronoField/ALIGNED_DAY_OF_WEEK_IN_YEAR)

(def minute-of-hour java.time.temporal.ChronoField/MINUTE_OF_HOUR)

(def hour-of-day java.time.temporal.ChronoField/HOUR_OF_DAY)

(def milli-of-day java.time.temporal.ChronoField/MILLI_OF_DAY)

(def micro-of-day java.time.temporal.ChronoField/MICRO_OF_DAY)

(clojure.core/defn get-range-unit
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.time.temporal.ChronoUnit [^java.time.temporal.ChronoField this]
   (.getRangeUnit this)))

(clojure.core/defn range
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this]
   (.range this)))

(clojure.core/defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.temporal.ChronoField/values)))

(clojure.core/defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.temporal.ChronoField [^java.lang.String name]
   (java.time.temporal.ChronoField/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.temporal.ChronoField/valueOf enum-type name)))

(clojure.core/defn resolve
  {:arglists '(["java.time.temporal.ChronoField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                "java.time.format.ResolverStyle"])}
  (^java.time.temporal.TemporalAccessor
   [^java.time.temporal.ChronoField this ^java.util.Map field-values
    ^java.time.temporal.TemporalAccessor partial-temporal ^java.time.format.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(clojure.core/defn ordinal
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Integer [^java.time.temporal.ChronoField this]
   (.ordinal this)))

(clojure.core/defn check-valid-int-value
  {:arglists '(["java.time.temporal.ChronoField" "long"])}
  (^java.lang.Integer [^java.time.temporal.ChronoField this ^long value]
   (.checkValidIntValue this value)))

(clojure.core/defn get-base-unit
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.time.temporal.ChronoUnit [^java.time.temporal.ChronoField this]
   (.getBaseUnit this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.String [^java.time.temporal.ChronoField this]
   (.toString this)))

(clojure.core/defn is-date-based
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoField this]
   (.isDateBased this)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.temporal.ChronoField" "java.util.Locale"])}
  (^java.lang.String [^java.time.temporal.ChronoField this ^java.util.Locale locale]
   (.getDisplayName this locale)))

(clojure.core/defn name
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.String [^java.time.temporal.ChronoField this]
   (.name this)))

(clojure.core/defn is-supported-by
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(clojure.core/defn range-refined-by
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(clojure.core/defn get-declaring-class
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Class [^java.time.temporal.ChronoField this]
   (.getDeclaringClass this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Integer [^java.time.temporal.ChronoField this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.Temporal" "long"])}
  (^java.time.temporal.Temporal
   [^java.time.temporal.ChronoField this ^java.time.temporal.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(clojure.core/defn get-from
  {:arglists '(["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"])}
  (^long [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.getFrom this temporal)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.temporal.ChronoField" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.temporal.ChronoField this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn equals
  {:arglists '(["java.time.temporal.ChronoField" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoField this ^java.lang.Object other]
   (.equals this other)))

(clojure.core/defn is-time-based
  {:arglists '(["java.time.temporal.ChronoField"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoField this]
   (.isTimeBased this)))

(clojure.core/defn check-valid-value
  {:arglists '(["java.time.temporal.ChronoField" "long"])}
  (^long [^java.time.temporal.ChronoField this ^long value]
   (.checkValidValue this value)))
