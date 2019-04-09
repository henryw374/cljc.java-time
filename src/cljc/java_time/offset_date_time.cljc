(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetDateTime])))
(def min (. java.time.OffsetDateTime -MIN))
(def max (. java.time.OffsetDateTime -MAX))

(defn compare-to ([^java.time.OffsetDateTime G__46906 G__46907] (.compareTo ^java.time.OffsetDateTime G__46906 G__46907)))


(defn is-supported ([^java.time.OffsetDateTime G__46908 G__46909] (.isSupported ^java.time.OffsetDateTime G__46908 G__46909)))


(defn plus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46910 G__46911] (.plusYears ^java.time.OffsetDateTime G__46910 G__46911)))


(defn to-zoned-date-time ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__46912] (.toZonedDateTime ^java.time.OffsetDateTime G__46912)))


(defn query ^java.lang.Object ([^java.time.OffsetDateTime G__46913 ^java.time.temporal.TemporalQuery G__46914] (.query ^java.time.OffsetDateTime G__46913 ^java.time.temporal.TemporalQuery G__46914)))


(defn with-second ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46915 G__46916] (.withSecond ^java.time.OffsetDateTime G__46915 G__46916)))


(defn get-second ([^java.time.OffsetDateTime G__46917] (jti/getter second ^java.time.OffsetDateTime G__46917)))


(defn get-day-of-month ([^java.time.OffsetDateTime G__46918] (jti/getter dayOfMonth ^java.time.OffsetDateTime G__46918)))


(defn of ^java.time.OffsetDateTime ([^java.time.LocalDate G__46920 ^java.time.LocalTime G__46921 ^java.time.ZoneOffset G__46922] (. java.time.OffsetDateTime of ^java.time.LocalDate G__46920 ^java.time.LocalTime G__46921 ^java.time.ZoneOffset G__46922)) ([G__46924 G__46925 G__46926 G__46927 G__46928 G__46929 G__46930 ^java.time.ZoneOffset G__46931] (. java.time.OffsetDateTime of G__46924 G__46925 G__46926 G__46927 G__46928 G__46929 G__46930 ^java.time.ZoneOffset G__46931)) ([^java.time.LocalDateTime G__46933 ^java.time.ZoneOffset G__46934] (. java.time.OffsetDateTime of ^java.time.LocalDateTime G__46933 ^java.time.ZoneOffset G__46934)))


(defn minus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46935 G__46936] (.minusNanos ^java.time.OffsetDateTime G__46935 G__46936)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetDateTime G__46937 ^java.time.temporal.TemporalField G__46938] (.range ^java.time.OffsetDateTime G__46937 ^java.time.temporal.TemporalField G__46938)))


(defn with-day-of-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46939 G__46940] (.withDayOfYear ^java.time.OffsetDateTime G__46939 G__46940)))


(defn is-equal ([^java.time.OffsetDateTime G__46941 ^java.time.OffsetDateTime G__46942] (.isEqual ^java.time.OffsetDateTime G__46941 ^java.time.OffsetDateTime G__46942)))


(defn of-instant ^java.time.OffsetDateTime ([^java.time.Instant G__46944 ^java.time.ZoneId G__46945] (. java.time.OffsetDateTime ofInstant ^java.time.Instant G__46944 ^java.time.ZoneId G__46945)))


(defn with-minute ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46946 G__46947] (.withMinute ^java.time.OffsetDateTime G__46946 G__46947)))


(defn format ^java.lang.String ([^java.time.OffsetDateTime G__46948 ^java.time.format.DateTimeFormatter G__46949] (.format ^java.time.OffsetDateTime G__46948 ^java.time.format.DateTimeFormatter G__46949)))


(defn minus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46950 G__46951] (.minusMonths ^java.time.OffsetDateTime G__46950 G__46951)))


(defn get ([^java.time.OffsetDateTime G__46952 ^java.time.temporal.TemporalField G__46953] (.get ^java.time.OffsetDateTime G__46952 ^java.time.temporal.TemporalField G__46953)))


(defn truncated-to ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46954 ^java.time.temporal.TemporalUnit G__46955] (.truncatedTo ^java.time.OffsetDateTime G__46954 ^java.time.temporal.TemporalUnit G__46955)))


