(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDate]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time LocalDate])))
(def max (. java.time.LocalDate -MAX))
(def min (. java.time.LocalDate -MIN))

(defn compare-to ([^java.time.LocalDate G__55383 G__55384] (.compareTo ^java.time.LocalDate G__55383 G__55384)))


(defn is-supported ([^java.time.LocalDate G__55385 G__55386] (.isSupported ^java.time.LocalDate G__55385 G__55386)))


(defn plus-years ^java.time.LocalDate ([^java.time.LocalDate G__55387 G__55388] (.plusYears ^java.time.LocalDate G__55387 G__55388)))


(defn get-era ^java.time.chrono.Era ([^java.time.LocalDate G__55389] (jti/getter era ^java.time.LocalDate G__55389)))


(defn query ^java.lang.Object ([^java.time.LocalDate G__55390 ^java.time.temporal.TemporalQuery G__55391] (.query ^java.time.LocalDate G__55390 ^java.time.temporal.TemporalQuery G__55391)))


(defn get-day-of-month ([^java.time.LocalDate G__55392] (jti/getter dayOfMonth ^java.time.LocalDate G__55392)))



(defn of ^java.time.LocalDate ([G__55394 G__55395 G__55396] (. java.time.LocalDate of G__55394 G__55395 G__55396)))




(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDate G__55397 ^java.time.temporal.TemporalField G__55398] (.range ^java.time.LocalDate G__55397 ^java.time.temporal.TemporalField G__55398)))



(defn of-epoch-day ^java.time.LocalDate ([G__55400] (. java.time.LocalDate ofEpochDay G__55400)))


(defn at-start-of-day ^java.time.ZonedDateTime ([^java.time.LocalDate G__55401 ^java.time.ZoneId G__55402] (.atStartOfDay ^java.time.LocalDate G__55401 ^java.time.ZoneId G__55402)) ([^java.time.LocalDate G__55403] (.atStartOfDay ^java.time.LocalDate G__55403)))


(defn with-day-of-year ^java.time.LocalDate ([^java.time.LocalDate G__55404 G__55405] (.withDayOfYear ^java.time.LocalDate G__55404 G__55405)))


(defn is-equal ([^java.time.LocalDate G__55406 ^java.time.chrono.ChronoLocalDate G__55407] (.isEqual ^java.time.LocalDate G__55406 ^java.time.chrono.ChronoLocalDate G__55407)))



(defn length-of-month ([^java.time.LocalDate G__55408] (.lengthOfMonth ^java.time.LocalDate G__55408)))




(defn format ^java.lang.String ([^java.time.LocalDate G__55409 ^java.time.format.DateTimeFormatter G__55410] (.format ^java.time.LocalDate G__55409 ^java.time.format.DateTimeFormatter G__55410)))


(defn minus-months ^java.time.LocalDate ([^java.time.LocalDate G__55411 G__55412] (.minusMonths ^java.time.LocalDate G__55411 G__55412)))


(defn get ([^java.time.LocalDate G__55413 ^java.time.temporal.TemporalField G__55414] (.get ^java.time.LocalDate G__55413 ^java.time.temporal.TemporalField G__55414)))


(defn minus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__55415 G__55416] (.minusWeeks ^java.time.LocalDate G__55415 G__55416)))


(defn at-time ^java.time.OffsetDateTime ([^java.time.LocalDate G__55417 G__55418] (.atTime ^java.time.LocalDate G__55417 G__55418)) ([^java.time.LocalDate G__55419 G__55420 G__55421 G__55422 G__55423] (.atTime ^java.time.LocalDate G__55419 G__55420 G__55421 G__55422 G__55423)) ([^java.time.LocalDate G__55424 G__55425 G__55426 G__55427] (.atTime ^java.time.LocalDate G__55424 G__55425 G__55426 G__55427)) ([^java.time.LocalDate G__55428 G__55429 G__55430] (.atTime ^java.time.LocalDate G__55428 G__55429 G__55430)))


(defn now ^java.time.LocalDate ([] (. java.time.LocalDate now)) ([G__55433] (. java.time.LocalDate now G__55433)))


(defn minus-years ^java.time.LocalDate ([^java.time.LocalDate G__55434 G__55435] (.minusYears ^java.time.LocalDate G__55434 G__55435)))


(defn minus-days ^java.time.LocalDate ([^java.time.LocalDate G__55436 G__55437] (.minusDays ^java.time.LocalDate G__55436 G__55437)))



(defn get-day-of-year ([^java.time.LocalDate G__55438] (jti/getter dayOfYear ^java.time.LocalDate G__55438)))


(defn get-month ^java.time.Month ([^java.time.LocalDate G__55439] (jti/getter month ^java.time.LocalDate G__55439)))





(defn until ([^java.time.LocalDate G__55440 ^java.time.temporal.Temporal G__55441 ^java.time.temporal.TemporalUnit G__55442] (.until ^java.time.LocalDate G__55440 ^java.time.temporal.Temporal G__55441 ^java.time.temporal.TemporalUnit G__55442)) ([^java.time.LocalDate G__55443 G__55444] (.until ^java.time.LocalDate G__55443 G__55444)))





