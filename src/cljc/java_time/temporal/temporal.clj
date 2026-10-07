(ns cljc.java-time.temporal.temporal
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal Temporal]))

(clojure.core/defn range
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount amount]
   (.plus this amount))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn query
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.temporal.Temporal this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]
                     ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAmount amount]
   (.minus this amount))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn until
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long
   [^java.time.temporal.Temporal this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.temporal.Temporal this unit))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.temporal.Temporal this field))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.temporal.Temporal [^java.time.temporal.Temporal this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.temporal.Temporal
   [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn get
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.temporal.Temporal this ^java.time.temporal.TemporalField field]
   (.get this field)))
