(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal ValueRange]))

(defn get-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getMinimum this)))

(defn of
  {:arglists '(["long" "long"] ["long" "long" "long"] ["long" "long" "long" "long"])}
  (^java.time.temporal.ValueRange [^long min ^long max]
   (java.time.temporal.ValueRange/of min max))
  (^java.time.temporal.ValueRange [^long min ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min max-smallest max-largest))
  (^java.time.temporal.ValueRange [^long min-smallest ^long min-largest ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min-smallest min-largest max-smallest max-largest)))

(defn is-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidValue this value)))

(defn check-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidIntValue this value field)))

(defn to-string
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.String [^java.time.temporal.ValueRange this]
   (.toString this)))

(defn is-int-value
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isIntValue this)))

(defn get-smallest-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getSmallestMaximum this)))

(defn is-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidIntValue this value)))

(defn hash-code
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Integer [^java.time.temporal.ValueRange this]
   (.hashCode this)))

(defn is-fixed
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isFixed this)))

(defn get-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getMaximum this)))

(defn equals
  {:arglists '(["java.time.temporal.ValueRange" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^java.lang.Object obj]
   (.equals this obj)))

(defn get-largest-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getLargestMinimum this)))

(defn check-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^long [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidValue this value field)))
