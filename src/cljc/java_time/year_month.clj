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
  (^java.time.temporal.ValueRange [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn is-valid-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Integer day-of-month]
   (.isValidDay this day-of-month)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["int" "java.time.Month"]))}
  (^java.time.YearMonth [arg0 arg1]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [year (clojure.core/int arg0)
                          month (clojure.core/int arg1)]
         (java.time.YearMonth/of year month))
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.time.Month arg1))
       (clojure.core/let [year (clojure.core/int arg0)
                          month ^"java.time.Month" arg1]
         (java.time.YearMonth/of year month))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer month]
   (.withMonth this month)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.LocalDate [^java.time.YearMonth this ^java.lang.Integer day-of-month]
   (.atDay this day-of-month)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.YearMonth [^java.time.YearMonth this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn is-leap-year
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.YearMonth this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.String [^java.time.YearMonth this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long months-to-add]
   (.plusMonths this months-to-add)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"]
                     ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.YearMonth [^java.time.YearMonth this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.YearMonth" "int"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.lang.Integer year]
   (.withYear this year)))

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
  (^long [^java.time.YearMonth this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.YearMonth [^java.time.temporal.TemporalAccessor temporal]
   (java.time.YearMonth/from temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.time.YearMonth other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.YearMonth this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.YearMonth this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.YearMonth [^java.lang.CharSequence text]
   (java.time.YearMonth/parse text))
  (^java.time.YearMonth [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.YearMonth/parse text formatter)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.YearMonth this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.YearMonth [^java.time.YearMonth this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.YearMonth []
   (java.time.YearMonth/now))
  (^java.time.YearMonth [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.YearMonth/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.YearMonth/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this]
   (.getMonthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))}
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.YearMonth other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.YearMonth"]))}
  (^java.time.Month [^java.time.YearMonth this]
   (.getMonth this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.YearMonth this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.YearMonth" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.YearMonth this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.YearMonth" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.YearMonth this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.YearMonth" "long"]))}
  (^java.time.YearMonth [^java.time.YearMonth this ^long years-to-add]
   (.plusYears this years-to-add)))
