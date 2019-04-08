(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoField]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoField])))



(defn get-display-name ^java.lang.String ([^java.time.temporal.ChronoField G__36919 ^java.util.Locale G__36920] (jti/getter displayName ^java.time.temporal.ChronoField G__36919 ^java.util.Locale G__36920)))






(defn is-time-based ([^java.time.temporal.ChronoField G__36921] (.isTimeBased ^java.time.temporal.ChronoField G__36921)))


(defn range-refined-by ^java.time.temporal.ValueRange ([^java.time.temporal.ChronoField G__36922 ^java.time.temporal.TemporalAccessor G__36923] (.rangeRefinedBy ^java.time.temporal.ChronoField G__36922 ^java.time.temporal.TemporalAccessor G__36923)))






(defn is-date-based ([^java.time.temporal.ChronoField G__36924] (.isDateBased ^java.time.temporal.ChronoField G__36924)))









(defn is-supported-by ([^java.time.temporal.ChronoField G__36925 ^java.time.temporal.TemporalAccessor G__36926] (.isSupportedBy ^java.time.temporal.ChronoField G__36925 ^java.time.temporal.TemporalAccessor G__36926)))





(defn check-valid-int-value ([^java.time.temporal.ChronoField G__36927 G__36928] (.checkValidIntValue ^java.time.temporal.ChronoField G__36927 G__36928)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.temporal.ChronoField G__36929 ^java.time.temporal.Temporal G__36930 G__36931] (.adjustInto ^java.time.temporal.ChronoField G__36929 ^java.time.temporal.Temporal G__36930 G__36931)))


(defn to-string ^java.lang.String ([^java.time.temporal.ChronoField G__36932] (.toString ^java.time.temporal.ChronoField G__36932)))


(defn get-range-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__36933] (jti/getter rangeUnit ^java.time.temporal.ChronoField G__36933)))



(defn get-from ([^java.time.temporal.ChronoField G__36934 ^java.time.temporal.TemporalAccessor G__36935] (jti/getter from ^java.time.temporal.ChronoField G__36934 ^java.time.temporal.TemporalAccessor G__36935)))


(defn value-of ^java.time.temporal.ChronoField ([^java.lang.String G__36937] (. java.time.temporal.ChronoField valueOf ^java.lang.String G__36937)))




(defn check-valid-value ([^java.time.temporal.ChronoField G__36938 G__36939] (.checkValidValue ^java.time.temporal.ChronoField G__36938 G__36939)))



(defn values ^java.time.temporal.ChronoField<> ([] (. java.time.temporal.ChronoField values)))











(defn get-base-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__36941] (jti/getter baseUnit ^java.time.temporal.ChronoField G__36941)))

