(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [ValueRange]]))

(defn get-minimum
  (^long [^js/JSJoda.ValueRange this]
   (.minimum this)))

(defn of
  (^js/JSJoda.ValueRange [^long min ^long max]
   (js-invoke java.time.temporal.ValueRange "of" min max))
  (^js/JSJoda.ValueRange [^long min ^long max-smallest ^long max-largest]
   (js-invoke java.time.temporal.ValueRange "of" min max-smallest max-largest))
  (^js/JSJoda.ValueRange [^long min-smallest ^long min-largest ^long max-smallest ^long max-largest]
   (js-invoke java.time.temporal.ValueRange "of" min-smallest min-largest max-smallest max-largest)))

(defn is-valid-value
  (^boolean [^js/JSJoda.ValueRange this ^long value]
   (.isValidValue this value)))

(defn check-valid-int-value
  (^int [^js/JSJoda.ValueRange this ^long value ^js/JSJoda.TemporalField field]
   (.checkValidIntValue this value field)))

(defn to-string
  (^java.lang.String [^js/JSJoda.ValueRange this]
   (.toString this)))

(defn is-int-value
  (^boolean [^js/JSJoda.ValueRange this]
   (.isIntValue this)))

(defn get-smallest-maximum
  (^long [^js/JSJoda.ValueRange this]
   (.smallestMaximum this)))

(defn is-valid-int-value
  (^boolean [^js/JSJoda.ValueRange this ^long value]
   (.isValidIntValue this value)))

(defn hash-code
  (^int [^js/JSJoda.ValueRange this]
   (.hashCode this)))

(defn is-fixed
  (^boolean [^js/JSJoda.ValueRange this]
   (.isFixed this)))

(defn get-maximum
  (^long [^js/JSJoda.ValueRange this]
   (.maximum this)))

(defn equals
  (^boolean [^js/JSJoda.ValueRange this ^java.lang.Object obj]
   (.equals this obj)))

(defn get-largest-minimum
  (^long [^js/JSJoda.ValueRange this]
   (.largestMinimum this)))

(defn check-valid-value
  (^long [^js/JSJoda.ValueRange this ^long value ^js/JSJoda.TemporalField field]
   (.checkValidValue this value field)))
