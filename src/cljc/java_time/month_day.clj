(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time MonthDay)))

(defn at-year
  {:arglists '(["java.time.MonthDay" "int"])}
  (^java.time.LocalDate [^java.time.MonthDay this ^java.lang.Integer year]
   (.atYear this year)))

(defn range
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn of
  {:arglists '(["int" "int"] ["java.time.Month" "int"])}
  (^java.time.MonthDay [arg0 arg1]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1))
           (let [month (int arg0)
                 day-of-month (int arg1)]
             (java.time.MonthDay/of month day-of-month))
         (and (instance? java.time.Month arg0)
              (instance? java.lang.Number arg1))
           (let [month ^"java.time.Month" arg0
                 day-of-month (int arg1)]
             (java.time.MonthDay/of month day-of-month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  {:arglists '(["java.time.MonthDay" "int"])}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer month]
   (.withMonth this month)))

(defn query
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.MonthDay this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.MonthDay"])}
  (^java.lang.String [^java.time.MonthDay this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isBefore this other)))

(defn get-long
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^long [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-day-of-month
  {:arglists '(["java.time.MonthDay" "int"])}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.MonthDay"])}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getDayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.MonthDay [^java.time.temporal.TemporalAccessor temporal]
   (java.time.MonthDay/from temporal)))

(defn is-after
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.MonthDay [^java.lang.CharSequence text]
   (java.time.MonthDay/parse text))
  (^java.time.MonthDay [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.MonthDay/parse text formatter)))

(defn is-valid-year
  {:arglists '(["java.time.MonthDay" "int"])}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Integer year]
   (.isValidYear this year)))

(defn hash-code
  {:arglists '(["java.time.MonthDay"])}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.MonthDay" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.MonthDay this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.MonthDay" "java.time.Month"])}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.time.Month month]
   (.with this month)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.MonthDay []
   (java.time.MonthDay/now))
  (^java.time.MonthDay [arg0]
   (cond (instance? java.time.Clock arg0) (let [clock ^"java.time.Clock" arg0]
                                            (java.time.MonthDay/now clock))
         (instance? java.time.ZoneId arg0) (let [zone ^"java.time.ZoneId" arg0]
                                             (java.time.MonthDay/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn get-month-value
  {:arglists '(["java.time.MonthDay"])}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getMonthValue this)))

(defn compare-to
  {:arglists '(["java.time.MonthDay" "java.time.MonthDay"])}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.MonthDay other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.MonthDay"])}
  (^java.time.Month [^java.time.MonthDay this]
   (.getMonth this)))

(defn get
  {:arglists '(["java.time.MonthDay" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.MonthDay" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.MonthDay" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.MonthDay this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
