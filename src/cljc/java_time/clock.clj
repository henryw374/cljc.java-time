(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Clock]))

(clojure.core/defn tick
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^java.time.Clock [^java.time.Clock arg0 ^java.time.Duration arg1]
   (java.time.Clock/tick arg0 arg1)))

(clojure.core/defn offset
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^java.time.Clock [^java.time.Clock arg0 ^java.time.Duration arg1]
   (java.time.Clock/offset arg0 arg1)))

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
  (^java.time.Clock [^java.time.Instant arg0 ^java.time.ZoneId arg1]
   (java.time.Clock/fixed arg0 arg1)))

(clojure.core/defn tick-minutes
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.ZoneId arg0]
   (java.time.Clock/tickMinutes arg0)))

(clojure.core/defn tick-seconds
  {:arglists (quote (["java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.ZoneId arg0]
   (java.time.Clock/tickSeconds arg0)))

(clojure.core/defn millis
  {:arglists (quote (["java.time.Clock"]))}
  (^long [^java.time.Clock this]
   (.millis this)))

(clojure.core/defn with-zone
  {:arglists (quote (["java.time.Clock" "java.time.ZoneId"]))}
  (^java.time.Clock [^java.time.Clock this ^java.time.ZoneId arg0]
   (.withZone this arg0)))

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
  (^java.time.Clock [^java.time.ZoneId arg0]
   (java.time.Clock/system arg0)))

(clojure.core/defn instant
  {:arglists (quote (["java.time.Clock"]))}
  (^java.time.Instant [^java.time.Clock this]
   (.instant this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Clock" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Clock this ^java.lang.Object arg0]
   (.equals this arg0)))
