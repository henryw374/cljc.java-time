(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [YearMonth]])) #? (:clj (:import [java.time YearMonth])))

(defn compare-to ([^java.time.YearMonth G__27029 G__27030] (.compareTo ^java.time.YearMonth G__27029 G__27030)))


(defn is-supported ([^java.time.YearMonth G__27031 G__27032] (.isSupported ^java.time.YearMonth G__27031 G__27032)))


(defn plus-years ^java.time.YearMonth ([^java.time.YearMonth G__27033 G__27034] (.plusYears ^java.time.YearMonth G__27033 G__27034)))


(defn query ^java.lang.Object ([^java.time.YearMonth G__27035 ^java.time.temporal.TemporalQuery G__27036] (.query ^java.time.YearMonth G__27035 ^java.time.temporal.TemporalQuery G__27036)))



(defn of ^java.time.YearMonth ([G__27038 G__27039] (. java.time.YearMonth of G__27038 G__27039)))


(defn range ^java.time.temporal.ValueRange ([^java.time.YearMonth G__27040 ^java.time.temporal.TemporalField G__27041] (.range ^java.time.YearMonth G__27040 ^java.time.temporal.TemporalField G__27041)))



(defn length-of-month ([^java.time.YearMonth G__27042] (.lengthOfMonth ^java.time.YearMonth G__27042)))


(defn format ^java.lang.String ([^java.time.YearMonth G__27043 ^java.time.format.DateTimeFormatter G__27044] (.format ^java.time.YearMonth G__27043 ^java.time.format.DateTimeFormatter G__27044)))


(defn minus-months ^java.time.YearMonth ([^java.time.YearMonth G__27045 G__27046] (.minusMonths ^java.time.YearMonth G__27045 G__27046)))


(defn at-day ^java.time.LocalDate ([^java.time.YearMonth G__27047 G__27048] (.atDay ^java.time.YearMonth G__27047 G__27048)))


(defn get ([^java.time.YearMonth G__27049 ^java.time.temporal.TemporalField G__27050] (.get ^java.time.YearMonth G__27049 ^java.time.temporal.TemporalField G__27050)))


(defn now ^java.time.YearMonth ([G__27052] (. java.time.YearMonth now G__27052)) ([] (. java.time.YearMonth now)))


(defn minus-years ^java.time.YearMonth ([^java.time.YearMonth G__27054 G__27055] (.minusYears ^java.time.YearMonth G__27054 G__27055)))



(defn get-month ^java.time.Month ([^java.time.YearMonth G__27056] (jti/getter month ^java.time.YearMonth G__27056)))


(defn at-end-of-month ^java.time.LocalDate ([^java.time.YearMonth G__27057] (.atEndOfMonth ^java.time.YearMonth G__27057)))



(defn until ([^java.time.YearMonth G__27058 ^java.time.temporal.Temporal G__27059 ^java.time.temporal.TemporalUnit G__27060] (.until ^java.time.YearMonth G__27058 ^java.time.temporal.Temporal G__27059 ^java.time.temporal.TemporalUnit G__27060)))




(defn is-before ([^java.time.YearMonth G__27061 ^java.time.YearMonth G__27062] (.isBefore ^java.time.YearMonth G__27061 ^java.time.YearMonth G__27062)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.YearMonth G__27063 ^java.time.temporal.Temporal G__27064] (.adjustInto ^java.time.YearMonth G__27063 ^java.time.temporal.Temporal G__27064)))


(defn minus ^java.time.YearMonth ([^java.time.YearMonth G__27065 G__27066] (.minus ^java.time.YearMonth G__27065 G__27066)) ([^java.time.YearMonth G__27067 G__27068 G__27069] (.minus ^java.time.YearMonth G__27067 G__27068 G__27069)))


(defn get-year ([^java.time.YearMonth G__27070] (jti/getter year ^java.time.YearMonth G__27070)))


(defn is-after ([^java.time.YearMonth G__27071 ^java.time.YearMonth G__27072] (.isAfter ^java.time.YearMonth G__27071 ^java.time.YearMonth G__27072)))


(defn to-string ^java.lang.String ([^java.time.YearMonth G__27073] (.toString ^java.time.YearMonth G__27073)))


(defn plus-months ^java.time.YearMonth ([^java.time.YearMonth G__27074 G__27075] (.plusMonths ^java.time.YearMonth G__27074 G__27075)))


(defn is-valid-day ([^java.time.YearMonth G__27076 G__27077] (.isValidDay ^java.time.YearMonth G__27076 G__27077)))


(defn equals ([^java.time.YearMonth G__27078 ^java.lang.Object G__27079] (.equals ^java.time.YearMonth G__27078 ^java.lang.Object G__27079)))


(defn get-month-value ([^java.time.YearMonth G__27080] (jti/getter monthValue ^java.time.YearMonth G__27080)))


(defn length-of-year ([^java.time.YearMonth G__27081] (.lengthOfYear ^java.time.YearMonth G__27081)))




(defn hash-code ([^java.time.YearMonth G__27082] (.hashCode ^java.time.YearMonth G__27082)))



(defn get-long ([^java.time.YearMonth G__27083 ^java.time.temporal.TemporalField G__27084] (jti/getter long ^java.time.YearMonth G__27083 ^java.time.temporal.TemporalField G__27084)))


(defn is-leap-year ([^java.time.YearMonth G__27085] (.isLeapYear ^java.time.YearMonth G__27085)))


(defn with ^java.time.temporal.Temporal ([^java.time.YearMonth G__27086 G__27087 G__27088] (.with ^java.time.YearMonth G__27086 G__27087 G__27088)) ([^java.time.YearMonth G__27089 G__27090] (.with ^java.time.YearMonth G__27089 G__27090)))


(defn from ^java.time.YearMonth ([^java.time.temporal.TemporalAccessor G__27092] (. java.time.YearMonth from ^java.time.temporal.TemporalAccessor G__27092)))


(defn parse ^java.time.YearMonth ([^java.lang.CharSequence G__27094] (. java.time.YearMonth parse ^java.lang.CharSequence G__27094)) ([^java.lang.CharSequence G__27096 ^java.time.format.DateTimeFormatter G__27097] (. java.time.YearMonth parse ^java.lang.CharSequence G__27096 ^java.time.format.DateTimeFormatter G__27097)))


(defn plus ^java.time.YearMonth ([^java.time.YearMonth G__27098 G__27099] (.plus ^java.time.YearMonth G__27098 G__27099)) ([^java.time.YearMonth G__27100 G__27101 G__27102] (.plus ^java.time.YearMonth G__27100 G__27101 G__27102)))


(defn with-year ^java.time.YearMonth ([^java.time.YearMonth G__27103 G__27104] (.withYear ^java.time.YearMonth G__27103 G__27104)))



(defn with-month ^java.time.YearMonth ([^java.time.YearMonth G__27105 G__27106] (.withMonth ^java.time.YearMonth G__27105 G__27106)))

