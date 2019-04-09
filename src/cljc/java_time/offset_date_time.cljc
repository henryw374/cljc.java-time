(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time OffsetDateTime])))
(def min (. java.time.OffsetDateTime -MIN))
(def max (. java.time.OffsetDateTime -MAX))

(defn compare-to ([^java.time.OffsetDateTime G__55979 G__55980] (.compareTo ^java.time.OffsetDateTime G__55979 G__55980)))


(defn is-supported ([^java.time.OffsetDateTime G__55981 G__55982] (.isSupported ^java.time.OffsetDateTime G__55981 G__55982)))


(defn plus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__55983 G__55984] (.plusYears ^java.time.OffsetDateTime G__55983 G__55984)))


(defn to-zoned-date-time ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__55985] (.toZonedDateTime ^java.time.OffsetDateTime G__55985)))


(defn query ^java.lang.Object ([^java.time.OffsetDateTime G__55986 ^java.time.temporal.TemporalQuery G__55987] (.query ^java.time.OffsetDateTime G__55986 ^java.time.temporal.TemporalQuery G__55987)))


(defn with-second ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__55988 G__55989] (.withSecond ^java.time.OffsetDateTime G__55988 G__55989)))


(defn get-second ([^java.time.OffsetDateTime G__55990] (jti/getter second ^java.time.OffsetDateTime G__55990)))


(defn get-day-of-month ([^java.time.OffsetDateTime G__55991] (jti/getter dayOfMonth ^java.time.OffsetDateTime G__55991)))


(defn of ^java.time.OffsetDateTime ([^java.time.LocalDate G__55993 ^java.time.LocalTime G__55994 ^java.time.ZoneOffset G__55995] (. java.time.OffsetDateTime of ^java.time.LocalDate G__55993 ^java.time.LocalTime G__55994 ^java.time.ZoneOffset G__55995)) ([G__55997 G__55998 G__55999 G__56000 G__56001 G__56002 G__56003 ^java.time.ZoneOffset G__56004] (. java.time.OffsetDateTime of G__55997 G__55998 G__55999 G__56000 G__56001 G__56002 G__56003 ^java.time.ZoneOffset G__56004)) ([^java.time.LocalDateTime G__56006 ^java.time.ZoneOffset G__56007] (. java.time.OffsetDateTime of ^java.time.LocalDateTime G__56006 ^java.time.ZoneOffset G__56007)))


(defn minus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56008 G__56009] (.minusNanos ^java.time.OffsetDateTime G__56008 G__56009)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetDateTime G__56010 ^java.time.temporal.TemporalField G__56011] (.range ^java.time.OffsetDateTime G__56010 ^java.time.temporal.TemporalField G__56011)))


(defn with-day-of-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56012 G__56013] (.withDayOfYear ^java.time.OffsetDateTime G__56012 G__56013)))


(defn is-equal ([^java.time.OffsetDateTime G__56014 ^java.time.OffsetDateTime G__56015] (.isEqual ^java.time.OffsetDateTime G__56014 ^java.time.OffsetDateTime G__56015)))


(defn of-instant ^java.time.OffsetDateTime ([^java.time.Instant G__56017 ^java.time.ZoneId G__56018] (. java.time.OffsetDateTime ofInstant ^java.time.Instant G__56017 ^java.time.ZoneId G__56018)))


(defn with-minute ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56019 G__56020] (.withMinute ^java.time.OffsetDateTime G__56019 G__56020)))


(defn format ^java.lang.String ([^java.time.OffsetDateTime G__56021 ^java.time.format.DateTimeFormatter G__56022] (.format ^java.time.OffsetDateTime G__56021 ^java.time.format.DateTimeFormatter G__56022)))


(defn minus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56023 G__56024] (.minusMonths ^java.time.OffsetDateTime G__56023 G__56024)))


(defn get ([^java.time.OffsetDateTime G__56025 ^java.time.temporal.TemporalField G__56026] (.get ^java.time.OffsetDateTime G__56025 ^java.time.temporal.TemporalField G__56026)))


(defn truncated-to ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56027 ^java.time.temporal.TemporalUnit G__56028] (.truncatedTo ^java.time.OffsetDateTime G__56027 ^java.time.temporal.TemporalUnit G__56028)))


