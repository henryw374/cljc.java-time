(ns cljc.java-time.temporal.temporal-amount (:import [java.time.temporal TemporalAmount]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn get-units {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.util.List [^java.time.temporal.TemporalAmount this50875] (.getUnits this50875)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this50876 ^java.time.temporal.Temporal java-time-temporal-Temporal50877] (.addTo this50876 java-time-temporal-Temporal50877)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this50878 ^java.time.temporal.Temporal java-time-temporal-Temporal50879] (.subtractFrom this50878 java-time-temporal-Temporal50879)))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.temporal.TemporalAmount this50880 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit50881] (.get this50880 java-time-temporal-TemporalUnit50881)))
