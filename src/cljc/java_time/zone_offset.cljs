(ns cljc.java-time.zone-offset
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZoneOffset]]))

(def max (goog.object/get java.time.ZoneOffset "MAX"))

(def min (goog.object/get java.time.ZoneOffset "MIN"))

(def utc (goog.object/get java.time.ZoneOffset "UTC"))

(clojure.core/defn get-available-zone-ids
  {:arglists (quote ([]))}
  (^java.util.Set []
   (js-invoke java.time.ZoneOffset "getAvailableZoneIds")))

(clojure.core/defn range
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn of-total-seconds
  {:arglists (quote (["int"]))}
  (^js/JSJoda.ZoneOffset [^int total-seconds]
   (js-invoke java.time.ZoneOffset "ofTotalSeconds" total-seconds)))

(clojure.core/defn of
  {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))}
  (^java.lang.Object [arg0]
   (js-invoke java.time.ZoneOffset "of" arg0))
  (^js/JSJoda.ZoneId [^java.lang.String zone-id ^java.util.Map alias-map]
   (js-invoke java.time.ZoneOffset "of" zone-id alias-map)))

(clojure.core/defn of-offset
  {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneId [^java.lang.String prefix ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.ZoneOffset "ofOffset" prefix offset)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.String [^js/JSJoda.ZoneOffset this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.ZoneOffset this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-rules
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneOffset this]
   (.rules this)))

(clojure.core/defn of-hours
  {:arglists (quote (["int"]))}
  (^js/JSJoda.ZoneOffset [^int hours]
   (js-invoke java.time.ZoneOffset "ofHours" hours)))

(clojure.core/defn get-id
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.String [^js/JSJoda.ZoneOffset this]
   (.id this)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZoneOffset this]
   (.normalized this)))

(clojure.core/defn system-default
  {:arglists (quote ([]))}
  (^js/JSJoda.ZoneId []
   (js-invoke java.time.ZoneOffset "systemDefault")))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"]))}
  (^java.lang.Object [arg0]
   (js-invoke java.time.ZoneOffset "from" arg0)))

(clojure.core/defn of-hours-minutes-seconds
  {:arglists (quote (["int" "int" "int"]))}
  (^js/JSJoda.ZoneOffset [^int hours ^int minutes ^int seconds]
   (js-invoke java.time.ZoneOffset "ofHoursMinutesSeconds" hours minutes seconds)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^int [^js/JSJoda.ZoneOffset this]
   (.hashCode this)))

(clojure.core/defn get-total-seconds
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^int [^js/JSJoda.ZoneOffset this]
   (.totalSeconds this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.ZoneOffset this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn of-hours-minutes
  {:arglists (quote (["int" "int"]))}
  (^js/JSJoda.ZoneOffset [^int hours ^int minutes]
   (js-invoke java.time.ZoneOffset "ofHoursMinutes" hours minutes)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"]))}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.ZoneOffset other]
   (.compareTo this other)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ZoneOffset this ^java.lang.Object obj]
   (.equals this obj)))