(defn minus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56029 G__56030] (.minusWeeks ^java.time.OffsetDateTime G__56029 G__56030)))


(defn minus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56031 G__56032] (.minusSeconds ^java.time.OffsetDateTime G__56031 G__56032)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetDateTime G__56033] (.toLocalTime ^java.time.OffsetDateTime G__56033)))


(defn now ^java.time.OffsetDateTime ([G__56035] (. java.time.OffsetDateTime now G__56035)) ([] (. java.time.OffsetDateTime now)))


(defn minus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56037 G__56038] (.minusYears ^java.time.OffsetDateTime G__56037 G__56038)))


(defn minus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56039 G__56040] (.minusDays ^java.time.OffsetDateTime G__56039 G__56040)))


(defn plus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56041 G__56042] (.plusHours ^java.time.OffsetDateTime G__56041 G__56042)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.OffsetDateTime G__56043] (.toLocalDateTime ^java.time.OffsetDateTime G__56043)))



(defn get-day-of-year ([^java.time.OffsetDateTime G__56044] (jti/getter dayOfYear ^java.time.OffsetDateTime G__56044)))


(defn get-month ^java.time.Month ([^java.time.OffsetDateTime G__56045] (jti/getter month ^java.time.OffsetDateTime G__56045)))



(defn plus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56046 G__56047] (.plusSeconds ^java.time.OffsetDateTime G__56046 G__56047)))


(defn at-zone-same-instant ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__56048 ^java.time.ZoneId G__56049] (.atZoneSameInstant ^java.time.OffsetDateTime G__56048 ^java.time.ZoneId G__56049)))


(defn plus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56050 G__56051] (.plusMinutes ^java.time.OffsetDateTime G__56050 G__56051)))


(defn to-local-date ^java.time.LocalDate ([^java.time.OffsetDateTime G__56052] (.toLocalDate ^java.time.OffsetDateTime G__56052)))



(defn until ([^java.time.OffsetDateTime G__56053 ^java.time.temporal.Temporal G__56054 ^java.time.temporal.TemporalUnit G__56055] (.until ^java.time.OffsetDateTime G__56053 ^java.time.temporal.Temporal G__56054 ^java.time.temporal.TemporalUnit G__56055)))




(defn is-before ([^java.time.OffsetDateTime G__56056 ^java.time.OffsetDateTime G__56057] (.isBefore ^java.time.OffsetDateTime G__56056 ^java.time.OffsetDateTime G__56057)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetDateTime G__56058 ^java.time.temporal.Temporal G__56059] (.adjustInto ^java.time.OffsetDateTime G__56058 ^java.time.temporal.Temporal G__56059)))


(defn get-hour ([^java.time.OffsetDateTime G__56060] (jti/getter hour ^java.time.OffsetDateTime G__56060)))


(defn minus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56061 G__56062] (.minus ^java.time.OffsetDateTime G__56061 G__56062)) ([^java.time.OffsetDateTime G__56063 G__56064 G__56065] (.minus ^java.time.OffsetDateTime G__56063 G__56064 G__56065)))


(defn plus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56066 G__56067] (.plusNanos ^java.time.OffsetDateTime G__56066 G__56067)))


(defn get-nano ([^java.time.OffsetDateTime G__56068] (jti/getter nano ^java.time.OffsetDateTime G__56068)))


(defn get-year ([^java.time.OffsetDateTime G__56069] (jti/getter year ^java.time.OffsetDateTime G__56069)))


(defn with-day-of-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56070 G__56071] (.withDayOfMonth ^java.time.OffsetDateTime G__56070 G__56071)))


(defn is-after ([^java.time.OffsetDateTime G__56072 ^java.time.OffsetDateTime G__56073] (.isAfter ^java.time.OffsetDateTime G__56072 ^java.time.OffsetDateTime G__56073)))


(defn to-string ^java.lang.String ([^java.time.OffsetDateTime G__56074] (.toString ^java.time.OffsetDateTime G__56074)))


(defn plus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56075 G__56076] (.plusMonths ^java.time.OffsetDateTime G__56075 G__56076)))


(defn with-hour ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56077 G__56078] (.withHour ^java.time.OffsetDateTime G__56077 G__56078)))


