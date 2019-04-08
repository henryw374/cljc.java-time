(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [OffsetDateTime]])) #? (:clj (:import [java.time OffsetDateTime])))

(defn compare-to ([^java.time.OffsetDateTime G__26536 G__26537] (.compareTo ^java.time.OffsetDateTime G__26536 G__26537)))


(defn is-supported ([^java.time.OffsetDateTime G__26538 G__26539] (.isSupported ^java.time.OffsetDateTime G__26538 G__26539)))


(defn plus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26540 G__26541] (.plusYears ^java.time.OffsetDateTime G__26540 G__26541)))


(defn to-zoned-date-time ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__26542] (.toZonedDateTime ^java.time.OffsetDateTime G__26542)))


(defn query ^java.lang.Object ([^java.time.OffsetDateTime G__26543 ^java.time.temporal.TemporalQuery G__26544] (.query ^java.time.OffsetDateTime G__26543 ^java.time.temporal.TemporalQuery G__26544)))


(defn with-second ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26545 G__26546] (.withSecond ^java.time.OffsetDateTime G__26545 G__26546)))


(defn get-second ([^java.time.OffsetDateTime G__26547] (jti/getter second ^java.time.OffsetDateTime G__26547)))


(defn get-day-of-month ([^java.time.OffsetDateTime G__26548] (jti/getter dayOfMonth ^java.time.OffsetDateTime G__26548)))


(defn of ^java.time.OffsetDateTime ([^java.time.LocalDate G__26550 ^java.time.LocalTime G__26551 ^java.time.ZoneOffset G__26552] (. java.time.OffsetDateTime of ^java.time.LocalDate G__26550 ^java.time.LocalTime G__26551 ^java.time.ZoneOffset G__26552)) ([G__26554 G__26555 G__26556 G__26557 G__26558 G__26559 G__26560 ^java.time.ZoneOffset G__26561] (. java.time.OffsetDateTime of G__26554 G__26555 G__26556 G__26557 G__26558 G__26559 G__26560 ^java.time.ZoneOffset G__26561)) ([^java.time.LocalDateTime G__26563 ^java.time.ZoneOffset G__26564] (. java.time.OffsetDateTime of ^java.time.LocalDateTime G__26563 ^java.time.ZoneOffset G__26564)))


(defn minus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26565 G__26566] (.minusNanos ^java.time.OffsetDateTime G__26565 G__26566)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetDateTime G__26567 ^java.time.temporal.TemporalField G__26568] (.range ^java.time.OffsetDateTime G__26567 ^java.time.temporal.TemporalField G__26568)))


(defn with-day-of-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26569 G__26570] (.withDayOfYear ^java.time.OffsetDateTime G__26569 G__26570)))


(defn is-equal ([^java.time.OffsetDateTime G__26571 ^java.time.OffsetDateTime G__26572] (.isEqual ^java.time.OffsetDateTime G__26571 ^java.time.OffsetDateTime G__26572)))


(defn of-instant ^java.time.OffsetDateTime ([^java.time.Instant G__26574 ^java.time.ZoneId G__26575] (. java.time.OffsetDateTime ofInstant ^java.time.Instant G__26574 ^java.time.ZoneId G__26575)))


(defn with-minute ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26576 G__26577] (.withMinute ^java.time.OffsetDateTime G__26576 G__26577)))


(defn format ^java.lang.String ([^java.time.OffsetDateTime G__26578 ^java.time.format.DateTimeFormatter G__26579] (.format ^java.time.OffsetDateTime G__26578 ^java.time.format.DateTimeFormatter G__26579)))


(defn minus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26580 G__26581] (.minusMonths ^java.time.OffsetDateTime G__26580 G__26581)))


(defn get ([^java.time.OffsetDateTime G__26582 ^java.time.temporal.TemporalField G__26583] (.get ^java.time.OffsetDateTime G__26582 ^java.time.temporal.TemporalField G__26583)))


(defn truncated-to ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26584 ^java.time.temporal.TemporalUnit G__26585] (.truncatedTo ^java.time.OffsetDateTime G__26584 ^java.time.temporal.TemporalUnit G__26585)))


