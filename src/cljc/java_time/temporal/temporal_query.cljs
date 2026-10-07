(ns cljc.java-time.temporal.temporal-query
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalQuery]]))

(defn query-from
  {:arglists '(["java.time.temporal.TemporalQuery" "java.time.temporal.TemporalAccessor"])}
  (^java.lang.Object [^js/JSJoda.TemporalQuery this ^js/JSJoda.TemporalAccessor temporal]
   (.queryFrom this temporal)))
