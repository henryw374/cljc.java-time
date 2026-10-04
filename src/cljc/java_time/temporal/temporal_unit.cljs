(ns cljc.java-time.temporal.temporal-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalUnit]]))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^long [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal1-inclusive ^js/JSJoda.Temporal temporal2-exclusive]
   (.between this temporal1-inclusive temporal2-exclusive)))

(clojure.core/defn get-duration
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Duration [^js/JSJoda.TemporalUnit this]
   (.duration this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isDateBased this)))

(clojure.core/defn is-duration-estimated
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isDurationEstimated this)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"]))}
  (^boolean [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal]
   (.isSupportedBy this temporal)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isTimeBased this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.lang.String [^js/JSJoda.TemporalUnit this]
   (.toString this)))
