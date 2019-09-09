(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Month]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time Month])))
(def may (. java.time.Month -MAY))
(def december (. java.time.Month -DECEMBER))
(def june (. java.time.Month -JUNE))
(def september (. java.time.Month -SEPTEMBER))
(def february (. java.time.Month -FEBRUARY))
(def january (. java.time.Month -JANUARY))
(def november (. java.time.Month -NOVEMBER))
(def august (. java.time.Month -AUGUST))
(def july (. java.time.Month -JULY))
(def march (. java.time.Month -MARCH))
(def october (. java.time.Month -OCTOBER))
(def april (. java.time.Month -APRIL))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this2710 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2711] (.range this2710 java-time-temporal-TemporalField2711)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.Month values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String2712] (. java.time.Month valueOf java-lang-String2712)) (^java.lang.Enum [^java.lang.Class java-lang-Class2713 ^java.lang.String java-lang-String2714] (. java.time.Month valueOf java-lang-Class2713 java-lang-String2714)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int2715] (. java.time.Month of int2715)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2716] (.ordinal this2716)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this2717] (.firstMonthOfQuarter this2717)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2718] (.minLength this2718)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this2719 ^long long2720] (.plus this2719 long2720)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this2721 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2722] (.query this2721 java-time-temporal-TemporalQuery2722)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this2723] (.toString this2723)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this2724 ^java.lang.Boolean boolean2725] (.firstDayOfYear this2724 boolean2725)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this2726 ^long long2727] (.minus this2726 long2727)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this2728 ^java.time.format.TextStyle java-time-format-TextStyle2729 ^java.util.Locale java-util-Locale2730] (jti/getter displayName this2728 java-time-format-TextStyle2729 java-util-Locale2730)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2731] (jti/getter value this2731)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2732] (.maxLength this2732)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this2733] (.name this2733)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this2734 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2735] (.getLong this2734 java-time-temporal-TemporalField2735)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this2736 ^java.lang.Boolean boolean2737] (.length this2736 boolean2737)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this2738] (jti/getter declaringClass this2738)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2739] (. java.time.Month from java-time-temporal-TemporalAccessor2739)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this2740 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2741] (.isSupported this2740 java-time-temporal-TemporalField2741)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2742] (.hashCode this2742)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this2743 ^java.time.temporal.Temporal java-time-temporal-Temporal2744] (.adjustInto this2743 java-time-temporal-Temporal2744)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [this2745 G__2746] #? (:cljs (.compareTo ^java.time.Month this2745 G__2746) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2746)) (clojure.core/let [G__2746 ^"java.lang.Object" G__2746] (.compareTo ^java.time.Month this2745 G__2746)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__2746)) (clojure.core/let [G__2746 ^"java.lang.Enum" G__2746] (.compareTo ^java.time.Month this2745 G__2746)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this2747 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2748] (.get this2747 java-time-temporal-TemporalField2748)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this2749 ^java.lang.Object java-lang-Object2750] (.equals this2749 java-lang-Object2750)))
