(ns cljc.java-time.temporal.temporal-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalUnit]))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal arg0 ^long arg1]
   (.addTo this arg0 arg1)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^long [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal arg0 ^java.time.temporal.Temporal arg1]
   (.between this arg0 arg1)))

(clojure.core/defn get-duration
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^java.time.temporal.ChronoUnit this]
   (.getDuration this)))

(clojure.core/defn is-date-based
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDateBased this)))

(clojure.core/defn is-duration-estimated
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDurationEstimated this)))

(clojure.core/defn is-supported-by
  {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"]))}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal arg0]
   (.isSupportedBy this arg0)))

(clojure.core/defn is-time-based
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isTimeBased this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.TemporalUnit"]))}
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.toString this)))