(defn minus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26586 G__26587] (.minusWeeks ^java.time.OffsetDateTime G__26586 G__26587)))


(defn minus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26588 G__26589] (.minusSeconds ^java.time.OffsetDateTime G__26588 G__26589)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetDateTime G__26590] (.toLocalTime ^java.time.OffsetDateTime G__26590)))


(defn now ^java.time.OffsetDateTime ([G__26592] (. java.time.OffsetDateTime now G__26592)) ([] (. java.time.OffsetDateTime now)))


(defn minus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26594 G__26595] (.minusYears ^java.time.OffsetDateTime G__26594 G__26595)))


(defn minus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26596 G__26597] (.minusDays ^java.time.OffsetDateTime G__26596 G__26597)))


(defn plus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26598 G__26599] (.plusHours ^java.time.OffsetDateTime G__26598 G__26599)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.OffsetDateTime G__26600] (.toLocalDateTime ^java.time.OffsetDateTime G__26600)))



(defn get-day-of-year ([^java.time.OffsetDateTime G__26601] (jti/getter dayOfYear ^java.time.OffsetDateTime G__26601)))


(defn get-month ^java.time.Month ([^java.time.OffsetDateTime G__26602] (jti/getter month ^java.time.OffsetDateTime G__26602)))



(defn plus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26603 G__26604] (.plusSeconds ^java.time.OffsetDateTime G__26603 G__26604)))


(defn at-zone-same-instant ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__26605 ^java.time.ZoneId G__26606] (.atZoneSameInstant ^java.time.OffsetDateTime G__26605 ^java.time.ZoneId G__26606)))


(defn plus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26607 G__26608] (.plusMinutes ^java.time.OffsetDateTime G__26607 G__26608)))


(defn to-local-date ^java.time.LocalDate ([^java.time.OffsetDateTime G__26609] (.toLocalDate ^java.time.OffsetDateTime G__26609)))



(defn until ([^java.time.OffsetDateTime G__26610 ^java.time.temporal.Temporal G__26611 ^java.time.temporal.TemporalUnit G__26612] (.until ^java.time.OffsetDateTime G__26610 ^java.time.temporal.Temporal G__26611 ^java.time.temporal.TemporalUnit G__26612)))




(defn is-before ([^java.time.OffsetDateTime G__26613 ^java.time.OffsetDateTime G__26614] (.isBefore ^java.time.OffsetDateTime G__26613 ^java.time.OffsetDateTime G__26614)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetDateTime G__26615 ^java.time.temporal.Temporal G__26616] (.adjustInto ^java.time.OffsetDateTime G__26615 ^java.time.temporal.Temporal G__26616)))


(defn get-hour ([^java.time.OffsetDateTime G__26617] (jti/getter hour ^java.time.OffsetDateTime G__26617)))


(defn minus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26618 G__26619] (.minus ^java.time.OffsetDateTime G__26618 G__26619)) ([^java.time.OffsetDateTime G__26620 G__26621 G__26622] (.minus ^java.time.OffsetDateTime G__26620 G__26621 G__26622)))


(defn plus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26623 G__26624] (.plusNanos ^java.time.OffsetDateTime G__26623 G__26624)))


(defn get-nano ([^java.time.OffsetDateTime G__26625] (jti/getter nano ^java.time.OffsetDateTime G__26625)))


(defn get-year ([^java.time.OffsetDateTime G__26626] (jti/getter year ^java.time.OffsetDateTime G__26626)))


(defn with-day-of-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26627 G__26628] (.withDayOfMonth ^java.time.OffsetDateTime G__26627 G__26628)))


(defn is-after ([^java.time.OffsetDateTime G__26629 ^java.time.OffsetDateTime G__26630] (.isAfter ^java.time.OffsetDateTime G__26629 ^java.time.OffsetDateTime G__26630)))


(defn to-string ^java.lang.String ([^java.time.OffsetDateTime G__26631] (.toString ^java.time.OffsetDateTime G__26631)))


(defn plus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26632 G__26633] (.plusMonths ^java.time.OffsetDateTime G__26632 G__26633)))


(defn with-hour ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26634 G__26635] (.withHour ^java.time.OffsetDateTime G__26634 G__26635)))


