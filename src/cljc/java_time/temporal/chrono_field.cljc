(ns cljc.java-time.temporal.chrono-field (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoField]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.temporal ChronoField])))
(def milli-of-second (. java.time.temporal.ChronoField -MILLI_OF_SECOND))
public static void main
(def year-of-era (. java.time.temporal.ChronoField -YEAR_OF_ERA))
(def clock-hour-of-day (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_DAY))
(def era (. java.time.temporal.ChronoField -ERA))
(def instant-seconds (. java.time.temporal.ChronoField -INSTANT_SECONDS))
(def ampm-of-day (. java.time.temporal.ChronoField -AMPM_OF_DAY))
(def offset-seconds (. java.time.temporal.ChronoField -OFFSET_SECONDS))
(def nano-of-second (. java.time.temporal.ChronoField -NANO_OF_SECOND))
(def nano-of-day (. java.time.temporal.ChronoField -NANO_OF_DAY))
(def aligned-day-of-week-in-month (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_MONTH))
(def month-of-year (. java.time.temporal.ChronoField -MONTH_OF_YEAR))
(def hour-of-ampm (. java.time.temporal.ChronoField -HOUR_OF_AMPM))
(def year (. java.time.temporal.ChronoField -YEAR))
(def micro-of-second (. java.time.temporal.ChronoField -MICRO_OF_SECOND))
(def aligned-week-of-year (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_YEAR))
(def proleptic-month (. java.time.temporal.ChronoField -PROLEPTIC_MONTH))
(def day-of-month (. java.time.temporal.ChronoField -DAY_OF_MONTH))
(def second-of-minute (. java.time.temporal.ChronoField -SECOND_OF_MINUTE))
(def second-of-day (. java.time.temporal.ChronoField -SECOND_OF_DAY))
(def epoch-day (. java.time.temporal.ChronoField -EPOCH_DAY))
(def day-of-year (. java.time.temporal.ChronoField -DAY_OF_YEAR))
(def aligned-week-of-month (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_MONTH))
(def day-of-week (. java.time.temporal.ChronoField -DAY_OF_WEEK))
(def clock-hour-of-ampm (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_AMPM))
(def minute-of-day (. java.time.temporal.ChronoField -MINUTE_OF_DAY))
(def aligned-day-of-week-in-year (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_YEAR))
(def minute-of-hour (. java.time.temporal.ChronoField -MINUTE_OF_HOUR))
(def hour-of-day (. java.time.temporal.ChronoField -HOUR_OF_DAY))
(def milli-of-day (. java.time.temporal.ChronoField -MILLI_OF_DAY))
(def micro-of-day (. java.time.temporal.ChronoField -MICRO_OF_DAY))
(clojure.core/defn get-range-unit {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.ChronoField this3087] (jti/getter rangeUnit this3087)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this3088] (.range this3088)))
(clojure.core/defn values {:arglists (quote (["java.time.temporal.ChronoField"]))} (^"java.lang.Class" [] (. java.time.temporal.ChronoField values)))
(clojure.core/defn value-of {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.String"] ["java.time.temporal.ChronoField" "java.lang.Class" "java.lang.String"]))} (^java.time.temporal.ChronoField [^java.lang.String java-lang-String3089] (. java.time.temporal.ChronoField valueOf java-lang-String3089)) (^java.lang.Enum [^java.lang.Class java-lang-Class3090 ^java.lang.String java-lang-String3091] (. java.time.temporal.ChronoField valueOf java-lang-Class3090 java-lang-String3091)))
(clojure.core/defn resolve {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Map" "java.time.temporal.TemporalAccessor" "java.time.format.ResolverStyle"]))} (^java.time.temporal.TemporalAccessor [^java.time.temporal.ChronoField this3092 ^java.util.Map java-util-Map3093 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor3094 ^java.time.format.ResolverStyle java-time-format-ResolverStyle3095] (.resolve this3092 java-util-Map3093 java-time-temporal-TemporalAccessor3094 java-time-format-ResolverStyle3095)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this3096] (.ordinal this3096)))
(clojure.core/defn check-valid-int-value {:arglists (quote (["java.time.temporal.ChronoField" "long"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this3097 ^long long3098] (.checkValidIntValue this3097 long3098)))
(clojure.core/defn get-base-unit {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.ChronoField this3099] (jti/getter baseUnit this3099)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.String [^java.time.temporal.ChronoField this3100] (.toString this3100)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this3101] (.isDateBased this3101)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Locale"]))} (^java.lang.String [^java.time.temporal.ChronoField this3102 ^java.util.Locale java-util-Locale3103] (jti/getter displayName this3102 java-util-Locale3103)))
(clojure.core/defn name {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.String [^java.time.temporal.ChronoField this3104] (.name this3104)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this3105 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor3106] (.isSupportedBy this3105 java-time-temporal-TemporalAccessor3106)))
(clojure.core/defn range-refined-by {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this3107 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor3108] (.rangeRefinedBy this3107 java-time-temporal-TemporalAccessor3108)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Class [^java.time.temporal.ChronoField this3109] (jti/getter declaringClass this3109)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this3110] (.hashCode this3110)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.ChronoField this3111 ^java.time.temporal.Temporal java-time-temporal-Temporal3112 ^long long3113] (.adjustInto this3111 java-time-temporal-Temporal3112 long3113)))
(clojure.core/defn get-from {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^long [^java.time.temporal.ChronoField this3114 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor3115] (jti/getter from this3114 java-time-temporal-TemporalAccessor3115)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Object"] ["java.time.temporal.ChronoField" "java.lang.Enum"]))} (^java.lang.Integer [this3116 G__3117] #? (:cljs (.compareTo ^java.time.temporal.ChronoField this3116 G__3117) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__3117)) (clojure.core/let [G__3117 ^"java.lang.Object" G__3117] (.compareTo ^java.time.temporal.ChronoField this3116 G__3117)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__3117)) (clojure.core/let [G__3117 ^"java.lang.Enum" G__3117] (.compareTo ^java.time.temporal.ChronoField this3116 G__3117)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this3118 ^java.lang.Object java-lang-Object3119] (.equals this3118 java-lang-Object3119)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this3120] (.isTimeBased this3120)))
(clojure.core/defn check-valid-value {:arglists (quote (["java.time.temporal.ChronoField" "long"]))} (^long [^java.time.temporal.ChronoField this3121 ^long long3122] (.checkValidValue this3121 long3122)))
