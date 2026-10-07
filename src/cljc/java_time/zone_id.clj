(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZoneId]))

(def short-ids java.time.ZoneId/SHORT_IDS)

(defn get-available-zone-ids
  {:arglists '([])}
  (^java.util.Set []
   (java.time.ZoneId/getAvailableZoneIds)))

(defn of
  {:arglists '(["java.lang.String"] ["java.lang.String" "java.util.Map"])}
  (^java.time.ZoneId [^java.lang.String zone-id]
   (java.time.ZoneId/of zone-id))
  (^java.time.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (java.time.ZoneId/of zone-id alias-map)))

(defn of-offset
  {:arglists '(["java.lang.String" "java.time.ZoneOffset"])}
  (^java.time.ZoneId [^java.lang.String prefix ^java.time.ZoneOffset offset]
   (java.time.ZoneId/ofOffset prefix offset)))

(defn to-string
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^java.time.ZoneId this]
   (.toString this)))

(defn get-display-name
  {:arglists '(["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.ZoneId this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(defn get-rules
  {:arglists '(["java.time.ZoneId"])}
  (^java.time.zone.ZoneRules [^java.time.ZoneId this]
   (.getRules this)))

(defn get-id
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^java.time.ZoneId this]
   (.getId this)))

(defn normalized
  {:arglists '(["java.time.ZoneId"])}
  (^java.time.ZoneId [^java.time.ZoneId this]
   (.normalized this)))

(defn system-default
  {:arglists '([])}
  (^java.time.ZoneId []
   (java.time.ZoneId/systemDefault)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.ZoneId [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZoneId/from temporal)))

(defn hash-code
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.Integer [^java.time.ZoneId this]
   (.hashCode this)))

(defn equals
  {:arglists '(["java.time.ZoneId" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.ZoneId this ^java.lang.Object obj]
   (.equals this obj)))
