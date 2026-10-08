(ns cljc.java-time.temporal.temporal-accessor
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAccessor]]))

(defn get
  (^int [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn get-long
  (^long [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn is-supported
  (^boolean [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.isSupported this field)))

(defn query
  (^java.lang.Object [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField field]
   (.range this field)))
