(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDateTime])))

(defn compare-to ([^java.time.LocalDateTime G__35792 G__35793] (.compareTo ^java.time.LocalDateTime G__35792 G__35793)))


(defn is-supported ([^java.time.LocalDateTime G__35794 G__35795] (.isSupported ^java.time.LocalDateTime G__35794 G__35795)))


(defn plus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35796 G__35797] (.plusYears ^java.time.LocalDateTime G__35796 G__35797)))


(defn query ^java.lang.Object ([^java.time.LocalDateTime G__35798 ^java.time.temporal.TemporalQuery G__35799] (.query ^java.time.LocalDateTime G__35798 ^java.time.temporal.TemporalQuery G__35799)))


(defn with-second ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35800 G__35801] (.withSecond ^java.time.LocalDateTime G__35800 G__35801)))


(defn get-second ([^java.time.LocalDateTime G__35802] (jti/getter second ^java.time.LocalDateTime G__35802)))


(defn get-day-of-month ([^java.time.LocalDateTime G__35803] (jti/getter dayOfMonth ^java.time.LocalDateTime G__35803)))


(defn of ^java.time.LocalDateTime ([G__35805 G__35806 G__35807 G__35808 G__35809 G__35810 G__35811] (. java.time.LocalDateTime of G__35805 G__35806 G__35807 G__35808 G__35809 G__35810 G__35811)) ([^java.time.LocalDate G__35813 ^java.time.LocalTime G__35814] (. java.time.LocalDateTime of ^java.time.LocalDate G__35813 ^java.time.LocalTime G__35814)) ([G__35816 G__35817 G__35818 G__35819 G__35820 G__35821] (. java.time.LocalDateTime of G__35816 G__35817 G__35818 G__35819 G__35820 G__35821)) ([G__35823 G__35824 G__35825 G__35826 G__35827] (. java.time.LocalDateTime of G__35823 G__35824 G__35825 G__35826 G__35827)))



(defn minus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35828 G__35829] (.minusNanos ^java.time.LocalDateTime G__35828 G__35829)))


(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDateTime G__35830 ^java.time.temporal.TemporalField G__35831] (.range ^java.time.LocalDateTime G__35830 ^java.time.temporal.TemporalField G__35831)))


(defn with-day-of-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35832 G__35833] (.withDayOfYear ^java.time.LocalDateTime G__35832 G__35833)))


(defn is-equal ([^java.time.LocalDateTime G__35834 ^java.time.chrono.ChronoLocalDateTime G__35835] (.isEqual ^java.time.LocalDateTime G__35834 ^java.time.chrono.ChronoLocalDateTime G__35835)))


(defn of-instant ^java.time.LocalDateTime ([^java.time.Instant G__35837 ^java.time.ZoneId G__35838] (. java.time.LocalDateTime ofInstant ^java.time.Instant G__35837 ^java.time.ZoneId G__35838)))


(defn with-minute ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35839 G__35840] (.withMinute ^java.time.LocalDateTime G__35839 G__35840)))



(defn format ^java.lang.String ([^java.time.LocalDateTime G__35841 ^java.time.format.DateTimeFormatter G__35842] (.format ^java.time.LocalDateTime G__35841 ^java.time.format.DateTimeFormatter G__35842)))



(defn of-epoch-second ^java.time.LocalDateTime ([G__35844 G__35845 ^java.time.ZoneOffset G__35846] (. java.time.LocalDateTime ofEpochSecond G__35844 G__35845 ^java.time.ZoneOffset G__35846)))


(defn minus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35847 G__35848] (.minusMonths ^java.time.LocalDateTime G__35847 G__35848)))


(defn get ([^java.time.LocalDateTime G__35849 ^java.time.temporal.TemporalField G__35850] (.get ^java.time.LocalDateTime G__35849 ^java.time.temporal.TemporalField G__35850)))


(defn truncated-to ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35851 ^java.time.temporal.TemporalUnit G__35852] (.truncatedTo ^java.time.LocalDateTime G__35851 ^java.time.temporal.TemporalUnit G__35852)))


(defn minus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35853 G__35854] (.minusWeeks ^java.time.LocalDateTime G__35853 G__35854)))


(defn minus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35855 G__35856] (.minusSeconds ^java.time.LocalDateTime G__35855 G__35856)))


(defn to-local-time ^java.time.LocalTime ([^java.time.LocalDateTime G__35857] (.toLocalTime ^java.time.LocalDateTime G__35857)))


(defn now ^java.time.LocalDateTime ([G__35859] (. java.time.LocalDateTime now G__35859)) ([] (. java.time.LocalDateTime now)))


(defn minus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35861 G__35862] (.minusYears ^java.time.LocalDateTime G__35861 G__35862)))


(defn minus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35863 G__35864] (.minusDays ^java.time.LocalDateTime G__35863 G__35864)))


(defn plus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35865 G__35866] (.plusHours ^java.time.LocalDateTime G__35865 G__35866)))



(defn get-day-of-year ([^java.time.LocalDateTime G__35867] (jti/getter dayOfYear ^java.time.LocalDateTime G__35867)))


(defn get-month ^java.time.Month ([^java.time.LocalDateTime G__35868] (jti/getter month ^java.time.LocalDateTime G__35868)))


(defn plus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35869 G__35870] (.plusSeconds ^java.time.LocalDateTime G__35869 G__35870)))


