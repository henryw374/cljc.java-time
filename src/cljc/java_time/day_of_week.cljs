(ns cljc.java-time.day-of-week (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time :refer [DayOfWeek]]))
(def saturday (goog.object/get java.time.DayOfWeek "SATURDAY"))
(def thursday (goog.object/get java.time.DayOfWeek "THURSDAY"))
(def friday (goog.object/get java.time.DayOfWeek "FRIDAY"))
(def wednesday (goog.object/get java.time.DayOfWeek "WEDNESDAY"))
(def sunday (goog.object/get java.time.DayOfWeek "SUNDAY"))
(def monday (goog.object/get java.time.DayOfWeek "MONDAY"))
(def tuesday (goog.object/get java.time.DayOfWeek "TUESDAY"))
(clojure.core/defn range {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.DayOfWeek this14538 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14539] (.range this14538 java-time-temporal-TemporalField14539)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.DayOfWeek "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.DayOfWeek [^java.lang.String java-lang-String14540] (js-invoke java.time.DayOfWeek "valueOf" java-lang-String14540)) (^java.lang.Enum [^java.lang.Class java-lang-Class14541 ^java.lang.String java-lang-String14542] (js-invoke java.time.DayOfWeek "valueOf" java-lang-Class14541 java-lang-String14542)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^js/JSJoda.DayOfWeek [^int int14543] (js-invoke java.time.DayOfWeek "of" int14543)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this14544] (.ordinal this14544)))
(clojure.core/defn plus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this14545 ^long long14546] (.plus this14545 long14546)))
(clojure.core/defn query {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.DayOfWeek this14547 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery14548] (.query this14547 java-time-temporal-TemporalQuery14548)))
(clojure.core/defn to-string {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this14549] (.toString this14549)))
(clojure.core/defn minus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this14550 ^long long14551] (.minus this14550 long14551)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this14552 ^js/JSJoda.TextStyle java-time-format-TextStyle14553 ^java.util.Locale java-util-Locale14554] (.displayName this14552 java-time-format-TextStyle14553 java-util-Locale14554)))
(clojure.core/defn get-value {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this14555] (.value this14555)))
(clojure.core/defn name {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this14556] (.name this14556)))
(clojure.core/defn get-long {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.DayOfWeek this14557 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14558] (.getLong this14557 java-time-temporal-TemporalField14558)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Class [^js/JSJoda.DayOfWeek this14559] (.declaringClass this14559)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor14560] (js-invoke java.time.DayOfWeek "from" java-time-temporal-TemporalAccessor14560)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.DayOfWeek this14561 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14562] (.isSupported this14561 java-time-temporal-TemporalField14562)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this14563] (.hashCode this14563)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.DayOfWeek this14564 ^js/JSJoda.Temporal java-time-temporal-Temporal14565] (.adjustInto this14564 java-time-temporal-Temporal14565)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.DayOfWeek" "java.lang.Enum"]))} (^int [^js/JSJoda.DayOfWeek this14566 ^java.lang.Enum java-lang-Enum14567] (.compareTo this14566 java-lang-Enum14567)))
(clojure.core/defn get {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.DayOfWeek this14568 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14569] (.get this14568 java-time-temporal-TemporalField14569)))
(clojure.core/defn equals {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))} (^boolean [^js/JSJoda.DayOfWeek this14570 ^java.lang.Object java-lang-Object14571] (.equals this14570 java-lang-Object14571)))
