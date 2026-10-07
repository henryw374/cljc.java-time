(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Year]]))

(def min-value (goog.object/get java.time.Year "MIN_VALUE"))

(def max-value (goog.object/get java.time.Year "MAX_VALUE"))

(defn range
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int"])}
  (^js/JSJoda.Year [^int iso-year]
   (js-invoke java.time.Year "of" iso-year)))

(defn at-day
  {:arglists '(["java.time.Year" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^int day-of-year]
   (.atDay this day-of-year)))

(defn plus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-valid-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(defn query
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.Year this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn is-leap
  {:arglists '(["long"])}
  (^java.lang.Boolean [^long year]
   (. java.time.Year isLeap year)))

(defn to-string
  {:arglists '(["java.time.Year"])}
  (^java.lang.String [^js/JSJoda.Year this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isBefore this other)))

(defn minus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.atMonthDay this month-day)))

(defn get-value
  {:arglists '(["java.time.Year"])}
  (^int [^js/JSJoda.Year this]
   (.value this)))

(defn get-long
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn at-month
  {:arglists '(["java.time.Year" "int"] ["java.time.Year" "java.time.Month"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.Year this arg0]
   (.atMonth this arg0)))

(defn until
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.Year this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn length
  {:arglists '(["java.time.Year"])}
  (^int [^js/JSJoda.Year this]
   (.length this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.Year [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.Year "from" temporal)))

(defn is-after
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"]
               ["java.time.Year" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.Year this arg0]
   (.isSupported this arg0)))

(defn minus-years
  {:arglists '(["java.time.Year" "long"])}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.Year [^java.lang.CharSequence text]
   (js-invoke java.time.Year "parse" text))
  (^js/JSJoda.Year [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.Year "parse" text formatter)))

(defn hash-code
  {:arglists '(["java.time.Year"])}
  (^int [^js/JSJoda.Year this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Year this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAdjuster"]
               ["java.time.Year" "java.time.temporal.TemporalField" "long"])}
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
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^int [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.compareTo this other)))

(defn get
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.Year" "java.lang.Object"])}
  (^boolean [^js/JSJoda.Year this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.Year" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.Year this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.Year" "long"])}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
