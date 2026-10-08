(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Clock)))

(defn tick
  (^java.time.Clock [^java.time.Clock base-clock ^java.time.Duration tick-duration]
   (java.time.Clock/tick base-clock tick-duration)))

(defn offset
  (^java.time.Clock [^java.time.Clock base-clock ^java.time.Duration offset-duration]
   (java.time.Clock/offset base-clock offset-duration)))

(defn system-utc
  (^java.time.Clock []
   (java.time.Clock/systemUTC)))

(defn system-default-zone
  (^java.time.Clock []
   (java.time.Clock/systemDefaultZone)))

(defn fixed
  (^java.time.Clock [^java.time.Instant fixed-instant ^java.time.ZoneId zone]
   (java.time.Clock/fixed fixed-instant zone)))

(defn tick-minutes
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/tickMinutes zone)))

(defn tick-seconds
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/tickSeconds zone)))

(defn millis
  (^long [^java.time.Clock this]
   (.millis this)))

(defn with-zone
  (^java.time.Clock [^java.time.Clock this ^java.time.ZoneId zone]
   (.withZone this zone)))

(defn get-zone
  (^java.time.ZoneId [^java.time.Clock this]
   (.getZone this)))

(defn hash-code
  (^java.lang.Integer [^java.time.Clock this]
   (.hashCode this)))

(defn system
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/system zone)))

(defn instant
  (^java.time.Instant [^java.time.Clock this]
   (.instant this)))

(defn equals
  (^java.lang.Boolean [^java.time.Clock this ^java.lang.Object obj]
   (.equals this obj)))
