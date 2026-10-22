(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZoneId]]))

(def short-ids (goog.object/get java.time.ZoneId "SHORT_IDS"))

(defn get-available-zone-ids
  (^java.util.Set []
   (js-invoke java.time.ZoneId "getAvailableZoneIds")))

(defn of
  (^js/JSJoda.ZoneId [^java.lang.String zone-id]
   (js-invoke java.time.ZoneId "of" zone-id))
  (^js/JSJoda.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (js-invoke java.time.ZoneId "of" zone-id alias-map)))

(defn of-offset
  (^js/JSJoda.ZoneId [^java.lang.String prefix ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.ZoneId "ofOffset" prefix offset)))

(defn to-string
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.toString this)))

(defn get-display-name
  (^java.lang.String [^js/JSJoda.ZoneId this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(defn get-rules
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneId this]
   (.rules this)))

(defn get-id
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.id this)))

(defn normalized
  (^js/JSJoda.ZoneId [^js/JSJoda.ZoneId this]
   (.normalized this)))

(defn system-default
  (^js/JSJoda.ZoneId []
   (js-invoke java.time.ZoneId "systemDefault")))

(defn from
  (^js/JSJoda.ZoneId [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.ZoneId "from" temporal)))

(defn hash-code
  (^int [^js/JSJoda.ZoneId this]
   (.hashCode this)))

(defn equals
  (^boolean [^js/JSJoda.ZoneId this ^java.lang.Object obj]
   (.equals this obj)))
