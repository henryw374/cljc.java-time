(ns cljc.java-time.temporal.chrono-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal ChronoUnit]))

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
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.temporal.ChronoUnit/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.temporal.ChronoUnit [^java.lang.String name]
   (java.time.temporal.ChronoUnit/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.temporal.ChronoUnit/valueOf enum-type name)))

(defn ordinal
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this]
   (.ordinal this)))

(defn is-duration-estimated
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDurationEstimated this)))

(defn to-string
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.toString this)))

(defn is-date-based
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDateBased this)))

(defn add-to
  {:arglists '(["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "long"])}
  (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(defn name
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.name this)))

(defn is-supported-by
  {:arglists '(["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal]
   (.isSupportedBy this temporal)))

(defn get-declaring-class
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Class [^java.time.temporal.ChronoUnit this]
   (.getDeclaringClass this)))

(defn between
  {:arglists '(["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"])}
  (^long
   [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal1-inclusive
    ^java.time.temporal.Temporal temporal2-exclusive]
   (.between this temporal1-inclusive temporal2-exclusive)))

(defn hash-code
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this]
   (.hashCode this)))

(defn compare-to
  {:arglists '(["java.time.temporal.ChronoUnit" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.temporal.ChronoUnit this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get-duration
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.time.Duration [^java.time.temporal.ChronoUnit this]
   (.getDuration this)))

(defn equals
  {:arglists '(["java.time.temporal.ChronoUnit" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.lang.Object other]
   (.equals this other)))

(defn is-time-based
  {:arglists '(["java.time.temporal.ChronoUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isTimeBased this)))
