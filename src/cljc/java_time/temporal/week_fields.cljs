(ns cljc.java-time.temporal.week-fields
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [WeekFields]]))

(def sunday-start (goog.object/get java.time.temporal.WeekFields "SUNDAY_START"))

(def iso (goog.object/get java.time.temporal.WeekFields "ISO"))

(def week-based-years (goog.object/get java.time.temporal.WeekFields "WEEK_BASED_YEARS"))

(defn day-of-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.dayOfWeek this)))

(defn of
  {:arglists '(["java.util.Locale"] ["java.time.DayOfWeek" "int"])}
  (^js/JSJoda.WeekFields [^java.util.Locale locale]
   (js-invoke java.time.temporal.WeekFields "of" locale))
  (^js/JSJoda.WeekFields [^js/JSJoda.DayOfWeek first-day-of-week ^int minimal-days-in-first-week]
   (js-invoke java.time.temporal.WeekFields "of" first-day-of-week minimal-days-in-first-week)))

(defn get-first-day-of-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.WeekFields this]
   (.firstDayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.lang.String [^js/JSJoda.WeekFields this]
   (.toString this)))

(defn week-based-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekBasedYear this)))

(defn week-of-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfYear this)))

(defn week-of-week-based-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfWeekBasedYear this)))

(defn week-of-month
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^js/JSJoda.TemporalField [^js/JSJoda.WeekFields this]
   (.weekOfMonth this)))

(defn hash-code
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^int [^js/JSJoda.WeekFields this]
   (.hashCode this)))

(defn get-minimal-days-in-first-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^int [^js/JSJoda.WeekFields this]
   (.minimalDaysInFirstWeek this)))

(defn equals
  {:arglists '(["java.time.temporal.WeekFields" "java.lang.Object"])}
  (^boolean [^js/JSJoda.WeekFields this ^java.lang.Object object]
   (.equals this object)))
