(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoField]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time.temporal ChronoField])))
(def milli-of-second (. java.time.temporal.ChronoField -MILLI_OF_SECOND))
(def year-of-era (. java.time.temporal.ChronoField -YEAR_OF_ERA))
(def clock-hour-of-day (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_DAY))
(def era (. java.time.temporal.ChronoField -ERA))
(def instant-seconds (. java.time.temporal.ChronoField -INSTANT_SECONDS))
(def ampm-of-day (. java.time.temporal.ChronoField -AMPM_OF_DAY))
(def offset-seconds (. java.time.temporal.ChronoField -OFFSET_SECONDS))
(def nano-of-second (. java.time.temporal.ChronoField -NANO_OF_SECOND))
(def nano-of-day (. java.time.temporal.ChronoField -NANO_OF_DAY))
(def aligned-day-of-week-in-month (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_MONTH))
(def month-of-year (. java.time.temporal.ChronoField -MONTH_OF_YEAR))
(def hour-of-ampm (. java.time.temporal.ChronoField -HOUR_OF_AMPM))
(def year (. java.time.temporal.ChronoField -YEAR))
(def micro-of-second (. java.time.temporal.ChronoField -MICRO_OF_SECOND))
(def aligned-week-of-year (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_YEAR))
(def proleptic-month (. java.time.temporal.ChronoField -PROLEPTIC_MONTH))
(def day-of-month (. java.time.temporal.ChronoField -DAY_OF_MONTH))
(def second-of-minute (. java.time.temporal.ChronoField -SECOND_OF_MINUTE))
(def second-of-day (. java.time.temporal.ChronoField -SECOND_OF_DAY))
(def epoch-day (. java.time.temporal.ChronoField -EPOCH_DAY))
(def day-of-year (. java.time.temporal.ChronoField -DAY_OF_YEAR))
(def aligned-week-of-month (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_MONTH))
(def day-of-week (. java.time.temporal.ChronoField -DAY_OF_WEEK))
(def clock-hour-of-ampm (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_AMPM))
(def minute-of-day (. java.time.temporal.ChronoField -MINUTE_OF_DAY))
(def aligned-day-of-week-in-year (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_YEAR))
(def minute-of-hour (. java.time.temporal.ChronoField -MINUTE_OF_HOUR))
(def hour-of-day (. java.time.temporal.ChronoField -HOUR_OF_DAY))
(def milli-of-day (. java.time.temporal.ChronoField -MILLI_OF_DAY))
(def micro-of-day (. java.time.temporal.ChronoField -MICRO_OF_DAY))



(defn get-display-name ^java.lang.String ([^java.time.temporal.ChronoField G__56689 ^java.util.Locale G__56690] (jti/getter displayName ^java.time.temporal.ChronoField G__56689 ^java.util.Locale G__56690)))






(defn is-time-based ([^java.time.temporal.ChronoField G__56691] (.isTimeBased ^java.time.temporal.ChronoField G__56691)))


(defn range-refined-by ^java.time.temporal.ValueRange ([^java.time.temporal.ChronoField G__56692 ^java.time.temporal.TemporalAccessor G__56693] (.rangeRefinedBy ^java.time.temporal.ChronoField G__56692 ^java.time.temporal.TemporalAccessor G__56693)))






(defn is-date-based ([^java.time.temporal.ChronoField G__56694] (.isDateBased ^java.time.temporal.ChronoField G__56694)))









(defn is-supported-by ([^java.time.temporal.ChronoField G__56695 ^java.time.temporal.TemporalAccessor G__56696] (.isSupportedBy ^java.time.temporal.ChronoField G__56695 ^java.time.temporal.TemporalAccessor G__56696)))





(defn check-valid-int-value ([^java.time.temporal.ChronoField G__56697 G__56698] (.checkValidIntValue ^java.time.temporal.ChronoField G__56697 G__56698)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.temporal.ChronoField G__56699 ^java.time.temporal.Temporal G__56700 G__56701] (.adjustInto ^java.time.temporal.ChronoField G__56699 ^java.time.temporal.Temporal G__56700 G__56701)))


(defn to-string ^java.lang.String ([^java.time.temporal.ChronoField G__56702] (.toString ^java.time.temporal.ChronoField G__56702)))


(defn get-range-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__56703] (jti/getter rangeUnit ^java.time.temporal.ChronoField G__56703)))



(defn get-from ([^java.time.temporal.ChronoField G__56704 ^java.time.temporal.TemporalAccessor G__56705] (jti/getter from ^java.time.temporal.ChronoField G__56704 ^java.time.temporal.TemporalAccessor G__56705)))


(defn value-of ^java.time.temporal.ChronoField ([^java.lang.String G__56707] (. java.time.temporal.ChronoField valueOf ^java.lang.String G__56707)))




(defn check-valid-value ([^java.time.temporal.ChronoField G__56708 G__56709] (.checkValidValue ^java.time.temporal.ChronoField G__56708 G__56709)))



(defn values ^java.time.temporal.ChronoField ([] (. java.time.temporal.ChronoField values)))











(defn get-base-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__56711] (jti/getter baseUnit ^java.time.temporal.ChronoField G__56711)))

