(ns cljc.java-time.zone-offset (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZoneOffset]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time ZoneOffset])))
(def max (. java.time.ZoneOffset -MAX))
(def min (. java.time.ZoneOffset -MIN))
(def utc (. java.time.ZoneOffset -UTC))

(defn of-total-seconds ^java.time.ZoneOffset ([G__56576] (. java.time.ZoneOffset ofTotalSeconds G__56576)))


(defn compare-to ([^java.time.ZoneOffset G__56577 G__56578] (.compareTo ^java.time.ZoneOffset G__56577 G__56578)))


(defn is-supported ([^java.time.ZoneOffset G__56579 ^java.time.temporal.TemporalField G__56580] (.isSupported ^java.time.ZoneOffset G__56579 ^java.time.temporal.TemporalField G__56580)))



(defn query ^java.lang.Object ([^java.time.ZoneOffset G__56581 ^java.time.temporal.TemporalQuery G__56582] (.query ^java.time.ZoneOffset G__56581 ^java.time.temporal.TemporalQuery G__56582)))



(defn of ^java.time.ZoneOffset ([^java.lang.String G__56584] (. java.time.ZoneOffset of ^java.lang.String G__56584)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZoneOffset G__56585 ^java.time.temporal.TemporalField G__56586] (.range ^java.time.ZoneOffset G__56585 ^java.time.temporal.TemporalField G__56586)))


(defn of-hours ^java.time.ZoneOffset ([G__56588] (. java.time.ZoneOffset ofHours G__56588)))


(defn get ([^java.time.ZoneOffset G__56589 ^java.time.temporal.TemporalField G__56590] (.get ^java.time.ZoneOffset G__56589 ^java.time.temporal.TemporalField G__56590)))




(defn get-total-seconds ([^java.time.ZoneOffset G__56591] (jti/getter totalSeconds ^java.time.ZoneOffset G__56591)))






(defn adjust-into ^java.time.temporal.Temporal ([^java.time.ZoneOffset G__56592 ^java.time.temporal.Temporal G__56593] (.adjustInto ^java.time.ZoneOffset G__56592 ^java.time.temporal.Temporal G__56593)))


(defn to-string ^java.lang.String ([^java.time.ZoneOffset G__56594] (.toString ^java.time.ZoneOffset G__56594)))


(defn equals ([^java.time.ZoneOffset G__56595 ^java.lang.Object G__56596] (.equals ^java.time.ZoneOffset G__56595 ^java.lang.Object G__56596)))



(defn of-hours-minutes-seconds ^java.time.ZoneOffset ([G__56598 G__56599 G__56600] (. java.time.ZoneOffset ofHoursMinutesSeconds G__56598 G__56599 G__56600)))





(defn get-id ^java.lang.String ([^java.time.ZoneOffset G__56601] (jti/getter id ^java.time.ZoneOffset G__56601)))


(defn of-hours-minutes ^java.time.ZoneOffset ([G__56603 G__56604] (. java.time.ZoneOffset ofHoursMinutes G__56603 G__56604)))




(defn hash-code ([^java.time.ZoneOffset G__56605] (.hashCode ^java.time.ZoneOffset G__56605)))



(defn get-long ([^java.time.ZoneOffset G__56606 ^java.time.temporal.TemporalField G__56607] (.getLong ^java.time.ZoneOffset G__56606 ^java.time.temporal.TemporalField G__56607)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneOffset G__56608] (jti/getter rules ^java.time.ZoneOffset G__56608)))


(defn from ^java.time.ZoneOffset ([^java.time.temporal.TemporalAccessor G__56610] (. java.time.ZoneOffset from ^java.time.temporal.TemporalAccessor G__56610)))



