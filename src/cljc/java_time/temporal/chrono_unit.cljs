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

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.temporal.ChronoUnit "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.ChronoUnit [^java.lang.String arg0]
   (js-invoke java.time.temporal.ChronoUnit "valueOf" arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (js-invoke java.time.temporal.ChronoUnit "valueOf" arg0 arg1)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^int [^js/JSJoda.ChronoUnit this]
   (.ordinal this)))

(clojure.core/defn is-duration-estimated
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isDurationEstimated this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^java.lang.String [^js/JSJoda.ChronoUnit this]
   (.toString this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isDateBased this)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "long"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal arg0 ^long arg1]
   (.addTo this arg0 arg1)))

(clojure.core/defn name
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^java.lang.String [^js/JSJoda.ChronoUnit this]
   (.name this)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal"]))}
  (^boolean [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal arg0]
   (.isSupportedBy this arg0)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^java.lang.Class [^js/JSJoda.ChronoUnit this]
   (.declaringClass this)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^long [^js/JSJoda.ChronoUnit this ^js/JSJoda.Temporal arg0 ^js/JSJoda.Temporal arg1]
   (.between this arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^int [^js/JSJoda.ChronoUnit this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Enum"]))}
  (^int [^js/JSJoda.ChronoUnit this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-duration
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^js/JSJoda.Duration [^js/JSJoda.ChronoUnit this]
   (.duration this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ChronoUnit this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.ChronoUnit"]))}
  (^boolean [^js/JSJoda.ChronoUnit this]
   (.isTimeBased this)))
