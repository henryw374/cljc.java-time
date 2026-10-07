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

(clojure.core/defn range
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (js-invoke java.time.DayOfWeek "values")))

(clojure.core/defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^js/JSJoda.DayOfWeek [^java.lang.String name]
   (js-invoke java.time.DayOfWeek "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.DayOfWeek "valueOf" enum-type name)))

(clojure.core/defn of
  {:arglists '(["int"])}
  (^js/JSJoda.DayOfWeek [^int day-of-week]
   (js-invoke java.time.DayOfWeek "of" day-of-week)))

(clojure.core/defn ordinal
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.ordinal this)))

(clojure.core/defn plus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long days]
   (.plus this days)))

(clojure.core/defn query
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists '(["java.time.DayOfWeek" "long"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long days]
   (.minus this days)))

(clojure.core/defn get-display-name
  {:arglists '(["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this ^js/JSJoda.TextStyle style ^java.util.Locale locale]
   (.displayName this style locale)))

(clojure.core/defn get-value
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.value this)))

(clojure.core/defn name
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-declaring-class
  {:arglists '(["java.time.DayOfWeek"])}
  (^java.lang.Class [^js/JSJoda.DayOfWeek this]
   (.declaringClass this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.DayOfWeek "from" temporal)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.DayOfWeek"])}
  (^int [^js/JSJoda.DayOfWeek this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.DayOfWeek this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.DayOfWeek" "java.lang.Enum"])}
  (^int [^js/JSJoda.DayOfWeek this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn get
  {:arglists '(["java.time.DayOfWeek" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.DayOfWeek" "java.lang.Object"])}
  (^boolean [^js/JSJoda.DayOfWeek this ^java.lang.Object other]
   (.equals this other)))
