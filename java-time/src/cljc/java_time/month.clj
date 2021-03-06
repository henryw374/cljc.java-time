(ns cljc.java-time.month (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time Month]))
(def may java.time.Month/MAY)
(def december java.time.Month/DECEMBER)
(def june java.time.Month/JUNE)
(def september java.time.Month/SEPTEMBER)
(def february java.time.Month/FEBRUARY)
(def january java.time.Month/JANUARY)
(def november java.time.Month/NOVEMBER)
(def august java.time.Month/AUGUST)
(def july java.time.Month/JULY)
(def march java.time.Month/MARCH)
(def october java.time.Month/OCTOBER)
(def april java.time.Month/APRIL)
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this26572 ^java.time.temporal.TemporalField java-time-temporal-TemporalField26573] (.range this26572 java-time-temporal-TemporalField26573)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (java.time.Month/values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String26574] (java.time.Month/valueOf java-lang-String26574)) (^java.lang.Enum [^java.lang.Class java-lang-Class26575 ^java.lang.String java-lang-String26576] (java.time.Month/valueOf java-lang-Class26575 java-lang-String26576)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int26577] (java.time.Month/of int26577)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this26578] (.ordinal this26578)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this26579] (.firstMonthOfQuarter this26579)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this26580] (.minLength this26580)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this26581 ^long long26582] (.plus this26581 long26582)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this26583 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery26584] (.query this26583 java-time-temporal-TemporalQuery26584)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this26585] (.toString this26585)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this26586 ^java.lang.Boolean boolean26587] (.firstDayOfYear this26586 boolean26587)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this26588 ^long long26589] (.minus this26588 long26589)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this26590 ^java.time.format.TextStyle java-time-format-TextStyle26591 ^java.util.Locale java-util-Locale26592] (.getDisplayName this26590 java-time-format-TextStyle26591 java-util-Locale26592)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this26593] (.getValue this26593)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this26594] (.maxLength this26594)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this26595] (.name this26595)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this26596 ^java.time.temporal.TemporalField java-time-temporal-TemporalField26597] (.getLong this26596 java-time-temporal-TemporalField26597)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this26598 ^java.lang.Boolean boolean26599] (.length this26598 boolean26599)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this26600] (.getDeclaringClass this26600)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor26601] (java.time.Month/from java-time-temporal-TemporalAccessor26601)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this26602 ^java.time.temporal.TemporalField java-time-temporal-TemporalField26603] (.isSupported this26602 java-time-temporal-TemporalField26603)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this26604] (.hashCode this26604)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this26605 ^java.time.temporal.Temporal java-time-temporal-Temporal26606] (.adjustInto this26605 java-time-temporal-Temporal26606)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [^java.time.Month this26607 ^java.lang.Enum java-lang-Enum26608] (.compareTo this26607 java-lang-Enum26608)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this26609 ^java.time.temporal.TemporalField java-time-temporal-TemporalField26610] (.get this26609 java-time-temporal-TemporalField26610)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this26611 ^java.lang.Object java-lang-Object26612] (.equals this26611 java-lang-Object26612)))
