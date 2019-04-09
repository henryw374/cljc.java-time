(ns cljc.java-time.instant (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Instant]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Instant])))
(def min (. java.time.Instant -MIN))
(def epoch (. java.time.Instant -EPOCH))
(def max (. java.time.Instant -MAX))

(defn compare-to ([^java.time.Instant G__55904 G__55905] (.compareTo ^java.time.Instant G__55904 G__55905)))


(defn is-supported ([^java.time.Instant G__55906 G__55907] (.isSupported ^java.time.Instant G__55906 G__55907)))


(defn query ^java.lang.Object ([^java.time.Instant G__55908 ^java.time.temporal.TemporalQuery G__55909] (.query ^java.time.Instant G__55908 ^java.time.temporal.TemporalQuery G__55909)))




(defn minus-nanos ^java.time.Instant ([^java.time.Instant G__55910 G__55911] (.minusNanos ^java.time.Instant G__55910 G__55911)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Instant G__55912 ^java.time.temporal.TemporalField G__55913] (.range ^java.time.Instant G__55912 ^java.time.temporal.TemporalField G__55913)))


(defn to-epoch-milli ([^java.time.Instant G__55914] (.toEpochMilli ^java.time.Instant G__55914)))


(defn of-epoch-second ^java.time.Instant ([G__55916] (. java.time.Instant ofEpochSecond G__55916)) ([G__55918 G__55919] (. java.time.Instant ofEpochSecond G__55918 G__55919)))



(defn get ([^java.time.Instant G__55920 ^java.time.temporal.TemporalField G__55921] (.get ^java.time.Instant G__55920 ^java.time.temporal.TemporalField G__55921)))


(defn truncated-to ^java.time.Instant ([^java.time.Instant G__55922 ^java.time.temporal.TemporalUnit G__55923] (.truncatedTo ^java.time.Instant G__55922 ^java.time.temporal.TemporalUnit G__55923)))


(defn minus-millis ^java.time.Instant ([^java.time.Instant G__55924 G__55925] (.minusMillis ^java.time.Instant G__55924 G__55925)))


(defn minus-seconds ^java.time.Instant ([^java.time.Instant G__55926 G__55927] (.minusSeconds ^java.time.Instant G__55926 G__55927)))


(defn now ^java.time.Instant ([^java.time.Clock G__55929] (. java.time.Instant now ^java.time.Clock G__55929)) ([] (. java.time.Instant now)))




(defn of-epoch-milli ^java.time.Instant ([G__55932] (. java.time.Instant ofEpochMilli G__55932)))



(defn plus-seconds ^java.time.Instant ([^java.time.Instant G__55933 G__55934] (.plusSeconds ^java.time.Instant G__55933 G__55934)))




(defn until ([^java.time.Instant G__55935 ^java.time.temporal.Temporal G__55936 ^java.time.temporal.TemporalUnit G__55937] (.until ^java.time.Instant G__55935 ^java.time.temporal.Temporal G__55936 ^java.time.temporal.TemporalUnit G__55937)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.Instant G__55938 ^java.time.ZoneOffset G__55939] (.atOffset ^java.time.Instant G__55938 ^java.time.ZoneOffset G__55939)))



(defn is-before ([^java.time.Instant G__55940 ^java.time.Instant G__55941] (.isBefore ^java.time.Instant G__55940 ^java.time.Instant G__55941)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Instant G__55942 ^java.time.temporal.Temporal G__55943] (.adjustInto ^java.time.Instant G__55942 ^java.time.temporal.Temporal G__55943)))


(defn minus ^java.time.Instant ([^java.time.Instant G__55944 G__55945 G__55946] (.minus ^java.time.Instant G__55944 G__55945 G__55946)) ([^java.time.Instant G__55947 G__55948] (.minus ^java.time.Instant G__55947 G__55948)))


(defn plus-nanos ^java.time.Instant ([^java.time.Instant G__55949 G__55950] (.plusNanos ^java.time.Instant G__55949 G__55950)))


(defn get-nano ([^java.time.Instant G__55951] (jti/getter nano ^java.time.Instant G__55951)))


(defn is-after ([^java.time.Instant G__55952 ^java.time.Instant G__55953] (.isAfter ^java.time.Instant G__55952 ^java.time.Instant G__55953)))


(defn to-string ^java.lang.String ([^java.time.Instant G__55954] (.toString ^java.time.Instant G__55954)))



(defn equals ([^java.time.Instant G__55955 ^java.lang.Object G__55956] (.equals ^java.time.Instant G__55955 ^java.lang.Object G__55956)))


(defn plus-millis ^java.time.Instant ([^java.time.Instant G__55957 G__55958] (.plusMillis ^java.time.Instant G__55957 G__55958)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.Instant G__55959 ^java.time.ZoneId G__55960] (.atZone ^java.time.Instant G__55959 ^java.time.ZoneId G__55960)))



(defn hash-code ([^java.time.Instant G__55961] (.hashCode ^java.time.Instant G__55961)))



(defn get-long ([^java.time.Instant G__55962 ^java.time.temporal.TemporalField G__55963] (.getLong ^java.time.Instant G__55962 ^java.time.temporal.TemporalField G__55963)))




(defn with ^java.time.temporal.Temporal ([^java.time.Instant G__55964 G__55965] (.with ^java.time.Instant G__55964 G__55965)) ([^java.time.Instant G__55966 G__55967 G__55968] (.with ^java.time.Instant G__55966 G__55967 G__55968)))


(defn from ^java.time.Instant ([^java.time.temporal.TemporalAccessor G__55970] (. java.time.Instant from ^java.time.temporal.TemporalAccessor G__55970)))


(defn get-epoch-second ([^java.time.Instant G__55971] (jti/getter epochSecond ^java.time.Instant G__55971)))


(defn parse ^java.time.Instant ([^java.lang.CharSequence G__55973] (. java.time.Instant parse ^java.lang.CharSequence G__55973)))


(defn plus ^java.time.temporal.Temporal ([^java.time.Instant G__55974 G__55975 G__55976] (.plus ^java.time.Instant G__55974 G__55975 G__55976)) ([^java.time.Instant G__55977 G__55978] (.plus ^java.time.Instant G__55977 G__55978)))


