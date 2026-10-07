(ns cljc.java-time.month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Month]))

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
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.Month/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.Month [^java.lang.String name]
   (java.time.Month/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.Month/valueOf enum-type name)))

(defn of
  {:arglists '(["int"])}
  (^java.time.Month [^java.lang.Integer month]
   (java.time.Month/of month)))

(defn ordinal
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.ordinal this)))

(defn first-month-of-quarter
  {:arglists '(["java.time.Month"])}
  (^java.time.Month [^java.time.Month this]
   (.firstMonthOfQuarter this)))

(defn min-length
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.minLength this)))

(defn plus
  {:arglists '(["java.time.Month" "long"])}
  (^java.time.Month [^java.time.Month this ^long months]
   (.plus this months)))

(defn query
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.Month this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^java.time.Month this]
   (.toString this)))

(defn first-day-of-year
  {:arglists '(["java.time.Month" "boolean"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.firstDayOfYear this leap-year)))

(defn minus
  {:arglists '(["java.time.Month" "long"])}
  (^java.time.Month [^java.time.Month this ^long months]
   (.minus this months)))

(defn get-display-name
  {:arglists '(["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.Month this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(defn get-value
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.getValue this)))

(defn max-length
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.maxLength this)))

(defn name
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^java.time.Month this]
   (.name this)))

(defn get-long
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^long [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn length
  {:arglists '(["java.time.Month" "boolean"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.length this leap-year)))

(defn get-declaring-class
  {:arglists '(["java.time.Month"])}
  (^java.lang.Class [^java.time.Month this]
   (.getDeclaringClass this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.Month [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Month/from temporal)))

(defn is-supported
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.Month" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Month this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn compare-to
  {:arglists '(["java.time.Month" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.Month" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Month this ^java.lang.Object other]
   (.equals this other)))
