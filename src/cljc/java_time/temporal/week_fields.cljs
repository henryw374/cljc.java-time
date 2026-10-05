(ns cljc.java-time.temporal.week-fields
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [WeekFields]]))

(def sunday-start (goog.object/get java.time.temporal.WeekFields "SUNDAY_START"))

(def iso (goog.object/get java.time.temporal.WeekFields "ISO"))

(def week-based-years (goog.object/get java.time.temporal.WeekFields "WEEK_BASED_YEARS"))

(clojure.core/defn day-of-week
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.dayOfWeek this)))

(clojure.core/defn of
  {:arglists (quote (["java.util.Locale"] ["java.time.DayOfWeek" "int"]))}
  (^js/JSJoda.WeekFields [^java.util.Locale arg0]
   (js-invoke java.time.temporal.WeekFields "of" arg0))
  (^js/JSJoda.WeekFields [^js/JSJoda.DayOfWeek arg0 ^int arg1]
   (js-invoke java.time.temporal.WeekFields "of" arg0 arg1)))

(clojure.core/defn get-first-day-of-week
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.WeekFields this]
   (.firstDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^java.lang.String [^js/JSJoda.WeekFields this]
   (.toString this)))

(clojure.core/defn week-based-year
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekBasedYear this)))

(clojure.core/defn week-of-year
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfYear this)))

(clojure.core/defn week-of-week-based-year
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfWeekBasedYear this)))

(clojure.core/defn week-of-month
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfMonth this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^int [^js/JSJoda.WeekFields this]
   (.hashCode this)))

(clojure.core/defn get-minimal-days-in-first-week
  {:arglists (quote (["java.time.temporal.WeekFields"]))}
  (^int [^js/JSJoda.WeekFields this]
   (.minimalDaysInFirstWeek this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.temporal.WeekFields" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.WeekFields this ^java.lang.Object arg0]
   (.equals this arg0)))
