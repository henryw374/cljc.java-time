(ns cljc.java-time.temporal.temporal-queries
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalQueries]))

(clojure.core/defn chronology
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/chronology)))

(clojure.core/defn local-date
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localDate)))

(clojure.core/defn local-time
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localTime)))

(clojure.core/defn offset
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/offset)))

(clojure.core/defn precision
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/precision)))

(clojure.core/defn zone
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zone)))

(clojure.core/defn zone-id
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zoneId)))