(defn plus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35871 G__35872] (.plusMinutes ^java.time.LocalDateTime G__35871 G__35872)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDateTime G__35873] (.toLocalDate ^java.time.LocalDateTime G__35873)))



(defn until ([^java.time.LocalDateTime G__35874 ^java.time.temporal.Temporal G__35875 ^java.time.temporal.TemporalUnit G__35876] (.until ^java.time.LocalDateTime G__35874 ^java.time.temporal.Temporal G__35875 ^java.time.temporal.TemporalUnit G__35876)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.LocalDateTime G__35877 ^java.time.ZoneOffset G__35878] (.atOffset ^java.time.LocalDateTime G__35877 ^java.time.ZoneOffset G__35878)))




(defn is-before ([^java.time.LocalDateTime G__35879 ^java.time.chrono.ChronoLocalDateTime G__35880] (.isBefore ^java.time.LocalDateTime G__35879 ^java.time.chrono.ChronoLocalDateTime G__35880)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDateTime G__35881 ^java.time.temporal.Temporal G__35882] (.adjustInto ^java.time.LocalDateTime G__35881 ^java.time.temporal.Temporal G__35882)))


(defn get-hour ([^java.time.LocalDateTime G__35883] (jti/getter hour ^java.time.LocalDateTime G__35883)))


(defn minus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__35884 G__35885 G__35886] (.minus ^java.time.LocalDateTime G__35884 G__35885 G__35886)) ([^java.time.LocalDateTime G__35887 G__35888] (.minus ^java.time.LocalDateTime G__35887 G__35888)))


(defn plus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35889 G__35890] (.plusNanos ^java.time.LocalDateTime G__35889 G__35890)))


(defn get-nano ([^java.time.LocalDateTime G__35891] (jti/getter nano ^java.time.LocalDateTime G__35891)))


(defn get-year ([^java.time.LocalDateTime G__35892] (jti/getter year ^java.time.LocalDateTime G__35892)))


(defn with-day-of-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35893 G__35894] (.withDayOfMonth ^java.time.LocalDateTime G__35893 G__35894)))


(defn is-after ([^java.time.LocalDateTime G__35895 ^java.time.chrono.ChronoLocalDateTime G__35896] (.isAfter ^java.time.LocalDateTime G__35895 ^java.time.chrono.ChronoLocalDateTime G__35896)))


(defn to-string ^java.lang.String ([^java.time.LocalDateTime G__35897] (.toString ^java.time.LocalDateTime G__35897)))


(defn plus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35898 G__35899] (.plusMonths ^java.time.LocalDateTime G__35898 G__35899)))


(defn with-hour ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35900 G__35901] (.withHour ^java.time.LocalDateTime G__35900 G__35901)))


(defn equals ([^java.time.LocalDateTime G__35902 ^java.lang.Object G__35903] (.equals ^java.time.LocalDateTime G__35902 ^java.lang.Object G__35903)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__35904 G__35905] (.atZone ^java.time.LocalDateTime G__35904 G__35905)))


(defn get-month-value ([^java.time.LocalDateTime G__35906] (jti/getter monthValue ^java.time.LocalDateTime G__35906)))




(defn with-nano ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35907 G__35908] (.withNano ^java.time.LocalDateTime G__35907 G__35908)))


(defn get-minute ([^java.time.LocalDateTime G__35909] (jti/getter minute ^java.time.LocalDateTime G__35909)))


(defn minus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35910 G__35911] (.minusHours ^java.time.LocalDateTime G__35910 G__35911)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDateTime G__35912] (jti/getter dayOfWeek ^java.time.LocalDateTime G__35912)))


(defn plus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35913 G__35914] (.plusDays ^java.time.LocalDateTime G__35913 G__35914)))


(defn plus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35915 G__35916] (.plusWeeks ^java.time.LocalDateTime G__35915 G__35916)))


(defn hash-code ([^java.time.LocalDateTime G__35917] (.hashCode ^java.time.LocalDateTime G__35917)))



(defn get-long ([^java.time.LocalDateTime G__35918 ^java.time.temporal.TemporalField G__35919] (jti/getter long ^java.time.LocalDateTime G__35918 ^java.time.temporal.TemporalField G__35919)))


(defn with ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__35920 G__35921 G__35922] (.with ^java.time.LocalDateTime G__35920 G__35921 G__35922)) ([^java.time.LocalDateTime G__35923 G__35924] (.with ^java.time.LocalDateTime G__35923 G__35924)))


(defn from ^java.time.LocalDateTime ([^java.time.temporal.TemporalAccessor G__35926] (. java.time.LocalDateTime from ^java.time.temporal.TemporalAccessor G__35926)))


(defn parse ^java.time.LocalDateTime ([^java.lang.CharSequence G__35928] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__35928)) ([^java.lang.CharSequence G__35930 ^java.time.format.DateTimeFormatter G__35931] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__35930 ^java.time.format.DateTimeFormatter G__35931)))


(defn plus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__35932 G__35933 G__35934] (.plus ^java.time.LocalDateTime G__35932 G__35933 G__35934)) ([^java.time.LocalDateTime G__35935 G__35936] (.plus ^java.time.LocalDateTime G__35935 G__35936)))


(defn with-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35937 G__35938] (.withYear ^java.time.LocalDateTime G__35937 G__35938)))



(defn with-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35939 G__35940] (.withMonth ^java.time.LocalDateTime G__35939 G__35940)))


(defn minus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__35941 G__35942] (.minusMinutes ^java.time.LocalDateTime G__35941 G__35942)))

