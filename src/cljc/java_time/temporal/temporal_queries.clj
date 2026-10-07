(ns cljc.java-time.temporal.temporal-queries
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalQueries]))

(defn chronology
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/chronology)))

(defn local-date
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localDate)))

(defn local-time
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localTime)))

(defn offset
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/offset)))

(defn precision
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/precision)))

(defn zone
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zone)))

(defn zone-id
  {:arglists '([])}
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zoneId)))