(defn is-before ([^java.time.LocalDate G__55445 ^java.time.chrono.ChronoLocalDate G__55446] (.isBefore ^java.time.LocalDate G__55445 ^java.time.chrono.ChronoLocalDate G__55446)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDate G__55447 ^java.time.temporal.Temporal G__55448] (.adjustInto ^java.time.LocalDate G__55447 ^java.time.temporal.Temporal G__55448)))


(defn minus ^java.time.LocalDate ([^java.time.LocalDate G__55449 G__55450 G__55451] (.minus ^java.time.LocalDate G__55449 G__55450 G__55451)) ([^java.time.LocalDate G__55452 G__55453] (.minus ^java.time.LocalDate G__55452 G__55453)))



(defn get-year ([^java.time.LocalDate G__55454] (jti/getter year ^java.time.LocalDate G__55454)))


(defn with-day-of-month ^java.time.LocalDate ([^java.time.LocalDate G__55455 G__55456] (.withDayOfMonth ^java.time.LocalDate G__55455 G__55456)))


(defn to-epoch-day ([^java.time.LocalDate G__55457] (.toEpochDay ^java.time.LocalDate G__55457)))


(defn is-after ([^java.time.LocalDate G__55458 ^java.time.chrono.ChronoLocalDate G__55459] (.isAfter ^java.time.LocalDate G__55458 ^java.time.chrono.ChronoLocalDate G__55459)))


(defn of-year-day ^java.time.LocalDate ([G__55461 G__55462] (. java.time.LocalDate ofYearDay G__55461 G__55462)))


(defn get-chronology ^java.time.chrono.Chronology ([^java.time.LocalDate G__55463] (jti/getter chronology ^java.time.LocalDate G__55463)))


(defn to-string ^java.lang.String ([^java.time.LocalDate G__55464] (.toString ^java.time.LocalDate G__55464)))


(defn plus-months ^java.time.LocalDate ([^java.time.LocalDate G__55465 G__55466] (.plusMonths ^java.time.LocalDate G__55465 G__55466)))


(defn equals ([^java.time.LocalDate G__55467 ^java.lang.Object G__55468] (.equals ^java.time.LocalDate G__55467 ^java.lang.Object G__55468)))


(defn get-month-value ([^java.time.LocalDate G__55469] (jti/getter monthValue ^java.time.LocalDate G__55469)))



(defn length-of-year ([^java.time.LocalDate G__55470] (.lengthOfYear ^java.time.LocalDate G__55470)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDate G__55471] (jti/getter dayOfWeek ^java.time.LocalDate G__55471)))


(defn plus-days ^java.time.LocalDate ([^java.time.LocalDate G__55472 G__55473] (.plusDays ^java.time.LocalDate G__55472 G__55473)))



(defn plus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__55474 G__55475] (.plusWeeks ^java.time.LocalDate G__55474 G__55475)))


(defn hash-code ([^java.time.LocalDate G__55476] (.hashCode ^java.time.LocalDate G__55476)))



(defn get-long ([^java.time.LocalDate G__55477 ^java.time.temporal.TemporalField G__55478] (.getLong ^java.time.LocalDate G__55477 ^java.time.temporal.TemporalField G__55478)))


(defn is-leap-year ([^java.time.LocalDate G__55479] (.isLeapYear ^java.time.LocalDate G__55479)))


(defn with ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDate G__55480 G__55481] (.with ^java.time.LocalDate G__55480 G__55481)) ([^java.time.LocalDate G__55482 G__55483 G__55484] (.with ^java.time.LocalDate G__55482 G__55483 G__55484)))


(defn from ^java.time.LocalDate ([^java.time.temporal.TemporalAccessor G__55486] (. java.time.LocalDate from ^java.time.temporal.TemporalAccessor G__55486)))


(defn parse ^java.time.LocalDate ([^java.lang.CharSequence G__55488 ^java.time.format.DateTimeFormatter G__55489] (. java.time.LocalDate parse ^java.lang.CharSequence G__55488 ^java.time.format.DateTimeFormatter G__55489)) ([^java.lang.CharSequence G__55491] (. java.time.LocalDate parse ^java.lang.CharSequence G__55491)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalDate G__55492 G__55493 G__55494] (.plus ^java.time.LocalDate G__55492 G__55493 G__55494)) ([^java.time.LocalDate G__55495 G__55496] (.plus ^java.time.LocalDate G__55495 G__55496)))


(defn with-year ^java.time.LocalDate ([^java.time.LocalDate G__55497 G__55498] (.withYear ^java.time.LocalDate G__55497 G__55498)))



(defn with-month ^java.time.LocalDate ([^java.time.LocalDate G__55499 G__55500] (.withMonth ^java.time.LocalDate G__55499 G__55500)))


