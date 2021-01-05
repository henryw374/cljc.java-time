(ns cljc.java-time.temporal.temporal-accessor (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalAccessor]))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.TemporalAccessor this8838 ^java.time.temporal.TemporalField java-time-temporal-TemporalField8839] (.range this8838 java-time-temporal-TemporalField8839)))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.temporal.TemporalAccessor this8840 ^java.time.temporal.TemporalField java-time-temporal-TemporalField8841] (.get this8840 java-time-temporal-TemporalField8841)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^long [^java.time.temporal.TemporalAccessor this8842 ^java.time.temporal.TemporalField java-time-temporal-TemporalField8843] (.getLong this8842 java-time-temporal-TemporalField8843)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.temporal.TemporalAccessor this8844 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery8845] (.query this8844 java-time-temporal-TemporalQuery8845)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.temporal.TemporalAccessor this8846 ^java.time.temporal.TemporalField java-time-temporal-TemporalField8847] (.isSupported this8846 java-time-temporal-TemporalField8847)))
