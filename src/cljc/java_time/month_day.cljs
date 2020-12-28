(ns cljc.java-time.month-day (:require [java.time :refer [MonthDay]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn at-year {:arglists (quote (["java.time.MonthDay" "int"]))} (^java.time.LocalDate [^java.time.MonthDay this50207 ^java.lang.Integer int50208] (.atYear this50207 int50208)))
(clojure.core/defn range {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.MonthDay this50209 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50210] (.range this50209 java-time-temporal-TemporalField50210)))
(clojure.core/defn of {:arglists (quote (["java.time.Month" "int"] ["int" "int"]))} (^java.time.MonthDay [G__50212 G__50213] (. java.time.MonthDay of G__50212 G__50213)))
(clojure.core/defn with-month {:arglists (quote (["java.time.MonthDay" "int"]))} (^java.time.MonthDay [^java.time.MonthDay this50214 ^java.lang.Integer int50215] (.withMonth this50214 int50215)))
(clojure.core/defn query {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.MonthDay this50216 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery50217] (.query this50216 java-time-temporal-TemporalQuery50217)))
(clojure.core/defn to-string {:arglists (quote (["java.time.MonthDay"]))} (^java.lang.String [^java.time.MonthDay this50218] (.toString this50218)))
(clojure.core/defn is-before {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))} (^java.lang.Boolean [^java.time.MonthDay this50219 ^java.time.MonthDay java-time-MonthDay50220] (.isBefore this50219 java-time-MonthDay50220)))
(clojure.core/defn get-long {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))} (^long [^java.time.MonthDay this50221 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50222] (.getLong this50221 java-time-temporal-TemporalField50222)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.MonthDay" "int"]))} (^java.time.MonthDay [^java.time.MonthDay this50223 ^java.lang.Integer int50224] (.withDayOfMonth this50223 int50224)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.MonthDay"]))} (^java.lang.Integer [^java.time.MonthDay this50225] (.dayOfMonth this50225)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.MonthDay [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor50226] (. java.time.MonthDay from java-time-temporal-TemporalAccessor50226)))
(clojure.core/defn is-after {:arglists (quote (["java.time.MonthDay" "java.time.MonthDay"]))} (^java.lang.Boolean [^java.time.MonthDay this50227 ^java.time.MonthDay java-time-MonthDay50228] (.isAfter this50227 java-time-MonthDay50228)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.MonthDay this50229 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50230] (.isSupported this50229 java-time-temporal-TemporalField50230)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.MonthDay [^java.lang.CharSequence java-lang-CharSequence50231] (. java.time.MonthDay parse java-lang-CharSequence50231)) (^java.time.MonthDay [^java.lang.CharSequence java-lang-CharSequence50232 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter50233] (. java.time.MonthDay parse java-lang-CharSequence50232 java-time-format-DateTimeFormatter50233)))
(clojure.core/defn is-valid-year {:arglists (quote (["java.time.MonthDay" "int"]))} (^java.lang.Boolean [^java.time.MonthDay this50234 ^java.lang.Integer int50235] (.isValidYear this50234 int50235)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.MonthDay"]))} (^java.lang.Integer [^java.time.MonthDay this50236] (.hashCode this50236)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.MonthDay" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.MonthDay this50237 ^java.time.temporal.Temporal java-time-temporal-Temporal50238] (.adjustInto this50237 java-time-temporal-Temporal50238)))
(clojure.core/defn with {:arglists (quote (["java.time.MonthDay" "java.time.Month"]))} (^java.time.MonthDay [^java.time.MonthDay this50239 ^java.time.Month java-time-Month50240] (.with this50239 java-time-Month50240)))
(clojure.core/defn now {:arglists (quote (["java.time.ZoneId"] [] ["java.time.Clock"]))} (^java.time.MonthDay [G__50242] (. java.time.MonthDay now G__50242)) (^java.time.MonthDay [] (. java.time.MonthDay now)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.MonthDay"]))} (^java.lang.Integer [^java.time.MonthDay this50243] (.monthValue this50243)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.MonthDay" "java.lang.Object"] ["java.time.MonthDay" "java.time.MonthDay"]))} (^java.lang.Integer [this50244 G__50245] (.compareTo ^java.time.MonthDay this50244 G__50245)))
(clojure.core/defn get-month {:arglists (quote (["java.time.MonthDay"]))} (^java.time.Month [^java.time.MonthDay this50246] (.month this50246)))
(clojure.core/defn get {:arglists (quote (["java.time.MonthDay" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.MonthDay this50247 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50248] (.get this50247 java-time-temporal-TemporalField50248)))
(clojure.core/defn equals {:arglists (quote (["java.time.MonthDay" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.MonthDay this50249 ^java.lang.Object java-lang-Object50250] (.equals this50249 java-lang-Object50250)))
(clojure.core/defn format {:arglists (quote (["java.time.MonthDay" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.MonthDay this50251 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter50252] (.format this50251 java-time-format-DateTimeFormatter50252)))