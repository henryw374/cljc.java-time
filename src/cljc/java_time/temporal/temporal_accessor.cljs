(ns cljc.java-time.temporal.temporal-accessor (:require [java.time.temporal :refer [TemporalAccessor]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.temporal.TemporalAccessor this51019 ^java.time.temporal.TemporalField java-time-temporal-TemporalField51020] (.get this51019 java-time-temporal-TemporalField51020)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^long [^java.time.temporal.TemporalAccessor this51021 ^java.time.temporal.TemporalField java-time-temporal-TemporalField51022] (.getLong this51021 java-time-temporal-TemporalField51022)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.temporal.TemporalAccessor this51023 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery51024] (.query this51023 java-time-temporal-TemporalQuery51024)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.temporal.TemporalAccessor this51025 ^java.time.temporal.TemporalField java-time-temporal-TemporalField51026] (.isSupported this51025 java-time-temporal-TemporalField51026)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.TemporalAccessor this51027 ^java.time.temporal.TemporalField java-time-temporal-TemporalField51028] (.range this51027 java-time-temporal-TemporalField51028)))
