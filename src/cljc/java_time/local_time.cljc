(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [LocalTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalTime])))

(defn compare-to ([^java.time.LocalTime G__34974 G__34975] (.compareTo ^java.time.LocalTime G__34974 G__34975)))


(defn is-supported ([^java.time.LocalTime G__34976 G__34977] (.isSupported ^java.time.LocalTime G__34976 G__34977)))


(defn query ^java.lang.Object ([^java.time.LocalTime G__34978 ^java.time.temporal.TemporalQuery G__34979] (.query ^java.time.LocalTime G__34978 ^java.time.temporal.TemporalQuery G__34979)))


(defn with-second ^java.time.LocalTime ([^java.time.LocalTime G__34980 G__34981] (.withSecond ^java.time.LocalTime G__34980 G__34981)))



(defn get-second ([^java.time.LocalTime G__34982] (jti/getter second ^java.time.LocalTime G__34982)))



(defn of-second-of-day ^java.time.LocalTime ([G__34984] (. java.time.LocalTime ofSecondOfDay G__34984)))



(defn of ^java.time.LocalTime ([G__34986 G__34987] (. java.time.LocalTime of G__34986 G__34987)) ([G__34989 G__34990 G__34991 G__34992] (. java.time.LocalTime of G__34989 G__34990 G__34991 G__34992)) ([G__34994 G__34995 G__34996] (. java.time.LocalTime of G__34994 G__34995 G__34996)))




(defn minus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__34997 G__34998] (.minusNanos ^java.time.LocalTime G__34997 G__34998)))



(defn range ^java.time.temporal.ValueRange ([^java.time.LocalTime G__34999 ^java.time.temporal.TemporalField G__35000] (.range ^java.time.LocalTime G__34999 ^java.time.temporal.TemporalField G__35000)))




(defn with-minute ^java.time.LocalTime ([^java.time.LocalTime G__35001 G__35002] (.withMinute ^java.time.LocalTime G__35001 G__35002)))






(defn format ^java.lang.String ([^java.time.LocalTime G__35003 ^java.time.format.DateTimeFormatter G__35004] (.format ^java.time.LocalTime G__35003 ^java.time.format.DateTimeFormatter G__35004)))


(defn get ([^java.time.LocalTime G__35005 ^java.time.temporal.TemporalField G__35006] (.get ^java.time.LocalTime G__35005 ^java.time.temporal.TemporalField G__35006)))


(defn truncated-to ^java.time.LocalTime ([^java.time.LocalTime G__35007 ^java.time.temporal.TemporalUnit G__35008] (.truncatedTo ^java.time.LocalTime G__35007 ^java.time.temporal.TemporalUnit G__35008)))



(defn of-nano-of-day ^java.time.LocalTime ([G__35010] (. java.time.LocalTime ofNanoOfDay G__35010)))


(defn minus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__35011 G__35012] (.minusSeconds ^java.time.LocalTime G__35011 G__35012)))


(defn now ^java.time.LocalTime ([G__35014] (. java.time.LocalTime now G__35014)) ([] (. java.time.LocalTime now)))


(defn plus-hours ^java.time.LocalTime ([^java.time.LocalTime G__35016 G__35017] (.plusHours ^java.time.LocalTime G__35016 G__35017)))





(defn plus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__35018 G__35019] (.plusSeconds ^java.time.LocalTime G__35018 G__35019)))


(defn plus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__35020 G__35021] (.plusMinutes ^java.time.LocalTime G__35020 G__35021)))



(defn to-nano-of-day ([^java.time.LocalTime G__35022] (.toNanoOfDay ^java.time.LocalTime G__35022)))




(defn until ([^java.time.LocalTime G__35023 ^java.time.temporal.Temporal G__35024 ^java.time.temporal.TemporalUnit G__35025] (.until ^java.time.LocalTime G__35023 ^java.time.temporal.Temporal G__35024 ^java.time.temporal.TemporalUnit G__35025)))



(defn at-offset ^java.time.OffsetTime ([^java.time.LocalTime G__35026 ^java.time.ZoneOffset G__35027] (.atOffset ^java.time.LocalTime G__35026 ^java.time.ZoneOffset G__35027)))



