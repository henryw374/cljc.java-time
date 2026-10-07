(ns cljc.java-time.temporal.temporal-accessor
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalAccessor]))

(defn get
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn get-long
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^long [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn is-supported
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^java.lang.Boolean [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.isSupported this field)))

(defn query
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn range
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.temporal.TemporalAccessor this ^java.time.temporal.TemporalField field]
   (.range this field)))
