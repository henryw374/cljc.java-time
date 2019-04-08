(ns cljc.java-time.zoned-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [ZonedDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZonedDateTime])))


(defn is-supported ([^java.time.ZonedDateTime G__34453 G__34454] (.isSupported ^java.time.ZonedDateTime G__34453 G__34454)))


(defn plus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34455 G__34456] (.plusYears ^java.time.ZonedDateTime G__34455 G__34456)))


(defn query ^java.lang.Object ([^java.time.ZonedDateTime G__34457 ^java.time.temporal.TemporalQuery G__34458] (.query ^java.time.ZonedDateTime G__34457 ^java.time.temporal.TemporalQuery G__34458)))


(defn with-second ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34459 G__34460] (.withSecond ^java.time.ZonedDateTime G__34459 G__34460)))


(defn with-later-offset-at-overlap ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34461] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime G__34461)))


(defn get-second ([^java.time.ZonedDateTime G__34462] (jti/getter second ^java.time.ZonedDateTime G__34462)))


(defn get-day-of-month ([^java.time.ZonedDateTime G__34463] (jti/getter dayOfMonth ^java.time.ZonedDateTime G__34463)))



(defn of ^java.time.ZonedDateTime ([G__34465 G__34466 G__34467 G__34468 G__34469 G__34470 G__34471 ^java.time.ZoneId G__34472] (. java.time.ZonedDateTime of G__34465 G__34466 G__34467 G__34468 G__34469 G__34470 G__34471 ^java.time.ZoneId G__34472)) ([^java.time.LocalDateTime G__34474 ^java.time.ZoneId G__34475] (. java.time.ZonedDateTime of ^java.time.LocalDateTime G__34474 ^java.time.ZoneId G__34475)) ([^java.time.LocalDate G__34477 ^java.time.LocalTime G__34478 ^java.time.ZoneId G__34479] (. java.time.ZonedDateTime of ^java.time.LocalDate G__34477 ^java.time.LocalTime G__34478 ^java.time.ZoneId G__34479)))


(defn to-offset-date-time ^java.time.OffsetDateTime ([^java.time.ZonedDateTime G__34480] (.toOffsetDateTime ^java.time.ZonedDateTime G__34480)))


(defn minus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34481 G__34482] (.minusNanos ^java.time.ZonedDateTime G__34481 G__34482)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZonedDateTime G__34483 ^java.time.temporal.TemporalField G__34484] (.range ^java.time.ZonedDateTime G__34483 ^java.time.temporal.TemporalField G__34484)))


(defn with-day-of-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34485 G__34486] (.withDayOfYear ^java.time.ZonedDateTime G__34485 G__34486)))


(defn of-instant ^java.time.ZonedDateTime ([^java.time.Instant G__34488 ^java.time.ZoneId G__34489] (. java.time.ZonedDateTime ofInstant ^java.time.Instant G__34488 ^java.time.ZoneId G__34489)) ([^java.time.LocalDateTime G__34491 ^java.time.ZoneOffset G__34492 ^java.time.ZoneId G__34493] (. java.time.ZonedDateTime ofInstant ^java.time.LocalDateTime G__34491 ^java.time.ZoneOffset G__34492 ^java.time.ZoneId G__34493)))


(defn with-minute ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34494 G__34495] (.withMinute ^java.time.ZonedDateTime G__34494 G__34495)))



(defn format ^java.lang.String ([^java.time.ZonedDateTime G__34496 ^java.time.format.DateTimeFormatter G__34497] (.format ^java.time.ZonedDateTime G__34496 ^java.time.format.DateTimeFormatter G__34497)))


(defn minus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34498 G__34499] (.minusMonths ^java.time.ZonedDateTime G__34498 G__34499)))


(defn get ([^java.time.ZonedDateTime G__34500 ^java.time.temporal.TemporalField G__34501] (.get ^java.time.ZonedDateTime G__34500 ^java.time.temporal.TemporalField G__34501)))


