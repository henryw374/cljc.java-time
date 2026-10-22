(ns cljc.java-time.temporal.temporal-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalUnit)))

(defn add-to
  (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(defn between
  (^long
   [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal-1-inclusive
    ^java.time.temporal.Temporal temporal-2-exclusive]
   (.between this temporal-1-inclusive temporal-2-exclusive)))

(defn get-duration
  (^java.time.Duration [^java.time.temporal.ChronoUnit this]
   (.getDuration this)))

(defn is-date-based
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDateBased this)))

(defn is-duration-estimated
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDurationEstimated this)))

(defn is-supported-by
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal]
   (.isSupportedBy this temporal)))

(defn is-time-based
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isTimeBased this)))

(defn to-string
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.toString this)))
