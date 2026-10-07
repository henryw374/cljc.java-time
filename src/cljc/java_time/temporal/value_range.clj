(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal ValueRange]))

(clojure.core/defn get-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getMinimum this)))

(clojure.core/defn of
  {:arglists '(["long" "long"] ["long" "long" "long"] ["long" "long" "long" "long"])}
  (^java.time.temporal.ValueRange [^long min ^long max]
   (java.time.temporal.ValueRange/of min max))
  (^java.time.temporal.ValueRange [^long min ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min max-smallest max-largest))
  (^java.time.temporal.ValueRange [^long min-smallest ^long min-largest ^long max-smallest ^long max-largest]
   (java.time.temporal.ValueRange/of min-smallest min-largest max-smallest max-largest)))

(clojure.core/defn is-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidValue this value)))

(clojure.core/defn check-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidIntValue this value field)))

(clojure.core/defn to-string
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.String [^java.time.temporal.ValueRange this]
   (.toString this)))

(clojure.core/defn is-int-value
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isIntValue this)))

(clojure.core/defn get-smallest-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getSmallestMaximum this)))

(clojure.core/defn is-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^long value]
   (.isValidIntValue this value)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Integer [^java.time.temporal.ValueRange this]
   (.hashCode this)))

(clojure.core/defn is-fixed
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this]
   (.isFixed this)))

(clojure.core/defn get-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getMaximum this)))

(clojure.core/defn equals
  {:arglists '(["java.time.temporal.ValueRange" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.temporal.ValueRange this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn get-largest-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^java.time.temporal.ValueRange this]
   (.getLargestMinimum this)))

(clojure.core/defn check-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^long [^java.time.temporal.ValueRange this ^long value ^java.time.temporal.TemporalField field]
   (.checkValidValue this value field)))
