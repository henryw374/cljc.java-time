(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoUnit]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoUnit])))
(def millis (. java.time.temporal.ChronoUnit -MILLIS))
(def minutes (. java.time.temporal.ChronoUnit -MINUTES))
(def micros (. java.time.temporal.ChronoUnit -MICROS))
(def half-days (. java.time.temporal.ChronoUnit -HALF_DAYS))
(def millennia (. java.time.temporal.ChronoUnit -MILLENNIA))
(def years (. java.time.temporal.ChronoUnit -YEARS))
(def decades (. java.time.temporal.ChronoUnit -DECADES))
(def days (. java.time.temporal.ChronoUnit -DAYS))
(def centuries (. java.time.temporal.ChronoUnit -CENTURIES))
(def weeks (. java.time.temporal.ChronoUnit -WEEKS))
(def hours (. java.time.temporal.ChronoUnit -HOURS))
(def eras (. java.time.temporal.ChronoUnit -ERAS))
(def seconds (. java.time.temporal.ChronoUnit -SECONDS))
(def months (. java.time.temporal.ChronoUnit -MONTHS))
(def nanos (. java.time.temporal.ChronoUnit -NANOS))
(def forever (. java.time.temporal.ChronoUnit -FOREVER))

(defn is-time-based ([^java.time.temporal.ChronoUnit G__47539] (.isTimeBased ^java.time.temporal.ChronoUnit G__47539)))



(defn is-date-based ([^java.time.temporal.ChronoUnit G__47540] (.isDateBased ^java.time.temporal.ChronoUnit G__47540)))


(defn is-duration-estimated ([^java.time.temporal.ChronoUnit G__47541] (.isDurationEstimated ^java.time.temporal.ChronoUnit G__47541)))







(defn is-supported-by ([^java.time.temporal.ChronoUnit G__47542 ^java.time.temporal.Temporal G__47543] (.isSupportedBy ^java.time.temporal.ChronoUnit G__47542 ^java.time.temporal.Temporal G__47543)))









(defn between ([^java.time.temporal.ChronoUnit G__47544 ^java.time.temporal.Temporal G__47545 ^java.time.temporal.Temporal G__47546] (.between ^java.time.temporal.ChronoUnit G__47544 ^java.time.temporal.Temporal G__47545 ^java.time.temporal.Temporal G__47546)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.ChronoUnit G__47547 ^java.time.temporal.Temporal G__47548 G__47549] (.addTo ^java.time.temporal.ChronoUnit G__47547 ^java.time.temporal.Temporal G__47548 G__47549)))



(defn to-string ^java.lang.String ([^java.time.temporal.ChronoUnit G__47550] (.toString ^java.time.temporal.ChronoUnit G__47550)))





(defn value-of ^java.time.temporal.ChronoUnit ([^java.lang.String G__47552] (. java.time.temporal.ChronoUnit valueOf ^java.lang.String G__47552)))




(defn values ^java.time.temporal.ChronoUnit ([] (. java.time.temporal.ChronoUnit values)))



(defn get-duration ^java.time.Duration ([^java.time.temporal.ChronoUnit G__47554] (jti/getter duration ^java.time.temporal.ChronoUnit G__47554)))

