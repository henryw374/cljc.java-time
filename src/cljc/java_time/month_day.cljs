(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [MonthDay]]))

(defn at-year
  (^js/JSJoda.LocalDate [^js/JSJoda.MonthDay this ^int year]
   (.atYear this year)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int" "int"] ["java.time.Month" "int"])}
  (^js/JSJoda.MonthDay [arg0 arg1]
   (js-invoke java.time.MonthDay "of" arg0 arg1)))

(defn with-month
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int month]
   (.withMonth this month)))

(defn query
  (^java.lang.Object [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^js/JSJoda.MonthDay this]
   (.toString this)))

(defn is-before
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isBefore this other)))

(defn get-long
  (^long [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-day-of-month
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^int [^js/JSJoda.MonthDay this]
   (.dayOfMonth this)))

(defn from
  (^js/JSJoda.MonthDay [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.MonthDay "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isAfter this other)))

(defn is-supported
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn parse
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text]
   (js-invoke java.time.MonthDay "parse" text))
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.MonthDay "parse" text formatter)))

(defn is-valid-year
  (^boolean [^js/JSJoda.MonthDay this ^int year]
   (.isValidYear this year)))

(defn hash-code
  (^int [^js/JSJoda.MonthDay this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.MonthDay this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^js/JSJoda.Month month]
   (.with this month)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.MonthDay []
   (js-invoke java.time.MonthDay "now"))
  (^js/JSJoda.MonthDay [arg0]
   (js-invoke java.time.MonthDay "now" arg0)))

(defn get-month-value
  (^int [^js/JSJoda.MonthDay this]
   (.monthValue this)))

(defn compare-to
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.compareTo this other)))

(defn get-month
  (^js/JSJoda.Month [^js/JSJoda.MonthDay this]
   (.month this)))

(defn get
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.MonthDay this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
