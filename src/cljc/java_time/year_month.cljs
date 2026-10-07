(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [YearMonth]]))

(clojure.core/defn length-of-year
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn is-valid-day
  {:arglists '(["java.time.YearMonth" "int"])}
  (^boolean [^js/JSJoda.YearMonth this ^int day-of-month]
   (.isValidDay this day-of-month)))

(clojure.core/defn of
  {:arglists '(["int" "int"] ["int" "java.time.Month"])}
  (^js/JSJoda.YearMonth [arg0 arg1]
   (js-invoke java.time.YearMonth "of" arg0 arg1)))

(clojure.core/defn with-month
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int month]
   (.withMonth this month)))

(clojure.core/defn at-day
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this ^int day-of-month]
   (.atDay this day-of-month)))

(clojure.core/defn get-year
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.year this)))

(clojure.core/defn plus
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
               ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn is-leap-year
  {:arglists '(["java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.YearMonth"])}
  (^java.lang.String [^js/JSJoda.YearMonth this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-add]
   (.plusMonths this months-to-add)))

(clojure.core/defn is-before
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(clojure.core/defn minus
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
               ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn get-long
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-year
  {:arglists '(["java.time.YearMonth" "int"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int year]
   (.withYear this year)))

(clojure.core/defn at-end-of-month
  {:arglists '(["java.time.YearMonth"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this]
   (.atEndOfMonth this)))

(clojure.core/defn length-of-month
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists '(["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.YearMonth "from" temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"]
               ["java.time.YearMonth" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.YearMonth this arg0)))

(clojure.core/defn minus-years
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text]
   (js-invoke java.time.YearMonth "parse" text))
  (^js/JSJoda.YearMonth [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.YearMonth "parse" text formatter)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.YearMonth" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]
               ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.YearMonth []
   (js-invoke java.time.YearMonth "now"))
  (^js/JSJoda.YearMonth [arg0]
   (js-invoke java.time.YearMonth "now" arg0)))

(clojure.core/defn get-month-value
  {:arglists '(["java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this]
   (.monthValue this)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.YearMonth" "java.time.YearMonth"])}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists '(["java.time.YearMonth"])}
  (^js/JSJoda.Month [^js/JSJoda.YearMonth this]
   (.month this)))

(clojure.core/defn get
  {:arglists '(["java.time.YearMonth" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.YearMonth" "java.lang.Object"])}
  (^boolean [^js/JSJoda.YearMonth this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.YearMonth" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.YearMonth this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.YearMonth" "long"])}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long years-to-add]
   (.plusYears this years-to-add)))
