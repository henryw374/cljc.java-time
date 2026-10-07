(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Period]]))

(def zero (goog.object/get java.time.Period "ZERO"))

(defn get-months
  {:arglists '(["java.time.Period"])}
  (^int [^js/JSJoda.Period this]
   (.months this)))

(defn of-weeks
  {:arglists '(["int"])}
  (^js/JSJoda.Period [^int weeks]
   (js-invoke java.time.Period "ofWeeks" weeks)))

(defn of-days
  {:arglists '(["int"])}
  (^js/JSJoda.Period [^int days]
   (js-invoke java.time.Period "ofDays" days)))

(defn is-negative
  {:arglists '(["java.time.Period"])}
  (^boolean [^js/JSJoda.Period this]
   (.isNegative this)))

(defn of
  {:arglists '(["int" "int" "int"])}
  (^js/JSJoda.Period [^int years ^int months ^int days]
   (js-invoke java.time.Period "of" years months days)))

(defn is-zero
  {:arglists '(["java.time.Period"])}
  (^boolean [^js/JSJoda.Period this]
   (.isZero this)))

(defn multiplied-by
  {:arglists '(["java.time.Period" "int"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int scalar]
   (.multipliedBy this scalar)))

(defn get-units
  {:arglists '(["java.time.Period"])}
  (^java.util.List [^js/JSJoda.Period this]
   (.units this)))

(defn with-days
  {:arglists '(["java.time.Period" "int"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int days]
   (.withDays this days)))

(defn plus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(defn of-months
  {:arglists '(["int"])}
  (^js/JSJoda.Period [^int months]
   (js-invoke java.time.Period "ofMonths" months)))

(defn to-string
  {:arglists '(["java.time.Period"])}
  (^java.lang.String [^js/JSJoda.Period this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn minus-months
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(defn add-to
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(defn to-total-months
  {:arglists '(["java.time.Period"])}
  (^long [^js/JSJoda.Period this]
   (.toTotalMonths this)))

(defn plus-days
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-years
  {:arglists '(["int"])}
  (^js/JSJoda.Period [^int years]
   (js-invoke java.time.Period "ofYears" years)))

(defn get-days
  {:arglists '(["java.time.Period"])}
  (^int [^js/JSJoda.Period this]
   (.days this)))

(defn negated
  {:arglists '(["java.time.Period"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.negated this)))

(defn get-years
  {:arglists '(["java.time.Period"])}
  (^int [^js/JSJoda.Period this]
   (.years this)))

(defn with-years
  {:arglists '(["java.time.Period" "int"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int years]
   (.withYears this years)))

(defn normalized
  {:arglists '(["java.time.Period"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.normalized this)))

(defn with-months
  {:arglists '(["java.time.Period" "int"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int months]
   (.withMonths this months)))

(defn between
  {:arglists '(["java.time.LocalDate" "java.time.LocalDate"])}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate start-date-inclusive ^js/JSJoda.LocalDate end-date-exclusive]
   (js-invoke java.time.Period "between" start-date-inclusive end-date-exclusive)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAmount"])}
  (^js/JSJoda.Period [^js/JSJoda.TemporalAmount amount]
   (js-invoke java.time.Period "from" amount)))

(defn minus-years
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  {:arglists '(["java.time.Period"])}
  (^js/JSJoda.IsoChronology [^js/JSJoda.Period this]
   (.chronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^js/JSJoda.Period [^java.lang.CharSequence text]
   (js-invoke java.time.Period "parse" text)))

(defn hash-code
  {:arglists '(["java.time.Period"])}
  (^int [^js/JSJoda.Period this]
   (.hashCode this)))

(defn subtract-from
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))

(defn get
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.Period this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(defn equals
  {:arglists '(["java.time.Period" "java.lang.Object"])}
  (^boolean [^js/JSJoda.Period this ^java.lang.Object obj]
   (.equals this obj)))

(defn plus-years
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  {:arglists '(["java.time.Period" "long"])}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
