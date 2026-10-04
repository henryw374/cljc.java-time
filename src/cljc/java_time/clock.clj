(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Clock]))

(clojure.core/defn tick
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^java.time.Clock [^java.time.Clock base-clock ^java.time.Duration tick-duration]
   (java.time.Clock/tick base-clock tick-duration)))

(clojure.core/defn offset
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^java.time.Clock [^java.time.Clock base-clock ^java.time.Duration offset-duration]
   (java.time.Clock/offset base-clock offset-duration)))

(clojure.core/defn system-utc
  {:arglists (quote ([]))}
  (^java.time.Clock []
   (java.time.Clock/systemUTC)))

(clojure.core/defn system-default-zone
  {:arglists (quote ([]))}
  (^java.time.Clock []
   (java.time.Clock/systemDefaultZone)))

(clojure.core/defn fixed
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.Instant fixed-instant ^java.time.ZoneId zone]
   (java.time.Clock/fixed fixed-instant zone)))

(clojure.core/defn tick-minutes
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/tickMinutes zone)))

(clojure.core/defn tick-seconds
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/tickSeconds zone)))

(clojure.core/defn millis
  {:arglists (quote (["java.time.Clock"]))}
  (^long [^java.time.Clock this]
   (.millis this)))

(clojure.core/defn with-zone
  {:arglists (quote (["java.time.Clock" "java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.Clock this ^java.time.ZoneId zone]
   (.withZone this zone)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.Clock"]))}
  (^java.time.ZoneId [^java.time.Clock this]
   (.getZone this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Clock"]))}
  (^java.lang.Integer [^java.time.Clock this]
   (.hashCode this)))

(clojure.core/defn system
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.ZoneId zone]
   (java.time.Clock/system zone)))

(clojure.core/defn instant
  {:arglists (quote (["java.time.Clock"]))}
  (^java.time.Instant [^java.time.Clock this]
   (.instant this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Clock" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Clock this ^java.lang.Object obj]
   (.equals this obj)))
