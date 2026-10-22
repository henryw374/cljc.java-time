(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Period]]))

(def zero (goog.object/get java.time.Period "ZERO"))

(defn get-months
  (^int [^js/JSJoda.Period this]
   (.months this)))

(defn of-weeks
  (^js/JSJoda.Period [^int weeks]
   (js-invoke java.time.Period "ofWeeks" weeks)))

(defn of-days
  (^js/JSJoda.Period [^int days]
   (js-invoke java.time.Period "ofDays" days)))

(defn is-negative
  (^boolean [^js/JSJoda.Period this]
   (.isNegative this)))

(defn of
  (^js/JSJoda.Period [^int years ^int months ^int days]
   (js-invoke java.time.Period "of" years months days)))

(defn is-zero
  (^boolean [^js/JSJoda.Period this]
   (.isZero this)))

(defn multiplied-by
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int scalar]
   (.multipliedBy this scalar)))

(defn get-units
  (^java.util.List [^js/JSJoda.Period this]
   (.units this)))

(defn with-days
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int days]
   (.withDays this days)))

(defn plus
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(defn of-months
  (^js/JSJoda.Period [^int months]
   (js-invoke java.time.Period "ofMonths" months)))

(defn to-string
  (^java.lang.String [^js/JSJoda.Period this]
   (.toString this)))

(defn plus-months
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn minus-months
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(defn add-to
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(defn to-total-months
  (^long [^js/JSJoda.Period this]
   (.toTotalMonths this)))

(defn plus-days
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-years
  (^js/JSJoda.Period [^int years]
   (js-invoke java.time.Period "ofYears" years)))

(defn get-days
  (^int [^js/JSJoda.Period this]
   (.days this)))

(defn negated
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.negated this)))

(defn get-years
  (^int [^js/JSJoda.Period this]
   (.years this)))

(defn with-years
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int years]
   (.withYears this years)))

(defn normalized
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.normalized this)))

(defn with-months
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int months]
   (.withMonths this months)))

(defn between
  (^js/JSJoda.Period [^js/JSJoda.LocalDate start-date-inclusive ^js/JSJoda.LocalDate end-date-exclusive]
   (js-invoke java.time.Period "between" start-date-inclusive end-date-exclusive)))

(defn from
  (^js/JSJoda.Period [^js/JSJoda.TemporalAmount amount]
   (js-invoke java.time.Period "from" amount)))

(defn minus-years
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  (^js/JSJoda.IsoChronology [^js/JSJoda.Period this]
   (.chronology this)))

(defn parse
  (^js/JSJoda.Period [^java.lang.CharSequence text]
   (js-invoke java.time.Period "parse" text)))

(defn hash-code
  (^int [^js/JSJoda.Period this]
   (.hashCode this)))

(defn subtract-from
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))

(defn get
  (^long [^js/JSJoda.Period this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(defn equals
  (^boolean [^js/JSJoda.Period this ^java.lang.Object obj]
   (.equals this obj)))

(defn plus-years
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
