(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [YearMonth]]))

(defn length-of-year
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfYear this)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn is-valid-day
  (^boolean [^js/JSJoda.YearMonth this ^int day-of-month]
   (.isValidDay this day-of-month)))

(defn of
  {:arglists '(["int" "int"] ["int" "java.time.Month"])}
  (^js/JSJoda.YearMonth [arg0 arg1]
   (js-invoke java.time.YearMonth "of" arg0 arg1)))

(defn with-month
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int month]
   (.withMonth this month)))

(defn at-day
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this ^int day-of-month]
   (.atDay this day-of-month)))

(defn get-year
  (^int [^js/JSJoda.YearMonth this]
   (.year this)))

(defn plus
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  (^boolean [^js/JSJoda.YearMonth this]
   (.isLeapYear this)))

(defn query
  (^java.lang.Object [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^js/JSJoda.YearMonth this]
   (.toString this)))

(defn plus-months
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isBefore this other)))

(defn minus-months
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn get-long
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int year]
   (.withYear this year)))

(defn at-end-of-month
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this]
   (.atEndOfMonth this)))

(defn length-of-month
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfMonth this)))

(defn until
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn from
  (^js/JSJoda.YearMonth [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.YearMonth "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"]
               ["java.time.YearMonth" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.YearMonth this arg0]
   (.isSupported this arg0)))

(defn minus-years
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text]
   (js-invoke java.time.YearMonth "parse" text))
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.YearMonth "parse" text formatter)))

(defn hash-code
  (^int [^js/JSJoda.YearMonth this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.YearMonth []
   (js-invoke java.time.YearMonth "now"))
  (^js/JSJoda.YearMonth [arg0]
   (js-invoke java.time.YearMonth "now" arg0)))

(defn get-month-value
  (^int [^js/JSJoda.YearMonth this]
   (.monthValue this)))

(defn compare-to
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.compareTo this other)))

(defn get-month
  (^js/JSJoda.Month [^js/JSJoda.YearMonth this]
   (.month this)))

(defn get
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.YearMonth this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.YearMonth this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-add]
   (.plusYears this years-to-add)))
