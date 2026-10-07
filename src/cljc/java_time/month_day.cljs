(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [MonthDay]]))

(defn at-year
  {:arglists '(["java.time.MonthDay" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.MonthDay this ^int year]
   (.atYear this year)))

(defn range
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int" "int"] ["java.time.Month" "int"])}
  (^js/JSJoda.MonthDay [arg0 arg1]
   (js-invoke java.time.MonthDay "of" arg0 arg1)))

(defn with-month
  {:arglists '(["java.time.MonthDay" "int"])}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int month]
   (.withMonth this month)))

(defn query
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.MonthDay"])}
  (^java.lang.String [^js/JSJoda.MonthDay this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isBefore this other)))

(defn get-long
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-day-of-month
  {:arglists '(["java.time.MonthDay" "int"])}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.MonthDay"])}
  (^int [^js/JSJoda.MonthDay this]
   (.dayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.MonthDay [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.MonthDay "from" temporal)))

(defn is-after
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text]
   (js-invoke java.time.MonthDay "parse" text))
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.MonthDay "parse" text formatter)))

(defn is-valid-year
  {:arglists '(["java.time.MonthDay" "int"])}
  (^boolean [^js/JSJoda.MonthDay this ^int year]
   (.isValidYear this year)))

(defn hash-code
  {:arglists '(["java.time.MonthDay"])}
  (^int [^js/JSJoda.MonthDay this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.MonthDay" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.MonthDay this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.MonthDay" "java.time.Month"])}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^js/JSJoda.Month month]
   (.with this month)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.MonthDay []
   (js-invoke java.time.MonthDay "now"))
  (^js/JSJoda.MonthDay [arg0]
   (js-invoke java.time.MonthDay "now" arg0)))

(defn get-month-value
  {:arglists '(["java.time.MonthDay"])}
  (^int [^js/JSJoda.MonthDay this]
   (.monthValue this)))

(defn compare-to
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.MonthDay"])}
  (^js/JSJoda.Month [^js/JSJoda.MonthDay this]
   (.month this)))

(defn get
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.MonthDay" "java.lang.Object"])}
  (^boolean [^js/JSJoda.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.MonthDay" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.MonthDay this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
