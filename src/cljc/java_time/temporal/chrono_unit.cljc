(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoUnit]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoUnit])))

(defn is-time-based ([^java.time.temporal.ChronoUnit G__36903] (.isTimeBased ^java.time.temporal.ChronoUnit G__36903)))



(defn is-date-based ([^java.time.temporal.ChronoUnit G__36904] (.isDateBased ^java.time.temporal.ChronoUnit G__36904)))


(defn is-duration-estimated ([^java.time.temporal.ChronoUnit G__36905] (.isDurationEstimated ^java.time.temporal.ChronoUnit G__36905)))







(defn is-supported-by ([^java.time.temporal.ChronoUnit G__36906 ^java.time.temporal.Temporal G__36907] (.isSupportedBy ^java.time.temporal.ChronoUnit G__36906 ^java.time.temporal.Temporal G__36907)))









(defn between ([^java.time.temporal.ChronoUnit G__36908 ^java.time.temporal.Temporal G__36909 ^java.time.temporal.Temporal G__36910] (.between ^java.time.temporal.ChronoUnit G__36908 ^java.time.temporal.Temporal G__36909 ^java.time.temporal.Temporal G__36910)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.ChronoUnit G__36911 ^java.time.temporal.Temporal G__36912 G__36913] (.addTo ^java.time.temporal.ChronoUnit G__36911 ^java.time.temporal.Temporal G__36912 G__36913)))



(defn to-string ^java.lang.String ([^java.time.temporal.ChronoUnit G__36914] (.toString ^java.time.temporal.ChronoUnit G__36914)))





(defn value-of ^java.time.temporal.ChronoUnit ([^java.lang.String G__36916] (. java.time.temporal.ChronoUnit valueOf ^java.lang.String G__36916)))




(defn values ^java.time.temporal.ChronoUnit<> ([] (. java.time.temporal.ChronoUnit values)))



(defn get-duration ^java.time.Duration ([^java.time.temporal.ChronoUnit G__36918] (jti/getter duration ^java.time.temporal.ChronoUnit G__36918)))

