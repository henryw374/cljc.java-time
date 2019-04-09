(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Year]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Year])))
(def min-value (. java.time.Year -MIN_VALUE))
(def max-value (. java.time.Year -MAX_VALUE))

(defn compare-to ([^java.time.Year G__56402 G__56403] (.compareTo ^java.time.Year G__56402 G__56403)))


(defn is-supported ([^java.time.Year G__56404 G__56405] (.isSupported ^java.time.Year G__56404 G__56405)))


(defn plus-years ^java.time.Year ([^java.time.Year G__56406 G__56407] (.plusYears ^java.time.Year G__56406 G__56407)))


(defn query ^java.lang.Object ([^java.time.Year G__56408 ^java.time.temporal.TemporalQuery G__56409] (.query ^java.time.Year G__56408 ^java.time.temporal.TemporalQuery G__56409)))


(defn of ^java.time.Year ([G__56411] (. java.time.Year of G__56411)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Year G__56412 ^java.time.temporal.TemporalField G__56413] (.range ^java.time.Year G__56412 ^java.time.temporal.TemporalField G__56413)))




(defn format ^java.lang.String ([^java.time.Year G__56414 ^java.time.format.DateTimeFormatter G__56415] (.format ^java.time.Year G__56414 ^java.time.format.DateTimeFormatter G__56415)))


(defn at-day ^java.time.LocalDate ([^java.time.Year G__56416 G__56417] (.atDay ^java.time.Year G__56416 G__56417)))


(defn get ([^java.time.Year G__56418 ^java.time.temporal.TemporalField G__56419] (.get ^java.time.Year G__56418 ^java.time.temporal.TemporalField G__56419)))


(defn now ^java.time.Year ([G__56421] (. java.time.Year now G__56421)) ([] (. java.time.Year now)))


(defn minus-years ^java.time.Year ([^java.time.Year G__56423 G__56424] (.minusYears ^java.time.Year G__56423 G__56424)))



(defn get-value ([^java.time.Year G__56425] (jti/getter value ^java.time.Year G__56425)))



(defn until ([^java.time.Year G__56426 ^java.time.temporal.Temporal G__56427 ^java.time.temporal.TemporalUnit G__56428] (.until ^java.time.Year G__56426 ^java.time.temporal.Temporal G__56427 ^java.time.temporal.TemporalUnit G__56428)))



(defn is-before ([^java.time.Year G__56429 ^java.time.Year G__56430] (.isBefore ^java.time.Year G__56429 ^java.time.Year G__56430)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Year G__56431 ^java.time.temporal.Temporal G__56432] (.adjustInto ^java.time.Year G__56431 ^java.time.temporal.Temporal G__56432)))


(defn minus ^java.time.temporal.Temporal ([^java.time.Year G__56433 G__56434 G__56435] (.minus ^java.time.Year G__56433 G__56434 G__56435)) ([^java.time.Year G__56436 G__56437] (.minus ^java.time.Year G__56436 G__56437)))



(defn is-after ([^java.time.Year G__56438 ^java.time.Year G__56439] (.isAfter ^java.time.Year G__56438 ^java.time.Year G__56439)))


(defn is-leap ([G__56441] (. java.time.Year isLeap G__56441)))


(defn to-string ^java.lang.String ([^java.time.Year G__56442] (.toString ^java.time.Year G__56442)))


(defn at-month-day ^java.time.LocalDate ([^java.time.Year G__56443 ^java.time.MonthDay G__56444] (.atMonthDay ^java.time.Year G__56443 ^java.time.MonthDay G__56444)))


(defn equals ([^java.time.Year G__56445 ^java.lang.Object G__56446] (.equals ^java.time.Year G__56445 ^java.lang.Object G__56446)))




(defn hash-code ([^java.time.Year G__56447] (.hashCode ^java.time.Year G__56447)))



(defn get-long ([^java.time.Year G__56448 ^java.time.temporal.TemporalField G__56449] (.getLong ^java.time.Year G__56448 ^java.time.temporal.TemporalField G__56449)))


(defn with ^java.time.temporal.Temporal ([^java.time.Year G__56450 G__56451 G__56452] (.with ^java.time.Year G__56450 G__56451 G__56452)) ([^java.time.Year G__56453 G__56454] (.with ^java.time.Year G__56453 G__56454)))


(defn from ^java.time.Year ([^java.time.temporal.TemporalAccessor G__56456] (. java.time.Year from ^java.time.temporal.TemporalAccessor G__56456)))


(defn parse ^java.time.Year ([^java.lang.CharSequence G__56458 ^java.time.format.DateTimeFormatter G__56459] (. java.time.Year parse ^java.lang.CharSequence G__56458 ^java.time.format.DateTimeFormatter G__56459)) ([^java.lang.CharSequence G__56461] (. java.time.Year parse ^java.lang.CharSequence G__56461)))


(defn plus ^java.time.Year ([^java.time.Year G__56462 G__56463 G__56464] (.plus ^java.time.Year G__56462 G__56463 G__56464)) ([^java.time.Year G__56465 G__56466] (.plus ^java.time.Year G__56465 G__56466)))


(defn at-month ^java.time.YearMonth ([^java.time.Year G__56467 G__56468] (.atMonth ^java.time.Year G__56467 G__56468)))


(defn length ([^java.time.Year G__56469] (.length ^java.time.Year G__56469)))


(defn is-valid-month-day ([^java.time.Year G__56470 ^java.time.MonthDay G__56471] (.isValidMonthDay ^java.time.Year G__56470 ^java.time.MonthDay G__56471)))


