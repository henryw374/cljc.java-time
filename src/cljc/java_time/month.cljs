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

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn values
  (^"java.lang.Class" []
   (js-invoke java.time.Month "values")))

(defn value-of
  (^js/JSJoda.Month [^java.lang.String name]
   (js-invoke java.time.Month "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.Month "valueOf" enum-type name)))

(defn of
  (^js/JSJoda.Month [^int month]
   (js-invoke java.time.Month "of" month)))

(defn ordinal
  (^int [^js/JSJoda.Month this]
   (.ordinal this)))

(defn first-month-of-quarter
  (^js/JSJoda.Month [^js/JSJoda.Month this]
   (.firstMonthOfQuarter this)))

(defn min-length
  (^int [^js/JSJoda.Month this]
   (.minLength this)))

(defn plus
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long months]
   (.plus this months)))

(defn query
  (^java.lang.Object [^js/JSJoda.Month this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^js/JSJoda.Month this]
   (.toString this)))

(defn first-day-of-year
  (^int [^js/JSJoda.Month this ^boolean leap-year]
   (.firstDayOfYear this leap-year)))

(defn minus
  (^js/JSJoda.Month [^js/JSJoda.Month this ^long months]
   (.minus this months)))

(defn get-display-name
  (^java.lang.String [^js/JSJoda.Month this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(defn get-value
  (^int [^js/JSJoda.Month this]
   (.value this)))

(defn max-length
  (^int [^js/JSJoda.Month this]
   (.maxLength this)))

(defn name
  (^java.lang.String [^js/JSJoda.Month this]
   (.name this)))

(defn get-long
  (^long [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn length
  (^int [^js/JSJoda.Month this ^boolean leap-year]
   (.length this leap-year)))

(defn get-declaring-class
  (^java.lang.Class [^js/JSJoda.Month this]
   (.declaringClass this)))

(defn from
  (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.Month "from" temporal)))

(defn is-supported
  (^boolean [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  (^int [^js/JSJoda.Month this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.Month this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn compare-to
  (^int [^js/JSJoda.Month this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get
  (^int [^js/JSJoda.Month this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.Month this ^java.lang.Object other]
   (.equals this other)))
