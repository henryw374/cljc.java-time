(ns cljc.java-time.temporal.temporal-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalField)))

(defn get-range-unit
  (^java.time.temporal.ChronoUnit [^java.time.temporal.TemporalField this]
   (.getRangeUnit this)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this]
   (.range this)))

(defn resolve
  (^java.time.temporal.TemporalAccessor
   [^java.time.temporal.TemporalField this ^java.util.Map field-values
    ^java.time.temporal.TemporalAccessor partial-temporal ^java.time.format.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(defn get-base-unit
  (^java.time.temporal.ChronoUnit [^java.time.temporal.TemporalField this]
   (.getBaseUnit this)))

(defn to-string
  (^java.lang.String [^java.time.temporal.TemporalField this]
   (.toString this)))

(defn is-date-based
  (^java.lang.Boolean [^java.time.temporal.TemporalField this]
   (.isDateBased this)))

(defn get-display-name
  (^java.lang.String [^java.time.temporal.TemporalField this ^java.util.Locale locale]
   (.getDisplayName this locale)))

(defn is-supported-by
  (^java.lang.Boolean [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(defn range-refined-by
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(defn adjust-into
  (^java.time.temporal.Temporal
   [^java.time.temporal.TemporalField this ^java.time.temporal.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(defn get-from
  (^long [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.getFrom this temporal)))

(defn is-time-based
  (^java.lang.Boolean [^java.time.temporal.TemporalField this]
   (.isTimeBased this)))
