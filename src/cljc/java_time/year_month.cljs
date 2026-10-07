(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [YearMonth]]))

(defn length-of-year
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfYear this)))

(defn range
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn is-valid-day
  {:arglists '(["java.time.YearMonth" "int"])}
  (^boolean [^js/JSJoda.YearMonth this ^int day-of-month]
   (.isValidDay this day-of-month)))

(defn of
  {:arglists '(["int" "int"] ["int" "java.time.Month"])}
  (^js/JSJoda.YearMonth [arg0 arg1]
   (js-invoke java.time.YearMonth "of" arg0 arg1)))

(defn with-month
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int month]
   (.withMonth this month)))

(defn at-day
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this ^int day-of-month]
   (.atDay this day-of-month)))

(defn get-year
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.year this)))

(defn plus
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
               ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  {:arglists '(["java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this]
   (.isLeapYear this)))

(defn query
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.YearMonth"])}
  (^java.lang.String [^js/JSJoda.YearMonth this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
               ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn get-long
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int year]
   (.withYear this year)))

(defn at-end-of-month
  {:arglists '(["java.time.YearMonth"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this]
   (.atEndOfMonth this)))

(defn length-of-month
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfMonth this)))

(defn until
  {:arglists '(["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.YearMonth "from" temporal)))

(defn is-after
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"]
               ["java.time.YearMonth" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.YearMonth this arg0]
   (.isSupported this arg0)))

(defn minus-years
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text]
   (js-invoke java.time.YearMonth "parse" text))
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.YearMonth "parse" text formatter)))

(defn hash-code
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.YearMonth" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]
               ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"])}
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
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.monthValue this)))

(defn compare-to
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.YearMonth"])}
  (^js/JSJoda.Month [^js/JSJoda.YearMonth this]
   (.month this)))

(defn get
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.YearMonth" "java.lang.Object"])}
  (^boolean [^js/JSJoda.YearMonth this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.YearMonth" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.YearMonth this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-add]
   (.plusYears this years-to-add)))
