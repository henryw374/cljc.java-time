(ns cljc.java-time.temporal.temporal-accessor
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAccessor]]))

(defn get
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn get-long
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn is-supported
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^boolean [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn query
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn range
  {:arglists '(["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.range this field)))
