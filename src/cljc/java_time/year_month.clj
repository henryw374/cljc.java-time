(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time YearMonth)))

(defn length-of-year
  (^java.lang.Integer [^java.time.YearMonth this]
   (.lengthOfYear this)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn is-valid-day
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Integer day-of-month]
   (.isValidDay this day-of-month)))

(defn of
  {:arglists '(["int" "int"] ["int" "java.time.Month"])}
  (^java.time.YearMonth [arg0 arg1]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1))
           (let [year (int arg0)
                 month (int arg1)]
             (java.time.YearMonth/of year month))
         (and (instance? java.lang.Number arg0)
              (instance? java.time.Month arg1))
           (let [year (int arg0)
                 ^java.time.Month month arg1]
             (java.time.YearMonth/of year month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer month]
   (.withMonth this month)))

(defn at-day
  (^java.time.LocalDate [^java.time.YearMonth this ^java.lang.Integer day-of-month]
   (.atDay this day-of-month)))

(defn get-year
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getYear this)))

(defn plus
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.YearMonth [^java.time.YearMonth this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  (^java.lang.Boolean [^java.time.YearMonth this]
   (.isLeapYear this)))

(defn query
  (^java.lang.Object [^java.time.YearMonth this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^java.time.YearMonth this]
   (.toString this)))

(defn plus-months
  (^java.time.YearMonth [^java.time.YearMonth this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth other]
   (.isBefore this other)))

(defn minus-months
  (^java.time.YearMonth [^java.time.YearMonth this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.YearMonth [^java.time.YearMonth this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn get-long
  (^long [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-year
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer year]
   (.withYear this year)))

(defn at-end-of-month
  (^java.time.LocalDate [^java.time.YearMonth this]
   (.atEndOfMonth this)))

(defn length-of-month
  (^java.lang.Integer [^java.time.YearMonth this]
   (.lengthOfMonth this)))

(defn until
  (^long [^java.time.YearMonth this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn from
  (^java.time.YearMonth [^java.time.temporal.TemporalAccessor temporal]
   (java.time.YearMonth/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"]
               ["java.time.YearMonth" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.YearMonth this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  (^java.time.YearMonth [^java.time.YearMonth this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  (^java.time.YearMonth [^java.lang.CharSequence text]
   (java.time.YearMonth/parse text))
  (^java.time.YearMonth [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.YearMonth/parse text formatter)))

(defn hash-code
  (^java.lang.Integer [^java.time.YearMonth this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.YearMonth this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.YearMonth []
   (java.time.YearMonth/now))
  (^java.time.YearMonth [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.YearMonth/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.YearMonth/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn get-month-value
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getMonthValue this)))

(defn compare-to
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.YearMonth other]
   (.compareTo this other)))

(defn get-month
  (^java.time.Month [^java.time.YearMonth this]
   (.getMonth this)))

(defn get
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.YearMonth this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^java.time.YearMonth [^java.time.YearMonth this ^long years-to-add]
   (.plusYears this years-to-add)))
