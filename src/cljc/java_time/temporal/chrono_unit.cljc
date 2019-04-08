(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.temporal :refer [ChronoUnit]])) #? (:clj (:import [java.time.temporal ChronoUnit])))

(defn is-time-based ([^java.time.temporal.ChronoUnit G__27169] (.isTimeBased ^java.time.temporal.ChronoUnit G__27169)))



(defn is-date-based ([^java.time.temporal.ChronoUnit G__27170] (.isDateBased ^java.time.temporal.ChronoUnit G__27170)))


(defn is-duration-estimated ([^java.time.temporal.ChronoUnit G__27171] (.isDurationEstimated ^java.time.temporal.ChronoUnit G__27171)))







(defn is-supported-by ([^java.time.temporal.ChronoUnit G__27172 ^java.time.temporal.Temporal G__27173] (.isSupportedBy ^java.time.temporal.ChronoUnit G__27172 ^java.time.temporal.Temporal G__27173)))









(defn between ([^java.time.temporal.ChronoUnit G__27174 ^java.time.temporal.Temporal G__27175 ^java.time.temporal.Temporal G__27176] (.between ^java.time.temporal.ChronoUnit G__27174 ^java.time.temporal.Temporal G__27175 ^java.time.temporal.Temporal G__27176)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.ChronoUnit G__27177 ^java.time.temporal.Temporal G__27178 G__27179] (.addTo ^java.time.temporal.ChronoUnit G__27177 ^java.time.temporal.Temporal G__27178 G__27179)))



(defn to-string ^java.lang.String ([^java.time.temporal.ChronoUnit G__27180] (.toString ^java.time.temporal.ChronoUnit G__27180)))





(defn value-of ^java.time.temporal.ChronoUnit ([^java.lang.String G__27182] (. java.time.temporal.ChronoUnit valueOf ^java.lang.String G__27182)))




(defn values ^java.time.temporal.ChronoUnit<> ([] (. java.time.temporal.ChronoUnit values)))



(defn get-duration ^java.time.Duration ([^java.time.temporal.ChronoUnit G__27184] (jti/getter duration ^java.time.temporal.ChronoUnit G__27184)))

