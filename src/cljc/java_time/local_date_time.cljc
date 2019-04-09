(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDateTime])))
(def max (. java.time.LocalDateTime -MAX))
(def min (. java.time.LocalDateTime -MIN))

(defn compare-to ([^java.time.LocalDateTime G__46428 G__46429] (.compareTo ^java.time.LocalDateTime G__46428 G__46429)))


(defn is-supported ([^java.time.LocalDateTime G__46430 G__46431] (.isSupported ^java.time.LocalDateTime G__46430 G__46431)))


(defn plus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46432 G__46433] (.plusYears ^java.time.LocalDateTime G__46432 G__46433)))


(defn query ^java.lang.Object ([^java.time.LocalDateTime G__46434 ^java.time.temporal.TemporalQuery G__46435] (.query ^java.time.LocalDateTime G__46434 ^java.time.temporal.TemporalQuery G__46435)))


(defn with-second ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46436 G__46437] (.withSecond ^java.time.LocalDateTime G__46436 G__46437)))


(defn get-second ([^java.time.LocalDateTime G__46438] (jti/getter second ^java.time.LocalDateTime G__46438)))


(defn get-day-of-month ([^java.time.LocalDateTime G__46439] (jti/getter dayOfMonth ^java.time.LocalDateTime G__46439)))


(defn of ^java.time.LocalDateTime ([G__46441 G__46442 G__46443 G__46444 G__46445 G__46446 G__46447] (. java.time.LocalDateTime of G__46441 G__46442 G__46443 G__46444 G__46445 G__46446 G__46447)) ([^java.time.LocalDate G__46449 ^java.time.LocalTime G__46450] (. java.time.LocalDateTime of ^java.time.LocalDate G__46449 ^java.time.LocalTime G__46450)) ([G__46452 G__46453 G__46454 G__46455 G__46456 G__46457] (. java.time.LocalDateTime of G__46452 G__46453 G__46454 G__46455 G__46456 G__46457)) ([G__46459 G__46460 G__46461 G__46462 G__46463] (. java.time.LocalDateTime of G__46459 G__46460 G__46461 G__46462 G__46463)))



(defn minus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46464 G__46465] (.minusNanos ^java.time.LocalDateTime G__46464 G__46465)))


(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDateTime G__46466 ^java.time.temporal.TemporalField G__46467] (.range ^java.time.LocalDateTime G__46466 ^java.time.temporal.TemporalField G__46467)))


(defn with-day-of-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46468 G__46469] (.withDayOfYear ^java.time.LocalDateTime G__46468 G__46469)))


(defn is-equal ([^java.time.LocalDateTime G__46470 ^java.time.chrono.ChronoLocalDateTime G__46471] (.isEqual ^java.time.LocalDateTime G__46470 ^java.time.chrono.ChronoLocalDateTime G__46471)))


(defn of-instant ^java.time.LocalDateTime ([^java.time.Instant G__46473 ^java.time.ZoneId G__46474] (. java.time.LocalDateTime ofInstant ^java.time.Instant G__46473 ^java.time.ZoneId G__46474)))


(defn with-minute ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46475 G__46476] (.withMinute ^java.time.LocalDateTime G__46475 G__46476)))



(defn format ^java.lang.String ([^java.time.LocalDateTime G__46477 ^java.time.format.DateTimeFormatter G__46478] (.format ^java.time.LocalDateTime G__46477 ^java.time.format.DateTimeFormatter G__46478)))



(defn of-epoch-second ^java.time.LocalDateTime ([G__46480 G__46481 ^java.time.ZoneOffset G__46482] (. java.time.LocalDateTime ofEpochSecond G__46480 G__46481 ^java.time.ZoneOffset G__46482)))


(defn minus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46483 G__46484] (.minusMonths ^java.time.LocalDateTime G__46483 G__46484)))


(defn get ([^java.time.LocalDateTime G__46485 ^java.time.temporal.TemporalField G__46486] (.get ^java.time.LocalDateTime G__46485 ^java.time.temporal.TemporalField G__46486)))


(defn truncated-to ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46487 ^java.time.temporal.TemporalUnit G__46488] (.truncatedTo ^java.time.LocalDateTime G__46487 ^java.time.temporal.TemporalUnit G__46488)))


(defn minus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46489 G__46490] (.minusWeeks ^java.time.LocalDateTime G__46489 G__46490)))


(defn minus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46491 G__46492] (.minusSeconds ^java.time.LocalDateTime G__46491 G__46492)))


(defn to-local-time ^java.time.LocalTime ([^java.time.LocalDateTime G__46493] (.toLocalTime ^java.time.LocalDateTime G__46493)))


(defn now ^java.time.LocalDateTime ([G__46495] (. java.time.LocalDateTime now G__46495)) ([] (. java.time.LocalDateTime now)))


(defn minus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46497 G__46498] (.minusYears ^java.time.LocalDateTime G__46497 G__46498)))


(defn minus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46499 G__46500] (.minusDays ^java.time.LocalDateTime G__46499 G__46500)))


(defn plus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46501 G__46502] (.plusHours ^java.time.LocalDateTime G__46501 G__46502)))



(defn get-day-of-year ([^java.time.LocalDateTime G__46503] (jti/getter dayOfYear ^java.time.LocalDateTime G__46503)))


(defn get-month ^java.time.Month ([^java.time.LocalDateTime G__46504] (jti/getter month ^java.time.LocalDateTime G__46504)))


(defn plus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46505 G__46506] (.plusSeconds ^java.time.LocalDateTime G__46505 G__46506)))


