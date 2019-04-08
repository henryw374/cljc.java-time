(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalTime])))

(defn compare-to ([^java.time.LocalTime G__36464 G__36465] (.compareTo ^java.time.LocalTime G__36464 G__36465)))


(defn is-supported ([^java.time.LocalTime G__36466 G__36467] (.isSupported ^java.time.LocalTime G__36466 G__36467)))


(defn query ^java.lang.Object ([^java.time.LocalTime G__36468 ^java.time.temporal.TemporalQuery G__36469] (.query ^java.time.LocalTime G__36468 ^java.time.temporal.TemporalQuery G__36469)))


(defn with-second ^java.time.LocalTime ([^java.time.LocalTime G__36470 G__36471] (.withSecond ^java.time.LocalTime G__36470 G__36471)))



(defn get-second ([^java.time.LocalTime G__36472] (jti/getter second ^java.time.LocalTime G__36472)))



(defn of-second-of-day ^java.time.LocalTime ([G__36474] (. java.time.LocalTime ofSecondOfDay G__36474)))



(defn of ^java.time.LocalTime ([G__36476 G__36477] (. java.time.LocalTime of G__36476 G__36477)) ([G__36479 G__36480 G__36481 G__36482] (. java.time.LocalTime of G__36479 G__36480 G__36481 G__36482)) ([G__36484 G__36485 G__36486] (. java.time.LocalTime of G__36484 G__36485 G__36486)))




(defn minus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__36487 G__36488] (.minusNanos ^java.time.LocalTime G__36487 G__36488)))



(defn range ^java.time.temporal.ValueRange ([^java.time.LocalTime G__36489 ^java.time.temporal.TemporalField G__36490] (.range ^java.time.LocalTime G__36489 ^java.time.temporal.TemporalField G__36490)))




(defn with-minute ^java.time.LocalTime ([^java.time.LocalTime G__36491 G__36492] (.withMinute ^java.time.LocalTime G__36491 G__36492)))






(defn format ^java.lang.String ([^java.time.LocalTime G__36493 ^java.time.format.DateTimeFormatter G__36494] (.format ^java.time.LocalTime G__36493 ^java.time.format.DateTimeFormatter G__36494)))


(defn get ([^java.time.LocalTime G__36495 ^java.time.temporal.TemporalField G__36496] (.get ^java.time.LocalTime G__36495 ^java.time.temporal.TemporalField G__36496)))


(defn truncated-to ^java.time.LocalTime ([^java.time.LocalTime G__36497 ^java.time.temporal.TemporalUnit G__36498] (.truncatedTo ^java.time.LocalTime G__36497 ^java.time.temporal.TemporalUnit G__36498)))



(defn of-nano-of-day ^java.time.LocalTime ([G__36500] (. java.time.LocalTime ofNanoOfDay G__36500)))


(defn minus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__36501 G__36502] (.minusSeconds ^java.time.LocalTime G__36501 G__36502)))


(defn now ^java.time.LocalTime ([G__36504] (. java.time.LocalTime now G__36504)) ([] (. java.time.LocalTime now)))


(defn plus-hours ^java.time.LocalTime ([^java.time.LocalTime G__36506 G__36507] (.plusHours ^java.time.LocalTime G__36506 G__36507)))





(defn plus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__36508 G__36509] (.plusSeconds ^java.time.LocalTime G__36508 G__36509)))


(defn plus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__36510 G__36511] (.plusMinutes ^java.time.LocalTime G__36510 G__36511)))



(defn to-nano-of-day ([^java.time.LocalTime G__36512] (.toNanoOfDay ^java.time.LocalTime G__36512)))




(defn until ([^java.time.LocalTime G__36513 ^java.time.temporal.Temporal G__36514 ^java.time.temporal.TemporalUnit G__36515] (.until ^java.time.LocalTime G__36513 ^java.time.temporal.Temporal G__36514 ^java.time.temporal.TemporalUnit G__36515)))



(defn at-offset ^java.time.OffsetTime ([^java.time.LocalTime G__36516 ^java.time.ZoneOffset G__36517] (.atOffset ^java.time.LocalTime G__36516 ^java.time.ZoneOffset G__36517)))



