(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time MonthDay]))

(clojure.core/defn at-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.LocalDate [^java.time.MonthDay this ^java.lang.Integer year]
   (.atYear this year)))

(clojure.core/defn range
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["java.time.Month" "int"]))}
  (^java.time.MonthDay [arg0 arg1]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.lang.Number arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [month (clojure.core/int arg0)
                          day-of-month (clojure.core/int arg1)]
         (java.time.MonthDay/of month day-of-month))
     (clojure.core/and (clojure.core/instance? java.time.Month arg0) (clojure.core/instance? java.lang.Number arg1))
       (clojure.core/let [month ^"java.time.Month" arg0
                          day-of-month (clojure.core/int arg1)]
         (java.time.MonthDay/of month day-of-month))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer month]
   (.withMonth this month)))

(clojure.core/defn query
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.MonthDay this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.String [^java.time.MonthDay this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isBefore this other)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.MonthDay [^java.time.temporal.TemporalAccessor temporal]
   (java.time.MonthDay/from temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.MonthDay other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.MonthDay [^java.lang.CharSequence text]
   (java.time.MonthDay/parse text))
  (^java.time.MonthDay [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.MonthDay/parse text formatter)))

(clojure.core/defn is-valid-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Integer year]
   (.isValidYear this year)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.MonthDay this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.MonthDay" "java.time.Month"]))}
  (^java.time.MonthDay [^java.time.MonthDay this ^java.time.Month month]
   (.with this month)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.MonthDay []
   (java.time.MonthDay/now))
  (^java.time.MonthDay [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.MonthDay/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.MonthDay/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this]
   (.getMonthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.MonthDay other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.time.Month [^java.time.MonthDay this]
   (.getMonth this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.MonthDay this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.MonthDay" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.MonthDay" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.MonthDay this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
