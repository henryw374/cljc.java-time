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

(clojure.core/defn range
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.Month/values)))

(clojure.core/defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.Month [^java.lang.String name]
   (java.time.Month/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.Month/valueOf enum-type name)))

(clojure.core/defn of
  {:arglists '(["int"])}
  (^java.time.Month [^java.lang.Integer month]
   (java.time.Month/of month)))

(clojure.core/defn ordinal
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.ordinal this)))

(clojure.core/defn first-month-of-quarter
  {:arglists '(["java.time.Month"])}
  (^java.time.Month [^java.time.Month this]
   (.firstMonthOfQuarter this)))

(clojure.core/defn min-length
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.minLength this)))

(clojure.core/defn plus
  {:arglists '(["java.time.Month" "long"])}
  (^java.time.Month [^java.time.Month this ^long months]
   (.plus this months)))

(clojure.core/defn query
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.Month this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^java.time.Month this]
   (.toString this)))

(clojure.core/defn first-day-of-year
  {:arglists '(["java.time.Month" "boolean"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.firstDayOfYear this leap-year)))

(clojure.core/defn minus
  {:arglists '(["java.time.Month" "long"])}
  (^java.time.Month [^java.time.Month this ^long months]
   (.minus this months)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.Month this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(clojure.core/defn get-value
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.getValue this)))

(clojure.core/defn max-length
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.maxLength this)))

(clojure.core/defn name
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^java.time.Month this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^long [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn length
  {:arglists '(["java.time.Month" "boolean"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean leap-year]
   (.length this leap-year)))

(clojure.core/defn get-declaring-class
  {:arglists '(["java.time.Month"])}
  (^java.lang.Class [^java.time.Month this]
   (.getDeclaringClass this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.Month [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Month/from temporal)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.Month"])}
  (^java.lang.Integer [^java.time.Month this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.Month" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Month this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.Month" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn get
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.Month this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.Month" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Month this ^java.lang.Object other]
   (.equals this other)))
