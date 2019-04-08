(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.temporal :refer [ChronoField]])) #? (:clj (:import [java.time.temporal ChronoField])))



(defn get-display-name ^java.lang.String ([^java.time.temporal.ChronoField G__27185 ^java.util.Locale G__27186] (jti/getter displayName ^java.time.temporal.ChronoField G__27185 ^java.util.Locale G__27186)))






(defn is-time-based ([^java.time.temporal.ChronoField G__27187] (.isTimeBased ^java.time.temporal.ChronoField G__27187)))


(defn range-refined-by ^java.time.temporal.ValueRange ([^java.time.temporal.ChronoField G__27188 ^java.time.temporal.TemporalAccessor G__27189] (.rangeRefinedBy ^java.time.temporal.ChronoField G__27188 ^java.time.temporal.TemporalAccessor G__27189)))






(defn is-date-based ([^java.time.temporal.ChronoField G__27190] (.isDateBased ^java.time.temporal.ChronoField G__27190)))









(defn is-supported-by ([^java.time.temporal.ChronoField G__27191 ^java.time.temporal.TemporalAccessor G__27192] (.isSupportedBy ^java.time.temporal.ChronoField G__27191 ^java.time.temporal.TemporalAccessor G__27192)))





(defn check-valid-int-value ([^java.time.temporal.ChronoField G__27193 G__27194] (.checkValidIntValue ^java.time.temporal.ChronoField G__27193 G__27194)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.temporal.ChronoField G__27195 ^java.time.temporal.Temporal G__27196 G__27197] (.adjustInto ^java.time.temporal.ChronoField G__27195 ^java.time.temporal.Temporal G__27196 G__27197)))


(defn to-string ^java.lang.String ([^java.time.temporal.ChronoField G__27198] (.toString ^java.time.temporal.ChronoField G__27198)))


(defn get-range-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__27199] (jti/getter rangeUnit ^java.time.temporal.ChronoField G__27199)))



(defn get-from ([^java.time.temporal.ChronoField G__27200 ^java.time.temporal.TemporalAccessor G__27201] (jti/getter from ^java.time.temporal.ChronoField G__27200 ^java.time.temporal.TemporalAccessor G__27201)))


(defn value-of ^java.time.temporal.ChronoField ([^java.lang.String G__27203] (. java.time.temporal.ChronoField valueOf ^java.lang.String G__27203)))




(defn check-valid-value ([^java.time.temporal.ChronoField G__27204 G__27205] (.checkValidValue ^java.time.temporal.ChronoField G__27204 G__27205)))



(defn values ^java.time.temporal.ChronoField<> ([] (. java.time.temporal.ChronoField values)))











(defn get-base-unit ^java.time.temporal.TemporalUnit ([^java.time.temporal.ChronoField G__27207] (jti/getter baseUnit ^java.time.temporal.ChronoField G__27207)))

