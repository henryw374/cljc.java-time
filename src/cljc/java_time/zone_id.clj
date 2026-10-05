(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZoneId]))

(def short-ids java.time.ZoneId/SHORT_IDS)

(clojure.core/defn get-available-zone-ids
  {:arglists (quote ([]))}
  (^java.util.Set []
   (java.time.ZoneId/getAvailableZoneIds)))

(clojure.core/defn of
  {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Map"]))}
  (^java.time.ZoneId [^java.lang.String arg0]
   (java.time.ZoneId/of arg0))
  (^java.time.ZoneId [^java.lang.String arg0 ^java.util.Map arg1]
   (java.time.ZoneId/of arg0 arg1)))

(clojure.core/defn of-offset
  {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))}
  (^java.time.ZoneId [^java.lang.String arg0 ^java.time.ZoneOffset arg1]
   (java.time.ZoneId/ofOffset arg0 arg1)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.lang.String [^java.time.ZoneId this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^java.time.ZoneId this ^java.time.format.TextStyle arg0 ^java.util.Locale arg1]
   (.getDisplayName this arg0 arg1)))

(clojure.core/defn get-rules
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.zone.ZoneRules [^java.time.ZoneId this]
   (.getRules this)))

(clojure.core/defn get-id
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.lang.String [^java.time.ZoneId this]
   (.getId this)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.ZoneId [^java.time.ZoneId this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists (quote ([]))}
  (^java.time.ZoneId []
   (java.time.ZoneId/systemDefault)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.ZoneId [^java.time.temporal.TemporalAccessor arg0]
   (java.time.ZoneId/from arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.lang.Integer [^java.time.ZoneId this]
   (.hashCode this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.ZoneId this ^java.lang.Object arg0]
   (.equals this arg0)))