(defn to-offset-time ^java.time.OffsetTime ([^java.time.OffsetDateTime G__26636] (.toOffsetTime ^java.time.OffsetDateTime G__26636)))


(defn equals ([^java.time.OffsetDateTime G__26637 ^java.lang.Object G__26638] (.equals ^java.time.OffsetDateTime G__26637 ^java.lang.Object G__26638)))



(defn get-month-value ([^java.time.OffsetDateTime G__26639] (jti/getter monthValue ^java.time.OffsetDateTime G__26639)))



(defn with-nano ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26640 G__26641] (.withNano ^java.time.OffsetDateTime G__26640 G__26641)))


(defn get-minute ([^java.time.OffsetDateTime G__26642] (jti/getter minute ^java.time.OffsetDateTime G__26642)))


(defn minus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26643 G__26644] (.minusHours ^java.time.OffsetDateTime G__26643 G__26644)))


(defn to-instant ^java.time.Instant ([^java.time.OffsetDateTime G__26645] (.toInstant ^java.time.OffsetDateTime G__26645)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.OffsetDateTime G__26646] (jti/getter dayOfWeek ^java.time.OffsetDateTime G__26646)))


(defn plus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26647 G__26648] (.plusDays ^java.time.OffsetDateTime G__26647 G__26648)))


(defn plus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26649 G__26650] (.plusWeeks ^java.time.OffsetDateTime G__26649 G__26650)))


(defn hash-code ([^java.time.OffsetDateTime G__26651] (.hashCode ^java.time.OffsetDateTime G__26651)))



(defn get-long ([^java.time.OffsetDateTime G__26652 ^java.time.temporal.TemporalField G__26653] (jti/getter long ^java.time.OffsetDateTime G__26652 ^java.time.temporal.TemporalField G__26653)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetDateTime G__26654] (jti/getter offset ^java.time.OffsetDateTime G__26654)))


(defn with-offset-same-instant ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26655 ^java.time.ZoneOffset G__26656] (.withOffsetSameInstant ^java.time.OffsetDateTime G__26655 ^java.time.ZoneOffset G__26656)))


(defn time-line-order ^java.util.Comparator ([] (. java.time.OffsetDateTime timeLineOrder)))


(defn with ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26658 G__26659] (.with ^java.time.OffsetDateTime G__26658 G__26659)) ([^java.time.OffsetDateTime G__26660 G__26661 G__26662] (.with ^java.time.OffsetDateTime G__26660 G__26661 G__26662)))


(defn from ^java.time.OffsetDateTime ([^java.time.temporal.TemporalAccessor G__26664] (. java.time.OffsetDateTime from ^java.time.temporal.TemporalAccessor G__26664)))


(defn parse ^java.time.OffsetDateTime ([^java.lang.CharSequence G__26666] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__26666)) ([^java.lang.CharSequence G__26668 ^java.time.format.DateTimeFormatter G__26669] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__26668 ^java.time.format.DateTimeFormatter G__26669)))


(defn plus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26670 G__26671] (.plus ^java.time.OffsetDateTime G__26670 G__26671)) ([^java.time.OffsetDateTime G__26672 G__26673 G__26674] (.plus ^java.time.OffsetDateTime G__26672 G__26673 G__26674)))


(defn with-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26675 G__26676] (.withYear ^java.time.OffsetDateTime G__26675 G__26676)))


(defn to-epoch-second ([^java.time.OffsetDateTime G__26677] (.toEpochSecond ^java.time.OffsetDateTime G__26677)))


(defn with-offset-same-local ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26678 ^java.time.ZoneOffset G__26679] (.withOffsetSameLocal ^java.time.OffsetDateTime G__26678 ^java.time.ZoneOffset G__26679)))



(defn at-zone-similar-local ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__26680 ^java.time.ZoneId G__26681] (.atZoneSimilarLocal ^java.time.OffsetDateTime G__26680 ^java.time.ZoneId G__26681)))



(defn with-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26682 G__26683] (.withMonth ^java.time.OffsetDateTime G__26682 G__26683)))


(defn minus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__26684 G__26685] (.minusMinutes ^java.time.OffsetDateTime G__26684 G__26685)))

