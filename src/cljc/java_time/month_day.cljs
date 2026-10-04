(ns cljc.java-time.month-day
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [MonthDay]]))

(clojure.core/defn at-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.MonthDay this ^int year]
   (.atYear this year)))

(clojure.core/defn range
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["java.time.Month" "int"]))}
  (^js/JSJoda.MonthDay [arg0 arg1]
   (js-invoke java.time.MonthDay "of" arg0 arg1)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int month]
   (.withMonth this month)))

(clojure.core/defn query
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.MonthDay"]))}
  (^java.lang.String [^js/JSJoda.MonthDay this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isBefore this other)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^int [^js/JSJoda.MonthDay this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.MonthDay [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.MonthDay "from" temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text]
   (js-invoke java.time.MonthDay "parse" text))
  (^js/JSJoda.MonthDay [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.MonthDay "parse" text formatter)))

(clojure.core/defn is-valid-year
  {:arglists (quote (["java.time.MonthDay" "int"]))}
  (^boolean [^js/JSJoda.MonthDay this ^int year]
   (.isValidYear this year)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.MonthDay"]))}
  (^int [^js/JSJoda.MonthDay this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.MonthDay this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.MonthDay" "java.time.Month"]))}
  (^js/JSJoda.MonthDay [^js/JSJoda.MonthDay this ^js/JSJoda.Month month]
   (.with this month)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.MonthDay []
   (js-invoke java.time.MonthDay "now"))
  (^js/JSJoda.MonthDay [arg0]
   (js-invoke java.time.MonthDay "now" arg0)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.MonthDay"]))}
  (^int [^js/JSJoda.MonthDay this]
   (.monthValue this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))}
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.MonthDay other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.MonthDay"]))}
  (^js/JSJoda.Month [^js/JSJoda.MonthDay this]
   (.month this)))

(clojure.core/defn get
  {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.MonthDay this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.MonthDay" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.MonthDay this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.MonthDay" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.MonthDay this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
