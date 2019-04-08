(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.temporal :refer [ChronoUnit]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal ChronoUnit])))

(defn is-time-based ([^java.time.temporal.ChronoUnit G__35413] (.isTimeBased ^java.time.temporal.ChronoUnit G__35413)))



(defn is-date-based ([^java.time.temporal.ChronoUnit G__35414] (.isDateBased ^java.time.temporal.ChronoUnit G__35414)))


(defn is-duration-estimated ([^java.time.temporal.ChronoUnit G__35415] (.isDurationEstimated ^java.time.temporal.ChronoUnit G__35415)))







(defn is-supported-by ([^java.time.temporal.ChronoUnit G__35416 ^java.time.temporal.Temporal G__35417] (.isSupportedBy ^java.time.temporal.ChronoUnit G__35416 ^java.time.temporal.Temporal G__35417)))









(defn between ([^java.time.temporal.ChronoUnit G__35418 ^java.time.temporal.Temporal G__35419 ^java.time.temporal.Temporal G__35420] (.between ^java.time.temporal.ChronoUnit G__35418 ^java.time.temporal.Temporal G__35419 ^java.time.temporal.Temporal G__35420)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.ChronoUnit G__35421 ^java.time.temporal.Temporal G__35422 G__35423] (.addTo ^java.time.temporal.ChronoUnit G__35421 ^java.time.temporal.Temporal G__35422 G__35423)))



(defn to-string ^java.lang.String ([^java.time.temporal.ChronoUnit G__35424] (.toString ^java.time.temporal.ChronoUnit G__35424)))





(defn value-of ^java.time.temporal.ChronoUnit ([^java.lang.String G__35426] (. java.time.temporal.ChronoUnit valueOf ^java.lang.String G__35426)))




(defn values ^java.time.temporal.ChronoUnit<> ([] (. java.time.temporal.ChronoUnit values)))



(defn get-duration ^java.time.Duration ([^java.time.temporal.ChronoUnit G__35428] (jti/getter duration ^java.time.temporal.ChronoUnit G__35428)))

