(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal ValueRange)))

(defn get-minimum
  (^long [^java.time.temporal.ValueRange this]
   (.getMinimum this)))

(defn of
  (^java.time.temporal.ValueRange [^long min ^long max]
   (java.time.temporal.ValueRange/of min max))
  (^java.time.temporal.ValueRange [^long min ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min max-smallest max-largest))
  (^java.time.temporal.ValueRange [^long min-smallest ^long min-largest ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min-smallest min-largest max-smallest max-largest)))

(defn is-valid-value
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidValue this value)))

(defn check-valid-int-value
  (^java.lang.Integer [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidIntValue this value field)))

(defn to-string
  (^java.lang.String [^java.time.temporal.ValueRange this]
   (.toString this)))

(defn is-int-value
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isIntValue this)))

(defn get-smallest-maximum
  (^long [^java.time.temporal.ValueRange this]
   (.getSmallestMaximum this)))

(defn is-valid-int-value
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidIntValue this value)))

(defn hash-code
  (^java.lang.Integer [^java.time.temporal.ValueRange this]
   (.hashCode this)))

(defn is-fixed
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isFixed this)))

(defn get-maximum
  (^long [^java.time.temporal.ValueRange this]
   (.getMaximum this)))

(defn equals
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^java.lang.Object obj]
   (.equals this obj)))

(defn get-largest-minimum
  (^long [^java.time.temporal.ValueRange this]
   (.getLargestMinimum this)))

(defn check-valid-value
  (^long [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidValue this value field)))
