(ns cljc.java-time.temporal.value-range
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [ValueRange]]))

(clojure.core/defn get-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^js/JSJoda.ValueRange this]
   (.minimum this)))

(clojure.core/defn of
  {:arglists '(["long" "long"] ["long" "long" "long"] ["long" "long" "long" "long"])}
  (^js/JSJoda.ValueRange [^long min ^long max]
   (js-invoke java.time.temporal.ValueRange "of" min max))
  (^js/JSJoda.ValueRange [^long min ^long max-smallest ^long max-largest]
   (js-invoke java.time.temporal.ValueRange "of" min max-smallest max-largest))
  (^js/JSJoda.ValueRange [^long min-smallest ^long min-largest ^long max-smallest ^long max-largest]
   (js-invoke java.time.temporal.ValueRange "of" min-smallest min-largest max-smallest max-largest)))

(clojure.core/defn is-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^boolean [^js/JSJoda.ValueRange this ^long value]
   (.isValidValue this value)))

(clojure.core/defn check-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.ValueRange this ^long value ^js/JSJoda.TemporalField field]
   (.checkValidIntValue this value field)))

(clojure.core/defn to-string
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^java.lang.String [^js/JSJoda.ValueRange this]
   (.toString this)))

(clojure.core/defn is-int-value
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^boolean [^js/JSJoda.ValueRange this]
   (.isIntValue this)))

(clojure.core/defn get-smallest-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^js/JSJoda.ValueRange this]
   (.smallestMaximum this)))

(clojure.core/defn is-valid-int-value
  {:arglists '(["java.time.temporal.ValueRange" "long"])}
  (^boolean [^js/JSJoda.ValueRange this ^long value]
   (.isValidIntValue this value)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^int [^js/JSJoda.ValueRange this]
   (.hashCode this)))

(clojure.core/defn is-fixed
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^boolean [^js/JSJoda.ValueRange this]
   (.isFixed this)))

(clojure.core/defn get-maximum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^js/JSJoda.ValueRange this]
   (.maximum this)))

(clojure.core/defn equals
  {:arglists '(["java.time.temporal.ValueRange" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ValueRange this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn get-largest-minimum
  {:arglists '(["java.time.temporal.ValueRange"])}
  (^long [^js/JSJoda.ValueRange this]
   (.largestMinimum this)))

(clojure.core/defn check-valid-value
  {:arglists '(["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.ValueRange this ^long value ^js/JSJoda.TemporalField field]
   (.checkValidValue this value field)))
