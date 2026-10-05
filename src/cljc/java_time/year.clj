(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Year]))

(def min-value java.time.Year/MIN_VALUE)

(def max-value java.time.Year/MAX_VALUE)

(clojure.core/defn range
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.Year this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^java.time.Year [^java.lang.Integer arg0]
   (java.time.Year/of arg0)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.Year" "int"]))}
  (^java.time.LocalDate [^java.time.Year this ^java.lang.Integer arg0]
   (.atDay this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.Year [^java.time.Year this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-valid-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^java.lang.Boolean [^java.time.Year this ^java.time.MonthDay arg0]
   (.isValidMonthDay this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.Year this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

^{:column 16, :line 89}
(clojure.core/defn is-leap
  {:arglists ^{:line 89, :column 54} (quote ^{:line 89, :column 61} (["long"]))}
  ^{:line 90, :column 18}
  (^java.lang.Boolean [^long arg0]
   ^{:line 90, :column 51} (. java.time.Year isLeap arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.String [^java.time.Year this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.Year [^java.time.Year this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn at-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^java.time.LocalDate [^java.time.Year this ^java.time.MonthDay arg0]
   (.atMonthDay this arg0)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.Integer [^java.time.Year this]
   (.getValue this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.Year this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn at-month
  {:arglists (quote (["java.time.Year" "int"] ["java.time.Year" "java.time.Month"]))}
  (^java.time.YearMonth [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0))
                        (clojure.core/let [arg0 (clojure.core/int arg0)] (.atMonth ^java.time.Year this arg0))
                      (clojure.core/and (clojure.core/instance? java.time.Month arg0))
                        (clojure.core/let [arg0 ^"java.time.Month" arg0] (.atMonth ^java.time.Year this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn until
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.Year this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn length
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.Integer [^java.time.Year this]
   (.length this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.Year [^java.time.temporal.TemporalAccessor arg0]
   (java.time.Year/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^java.lang.Boolean [^java.time.Year this ^java.time.Year arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]
                     ["java.time.Year" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.Year this arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.Year this arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^java.time.Year [^java.time.Year this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.Year [^java.lang.CharSequence arg0]
   (java.time.Year/parse arg0))
  (^java.time.Year [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.Year/parse arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.Integer [^java.time.Year this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Year this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Year" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.Year [^java.time.Year this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.Year []
   (java.time.Year/now))
  (^java.time.Year [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.Year/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.Year/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^java.lang.Integer [^java.time.Year this ^java.time.Year arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.Year this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Year" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Year this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.Year" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.Year this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^java.time.Year [^java.time.Year this ^long arg0]
   (.plusYears this arg0)))
