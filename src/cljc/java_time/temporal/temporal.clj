(ns cljc.java-time.temporal.temporal
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal Temporal)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn plus
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount amount]
   (.plus this amount))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn query
  (^java.lang.Object [^java.time.temporal.Temporal this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn minus
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount amount]
   (.minus this amount))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn get-long
  (^long [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn until
  (^long
   [^java.time.temporal.Temporal this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn is-supported
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]
               ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.temporal.Temporal this arg0]
   (cond (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn get
  (^java.lang.Integer [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.get this field)))
