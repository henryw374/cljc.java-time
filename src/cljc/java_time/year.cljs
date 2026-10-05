(ns cljc.java-time.year
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Year]]))

(def min-value (goog.object/get java.time.Year "MIN_VALUE"))

(def max-value (goog.object/get java.time.Year "MAX_VALUE"))

(clojure.core/defn range
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Year this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Year [^int arg0]
   (js-invoke java.time.Year "of" arg0)))

(clojure.core/defn at-day
  {:arglists (quote (["java.time.Year" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^int arg0]
   (.atDay this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-valid-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.MonthDay arg0]
   (.isValidMonthDay this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Year this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

^{:column 16, :line 89}
(clojure.core/defn is-leap
  {:arglists ^{:line 89, :column 54} (quote ^{:line 89, :column 61} (["long"]))}
  ^{:line 90, :column 18}
  (^java.lang.Boolean [^long arg0]
   ^{:line 90, :column 51} (. java.time.Year isLeap arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Year"]))}
  (^java.lang.String [^js/JSJoda.Year this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"]
                     ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn at-month-day
  {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.Year this ^js/JSJoda.MonthDay arg0]
   (.atMonthDay this arg0)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.value this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Year this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn at-month
  {:arglists (quote (["java.time.Year" "int"] ["java.time.Year" "java.time.Month"]))}
  (^js/JSJoda.YearMonth [this arg0]
   (.atMonth ^js/JSJoda.Year this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Year this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn length
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.length this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.Year [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.Year "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^boolean [^js/JSJoda.Year this ^js/JSJoda.Year arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]
                     ["java.time.Year" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Year this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.Year [^java.lang.CharSequence arg0]
   (js-invoke java.time.Year "parse" arg0))
  (^js/JSJoda.Year [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.Year "parse" arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Year"]))}
  (^int [^js/JSJoda.Year this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Year this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Year" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.Year [^js/JSJoda.Year this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.Year []
   (js-invoke java.time.Year "now"))
  (^js/JSJoda.Year [arg0]
   (js-invoke java.time.Year "now" arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Year" "java.time.Year"]))}
  (^int [^js/JSJoda.Year this ^js/JSJoda.Year arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Year this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Year" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Year this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.Year" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.Year this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.Year" "long"]))}
  (^js/JSJoda.Year [^js/JSJoda.Year this ^long arg0]
   (.plusYears this arg0)))
