(ns cljc.java-time.zone-id (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time ZoneId]))
(def short-ids java.time.ZoneId/SHORT_IDS)
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (java.time.ZoneId/getAvailableZoneIds)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.time.ZoneId [^java.lang.String java-lang-String7588] (java.time.ZoneId/of java-lang-String7588)) (^java.time.ZoneId [^java.lang.String java-lang-String7589 ^java.util.Map java-util-Map7590] (java.time.ZoneId/of java-lang-String7589 java-util-Map7590)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.lang.String java-lang-String7591 ^java.time.ZoneOffset java-time-ZoneOffset7592] (java.time.ZoneId/ofOffset java-lang-String7591 java-time-ZoneOffset7592)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this7593] (.toString this7593)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.ZoneId this7594 ^java.time.format.TextStyle java-time-format-TextStyle7595 ^java.util.Locale java-util-Locale7596] (.getDisplayName this7594 java-time-format-TextStyle7595 java-util-Locale7596)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneId"]))} (^java.time.zone.ZoneRules [^java.time.ZoneId this7597] (.getRules this7597)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this7598] (.getId this7598)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneId"]))} (^java.time.ZoneId [^java.time.ZoneId this7599] (.normalized this7599)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^java.time.ZoneId [] (java.time.ZoneId/systemDefault)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.ZoneId [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor7600] (java.time.ZoneId/from java-time-temporal-TemporalAccessor7600)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.Integer [^java.time.ZoneId this7601] (.hashCode this7601)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZoneId this7602 ^java.lang.Object java-lang-Object7603] (.equals this7602 java-lang-Object7603)))
