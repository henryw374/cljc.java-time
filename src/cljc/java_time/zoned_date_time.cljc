(ns cljc.java-time.zoned-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZonedDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZonedDateTime])))


(defn is-supported ([^java.time.ZonedDateTime G__35943 G__35944] (.isSupported ^java.time.ZonedDateTime G__35943 G__35944)))


(defn plus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35945 G__35946] (.plusYears ^java.time.ZonedDateTime G__35945 G__35946)))


(defn query ^java.lang.Object ([^java.time.ZonedDateTime G__35947 ^java.time.temporal.TemporalQuery G__35948] (.query ^java.time.ZonedDateTime G__35947 ^java.time.temporal.TemporalQuery G__35948)))


(defn with-second ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35949 G__35950] (.withSecond ^java.time.ZonedDateTime G__35949 G__35950)))


(defn with-later-offset-at-overlap ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35951] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime G__35951)))


(defn get-second ([^java.time.ZonedDateTime G__35952] (jti/getter second ^java.time.ZonedDateTime G__35952)))


(defn get-day-of-month ([^java.time.ZonedDateTime G__35953] (jti/getter dayOfMonth ^java.time.ZonedDateTime G__35953)))



(defn of ^java.time.ZonedDateTime ([G__35955 G__35956 G__35957 G__35958 G__35959 G__35960 G__35961 ^java.time.ZoneId G__35962] (. java.time.ZonedDateTime of G__35955 G__35956 G__35957 G__35958 G__35959 G__35960 G__35961 ^java.time.ZoneId G__35962)) ([^java.time.LocalDateTime G__35964 ^java.time.ZoneId G__35965] (. java.time.ZonedDateTime of ^java.time.LocalDateTime G__35964 ^java.time.ZoneId G__35965)) ([^java.time.LocalDate G__35967 ^java.time.LocalTime G__35968 ^java.time.ZoneId G__35969] (. java.time.ZonedDateTime of ^java.time.LocalDate G__35967 ^java.time.LocalTime G__35968 ^java.time.ZoneId G__35969)))


(defn to-offset-date-time ^java.time.OffsetDateTime ([^java.time.ZonedDateTime G__35970] (.toOffsetDateTime ^java.time.ZonedDateTime G__35970)))


(defn minus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35971 G__35972] (.minusNanos ^java.time.ZonedDateTime G__35971 G__35972)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZonedDateTime G__35973 ^java.time.temporal.TemporalField G__35974] (.range ^java.time.ZonedDateTime G__35973 ^java.time.temporal.TemporalField G__35974)))


(defn with-day-of-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35975 G__35976] (.withDayOfYear ^java.time.ZonedDateTime G__35975 G__35976)))


(defn of-instant ^java.time.ZonedDateTime ([^java.time.Instant G__35978 ^java.time.ZoneId G__35979] (. java.time.ZonedDateTime ofInstant ^java.time.Instant G__35978 ^java.time.ZoneId G__35979)) ([^java.time.LocalDateTime G__35981 ^java.time.ZoneOffset G__35982 ^java.time.ZoneId G__35983] (. java.time.ZonedDateTime ofInstant ^java.time.LocalDateTime G__35981 ^java.time.ZoneOffset G__35982 ^java.time.ZoneId G__35983)))


(defn with-minute ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35984 G__35985] (.withMinute ^java.time.ZonedDateTime G__35984 G__35985)))



(defn format ^java.lang.String ([^java.time.ZonedDateTime G__35986 ^java.time.format.DateTimeFormatter G__35987] (.format ^java.time.ZonedDateTime G__35986 ^java.time.format.DateTimeFormatter G__35987)))


(defn minus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35988 G__35989] (.minusMonths ^java.time.ZonedDateTime G__35988 G__35989)))


(defn get ([^java.time.ZonedDateTime G__35990 ^java.time.temporal.TemporalField G__35991] (.get ^java.time.ZonedDateTime G__35990 ^java.time.temporal.TemporalField G__35991)))


