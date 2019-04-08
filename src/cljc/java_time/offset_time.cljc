(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetTime])))

(defn compare-to ([^java.time.OffsetTime G__36091 G__36092] (.compareTo ^java.time.OffsetTime G__36091 G__36092)))


(defn is-supported ([^java.time.OffsetTime G__36093 G__36094] (.isSupported ^java.time.OffsetTime G__36093 G__36094)))


(defn query ^java.lang.Object ([^java.time.OffsetTime G__36095 ^java.time.temporal.TemporalQuery G__36096] (.query ^java.time.OffsetTime G__36095 ^java.time.temporal.TemporalQuery G__36096)))


(defn with-second ^java.time.OffsetTime ([^java.time.OffsetTime G__36097 G__36098] (.withSecond ^java.time.OffsetTime G__36097 G__36098)))


(defn get-second ([^java.time.OffsetTime G__36099] (jti/getter second ^java.time.OffsetTime G__36099)))


(defn of ^java.time.OffsetTime ([G__36101 G__36102 G__36103 G__36104 ^java.time.ZoneOffset G__36105] (. java.time.OffsetTime of G__36101 G__36102 G__36103 G__36104 ^java.time.ZoneOffset G__36105)) ([^java.time.LocalTime G__36107 ^java.time.ZoneOffset G__36108] (. java.time.OffsetTime of ^java.time.LocalTime G__36107 ^java.time.ZoneOffset G__36108)))


(defn minus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__36109 G__36110] (.minusNanos ^java.time.OffsetTime G__36109 G__36110)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetTime G__36111 ^java.time.temporal.TemporalField G__36112] (.range ^java.time.OffsetTime G__36111 ^java.time.temporal.TemporalField G__36112)))


(defn is-equal ([^java.time.OffsetTime G__36113 ^java.time.OffsetTime G__36114] (.isEqual ^java.time.OffsetTime G__36113 ^java.time.OffsetTime G__36114)))


(defn of-instant ^java.time.OffsetTime ([^java.time.Instant G__36116 ^java.time.ZoneId G__36117] (. java.time.OffsetTime ofInstant ^java.time.Instant G__36116 ^java.time.ZoneId G__36117)))


(defn with-minute ^java.time.OffsetTime ([^java.time.OffsetTime G__36118 G__36119] (.withMinute ^java.time.OffsetTime G__36118 G__36119)))


(defn format ^java.lang.String ([^java.time.OffsetTime G__36120 ^java.time.format.DateTimeFormatter G__36121] (.format ^java.time.OffsetTime G__36120 ^java.time.format.DateTimeFormatter G__36121)))


(defn get ([^java.time.OffsetTime G__36122 ^java.time.temporal.TemporalField G__36123] (.get ^java.time.OffsetTime G__36122 ^java.time.temporal.TemporalField G__36123)))


(defn truncated-to ^java.time.OffsetTime ([^java.time.OffsetTime G__36124 ^java.time.temporal.TemporalUnit G__36125] (.truncatedTo ^java.time.OffsetTime G__36124 ^java.time.temporal.TemporalUnit G__36125)))


(defn minus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__36126 G__36127] (.minusSeconds ^java.time.OffsetTime G__36126 G__36127)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetTime G__36128] (.toLocalTime ^java.time.OffsetTime G__36128)))


(defn now ^java.time.OffsetTime ([G__36130] (. java.time.OffsetTime now G__36130)) ([] (. java.time.OffsetTime now)))


(defn plus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__36132 G__36133] (.plusHours ^java.time.OffsetTime G__36132 G__36133)))




(defn plus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__36134 G__36135] (.plusSeconds ^java.time.OffsetTime G__36134 G__36135)))


(defn plus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__36136 G__36137] (.plusMinutes ^java.time.OffsetTime G__36136 G__36137)))



(defn until ([^java.time.OffsetTime G__36138 ^java.time.temporal.Temporal G__36139 ^java.time.temporal.TemporalUnit G__36140] (.until ^java.time.OffsetTime G__36138 ^java.time.temporal.Temporal G__36139 ^java.time.temporal.TemporalUnit G__36140)))





(defn is-before ([^java.time.OffsetTime G__36141 ^java.time.OffsetTime G__36142] (.isBefore ^java.time.OffsetTime G__36141 ^java.time.OffsetTime G__36142)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetTime G__36143 ^java.time.temporal.Temporal G__36144] (.adjustInto ^java.time.OffsetTime G__36143 ^java.time.temporal.Temporal G__36144)))



