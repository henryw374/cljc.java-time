(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalTime]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time LocalTime])))
(def max (. java.time.LocalTime -MAX))
(def noon (. java.time.LocalTime -NOON))
(def midnight (. java.time.LocalTime -MIDNIGHT))
(def min (. java.time.LocalTime -MIN))

(defn compare-to ([^java.time.LocalTime G__56173 G__56174] (.compareTo ^java.time.LocalTime G__56173 G__56174)))


(defn is-supported ([^java.time.LocalTime G__56175 G__56176] (.isSupported ^java.time.LocalTime G__56175 G__56176)))


(defn query ^java.lang.Object ([^java.time.LocalTime G__56177 ^java.time.temporal.TemporalQuery G__56178] (.query ^java.time.LocalTime G__56177 ^java.time.temporal.TemporalQuery G__56178)))


(defn with-second ^java.time.LocalTime ([^java.time.LocalTime G__56179 G__56180] (.withSecond ^java.time.LocalTime G__56179 G__56180)))



(defn get-second ([^java.time.LocalTime G__56181] (jti/getter second ^java.time.LocalTime G__56181)))



(defn of-second-of-day ^java.time.LocalTime ([G__56183] (. java.time.LocalTime ofSecondOfDay G__56183)))



(defn of ^java.time.LocalTime ([G__56185 G__56186] (. java.time.LocalTime of G__56185 G__56186)) ([G__56188 G__56189 G__56190 G__56191] (. java.time.LocalTime of G__56188 G__56189 G__56190 G__56191)) ([G__56193 G__56194 G__56195] (. java.time.LocalTime of G__56193 G__56194 G__56195)))




(defn minus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__56196 G__56197] (.minusNanos ^java.time.LocalTime G__56196 G__56197)))



(defn range ^java.time.temporal.ValueRange ([^java.time.LocalTime G__56198 ^java.time.temporal.TemporalField G__56199] (.range ^java.time.LocalTime G__56198 ^java.time.temporal.TemporalField G__56199)))




(defn with-minute ^java.time.LocalTime ([^java.time.LocalTime G__56200 G__56201] (.withMinute ^java.time.LocalTime G__56200 G__56201)))






(defn format ^java.lang.String ([^java.time.LocalTime G__56202 ^java.time.format.DateTimeFormatter G__56203] (.format ^java.time.LocalTime G__56202 ^java.time.format.DateTimeFormatter G__56203)))


(defn get ([^java.time.LocalTime G__56204 ^java.time.temporal.TemporalField G__56205] (.get ^java.time.LocalTime G__56204 ^java.time.temporal.TemporalField G__56205)))


(defn truncated-to ^java.time.LocalTime ([^java.time.LocalTime G__56206 ^java.time.temporal.TemporalUnit G__56207] (.truncatedTo ^java.time.LocalTime G__56206 ^java.time.temporal.TemporalUnit G__56207)))



(defn of-nano-of-day ^java.time.LocalTime ([G__56209] (. java.time.LocalTime ofNanoOfDay G__56209)))


(defn minus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__56210 G__56211] (.minusSeconds ^java.time.LocalTime G__56210 G__56211)))


(defn now ^java.time.LocalTime ([G__56213] (. java.time.LocalTime now G__56213)) ([] (. java.time.LocalTime now)))


(defn plus-hours ^java.time.LocalTime ([^java.time.LocalTime G__56215 G__56216] (.plusHours ^java.time.LocalTime G__56215 G__56216)))





(defn plus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__56217 G__56218] (.plusSeconds ^java.time.LocalTime G__56217 G__56218)))


(defn plus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__56219 G__56220] (.plusMinutes ^java.time.LocalTime G__56219 G__56220)))



(defn to-nano-of-day ([^java.time.LocalTime G__56221] (.toNanoOfDay ^java.time.LocalTime G__56221)))




(defn until ([^java.time.LocalTime G__56222 ^java.time.temporal.Temporal G__56223 ^java.time.temporal.TemporalUnit G__56224] (.until ^java.time.LocalTime G__56222 ^java.time.temporal.Temporal G__56223 ^java.time.temporal.TemporalUnit G__56224)))



(defn at-offset ^java.time.OffsetTime ([^java.time.LocalTime G__56225 ^java.time.ZoneOffset G__56226] (.atOffset ^java.time.LocalTime G__56225 ^java.time.ZoneOffset G__56226)))



