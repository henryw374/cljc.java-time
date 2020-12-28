(ns cljc.java-time.zone-id (:require [java.time :refer [ZoneId]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def short-ids (. java.time.ZoneId -SHORT_IDS))
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (. java.time.ZoneId getAvailableZoneIds)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.time.ZoneId [^java.lang.String java-lang-String49805] (. java.time.ZoneId of java-lang-String49805)) (^java.time.ZoneId [^java.lang.String java-lang-String49806 ^java.util.Map java-util-Map49807] (. java.time.ZoneId of java-lang-String49806 java-util-Map49807)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.lang.String java-lang-String49808 ^java.time.ZoneOffset java-time-ZoneOffset49809] (. java.time.ZoneId ofOffset java-lang-String49808 java-time-ZoneOffset49809)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this49810] (.toString this49810)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.ZoneId this49811 ^java.time.format.TextStyle java-time-format-TextStyle49812 ^java.util.Locale java-util-Locale49813] (.displayName this49811 java-time-format-TextStyle49812 java-util-Locale49813)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneId"]))} (^java.time.zone.ZoneRules [^java.time.ZoneId this49814] (.rules this49814)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this49815] (.id this49815)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneId"]))} (^java.time.ZoneId [^java.time.ZoneId this49816] (.normalized this49816)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^java.time.ZoneId [] (. java.time.ZoneId systemDefault)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.ZoneId [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor49817] (. java.time.ZoneId from java-time-temporal-TemporalAccessor49817)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.Integer [^java.time.ZoneId this49818] (.hashCode this49818)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZoneId this49819 ^java.lang.Object java-lang-Object49820] (.equals this49819 java-lang-Object49820)))
