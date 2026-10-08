(ns cljc.java-time.temporal.temporal-query
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalQuery)))

(defn query-from
  (^java.lang.Object [^java.time.temporal.TemporalQuery this ^java.time.temporal.TemporalAccessor temporal]
   (.queryFrom this temporal)))
