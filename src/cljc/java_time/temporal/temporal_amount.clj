(ns cljc.java-time.temporal.temporal-amount
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalAmount]))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this ^java.time.temporal.Temporal arg0]
   (.addTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.temporal.TemporalAmount this ^java.time.temporal.ChronoUnit arg0]
   (.get this arg0)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^java.util.List [^java.time.temporal.TemporalAmount this]
   (.getUnits this)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this ^java.time.temporal.Temporal arg0]
   (.subtractFrom this arg0)))
