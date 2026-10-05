(ns cljc.java-time.month
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Month]]))

(def may (goog.object/get java.time.Month "MAY"))

(def december (goog.object/get java.time.Month "DECEMBER"))

(def june (goog.object/get java.time.Month "JUNE"))

(def september (goog.object/get java.time.Month "SEPTEMBER"))

(def february (goog.object/get java.time.Month "FEBRUARY"))

(def january (goog.object/get java.time.Month "JANUARY"))

(def november (goog.object/get java.time.Month "NOVEMBER"))

(def august (goog.object/get java.time.Month "AUGUST"))

(def july (goog.object/get java.time.Month "JULY"))

(def march (goog.object/get java.time.Month "MARCH"))

(def october (goog.object/get java.time.Month "OCTOBER"))

(def april (goog.object/get java.time.Month "APRIL"))

(clojure.core/defn range
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Month this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.Month "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.Month [^java.lang.String arg0]
   (js-invoke java.time.Month "valueOf" arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (js-invoke java.time.Month "valueOf" arg0 arg1)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^js/JSJoda.Month [^int arg0]
   (js-invoke java.time.Month "of" arg0)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.Month"]))}
  (^int [^js/JSJoda.Month this]
   (.ordinal this)))

(clojure.core/defn first-month-of-quarter
  {:arglists (quote (["java.time.Month"]))}
  (^js/JSJoda.Month [^js/JSJoda.Month this]
   (.firstMonthOfQuarter this)))

(clojure.core/defn min-length
  {:arglists (quote (["java.time.Month"]))}
  (^int [^js/JSJoda.Month this]
   (.minLength this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Month" "long"]))}
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long arg0]
   (.plus this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Month this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.String [^js/JSJoda.Month this]
   (.toString this)))

(clojure.core/defn first-day-of-year
  {:arglists (quote (["java.time.Month" "boolean"]))}
  (^int [^js/JSJoda.Month this ^boolean arg0]
   (.firstDayOfYear this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Month" "long"]))}
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long arg0]
   (.minus this arg0)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.Month this ^js/JSJoda.TextStyle arg0 ^java.util.Locale arg1]
   (.displayName this arg0 arg1)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.Month"]))}
  (^int [^js/JSJoda.Month this]
   (.value this)))

(clojure.core/defn max-length
  {:arglists (quote (["java.time.Month"]))}
  (^int [^js/JSJoda.Month this]
   (.maxLength this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.String [^js/JSJoda.Month this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Month this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn length
  {:arglists (quote (["java.time.Month" "boolean"]))}
  (^int [^js/JSJoda.Month this ^boolean arg0]
   (.length this arg0)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.Month"]))}
  (^java.lang.Class [^js/JSJoda.Month this]
   (.declaringClass this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.Month "from" arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.Month this ^js/JSJoda.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Month"]))}
  (^int [^js/JSJoda.Month this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Month this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Month" "java.lang.Enum"]))}
  (^int [^js/JSJoda.Month this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Month this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Month" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Month this ^java.lang.Object arg0]
   (.equals this arg0)))
