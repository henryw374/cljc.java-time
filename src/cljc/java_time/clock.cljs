(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Clock]]))

(defn tick
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration tick-duration]
   (js-invoke java.time.Clock "tick" base-clock tick-duration)))

(defn offset
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration offset-duration]
   (js-invoke java.time.Clock "offset" base-clock offset-duration)))

(defn system-utc
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemUTC")))

(defn system-default-zone
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemDefaultZone")))

(defn fixed
  (^js/JSJoda.Clock [^js/JSJoda.Instant fixed-instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "fixed" fixed-instant zone)))

(defn tick-minutes
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickMinutes" zone)))

(defn tick-seconds
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickSeconds" zone)))

(defn millis
  (^long [^js/JSJoda.Clock this]
   (.millis this)))

(defn with-zone
  (^js/JSJoda.Clock [^js/JSJoda.Clock this ^js/JSJoda.ZoneId zone]
   (.withZone this zone)))

(defn get-zone
  (^js/JSJoda.ZoneId [^js/JSJoda.Clock this]
   (.zone this)))

(defn hash-code
  (^int [^js/JSJoda.Clock this]
   (.hashCode this)))

(defn system
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "system" zone)))

(defn instant
  (^js/JSJoda.Instant [^js/JSJoda.Clock this]
   (.instant this)))

(defn equals
  (^boolean [^js/JSJoda.Clock this ^java.lang.Object obj]
   (.equals this obj)))
