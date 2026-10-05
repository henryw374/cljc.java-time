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
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.DayOfWeek "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.DayOfWeek [^java.lang.String arg0]
   (js-invoke java.time.DayOfWeek "valueOf" arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (js-invoke java.time.DayOfWeek "valueOf" arg0 arg1)))

(clojure.core/defn of
  {:arglists (quote (["int"]))}
  (^js/JSJoda.DayOfWeek [^int arg0]
   (js-invoke java.time.DayOfWeek "of" arg0)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^int [^js/JSJoda.DayOfWeek this]
   (.ordinal this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.DayOfWeek" "long"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long arg0]
   (.plus this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.DayOfWeek" "long"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this ^long arg0]
   (.minus this arg0)))

(clojure.core/defn get-display-name
  {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))}
  (^java.lang.String [^js/JSJoda.DayOfWeek this ^js/JSJoda.TextStyle arg0 ^java.util.Locale arg1]
   (.displayName this arg0 arg1)))

(clojure.core/defn get-value
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^int [^js/JSJoda.DayOfWeek this]
   (.value this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.String [^js/JSJoda.DayOfWeek this]
   (.name this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^java.lang.Class [^js/JSJoda.DayOfWeek this]
   (.declaringClass this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.DayOfWeek "from" arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.DayOfWeek"]))}
  (^int [^js/JSJoda.DayOfWeek this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.DayOfWeek this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.DayOfWeek" "java.lang.Enum"]))}
  (^int [^js/JSJoda.DayOfWeek this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.DayOfWeek this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.DayOfWeek this ^java.lang.Object arg0]
   (.equals this arg0)))
