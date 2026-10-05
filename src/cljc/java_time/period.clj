(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Period]))

(def zero java.time.Period/ZERO)

(clojure.core/defn get-months
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Integer [^java.time.Period this]
   (.getMonths this)))

(clojure.core/defn of-weeks
  {:arglists (quote (["int"]))}
  (^java.time.Period [^java.lang.Integer arg0]
   (java.time.Period/ofWeeks arg0)))

(clojure.core/defn of-days
  {:arglists (quote (["int"]))}
  (^java.time.Period [^java.lang.Integer arg0]
   (java.time.Period/ofDays arg0)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Boolean [^java.time.Period this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["int" "int" "int"]))}
  (^java.time.Period [^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2]
   (java.time.Period/of arg0 arg1 arg2)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Boolean [^java.time.Period this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Period" "int"]))}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer arg0]
   (.multipliedBy this arg0)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Period"]))}
  (^java.util.List [^java.time.Period this]
   (.getUnits this)))

(clojure.core/defn with-days
  {:arglists (quote (["java.time.Period" "int"]))}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer arg0]
   (.withDays this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0)))

(clojure.core/defn of-months
  {:arglists (quote (["int"]))}
  (^java.time.Period [^java.lang.Integer arg0]
   (java.time.Period/ofMonths arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.String [^java.time.Period this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal arg0]
   (.addTo this arg0)))

(clojure.core/defn to-total-months
  {:arglists (quote (["java.time.Period"]))}
  (^long [^java.time.Period this]
   (.toTotalMonths this)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn of-years
  {:arglists (quote (["int"]))}
  (^java.time.Period [^java.lang.Integer arg0]
   (java.time.Period/ofYears arg0)))

(clojure.core/defn get-days
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Integer [^java.time.Period this]
   (.getDays this)))

(clojure.core/defn negated
  {:arglists (quote (["java.time.Period"]))}
  (^java.time.Period [^java.time.Period this]
   (.negated this)))

(clojure.core/defn get-years
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Integer [^java.time.Period this]
   (.getYears this)))

(clojure.core/defn with-years
  {:arglists (quote (["java.time.Period" "int"]))}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer arg0]
   (.withYears this arg0)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.Period"]))}
  (^java.time.Period [^java.time.Period this]
   (.normalized this)))

(clojure.core/defn with-months
  {:arglists (quote (["java.time.Period" "int"]))}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer arg0]
   (.withMonths this arg0)))

(clojure.core/defn between
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))}
  (^java.time.Period [^java.time.LocalDate arg0 ^java.time.LocalDate arg1]
   (java.time.Period/between arg0 arg1)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^java.time.Period [^java.time.temporal.TemporalAmount arg0]
   (java.time.Period/from arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.Period"]))}
  (^java.time.chrono.IsoChronology [^java.time.Period this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^java.time.Period [^java.lang.CharSequence arg0]
   (java.time.Period/parse arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.Integer [^java.time.Period this]
   (.hashCode this)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal arg0]
   (.subtractFrom this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.Period this ^java.time.temporal.ChronoUnit arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Period" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Period this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^java.time.Period [^java.time.Period this ^long arg0]
   (.minusDays this arg0)))
