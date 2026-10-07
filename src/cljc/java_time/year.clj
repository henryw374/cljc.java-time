(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Year)))

(def min-value java.time.Year/MIN_VALUE)

(def max-value java.time.Year/MAX_VALUE)

(defn range
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int"])}
  (^java.time.Year [^java.lang.Integer iso-year]
   (java.time.Year/of iso-year)))

(defn at-day
  {:arglists '(["java.time.Year" "int"])}
  (^java.time.LocalDate [^java.time.Year this ^java.lang.Integer day-of-year]
   (.atDay this day-of-year)))

(defn plus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.Year [^java.time.Year this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn is-valid-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(defn query
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.Year this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn is-leap
  {:arglists '(["long"])}
  (^java.lang.Boolean [^long year]
   (. java.time.Year isLeap year)))

(defn to-string
  {:arglists '(["java.time.Year"])}
  (^java.lang.String [^java.time.Year this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isBefore this other)))

(defn minus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.Year [^java.time.Year this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^java.time.LocalDate [^java.time.Year this ^java.time.MonthDay month-day]
   (.atMonthDay this month-day)))

(defn get-value
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.getValue this)))

(defn get-long
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^long [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn at-month
  {:arglists '(["java.time.Year" "int"] ["java.time.Year" "java.time.Month"])}
  (^java.time.YearMonth [^java.time.Year this arg0]
   (cond (instance? java.lang.Number arg0) (let [month (int arg0)]
                                             (.atMonth this month))
         (instance? java.time.Month arg0) (let [month ^"java.time.Month" arg0]
                                            (.atMonth this month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn until
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Year this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn length
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.length this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.Year [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Year/from temporal)))

(defn is-after
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"]
               ["java.time.Year" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.Year this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  {:arglists '(["java.time.Year" "long"])}
  (^java.time.Year [^java.time.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.Year [^java.lang.CharSequence text]
   (java.time.Year/parse text))
  (^java.time.Year [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.Year/parse text formatter)))

(defn hash-code
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Year this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAdjuster"]
               ["java.time.Year" "java.time.temporal.TemporalField" "long"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.Year []
   (java.time.Year/now))
  (^java.time.Year [arg0]
   (cond (instance? java.time.Clock arg0) (let [clock ^"java.time.Clock" arg0]
                                            (java.time.Year/now clock))
         (instance? java.time.ZoneId arg0) (let [zone ^"java.time.ZoneId" arg0]
                                             (java.time.Year/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn compare-to
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this ^java.time.Year other]
   (.compareTo this other)))

(defn get
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.Year" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Year this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.Year" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.Year this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.Year" "long"])}
  (^java.time.Year [^java.time.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
