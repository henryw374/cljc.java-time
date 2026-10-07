(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Period]))

(def zero java.time.Period/ZERO)

(defn get-months
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getMonths this)))

(defn of-weeks
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer weeks]
   (java.time.Period/ofWeeks weeks)))

(defn of-days
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer days]
   (java.time.Period/ofDays days)))

(defn is-negative
  {:arglists '(["java.time.Period"])}
  (^java.lang.Boolean [^java.time.Period this]
   (.isNegative this)))

(defn of
  {:arglists '(["int" "int" "int"])}
  (^java.time.Period [^java.lang.Integer years ^java.lang.Integer months ^java.lang.Integer days]
   (java.time.Period/of years months days)))

(defn is-zero
  {:arglists '(["java.time.Period"])}
  (^java.lang.Boolean [^java.time.Period this]
   (.isZero this)))

(defn multiplied-by
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer scalar]
   (.multipliedBy this scalar)))

(defn get-units
  {:arglists '(["java.time.Period"])}
  (^java.util.List [^java.time.Period this]
   (.getUnits this)))

(defn with-days
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer days]
   (.withDays this days)))

(defn plus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(defn of-months
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer months]
   (java.time.Period/ofMonths months)))

(defn to-string
  {:arglists '(["java.time.Period"])}
  (^java.lang.String [^java.time.Period this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn minus-months
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(defn add-to
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(defn to-total-months
  {:arglists '(["java.time.Period"])}
  (^long [^java.time.Period this]
   (.toTotalMonths this)))

(defn plus-days
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-years
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer years]
   (java.time.Period/ofYears years)))

(defn get-days
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getDays this)))

(defn negated
  {:arglists '(["java.time.Period"])}
  (^java.time.Period [^java.time.Period this]
   (.negated this)))

(defn get-years
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getYears this)))

(defn with-years
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer years]
   (.withYears this years)))

(defn normalized
  {:arglists '(["java.time.Period"])}
  (^java.time.Period [^java.time.Period this]
   (.normalized this)))

(defn with-months
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer months]
   (.withMonths this months)))

(defn between
  {:arglists '(["java.time.LocalDate" "java.time.LocalDate"])}
  (^java.time.Period [^java.time.LocalDate start-date-inclusive ^java.time.LocalDate end-date-exclusive]
   (java.time.Period/between start-date-inclusive end-date-exclusive)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.temporal.TemporalAmount amount]
   (java.time.Period/from amount)))

(defn minus-years
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  {:arglists '(["java.time.Period"])}
  (^java.time.chrono.IsoChronology [^java.time.Period this]
   (.getChronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^java.time.Period [^java.lang.CharSequence text]
   (java.time.Period/parse text)))

(defn hash-code
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.hashCode this)))

(defn subtract-from
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(defn get
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Period this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(defn equals
  {:arglists '(["java.time.Period" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Period this ^java.lang.Object obj]
   (.equals this obj)))

(defn plus-years
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
