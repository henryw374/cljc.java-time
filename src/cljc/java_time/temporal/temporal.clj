(ns cljc.java-time.temporal.temporal
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal Temporal]))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn query
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.temporal.Temporal this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.temporal.Temporal this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.temporal.Temporal this arg0))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.temporal.Temporal this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn get
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))
