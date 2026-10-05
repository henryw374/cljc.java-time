(ns cljc.java-time.year-month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time YearMonth]))

(clojure.core/defn length-of-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.YearMonth this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn is-valid-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Integer arg0]
   (.isValidDay this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["int" "java.time.Month"]))}
  (^java.time.YearMonth [arg0 arg1]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [arg0 (clojure.core/int arg0) arg1 (clojure.core/int arg1)] (java.time.YearMonth/of arg0 arg1))
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.time.Month arg1))
       (clojure.core/let [arg0 (clojure.core/int arg0) arg1 ^"java.time.Month" arg1] (java.time.YearMonth/of arg0 arg1))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer arg0]
   (.withMonth this arg0)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.LocalDate [^java.time.YearMonth this ^java.lang.Integer arg0]
   (.atDay this arg0)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-leap-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.YearMonth this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.String [^java.time.YearMonth this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.YearMonth this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer arg0]
   (.withYear this arg0)))

(clojure.core/defn at-end-of-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.time.LocalDate [^java.time.YearMonth this]
   (.atEndOfMonth this)))

(clojure.core/defn length-of-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.YearMonth this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.YearMonth [^java.time.temporal.TemporalAccessor arg0]
   (java.time.YearMonth/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.YearMonth this arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.YearMonth this arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.YearMonth [^java.lang.CharSequence arg0]
   (java.time.YearMonth/parse arg0))
  (^java.time.YearMonth [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.YearMonth/parse arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.YearMonth this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.YearMonth []
   (java.time.YearMonth/now))
  (^java.time.YearMonth [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.YearMonth/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.YearMonth/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getMonthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.YearMonth arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.time.Month [^java.time.YearMonth this]
   (.getMonth this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.YearMonth" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.YearMonth" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.YearMonth this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long arg0]
   (.plusYears this arg0)))
