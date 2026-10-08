(ns cljc.java-time.temporal.temporal-amount
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAmount]]))

(defn add-to
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalAmount this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(defn get
  (^long [^js/JSJoda.TemporalAmount this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(defn get-units
  (^java.util.List [^js/JSJoda.TemporalAmount this]
   (.units this)))

(defn subtract-from
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalAmount this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))
