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
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this4335 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4336] (.range this4335 java-time-temporal-TemporalField4336)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.Month values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String4337] (. java.time.Month valueOf java-lang-String4337)) (^java.lang.Enum [^java.lang.Class java-lang-Class4338 ^java.lang.String java-lang-String4339] (. java.time.Month valueOf java-lang-Class4338 java-lang-String4339)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int4340] (. java.time.Month of int4340)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4341] (.ordinal this4341)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this4342] (.firstMonthOfQuarter this4342)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4343] (.minLength this4343)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4344 ^long long4345] (.plus this4344 long4345)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this4346 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery4347] (.query this4346 java-time-temporal-TemporalQuery4347)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4348] (.toString this4348)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4349 ^java.lang.Boolean boolean4350] (.firstDayOfYear this4349 boolean4350)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4351 ^long long4352] (.minus this4351 long4352)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this4353 ^java.time.format.TextStyle java-time-format-TextStyle4354 ^java.util.Locale java-util-Locale4355] (jti/getter displayName this4353 java-time-format-TextStyle4354 java-util-Locale4355)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4356] (jti/getter value this4356)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4357] (.maxLength this4357)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4358] (.name this4358)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this4359 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4360] (.getLong this4359 java-time-temporal-TemporalField4360)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4361 ^java.lang.Boolean boolean4362] (.length this4361 boolean4362)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this4363] (jti/getter declaringClass this4363)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor4364] (. java.time.Month from java-time-temporal-TemporalAccessor4364)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this4365 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4366] (.isSupported this4365 java-time-temporal-TemporalField4366)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4367] (.hashCode this4367)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this4368 ^java.time.temporal.Temporal java-time-temporal-Temporal4369] (.adjustInto this4368 java-time-temporal-Temporal4369)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [this4370 G__4371] #? (:cljs (.compareTo ^java.time.Month this4370 G__4371) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__4371)) (clojure.core/let [G__4371 ^"java.lang.Object" G__4371] (.compareTo ^java.time.Month this4370 G__4371)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__4371)) (clojure.core/let [G__4371 ^"java.lang.Enum" G__4371] (.compareTo ^java.time.Month this4370 G__4371)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this4372 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4373] (.get this4372 java-time-temporal-TemporalField4373)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this4374 ^java.lang.Object java-lang-Object4375] (.equals this4374 java-lang-Object4375)))
