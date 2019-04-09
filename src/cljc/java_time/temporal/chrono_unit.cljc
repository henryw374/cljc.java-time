(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoUnit]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time.temporal ChronoUnit])))
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

(defn is-time-based ([^java.time.temporal.ChronoUnit G__56673] (.isTimeBased ^java.time.temporal.ChronoUnit G__56673)))



(defn is-date-based ([^java.time.temporal.ChronoUnit G__56674] (.isDateBased ^java.time.temporal.ChronoUnit G__56674)))


(defn is-duration-estimated ([^java.time.temporal.ChronoUnit G__56675] (.isDurationEstimated ^java.time.temporal.ChronoUnit G__56675)))







(defn is-supported-by ([^java.time.temporal.ChronoUnit G__56676 ^java.time.temporal.Temporal G__56677] (.isSupportedBy ^java.time.temporal.ChronoUnit G__56676 ^java.time.temporal.Temporal G__56677)))









(defn between ([^java.time.temporal.ChronoUnit G__56678 ^java.time.temporal.Temporal G__56679 ^java.time.temporal.Temporal G__56680] (.between ^java.time.temporal.ChronoUnit G__56678 ^java.time.temporal.Temporal G__56679 ^java.time.temporal.Temporal G__56680)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.ChronoUnit G__56681 ^java.time.temporal.Temporal G__56682 G__56683] (.addTo ^java.time.temporal.ChronoUnit G__56681 ^java.time.temporal.Temporal G__56682 G__56683)))



(defn to-string ^java.lang.String ([^java.time.temporal.ChronoUnit G__56684] (.toString ^java.time.temporal.ChronoUnit G__56684)))





(defn value-of ^java.time.temporal.ChronoUnit ([^java.lang.String G__56686] (. java.time.temporal.ChronoUnit valueOf ^java.lang.String G__56686)))




(defn values ^java.time.temporal.ChronoUnit ([] (. java.time.temporal.ChronoUnit values)))



(defn get-duration ^java.time.Duration ([^java.time.temporal.ChronoUnit G__56688] (jti/getter duration ^java.time.temporal.ChronoUnit G__56688)))

