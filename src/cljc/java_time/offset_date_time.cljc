(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetDateTime])))

(defn compare-to ([^java.time.OffsetDateTime G__34780 G__34781] (.compareTo ^java.time.OffsetDateTime G__34780 G__34781)))


(defn is-supported ([^java.time.OffsetDateTime G__34782 G__34783] (.isSupported ^java.time.OffsetDateTime G__34782 G__34783)))


(defn plus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34784 G__34785] (.plusYears ^java.time.OffsetDateTime G__34784 G__34785)))


(defn to-zoned-date-time ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__34786] (.toZonedDateTime ^java.time.OffsetDateTime G__34786)))


(defn query ^java.lang.Object ([^java.time.OffsetDateTime G__34787 ^java.time.temporal.TemporalQuery G__34788] (.query ^java.time.OffsetDateTime G__34787 ^java.time.temporal.TemporalQuery G__34788)))


(defn with-second ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34789 G__34790] (.withSecond ^java.time.OffsetDateTime G__34789 G__34790)))


(defn get-second ([^java.time.OffsetDateTime G__34791] (jti/getter second ^java.time.OffsetDateTime G__34791)))


(defn get-day-of-month ([^java.time.OffsetDateTime G__34792] (jti/getter dayOfMonth ^java.time.OffsetDateTime G__34792)))


(defn of ^java.time.OffsetDateTime ([^java.time.LocalDate G__34794 ^java.time.LocalTime G__34795 ^java.time.ZoneOffset G__34796] (. java.time.OffsetDateTime of ^java.time.LocalDate G__34794 ^java.time.LocalTime G__34795 ^java.time.ZoneOffset G__34796)) ([G__34798 G__34799 G__34800 G__34801 G__34802 G__34803 G__34804 ^java.time.ZoneOffset G__34805] (. java.time.OffsetDateTime of G__34798 G__34799 G__34800 G__34801 G__34802 G__34803 G__34804 ^java.time.ZoneOffset G__34805)) ([^java.time.LocalDateTime G__34807 ^java.time.ZoneOffset G__34808] (. java.time.OffsetDateTime of ^java.time.LocalDateTime G__34807 ^java.time.ZoneOffset G__34808)))


(defn minus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34809 G__34810] (.minusNanos ^java.time.OffsetDateTime G__34809 G__34810)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetDateTime G__34811 ^java.time.temporal.TemporalField G__34812] (.range ^java.time.OffsetDateTime G__34811 ^java.time.temporal.TemporalField G__34812)))


(defn with-day-of-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34813 G__34814] (.withDayOfYear ^java.time.OffsetDateTime G__34813 G__34814)))


(defn is-equal ([^java.time.OffsetDateTime G__34815 ^java.time.OffsetDateTime G__34816] (.isEqual ^java.time.OffsetDateTime G__34815 ^java.time.OffsetDateTime G__34816)))


(defn of-instant ^java.time.OffsetDateTime ([^java.time.Instant G__34818 ^java.time.ZoneId G__34819] (. java.time.OffsetDateTime ofInstant ^java.time.Instant G__34818 ^java.time.ZoneId G__34819)))


(defn with-minute ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34820 G__34821] (.withMinute ^java.time.OffsetDateTime G__34820 G__34821)))


(defn format ^java.lang.String ([^java.time.OffsetDateTime G__34822 ^java.time.format.DateTimeFormatter G__34823] (.format ^java.time.OffsetDateTime G__34822 ^java.time.format.DateTimeFormatter G__34823)))


(defn minus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34824 G__34825] (.minusMonths ^java.time.OffsetDateTime G__34824 G__34825)))


(defn get ([^java.time.OffsetDateTime G__34826 ^java.time.temporal.TemporalField G__34827] (.get ^java.time.OffsetDateTime G__34826 ^java.time.temporal.TemporalField G__34827)))


(defn truncated-to ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34828 ^java.time.temporal.TemporalUnit G__34829] (.truncatedTo ^java.time.OffsetDateTime G__34828 ^java.time.temporal.TemporalUnit G__34829)))


(defn minus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34830 G__34831] (.minusWeeks ^java.time.OffsetDateTime G__34830 G__34831)))


