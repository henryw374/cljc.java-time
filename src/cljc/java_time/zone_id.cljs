(ns cljc.java-time.zone-id
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZoneId]]))

(def short-ids (goog.object/get java.time.ZoneId "SHORT_IDS"))

(clojure.core/defn get-available-zone-ids
  {:arglists '([])}
  (^java.util.Set []
   (js-invoke java.time.ZoneId "getAvailableZoneIds")))

(clojure.core/defn of
  {:arglists '(["java.lang.String"] ["java.lang.String" "java.util.Map"])}
  (^js/JSJoda.ZoneId [^java.lang.String zone-id]
   (js-invoke java.time.ZoneId "of" zone-id))
  (^js/JSJoda.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (js-invoke java.time.ZoneId "of" zone-id alias-map)))

(clojure.core/defn of-offset
  {:arglists '(["java.lang.String" "java.time.ZoneOffset"])}
  (^js/JSJoda.ZoneId [^java.lang.String prefix ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.ZoneId "ofOffset" prefix offset)))

(clojure.core/defn to-string
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.ZoneId this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(clojure.core/defn get-rules
  {:arglists '(["java.time.ZoneId"])}
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneId this]
   (.rules this)))

(clojure.core/defn get-id
  {:arglists '(["java.time.ZoneId"])}
  (^java.lang.String [^js/JSJoda.ZoneId this]
   (.id this)))

(clojure.core/defn normalized
  {:arglists '(["java.time.ZoneId"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZoneId this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists '([])}
  (^js/JSJoda.ZoneId []
   (js-invoke java.time.ZoneId "systemDefault")))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.ZoneId "from" temporal)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.ZoneId"])}
  (^int [^js/JSJoda.ZoneId this]
   (.hashCode this)))

(clojure.core/defn equals
  {:arglists '(["java.time.ZoneId" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ZoneId this ^java.lang.Object obj]
   (.equals this obj)))
