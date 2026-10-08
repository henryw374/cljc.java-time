(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Year]]))

(def min-value (goog.object/get java.time.Year "MIN_VALUE"))

(def max-value (goog.object/get java.time.Year "MAX_VALUE"))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of
  (^js/JSJoda.Year [^int iso-year]
   (js-invoke java.time.Year "of" iso-year)))

(defn at-day
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^int day-of-year]
   (.atDay this day-of-year)))

(defn plus
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-valid-month-day
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(defn query
  (^java.lang.Object [^js/JSJoda.Year this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn is-leap
  (^java.lang.Boolean [^long year]
   (. java.time.Year isLeap year)))

(defn to-string
  (^java.lang.String [^js/JSJoda.Year this]
   (.toString this)))

(defn is-before
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isBefore this other)))

(defn minus
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-month-day
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.atMonthDay this month-day)))

(defn get-value
  (^int [^js/JSJoda.Year this]
   (.value this)))

(defn get-long
  (^long [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn at-month
  {:arglists '(["java.time.Year" "int"] ["java.time.Year" "java.time.Month"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.Year this arg0]
   (.atMonth this arg0)))

(defn until
  (^long [^js/JSJoda.Year this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn length
  (^int [^js/JSJoda.Year this]
   (.length this)))

(defn from
  (^js/JSJoda.Year [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.Year "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"]
               ["java.time.Year" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.Year this arg0]
   (.isSupported this arg0)))

(defn minus-years
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  (^js/JSJoda.Year [^java.lang.CharSequence text]
   (js-invoke java.time.Year "parse" text))
  (^js/JSJoda.Year [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.Year "parse" text formatter)))

(defn hash-code
  (^int [^js/JSJoda.Year this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.Year this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.Year []
   (js-invoke java.time.Year "now"))
  (^js/JSJoda.Year [arg0]
   (js-invoke java.time.Year "now" arg0)))

(defn compare-to
  (^int [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.compareTo this other)))

(defn get
  (^int [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.Year this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.Year this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