(defn minus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34832 G__34833] (.minusSeconds ^java.time.OffsetDateTime G__34832 G__34833)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetDateTime G__34834] (.toLocalTime ^java.time.OffsetDateTime G__34834)))


(defn now ^java.time.OffsetDateTime ([G__34836] (. java.time.OffsetDateTime now G__34836)) ([] (. java.time.OffsetDateTime now)))


(defn minus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34838 G__34839] (.minusYears ^java.time.OffsetDateTime G__34838 G__34839)))


(defn minus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34840 G__34841] (.minusDays ^java.time.OffsetDateTime G__34840 G__34841)))


(defn plus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34842 G__34843] (.plusHours ^java.time.OffsetDateTime G__34842 G__34843)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.OffsetDateTime G__34844] (.toLocalDateTime ^java.time.OffsetDateTime G__34844)))



(defn get-day-of-year ([^java.time.OffsetDateTime G__34845] (jti/getter dayOfYear ^java.time.OffsetDateTime G__34845)))


(defn get-month ^java.time.Month ([^java.time.OffsetDateTime G__34846] (jti/getter month ^java.time.OffsetDateTime G__34846)))



(defn plus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34847 G__34848] (.plusSeconds ^java.time.OffsetDateTime G__34847 G__34848)))


(defn at-zone-same-instant ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__34849 ^java.time.ZoneId G__34850] (.atZoneSameInstant ^java.time.OffsetDateTime G__34849 ^java.time.ZoneId G__34850)))


(defn plus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34851 G__34852] (.plusMinutes ^java.time.OffsetDateTime G__34851 G__34852)))


(defn to-local-date ^java.time.LocalDate ([^java.time.OffsetDateTime G__34853] (.toLocalDate ^java.time.OffsetDateTime G__34853)))



(defn until ([^java.time.OffsetDateTime G__34854 ^java.time.temporal.Temporal G__34855 ^java.time.temporal.TemporalUnit G__34856] (.until ^java.time.OffsetDateTime G__34854 ^java.time.temporal.Temporal G__34855 ^java.time.temporal.TemporalUnit G__34856)))




(defn is-before ([^java.time.OffsetDateTime G__34857 ^java.time.OffsetDateTime G__34858] (.isBefore ^java.time.OffsetDateTime G__34857 ^java.time.OffsetDateTime G__34858)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetDateTime G__34859 ^java.time.temporal.Temporal G__34860] (.adjustInto ^java.time.OffsetDateTime G__34859 ^java.time.temporal.Temporal G__34860)))


(defn get-hour ([^java.time.OffsetDateTime G__34861] (jti/getter hour ^java.time.OffsetDateTime G__34861)))


(defn minus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34862 G__34863] (.minus ^java.time.OffsetDateTime G__34862 G__34863)) ([^java.time.OffsetDateTime G__34864 G__34865 G__34866] (.minus ^java.time.OffsetDateTime G__34864 G__34865 G__34866)))


(defn plus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34867 G__34868] (.plusNanos ^java.time.OffsetDateTime G__34867 G__34868)))


(defn get-nano ([^java.time.OffsetDateTime G__34869] (jti/getter nano ^java.time.OffsetDateTime G__34869)))


(defn get-year ([^java.time.OffsetDateTime G__34870] (jti/getter year ^java.time.OffsetDateTime G__34870)))


(defn with-day-of-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34871 G__34872] (.withDayOfMonth ^java.time.OffsetDateTime G__34871 G__34872)))


(defn is-after ([^java.time.OffsetDateTime G__34873 ^java.time.OffsetDateTime G__34874] (.isAfter ^java.time.OffsetDateTime G__34873 ^java.time.OffsetDateTime G__34874)))


(defn to-string ^java.lang.String ([^java.time.OffsetDateTime G__34875] (.toString ^java.time.OffsetDateTime G__34875)))


(defn plus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34876 G__34877] (.plusMonths ^java.time.OffsetDateTime G__34876 G__34877)))


(defn with-hour ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34878 G__34879] (.withHour ^java.time.OffsetDateTime G__34878 G__34879)))


