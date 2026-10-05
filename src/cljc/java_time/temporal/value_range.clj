(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal ValueRange]))

(clojure.core/defn get-minimum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^java.time.temporal.ValueRange this]
   (.getMinimum this)))

(clojure.core/defn of
  {:arglists (quote (["long" "long"] ["long" "long" "long"] ["long" "long" "long" "long"]))}
  (^java.time.temporal.ValueRange [^long arg0 ^long arg1]
   (java.time.temporal.ValueRange/of arg0 arg1))
  (^java.time.temporal.ValueRange [^long arg0 ^long arg1 ^long arg2]
   (java.time.temporal.ValueRange/of arg0 arg1 arg2))
  (^java.time.temporal.ValueRange [^long arg0 ^long arg1 ^long arg2 ^long arg3]
   (java.time.temporal.ValueRange/of arg0 arg1 arg2 arg3)))

(clojure.core/defn is-valid-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long"]))}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long arg0]
   (.isValidValue this arg0)))

(clojure.core/defn check-valid-int-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.temporal.ValueRange this ^long arg0 ^java.time.temporal.TemporalField arg1]
   (.checkValidIntValue this arg0 arg1)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^java.lang.String [^java.time.temporal.ValueRange this]
   (.toString this)))

(clojure.core/defn is-int-value
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isIntValue this)))

(clojure.core/defn get-smallest-maximum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^java.time.temporal.ValueRange this]
   (.getSmallestMaximum this)))

(clojure.core/defn is-valid-int-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long"]))}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long arg0]
   (.isValidIntValue this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^java.lang.Integer [^java.time.temporal.ValueRange this]
   (.hashCode this)))

(clojure.core/defn is-fixed
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isFixed this)))

(clojure.core/defn get-maximum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^java.time.temporal.ValueRange this]
   (.getMaximum this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.temporal.ValueRange" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn get-largest-minimum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^java.time.temporal.ValueRange this]
   (.getLargestMinimum this)))

(clojure.core/defn check-valid-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.temporal.ValueRange this ^long arg0 ^java.time.temporal.TemporalField arg1]
   (.checkValidValue this arg0 arg1)))
