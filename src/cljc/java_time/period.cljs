(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Period]]))

(def zero (goog.object/get java.time.Period "ZERO"))

(clojure.core/defn get-months
  {:arglists (quote (["java.time.Period"]))}
  (^int [^js/JSJoda.Period this]
   (.months this)))

(clojure.core/defn of-weeks
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int weeks]
   (js-invoke java.time.Period "ofWeeks" weeks)))

(clojure.core/defn of-days
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int days]
   (js-invoke java.time.Period "ofDays" days)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Period"]))}
  (^boolean [^js/JSJoda.Period this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["int" "int" "int"]))}
  (^js/JSJoda.Period [^int years ^int months ^int days]
   (js-invoke java.time.Period "of" years months days)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Period"]))}
  (^boolean [^js/JSJoda.Period this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int scalar]
   (.multipliedBy this scalar)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Period"]))}
  (^java.util.List [^js/JSJoda.Period this]
   (.units this)))

(clojure.core/defn with-days
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int days]
   (.withDays this days)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(clojure.core/defn of-months
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int months]
   (js-invoke java.time.Period "ofMonths" months)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.String [^js/JSJoda.Period this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(clojure.core/defn to-total-months
  {:arglists (quote (["java.time.Period"]))}
  (^long [^js/JSJoda.Period this]
   (.toTotalMonths this)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(clojure.core/defn of-years
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int years]
   (js-invoke java.time.Period "ofYears" years)))

(clojure.core/defn get-days
  {:arglists (quote (["java.time.Period"]))}
  (^int [^js/JSJoda.Period this]
   (.days this)))

(clojure.core/defn negated
  {:arglists (quote (["java.time.Period"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.negated this)))

(clojure.core/defn get-years
  {:arglists (quote (["java.time.Period"]))}
  (^int [^js/JSJoda.Period this]
   (.years this)))

(clojure.core/defn with-years
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int years]
   (.withYears this years)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.Period"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.normalized this)))

(clojure.core/defn with-months
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int months]
   (.withMonths this months)))

(clojure.core/defn between
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate start-date-inclusive ^js/JSJoda.LocalDate end-date-exclusive]
   (js-invoke java.time.Period "between" start-date-inclusive end-date-exclusive)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.TemporalAmount amount]
   (js-invoke java.time.Period "from" amount)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.Period"]))}
  (^js/JSJoda.IsoChronology [^js/JSJoda.Period this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^js/JSJoda.Period [^java.lang.CharSequence text]
   (js-invoke java.time.Period "parse" text)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Period"]))}
  (^int [^js/JSJoda.Period this]
   (.hashCode this)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Period this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Period" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Period this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
