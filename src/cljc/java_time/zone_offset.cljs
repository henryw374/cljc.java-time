(ns cljc.java-time.zone-offset (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time :refer [ZoneOffset]]))
(def max (goog.object/get java.time.ZoneOffset "MAX"))
(def min (goog.object/get java.time.ZoneOffset "MIN"))
(def utc (goog.object/get java.time.ZoneOffset "UTC"))
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (js-invoke java.time.ZoneOffset "getAvailableZoneIds")))
(clojure.core/defn range {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.ZoneOffset this8590 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8591] (.range this8590 java-time-temporal-TemporalField8591)))
(clojure.core/defn of-total-seconds {:arglists (quote (["int"]))} (^js/JSJoda.ZoneOffset [^int int8592] (js-invoke java.time.ZoneOffset "ofTotalSeconds" int8592)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.lang.Object [G__8594] (js-invoke java.time.ZoneOffset "of" G__8594)) (^js/JSJoda.ZoneId [^java.lang.String java-lang-String8595 ^java.util.Map java-util-Map8596] (js-invoke java.time.ZoneOffset "of" java-lang-String8595 java-util-Map8596)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^js/JSJoda.ZoneId [^java.lang.String java-lang-String8597 ^js/JSJoda.ZoneOffset java-time-ZoneOffset8598] (js-invoke java.time.ZoneOffset "ofOffset" java-lang-String8597 java-time-ZoneOffset8598)))
(clojure.core/defn query {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.ZoneOffset this8599 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery8600] (.query this8599 java-time-temporal-TemporalQuery8600)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^js/JSJoda.ZoneOffset this8601] (.toString this8601)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.ZoneOffset this8602 ^js/JSJoda.TextStyle java-time-format-TextStyle8603 ^java.util.Locale java-util-Locale8604] (.displayName this8602 java-time-format-TextStyle8603 java-util-Locale8604)))
(clojure.core/defn get-long {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.ZoneOffset this8605 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8606] (.getLong this8605 java-time-temporal-TemporalField8606)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneOffset"]))} (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneOffset this8607] (.rules this8607)))
(clojure.core/defn of-hours {:arglists (quote (["int"]))} (^js/JSJoda.ZoneOffset [^int int8608] (js-invoke java.time.ZoneOffset "ofHours" int8608)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^js/JSJoda.ZoneOffset this8609] (.id this8609)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneOffset"]))} (^js/JSJoda.ZoneId [^js/JSJoda.ZoneOffset this8610] (.normalized this8610)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^js/JSJoda.ZoneId [] (js-invoke java.time.ZoneOffset "systemDefault")))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [G__8612] (js-invoke java.time.ZoneOffset "from" G__8612)))
(clojure.core/defn of-hours-minutes-seconds {:arglists (quote (["int" "int" "int"]))} (^js/JSJoda.ZoneOffset [^int int8613 ^int int8614 ^int int8615] (js-invoke java.time.ZoneOffset "ofHoursMinutesSeconds" int8613 int8614 int8615)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.ZoneOffset this8616 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8617] (.isSupported this8616 java-time-temporal-TemporalField8617)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneOffset"]))} (^int [^js/JSJoda.ZoneOffset this8618] (.hashCode this8618)))
(clojure.core/defn get-total-seconds {:arglists (quote (["java.time.ZoneOffset"]))} (^int [^js/JSJoda.ZoneOffset this8619] (.totalSeconds this8619)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.ZoneOffset this8620 ^js/JSJoda.Temporal java-time-temporal-Temporal8621] (.adjustInto this8620 java-time-temporal-Temporal8621)))
(clojure.core/defn of-hours-minutes {:arglists (quote (["int" "int"]))} (^js/JSJoda.ZoneOffset [^int int8622 ^int int8623] (js-invoke java.time.ZoneOffset "ofHoursMinutes" int8622 int8623)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"] ["java.time.ZoneOffset" "java.lang.Object"]))} (^int [this8624 G__8625] (.compareTo ^js/JSJoda.ZoneOffset this8624 G__8625)))
(clojure.core/defn get {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.ZoneOffset this8626 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8627] (.get this8626 java-time-temporal-TemporalField8627)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))} (^boolean [^js/JSJoda.ZoneOffset this8628 ^java.lang.Object java-lang-Object8629] (.equals this8628 java-lang-Object8629)))
