(ns cljc.java-time.temporal.temporal-field
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalField]]))

(clojure.core/defn get-range-unit
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.TemporalField this]
   (.rangeUnit this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalField this]
   (.range this)))

(clojure.core/defn resolve
  {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Map" "java.time.temporal.TemporalAccessor"
                      "java.time.format.ResolverStyle"]))}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.TemporalField this ^java.util.Map arg0 ^js/JSJoda.TemporalAccessor arg1 ^js/JSJoda.ResolverStyle arg2]
   (.resolve this arg0 arg1 arg2)))

(clojure.core/defn get-base-unit
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^js/JSJoda.TemporalUnit [^js/JSJoda.TemporalField this]
   (.baseUnit this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^java.lang.String [^js/JSJoda.TemporalField this]
   (.toString this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.TemporalField this]
   (.isDateBased this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.TemporalField this ^java.util.Locale arg0]
   (.displayName this arg0)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^boolean [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor arg0]
   (.isSupportedBy this arg0)))

(clojure.core/defn range-refined-by
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor arg0]
   (.rangeRefinedBy this arg0)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.Temporal" "long"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalField this ^js/JSJoda.Temporal arg0 ^long arg1]
   (.adjustInto this arg0 arg1)))

(clojure.core/defn get-from
  {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))}
  (^long [^js/JSJoda.TemporalField this ^js/JSJoda.TemporalAccessor arg0]
   (.from this arg0)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.TemporalField this]
   (.isTimeBased this)))
