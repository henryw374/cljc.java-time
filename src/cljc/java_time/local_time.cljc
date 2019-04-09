(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalTime])))
(def max (. java.time.LocalTime -MAX))
(def noon (. java.time.LocalTime -NOON))
(def midnight (. java.time.LocalTime -MIDNIGHT))
(def min (. java.time.LocalTime -MIN))

(defn compare-to ([^java.time.LocalTime G__47100 G__47101] (.compareTo ^java.time.LocalTime G__47100 G__47101)))


(defn is-supported ([^java.time.LocalTime G__47102 G__47103] (.isSupported ^java.time.LocalTime G__47102 G__47103)))


(defn query ^java.lang.Object ([^java.time.LocalTime G__47104 ^java.time.temporal.TemporalQuery G__47105] (.query ^java.time.LocalTime G__47104 ^java.time.temporal.TemporalQuery G__47105)))


(defn with-second ^java.time.LocalTime ([^java.time.LocalTime G__47106 G__47107] (.withSecond ^java.time.LocalTime G__47106 G__47107)))



(defn get-second ([^java.time.LocalTime G__47108] (jti/getter second ^java.time.LocalTime G__47108)))



(defn of-second-of-day ^java.time.LocalTime ([G__47110] (. java.time.LocalTime ofSecondOfDay G__47110)))



(defn of ^java.time.LocalTime ([G__47112 G__47113] (. java.time.LocalTime of G__47112 G__47113)) ([G__47115 G__47116 G__47117 G__47118] (. java.time.LocalTime of G__47115 G__47116 G__47117 G__47118)) ([G__47120 G__47121 G__47122] (. java.time.LocalTime of G__47120 G__47121 G__47122)))




(defn minus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__47123 G__47124] (.minusNanos ^java.time.LocalTime G__47123 G__47124)))



(defn range ^java.time.temporal.ValueRange ([^java.time.LocalTime G__47125 ^java.time.temporal.TemporalField G__47126] (.range ^java.time.LocalTime G__47125 ^java.time.temporal.TemporalField G__47126)))




(defn with-minute ^java.time.LocalTime ([^java.time.LocalTime G__47127 G__47128] (.withMinute ^java.time.LocalTime G__47127 G__47128)))






(defn format ^java.lang.String ([^java.time.LocalTime G__47129 ^java.time.format.DateTimeFormatter G__47130] (.format ^java.time.LocalTime G__47129 ^java.time.format.DateTimeFormatter G__47130)))


(defn get ([^java.time.LocalTime G__47131 ^java.time.temporal.TemporalField G__47132] (.get ^java.time.LocalTime G__47131 ^java.time.temporal.TemporalField G__47132)))


(defn truncated-to ^java.time.LocalTime ([^java.time.LocalTime G__47133 ^java.time.temporal.TemporalUnit G__47134] (.truncatedTo ^java.time.LocalTime G__47133 ^java.time.temporal.TemporalUnit G__47134)))



(defn of-nano-of-day ^java.time.LocalTime ([G__47136] (. java.time.LocalTime ofNanoOfDay G__47136)))


(defn minus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__47137 G__47138] (.minusSeconds ^java.time.LocalTime G__47137 G__47138)))


(defn now ^java.time.LocalTime ([G__47140] (. java.time.LocalTime now G__47140)) ([] (. java.time.LocalTime now)))


(defn plus-hours ^java.time.LocalTime ([^java.time.LocalTime G__47142 G__47143] (.plusHours ^java.time.LocalTime G__47142 G__47143)))





(defn plus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__47144 G__47145] (.plusSeconds ^java.time.LocalTime G__47144 G__47145)))


(defn plus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__47146 G__47147] (.plusMinutes ^java.time.LocalTime G__47146 G__47147)))



(defn to-nano-of-day ([^java.time.LocalTime G__47148] (.toNanoOfDay ^java.time.LocalTime G__47148)))




(defn until ([^java.time.LocalTime G__47149 ^java.time.temporal.Temporal G__47150 ^java.time.temporal.TemporalUnit G__47151] (.until ^java.time.LocalTime G__47149 ^java.time.temporal.Temporal G__47150 ^java.time.temporal.TemporalUnit G__47151)))