(defn plus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46507 G__46508] (.plusMinutes ^java.time.LocalDateTime G__46507 G__46508)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDateTime G__46509] (.toLocalDate ^java.time.LocalDateTime G__46509)))



(defn until ([^java.time.LocalDateTime G__46510 ^java.time.temporal.Temporal G__46511 ^java.time.temporal.TemporalUnit G__46512] (.until ^java.time.LocalDateTime G__46510 ^java.time.temporal.Temporal G__46511 ^java.time.temporal.TemporalUnit G__46512)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.LocalDateTime G__46513 ^java.time.ZoneOffset G__46514] (.atOffset ^java.time.LocalDateTime G__46513 ^java.time.ZoneOffset G__46514)))




(defn is-before ([^java.time.LocalDateTime G__46515 ^java.time.chrono.ChronoLocalDateTime G__46516] (.isBefore ^java.time.LocalDateTime G__46515 ^java.time.chrono.ChronoLocalDateTime G__46516)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDateTime G__46517 ^java.time.temporal.Temporal G__46518] (.adjustInto ^java.time.LocalDateTime G__46517 ^java.time.temporal.Temporal G__46518)))


(defn get-hour ([^java.time.LocalDateTime G__46519] (jti/getter hour ^java.time.LocalDateTime G__46519)))


(defn minus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__46520 G__46521 G__46522] (.minus ^java.time.LocalDateTime G__46520 G__46521 G__46522)) ([^java.time.LocalDateTime G__46523 G__46524] (.minus ^java.time.LocalDateTime G__46523 G__46524)))


(defn plus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46525 G__46526] (.plusNanos ^java.time.LocalDateTime G__46525 G__46526)))


(defn get-nano ([^java.time.LocalDateTime G__46527] (jti/getter nano ^java.time.LocalDateTime G__46527)))


(defn get-year ([^java.time.LocalDateTime G__46528] (jti/getter year ^java.time.LocalDateTime G__46528)))


(defn with-day-of-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46529 G__46530] (.withDayOfMonth ^java.time.LocalDateTime G__46529 G__46530)))


(defn is-after ([^java.time.LocalDateTime G__46531 ^java.time.chrono.ChronoLocalDateTime G__46532] (.isAfter ^java.time.LocalDateTime G__46531 ^java.time.chrono.ChronoLocalDateTime G__46532)))


(defn to-string ^java.lang.String ([^java.time.LocalDateTime G__46533] (.toString ^java.time.LocalDateTime G__46533)))


(defn plus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46534 G__46535] (.plusMonths ^java.time.LocalDateTime G__46534 G__46535)))


(defn with-hour ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46536 G__46537] (.withHour ^java.time.LocalDateTime G__46536 G__46537)))


(defn equals ([^java.time.LocalDateTime G__46538 ^java.lang.Object G__46539] (.equals ^java.time.LocalDateTime G__46538 ^java.lang.Object G__46539)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__46540 G__46541] (.atZone ^java.time.LocalDateTime G__46540 G__46541)))


(defn get-month-value ([^java.time.LocalDateTime G__46542] (jti/getter monthValue ^java.time.LocalDateTime G__46542)))




(defn with-nano ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46543 G__46544] (.withNano ^java.time.LocalDateTime G__46543 G__46544)))


(defn get-minute ([^java.time.LocalDateTime G__46545] (jti/getter minute ^java.time.LocalDateTime G__46545)))


(defn minus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46546 G__46547] (.minusHours ^java.time.LocalDateTime G__46546 G__46547)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDateTime G__46548] (jti/getter dayOfWeek ^java.time.LocalDateTime G__46548)))


(defn plus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46549 G__46550] (.plusDays ^java.time.LocalDateTime G__46549 G__46550)))


(defn plus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46551 G__46552] (.plusWeeks ^java.time.LocalDateTime G__46551 G__46552)))


(defn hash-code ([^java.time.LocalDateTime G__46553] (.hashCode ^java.time.LocalDateTime G__46553)))



(defn get-long ([^java.time.LocalDateTime G__46554 ^java.time.temporal.TemporalField G__46555] (.getLong ^java.time.LocalDateTime G__46554 ^java.time.temporal.TemporalField G__46555)))


(defn with ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__46556 G__46557 G__46558] (.with ^java.time.LocalDateTime G__46556 G__46557 G__46558)) ([^java.time.LocalDateTime G__46559 G__46560] (.with ^java.time.LocalDateTime G__46559 G__46560)))


(defn from ^java.time.LocalDateTime ([^java.time.temporal.TemporalAccessor G__46562] (. java.time.LocalDateTime from ^java.time.temporal.TemporalAccessor G__46562)))


(defn parse ^java.time.LocalDateTime ([^java.lang.CharSequence G__46564] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__46564)) ([^java.lang.CharSequence G__46566 ^java.time.format.DateTimeFormatter G__46567] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__46566 ^java.time.format.DateTimeFormatter G__46567)))


(defn plus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__46568 G__46569 G__46570] (.plus ^java.time.LocalDateTime G__46568 G__46569 G__46570)) ([^java.time.LocalDateTime G__46571 G__46572] (.plus ^java.time.LocalDateTime G__46571 G__46572)))


(defn with-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46573 G__46574] (.withYear ^java.time.LocalDateTime G__46573 G__46574)))



(defn with-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46575 G__46576] (.withMonth ^java.time.LocalDateTime G__46575 G__46576)))


(defn minus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__46577 G__46578] (.minusMinutes ^java.time.LocalDateTime G__46577 G__46578)))

