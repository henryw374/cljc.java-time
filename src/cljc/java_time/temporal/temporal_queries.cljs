(ns cljc.java-time.temporal.temporal-queries
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalQueries]]))

(defn chronology
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "chronology")))

(defn local-date
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "localDate")))

(defn local-time
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "localTime")))

(defn offset
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "offset")))

(defn precision
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "precision")))

(defn zone
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "zone")))

(defn zone-id
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.temporal.TemporalQueries "zoneId")))
