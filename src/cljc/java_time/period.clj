(ns cljc.java-time.period
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Period]))

(def zero java.time.Period/ZERO)

(clojure.core/defn get-months
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getMonths this)))

(clojure.core/defn of-weeks
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer weeks]
   (java.time.Period/ofWeeks weeks)))

(clojure.core/defn of-days
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer days]
   (java.time.Period/ofDays days)))

(clojure.core/defn is-negative
  {:arglists '(["java.time.Period"])}
  (^java.lang.Boolean [^java.time.Period this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists '(["int" "int" "int"])}
  (^java.time.Period [^java.lang.Integer years ^java.lang.Integer months ^java.lang.Integer days]
   (java.time.Period/of years months days)))

(clojure.core/defn is-zero
  {:arglists '(["java.time.Period"])}
  (^java.lang.Boolean [^java.time.Period this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer scalar]
   (.multipliedBy this scalar)))

(clojure.core/defn get-units
  {:arglists '(["java.time.Period"])}
  (^java.util.List [^java.time.Period this]
   (.getUnits this)))

(clojure.core/defn with-days
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer days]
   (.withDays this days)))

(clojure.core/defn plus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add)))

(clojure.core/defn of-months
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer months]
   (java.time.Period/ofMonths months)))

(clojure.core/defn to-string
  {:arglists '(["java.time.Period"])}
  (^java.lang.String [^java.time.Period this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long months-to-add]
   (.plusMonths this months-to-add)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(clojure.core/defn minus
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.Period this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract)))

(clojure.core/defn add-to
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(clojure.core/defn to-total-months
  {:arglists '(["java.time.Period"])}
  (^long [^java.time.Period this]
   (.toTotalMonths this)))

(clojure.core/defn plus-days
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long days-to-add]
   (.plusDays this days-to-add)))

(clojure.core/defn of-years
  {:arglists '(["int"])}
  (^java.time.Period [^java.lang.Integer years]
   (java.time.Period/ofYears years)))

(clojure.core/defn get-days
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getDays this)))

(clojure.core/defn negated
  {:arglists '(["java.time.Period"])}
  (^java.time.Period [^java.time.Period this]
   (.negated this)))

(clojure.core/defn get-years
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.getYears this)))

(clojure.core/defn with-years
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer years]
   (.withYears this years)))

(clojure.core/defn normalized
  {:arglists '(["java.time.Period"])}
  (^java.time.Period [^java.time.Period this]
   (.normalized this)))

(clojure.core/defn with-months
  {:arglists '(["java.time.Period" "int"])}
  (^java.time.Period [^java.time.Period this ^java.lang.Integer months]
   (.withMonths this months)))

(clojure.core/defn between
  {:arglists '(["java.time.LocalDate" "java.time.LocalDate"])}
  (^java.time.Period [^java.time.LocalDate start-date-inclusive ^java.time.LocalDate end-date-exclusive]
   (java.time.Period/between start-date-inclusive end-date-exclusive)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAmount"])}
  (^java.time.Period [^java.time.temporal.TemporalAmount amount]
   (java.time.Period/from amount)))

(clojure.core/defn minus-years
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn get-chronology
  {:arglists '(["java.time.Period"])}
  (^java.time.chrono.IsoChronology [^java.time.Period this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^java.time.Period [^java.lang.CharSequence text]
   (java.time.Period/parse text)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.Period"])}
  (^java.lang.Integer [^java.time.Period this]
   (.hashCode this)))

(clojure.core/defn subtract-from
  {:arglists '(["java.time.Period" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Period this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(clojure.core/defn get
  {:arglists '(["java.time.Period" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Period this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(clojure.core/defn equals
  {:arglists '(["java.time.Period" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Period this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long years-to-add]
   (.plusYears this years-to-add)))

(clojure.core/defn minus-days
  {:arglists '(["java.time.Period" "long"])}
  (^java.time.Period [^java.time.Period this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