(defn is-before ([^java.time.LocalTime G__35028 ^java.time.LocalTime G__35029] (.isBefore ^java.time.LocalTime G__35028 ^java.time.LocalTime G__35029)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalTime G__35030 ^java.time.temporal.Temporal G__35031] (.adjustInto ^java.time.LocalTime G__35030 ^java.time.temporal.Temporal G__35031)))


(defn get-hour ([^java.time.LocalTime G__35032] (jti/getter hour ^java.time.LocalTime G__35032)))


(defn minus ^java.time.temporal.Temporal ([^java.time.LocalTime G__35033 G__35034] (.minus ^java.time.LocalTime G__35033 G__35034)) ([^java.time.LocalTime G__35035 G__35036 G__35037] (.minus ^java.time.LocalTime G__35035 G__35036 G__35037)))


(defn plus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__35038 G__35039] (.plusNanos ^java.time.LocalTime G__35038 G__35039)))


(defn get-nano ([^java.time.LocalTime G__35040] (jti/getter nano ^java.time.LocalTime G__35040)))



(defn is-after ([^java.time.LocalTime G__35041 ^java.time.LocalTime G__35042] (.isAfter ^java.time.LocalTime G__35041 ^java.time.LocalTime G__35042)))



(defn to-string ^java.lang.String ([^java.time.LocalTime G__35043] (.toString ^java.time.LocalTime G__35043)))


(defn with-hour ^java.time.LocalTime ([^java.time.LocalTime G__35044 G__35045] (.withHour ^java.time.LocalTime G__35044 G__35045)))


(defn equals ([^java.time.LocalTime G__35046 ^java.lang.Object G__35047] (.equals ^java.time.LocalTime G__35046 ^java.lang.Object G__35047)))



(defn with-nano ^java.time.LocalTime ([^java.time.LocalTime G__35048 G__35049] (.withNano ^java.time.LocalTime G__35048 G__35049)))


(defn get-minute ([^java.time.LocalTime G__35050] (jti/getter minute ^java.time.LocalTime G__35050)))


(defn minus-hours ^java.time.LocalTime ([^java.time.LocalTime G__35051 G__35052] (.minusHours ^java.time.LocalTime G__35051 G__35052)))


(defn hash-code ([^java.time.LocalTime G__35053] (.hashCode ^java.time.LocalTime G__35053)))




(defn get-long ([^java.time.LocalTime G__35054 ^java.time.temporal.TemporalField G__35055] (jti/getter long ^java.time.LocalTime G__35054 ^java.time.temporal.TemporalField G__35055)))


(defn with ^java.time.temporal.Temporal ([^java.time.LocalTime G__35056 G__35057] (.with ^java.time.LocalTime G__35056 G__35057)) ([^java.time.LocalTime G__35058 G__35059 G__35060] (.with ^java.time.LocalTime G__35058 G__35059 G__35060)))


(defn from ^java.time.LocalTime ([^java.time.temporal.TemporalAccessor G__35062] (. java.time.LocalTime from ^java.time.temporal.TemporalAccessor G__35062)))


(defn parse ^java.time.LocalTime ([^java.lang.CharSequence G__35064] (. java.time.LocalTime parse ^java.lang.CharSequence G__35064)) ([^java.lang.CharSequence G__35066 ^java.time.format.DateTimeFormatter G__35067] (. java.time.LocalTime parse ^java.lang.CharSequence G__35066 ^java.time.format.DateTimeFormatter G__35067)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalTime G__35068 G__35069 G__35070] (.plus ^java.time.LocalTime G__35068 G__35069 G__35070)) ([^java.time.LocalTime G__35071 G__35072] (.plus ^java.time.LocalTime G__35071 G__35072)))


(defn at-date ^java.time.LocalDateTime ([^java.time.LocalTime G__35073 ^java.time.LocalDate G__35074] (.atDate ^java.time.LocalTime G__35073 ^java.time.LocalDate G__35074)))


(defn to-second-of-day ([^java.time.LocalTime G__35075] (.toSecondOfDay ^java.time.LocalTime G__35075)))



(defn minus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__35076 G__35077] (.minusMinutes ^java.time.LocalTime G__35076 G__35077)))