(defn at-offset ^java.time.OffsetTime ([^java.time.LocalTime G__47152 ^java.time.ZoneOffset G__47153] (.atOffset ^java.time.LocalTime G__47152 ^java.time.ZoneOffset G__47153)))



(defn is-before ([^java.time.LocalTime G__47154 ^java.time.LocalTime G__47155] (.isBefore ^java.time.LocalTime G__47154 ^java.time.LocalTime G__47155)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalTime G__47156 ^java.time.temporal.Temporal G__47157] (.adjustInto ^java.time.LocalTime G__47156 ^java.time.temporal.Temporal G__47157)))


(defn get-hour ([^java.time.LocalTime G__47158] (jti/getter hour ^java.time.LocalTime G__47158)))


(defn minus ^java.time.temporal.Temporal ([^java.time.LocalTime G__47159 G__47160] (.minus ^java.time.LocalTime G__47159 G__47160)) ([^java.time.LocalTime G__47161 G__47162 G__47163] (.minus ^java.time.LocalTime G__47161 G__47162 G__47163)))


(defn plus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__47164 G__47165] (.plusNanos ^java.time.LocalTime G__47164 G__47165)))


(defn get-nano ([^java.time.LocalTime G__47166] (jti/getter nano ^java.time.LocalTime G__47166)))



(defn is-after ([^java.time.LocalTime G__47167 ^java.time.LocalTime G__47168] (.isAfter ^java.time.LocalTime G__47167 ^java.time.LocalTime G__47168)))



(defn to-string ^java.lang.String ([^java.time.LocalTime G__47169] (.toString ^java.time.LocalTime G__47169)))


(defn with-hour ^java.time.LocalTime ([^java.time.LocalTime G__47170 G__47171] (.withHour ^java.time.LocalTime G__47170 G__47171)))


(defn equals ([^java.time.LocalTime G__47172 ^java.lang.Object G__47173] (.equals ^java.time.LocalTime G__47172 ^java.lang.Object G__47173)))



(defn with-nano ^java.time.LocalTime ([^java.time.LocalTime G__47174 G__47175] (.withNano ^java.time.LocalTime G__47174 G__47175)))


(defn get-minute ([^java.time.LocalTime G__47176] (jti/getter minute ^java.time.LocalTime G__47176)))


(defn minus-hours ^java.time.LocalTime ([^java.time.LocalTime G__47177 G__47178] (.minusHours ^java.time.LocalTime G__47177 G__47178)))


(defn hash-code ([^java.time.LocalTime G__47179] (.hashCode ^java.time.LocalTime G__47179)))




(defn get-long ([^java.time.LocalTime G__47180 ^java.time.temporal.TemporalField G__47181] (.getLong ^java.time.LocalTime G__47180 ^java.time.temporal.TemporalField G__47181)))


(defn with ^java.time.temporal.Temporal ([^java.time.LocalTime G__47182 G__47183] (.with ^java.time.LocalTime G__47182 G__47183)) ([^java.time.LocalTime G__47184 G__47185 G__47186] (.with ^java.time.LocalTime G__47184 G__47185 G__47186)))


(defn from ^java.time.LocalTime ([^java.time.temporal.TemporalAccessor G__47188] (. java.time.LocalTime from ^java.time.temporal.TemporalAccessor G__47188)))


(defn parse ^java.time.LocalTime ([^java.lang.CharSequence G__47190] (. java.time.LocalTime parse ^java.lang.CharSequence G__47190)) ([^java.lang.CharSequence G__47192 ^java.time.format.DateTimeFormatter G__47193] (. java.time.LocalTime parse ^java.lang.CharSequence G__47192 ^java.time.format.DateTimeFormatter G__47193)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalTime G__47194 G__47195 G__47196] (.plus ^java.time.LocalTime G__47194 G__47195 G__47196)) ([^java.time.LocalTime G__47197 G__47198] (.plus ^java.time.LocalTime G__47197 G__47198)))


(defn at-date ^java.time.LocalDateTime ([^java.time.LocalTime G__47199 ^java.time.LocalDate G__47200] (.atDate ^java.time.LocalTime G__47199 ^java.time.LocalDate G__47200)))


(defn to-second-of-day ([^java.time.LocalTime G__47201] (.toSecondOfDay ^java.time.LocalTime G__47201)))



(defn minus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__47202 G__47203] (.minusMinutes ^java.time.LocalTime G__47202 G__47203)))


