(ns cljc.java-time.instant (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Instant]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Instant])))

(defn compare-to ([^java.time.Instant G__36195 G__36196] (.compareTo ^java.time.Instant G__36195 G__36196)))


(defn is-supported ([^java.time.Instant G__36197 G__36198] (.isSupported ^java.time.Instant G__36197 G__36198)))


(defn query ^java.lang.Object ([^java.time.Instant G__36199 ^java.time.temporal.TemporalQuery G__36200] (.query ^java.time.Instant G__36199 ^java.time.temporal.TemporalQuery G__36200)))




(defn minus-nanos ^java.time.Instant ([^java.time.Instant G__36201 G__36202] (.minusNanos ^java.time.Instant G__36201 G__36202)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Instant G__36203 ^java.time.temporal.TemporalField G__36204] (.range ^java.time.Instant G__36203 ^java.time.temporal.TemporalField G__36204)))


(defn to-epoch-milli ([^java.time.Instant G__36205] (.toEpochMilli ^java.time.Instant G__36205)))


(defn of-epoch-second ^java.time.Instant ([G__36207] (. java.time.Instant ofEpochSecond G__36207)) ([G__36209 G__36210] (. java.time.Instant ofEpochSecond G__36209 G__36210)))



(defn get ([^java.time.Instant G__36211 ^java.time.temporal.TemporalField G__36212] (.get ^java.time.Instant G__36211 ^java.time.temporal.TemporalField G__36212)))


(defn truncated-to ^java.time.Instant ([^java.time.Instant G__36213 ^java.time.temporal.TemporalUnit G__36214] (.truncatedTo ^java.time.Instant G__36213 ^java.time.temporal.TemporalUnit G__36214)))


(defn minus-millis ^java.time.Instant ([^java.time.Instant G__36215 G__36216] (.minusMillis ^java.time.Instant G__36215 G__36216)))


(defn minus-seconds ^java.time.Instant ([^java.time.Instant G__36217 G__36218] (.minusSeconds ^java.time.Instant G__36217 G__36218)))


(defn now ^java.time.Instant ([^java.time.Clock G__36220] (. java.time.Instant now ^java.time.Clock G__36220)) ([] (. java.time.Instant now)))




(defn of-epoch-milli ^java.time.Instant ([G__36223] (. java.time.Instant ofEpochMilli G__36223)))



(defn plus-seconds ^java.time.Instant ([^java.time.Instant G__36224 G__36225] (.plusSeconds ^java.time.Instant G__36224 G__36225)))




(defn until ([^java.time.Instant G__36226 ^java.time.temporal.Temporal G__36227 ^java.time.temporal.TemporalUnit G__36228] (.until ^java.time.Instant G__36226 ^java.time.temporal.Temporal G__36227 ^java.time.temporal.TemporalUnit G__36228)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.Instant G__36229 ^java.time.ZoneOffset G__36230] (.atOffset ^java.time.Instant G__36229 ^java.time.ZoneOffset G__36230)))



(defn is-before ([^java.time.Instant G__36231 ^java.time.Instant G__36232] (.isBefore ^java.time.Instant G__36231 ^java.time.Instant G__36232)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Instant G__36233 ^java.time.temporal.Temporal G__36234] (.adjustInto ^java.time.Instant G__36233 ^java.time.temporal.Temporal G__36234)))


(defn minus ^java.time.Instant ([^java.time.Instant G__36235 G__36236 G__36237] (.minus ^java.time.Instant G__36235 G__36236 G__36237)) ([^java.time.Instant G__36238 G__36239] (.minus ^java.time.Instant G__36238 G__36239)))


(defn plus-nanos ^java.time.Instant ([^java.time.Instant G__36240 G__36241] (.plusNanos ^java.time.Instant G__36240 G__36241)))


(defn get-nano ([^java.time.Instant G__36242] (jti/getter nano ^java.time.Instant G__36242)))


(defn is-after ([^java.time.Instant G__36243 ^java.time.Instant G__36244] (.isAfter ^java.time.Instant G__36243 ^java.time.Instant G__36244)))


(defn to-string ^java.lang.String ([^java.time.Instant G__36245] (.toString ^java.time.Instant G__36245)))



(defn equals ([^java.time.Instant G__36246 ^java.lang.Object G__36247] (.equals ^java.time.Instant G__36246 ^java.lang.Object G__36247)))


(defn plus-millis ^java.time.Instant ([^java.time.Instant G__36248 G__36249] (.plusMillis ^java.time.Instant G__36248 G__36249)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.Instant G__36250 ^java.time.ZoneId G__36251] (.atZone ^java.time.Instant G__36250 ^java.time.ZoneId G__36251)))



(defn hash-code ([^java.time.Instant G__36252] (.hashCode ^java.time.Instant G__36252)))



(defn get-long ([^java.time.Instant G__36253 ^java.time.temporal.TemporalField G__36254] (jti/getter long ^java.time.Instant G__36253 ^java.time.temporal.TemporalField G__36254)))




(defn with ^java.time.temporal.Temporal ([^java.time.Instant G__36255 G__36256] (.with ^java.time.Instant G__36255 G__36256)) ([^java.time.Instant G__36257 G__36258 G__36259] (.with ^java.time.Instant G__36257 G__36258 G__36259)))


(defn from ^java.time.Instant ([^java.time.temporal.TemporalAccessor G__36261] (. java.time.Instant from ^java.time.temporal.TemporalAccessor G__36261)))


(defn get-epoch-second ([^java.time.Instant G__36262] (jti/getter epochSecond ^java.time.Instant G__36262)))


(defn parse ^java.time.Instant ([^java.lang.CharSequence G__36264] (. java.time.Instant parse ^java.lang.CharSequence G__36264)))


(defn plus ^java.time.temporal.Temporal ([^java.time.Instant G__36265 G__36266 G__36267] (.plus ^java.time.Instant G__36265 G__36266 G__36267)) ([^java.time.Instant G__36268 G__36269] (.plus ^java.time.Instant G__36268 G__36269)))


