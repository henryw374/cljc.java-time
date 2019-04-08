(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [Year]])) #? (:clj (:import [java.time Year])))

(defn compare-to ([^java.time.Year G__26959 G__26960] (.compareTo ^java.time.Year G__26959 G__26960)))


(defn is-supported ([^java.time.Year G__26961 G__26962] (.isSupported ^java.time.Year G__26961 G__26962)))


(defn plus-years ^java.time.Year ([^java.time.Year G__26963 G__26964] (.plusYears ^java.time.Year G__26963 G__26964)))


(defn query ^java.lang.Object ([^java.time.Year G__26965 ^java.time.temporal.TemporalQuery G__26966] (.query ^java.time.Year G__26965 ^java.time.temporal.TemporalQuery G__26966)))


(defn of ^java.time.Year ([G__26968] (. java.time.Year of G__26968)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Year G__26969 ^java.time.temporal.TemporalField G__26970] (.range ^java.time.Year G__26969 ^java.time.temporal.TemporalField G__26970)))




(defn format ^java.lang.String ([^java.time.Year G__26971 ^java.time.format.DateTimeFormatter G__26972] (.format ^java.time.Year G__26971 ^java.time.format.DateTimeFormatter G__26972)))


(defn at-day ^java.time.LocalDate ([^java.time.Year G__26973 G__26974] (.atDay ^java.time.Year G__26973 G__26974)))


(defn get ([^java.time.Year G__26975 ^java.time.temporal.TemporalField G__26976] (.get ^java.time.Year G__26975 ^java.time.temporal.TemporalField G__26976)))


(defn now ^java.time.Year ([G__26978] (. java.time.Year now G__26978)) ([] (. java.time.Year now)))


(defn minus-years ^java.time.Year ([^java.time.Year G__26980 G__26981] (.minusYears ^java.time.Year G__26980 G__26981)))



(defn get-value ([^java.time.Year G__26982] (jti/getter value ^java.time.Year G__26982)))



(defn until ([^java.time.Year G__26983 ^java.time.temporal.Temporal G__26984 ^java.time.temporal.TemporalUnit G__26985] (.until ^java.time.Year G__26983 ^java.time.temporal.Temporal G__26984 ^java.time.temporal.TemporalUnit G__26985)))



(defn is-before ([^java.time.Year G__26986 ^java.time.Year G__26987] (.isBefore ^java.time.Year G__26986 ^java.time.Year G__26987)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Year G__26988 ^java.time.temporal.Temporal G__26989] (.adjustInto ^java.time.Year G__26988 ^java.time.temporal.Temporal G__26989)))


(defn minus ^java.time.temporal.Temporal ([^java.time.Year G__26990 G__26991 G__26992] (.minus ^java.time.Year G__26990 G__26991 G__26992)) ([^java.time.Year G__26993 G__26994] (.minus ^java.time.Year G__26993 G__26994)))



(defn is-after ([^java.time.Year G__26995 ^java.time.Year G__26996] (.isAfter ^java.time.Year G__26995 ^java.time.Year G__26996)))


(defn is-leap ([G__26998] (. java.time.Year isLeap G__26998)))


(defn to-string ^java.lang.String ([^java.time.Year G__26999] (.toString ^java.time.Year G__26999)))


(defn at-month-day ^java.time.LocalDate ([^java.time.Year G__27000 ^java.time.MonthDay G__27001] (.atMonthDay ^java.time.Year G__27000 ^java.time.MonthDay G__27001)))


(defn equals ([^java.time.Year G__27002 ^java.lang.Object G__27003] (.equals ^java.time.Year G__27002 ^java.lang.Object G__27003)))




(defn hash-code ([^java.time.Year G__27004] (.hashCode ^java.time.Year G__27004)))



(defn get-long ([^java.time.Year G__27005 ^java.time.temporal.TemporalField G__27006] (jti/getter long ^java.time.Year G__27005 ^java.time.temporal.TemporalField G__27006)))


(defn with ^java.time.temporal.Temporal ([^java.time.Year G__27007 G__27008 G__27009] (.with ^java.time.Year G__27007 G__27008 G__27009)) ([^java.time.Year G__27010 G__27011] (.with ^java.time.Year G__27010 G__27011)))


(defn from ^java.time.Year ([^java.time.temporal.TemporalAccessor G__27013] (. java.time.Year from ^java.time.temporal.TemporalAccessor G__27013)))


(defn parse ^java.time.Year ([^java.lang.CharSequence G__27015 ^java.time.format.DateTimeFormatter G__27016] (. java.time.Year parse ^java.lang.CharSequence G__27015 ^java.time.format.DateTimeFormatter G__27016)) ([^java.lang.CharSequence G__27018] (. java.time.Year parse ^java.lang.CharSequence G__27018)))


(defn plus ^java.time.Year ([^java.time.Year G__27019 G__27020 G__27021] (.plus ^java.time.Year G__27019 G__27020 G__27021)) ([^java.time.Year G__27022 G__27023] (.plus ^java.time.Year G__27022 G__27023)))


(defn at-month ^java.time.YearMonth ([^java.time.Year G__27024 G__27025] (.atMonth ^java.time.Year G__27024 G__27025)))


(defn length ([^java.time.Year G__27026] (.length ^java.time.Year G__27026)))


(defn is-valid-month-day ([^java.time.Year G__27027 ^java.time.MonthDay G__27028] (.isValidMonthDay ^java.time.Year G__27027 ^java.time.MonthDay G__27028)))


