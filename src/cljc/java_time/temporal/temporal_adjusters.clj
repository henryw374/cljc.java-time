(ns cljc.java-time.temporal.temporal-adjusters
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalAdjusters]))

(clojure.core/defn next
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/next day-of-week)))

(clojure.core/defn next-or-same
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/nextOrSame day-of-week)))

(clojure.core/defn first-day-of-next-month
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfNextMonth)))

(clojure.core/defn first-day-of-month
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfMonth)))

(clojure.core/defn first-day-of-year
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfYear)))

(clojure.core/defn of-date-adjuster
  {:arglists (quote (["java.util.function.UnaryOperator"]))}
  (^java.time.temporal.TemporalAdjuster [^java.util.function.UnaryOperator date-based-adjuster]
   (java.time.temporal.TemporalAdjusters/ofDateAdjuster date-based-adjuster)))

(clojure.core/defn last-day-of-year
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfYear)))

(clojure.core/defn first-in-month
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/firstInMonth day-of-week)))

(clojure.core/defn previous-or-same
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/previousOrSame day-of-week)))

(clojure.core/defn previous
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/previous day-of-week)))

(clojure.core/defn last-day-of-month
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfMonth)))

(clojure.core/defn last-in-month
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/lastInMonth day-of-week)))

(clojure.core/defn first-day-of-next-year
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfNextYear)))

(clojure.core/defn day-of-week-in-month
  {:arglists (quote (["int" "java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.lang.Integer ordinal ^java.time.DayOfWeek day-of-week]
   (java.time.temporal.TemporalAdjusters/dayOfWeekInMonth ordinal day-of-week)))
