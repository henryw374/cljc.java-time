(ns cljc.java-time.temporal.temporal-accessor
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.temporal :refer [TemporalAccessor]]))

(clojure.core/defn get
  {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))}
  (^boolean [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField arg0]
   (.isSupported this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.TemporalAccessor this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))
