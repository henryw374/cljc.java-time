(ns cljc.java-time.day-of-week
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time DayOfWeek]))

(def saturday java.time.DayOfWeek/SATURDAY)

(def thursday java.time.DayOfWeek/THURSDAY)

(def friday java.time.DayOfWeek/FRIDAY)

(def wednesday java.time.DayOfWeek/WEDNESDAY)

(def sunday java.time.DayOfWeek/SUNDAY)

(def monday java.time.DayOfWeek/MONDAY)

(def tuesday java.time.DayOfWeek/TUESDAY)

(clojure.core/defn range
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (java.time.DayOfWeek/values)))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^java.time.DayOfWeek [^java.lang.String name]
   (java.time.DayOfWeek/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.DayOfWeek/valueOf enum-type name)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^java.time.DayOfWeek [^java.lang.Integer day-of-week]
   (java.time.DayOfWeek/of day-of-week)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.ordinal this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.DayOfWeek" "long"]))}
  (^java.time.DayOfWeek [^java.time.DayOfWeek this ^long days]
   (.plus this days)))

(clojure.core/defn query
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.DayOfWeek this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.String [^java.time.DayOfWeek this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.DayOfWeek" "long"]))}
  (^java.time.DayOfWeek [^java.time.DayOfWeek this ^long days]
   (.minus this days)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^java.time.DayOfWeek this ^java.time.format.TextStyle style ^java.util.Locale locale]
   (.getDisplayName this style locale)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.getValue this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.String [^java.time.DayOfWeek this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.Class [^java.time.DayOfWeek this]
   (.getDeclaringClass this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.DayOfWeek [^java.time.temporal.TemporalAccessor temporal]
   (java.time.DayOfWeek/from temporal)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.Integer [^java.time.DayOfWeek this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.DayOfWeek this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.DayOfWeek" "java.lang.Enum"]))}
  (^java.lang.Integer [^java.time.DayOfWeek this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn get
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.DayOfWeek this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.DayOfWeek this ^java.lang.Object other]
   (.equals this other)))
