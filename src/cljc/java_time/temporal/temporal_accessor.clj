(ns cljc.java-time.temporal.temporal-accessor
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.temporal TemporalAccessor)))

(defn get
  (^java.lang.Integer [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn get-long
  (^long [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn is-supported
  (^java.lang.Boolean [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn query
  (^java.lang.Object [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.range this field)))
