(ns cljc.java-time.temporal.temporal-adjuster
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAdjuster]]))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.temporal.TemporalAdjuster" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.TemporalAdjuster this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))
