(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time MonthDay)))

(defn at-year
  (^java.time.LocalDate [^java.time.MonthDay this ^java.lang.Integer year]
   (.atYear this year)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int" "int"] ["java.time.Month" "int"])}
  (^java.time.MonthDay [arg0 arg1]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1))
           (let [month (int arg0)
                 day-of-month (int arg1)]
             (java.time.MonthDay/of month day-of-month))
         (and (instance? java.time.Month arg0)
              (instance? java.lang.Number arg1))
           (let [^java.time.Month month arg0
                 day-of-month (int arg1)]
             (java.time.MonthDay/of month day-of-month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer month]
   (.withMonth this month)))

(defn query
  (^java.lang.Object [^java.time.MonthDay this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^java.time.MonthDay this]
   (.toString this)))

(defn is-before
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isBefore this other)))

(defn get-long
  (^long [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-day-of-month
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getDayOfMonth this)))

(defn from
  (^java.time.MonthDay [^java.time.temporal.TemporalAccessor temporal]
   (java.time.MonthDay/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isAfter this other)))

(defn is-supported
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn parse
  (^java.time.MonthDay [^java.lang.CharSequence text]
   (java.time.MonthDay/parse text))
  (^java.time.MonthDay [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.MonthDay/parse text formatter)))

(defn is-valid-year
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Integer year]
   (.isValidYear this year)))

(defn hash-code
  (^java.lang.Integer [^java.time.MonthDay this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.MonthDay this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.MonthDay [^java.time.MonthDay this ^java.time.Month month]
   (.with this month)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.MonthDay []
   (java.time.MonthDay/now))
  (^java.time.MonthDay [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.MonthDay/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.MonthDay/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn get-month-value
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getMonthValue this)))

(defn compare-to
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.MonthDay other]
   (.compareTo this other)))

(defn get-month
  (^java.time.Month [^java.time.MonthDay this]
   (.getMonth this)))

(defn get
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.MonthDay this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
