(ns cljc.java-time.day-of-week
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [DayOfWeek]]))

(def saturday (goog.object/get java.time.DayOfWeek "SATURDAY"))

(def thursday (goog.object/get java.time.DayOfWeek "THURSDAY"))

(def friday (goog.object/get java.time.DayOfWeek "FRIDAY"))

(def wednesday (goog.object/get java.time.DayOfWeek "WEDNESDAY"))

(def sunday (goog.object/get java.time.DayOfWeek "SUNDAY"))

(def monday (goog.object/get java.time.DayOfWeek "MONDAY"))

(def tuesday (goog.object/get java.time.DayOfWeek "TUESDAY"))

(defn range
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (js-invoke java.time.DayOfWeek "values")))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^js/JSJoda.DayOfWeek [^java.lang.String name]
   (js-invoke java.time.DayOfWeek "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.DayOfWeek "valueOf" enum-type name)))

(defn of
  {:arglists '(["int"])}
  (^js/JSJoda.DayOfWeek [^int day-of-week]
   (js-invoke java.time.DayOfWeek "of" day-of-week)))

(defn ordinal
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.ordinal this)))

(defn plus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long days]
   (.plus this days)))

(defn query
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.toString this)))

(defn minus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long days]
   (.minus this days)))

(defn get-display-name
  {:arglists '(["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(defn get-value
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.value this)))

(defn name
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.name this)))

(defn get-long
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn get-declaring-class
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Class [^js/JSJoda.DayOfWeek this]
   (.declaringClass this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.DayOfWeek "from" temporal)))

(defn is-supported
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.DayOfWeek this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn compare-to
  {:arglists '(["java.time.DayOfWeek" "java.lang.Enum"])}
  (^int [^js/JSJoda.DayOfWeek this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.DayOfWeek" "java.lang.Object"])}
  (^boolean [^js/JSJoda.DayOfWeek this ^java.lang.Object other]
   (.equals this other)))
