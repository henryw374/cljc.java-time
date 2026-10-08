(ns cljc.java-time.temporal.chrono-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal ChronoField)))

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

(defn get-range-unit
  (^java.time.temporal.ChronoUnit [^java.time.temporal.ChronoField this]
   (.getRangeUnit this)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this]
   (.range this)))

(defn values
  (^"java.lang.Class" []
   (java.time.temporal.ChronoField/values)))

(defn value-of
  (^java.time.temporal.ChronoField [^java.lang.String name]
   (java.time.temporal.ChronoField/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.temporal.ChronoField/valueOf enum-type name)))

(defn resolve
  (^java.time.temporal.TemporalAccessor
   [^java.time.temporal.ChronoField this ^java.util.Map field-values
    ^java.time.temporal.TemporalAccessor partial-temporal ^java.time.format.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(defn ordinal
  (^java.lang.Integer [^java.time.temporal.ChronoField this]
   (.ordinal this)))

(defn check-valid-int-value
  (^java.lang.Integer [^java.time.temporal.ChronoField this ^long value]
   (.checkValidIntValue this value)))

(defn get-base-unit
  (^java.time.temporal.ChronoUnit [^java.time.temporal.ChronoField this]
   (.getBaseUnit this)))

(defn to-string
  (^java.lang.String [^java.time.temporal.ChronoField this]
   (.toString this)))

(defn is-date-based
  (^java.lang.Boolean [^java.time.temporal.ChronoField this]
   (.isDateBased this)))

(defn get-display-name
  (^java.lang.String [^java.time.temporal.ChronoField this ^java.util.Locale locale]
   (.getDisplayName this locale)))

(defn name
  (^java.lang.String [^java.time.temporal.ChronoField this]
   (.name this)))

(defn is-supported-by
  (^java.lang.Boolean [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(defn range-refined-by
  (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(defn get-declaring-class
  (^java.lang.Class [^java.time.temporal.ChronoField this]
   (.getDeclaringClass this)))

(defn hash-code
  (^java.lang.Integer [^java.time.temporal.ChronoField this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal
   [^java.time.temporal.ChronoField this ^java.time.temporal.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(defn get-from
  (^long [^java.time.temporal.ChronoField this ^java.time.temporal.TemporalAccessor temporal]
   (.getFrom this temporal)))

(defn compare-to
  (^java.lang.Integer [^java.time.temporal.ChronoField this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  (^java.lang.Boolean [^java.time.temporal.ChronoField this ^java.lang.Object other]
   (.equals this other)))

(defn is-time-based
  (^java.lang.Boolean [^java.time.temporal.ChronoField this]
   (.isTimeBased this)))

(defn check-valid-value
  (^long [^java.time.temporal.ChronoField this ^long value]
   (.checkValidValue this value)))
