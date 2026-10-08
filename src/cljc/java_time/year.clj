(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Year)))

(def min-value java.time.Year/MIN_VALUE)

(def max-value java.time.Year/MAX_VALUE)

(defn range
  (^java.time.temporal.ValueRange [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn of
  (^java.time.Year [^java.lang.Integer iso-year]
   (java.time.Year/of iso-year)))

(defn at-day
  (^java.time.LocalDate [^java.time.Year this ^java.lang.Integer day-of-year]
   (.atDay this day-of-year)))

(defn plus
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.Year [^java.time.Year this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn is-valid-month-day
  (^java.lang.Boolean [^java.time.Year this ^java.time.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(defn query
  (^java.lang.Object [^java.time.Year this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn is-leap
  (^java.lang.Boolean [^long year]
   (. java.time.Year isLeap year)))

(defn to-string
  (^java.lang.String [^java.time.Year this]
   (.toString this)))

(defn is-before
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isBefore this other)))

(defn minus
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.Year [^java.time.Year this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-month-day
  (^java.time.LocalDate [^java.time.Year this ^java.time.MonthDay month-day]
   (.atMonthDay this month-day)))

(defn get-value
  (^java.lang.Integer [^java.time.Year this]
   (.getValue this)))

(defn get-long
  (^long [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn at-month
  {:arglists '(["java.time.Year" "int"] ["java.time.Year" "java.time.Month"])}
  (^java.time.YearMonth [^java.time.Year this arg0]
   (cond (instance? java.lang.Number arg0) (let [month (int arg0)]
                                             (.atMonth this month))
         (instance? java.time.Month arg0) (let [^java.time.Month month arg0]
                                            (.atMonth this month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn until
  (^long [^java.time.Year this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn length
  (^java.lang.Integer [^java.time.Year this]
   (.length this)))

(defn from
  (^java.time.Year [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Year/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"]
               ["java.time.Year" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.Year this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  (^java.time.Year [^java.time.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  (^java.time.Year [^java.lang.CharSequence text]
   (java.time.Year/parse text))
  (^java.time.Year [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.Year/parse text formatter)))

(defn hash-code
  (^java.lang.Integer [^java.time.Year this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.Year this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.Year []
   (java.time.Year/now))
  (^java.time.Year [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.Year/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.Year/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn compare-to
  (^java.lang.Integer [^java.time.Year this ^java.time.Year other]
   (.compareTo this other)))

(defn get
  (^java.lang.Integer [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.Year this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.Year this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^java.time.Year [^java.time.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
