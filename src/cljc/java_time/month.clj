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
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.Month this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (java.time.Month/values)))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^java.time.Month [^java.lang.String arg0]
   (java.time.Month/valueOf arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (java.time.Month/valueOf arg0 arg1)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^java.time.Month [^java.lang.Integer arg0]
   (java.time.Month/of arg0)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Integer [^java.time.Month this]
   (.ordinal this)))

(clojure.core/defn first-month-of-quarter
  {:arglists (quote (["java.time.Month"]))}
  (^java.time.Month [^java.time.Month this]
   (.firstMonthOfQuarter this)))

(clojure.core/defn min-length
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Integer [^java.time.Month this]
   (.minLength this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Month" "long"]))}
  (^java.time.Month [^java.time.Month this ^long arg0]
   (.plus this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.Month this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.String [^java.time.Month this]
   (.toString this)))

(clojure.core/defn first-day-of-year
  {:arglists (quote (["java.time.Month" "boolean"]))}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean arg0]
   (.firstDayOfYear this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Month" "long"]))}
  (^java.time.Month [^java.time.Month this ^long arg0]
   (.minus this arg0)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^java.time.Month this ^java.time.format.TextStyle arg0 ^java.util.Locale arg1]
   (.getDisplayName this arg0 arg1)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Integer [^java.time.Month this]
   (.getValue this)))

(clojure.core/defn max-length
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Integer [^java.time.Month this]
   (.maxLength this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.String [^java.time.Month this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.Month this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn length
  {:arglists (quote (["java.time.Month" "boolean"]))}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Boolean arg0]
   (.length this arg0)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Class [^java.time.Month this]
   (.getDeclaringClass this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.Month [^java.time.temporal.TemporalAccessor arg0]
   (java.time.Month/from arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.Month this ^java.time.temporal.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Integer [^java.time.Month this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Month this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Month" "java.lang.Enum"]))}
  (^java.lang.Integer [^java.time.Month this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.Month this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Month" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Month this ^java.lang.Object arg0]
   (.equals this arg0)))
