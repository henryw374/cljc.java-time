(ns cljc.java-time.temporal.temporal-amount
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalAmount)))

(defn add-to
  (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(defn get
  (^long [^java.time.temporal.TemporalAmount this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(defn get-units
  (^java.util.List [^java.time.temporal.TemporalAmount this]
   (.getUnits this)))

(defn subtract-from
  (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))
