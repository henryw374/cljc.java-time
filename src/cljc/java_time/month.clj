(ns cljc.java-time.month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Month)))

(def may java.time.Month/MAY)

(def december java.time.Month/DECEMBER)

(def june java.time.Month/JUNE)

(def september java.time.Month/SEPTEMBER)

(def february java.time.Month/FEBRUARY)

(def january java.time.Month/JANUARY)

(def november java.time.Month/NOVEMBER)

(def august java.time.Month/AUGUST)

(def july java.time.Month/JULY)

(def march java.time.Month/MARCH)

(def october java.time.Month/OCTOBER)

(def april java.time.Month/APRIL)

(defn range
  (^java.time.temporal.ValueRange [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn values
  (^"java.lang.Class" []
   (java.time.Month/values)))

(defn value-of
  (^java.time.Month [^java.lang.String name]
   (java.time.Month/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.Month/valueOf enum-type name)))

(defn of
  (^java.time.Month [^java.lang.Integer month]
   (java.time.Month/of month)))

(defn ordinal
  (^java.lang.Integer [^java.time.Month this]
   (.ordinal this)))

(defn first-month-of-quarter
  (^java.time.Month [^java.time.Month this]
   (.firstMonthOfQuarter this)))

(defn min-length
  (^java.lang.Integer [^java.time.Month this]
   (.minLength this)))

(defn plus
  (^java.time.Month [^java.time.Month this ^long months]
   (.plus this months)))

(defn query
  (^java.lang.Object [^java.time.Month this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^java.time.Month this]
   (.toString this)))

(defn first-day-of-year
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.firstDayOfYear this leap-year)))

(defn minus
  (^java.time.Month [^java.time.Month this ^long months]
   (.minus this months)))

(defn get-display-name
  (^java.lang.String [^java.time.Month this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(defn get-value
  (^java.lang.Integer [^java.time.Month this]
   (.getValue this)))

(defn max-length
  (^java.lang.Integer [^java.time.Month this]
   (.maxLength this)))

(defn name
  (^java.lang.String [^java.time.Month this]
   (.name this)))

(defn get-long
  (^long [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn length
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.length this leap-year)))

(defn get-declaring-class
  (^java.lang.Class [^java.time.Month this]
   (.getDeclaringClass this)))

(defn from
  (^java.time.Month [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Month/from temporal)))

(defn is-supported
  (^java.lang.Boolean [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  (^java.lang.Integer [^java.time.Month this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.Month this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn compare-to
  (^java.lang.Integer [^java.time.Month this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get
  (^java.lang.Integer [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.Month this ^java.lang.Object other]
   (.equals this other)))
