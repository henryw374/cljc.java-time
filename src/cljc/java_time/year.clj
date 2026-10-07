(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Year]))

(def min-value java.time.Year/MIN_VALUE)

(def max-value java.time.Year/MAX_VALUE)

(clojure.core/defn range
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn of
  {:arglists '(["int"])}
  (^java.time.Year [^java.lang.Integer iso-year]
   (java.time.Year/of iso-year)))

(clojure.core/defn at-day
  {:arglists '(["java.time.Year" "int"])}
  (^java.time.LocalDate [^java.time.Year this ^java.lang.Integer day-of-year]
   (.atDay this day-of-year)))

(clojure.core/defn plus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.Year [^java.time.Year this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn is-valid-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.MonthDay month-day]
   (.isValidMonthDay this month-day)))

(clojure.core/defn query
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.Year this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

^{:column 16, :line 89}
(clojure.core/defn is-leap
  {:arglists ^{:line 89, :column 54} '^{:line 89, :column 61} (["long"])}
  ^{:line 90, :column 18}
  (^java.lang.Boolean [^long year]
   ^{:line 90, :column 51} (. java.time.Year isLeap year)))

(clojure.core/defn to-string
  {:arglists '(["java.time.Year"])}
  (^java.lang.String [^java.time.Year this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAmount"]
               ["java.time.Year" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.Year [^java.time.Year this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn at-month-day
  {:arglists '(["java.time.Year" "java.time.MonthDay"])}
  (^java.time.LocalDate [^java.time.Year this ^java.time.MonthDay month-day]
   (.atMonthDay this month-day)))

(clojure.core/defn get-value
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.getValue this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^long [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn at-month
  {:arglists '(["java.time.Year" "int"] ["java.time.Year" "java.time.Month"])}
  (^java.time.YearMonth [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0))
                        (clojure.core/let [month (clojure.core/int arg0)] (.atMonth ^java.time.Year this month))
                      (clojure.core/and (clojure.core/instance? java.time.Month arg0))
                        (clojure.core/let [month ^"java.time.Month" arg0] (.atMonth ^java.time.Year this month))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn until
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Year this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn length
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.length this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.Year [^java.time.temporal.TemporalAccessor temporal]
   (java.time.Year/from temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"]
               ["java.time.Year" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.Year this field))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.Year this unit))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists '(["java.time.Year" "long"])}
  (^java.time.Year [^java.time.Year this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.Year [^java.lang.CharSequence text]
   (java.time.Year/parse text))
  (^java.time.Year [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.Year/parse text formatter)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.Year" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Year this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalAdjuster"]
               ["java.time.Year" "java.time.temporal.TemporalField" "long"])}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.Year []
   (java.time.Year/now))
  (^java.time.Year [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.Year/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.Year/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn compare-to
  {:arglists '(["java.time.Year" "java.time.Year"])}
  (^java.lang.Integer [^java.time.Year this ^java.time.Year other]
   (.compareTo this other)))

(clojure.core/defn get
  {:arglists '(["java.time.Year" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.Year this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.Year" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Year this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.Year" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.Year this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.Year" "long"])}
  (^java.time.Year [^java.time.Year this ^long years-to-add]
   (.plusYears this years-to-add)))
