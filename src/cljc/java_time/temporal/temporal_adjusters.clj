(ns cljc.java-time.temporal.temporal-adjusters
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalAdjusters]))

(clojure.core/defn next
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/next arg0)))

(clojure.core/defn next-or-same
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/nextOrSame arg0)))

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
  (^java.time.temporal.TemporalAdjuster [^java.util.function.UnaryOperator arg0]
   (java.time.temporal.TemporalAdjusters/ofDateAdjuster arg0)))

(clojure.core/defn last-day-of-year
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfYear)))

(clojure.core/defn first-in-month
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/firstInMonth arg0)))

(clojure.core/defn previous-or-same
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/previousOrSame arg0)))

(clojure.core/defn previous
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/previous arg0)))

(clojure.core/defn last-day-of-month
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/lastDayOfMonth)))

(clojure.core/defn last-in-month
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek arg0]
   (java.time.temporal.TemporalAdjusters/lastInMonth arg0)))

(clojure.core/defn first-day-of-next-year
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalAdjuster []
   (java.time.temporal.TemporalAdjusters/firstDayOfNextYear)))

(clojure.core/defn day-of-week-in-month
  {:arglists (quote (["int" "java.time.DayOfWeek"]))}
  (^java.time.temporal.TemporalAdjuster [^java.lang.Integer arg0 ^java.time.DayOfWeek arg1]
   (java.time.temporal.TemporalAdjusters/dayOfWeekInMonth arg0 arg1)))
