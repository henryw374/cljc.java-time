(ns cljc.java-time.temporal.temporal-adjusters (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAdjusters]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAdjusters])))


(defn day-of-week-in-month ^java.time.temporal.TemporalAdjuster ([G__47490 ^java.time.DayOfWeek G__47491] (. java.time.temporal.TemporalAdjusters dayOfWeekInMonth G__47490 ^java.time.DayOfWeek G__47491)))


(defn previous-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47493] (. java.time.temporal.TemporalAdjusters previousOrSame ^java.time.DayOfWeek G__47493)))


(defn last-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47495] (. java.time.temporal.TemporalAdjusters lastInMonth ^java.time.DayOfWeek G__47495)))


(defn first-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfMonth)))


(defn first-day-of-next-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextMonth)))


(defn of-date-adjuster ^java.time.temporal.TemporalAdjuster ([^java.util.function.UnaryOperator G__47499] (. java.time.temporal.TemporalAdjusters ofDateAdjuster ^java.util.function.UnaryOperator G__47499)))








(defn last-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfMonth)))



(defn last-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfYear)))


(defn first-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47503] (. java.time.temporal.TemporalAdjusters firstInMonth ^java.time.DayOfWeek G__47503)))




(defn next ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47505] (. java.time.temporal.TemporalAdjusters next ^java.time.DayOfWeek G__47505)))


(defn next-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47507] (. java.time.temporal.TemporalAdjusters nextOrSame ^java.time.DayOfWeek G__47507)))


(defn previous ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__47509] (. java.time.temporal.TemporalAdjusters previous ^java.time.DayOfWeek G__47509)))



(defn first-day-of-next-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextYear)))





(defn first-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfYear)))

