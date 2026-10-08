(ns cljc.java-time.temporal.temporal-queries
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalQueries)))

(defn chronology
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/chronology)))

(defn local-date
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localDate)))

(defn local-time
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/localTime)))

(defn offset
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/offset)))

(defn precision
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/precision)))

(defn zone
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zone)))

(defn zone-id
  (^java.time.temporal.TemporalQuery []
   (java.time.temporal.TemporalQueries/zoneId)))
