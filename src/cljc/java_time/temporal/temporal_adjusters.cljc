(ns cljc.java-time.temporal.temporal-adjusters (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAdjusters]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAdjusters])))


(defn day-of-week-in-month ^java.time.temporal.TemporalAdjuster ([G__36854 ^java.time.DayOfWeek G__36855] (. java.time.temporal.TemporalAdjusters dayOfWeekInMonth G__36854 ^java.time.DayOfWeek G__36855)))


(defn previous-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36857] (. java.time.temporal.TemporalAdjusters previousOrSame ^java.time.DayOfWeek G__36857)))


(defn last-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36859] (. java.time.temporal.TemporalAdjusters lastInMonth ^java.time.DayOfWeek G__36859)))


(defn first-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfMonth)))


(defn first-day-of-next-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextMonth)))


(defn of-date-adjuster ^java.time.temporal.TemporalAdjuster ([^java.util.function.UnaryOperator G__36863] (. java.time.temporal.TemporalAdjusters ofDateAdjuster ^java.util.function.UnaryOperator G__36863)))








(defn last-day-of-month ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfMonth)))



(defn last-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters lastDayOfYear)))


(defn first-in-month ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36867] (. java.time.temporal.TemporalAdjusters firstInMonth ^java.time.DayOfWeek G__36867)))




(defn next ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36869] (. java.time.temporal.TemporalAdjusters next ^java.time.DayOfWeek G__36869)))


(defn next-or-same ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36871] (. java.time.temporal.TemporalAdjusters nextOrSame ^java.time.DayOfWeek G__36871)))


(defn previous ^java.time.temporal.TemporalAdjuster ([^java.time.DayOfWeek G__36873] (. java.time.temporal.TemporalAdjusters previous ^java.time.DayOfWeek G__36873)))



(defn first-day-of-next-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfNextYear)))





(defn first-day-of-year ^java.time.temporal.TemporalAdjuster ([] (. java.time.temporal.TemporalAdjusters firstDayOfYear)))