(defn minus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46956 G__46957] (.minusWeeks ^java.time.OffsetDateTime G__46956 G__46957)))


(defn minus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46958 G__46959] (.minusSeconds ^java.time.OffsetDateTime G__46958 G__46959)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetDateTime G__46960] (.toLocalTime ^java.time.OffsetDateTime G__46960)))


(defn now ^java.time.OffsetDateTime ([G__46962] (. java.time.OffsetDateTime now G__46962)) ([] (. java.time.OffsetDateTime now)))


(defn minus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46964 G__46965] (.minusYears ^java.time.OffsetDateTime G__46964 G__46965)))


(defn minus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46966 G__46967] (.minusDays ^java.time.OffsetDateTime G__46966 G__46967)))


(defn plus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46968 G__46969] (.plusHours ^java.time.OffsetDateTime G__46968 G__46969)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.OffsetDateTime G__46970] (.toLocalDateTime ^java.time.OffsetDateTime G__46970)))



(defn get-day-of-year ([^java.time.OffsetDateTime G__46971] (jti/getter dayOfYear ^java.time.OffsetDateTime G__46971)))


(defn get-month ^java.time.Month ([^java.time.OffsetDateTime G__46972] (jti/getter month ^java.time.OffsetDateTime G__46972)))



(defn plus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46973 G__46974] (.plusSeconds ^java.time.OffsetDateTime G__46973 G__46974)))


(defn at-zone-same-instant ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__46975 ^java.time.ZoneId G__46976] (.atZoneSameInstant ^java.time.OffsetDateTime G__46975 ^java.time.ZoneId G__46976)))


(defn plus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46977 G__46978] (.plusMinutes ^java.time.OffsetDateTime G__46977 G__46978)))


(defn to-local-date ^java.time.LocalDate ([^java.time.OffsetDateTime G__46979] (.toLocalDate ^java.time.OffsetDateTime G__46979)))



(defn until ([^java.time.OffsetDateTime G__46980 ^java.time.temporal.Temporal G__46981 ^java.time.temporal.TemporalUnit G__46982] (.until ^java.time.OffsetDateTime G__46980 ^java.time.temporal.Temporal G__46981 ^java.time.temporal.TemporalUnit G__46982)))




(defn is-before ([^java.time.OffsetDateTime G__46983 ^java.time.OffsetDateTime G__46984] (.isBefore ^java.time.OffsetDateTime G__46983 ^java.time.OffsetDateTime G__46984)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetDateTime G__46985 ^java.time.temporal.Temporal G__46986] (.adjustInto ^java.time.OffsetDateTime G__46985 ^java.time.temporal.Temporal G__46986)))


(defn get-hour ([^java.time.OffsetDateTime G__46987] (jti/getter hour ^java.time.OffsetDateTime G__46987)))


(defn minus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46988 G__46989] (.minus ^java.time.OffsetDateTime G__46988 G__46989)) ([^java.time.OffsetDateTime G__46990 G__46991 G__46992] (.minus ^java.time.OffsetDateTime G__46990 G__46991 G__46992)))


(defn plus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46993 G__46994] (.plusNanos ^java.time.OffsetDateTime G__46993 G__46994)))


(defn get-nano ([^java.time.OffsetDateTime G__46995] (jti/getter nano ^java.time.OffsetDateTime G__46995)))


(defn get-year ([^java.time.OffsetDateTime G__46996] (jti/getter year ^java.time.OffsetDateTime G__46996)))


(defn with-day-of-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__46997 G__46998] (.withDayOfMonth ^java.time.OffsetDateTime G__46997 G__46998)))


(defn is-after ([^java.time.OffsetDateTime G__46999 ^java.time.OffsetDateTime G__47000] (.isAfter ^java.time.OffsetDateTime G__46999 ^java.time.OffsetDateTime G__47000)))


(defn to-string ^java.lang.String ([^java.time.OffsetDateTime G__47001] (.toString ^java.time.OffsetDateTime G__47001)))


(defn plus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47002 G__47003] (.plusMonths ^java.time.OffsetDateTime G__47002 G__47003)))


(defn with-hour ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47004 G__47005] (.withHour ^java.time.OffsetDateTime G__47004 G__47005)))


