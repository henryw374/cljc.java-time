(ns cljc.java-time.zone-offset
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZoneOffset]]))

(def max (goog.object/get java.time.ZoneOffset "MAX"))

(def min (goog.object/get java.time.ZoneOffset "MIN"))

(def utc (goog.object/get java.time.ZoneOffset "UTC"))

(defn get-available-zone-ids
  {:arglists '([])}
  (^java.util.Set []
   (js-invoke java.time.ZoneOffset "getAvailableZoneIds")))

(defn range
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of-total-seconds
  {:arglists '(["int"])}
  (^js/JSJoda.ZoneOffset [^int total-seconds]
   (js-invoke java.time.ZoneOffset "ofTotalSeconds" total-seconds)))

(defn of
  {:arglists '(["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"])}
  (^java.lang.Object [arg0]
   (js-invoke java.time.ZoneOffset "of" arg0))
  (^js/JSJoda.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (js-invoke java.time.ZoneOffset "of" zone-id alias-map)))

(defn of-offset
  {:arglists '(["java.lang.String" "java.time.ZoneOffset"])}
  (^js/JSJoda.ZoneId [^java.lang.String prefix ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.ZoneOffset "ofOffset" prefix offset)))

(defn query
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.String [^js/JSJoda.ZoneOffset this]
   (.toString this)))

(defn get-display-name
  {:arglists '(["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.ZoneOffset this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(defn get-long
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn get-rules
  {:arglists '(["java.time.ZoneOffset"])}
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneOffset this]
   (.rules this)))

(defn of-hours
  {:arglists '(["int"])}
  (^js/JSJoda.ZoneOffset [^int hours]
   (js-invoke java.time.ZoneOffset "ofHours" hours)))

(defn get-id
  {:arglists '(["java.time.ZoneOffset"])}
  (^java.lang.String [^js/JSJoda.ZoneOffset this]
   (.id this)))

(defn normalized
  {:arglists '(["java.time.ZoneOffset"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZoneOffset this]
   (.normalized this)))

(defn system-default
  {:arglists '([])}
  (^js/JSJoda.ZoneId []
   (js-invoke java.time.ZoneOffset "systemDefault")))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"])}
  (^java.lang.Object [arg0]
   (js-invoke java.time.ZoneOffset "from" arg0)))

(defn of-hours-minutes-seconds
  {:arglists '(["int" "int" "int"])}
  (^js/JSJoda.ZoneOffset [^int hours ^int minutes ^int seconds]
   (js-invoke java.time.ZoneOffset "ofHoursMinutesSeconds" hours minutes seconds)))

(defn is-supported
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  {:arglists '(["java.time.ZoneOffset"])}
  (^int [^js/JSJoda.ZoneOffset this]
   (.hashCode this)))

(defn get-total-seconds
  {:arglists '(["java.time.ZoneOffset"])}
  (^int [^js/JSJoda.ZoneOffset this]
   (.totalSeconds this)))

(defn adjust-into
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.ZoneOffset this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn of-hours-minutes
  {:arglists '(["int" "int"])}
  (^js/JSJoda.ZoneOffset [^int hours ^int minutes]
   (js-invoke java.time.ZoneOffset "ofHoursMinutes" hours minutes)))

(defn compare-to
  {:arglists '(["java.time.ZoneOffset" "java.time.ZoneOffset"])}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.ZoneOffset other]
   (.compareTo this other)))

(defn get
  {:arglists '(["java.time.ZoneOffset" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.ZoneOffset" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ZoneOffset this ^java.lang.Object obj]
   (.equals this obj)))
