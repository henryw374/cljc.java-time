(ns cljc.java-time.temporal.temporal-adjusters
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAdjusters]]))

(clojure.core/defn next
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "next" day-of-week)))

(clojure.core/defn next-or-same
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "nextOrSame" day-of-week)))

(clojure.core/defn first-day-of-next-month
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "firstDayOfNextMonth")))

(clojure.core/defn first-day-of-month
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "firstDayOfMonth")))

(clojure.core/defn first-day-of-year
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "firstDayOfYear")))

(clojure.core/defn of-date-adjuster
  {:arglists '(["java.util.function.UnaryOperator"])}
  (^js/JSJoda.TemporalAdjuster [^java.util.function.UnaryOperator date-based-adjuster]
   (js-invoke java.time.temporal.TemporalAdjusters "ofDateAdjuster" date-based-adjuster)))

(clojure.core/defn last-day-of-year
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "lastDayOfYear")))

(clojure.core/defn first-in-month
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "firstInMonth" day-of-week)))

(clojure.core/defn previous-or-same
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "previousOrSame" day-of-week)))

(clojure.core/defn previous
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "previous" day-of-week)))

(clojure.core/defn last-day-of-month
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "lastDayOfMonth")))

(clojure.core/defn last-in-month
  {:arglists '(["java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "lastInMonth" day-of-week)))

(clojure.core/defn first-day-of-next-year
  {:arglists '([])}
  (^js/JSJoda.TemporalAdjuster []
   (js-invoke java.time.temporal.TemporalAdjusters "firstDayOfNextYear")))

(clojure.core/defn day-of-week-in-month
  {:arglists '(["int" "java.time.DayOfWeek"])}
  (^js/JSJoda.TemporalAdjuster [^int ordinal ^js/JSJoda.DayOfWeek day-of-week]
   (js-invoke java.time.temporal.TemporalAdjusters "dayOfWeekInMonth" ordinal day-of-week)))
