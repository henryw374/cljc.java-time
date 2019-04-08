(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [LocalDate]])) #? (:clj (:import [java.time LocalDate])))

(defn compare-to ([^java.time.LocalDate G__25940 G__25941] (.compareTo ^java.time.LocalDate G__25940 G__25941)))


(defn is-supported ([^java.time.LocalDate G__25942 G__25943] (.isSupported ^java.time.LocalDate G__25942 G__25943)))


(defn plus-years ^java.time.LocalDate ([^java.time.LocalDate G__25944 G__25945] (.plusYears ^java.time.LocalDate G__25944 G__25945)))


(defn get-era ^java.time.chrono.Era ([^java.time.LocalDate G__25946] (jti/getter era ^java.time.LocalDate G__25946)))


(defn query ^java.lang.Object ([^java.time.LocalDate G__25947 ^java.time.temporal.TemporalQuery G__25948] (.query ^java.time.LocalDate G__25947 ^java.time.temporal.TemporalQuery G__25948)))


(defn get-day-of-month ([^java.time.LocalDate G__25949] (jti/getter dayOfMonth ^java.time.LocalDate G__25949)))



(defn of ^java.time.LocalDate ([G__25951 G__25952 G__25953] (. java.time.LocalDate of G__25951 G__25952 G__25953)))




(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDate G__25954 ^java.time.temporal.TemporalField G__25955] (.range ^java.time.LocalDate G__25954 ^java.time.temporal.TemporalField G__25955)))



(defn of-epoch-day ^java.time.LocalDate ([G__25957] (. java.time.LocalDate ofEpochDay G__25957)))


(defn at-start-of-day ^java.time.ZonedDateTime ([^java.time.LocalDate G__25958 ^java.time.ZoneId G__25959] (.atStartOfDay ^java.time.LocalDate G__25958 ^java.time.ZoneId G__25959)) ([^java.time.LocalDate G__25960] (.atStartOfDay ^java.time.LocalDate G__25960)))


(defn with-day-of-year ^java.time.LocalDate ([^java.time.LocalDate G__25961 G__25962] (.withDayOfYear ^java.time.LocalDate G__25961 G__25962)))


(defn is-equal ([^java.time.LocalDate G__25963 ^java.time.chrono.ChronoLocalDate G__25964] (.isEqual ^java.time.LocalDate G__25963 ^java.time.chrono.ChronoLocalDate G__25964)))



(defn length-of-month ([^java.time.LocalDate G__25965] (.lengthOfMonth ^java.time.LocalDate G__25965)))




(defn format ^java.lang.String ([^java.time.LocalDate G__25966 ^java.time.format.DateTimeFormatter G__25967] (.format ^java.time.LocalDate G__25966 ^java.time.format.DateTimeFormatter G__25967)))


(defn minus-months ^java.time.LocalDate ([^java.time.LocalDate G__25968 G__25969] (.minusMonths ^java.time.LocalDate G__25968 G__25969)))


(defn get ([^java.time.LocalDate G__25970 ^java.time.temporal.TemporalField G__25971] (.get ^java.time.LocalDate G__25970 ^java.time.temporal.TemporalField G__25971)))


(defn minus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__25972 G__25973] (.minusWeeks ^java.time.LocalDate G__25972 G__25973)))


(defn at-time ^java.time.OffsetDateTime ([^java.time.LocalDate G__25974 G__25975] (.atTime ^java.time.LocalDate G__25974 G__25975)) ([^java.time.LocalDate G__25976 G__25977 G__25978 G__25979 G__25980] (.atTime ^java.time.LocalDate G__25976 G__25977 G__25978 G__25979 G__25980)) ([^java.time.LocalDate G__25981 G__25982 G__25983 G__25984] (.atTime ^java.time.LocalDate G__25981 G__25982 G__25983 G__25984)) ([^java.time.LocalDate G__25985 G__25986 G__25987] (.atTime ^java.time.LocalDate G__25985 G__25986 G__25987)))


(defn now ^java.time.LocalDate ([] (. java.time.LocalDate now)) ([G__25990] (. java.time.LocalDate now G__25990)))


(defn minus-years ^java.time.LocalDate ([^java.time.LocalDate G__25991 G__25992] (.minusYears ^java.time.LocalDate G__25991 G__25992)))


(defn minus-days ^java.time.LocalDate ([^java.time.LocalDate G__25993 G__25994] (.minusDays ^java.time.LocalDate G__25993 G__25994)))



(defn get-day-of-year ([^java.time.LocalDate G__25995] (jti/getter dayOfYear ^java.time.LocalDate G__25995)))


(defn get-month ^java.time.Month ([^java.time.LocalDate G__25996] (jti/getter month ^java.time.LocalDate G__25996)))





(defn until ([^java.time.LocalDate G__25997 ^java.time.temporal.Temporal G__25998 ^java.time.temporal.TemporalUnit G__25999] (.until ^java.time.LocalDate G__25997 ^java.time.temporal.Temporal G__25998 ^java.time.temporal.TemporalUnit G__25999)) ([^java.time.LocalDate G__26000 G__26001] (.until ^java.time.LocalDate G__26000 G__26001)))