(defn truncated-to ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35992 ^java.time.temporal.TemporalUnit G__35993] (.truncatedTo ^java.time.ZonedDateTime G__35992 ^java.time.temporal.TemporalUnit G__35993)))


(defn minus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35994 G__35995] (.minusWeeks ^java.time.ZonedDateTime G__35994 G__35995)))


(defn minus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__35996 G__35997] (.minusSeconds ^java.time.ZonedDateTime G__35996 G__35997)))


(defn to-local-time ^java.time.LocalTime ([^java.time.ZonedDateTime G__35998] (.toLocalTime ^java.time.ZonedDateTime G__35998)))


(defn now ^java.time.ZonedDateTime ([G__36000] (. java.time.ZonedDateTime now G__36000)) ([] (. java.time.ZonedDateTime now)))


(defn minus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36002 G__36003] (.minusYears ^java.time.ZonedDateTime G__36002 G__36003)))


(defn minus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36004 G__36005] (.minusDays ^java.time.ZonedDateTime G__36004 G__36005)))


(defn plus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36006 G__36007] (.plusHours ^java.time.ZonedDateTime G__36006 G__36007)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.ZonedDateTime G__36008] (.toLocalDateTime ^java.time.ZonedDateTime G__36008)))



(defn with-fixed-offset-zone ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36009] (.withFixedOffsetZone ^java.time.ZonedDateTime G__36009)))


(defn get-day-of-year ([^java.time.ZonedDateTime G__36010] (jti/getter dayOfYear ^java.time.ZonedDateTime G__36010)))


(defn get-month ^java.time.Month ([^java.time.ZonedDateTime G__36011] (jti/getter month ^java.time.ZonedDateTime G__36011)))





(defn plus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36012 G__36013] (.plusSeconds ^java.time.ZonedDateTime G__36012 G__36013)))


(defn plus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36014 G__36015] (.plusMinutes ^java.time.ZonedDateTime G__36014 G__36015)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.ZonedDateTime G__36016] (.toLocalDate ^java.time.ZonedDateTime G__36016)))


(defn get-zone ^java.time.ZoneId ([^java.time.ZonedDateTime G__36017] (jti/getter zone ^java.time.ZonedDateTime G__36017)))



(defn until ([^java.time.ZonedDateTime G__36018 ^java.time.temporal.Temporal G__36019 ^java.time.temporal.TemporalUnit G__36020] (.until ^java.time.ZonedDateTime G__36018 ^java.time.temporal.Temporal G__36019 ^java.time.temporal.TemporalUnit G__36020)))




(defn get-hour ([^java.time.ZonedDateTime G__36021] (jti/getter hour ^java.time.ZonedDateTime G__36021)))


(defn minus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__36022 G__36023] (.minus ^java.time.ZonedDateTime G__36022 G__36023)) ([^java.time.ZonedDateTime G__36024 G__36025 G__36026] (.minus ^java.time.ZonedDateTime G__36024 G__36025 G__36026)))


(defn plus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36027 G__36028] (.plusNanos ^java.time.ZonedDateTime G__36027 G__36028)))


(defn get-nano ([^java.time.ZonedDateTime G__36029] (jti/getter nano ^java.time.ZonedDateTime G__36029)))


(defn get-year ([^java.time.ZonedDateTime G__36030] (jti/getter year ^java.time.ZonedDateTime G__36030)))


(defn with-day-of-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36031 G__36032] (.withDayOfMonth ^java.time.ZonedDateTime G__36031 G__36032)))


(defn to-string ^java.lang.String ([^java.time.ZonedDateTime G__36033] (.toString ^java.time.ZonedDateTime G__36033)))


(defn with-zone-same-instant ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36034 G__36035] (.withZoneSameInstant ^java.time.ZonedDateTime G__36034 G__36035)))


(defn plus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36036 G__36037] (.plusMonths ^java.time.ZonedDateTime G__36036 G__36037)))


