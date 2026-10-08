(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time ZoneId)))

(def short-ids java.time.ZoneId/SHORT_IDS)

(defn get-available-zone-ids
  (^java.util.Set []
   (java.time.ZoneId/getAvailableZoneIds)))

(defn of
  (^java.time.ZoneId [^java.lang.String zone-id]
   (java.time.ZoneId/of zone-id))
  (^java.time.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (java.time.ZoneId/of zone-id alias-map)))

(defn of-offset
  (^java.time.ZoneId [^java.lang.String prefix ^java.time.ZoneOffset offset]
   (java.time.ZoneId/ofOffset prefix offset)))

(defn to-string
  (^java.lang.String [^java.time.ZoneId this]
   (.toString this)))

(defn get-display-name
  (^java.lang.String [^java.time.ZoneId this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(defn get-rules
  (^java.time.zone.ZoneRules [^java.time.ZoneId this]
   (.getRules this)))

(defn get-id
  (^java.lang.String [^java.time.ZoneId this]
   (.getId this)))

(defn normalized
  (^java.time.ZoneId [^java.time.ZoneId this]
   (.normalized this)))

(defn system-default
  (^java.time.ZoneId []
   (java.time.ZoneId/systemDefault)))

(defn from
  (^java.time.ZoneId [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZoneId/from temporal)))

(defn hash-code
  (^java.lang.Integer [^java.time.ZoneId this]
   (.hashCode this)))

(defn equals
  (^java.lang.Boolean [^java.time.ZoneId this ^java.lang.Object obj]
   (.equals this obj)))