(defn is-before ([^java.time.LocalDate G__26002 ^java.time.chrono.ChronoLocalDate G__26003] (.isBefore ^java.time.LocalDate G__26002 ^java.time.chrono.ChronoLocalDate G__26003)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDate G__26004 ^java.time.temporal.Temporal G__26005] (.adjustInto ^java.time.LocalDate G__26004 ^java.time.temporal.Temporal G__26005)))


(defn minus ^java.time.LocalDate ([^java.time.LocalDate G__26006 G__26007 G__26008] (.minus ^java.time.LocalDate G__26006 G__26007 G__26008)) ([^java.time.LocalDate G__26009 G__26010] (.minus ^java.time.LocalDate G__26009 G__26010)))



(defn get-year ([^java.time.LocalDate G__26011] (jti/getter year ^java.time.LocalDate G__26011)))


(defn with-day-of-month ^java.time.LocalDate ([^java.time.LocalDate G__26012 G__26013] (.withDayOfMonth ^java.time.LocalDate G__26012 G__26013)))


(defn to-epoch-day ([^java.time.LocalDate G__26014] (.toEpochDay ^java.time.LocalDate G__26014)))


(defn is-after ([^java.time.LocalDate G__26015 ^java.time.chrono.ChronoLocalDate G__26016] (.isAfter ^java.time.LocalDate G__26015 ^java.time.chrono.ChronoLocalDate G__26016)))


(defn of-year-day ^java.time.LocalDate ([G__26018 G__26019] (. java.time.LocalDate ofYearDay G__26018 G__26019)))


(defn get-chronology ^java.time.chrono.Chronology ([^java.time.LocalDate G__26020] (jti/getter chronology ^java.time.LocalDate G__26020)))


(defn to-string ^java.lang.String ([^java.time.LocalDate G__26021] (.toString ^java.time.LocalDate G__26021)))


(defn plus-months ^java.time.LocalDate ([^java.time.LocalDate G__26022 G__26023] (.plusMonths ^java.time.LocalDate G__26022 G__26023)))


(defn equals ([^java.time.LocalDate G__26024 ^java.lang.Object G__26025] (.equals ^java.time.LocalDate G__26024 ^java.lang.Object G__26025)))


(defn get-month-value ([^java.time.LocalDate G__26026] (jti/getter monthValue ^java.time.LocalDate G__26026)))



(defn length-of-year ([^java.time.LocalDate G__26027] (.lengthOfYear ^java.time.LocalDate G__26027)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDate G__26028] (jti/getter dayOfWeek ^java.time.LocalDate G__26028)))


(defn plus-days ^java.time.LocalDate ([^java.time.LocalDate G__26029 G__26030] (.plusDays ^java.time.LocalDate G__26029 G__26030)))



(defn plus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__26031 G__26032] (.plusWeeks ^java.time.LocalDate G__26031 G__26032)))


(defn hash-code ([^java.time.LocalDate G__26033] (.hashCode ^java.time.LocalDate G__26033)))



(defn get-long ([^java.time.LocalDate G__26034 ^java.time.temporal.TemporalField G__26035] (jti/getter long ^java.time.LocalDate G__26034 ^java.time.temporal.TemporalField G__26035)))


(defn is-leap-year ([^java.time.LocalDate G__26036] (.isLeapYear ^java.time.LocalDate G__26036)))


(defn with ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDate G__26037 G__26038] (.with ^java.time.LocalDate G__26037 G__26038)) ([^java.time.LocalDate G__26039 G__26040 G__26041] (.with ^java.time.LocalDate G__26039 G__26040 G__26041)))


(defn from ^java.time.LocalDate ([^java.time.temporal.TemporalAccessor G__26043] (. java.time.LocalDate from ^java.time.temporal.TemporalAccessor G__26043)))


(defn parse ^java.time.LocalDate ([^java.lang.CharSequence G__26045 ^java.time.format.DateTimeFormatter G__26046] (. java.time.LocalDate parse ^java.lang.CharSequence G__26045 ^java.time.format.DateTimeFormatter G__26046)) ([^java.lang.CharSequence G__26048] (. java.time.LocalDate parse ^java.lang.CharSequence G__26048)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalDate G__26049 G__26050 G__26051] (.plus ^java.time.LocalDate G__26049 G__26050 G__26051)) ([^java.time.LocalDate G__26052 G__26053] (.plus ^java.time.LocalDate G__26052 G__26053)))


(defn with-year ^java.time.LocalDate ([^java.time.LocalDate G__26054 G__26055] (.withYear ^java.time.LocalDate G__26054 G__26055)))



(defn with-month ^java.time.LocalDate ([^java.time.LocalDate G__26056 G__26057] (.withMonth ^java.time.LocalDate G__26056 G__26057)))