(defn to-offset-time ^java.time.OffsetTime ([^java.time.OffsetDateTime G__34880] (.toOffsetTime ^java.time.OffsetDateTime G__34880)))


(defn equals ([^java.time.OffsetDateTime G__34881 ^java.lang.Object G__34882] (.equals ^java.time.OffsetDateTime G__34881 ^java.lang.Object G__34882)))



(defn get-month-value ([^java.time.OffsetDateTime G__34883] (jti/getter monthValue ^java.time.OffsetDateTime G__34883)))



(defn with-nano ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34884 G__34885] (.withNano ^java.time.OffsetDateTime G__34884 G__34885)))


(defn get-minute ([^java.time.OffsetDateTime G__34886] (jti/getter minute ^java.time.OffsetDateTime G__34886)))


(defn minus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34887 G__34888] (.minusHours ^java.time.OffsetDateTime G__34887 G__34888)))


(defn to-instant ^java.time.Instant ([^java.time.OffsetDateTime G__34889] (.toInstant ^java.time.OffsetDateTime G__34889)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.OffsetDateTime G__34890] (jti/getter dayOfWeek ^java.time.OffsetDateTime G__34890)))


(defn plus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34891 G__34892] (.plusDays ^java.time.OffsetDateTime G__34891 G__34892)))


(defn plus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34893 G__34894] (.plusWeeks ^java.time.OffsetDateTime G__34893 G__34894)))


(defn hash-code ([^java.time.OffsetDateTime G__34895] (.hashCode ^java.time.OffsetDateTime G__34895)))



(defn get-long ([^java.time.OffsetDateTime G__34896 ^java.time.temporal.TemporalField G__34897] (jti/getter long ^java.time.OffsetDateTime G__34896 ^java.time.temporal.TemporalField G__34897)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetDateTime G__34898] (jti/getter offset ^java.time.OffsetDateTime G__34898)))


(defn with-offset-same-instant ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34899 ^java.time.ZoneOffset G__34900] (.withOffsetSameInstant ^java.time.OffsetDateTime G__34899 ^java.time.ZoneOffset G__34900)))


(defn time-line-order ^java.util.Comparator ([] (. java.time.OffsetDateTime timeLineOrder)))


(defn with ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34902 G__34903] (.with ^java.time.OffsetDateTime G__34902 G__34903)) ([^java.time.OffsetDateTime G__34904 G__34905 G__34906] (.with ^java.time.OffsetDateTime G__34904 G__34905 G__34906)))


(defn from ^java.time.OffsetDateTime ([^java.time.temporal.TemporalAccessor G__34908] (. java.time.OffsetDateTime from ^java.time.temporal.TemporalAccessor G__34908)))


(defn parse ^java.time.OffsetDateTime ([^java.lang.CharSequence G__34910] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__34910)) ([^java.lang.CharSequence G__34912 ^java.time.format.DateTimeFormatter G__34913] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__34912 ^java.time.format.DateTimeFormatter G__34913)))


(defn plus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34914 G__34915] (.plus ^java.time.OffsetDateTime G__34914 G__34915)) ([^java.time.OffsetDateTime G__34916 G__34917 G__34918] (.plus ^java.time.OffsetDateTime G__34916 G__34917 G__34918)))


(defn with-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34919 G__34920] (.withYear ^java.time.OffsetDateTime G__34919 G__34920)))


(defn to-epoch-second ([^java.time.OffsetDateTime G__34921] (.toEpochSecond ^java.time.OffsetDateTime G__34921)))


(defn with-offset-same-local ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34922 ^java.time.ZoneOffset G__34923] (.withOffsetSameLocal ^java.time.OffsetDateTime G__34922 ^java.time.ZoneOffset G__34923)))



(defn at-zone-similar-local ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__34924 ^java.time.ZoneId G__34925] (.atZoneSimilarLocal ^java.time.OffsetDateTime G__34924 ^java.time.ZoneId G__34925)))



(defn with-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34926 G__34927] (.withMonth ^java.time.OffsetDateTime G__34926 G__34927)))


(defn minus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__34928 G__34929] (.minusMinutes ^java.time.OffsetDateTime G__34928 G__34929)))