(defn truncated-to ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34502 ^java.time.temporal.TemporalUnit G__34503] (.truncatedTo ^java.time.ZonedDateTime G__34502 ^java.time.temporal.TemporalUnit G__34503)))


(defn minus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34504 G__34505] (.minusWeeks ^java.time.ZonedDateTime G__34504 G__34505)))


(defn minus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34506 G__34507] (.minusSeconds ^java.time.ZonedDateTime G__34506 G__34507)))


(defn to-local-time ^java.time.LocalTime ([^java.time.ZonedDateTime G__34508] (.toLocalTime ^java.time.ZonedDateTime G__34508)))


(defn now ^java.time.ZonedDateTime ([G__34510] (. java.time.ZonedDateTime now G__34510)) ([] (. java.time.ZonedDateTime now)))


(defn minus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34512 G__34513] (.minusYears ^java.time.ZonedDateTime G__34512 G__34513)))


(defn minus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34514 G__34515] (.minusDays ^java.time.ZonedDateTime G__34514 G__34515)))


(defn plus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34516 G__34517] (.plusHours ^java.time.ZonedDateTime G__34516 G__34517)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.ZonedDateTime G__34518] (.toLocalDateTime ^java.time.ZonedDateTime G__34518)))



(defn with-fixed-offset-zone ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34519] (.withFixedOffsetZone ^java.time.ZonedDateTime G__34519)))


(defn get-day-of-year ([^java.time.ZonedDateTime G__34520] (jti/getter dayOfYear ^java.time.ZonedDateTime G__34520)))


(defn get-month ^java.time.Month ([^java.time.ZonedDateTime G__34521] (jti/getter month ^java.time.ZonedDateTime G__34521)))





(defn plus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34522 G__34523] (.plusSeconds ^java.time.ZonedDateTime G__34522 G__34523)))


(defn plus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34524 G__34525] (.plusMinutes ^java.time.ZonedDateTime G__34524 G__34525)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.ZonedDateTime G__34526] (.toLocalDate ^java.time.ZonedDateTime G__34526)))


(defn get-zone ^java.time.ZoneId ([^java.time.ZonedDateTime G__34527] (jti/getter zone ^java.time.ZonedDateTime G__34527)))



(defn until ([^java.time.ZonedDateTime G__34528 ^java.time.temporal.Temporal G__34529 ^java.time.temporal.TemporalUnit G__34530] (.until ^java.time.ZonedDateTime G__34528 ^java.time.temporal.Temporal G__34529 ^java.time.temporal.TemporalUnit G__34530)))




(defn get-hour ([^java.time.ZonedDateTime G__34531] (jti/getter hour ^java.time.ZonedDateTime G__34531)))


(defn minus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__34532 G__34533] (.minus ^java.time.ZonedDateTime G__34532 G__34533)) ([^java.time.ZonedDateTime G__34534 G__34535 G__34536] (.minus ^java.time.ZonedDateTime G__34534 G__34535 G__34536)))


(defn plus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34537 G__34538] (.plusNanos ^java.time.ZonedDateTime G__34537 G__34538)))


(defn get-nano ([^java.time.ZonedDateTime G__34539] (jti/getter nano ^java.time.ZonedDateTime G__34539)))


(defn get-year ([^java.time.ZonedDateTime G__34540] (jti/getter year ^java.time.ZonedDateTime G__34540)))


(defn with-day-of-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34541 G__34542] (.withDayOfMonth ^java.time.ZonedDateTime G__34541 G__34542)))


(defn to-string ^java.lang.String ([^java.time.ZonedDateTime G__34543] (.toString ^java.time.ZonedDateTime G__34543)))


(defn with-zone-same-instant ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34544 G__34545] (.withZoneSameInstant ^java.time.ZonedDateTime G__34544 G__34545)))


(defn plus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34546 G__34547] (.plusMonths ^java.time.ZonedDateTime G__34546 G__34547)))


