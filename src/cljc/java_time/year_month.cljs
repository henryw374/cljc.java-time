(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [YearMonth]]))

(clojure.core/defn length-of-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn is-valid-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^boolean [^js/JSJoda.YearMonth this ^int arg0]
   (.isValidDay this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["int" "java.time.Month"]))}
  (^js/JSJoda.YearMonth [arg0 arg1]
   (js-invoke java.time.YearMonth "of" arg0 arg1)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int arg0]
   (.withMonth this arg0)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this ^int arg0]
   (.atDay this arg0)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this]
   (.year this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-leap-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^boolean [^js/JSJoda.YearMonth this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.String [^js/JSJoda.YearMonth this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^int arg0]
   (.withYear this arg0)))

(clojure.core/defn at-end-of-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.YearMonth this]
   (.atEndOfMonth this)))

(clojure.core/defn length-of-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.YearMonth "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^boolean [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.YearMonth this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.YearMonth [^java.lang.CharSequence arg0]
   (js-invoke java.time.YearMonth "parse" arg0))
  (^js/JSJoda.YearMonth [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.YearMonth "parse" arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.YearMonth this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.YearMonth []
   (js-invoke java.time.YearMonth "now"))
  (^js/JSJoda.YearMonth [arg0]
   (js-invoke java.time.YearMonth "now" arg0)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this]
   (.monthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.YearMonth arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^js/JSJoda.Month [^js/JSJoda.YearMonth this]
   (.month this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.YearMonth this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.YearMonth" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.YearMonth this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.YearMonth" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.YearMonth this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^js/JSJoda.YearMonth [^js/JSJoda.YearMonth this ^long arg0]
   (.plusYears this arg0)))
