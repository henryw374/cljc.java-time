(ns cljc.java-time.temporal.temporal-query
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalQuery]))

(clojure.core/defn query-from
  {:arglists (quote (["java.time.temporal.TemporalQuery" "java.time.temporal.TemporalAccessor"]))}
  (^java.lang.Object [^java.time.temporal.TemporalQuery this ^java.time.temporal.TemporalAccessor arg0]
   (.queryFrom this arg0)))
