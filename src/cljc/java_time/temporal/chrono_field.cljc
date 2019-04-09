(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoField]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoField])))
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



(defn get-display-name ^java.lang.String ([^java.time.temporal.ChronoField G__47555 ^java.util.Locale G__47556] (jti/getter displayName ^java.time.temporal.ChronoField G__47555 ^java.util.Locale G__47556)))






(defn is-time-based ([^java.time.temporal.ChronoField G__47557] (.isTimeBased ^java.time.temporal.ChronoField G__47557)))


(defn range-refined-by ^java.time.temporal.ValueRange ([^java.time.temporal.ChronoField G__47558 ^java.time.temporal.TemporalAccessor G__47559] (.rangeRefinedBy ^java.time.temporal.ChronoField G__47558 ^java.time.temporal.TemporalAccessor G__47559)))






(defn is-date-based ([^java.time.temporal.ChronoField G__47560] (.isDateBased ^java.time.temporal.ChronoField G__47560)))









(defn is-supported-by ([^java.time.temporal.ChronoField G__47561 ^java.time.temporal.TemporalAccessor G__47562] (.isSupportedBy ^java.time.temporal.ChronoField G__47561 ^java.time.temporal.TemporalAccessor G__47562)))





(defn check-valid-int-value ([^java.time.temporal.ChronoField G__47563 G__47564] (.checkValidIntValue ^java.time.temporal.ChronoField G__47563 G__47564)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.temporal.ChronoField G__47565 ^java.time.temporal.Temporal G__47566 G__47567] (.adjustInto ^java.time.temporal.ChronoField G__47565 ^java.time.temporal.Temporal G__47566 G__47567)))


(defn to-string ^java.lang.String ([^java.time.temporal.ChronoField G__47568] (.toString ^java.time.temporal.ChronoField G__47568)))


(defn get-range-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__47569] (jti/getter rangeUnit ^java.time.temporal.ChronoField G__47569)))



(defn get-from ([^java.time.temporal.ChronoField G__47570 ^java.time.temporal.TemporalAccessor G__47571] (jti/getter from ^java.time.temporal.ChronoField G__47570 ^java.time.temporal.TemporalAccessor G__47571)))


(defn value-of ^java.time.temporal.ChronoField ([^java.lang.String G__47573] (. java.time.temporal.ChronoField valueOf ^java.lang.String G__47573)))




(defn check-valid-value ([^java.time.temporal.ChronoField G__47574 G__47575] (.checkValidValue ^java.time.temporal.ChronoField G__47574 G__47575)))



(defn values ^java.time.temporal.ChronoField ([] (. java.time.temporal.ChronoField values)))











(defn get-base-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__47577] (jti/getter baseUnit ^java.time.temporal.ChronoField G__47577)))