(defn to-offset-time ^java.time.OffsetTime ([^java.time.OffsetDateTime G__56079] (.toOffsetTime ^java.time.OffsetDateTime G__56079)))


(defn equals ([^java.time.OffsetDateTime G__56080 ^java.lang.Object G__56081] (.equals ^java.time.OffsetDateTime G__56080 ^java.lang.Object G__56081)))



(defn get-month-value ([^java.time.OffsetDateTime G__56082] (jti/getter monthValue ^java.time.OffsetDateTime G__56082)))



(defn with-nano ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56083 G__56084] (.withNano ^java.time.OffsetDateTime G__56083 G__56084)))


(defn get-minute ([^java.time.OffsetDateTime G__56085] (jti/getter minute ^java.time.OffsetDateTime G__56085)))


(defn minus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56086 G__56087] (.minusHours ^java.time.OffsetDateTime G__56086 G__56087)))


(defn to-instant ^java.time.Instant ([^java.time.OffsetDateTime G__56088] (.toInstant ^java.time.OffsetDateTime G__56088)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.OffsetDateTime G__56089] (jti/getter dayOfWeek ^java.time.OffsetDateTime G__56089)))


(defn plus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56090 G__56091] (.plusDays ^java.time.OffsetDateTime G__56090 G__56091)))


(defn plus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56092 G__56093] (.plusWeeks ^java.time.OffsetDateTime G__56092 G__56093)))


(defn hash-code ([^java.time.OffsetDateTime G__56094] (.hashCode ^java.time.OffsetDateTime G__56094)))



(defn get-long ([^java.time.OffsetDateTime G__56095 ^java.time.temporal.TemporalField G__56096] (.getLong ^java.time.OffsetDateTime G__56095 ^java.time.temporal.TemporalField G__56096)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetDateTime G__56097] (jti/getter offset ^java.time.OffsetDateTime G__56097)))


(defn with-offset-same-instant ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56098 ^java.time.ZoneOffset G__56099] (.withOffsetSameInstant ^java.time.OffsetDateTime G__56098 ^java.time.ZoneOffset G__56099)))


(defn time-line-order ^java.util.Comparator ([] (. java.time.OffsetDateTime timeLineOrder)))


(defn with ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56101 G__56102] (.with ^java.time.OffsetDateTime G__56101 G__56102)) ([^java.time.OffsetDateTime G__56103 G__56104 G__56105] (.with ^java.time.OffsetDateTime G__56103 G__56104 G__56105)))


(defn from ^java.time.OffsetDateTime ([^java.time.temporal.TemporalAccessor G__56107] (. java.time.OffsetDateTime from ^java.time.temporal.TemporalAccessor G__56107)))


(defn parse ^java.time.OffsetDateTime ([^java.lang.CharSequence G__56109] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__56109)) ([^java.lang.CharSequence G__56111 ^java.time.format.DateTimeFormatter G__56112] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__56111 ^java.time.format.DateTimeFormatter G__56112)))


(defn plus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56113 G__56114] (.plus ^java.time.OffsetDateTime G__56113 G__56114)) ([^java.time.OffsetDateTime G__56115 G__56116 G__56117] (.plus ^java.time.OffsetDateTime G__56115 G__56116 G__56117)))


(defn with-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56118 G__56119] (.withYear ^java.time.OffsetDateTime G__56118 G__56119)))


(defn to-epoch-second ([^java.time.OffsetDateTime G__56120] (.toEpochSecond ^java.time.OffsetDateTime G__56120)))


(defn with-offset-same-local ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56121 ^java.time.ZoneOffset G__56122] (.withOffsetSameLocal ^java.time.OffsetDateTime G__56121 ^java.time.ZoneOffset G__56122)))



(defn at-zone-similar-local ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__56123 ^java.time.ZoneId G__56124] (.atZoneSimilarLocal ^java.time.OffsetDateTime G__56123 ^java.time.ZoneId G__56124)))



(defn with-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56125 G__56126] (.withMonth ^java.time.OffsetDateTime G__56125 G__56126)))


(defn minus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__56127 G__56128] (.minusMinutes ^java.time.OffsetDateTime G__56127 G__56128)))

