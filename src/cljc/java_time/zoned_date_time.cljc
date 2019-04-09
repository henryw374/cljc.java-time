(ns cljc.java-time.zoned-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZonedDateTime]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time ZonedDateTime])))


(defn is-supported ([^java.time.ZonedDateTime G__55652 G__55653] (.isSupported ^java.time.ZonedDateTime G__55652 G__55653)))


(defn plus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55654 G__55655] (.plusYears ^java.time.ZonedDateTime G__55654 G__55655)))


(defn query ^java.lang.Object ([^java.time.ZonedDateTime G__55656 ^java.time.temporal.TemporalQuery G__55657] (.query ^java.time.ZonedDateTime G__55656 ^java.time.temporal.TemporalQuery G__55657)))


(defn with-second ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55658 G__55659] (.withSecond ^java.time.ZonedDateTime G__55658 G__55659)))


(defn with-later-offset-at-overlap ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55660] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime G__55660)))


(defn get-second ([^java.time.ZonedDateTime G__55661] (jti/getter second ^java.time.ZonedDateTime G__55661)))


(defn get-day-of-month ([^java.time.ZonedDateTime G__55662] (jti/getter dayOfMonth ^java.time.ZonedDateTime G__55662)))



(defn of ^java.time.ZonedDateTime ([G__55664 G__55665 G__55666 G__55667 G__55668 G__55669 G__55670 ^java.time.ZoneId G__55671] (. java.time.ZonedDateTime of G__55664 G__55665 G__55666 G__55667 G__55668 G__55669 G__55670 ^java.time.ZoneId G__55671)) ([^java.time.LocalDateTime G__55673 ^java.time.ZoneId G__55674] (. java.time.ZonedDateTime of ^java.time.LocalDateTime G__55673 ^java.time.ZoneId G__55674)) ([^java.time.LocalDate G__55676 ^java.time.LocalTime G__55677 ^java.time.ZoneId G__55678] (. java.time.ZonedDateTime of ^java.time.LocalDate G__55676 ^java.time.LocalTime G__55677 ^java.time.ZoneId G__55678)))


(defn to-offset-date-time ^java.time.OffsetDateTime ([^java.time.ZonedDateTime G__55679] (.toOffsetDateTime ^java.time.ZonedDateTime G__55679)))


(defn minus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55680 G__55681] (.minusNanos ^java.time.ZonedDateTime G__55680 G__55681)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZonedDateTime G__55682 ^java.time.temporal.TemporalField G__55683] (.range ^java.time.ZonedDateTime G__55682 ^java.time.temporal.TemporalField G__55683)))


(defn with-day-of-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55684 G__55685] (.withDayOfYear ^java.time.ZonedDateTime G__55684 G__55685)))


(defn of-instant ^java.time.ZonedDateTime ([^java.time.Instant G__55687 ^java.time.ZoneId G__55688] (. java.time.ZonedDateTime ofInstant ^java.time.Instant G__55687 ^java.time.ZoneId G__55688)) ([^java.time.LocalDateTime G__55690 ^java.time.ZoneOffset G__55691 ^java.time.ZoneId G__55692] (. java.time.ZonedDateTime ofInstant ^java.time.LocalDateTime G__55690 ^java.time.ZoneOffset G__55691 ^java.time.ZoneId G__55692)))


(defn with-minute ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55693 G__55694] (.withMinute ^java.time.ZonedDateTime G__55693 G__55694)))



(defn format ^java.lang.String ([^java.time.ZonedDateTime G__55695 ^java.time.format.DateTimeFormatter G__55696] (.format ^java.time.ZonedDateTime G__55695 ^java.time.format.DateTimeFormatter G__55696)))


(defn minus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55697 G__55698] (.minusMonths ^java.time.ZonedDateTime G__55697 G__55698)))


(defn get ([^java.time.ZonedDateTime G__55699 ^java.time.temporal.TemporalField G__55700] (.get ^java.time.ZonedDateTime G__55699 ^java.time.temporal.TemporalField G__55700)))


