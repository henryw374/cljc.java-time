(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZoneId]]))

(def short-ids (goog.object/get java.time.ZoneId "SHORT_IDS"))

(clojure.core/defn get-available-zone-ids
  {:arglists (quote ([]))}
  (^java.util.Set []
   (js-invoke java.time.ZoneId "getAvailableZoneIds")))

(clojure.core/defn of
  {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Map"]))}
  (^js/JSJoda.ZoneId [^java.lang.String arg0]
   (js-invoke java.time.ZoneId "of" arg0))
  (^js/JSJoda.ZoneId [^java.lang.String arg0 ^java.util.Map arg1]
   (js-invoke java.time.ZoneId "of" arg0 arg1)))

(clojure.core/defn of-offset
  {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneId [^java.lang.String arg0 ^js/JSJoda.ZoneOffset arg1]
   (js-invoke java.time.ZoneId "ofOffset" arg0 arg1)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.ZoneId this ^js/JSJoda.TextStyle arg0 ^java.util.Locale arg1]
   (.displayName this arg0 arg1)))

(clojure.core/defn get-rules
  {:arglists (quote (["java.time.ZoneId"]))}
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneId this]
   (.rules this)))

(clojure.core/defn get-id
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.id this)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.ZoneId"]))}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZoneId this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists (quote ([]))}
  (^js/JSJoda.ZoneId []
   (js-invoke java.time.ZoneId "systemDefault")))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.ZoneId [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.ZoneId "from" arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZoneId"]))}
  (^int [^js/JSJoda.ZoneId this]
   (.hashCode this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ZoneId this ^java.lang.Object arg0]
   (.equals this arg0)))