(defn get-hour ([^java.time.OffsetTime G__36145] (jti/getter hour ^java.time.OffsetTime G__36145)))


(defn minus ^java.time.OffsetTime ([^java.time.OffsetTime G__36146 G__36147] (.minus ^java.time.OffsetTime G__36146 G__36147)) ([^java.time.OffsetTime G__36148 G__36149 G__36150] (.minus ^java.time.OffsetTime G__36148 G__36149 G__36150)))


(defn plus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__36151 G__36152] (.plusNanos ^java.time.OffsetTime G__36151 G__36152)))


(defn get-nano ([^java.time.OffsetTime G__36153] (jti/getter nano ^java.time.OffsetTime G__36153)))


(defn is-after ([^java.time.OffsetTime G__36154 ^java.time.OffsetTime G__36155] (.isAfter ^java.time.OffsetTime G__36154 ^java.time.OffsetTime G__36155)))


(defn to-string ^java.lang.String ([^java.time.OffsetTime G__36156] (.toString ^java.time.OffsetTime G__36156)))


(defn with-hour ^java.time.OffsetTime ([^java.time.OffsetTime G__36157 G__36158] (.withHour ^java.time.OffsetTime G__36157 G__36158)))


(defn equals ([^java.time.OffsetTime G__36159 ^java.lang.Object G__36160] (.equals ^java.time.OffsetTime G__36159 ^java.lang.Object G__36160)))



(defn with-nano ^java.time.OffsetTime ([^java.time.OffsetTime G__36161 G__36162] (.withNano ^java.time.OffsetTime G__36161 G__36162)))


(defn get-minute ([^java.time.OffsetTime G__36163] (jti/getter minute ^java.time.OffsetTime G__36163)))


(defn minus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__36164 G__36165] (.minusHours ^java.time.OffsetTime G__36164 G__36165)))


(defn hash-code ([^java.time.OffsetTime G__36166] (.hashCode ^java.time.OffsetTime G__36166)))



(defn get-long ([^java.time.OffsetTime G__36167 ^java.time.temporal.TemporalField G__36168] (jti/getter long ^java.time.OffsetTime G__36167 ^java.time.temporal.TemporalField G__36168)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetTime G__36169] (jti/getter offset ^java.time.OffsetTime G__36169)))


(defn with-offset-same-instant ^java.time.OffsetTime ([^java.time.OffsetTime G__36170 ^java.time.ZoneOffset G__36171] (.withOffsetSameInstant ^java.time.OffsetTime G__36170 ^java.time.ZoneOffset G__36171)))


(defn with ^java.time.temporal.Temporal ([^java.time.OffsetTime G__36172 G__36173 G__36174] (.with ^java.time.OffsetTime G__36172 G__36173 G__36174)) ([^java.time.OffsetTime G__36175 G__36176] (.with ^java.time.OffsetTime G__36175 G__36176)))


(defn from ^java.time.OffsetTime ([^java.time.temporal.TemporalAccessor G__36178] (. java.time.OffsetTime from ^java.time.temporal.TemporalAccessor G__36178)))


(defn parse ^java.time.OffsetTime ([^java.lang.CharSequence G__36180 ^java.time.format.DateTimeFormatter G__36181] (. java.time.OffsetTime parse ^java.lang.CharSequence G__36180 ^java.time.format.DateTimeFormatter G__36181)) ([^java.lang.CharSequence G__36183] (. java.time.OffsetTime parse ^java.lang.CharSequence G__36183)))


(defn plus ^java.time.temporal.Temporal ([^java.time.OffsetTime G__36184 G__36185] (.plus ^java.time.OffsetTime G__36184 G__36185)) ([^java.time.OffsetTime G__36186 G__36187 G__36188] (.plus ^java.time.OffsetTime G__36186 G__36187 G__36188)))


(defn at-date ^java.time.OffsetDateTime ([^java.time.OffsetTime G__36189 ^java.time.LocalDate G__36190] (.atDate ^java.time.OffsetTime G__36189 ^java.time.LocalDate G__36190)))



(defn with-offset-same-local ^java.time.OffsetTime ([^java.time.OffsetTime G__36191 ^java.time.ZoneOffset G__36192] (.withOffsetSameLocal ^java.time.OffsetTime G__36191 ^java.time.ZoneOffset G__36192)))



(defn minus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__36193 G__36194] (.minusMinutes ^java.time.OffsetTime G__36193 G__36194)))