(defn with-hour ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34548 G__34549] (.withHour ^java.time.ZonedDateTime G__34548 G__34549)))


(defn with-zone-same-local ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34550 G__34551] (.withZoneSameLocal ^java.time.ZonedDateTime G__34550 G__34551)))


(defn equals ([^java.time.ZonedDateTime G__34552 ^java.lang.Object G__34553] (.equals ^java.time.ZonedDateTime G__34552 ^java.lang.Object G__34553)))



(defn get-month-value ([^java.time.ZonedDateTime G__34554] (jti/getter monthValue ^java.time.ZonedDateTime G__34554)))


(defn with-nano ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34555 G__34556] (.withNano ^java.time.ZonedDateTime G__34555 G__34556)))


(defn get-minute ([^java.time.ZonedDateTime G__34557] (jti/getter minute ^java.time.ZonedDateTime G__34557)))


(defn of-local ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__34559 ^java.time.ZoneId G__34560 ^java.time.ZoneOffset G__34561] (. java.time.ZonedDateTime ofLocal ^java.time.LocalDateTime G__34559 ^java.time.ZoneId G__34560 ^java.time.ZoneOffset G__34561)))


(defn minus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34562 G__34563] (.minusHours ^java.time.ZonedDateTime G__34562 G__34563)))


(defn with-earlier-offset-at-overlap ^java.time.chrono.ChronoZonedDateTime ([^java.time.ZonedDateTime G__34564] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime G__34564)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.ZonedDateTime G__34565] (jti/getter dayOfWeek ^java.time.ZonedDateTime G__34565)))


(defn plus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34566 G__34567] (.plusDays ^java.time.ZonedDateTime G__34566 G__34567)))


(defn plus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34568 G__34569] (.plusWeeks ^java.time.ZonedDateTime G__34568 G__34569)))


(defn hash-code ([^java.time.ZonedDateTime G__34570] (.hashCode ^java.time.ZonedDateTime G__34570)))



(defn of-strict ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__34572 ^java.time.ZoneOffset G__34573 ^java.time.ZoneId G__34574] (. java.time.ZonedDateTime ofStrict ^java.time.LocalDateTime G__34572 ^java.time.ZoneOffset G__34573 ^java.time.ZoneId G__34574)))


(defn get-long ([^java.time.ZonedDateTime G__34575 ^java.time.temporal.TemporalField G__34576] (jti/getter long ^java.time.ZonedDateTime G__34575 ^java.time.temporal.TemporalField G__34576)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.ZonedDateTime G__34577] (jti/getter offset ^java.time.ZonedDateTime G__34577)))


(defn with ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__34578 G__34579 G__34580] (.with ^java.time.ZonedDateTime G__34578 G__34579 G__34580)) ([^java.time.ZonedDateTime G__34581 G__34582] (.with ^java.time.ZonedDateTime G__34581 G__34582)))


(defn from ^java.time.ZonedDateTime ([^java.time.temporal.TemporalAccessor G__34584] (. java.time.ZonedDateTime from ^java.time.temporal.TemporalAccessor G__34584)))


(defn parse ^java.time.ZonedDateTime ([^java.lang.CharSequence G__34586] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__34586)) ([^java.lang.CharSequence G__34588 ^java.time.format.DateTimeFormatter G__34589] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__34588 ^java.time.format.DateTimeFormatter G__34589)))


(defn plus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__34590 G__34591 G__34592] (.plus ^java.time.ZonedDateTime G__34590 G__34591 G__34592)) ([^java.time.ZonedDateTime G__34593 G__34594] (.plus ^java.time.ZonedDateTime G__34593 G__34594)))


(defn with-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34595 G__34596] (.withYear ^java.time.ZonedDateTime G__34595 G__34596)))



(defn with-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34597 G__34598] (.withMonth ^java.time.ZonedDateTime G__34597 G__34598)))


(defn minus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__34599 G__34600] (.minusMinutes ^java.time.ZonedDateTime G__34599 G__34600)))

