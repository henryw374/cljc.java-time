(ns cljc.java-time.day-of-week (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [DayOfWeek]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time DayOfWeek])))
(def saturday (. java.time.DayOfWeek -SATURDAY))
(def thursday (. java.time.DayOfWeek -THURSDAY))
(def friday (. java.time.DayOfWeek -FRIDAY))
(def wednesday (. java.time.DayOfWeek -WEDNESDAY))
(def sunday (. java.time.DayOfWeek -SUNDAY))
(def monday (. java.time.DayOfWeek -MONDAY))
(def tuesday (. java.time.DayOfWeek -TUESDAY))

(defn is-supported ([^java.time.DayOfWeek G__56146 ^java.time.temporal.TemporalField G__56147] (.isSupported ^java.time.DayOfWeek G__56146 ^java.time.temporal.TemporalField G__56147)))



(defn query ^java.lang.Object ([^java.time.DayOfWeek G__56148 ^java.time.temporal.TemporalQuery G__56149] (.query ^java.time.DayOfWeek G__56148 ^java.time.temporal.TemporalQuery G__56149)))


(defn get-display-name ^java.lang.String ([^java.time.DayOfWeek G__56150 ^java.time.format.TextStyle G__56151 ^java.util.Locale G__56152] (jti/getter displayName ^java.time.DayOfWeek G__56150 ^java.time.format.TextStyle G__56151 ^java.util.Locale G__56152)))


(defn of ^java.time.DayOfWeek ([G__56154] (. java.time.DayOfWeek of G__56154)))


(defn range ^java.time.temporal.ValueRange ([^java.time.DayOfWeek G__56155 ^java.time.temporal.TemporalField G__56156] (.range ^java.time.DayOfWeek G__56155 ^java.time.temporal.TemporalField G__56156)))





(defn get ([^java.time.DayOfWeek G__56157 ^java.time.temporal.TemporalField G__56158] (.get ^java.time.DayOfWeek G__56157 ^java.time.temporal.TemporalField G__56158)))


(defn get-value ([^java.time.DayOfWeek G__56159] (jti/getter value ^java.time.DayOfWeek G__56159)))




(defn adjust-into ^java.time.temporal.Temporal ([^java.time.DayOfWeek G__56160 ^java.time.temporal.Temporal G__56161] (.adjustInto ^java.time.DayOfWeek G__56160 ^java.time.temporal.Temporal G__56161)))


(defn minus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__56162 G__56163] (.minus ^java.time.DayOfWeek G__56162 G__56163)))



(defn value-of ^java.time.DayOfWeek ([^java.lang.String G__56165] (. java.time.DayOfWeek valueOf ^java.lang.String G__56165)))



(defn get-long ([^java.time.DayOfWeek G__56166 ^java.time.temporal.TemporalField G__56167] (.getLong ^java.time.DayOfWeek G__56166 ^java.time.temporal.TemporalField G__56167)))


(defn values ^java.time.DayOfWeek ([] (. java.time.DayOfWeek values)))


(defn from ^java.time.DayOfWeek ([^java.time.temporal.TemporalAccessor G__56170] (. java.time.DayOfWeek from ^java.time.temporal.TemporalAccessor G__56170)))



(defn plus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__56171 G__56172] (.plus ^java.time.DayOfWeek G__56171 G__56172)))


