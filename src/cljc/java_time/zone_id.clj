(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZoneId]))

(def short-ids java.time.ZoneId/SHORT_IDS)

(clojure.core/defn get-available-zone-ids
  {:arglists '([])}
  (^java.util.Set []
   (java.time.ZoneId/getAvailableZoneIds)))

(clojure.core/defn of
  {:arglists '(["java.lang.String"] ["java.lang.String" "java.util.Map"])}
  (^java.time.ZoneId [^java.lang.String zone-id]
   (java.time.ZoneId/of zone-id))
  (^java.time.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (java.time.ZoneId/of zone-id alias-map)))

(clojure.core/defn of-offset
  {:arglists '(["java.lang.String" "java.time.ZoneOffset"])}
  (^java.time.ZoneId [^java.lang.String prefix ^java.time.ZoneOffset offset]
   (java.time.ZoneId/ofOffset prefix offset)))

(clojure.core/defn to-string
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^java.time.ZoneId this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.ZoneId this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(clojure.core/defn get-rules
  {:arglists '(["java.time.ZoneId"])}
  (^java.time.zone.ZoneRules [^java.time.ZoneId this]
   (.getRules this)))

(clojure.core/defn get-id
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^java.time.ZoneId this]
   (.getId this)))

(clojure.core/defn normalized
  {:arglists '(["java.time.ZoneId"])}
  (^java.time.ZoneId [^java.time.ZoneId this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists '([])}
  (^java.time.ZoneId []
   (java.time.ZoneId/systemDefault)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.ZoneId [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZoneId/from temporal)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.Integer [^java.time.ZoneId this]
   (.hashCode this)))

(clojure.core/defn equals
  {:arglists '(["java.time.ZoneId" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.ZoneId this ^java.lang.Object obj]
   (.equals this obj)))
