(ns cljc.java-time.temporal.temporal
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [Temporal]]))

(defn range
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn plus
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
               ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAmount amount]
   (.plus this amount))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn query
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.Temporal this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn minus
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
               ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAmount amount]
   (.minus this amount))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn get-long
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn until
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.Temporal this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn is-supported
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]
               ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.Temporal this arg0]
   (.isSupported this arg0)))

(defn with
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"]
               ["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.Temporal [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn get
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.Temporal this ^js/JSJoda.TemporalField field]
   (.get this field)))
