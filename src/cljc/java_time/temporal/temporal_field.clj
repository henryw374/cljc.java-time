(ns cljc.java-time.temporal.temporal-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalField]))

(clojure.core/defn get-range-unit
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ChronoUnit [^java.time.temporal.TemporalField this]
   (.getRangeUnit this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this]
   (.range this)))

(clojure.core/defn resolve
  {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                      "java.time.format.ResolverStyle"]))}
  (^java.time.temporal.TemporalAccessor
   [^java.time.temporal.TemporalField this ^java.util.Map field-values
    ^java.time.temporal.TemporalAccessor partial-temporal ^java.time.format.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(clojure.core/defn get-base-unit
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ChronoUnit [^java.time.temporal.TemporalField this]
   (.getBaseUnit this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.lang.String [^java.time.temporal.TemporalField this]
   (.toString this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.temporal.TemporalField this]
   (.isDateBased this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Locale"]))}
  (^java.lang.String [^java.time.temporal.TemporalField this ^java.util.Locale locale]
   (.getDisplayName this locale)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^java.lang.Boolean [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(clojure.core/defn range-refined-by
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.Temporal" "long"]))}
  (^java.time.temporal.Temporal
   [^java.time.temporal.TemporalField this ^java.time.temporal.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(clojure.core/defn get-from
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^long [^java.time.temporal.TemporalField this ^java.time.temporal.TemporalAccessor temporal]
   (.getFrom this temporal)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.temporal.TemporalField this]
   (.isTimeBased this)))
