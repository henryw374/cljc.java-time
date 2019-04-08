(ns cljc.java-time.temporal.temporal-adjusters (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.temporal :refer [TemporalAdjusters]])) #? (:clj (:import [java.time.temporal TemporalAdjusters])))


(defn day-of-week-in-month ^java.time.temporal.TemporalAdjuster ([G__27120 ^java.time.DayOfWeek G__27121] (. java.time.temporal.TemporalAdjusters dayOfWeekInMonth G__27120 ^java.time.DayOfWeek G__27121)))


(defn previous-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27123] (. java.time.temporal.TemporalAdjusters previousOrSame ^java.time.DayOfWeek G__27123)))


(defn last-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27125] (. java.time.temporal.TemporalAdjusters lastInMonth ^java.time.DayOfWeek G__27125)))


(defn first-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfMonth)))


(defn first-day-of-next-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextMonth)))


(defn of-date-adjuster ^java.time.temporal.TemporalAdjuster ([^java.util.function.UnaryOperator G__27129] (. java.time.temporal.TemporalAdjusters ofDateAdjuster ^java.util.function.UnaryOperator G__27129)))








(defn last-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfMonth)))



(defn last-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfYear)))


(defn first-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27133] (. java.time.temporal.TemporalAdjusters firstInMonth ^java.time.DayOfWeek G__27133)))




(defn next ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27135] (. java.time.temporal.TemporalAdjusters next ^java.time.DayOfWeek G__27135)))


(defn next-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27137] (. java.time.temporal.TemporalAdjusters nextOrSame ^java.time.DayOfWeek G__27137)))


(defn previous ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__27139] (. java.time.temporal.TemporalAdjusters previous ^java.time.DayOfWeek G__27139)))



(defn first-day-of-next-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextYear)))





(defn first-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfYear)))

