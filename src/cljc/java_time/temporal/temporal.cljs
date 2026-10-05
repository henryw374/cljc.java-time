(ns cljc.java-time.temporal.temporal
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [Temporal]]))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn query
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Temporal this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Temporal this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Temporal this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn get
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))