(defn is-before ([^java.time.LocalTime G__56227 ^java.time.LocalTime G__56228] (.isBefore ^java.time.LocalTime G__56227 ^java.time.LocalTime G__56228)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalTime G__56229 ^java.time.temporal.Temporal G__56230] (.adjustInto ^java.time.LocalTime G__56229 ^java.time.temporal.Temporal G__56230)))


(defn get-hour ([^java.time.LocalTime G__56231] (jti/getter hour ^java.time.LocalTime G__56231)))


(defn minus ^java.time.temporal.Temporal ([^java.time.LocalTime G__56232 G__56233] (.minus ^java.time.LocalTime G__56232 G__56233)) ([^java.time.LocalTime G__56234 G__56235 G__56236] (.minus ^java.time.LocalTime G__56234 G__56235 G__56236)))


(defn plus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__56237 G__56238] (.plusNanos ^java.time.LocalTime G__56237 G__56238)))


(defn get-nano ([^java.time.LocalTime G__56239] (jti/getter nano ^java.time.LocalTime G__56239)))



(defn is-after ([^java.time.LocalTime G__56240 ^java.time.LocalTime G__56241] (.isAfter ^java.time.LocalTime G__56240 ^java.time.LocalTime G__56241)))



(defn to-string ^java.lang.String ([^java.time.LocalTime G__56242] (.toString ^java.time.LocalTime G__56242)))


(defn with-hour ^java.time.LocalTime ([^java.time.LocalTime G__56243 G__56244] (.withHour ^java.time.LocalTime G__56243 G__56244)))


(defn equals ([^java.time.LocalTime G__56245 ^java.lang.Object G__56246] (.equals ^java.time.LocalTime G__56245 ^java.lang.Object G__56246)))



(defn with-nano ^java.time.LocalTime ([^java.time.LocalTime G__56247 G__56248] (.withNano ^java.time.LocalTime G__56247 G__56248)))


(defn get-minute ([^java.time.LocalTime G__56249] (jti/getter minute ^java.time.LocalTime G__56249)))


(defn minus-hours ^java.time.LocalTime ([^java.time.LocalTime G__56250 G__56251] (.minusHours ^java.time.LocalTime G__56250 G__56251)))


(defn hash-code ([^java.time.LocalTime G__56252] (.hashCode ^java.time.LocalTime G__56252)))




(defn get-long ([^java.time.LocalTime G__56253 ^java.time.temporal.TemporalField G__56254] (.getLong ^java.time.LocalTime G__56253 ^java.time.temporal.TemporalField G__56254)))


(defn with ^java.time.temporal.Temporal ([^java.time.LocalTime G__56255 G__56256] (.with ^java.time.LocalTime G__56255 G__56256)) ([^java.time.LocalTime G__56257 G__56258 G__56259] (.with ^java.time.LocalTime G__56257 G__56258 G__56259)))


(defn from ^java.time.LocalTime ([^java.time.temporal.TemporalAccessor G__56261] (. java.time.LocalTime from ^java.time.temporal.TemporalAccessor G__56261)))


(defn parse ^java.time.LocalTime ([^java.lang.CharSequence G__56263] (. java.time.LocalTime parse ^java.lang.CharSequence G__56263)) ([^java.lang.CharSequence G__56265 ^java.time.format.DateTimeFormatter G__56266] (. java.time.LocalTime parse ^java.lang.CharSequence G__56265 ^java.time.format.DateTimeFormatter G__56266)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalTime G__56267 G__56268 G__56269] (.plus ^java.time.LocalTime G__56267 G__56268 G__56269)) ([^java.time.LocalTime G__56270 G__56271] (.plus ^java.time.LocalTime G__56270 G__56271)))


(defn at-date ^java.time.LocalDateTime ([^java.time.LocalTime G__56272 ^java.time.LocalDate G__56273] (.atDate ^java.time.LocalTime G__56272 ^java.time.LocalDate G__56273)))


(defn to-second-of-day ([^java.time.LocalTime G__56274] (.toSecondOfDay ^java.time.LocalTime G__56274)))



(defn minus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__56275 G__56276] (.minusMinutes ^java.time.LocalTime G__56275 G__56276)))


