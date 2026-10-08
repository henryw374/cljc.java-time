(ns cljc.java-time.temporal.chrono-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [ChronoUnit]]))

(def millis (goog.object/get java.time.temporal.ChronoUnit "MILLIS"))

(def minutes (goog.object/get java.time.temporal.ChronoUnit "MINUTES"))

(def micros (goog.object/get java.time.temporal.ChronoUnit "MICROS"))

(def half-days (goog.object/get java.time.temporal.ChronoUnit "HALF_DAYS"))

(def millennia (goog.object/get java.time.temporal.ChronoUnit "MILLENNIA"))

(def years (goog.object/get java.time.temporal.ChronoUnit "YEARS"))

(def decades (goog.object/get java.time.temporal.ChronoUnit "DECADES"))

(def days (goog.object/get java.time.temporal.ChronoUnit "DAYS"))

(def centuries (goog.object/get java.time.temporal.ChronoUnit "CENTURIES"))

(def weeks (goog.object/get java.time.temporal.ChronoUnit "WEEKS"))

(def hours (goog.object/get java.time.temporal.ChronoUnit "HOURS"))

(def eras (goog.object/get java.time.temporal.ChronoUnit "ERAS"))

(def seconds (goog.object/get java.time.temporal.ChronoUnit "SECONDS"))

(def months (goog.object/get java.time.temporal.ChronoUnit "MONTHS"))

(def nanos (goog.object/get java.time.temporal.ChronoUnit "NANOS"))

(def forever (goog.object/get java.time.temporal.ChronoUnit "FOREVER"))

(defn values
  (^"java.lang.Class" []
   (js-invoke java.time.temporal.ChronoUnit "values")))

(defn value-of
  (^js/JSJoda.ChronoUnit [^java.lang.String name]
   (js-invoke java.time.temporal.ChronoUnit "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.temporal.ChronoUnit "valueOf" enum-type name)))

(defn ordinal
  (^int [^js/JSJoda.ChronoUnit this]
   (.ordinal this)))

(defn is-duration-estimated
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isDurationEstimated this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.ChronoUnit this]
   (.toString this)))

(defn is-date-based
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isDateBased this)))

(defn add-to
  (^js/JSJoda.Temporal [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(defn name
  (^java.lang.String [^js/JSJoda.ChronoUnit this]
   (.name this)))

(defn is-supported-by
  (^boolean [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal temporal]
   (.isSupportedBy this temporal)))

(defn get-declaring-class
  (^java.lang.Class [^js/JSJoda.ChronoUnit this]
   (.declaringClass this)))

(defn between
  (^long [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal temporal-1-inclusive ^js/JSJoda.Temporal temporal-2-exclusive]
   (.between this temporal-1-inclusive temporal-2-exclusive)))

(defn hash-code
  (^int [^js/JSJoda.ChronoUnit this]
   (.hashCode this)))

(defn compare-to
  (^int [^js/JSJoda.ChronoUnit this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get-duration
  (^js/JSJoda.Duration [^js/JSJoda.ChronoUnit this]
   (.duration this)))

(defn equals
  (^boolean [^js/JSJoda.ChronoUnit this ^java.lang.Object other]
   (.equals this other)))

(defn is-time-based
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isTimeBased this)))