(defn to-offset-time ^java.time.OffsetTime ([^java.time.OffsetDateTime G__47006] (.toOffsetTime ^java.time.OffsetDateTime G__47006)))


(defn equals ([^java.time.OffsetDateTime G__47007 ^java.lang.Object G__47008] (.equals ^java.time.OffsetDateTime G__47007 ^java.lang.Object G__47008)))



(defn get-month-value ([^java.time.OffsetDateTime G__47009] (jti/getter monthValue ^java.time.OffsetDateTime G__47009)))



(defn with-nano ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47010 G__47011] (.withNano ^java.time.OffsetDateTime G__47010 G__47011)))


(defn get-minute ([^java.time.OffsetDateTime G__47012] (jti/getter minute ^java.time.OffsetDateTime G__47012)))


(defn minus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47013 G__47014] (.minusHours ^java.time.OffsetDateTime G__47013 G__47014)))


(defn to-instant ^java.time.Instant ([^java.time.OffsetDateTime G__47015] (.toInstant ^java.time.OffsetDateTime G__47015)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.OffsetDateTime G__47016] (jti/getter dayOfWeek ^java.time.OffsetDateTime G__47016)))


(defn plus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47017 G__47018] (.plusDays ^java.time.OffsetDateTime G__47017 G__47018)))


(defn plus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47019 G__47020] (.plusWeeks ^java.time.OffsetDateTime G__47019 G__47020)))


(defn hash-code ([^java.time.OffsetDateTime G__47021] (.hashCode ^java.time.OffsetDateTime G__47021)))



(defn get-long ([^java.time.OffsetDateTime G__47022 ^java.time.temporal.TemporalField G__47023] (.getLong ^java.time.OffsetDateTime G__47022 ^java.time.temporal.TemporalField G__47023)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetDateTime G__47024] (jti/getter offset ^java.time.OffsetDateTime G__47024)))


(defn with-offset-same-instant ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47025 ^java.time.ZoneOffset G__47026] (.withOffsetSameInstant ^java.time.OffsetDateTime G__47025 ^java.time.ZoneOffset G__47026)))


(defn time-line-order ^java.util.Comparator ([] (. java.time.OffsetDateTime timeLineOrder)))


(defn with ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47028 G__47029] (.with ^java.time.OffsetDateTime G__47028 G__47029)) ([^java.time.OffsetDateTime G__47030 G__47031 G__47032] (.with ^java.time.OffsetDateTime G__47030 G__47031 G__47032)))


(defn from ^java.time.OffsetDateTime ([^java.time.temporal.TemporalAccessor G__47034] (. java.time.OffsetDateTime from ^java.time.temporal.TemporalAccessor G__47034)))


(defn parse ^java.time.OffsetDateTime ([^java.lang.CharSequence G__47036] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__47036)) ([^java.lang.CharSequence G__47038 ^java.time.format.DateTimeFormatter G__47039] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__47038 ^java.time.format.DateTimeFormatter G__47039)))


(defn plus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47040 G__47041] (.plus ^java.time.OffsetDateTime G__47040 G__47041)) ([^java.time.OffsetDateTime G__47042 G__47043 G__47044] (.plus ^java.time.OffsetDateTime G__47042 G__47043 G__47044)))


(defn with-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47045 G__47046] (.withYear ^java.time.OffsetDateTime G__47045 G__47046)))


(defn to-epoch-second ([^java.time.OffsetDateTime G__47047] (.toEpochSecond ^java.time.OffsetDateTime G__47047)))


(defn with-offset-same-local ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47048 ^java.time.ZoneOffset G__47049] (.withOffsetSameLocal ^java.time.OffsetDateTime G__47048 ^java.time.ZoneOffset G__47049)))



(defn at-zone-similar-local ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__47050 ^java.time.ZoneId G__47051] (.atZoneSimilarLocal ^java.time.OffsetDateTime G__47050 ^java.time.ZoneId G__47051)))



(defn with-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47052 G__47053] (.withMonth ^java.time.OffsetDateTime G__47052 G__47053)))


(defn minus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__47054 G__47055] (.minusMinutes ^java.time.OffsetDateTime G__47054 G__47055)))

