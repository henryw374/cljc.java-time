(ns cljc.java-time.temporal.temporal-unit (:import [java.time.temporal TemporalUnit]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.TemporalUnit this51037] (.isDurationEstimated this51037)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.TemporalUnit this51038] (.isDateBased this51038)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"]))} (^java.lang.Boolean [^java.time.temporal.TemporalUnit this51039 ^java.time.temporal.Temporal java-time-temporal-Temporal51040] (.isSupportedBy this51039 java-time-temporal-Temporal51040)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.TemporalUnit this51041] (.isTimeBased this51041)))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.time.Duration [^java.time.temporal.TemporalUnit this51042] (.getDuration this51042)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalUnit this51043 ^java.time.temporal.Temporal java-time-temporal-Temporal51044 ^long long51045] (.addTo this51043 java-time-temporal-Temporal51044 long51045)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^java.time.temporal.TemporalUnit this51046 ^java.time.temporal.Temporal java-time-temporal-Temporal51047 ^java.time.temporal.Temporal java-time-temporal-Temporal51048] (.between this51046 java-time-temporal-Temporal51047 java-time-temporal-Temporal51048)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.String [^java.time.temporal.TemporalUnit this51049] (.toString this51049)))
