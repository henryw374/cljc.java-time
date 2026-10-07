(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Clock]]))

(defn tick
  {:arglists '(["java.time.Clock" "java.time.Duration"])}
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration tick-duration]
   (js-invoke java.time.Clock "tick" base-clock tick-duration)))

(defn offset
  {:arglists '(["java.time.Clock" "java.time.Duration"])}
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration offset-duration]
   (js-invoke java.time.Clock "offset" base-clock offset-duration)))

(defn system-utc
  {:arglists '([])}
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemUTC")))

(defn system-default-zone
  {:arglists '([])}
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemDefaultZone")))

(defn fixed
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^js/JSJoda.Clock [^js/JSJoda.Instant fixed-instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "fixed" fixed-instant zone)))

(defn tick-minutes
  {:arglists '(["java.time.ZoneId"])}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickMinutes" zone)))

(defn tick-seconds
  {:arglists '(["java.time.ZoneId"])}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickSeconds" zone)))

(defn millis
  {:arglists '(["java.time.Clock"])}
  (^long [^js/JSJoda.Clock this]
   (.millis this)))

(defn with-zone
  {:arglists '(["java.time.Clock" "java.time.ZoneId"])}
  (^js/JSJoda.Clock [^js/JSJoda.Clock this ^js/JSJoda.ZoneId zone]
   (.withZone this zone)))

(defn get-zone
  {:arglists '(["java.time.Clock"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.Clock this]
   (.zone this)))

(defn hash-code
  {:arglists '(["java.time.Clock"])}
  (^int [^js/JSJoda.Clock this]
   (.hashCode this)))

(defn system
  {:arglists '(["java.time.ZoneId"])}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "system" zone)))

(defn instant
  {:arglists '(["java.time.Clock"])}
  (^js/JSJoda.Instant [^js/JSJoda.Clock this]
   (.instant this)))

(defn equals
  {:arglists '(["java.time.Clock" "java.lang.Object"])}
  (^boolean [^js/JSJoda.Clock this ^java.lang.Object obj]
   (.equals this obj)))