(defn truncated-to ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55701 ^java.time.temporal.TemporalUnit G__55702] (.truncatedTo ^java.time.ZonedDateTime G__55701 ^java.time.temporal.TemporalUnit G__55702)))


(defn minus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55703 G__55704] (.minusWeeks ^java.time.ZonedDateTime G__55703 G__55704)))


(defn minus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55705 G__55706] (.minusSeconds ^java.time.ZonedDateTime G__55705 G__55706)))


(defn to-local-time ^java.time.LocalTime ([^java.time.ZonedDateTime G__55707] (.toLocalTime ^java.time.ZonedDateTime G__55707)))


(defn now ^java.time.ZonedDateTime ([G__55709] (. java.time.ZonedDateTime now G__55709)) ([] (. java.time.ZonedDateTime now)))


(defn minus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55711 G__55712] (.minusYears ^java.time.ZonedDateTime G__55711 G__55712)))


(defn minus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55713 G__55714] (.minusDays ^java.time.ZonedDateTime G__55713 G__55714)))


(defn plus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55715 G__55716] (.plusHours ^java.time.ZonedDateTime G__55715 G__55716)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.ZonedDateTime G__55717] (.toLocalDateTime ^java.time.ZonedDateTime G__55717)))



(defn with-fixed-offset-zone ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55718] (.withFixedOffsetZone ^java.time.ZonedDateTime G__55718)))


(defn get-day-of-year ([^java.time.ZonedDateTime G__55719] (jti/getter dayOfYear ^java.time.ZonedDateTime G__55719)))


(defn get-month ^java.time.Month ([^java.time.ZonedDateTime G__55720] (jti/getter month ^java.time.ZonedDateTime G__55720)))





(defn plus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55721 G__55722] (.plusSeconds ^java.time.ZonedDateTime G__55721 G__55722)))


(defn plus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55723 G__55724] (.plusMinutes ^java.time.ZonedDateTime G__55723 G__55724)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.ZonedDateTime G__55725] (.toLocalDate ^java.time.ZonedDateTime G__55725)))


(defn get-zone ^java.time.ZoneId ([^java.time.ZonedDateTime G__55726] (jti/getter zone ^java.time.ZonedDateTime G__55726)))



(defn until ([^java.time.ZonedDateTime G__55727 ^java.time.temporal.Temporal G__55728 ^java.time.temporal.TemporalUnit G__55729] (.until ^java.time.ZonedDateTime G__55727 ^java.time.temporal.Temporal G__55728 ^java.time.temporal.TemporalUnit G__55729)))




(defn get-hour ([^java.time.ZonedDateTime G__55730] (jti/getter hour ^java.time.ZonedDateTime G__55730)))


(defn minus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__55731 G__55732] (.minus ^java.time.ZonedDateTime G__55731 G__55732)) ([^java.time.ZonedDateTime G__55733 G__55734 G__55735] (.minus ^java.time.ZonedDateTime G__55733 G__55734 G__55735)))


(defn plus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55736 G__55737] (.plusNanos ^java.time.ZonedDateTime G__55736 G__55737)))


(defn get-nano ([^java.time.ZonedDateTime G__55738] (jti/getter nano ^java.time.ZonedDateTime G__55738)))


(defn get-year ([^java.time.ZonedDateTime G__55739] (jti/getter year ^java.time.ZonedDateTime G__55739)))


(defn with-day-of-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55740 G__55741] (.withDayOfMonth ^java.time.ZonedDateTime G__55740 G__55741)))


(defn to-string ^java.lang.String ([^java.time.ZonedDateTime G__55742] (.toString ^java.time.ZonedDateTime G__55742)))


(defn with-zone-same-instant ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55743 G__55744] (.withZoneSameInstant ^java.time.ZonedDateTime G__55743 G__55744)))


(defn plus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55745 G__55746] (.plusMonths ^java.time.ZonedDateTime G__55745 G__55746)))


