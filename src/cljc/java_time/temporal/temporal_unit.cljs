(ns cljc.java-time.temporal.temporal-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalUnit]]))

(defn add-to
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"])}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(defn between
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"])}
  (^long
   [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal-1-inclusive ^js/JSJoda.Temporal temporal-2-exclusive]
   (.between this temporal-1-inclusive temporal-2-exclusive)))

(defn get-duration
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Duration [^js/JSJoda.TemporalUnit this]
   (.duration this)))

(defn is-date-based
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isDateBased this)))

(defn is-duration-estimated
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isDurationEstimated this)))

(defn is-supported-by
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"])}
  (^boolean [^js/JSJoda.TemporalUnit this ^js/JSJoda.Temporal temporal]
   (.isSupportedBy this temporal)))

(defn is-time-based
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.TemporalUnit this]
   (.isTimeBased this)))

(defn to-string
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.lang.String [^js/JSJoda.TemporalUnit this]
   (.toString this)))
