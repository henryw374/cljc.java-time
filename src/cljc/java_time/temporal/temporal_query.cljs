(ns cljc.java-time.temporal.temporal-query
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalQuery]]))

(defn query-from
  (^java.lang.Object [^js/JSJoda.TemporalQuery this ^js/JSJoda.TemporalAccessor temporal]
   (.queryFrom this temporal)))
