(ns cljc.java-time.temporal.week-fields
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal WeekFields]))

(def sunday-start java.time.temporal.WeekFields/SUNDAY_START)

(def iso java.time.temporal.WeekFields/ISO)

(def week-based-years java.time.temporal.WeekFields/WEEK_BASED_YEARS)

(clojure.core/defn day-of-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.temporal.TemporalField [^java.time.temporal.WeekFields this]
   (.dayOfWeek this)))

(clojure.core/defn of
  {:arglists '(["java.util.Locale"] ["java.time.DayOfWeek" "int"])}
  (^java.time.temporal.WeekFields [^java.util.Locale locale]
   (java.time.temporal.WeekFields/of locale))
  (^java.time.temporal.WeekFields [^java.time.DayOfWeek first-day-of-week ^java.lang.Integer minimal-days-in-first-week]
   (java.time.temporal.WeekFields/of first-day-of-week minimal-days-in-first-week)))

(clojure.core/defn get-first-day-of-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.DayOfWeek [^java.time.temporal.WeekFields this]
   (.getFirstDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.lang.String [^java.time.temporal.WeekFields this]
   (.toString this)))

(clojure.core/defn week-based-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.temporal.TemporalField [^java.time.temporal.WeekFields this]
   (.weekBasedYear this)))

(clojure.core/defn week-of-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.temporal.TemporalField [^java.time.temporal.WeekFields this]
   (.weekOfYear this)))

(clojure.core/defn week-of-week-based-year
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.temporal.TemporalField [^java.time.temporal.WeekFields this]
   (.weekOfWeekBasedYear this)))

(clojure.core/defn week-of-month
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.time.temporal.TemporalField [^java.time.temporal.WeekFields this]
   (.weekOfMonth this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.lang.Integer [^java.time.temporal.WeekFields this]
   (.hashCode this)))

(clojure.core/defn get-minimal-days-in-first-week
  {:arglists '(["java.time.temporal.WeekFields"])}
  (^java.lang.Integer [^java.time.temporal.WeekFields this]
   (.getMinimalDaysInFirstWeek this)))

(clojure.core/defn equals
  {:arglists '(["java.time.temporal.WeekFields" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.temporal.WeekFields this ^java.lang.Object object]
   (.equals this object)))