(defn with-hour ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55747 G__55748] (.withHour ^java.time.ZonedDateTime G__55747 G__55748)))


(defn with-zone-same-local ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55749 G__55750] (.withZoneSameLocal ^java.time.ZonedDateTime G__55749 G__55750)))


(defn equals ([^java.time.ZonedDateTime G__55751 ^java.lang.Object G__55752] (.equals ^java.time.ZonedDateTime G__55751 ^java.lang.Object G__55752)))



(defn get-month-value ([^java.time.ZonedDateTime G__55753] (jti/getter monthValue ^java.time.ZonedDateTime G__55753)))


(defn with-nano ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55754 G__55755] (.withNano ^java.time.ZonedDateTime G__55754 G__55755)))


(defn get-minute ([^java.time.ZonedDateTime G__55756] (jti/getter minute ^java.time.ZonedDateTime G__55756)))


(defn of-local ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__55758 ^java.time.ZoneId G__55759 ^java.time.ZoneOffset G__55760] (. java.time.ZonedDateTime ofLocal ^java.time.LocalDateTime G__55758 ^java.time.ZoneId G__55759 ^java.time.ZoneOffset G__55760)))


(defn minus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55761 G__55762] (.minusHours ^java.time.ZonedDateTime G__55761 G__55762)))


(defn with-earlier-offset-at-overlap ^java.time.chrono.ChronoZonedDateTime ([^java.time.ZonedDateTime G__55763] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime G__55763)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.ZonedDateTime G__55764] (jti/getter dayOfWeek ^java.time.ZonedDateTime G__55764)))


(defn plus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55765 G__55766] (.plusDays ^java.time.ZonedDateTime G__55765 G__55766)))


(defn plus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55767 G__55768] (.plusWeeks ^java.time.ZonedDateTime G__55767 G__55768)))


(defn hash-code ([^java.time.ZonedDateTime G__55769] (.hashCode ^java.time.ZonedDateTime G__55769)))



(defn of-strict ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__55771 ^java.time.ZoneOffset G__55772 ^java.time.ZoneId G__55773] (. java.time.ZonedDateTime ofStrict ^java.time.LocalDateTime G__55771 ^java.time.ZoneOffset G__55772 ^java.time.ZoneId G__55773)))


(defn get-long ([^java.time.ZonedDateTime G__55774 ^java.time.temporal.TemporalField G__55775] (.getLong ^java.time.ZonedDateTime G__55774 ^java.time.temporal.TemporalField G__55775)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.ZonedDateTime G__55776] (jti/getter offset ^java.time.ZonedDateTime G__55776)))


(defn with ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__55777 G__55778 G__55779] (.with ^java.time.ZonedDateTime G__55777 G__55778 G__55779)) ([^java.time.ZonedDateTime G__55780 G__55781] (.with ^java.time.ZonedDateTime G__55780 G__55781)))


(defn from ^java.time.ZonedDateTime ([^java.time.temporal.TemporalAccessor G__55783] (. java.time.ZonedDateTime from ^java.time.temporal.TemporalAccessor G__55783)))


(defn parse ^java.time.ZonedDateTime ([^java.lang.CharSequence G__55785] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__55785)) ([^java.lang.CharSequence G__55787 ^java.time.format.DateTimeFormatter G__55788] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__55787 ^java.time.format.DateTimeFormatter G__55788)))


(defn plus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__55789 G__55790 G__55791] (.plus ^java.time.ZonedDateTime G__55789 G__55790 G__55791)) ([^java.time.ZonedDateTime G__55792 G__55793] (.plus ^java.time.ZonedDateTime G__55792 G__55793)))


(defn with-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55794 G__55795] (.withYear ^java.time.ZonedDateTime G__55794 G__55795)))



(defn with-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55796 G__55797] (.withMonth ^java.time.ZonedDateTime G__55796 G__55797)))


(defn minus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__55798 G__55799] (.minusMinutes ^java.time.ZonedDateTime G__55798 G__55799)))

