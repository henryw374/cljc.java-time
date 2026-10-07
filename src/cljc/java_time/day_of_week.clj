(ns cljc.java-time.day-of-week
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time DayOfWeek)))

(def saturday java.time.DayOfWeek/SATURDAY)

(def thursday java.time.DayOfWeek/THURSDAY)

(def friday java.time.DayOfWeek/FRIDAY)

(def wednesday java.time.DayOfWeek/WEDNESDAY)

(def sunday java.time.DayOfWeek/SUNDAY)

(def monday java.time.DayOfWeek/MONDAY)

(def tuesday java.time.DayOfWeek/TUESDAY)

(defn range
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.DayOfWeek/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.DayOfWeek [^java.lang.String name]
   (java.time.DayOfWeek/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.DayOfWeek/valueOf enum-type name)))

(defn of
  {:arglists '(["int"])}
  (^java.time.DayOfWeek [^java.lang.Integer day-of-week]
   (java.time.DayOfWeek/of day-of-week)))

(defn ordinal
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.ordinal this)))

(defn plus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^java.time.DayOfWeek [^java.time.DayOfWeek this ^long days]
   (.plus this days)))

(defn query
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.DayOfWeek this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^java.time.DayOfWeek this]
   (.toString this)))

(defn minus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^java.time.DayOfWeek [^java.time.DayOfWeek this ^long days]
   (.minus this days)))

(defn get-display-name
  {:arglists '(["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^java.time.DayOfWeek this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(defn get-value
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.getValue this)))

(defn name
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^java.time.DayOfWeek this]
   (.name this)))

(defn get-long
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^long [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-declaring-class
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Class [^java.time.DayOfWeek this]
   (.getDeclaringClass this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.DayOfWeek [^java.time.temporal.TemporalAccessor temporal]
   (java.time.DayOfWeek/from temporal)))

(defn is-supported
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn hash-code
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.DayOfWeek this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn compare-to
  {:arglists '(["java.time.DayOfWeek" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.DayOfWeek this ^java.lang.Enum o]
   (.compareTo this o)))

(defn get
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.DayOfWeek" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.DayOfWeek this ^java.lang.Object other]
   (.equals this other)))
