(ns cljc.java-time.clock (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Clock]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Clock])))

(defn fixed ^java.time.Clock ([^java.time.Instant G__56551 ^java.time.ZoneId G__56552] (. java.time.Clock fixed ^java.time.Instant G__56551 ^java.time.ZoneId G__56552)))


(defn millis ([^java.time.Clock G__56553] (.millis ^java.time.Clock G__56553)))


(defn tick ^java.time.Clock ([^java.time.Clock G__56555 ^java.time.Duration G__56556] (. java.time.Clock tick ^java.time.Clock G__56555 ^java.time.Duration G__56556)))


(defn tick-minutes ^java.time.Clock ([^java.time.ZoneId G__56558] (. java.time.Clock tickMinutes ^java.time.ZoneId G__56558)))


(defn system ^java.time.Clock ([^java.time.ZoneId G__56560] (. java.time.Clock system ^java.time.ZoneId G__56560)))


(defn instant ^java.time.Instant ([^java.time.Clock G__56561] (.instant ^java.time.Clock G__56561)))


(defn offset ^java.time.Clock ([^java.time.Clock G__56563 ^java.time.Duration G__56564] (. java.time.Clock offset ^java.time.Clock G__56563 ^java.time.Duration G__56564)))


(defn system-utc ^java.time.Clock ([] (. java.time.Clock systemUTC)))


(defn get-zone ^java.time.ZoneId ([^java.time.Clock G__56566] (jti/getter zone ^java.time.Clock G__56566)))


(defn system-default-zone ^java.time.Clock ([] (. java.time.Clock systemDefaultZone)))



(defn equals ([^java.time.Clock G__56568 ^java.lang.Object G__56569] (.equals ^java.time.Clock G__56568 ^java.lang.Object G__56569)))


(defn hash-code ([^java.time.Clock G__56570] (.hashCode ^java.time.Clock G__56570)))


(defn with-zone ^java.time.Clock ([^java.time.Clock G__56571 ^java.time.ZoneId G__56572] (.withZone ^java.time.Clock G__56571 ^java.time.ZoneId G__56572)))


(defn tick-seconds ^java.time.Clock ([^java.time.ZoneId G__56574] (. java.time.Clock tickSeconds ^java.time.ZoneId G__56574)))