(defn with-hour ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36038 G__36039] (.withHour ^java.time.ZonedDateTime G__36038 G__36039)))


(defn with-zone-same-local ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36040 G__36041] (.withZoneSameLocal ^java.time.ZonedDateTime G__36040 G__36041)))


(defn equals ([^java.time.ZonedDateTime G__36042 ^java.lang.Object G__36043] (.equals ^java.time.ZonedDateTime G__36042 ^java.lang.Object G__36043)))



(defn get-month-value ([^java.time.ZonedDateTime G__36044] (jti/getter monthValue ^java.time.ZonedDateTime G__36044)))


(defn with-nano ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36045 G__36046] (.withNano ^java.time.ZonedDateTime G__36045 G__36046)))


(defn get-minute ([^java.time.ZonedDateTime G__36047] (jti/getter minute ^java.time.ZonedDateTime G__36047)))


(defn of-local ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__36049 ^java.time.ZoneId G__36050 ^java.time.ZoneOffset G__36051] (. java.time.ZonedDateTime ofLocal ^java.time.LocalDateTime G__36049 ^java.time.ZoneId G__36050 ^java.time.ZoneOffset G__36051)))


(defn minus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36052 G__36053] (.minusHours ^java.time.ZonedDateTime G__36052 G__36053)))


(defn with-earlier-offset-at-overlap ^java.time.chrono.ChronoZonedDateTime ([^java.time.ZonedDateTime G__36054] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime G__36054)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.ZonedDateTime G__36055] (jti/getter dayOfWeek ^java.time.ZonedDateTime G__36055)))


(defn plus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36056 G__36057] (.plusDays ^java.time.ZonedDateTime G__36056 G__36057)))


(defn plus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36058 G__36059] (.plusWeeks ^java.time.ZonedDateTime G__36058 G__36059)))


(defn hash-code ([^java.time.ZonedDateTime G__36060] (.hashCode ^java.time.ZonedDateTime G__36060)))



(defn of-strict ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__36062 ^java.time.ZoneOffset G__36063 ^java.time.ZoneId G__36064] (. java.time.ZonedDateTime ofStrict ^java.time.LocalDateTime G__36062 ^java.time.ZoneOffset G__36063 ^java.time.ZoneId G__36064)))


(defn get-long ([^java.time.ZonedDateTime G__36065 ^java.time.temporal.TemporalField G__36066] (jti/getter long ^java.time.ZonedDateTime G__36065 ^java.time.temporal.TemporalField G__36066)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.ZonedDateTime G__36067] (jti/getter offset ^java.time.ZonedDateTime G__36067)))


(defn with ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__36068 G__36069 G__36070] (.with ^java.time.ZonedDateTime G__36068 G__36069 G__36070)) ([^java.time.ZonedDateTime G__36071 G__36072] (.with ^java.time.ZonedDateTime G__36071 G__36072)))


(defn from ^java.time.ZonedDateTime ([^java.time.temporal.TemporalAccessor G__36074] (. java.time.ZonedDateTime from ^java.time.temporal.TemporalAccessor G__36074)))


(defn parse ^java.time.ZonedDateTime ([^java.lang.CharSequence G__36076] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__36076)) ([^java.lang.CharSequence G__36078 ^java.time.format.DateTimeFormatter G__36079] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__36078 ^java.time.format.DateTimeFormatter G__36079)))


(defn plus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__36080 G__36081 G__36082] (.plus ^java.time.ZonedDateTime G__36080 G__36081 G__36082)) ([^java.time.ZonedDateTime G__36083 G__36084] (.plus ^java.time.ZonedDateTime G__36083 G__36084)))


(defn with-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36085 G__36086] (.withYear ^java.time.ZonedDateTime G__36085 G__36086)))



(defn with-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36087 G__36088] (.withMonth ^java.time.ZonedDateTime G__36087 G__36088)))


(defn minus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__36089 G__36090] (.minusMinutes ^java.time.ZonedDateTime G__36089 G__36090)))

