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
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (js-invoke java.time.Month "values")))

(clojure.core/defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^js/JSJoda.Month [^java.lang.String name]
   (js-invoke java.time.Month "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.Month "valueOf" enum-type name)))

(clojure.core/defn of
  {:arglists '(["int"])}
  (^js/JSJoda.Month [^int month]
   (js-invoke java.time.Month "of" month)))

(clojure.core/defn ordinal
  {:arglists '(["java.time.Month"])}
  (^int [^js/JSJoda.Month this]
   (.ordinal this)))

(clojure.core/defn first-month-of-quarter
  {:arglists '(["java.time.Month"])}
  (^js/JSJoda.Month [^js/JSJoda.Month this]
   (.firstMonthOfQuarter this)))

(clojure.core/defn min-length
  {:arglists '(["java.time.Month"])}
  (^int [^js/JSJoda.Month this]
   (.minLength this)))

(clojure.core/defn plus
  {:arglists '(["java.time.Month" "long"])}
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long months]
   (.plus this months)))

(clojure.core/defn query
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.Month this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^js/JSJoda.Month this]
   (.toString this)))

(clojure.core/defn first-day-of-year
  {:arglists '(["java.time.Month" "boolean"])}
  (^int [^js/JSJoda.Month this ^boolean leap-year]
   (.firstDayOfYear this leap-year)))

(clojure.core/defn minus
  {:arglists '(["java.time.Month" "long"])}
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long months]
   (.minus this months)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.Month this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(clojure.core/defn get-value
  {:arglists '(["java.time.Month"])}
  (^int [^js/JSJoda.Month this]
   (.value this)))

(clojure.core/defn max-length
  {:arglists '(["java.time.Month"])}
  (^int [^js/JSJoda.Month this]
   (.maxLength this)))

(clojure.core/defn name
  {:arglists '(["java.time.Month"])}
  (^java.lang.String [^js/JSJoda.Month this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn length
  {:arglists '(["java.time.Month" "boolean"])}
  (^int [^js/JSJoda.Month this ^boolean leap-year]
   (.length this leap-year)))

(clojure.core/defn get-declaring-class
  {:arglists '(["java.time.Month"])}
  (^java.lang.Class [^js/JSJoda.Month this]
   (.declaringClass this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.Month "from" temporal)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.Month"])}
  (^int [^js/JSJoda.Month this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.Month" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Month this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.Month" "java.lang.Enum"])}
  (^int [^js/JSJoda.Month this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn get
  {:arglists '(["java.time.Month" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.Month" "java.lang.Object"])}
  (^boolean [^js/JSJoda.Month this ^java.lang.Object other]
   (.equals this other)))
