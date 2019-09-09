(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [Temporal]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.temporal Temporal])))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.Temporal this3080 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3081] (.range this3080 java-time-temporal-TemporalField3081)))
(clojure.core/defn plus {:arglists (quote (["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3082 ^long long3083 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3084] (.plus this3082 long3083 java-time-temporal-TemporalUnit3084)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3085 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount3086] (.plus this3085 java-time-temporal-TemporalAmount3086)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.temporal.Temporal this3087 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery3088] (.query this3087 java-time-temporal-TemporalQuery3088)))
(clojure.core/defn minus {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"] ["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3089 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount3090] (.minus this3089 java-time-temporal-TemporalAmount3090)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3091 ^long long3092 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3093] (.minus this3091 long3092 java-time-temporal-TemporalUnit3093)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^long [^java.time.temporal.Temporal this3094 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3095] (.getLong this3094 java-time-temporal-TemporalField3095)))
(clojure.core/defn until {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.temporal.Temporal this3096 ^java.time.temporal.Temporal java-time-temporal-Temporal3097 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3098] (.until this3096 java-time-temporal-Temporal3097 java-time-temporal-TemporalUnit3098)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this3099 G__3100] #? (:cljs (.isSupported ^java.time.temporal.Temporal this3099 G__3100) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3100)) (clojure.core/let [G__3100 ^"java.time.temporal.TemporalUnit" G__3100] (.isSupported ^java.time.temporal.Temporal this3099 G__3100)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__3100)) (clojure.core/let [G__3100 ^"java.time.temporal.TemporalField" G__3100] (.isSupported ^java.time.temporal.Temporal this3099 G__3100)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3101 ^java.time.temporal.TemporalAdjuster java-time-temporal-TemporalAdjuster3102] (.with this3101 java-time-temporal-TemporalAdjuster3102)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this3103 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3104 ^long long3105] (.with this3103 java-time-temporal-TemporalField3104 long3105)))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.temporal.Temporal this3106 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3107] (.get this3106 java-time-temporal-TemporalField3107)))
