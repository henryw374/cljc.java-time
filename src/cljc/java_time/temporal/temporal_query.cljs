(ns cljc.java-time.temporal.temporal-query (:require [java.time.temporal :refer [TemporalQuery]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn query-from {:arglists (quote (["java.time.temporal.TemporalQuery" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [^java.time.temporal.TemporalQuery this51035 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor51036] (.queryFrom this51035 java-time-temporal-TemporalAccessor51036)))