(ns cljc.java-time.temporal.temporal-amount
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAmount]]))

(clojure.core/defn add-to
  {:arglists '(["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalAmount this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(clojure.core/defn get
  {:arglists '(["java.time.temporal.TemporalAmount" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.TemporalAmount this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(clojure.core/defn get-units
  {:arglists '(["java.time.temporal.TemporalAmount"])}
  (^java.util.List [^js/JSJoda.TemporalAmount this]
   (.units this)))

(clojure.core/defn subtract-from
  {:arglists '(["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalAmount this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))
