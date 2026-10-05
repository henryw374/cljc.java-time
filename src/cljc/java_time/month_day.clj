(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time MonthDay]))

(clojure.core/defn at-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.LocalDate [^java.time.MonthDay this ^java.lang.Integer arg0]
   (.atYear this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.MonthDay this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["java.time.Month" "int"]))}
  (^java.time.MonthDay [arg0 arg1]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [arg0 (clojure.core/int arg0) arg1 (clojure.core/int arg1)] (java.time.MonthDay/of arg0 arg1))
     (clojure.core/and (clojure.core/instance? java.time.Month arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [arg0 ^"java.time.Month" arg0 arg1 (clojure.core/int arg1)] (java.time.MonthDay/of arg0 arg1))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer arg0]
   (.withMonth this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.MonthDay this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.String [^java.time.MonthDay this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay arg0]
   (.isBefore this arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.MonthDay this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.MonthDay [^java.time.temporal.TemporalAccessor arg0]
   (java.time.MonthDay/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.temporal.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.MonthDay [^java.lang.CharSequence arg0]
   (java.time.MonthDay/parse arg0))
  (^java.time.MonthDay [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.MonthDay/parse arg0 arg1)))

(clojure.core/defn is-valid-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Integer arg0]
   (.isValidYear this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.MonthDay this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.MonthDay" "java.time.Month"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.time.Month arg0]
   (.with this arg0)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.MonthDay []
   (java.time.MonthDay/now))
  (^java.time.MonthDay [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.MonthDay/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.MonthDay/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getMonthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.MonthDay arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.time.Month [^java.time.MonthDay this]
   (.getMonth this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.MonthDay" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.MonthDay" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.MonthDay this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))
