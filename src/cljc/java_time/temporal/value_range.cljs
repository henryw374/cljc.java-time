(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [ValueRange]]))

(clojure.core/defn get-minimum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^js/JSJoda.ValueRange this]
   (.minimum this)))

(clojure.core/defn of
  {:arglists (quote (["long" "long"] ["long" "long" "long"] ["long" "long" "long" "long"]))}
  (^js/JSJoda.ValueRange [^long arg0 ^long arg1]
   (js-invoke java.time.temporal.ValueRange "of" arg0 arg1))
  (^js/JSJoda.ValueRange [^long arg0 ^long arg1 ^long arg2]
   (js-invoke java.time.temporal.ValueRange "of" arg0 arg1 arg2))
  (^js/JSJoda.ValueRange [^long arg0 ^long arg1 ^long arg2 ^long arg3]
   (js-invoke java.time.temporal.ValueRange "of" arg0 arg1 arg2 arg3)))

(clojure.core/defn is-valid-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long"]))}
  (^boolean [^js/JSJoda.ValueRange this ^long arg0]
   (.isValidValue this arg0)))

(clojure.core/defn check-valid-int-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.ValueRange this ^long arg0 ^js/JSJoda.TemporalField arg1]
   (.checkValidIntValue this arg0 arg1)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^java.lang.String [^js/JSJoda.ValueRange this]
   (.toString this)))

(clojure.core/defn is-int-value
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^boolean [^js/JSJoda.ValueRange this]
   (.isIntValue this)))

(clojure.core/defn get-smallest-maximum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^js/JSJoda.ValueRange this]
   (.smallestMaximum this)))

(clojure.core/defn is-valid-int-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long"]))}
  (^boolean [^js/JSJoda.ValueRange this ^long arg0]
   (.isValidIntValue this arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^int [^js/JSJoda.ValueRange this]
   (.hashCode this)))

(clojure.core/defn is-fixed
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^boolean [^js/JSJoda.ValueRange this]
   (.isFixed this)))

(clojure.core/defn get-maximum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^js/JSJoda.ValueRange this]
   (.maximum this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.temporal.ValueRange" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ValueRange this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn get-largest-minimum
  {:arglists (quote (["java.time.temporal.ValueRange"]))}
  (^long [^js/JSJoda.ValueRange this]
   (.largestMinimum this)))

(clojure.core/defn check-valid-value
  {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.ValueRange this ^long arg0 ^js/JSJoda.TemporalField arg1]
   (.checkValidValue this arg0 arg1)))
