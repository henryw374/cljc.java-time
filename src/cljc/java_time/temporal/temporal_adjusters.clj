(ns cljc.java-time.temporal.temporal-adjusters
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalAdjusters)))

(defn next
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/next day-of-week)))

(defn next-or-same
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/nextOrSame day-of-week)))

(defn first-day-of-next-month
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfNextMonth)))

(defn first-day-of-month
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfMonth)))

(defn first-day-of-year
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfYear)))

(defn of-date-adjuster
  {:arglists '(["java.util.function.UnaryOperator"])}
  (^java.time.temporal.TemporalAdjuster [^java.util.function.UnaryOperator date-based-adjuster]
   (java.time.temporal.TemporalAdjusters/ofDateAdjuster date-based-adjuster)))

(defn last-day-of-year
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfYear)))

(defn first-in-month
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/firstInMonth day-of-week)))

(defn previous-or-same
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/previousOrSame day-of-week)))

(defn previous
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/previous day-of-week)))

(defn last-day-of-month
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfMonth)))

(defn last-in-month
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/lastInMonth day-of-week)))

(defn first-day-of-next-year
  {:arglists '([])}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfNextYear)))

(defn day-of-week-in-month
  {:arglists '(["int" "java.time.DayOfWeek"])}
  (^java.time.temporal.TemporalAdjuster [^java.lang.Integer ordinal ^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/dayOfWeekInMonth ordinal day-of-week)))
