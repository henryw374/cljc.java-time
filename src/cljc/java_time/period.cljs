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
  (^js/JSJoda.Period [^int arg0]
   (js-invoke java.time.Period "ofWeeks" arg0)))

(clojure.core/defn of-days
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int arg0]
   (js-invoke java.time.Period "ofDays" arg0)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Period"]))}
  (^boolean [^js/JSJoda.Period this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["int" "int" "int"]))}
  (^js/JSJoda.Period [^int arg0 ^int arg1 ^int arg2]
   (js-invoke java.time.Period "of" arg0 arg1 arg2)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Period"]))}
  (^boolean [^js/JSJoda.Period this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int arg0]
   (.multipliedBy this arg0)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Period"]))}
  (^java.util.List [^js/JSJoda.Period this]
   (.units this)))

(clojure.core/defn with-days
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int arg0]
   (.withDays this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0)))

(clojure.core/defn of-months
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int arg0]
   (js-invoke java.time.Period "ofMonths" arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Period"]))}
  (^java.lang.String [^js/JSJoda.Period this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal arg0]
   (.addTo this arg0)))

(clojure.core/defn to-total-months
  {:arglists (quote (["java.time.Period"]))}
  (^long [^js/JSJoda.Period this]
   (.toTotalMonths this)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn of-years
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Period [^int arg0]
   (js-invoke java.time.Period "ofYears" arg0)))

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
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int arg0]
   (.withYears this arg0)))

(clojure.core/defn normalized
  {:arglists (quote (["java.time.Period"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this]
   (.normalized this)))

(clojure.core/defn with-months
  {:arglists (quote (["java.time.Period" "int"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^int arg0]
   (.withMonths this arg0)))

(clojure.core/defn between
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate arg0 ^js/JSJoda.LocalDate arg1]
   (js-invoke java.time.Period "between" arg0 arg1)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^js/JSJoda.Period [^js/JSJoda.TemporalAmount arg0]
   (js-invoke java.time.Period "from" arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.Period"]))}
  (^js/JSJoda.IsoChronology [^js/JSJoda.Period this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^js/JSJoda.Period [^java.lang.CharSequence arg0]
   (js-invoke java.time.Period "parse" arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Period"]))}
  (^int [^js/JSJoda.Period this]
   (.hashCode this)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Period this ^js/JSJoda.Temporal arg0]
   (.subtractFrom this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Period this ^js/JSJoda.TemporalUnit arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Period" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Period this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Period" "long"]))}
  (^js/JSJoda.Period [^js/JSJoda.Period this ^long arg0]
   (.minusDays this arg0)))
