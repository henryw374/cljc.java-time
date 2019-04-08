(ns cljc.java-time.temporal.temporal-adjusters (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.temporal :refer [TemporalAdjusters]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAdjusters])))


(defn day-of-week-in-month ^java.time.temporal.TemporalAdjuster ([G__35364 ^java.time.DayOfWeek G__35365] (. java.time.temporal.TemporalAdjusters dayOfWeekInMonth G__35364 ^java.time.DayOfWeek G__35365)))


(defn previous-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35367] (. java.time.temporal.TemporalAdjusters previousOrSame ^java.time.DayOfWeek G__35367)))


(defn last-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35369] (. java.time.temporal.TemporalAdjusters lastInMonth ^java.time.DayOfWeek G__35369)))


(defn first-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfMonth)))


(defn first-day-of-next-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextMonth)))


(defn of-date-adjuster ^java.time.temporal.TemporalAdjuster ([^java.util.function.UnaryOperator G__35373] (. java.time.temporal.TemporalAdjusters ofDateAdjuster ^java.util.function.UnaryOperator G__35373)))








(defn last-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfMonth)))



(defn last-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfYear)))


(defn first-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35377] (. java.time.temporal.TemporalAdjusters firstInMonth ^java.time.DayOfWeek G__35377)))




(defn next ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35379] (. java.time.temporal.TemporalAdjusters next ^java.time.DayOfWeek G__35379)))


(defn next-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35381] (. java.time.temporal.TemporalAdjusters nextOrSame ^java.time.DayOfWeek G__35381)))


(defn previous ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__35383] (. java.time.temporal.TemporalAdjusters previous ^java.time.DayOfWeek G__35383)))



(defn first-day-of-next-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextYear)))





(defn first-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfYear)))

