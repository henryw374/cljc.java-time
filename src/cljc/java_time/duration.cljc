(ns cljc.java-time.duration (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [Duration]])) #? (:clj (:import [java.time Duration])))

(defn compare-to ([^java.time.Duration G__26868 G__26869] (.compareTo ^java.time.Duration G__26868 G__26869)))


(defn to-days ([^java.time.Duration G__26870] (.toDays ^java.time.Duration G__26870)))



(defn to-millis ([^java.time.Duration G__26871] (.toMillis ^java.time.Duration G__26871)))


(defn of-seconds ^java.time.Duration ([G__26873 G__26874] (. java.time.Duration ofSeconds G__26873 G__26874)) ([G__26876] (. java.time.Duration ofSeconds G__26876)))


(defn of-minutes ^java.time.Duration ([G__26878] (. java.time.Duration ofMinutes G__26878)))


(defn get-units ^java.util.List ([^java.time.Duration G__26879] (jti/getter units ^java.time.Duration G__26879)))


(defn of ^java.time.Duration ([G__26881 ^java.time.temporal.TemporalUnit G__26882] (. java.time.Duration of G__26881 ^java.time.temporal.TemporalUnit G__26882)))


(defn is-zero ([^java.time.Duration G__26883] (.isZero ^java.time.Duration G__26883)))


(defn minus-nanos ^java.time.Duration ([^java.time.Duration G__26884 G__26885] (.minusNanos ^java.time.Duration G__26884 G__26885)))


(defn of-hours ^java.time.Duration ([G__26887] (. java.time.Duration ofHours G__26887)))


(defn to-hours ([^java.time.Duration G__26888] (.toHours ^java.time.Duration G__26888)))



(defn to-minutes ([^java.time.Duration G__26889] (.toMinutes ^java.time.Duration G__26889)))


(defn with-nanos ^java.time.Duration ([^java.time.Duration G__26890 G__26891] (.withNanos ^java.time.Duration G__26890 G__26891)))


(defn get ([^java.time.Duration G__26892 ^java.time.temporal.TemporalUnit G__26893] (.get ^java.time.Duration G__26892 ^java.time.temporal.TemporalUnit G__26893)))


(defn minus-millis ^java.time.Duration ([^java.time.Duration G__26894 G__26895] (.minusMillis ^java.time.Duration G__26894 G__26895)))


(defn of-millis ^java.time.Duration ([G__26897] (. java.time.Duration ofMillis G__26897)))



(defn minus-seconds ^java.time.Duration ([^java.time.Duration G__26898 G__26899] (.minusSeconds ^java.time.Duration G__26898 G__26899)))


(defn minus-days ^java.time.Duration ([^java.time.Duration G__26900 G__26901] (.minusDays ^java.time.Duration G__26900 G__26901)))


(defn plus-hours ^java.time.Duration ([^java.time.Duration G__26902 G__26903] (.plusHours ^java.time.Duration G__26902 G__26903)))




(defn is-negative ([^java.time.Duration G__26904] (.isNegative ^java.time.Duration G__26904)))



(defn plus-seconds ^java.time.Duration ([^java.time.Duration G__26905 G__26906] (.plusSeconds ^java.time.Duration G__26905 G__26906)))



(defn plus-minutes ^java.time.Duration ([^java.time.Duration G__26907 G__26908] (.plusMinutes ^java.time.Duration G__26907 G__26908)))




(defn multiplied-by ^java.time.Duration ([^java.time.Duration G__26909 G__26910] (.multipliedBy ^java.time.Duration G__26909 G__26910)))


(defn minus ^java.time.Duration ([^java.time.Duration G__26911 ^java.time.Duration G__26912] (.minus ^java.time.Duration G__26911 ^java.time.Duration G__26912)) ([^java.time.Duration G__26913 G__26914 ^java.time.temporal.TemporalUnit G__26915] (.minus ^java.time.Duration G__26913 G__26914 ^java.time.temporal.TemporalUnit G__26915)))


(defn between ^java.time.Duration ([^java.time.temporal.Temporal G__26917 ^java.time.temporal.Temporal G__26918] (. java.time.Duration between ^java.time.temporal.Temporal G__26917 ^java.time.temporal.Temporal G__26918)))


(defn plus-nanos ^java.time.Duration ([^java.time.Duration G__26919 G__26920] (.plusNanos ^java.time.Duration G__26919 G__26920)))


(defn get-nano ([^java.time.Duration G__26921] (jti/getter nano ^java.time.Duration G__26921)))


(defn to-nanos ([^java.time.Duration G__26922] (.toNanos ^java.time.Duration G__26922)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Duration G__26923 ^java.time.temporal.Temporal G__26924] (.addTo ^java.time.Duration G__26923 ^java.time.temporal.Temporal G__26924)))


(defn to-string ^java.lang.String ([^java.time.Duration G__26925] (.toString ^java.time.Duration G__26925)))



(defn equals ([^java.time.Duration G__26926 ^java.lang.Object G__26927] (.equals ^java.time.Duration G__26926 ^java.lang.Object G__26927)))


(defn of-nanos ^java.time.Duration ([G__26929] (. java.time.Duration ofNanos G__26929)))


(defn plus-millis ^java.time.Duration ([^java.time.Duration G__26930 G__26931] (.plusMillis ^java.time.Duration G__26930 G__26931)))


(defn with-seconds ^java.time.Duration ([^java.time.Duration G__26932 G__26933] (.withSeconds ^java.time.Duration G__26932 G__26933)))


(defn minus-hours ^java.time.Duration ([^java.time.Duration G__26934 G__26935] (.minusHours ^java.time.Duration G__26934 G__26935)))


(defn get-seconds ([^java.time.Duration G__26936] (jti/getter seconds ^java.time.Duration G__26936)))


(defn plus-days ^java.time.Duration ([^java.time.Duration G__26937 G__26938] (.plusDays ^java.time.Duration G__26937 G__26938)))



(defn hash-code ([^java.time.Duration G__26939] (.hashCode ^java.time.Duration G__26939)))



(defn abs ^java.time.Duration ([^java.time.Duration G__26940] (.abs ^java.time.Duration G__26940)))


(defn of-days ^java.time.Duration ([G__26942] (. java.time.Duration ofDays G__26942)))


(defn from ^java.time.Duration ([^java.time.temporal.TemporalAmount G__26944] (. java.time.Duration from ^java.time.temporal.TemporalAmount G__26944)))


(defn parse ^java.time.Duration ([^java.lang.CharSequence G__26946] (. java.time.Duration parse ^java.lang.CharSequence G__26946)))


(defn plus ^java.time.Duration ([^java.time.Duration G__26947 ^java.time.Duration G__26948] (.plus ^java.time.Duration G__26947 ^java.time.Duration G__26948)) ([^java.time.Duration G__26949 G__26950 G__26951] (.plus ^java.time.Duration G__26949 G__26950 G__26951)))


(defn divided-by ^java.time.Duration ([^java.time.Duration G__26952 G__26953] (.dividedBy ^java.time.Duration G__26952 G__26953)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Duration G__26954 ^java.time.temporal.Temporal G__26955] (.subtractFrom ^java.time.Duration G__26954 ^java.time.temporal.Temporal G__26955)))



(defn negated ^java.time.Duration ([^java.time.Duration G__26956] (.negated ^java.time.Duration G__26956)))




(defn minus-minutes ^java.time.Duration ([^java.time.Duration G__26957 G__26958] (.minusMinutes ^java.time.Duration G__26957 G__26958)))