(defn is-before ([^java.time.LocalTime G__36518 ^java.time.LocalTime G__36519] (.isBefore ^java.time.LocalTime G__36518 ^java.time.LocalTime G__36519)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalTime G__36520 ^java.time.temporal.Temporal G__36521] (.adjustInto ^java.time.LocalTime G__36520 ^java.time.temporal.Temporal G__36521)))


(defn get-hour ([^java.time.LocalTime G__36522] (jti/getter hour ^java.time.LocalTime G__36522)))


(defn minus ^java.time.temporal.Temporal ([^java.time.LocalTime G__36523 G__36524] (.minus ^java.time.LocalTime G__36523 G__36524)) ([^java.time.LocalTime G__36525 G__36526 G__36527] (.minus ^java.time.LocalTime G__36525 G__36526 G__36527)))


(defn plus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__36528 G__36529] (.plusNanos ^java.time.LocalTime G__36528 G__36529)))


(defn get-nano ([^java.time.LocalTime G__36530] (jti/getter nano ^java.time.LocalTime G__36530)))



(defn is-after ([^java.time.LocalTime G__36531 ^java.time.LocalTime G__36532] (.isAfter ^java.time.LocalTime G__36531 ^java.time.LocalTime G__36532)))



(defn to-string ^java.lang.String ([^java.time.LocalTime G__36533] (.toString ^java.time.LocalTime G__36533)))


(defn with-hour ^java.time.LocalTime ([^java.time.LocalTime G__36534 G__36535] (.withHour ^java.time.LocalTime G__36534 G__36535)))


(defn equals ([^java.time.LocalTime G__36536 ^java.lang.Object G__36537] (.equals ^java.time.LocalTime G__36536 ^java.lang.Object G__36537)))



(defn with-nano ^java.time.LocalTime ([^java.time.LocalTime G__36538 G__36539] (.withNano ^java.time.LocalTime G__36538 G__36539)))


(defn get-minute ([^java.time.LocalTime G__36540] (jti/getter minute ^java.time.LocalTime G__36540)))


(defn minus-hours ^java.time.LocalTime ([^java.time.LocalTime G__36541 G__36542] (.minusHours ^java.time.LocalTime G__36541 G__36542)))


(defn hash-code ([^java.time.LocalTime G__36543] (.hashCode ^java.time.LocalTime G__36543)))




(defn get-long ([^java.time.LocalTime G__36544 ^java.time.temporal.TemporalField G__36545] (jti/getter long ^java.time.LocalTime G__36544 ^java.time.temporal.TemporalField G__36545)))


(defn with ^java.time.temporal.Temporal ([^java.time.LocalTime G__36546 G__36547] (.with ^java.time.LocalTime G__36546 G__36547)) ([^java.time.LocalTime G__36548 G__36549 G__36550] (.with ^java.time.LocalTime G__36548 G__36549 G__36550)))


(defn from ^java.time.LocalTime ([^java.time.temporal.TemporalAccessor G__36552] (. java.time.LocalTime from ^java.time.temporal.TemporalAccessor G__36552)))


(defn parse ^java.time.LocalTime ([^java.lang.CharSequence G__36554] (. java.time.LocalTime parse ^java.lang.CharSequence G__36554)) ([^java.lang.CharSequence G__36556 ^java.time.format.DateTimeFormatter G__36557] (. java.time.LocalTime parse ^java.lang.CharSequence G__36556 ^java.time.format.DateTimeFormatter G__36557)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalTime G__36558 G__36559 G__36560] (.plus ^java.time.LocalTime G__36558 G__36559 G__36560)) ([^java.time.LocalTime G__36561 G__36562] (.plus ^java.time.LocalTime G__36561 G__36562)))


(defn at-date ^java.time.LocalDateTime ([^java.time.LocalTime G__36563 ^java.time.LocalDate G__36564] (.atDate ^java.time.LocalTime G__36563 ^java.time.LocalDate G__36564)))


(defn to-second-of-day ([^java.time.LocalTime G__36565] (.toSecondOfDay ^java.time.LocalTime G__36565)))



(defn minus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__36566 G__36567] (.minusMinutes ^java.time.LocalTime G__36566 G__36567)))


