(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Year]]))

(def min-value (goog.object/get java.time.Year "MIN_VALUE"))

(def max-value (goog.object/get java.time.Year "MAX_VALUE"))

(clojure.core/defn range
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Year [^int iso-year]
   (js-invoke java.time.Year "of" iso-year)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.Year" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^int day-of-year]
   (.atDay this day-of-year)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn is-valid-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(clojure.core/defn query
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Year this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

^{:column 16, :line 89}
(clojure.core/defn is-leap
  {:arglists ^{:line 89, :column 54} (quote ^{:line 89, :column 61} (["long"]))}
  ^{:line 90, :column 18}
  (^java.lang.Boolean [^long year]
   ^{:line 90, :column 51} (. java.time.Year isLeap year)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.String [^js/JSJoda.Year this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn at-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^js/JSJoda.MonthDay month-day]
   (.atMonthDay this month-day)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.value this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn at-month
  {:arglists (quote (["java.time.Year" "int"] ["java.time.Year" "java.time.Month"]))}
  (^js/JSJoda.YearMonth [this arg0]
   (.atMonth ^js/JSJoda.Year this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Year this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn length
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.length this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.Year [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.Year "from" temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]
                     ["java.time.Year" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Year this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.Year [^java.lang.CharSequence text]
   (js-invoke java.time.Year "parse" text))
  (^js/JSJoda.Year [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.Year "parse" text formatter)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Year this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Year" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.Year []
   (js-invoke java.time.Year "now"))
  (^js/JSJoda.Year [arg0]
   (js-invoke java.time.Year "now" arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^int [^js/JSJoda.Year this ^js/JSJoda.Year other]
   (.compareTo this other)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Year this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Year" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Year this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.Year" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.Year this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
