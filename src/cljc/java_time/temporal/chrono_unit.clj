(ns cljc.java-time.temporal.chrono-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal ChronoUnit)))

(def millis java.time.temporal.ChronoUnit/MILLIS)

(def minutes java.time.temporal.ChronoUnit/MINUTES)

(def micros java.time.temporal.ChronoUnit/MICROS)

(def half-days java.time.temporal.ChronoUnit/HALF_DAYS)

(def millennia java.time.temporal.ChronoUnit/MILLENNIA)

(def years java.time.temporal.ChronoUnit/YEARS)

(def decades java.time.temporal.ChronoUnit/DECADES)

(def days java.time.temporal.ChronoUnit/DAYS)

(def centuries java.time.temporal.ChronoUnit/CENTURIES)

(def weeks java.time.temporal.ChronoUnit/WEEKS)

(def hours java.time.temporal.ChronoUnit/HOURS)

(def eras java.time.temporal.ChronoUnit/ERAS)

(def seconds java.time.temporal.ChronoUnit/SECONDS)

(def months java.time.temporal.ChronoUnit/MONTHS)

(def nanos java.time.temporal.ChronoUnit/NANOS)

(def forever java.time.temporal.ChronoUnit/FOREVER)

(defn values
  (^"java.lang.Class" []
   (java.time.temporal.ChronoUnit/values)))

(defn value-of
  (^java.time.temporal.ChronoUnit [^java.lang.String name]
   (java.time.temporal.ChronoUnit/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.temporal.ChronoUnit/valueOf enum-type name)))

(defn ordinal
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this]
   (.ordinal this)))

(defn is-duration-estimated
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDurationEstimated this)))

(defn to-string
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.toString this)))

(defn is-date-based
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDateBased this)))

(defn add-to
  (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(defn name
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.name this)))

(defn is-supported-by
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal]
   (.isSupportedBy this temporal)))

(defn get-declaring-class
  (^java.lang.Class [^java.time.temporal.ChronoUnit this]
   (.getDeclaringClass this)))

(defn between
  (^long
   [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal-1-inclusive
    ^java.time.temporal.Temporal temporal-2-exclusive]
   (.between this temporal-1-inclusive temporal-2-exclusive)))

(defn hash-code
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this]
   (.hashCode this)))

(defn compare-to
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get-duration
  (^java.time.Duration [^java.time.temporal.ChronoUnit this]
   (.getDuration this)))

(defn equals
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.lang.Object other]
   (.equals this other)))

(defn is-time-based
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isTimeBased this)))
