(ns cljc.java-time.temporal.temporal-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalField]]))

(defn get-range-unit
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.TemporalField this]
   (.rangeUnit this)))

(defn range
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalField this]
   (.range this)))

(defn resolve
  {:arglists '(["java.time.temporal.TemporalField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                "java.time.format.ResolverStyle"])}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.TemporalField this ^java.util.Map field-values ^js/JSJoda.TemporalAccessor partial-temporal
    ^js/JSJoda.ResolverStyle resolver-style]
   (.resolve this field-values partial-temporal resolver-style)))

(defn get-base-unit
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.TemporalField this]
   (.baseUnit this)))

(defn to-string
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^java.lang.String [^js/JSJoda.TemporalField this]
   (.toString this)))

(defn is-date-based
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.TemporalField this]
   (.isDateBased this)))

(defn get-display-name
  {:arglists '(["java.time.temporal.TemporalField" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.TemporalField this ^java.util.Locale locale]
   (.displayName this locale)))

(defn is-supported-by
  {:arglists '(["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"])}
  (^boolean [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor temporal]
   (.isSupportedBy this temporal)))

(defn range-refined-by
  {:arglists '(["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor temporal]
   (.rangeRefinedBy this temporal)))

(defn adjust-into
  {:arglists '(["java.time.temporal.TemporalField" "java.time.temporal.Temporal" "long"])}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalField this ^js/JSJoda.Temporal temporal ^long new-value]
   (.adjustInto this temporal new-value)))

(defn get-from
  {:arglists '(["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"])}
  (^long [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor temporal]
   (.from this temporal)))

(defn is-time-based
  {:arglists '(["java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.TemporalField this]
   (.isTimeBased this)))
