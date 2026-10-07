(ns cljc.java-time.temporal.temporal-unit
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalUnit]))

(clojure.core/defn add-to
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"])}
  (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal ^long amount]
   (.addTo this temporal amount)))

(clojure.core/defn between
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"])}
  (^long
   [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal1-inclusive
    ^java.time.temporal.Temporal temporal2-exclusive]
   (.between this temporal1-inclusive temporal2-exclusive)))

(clojure.core/defn get-duration
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.time.Duration [^java.time.temporal.ChronoUnit this]
   (.getDuration this)))

(clojure.core/defn is-date-based
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDateBased this)))

(clojure.core/defn is-duration-estimated
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isDurationEstimated this)))

(clojure.core/defn is-supported-by
  {:arglists '(["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this ^java.time.temporal.Temporal temporal]
   (.isSupportedBy this temporal)))

(clojure.core/defn is-time-based
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.temporal.ChronoUnit this]
   (.isTimeBased this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.temporal.TemporalUnit"])}
  (^java.lang.String [^java.time.temporal.ChronoUnit this]
   (.toString this)))
