(ns cljc.java-time.clock
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Clock]]))

(clojure.core/defn tick
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration tick-duration]
   (js-invoke java.time.Clock "tick" base-clock tick-duration)))

(clojure.core/defn offset
  {:arglists (quote (["java.time.Clock" "java.time.Duration"]))}
  (^js/JSJoda.Clock [^js/JSJoda.Clock base-clock ^js/JSJoda.Duration offset-duration]
   (js-invoke java.time.Clock "offset" base-clock offset-duration)))

(clojure.core/defn system-utc
  {:arglists (quote ([]))}
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemUTC")))

(clojure.core/defn system-default-zone
  {:arglists (quote ([]))}
  (^js/JSJoda.Clock []
   (js-invoke java.time.Clock "systemDefaultZone")))

(clojure.core/defn fixed
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.Clock [^js/JSJoda.Instant fixed-instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "fixed" fixed-instant zone)))

(clojure.core/defn tick-minutes
  {:arglists (quote (["java.time.ZoneId"]))}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickMinutes" zone)))

(clojure.core/defn tick-seconds
  {:arglists (quote (["java.time.ZoneId"]))}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "tickSeconds" zone)))

(clojure.core/defn millis
  {:arglists (quote (["java.time.Clock"]))}
  (^long [^js/JSJoda.Clock this]
   (.millis this)))

(clojure.core/defn with-zone
  {:arglists (quote (["java.time.Clock" "java.time.ZoneId"]))}
  (^js/JSJoda.Clock [^js/JSJoda.Clock this ^js/JSJoda.ZoneId zone]
   (.withZone this zone)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.Clock"]))}
  (^js/JSJoda.ZoneId [^js/JSJoda.Clock this]
   (.zone this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Clock"]))}
  (^int [^js/JSJoda.Clock this]
   (.hashCode this)))

(clojure.core/defn system
  {:arglists (quote (["java.time.ZoneId"]))}
  (^js/JSJoda.Clock [^js/JSJoda.ZoneId zone]
   (js-invoke java.time.Clock "system" zone)))

(clojure.core/defn instant
  {:arglists (quote (["java.time.Clock"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Clock this]
   (.instant this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Clock" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Clock this ^java.lang.Object obj]
   (.equals this obj)))
