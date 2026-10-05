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
  (^js/JSJoda.ValueRange [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of-total-seconds
  {:arglists (quote (["int"]))}
  (^js/JSJoda.ZoneOffset [^int arg0]
   (js-invoke java.time.ZoneOffset "ofTotalSeconds" arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))}
  (^java.lang.Object [arg0]
   (js-invoke java.time.ZoneOffset "of" arg0))
  (^js/JSJoda.ZoneId [^java.lang.String arg0 ^java.util.Map arg1]
   (js-invoke java.time.ZoneOffset "of" arg0 arg1)))

(clojure.core/defn of-offset
  {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneId [^java.lang.String arg0 ^js/JSJoda.ZoneOffset arg1]
   (js-invoke java.time.ZoneOffset "ofOffset" arg0 arg1)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^java.lang.String [^js/JSJoda.ZoneOffset this]
   (.toString this)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.ZoneOffset this ^js/JSJoda.TextStyle arg0 ^java.util.Locale arg1]
   (.displayName this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-rules
  {:arglists (quote (["java.time.ZoneOffset"]))}
  (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneOffset this]
   (.rules this)))

(clojure.core/defn of-hours
  {:arglists (quote (["int"]))}
  (^js/JSJoda.ZoneOffset [^int arg0]
   (js-invoke java.time.ZoneOffset "ofHours" arg0)))

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
  (^js/JSJoda.ZoneOffset [^int arg0 ^int arg1 ^int arg2]
   (js-invoke java.time.ZoneOffset "ofHoursMinutesSeconds" arg0 arg1 arg2)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField arg0]
   (.isSupported this arg0)))

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
  (^js/JSJoda.Temporal [^js/JSJoda.ZoneOffset this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn of-hours-minutes
  {:arglists (quote (["int" "int"]))}
  (^js/JSJoda.ZoneOffset [^int arg0 ^int arg1]
   (js-invoke java.time.ZoneOffset "ofHoursMinutes" arg0 arg1)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"]))}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.ZoneOffset arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.ZoneOffset this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ZoneOffset this ^java.lang.Object arg0]
   (.equals this arg0)))
