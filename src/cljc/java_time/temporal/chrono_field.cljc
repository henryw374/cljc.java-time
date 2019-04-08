(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.temporal :refer [ChronoField]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoField])))



(defn get-display-name ^java.lang.String ([^java.time.temporal.ChronoField G__35429 ^java.util.Locale G__35430] (jti/getter displayName ^java.time.temporal.ChronoField G__35429 ^java.util.Locale G__35430)))






(defn is-time-based ([^java.time.temporal.ChronoField G__35431] (.isTimeBased ^java.time.temporal.ChronoField G__35431)))


(defn range-refined-by ^java.time.temporal.ValueRange ([^java.time.temporal.ChronoField G__35432 ^java.time.temporal.TemporalAccessor G__35433] (.rangeRefinedBy ^java.time.temporal.ChronoField G__35432 ^java.time.temporal.TemporalAccessor G__35433)))






(defn is-date-based ([^java.time.temporal.ChronoField G__35434] (.isDateBased ^java.time.temporal.ChronoField G__35434)))









(defn is-supported-by ([^java.time.temporal.ChronoField G__35435 ^java.time.temporal.TemporalAccessor G__35436] (.isSupportedBy ^java.time.temporal.ChronoField G__35435 ^java.time.temporal.TemporalAccessor G__35436)))





(defn check-valid-int-value ([^java.time.temporal.ChronoField G__35437 G__35438] (.checkValidIntValue ^java.time.temporal.ChronoField G__35437 G__35438)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.temporal.ChronoField G__35439 ^java.time.temporal.Temporal G__35440 G__35441] (.adjustInto ^java.time.temporal.ChronoField G__35439 ^java.time.temporal.Temporal G__35440 G__35441)))


(defn to-string ^java.lang.String ([^java.time.temporal.ChronoField G__35442] (.toString ^java.time.temporal.ChronoField G__35442)))


(defn get-range-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__35443] (jti/getter rangeUnit ^java.time.temporal.ChronoField G__35443)))



(defn get-from ([^java.time.temporal.ChronoField G__35444 ^java.time.temporal.TemporalAccessor G__35445] (jti/getter from ^java.time.temporal.ChronoField G__35444 ^java.time.temporal.TemporalAccessor G__35445)))


(defn value-of ^java.time.temporal.ChronoField ([^java.lang.String G__35447] (. java.time.temporal.ChronoField valueOf ^java.lang.String G__35447)))




(defn check-valid-value ([^java.time.temporal.ChronoField G__35448 G__35449] (.checkValidValue ^java.time.temporal.ChronoField G__35448 G__35449)))



(defn values ^java.time.temporal.ChronoField<> ([] (. java.time.temporal.ChronoField values)))











(defn get-base-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__35451] (jti/getter baseUnit ^java.time.temporal.ChronoField G__35451)))

