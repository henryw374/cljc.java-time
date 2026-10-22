(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Period)))

(def zero java.time.Period/ZERO)

(defn get-months
  (^java.lang.Integer [^java.time.Period this]
   (.getMonths this)))

(defn of-weeks
  (^java.time.Period [^java.lang.Integer weeks]
   (java.time.Period/ofWeeks weeks)))

(defn of-days
  (^java.time.Period [^java.lang.Integer days]
   (java.time.Period/ofDays days)))

(defn is-negative
  (^java.lang.Boolean [^java.time.Period this]
   (.isNegative this)))

(defn of
  (^java.time.Period [^java.lang.Integer years ^java.lang.Integer months ^java.lang.Integer days]
   (java.time.Period/of years months days)))

(defn is-zero
  (^java.lang.Boolean [^java.time.Period this]
   (.isZero this)))

(defn multiplied-by
  (^java.time.Period [^java.time.Period this ^java.lang.Integer scalar]
   (.multipliedBy this scalar)))

(defn get-units
  (^java.util.List [^java.time.Period this]
   (.getUnits this)))

(defn with-days
  (^java.time.Period [^java.time.Period this ^java.lang.Integer days]
   (.withDays this days)))

(defn plus
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(defn of-months
  (^java.time.Period [^java.lang.Integer months]
   (java.time.Period/ofMonths months)))

(defn to-string
  (^java.lang.String [^java.time.Period this]
   (.toString this)))

(defn plus-months
  (^java.time.Period [^java.time.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn minus-months
  (^java.time.Period [^java.time.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(defn add-to
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(defn to-total-months
  (^long [^java.time.Period this]
   (.toTotalMonths this)))

(defn plus-days
  (^java.time.Period [^java.time.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-years
  (^java.time.Period [^java.lang.Integer years]
   (java.time.Period/ofYears years)))

(defn get-days
  (^java.lang.Integer [^java.time.Period this]
   (.getDays this)))

(defn negated
  (^java.time.Period [^java.time.Period this]
   (.negated this)))

(defn get-years
  (^java.lang.Integer [^java.time.Period this]
   (.getYears this)))

(defn with-years
  (^java.time.Period [^java.time.Period this ^java.lang.Integer years]
   (.withYears this years)))

(defn normalized
  (^java.time.Period [^java.time.Period this]
   (.normalized this)))

(defn with-months
  (^java.time.Period [^java.time.Period this ^java.lang.Integer months]
   (.withMonths this months)))

(defn between
  (^java.time.Period [^java.time.LocalDate start-date-inclusive ^java.time.LocalDate end-date-exclusive]
   (java.time.Period/between start-date-inclusive end-date-exclusive)))

(defn from
  (^java.time.Period [^java.time.temporal.TemporalAmount amount]
   (java.time.Period/from amount)))

(defn minus-years
  (^java.time.Period [^java.time.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  (^java.time.chrono.IsoChronology [^java.time.Period this]
   (.getChronology this)))

(defn parse
  (^java.time.Period [^java.lang.CharSequence text]
   (java.time.Period/parse text)))

(defn hash-code
  (^java.lang.Integer [^java.time.Period this]
   (.hashCode this)))

(defn subtract-from
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(defn get
  (^long [^java.time.Period this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(defn equals
  (^java.lang.Boolean [^java.time.Period this ^java.lang.Object obj]
   (.equals this obj)))

(defn plus-years
  (^java.time.Period [^java.time.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  (^java.time.Period [^java.time.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
