(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Year]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Year])))
(def min-value (. java.time.Year -MIN_VALUE))
(def max-value (. java.time.Year -MAX_VALUE))

(defn compare-to ([^java.time.Year G__47329 G__47330] (.compareTo ^java.time.Year G__47329 G__47330)))


(defn is-supported ([^java.time.Year G__47331 G__47332] (.isSupported ^java.time.Year G__47331 G__47332)))


(defn plus-years ^java.time.Year ([^java.time.Year G__47333 G__47334] (.plusYears ^java.time.Year G__47333 G__47334)))


(defn query ^java.lang.Object ([^java.time.Year G__47335 ^java.time.temporal.TemporalQuery G__47336] (.query ^java.time.Year G__47335 ^java.time.temporal.TemporalQuery G__47336)))


(defn of ^java.time.Year ([G__47338] (. java.time.Year of G__47338)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Year G__47339 ^java.time.temporal.TemporalField G__47340] (.range ^java.time.Year G__47339 ^java.time.temporal.TemporalField G__47340)))




(defn format ^java.lang.String ([^java.time.Year G__47341 ^java.time.format.DateTimeFormatter G__47342] (.format ^java.time.Year G__47341 ^java.time.format.DateTimeFormatter G__47342)))


(defn at-day ^java.time.LocalDate ([^java.time.Year G__47343 G__47344] (.atDay ^java.time.Year G__47343 G__47344)))


(defn get ([^java.time.Year G__47345 ^java.time.temporal.TemporalField G__47346] (.get ^java.time.Year G__47345 ^java.time.temporal.TemporalField G__47346)))


(defn now ^java.time.Year ([G__47348] (. java.time.Year now G__47348)) ([] (. java.time.Year now)))


(defn minus-years ^java.time.Year ([^java.time.Year G__47350 G__47351] (.minusYears ^java.time.Year G__47350 G__47351)))



(defn get-value ([^java.time.Year G__47352] (jti/getter value ^java.time.Year G__47352)))



(defn until ([^java.time.Year G__47353 ^java.time.temporal.Temporal G__47354 ^java.time.temporal.TemporalUnit G__47355] (.until ^java.time.Year G__47353 ^java.time.temporal.Temporal G__47354 ^java.time.temporal.TemporalUnit G__47355)))



(defn is-before ([^java.time.Year G__47356 ^java.time.Year G__47357] (.isBefore ^java.time.Year G__47356 ^java.time.Year G__47357)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Year G__47358 ^java.time.temporal.Temporal G__47359] (.adjustInto ^java.time.Year G__47358 ^java.time.temporal.Temporal G__47359)))


(defn minus ^java.time.temporal.Temporal ([^java.time.Year G__47360 G__47361 G__47362] (.minus ^java.time.Year G__47360 G__47361 G__47362)) ([^java.time.Year G__47363 G__47364] (.minus ^java.time.Year G__47363 G__47364)))



(defn is-after ([^java.time.Year G__47365 ^java.time.Year G__47366] (.isAfter ^java.time.Year G__47365 ^java.time.Year G__47366)))


(defn is-leap ([G__47368] (. java.time.Year isLeap G__47368)))


(defn to-string ^java.lang.String ([^java.time.Year G__47369] (.toString ^java.time.Year G__47369)))


(defn at-month-day ^java.time.LocalDate ([^java.time.Year G__47370 ^java.time.MonthDay G__47371] (.atMonthDay ^java.time.Year G__47370 ^java.time.MonthDay G__47371)))


(defn equals ([^java.time.Year G__47372 ^java.lang.Object G__47373] (.equals ^java.time.Year G__47372 ^java.lang.Object G__47373)))




(defn hash-code ([^java.time.Year G__47374] (.hashCode ^java.time.Year G__47374)))



(defn get-long ([^java.time.Year G__47375 ^java.time.temporal.TemporalField G__47376] (.getLong ^java.time.Year G__47375 ^java.time.temporal.TemporalField G__47376)))


(defn with ^java.time.temporal.Temporal ([^java.time.Year G__47377 G__47378 G__47379] (.with ^java.time.Year G__47377 G__47378 G__47379)) ([^java.time.Year G__47380 G__47381] (.with ^java.time.Year G__47380 G__47381)))


(defn from ^java.time.Year ([^java.time.temporal.TemporalAccessor G__47383] (. java.time.Year from ^java.time.temporal.TemporalAccessor G__47383)))


(defn parse ^java.time.Year ([^java.lang.CharSequence G__47385 ^java.time.format.DateTimeFormatter G__47386] (. java.time.Year parse ^java.lang.CharSequence G__47385 ^java.time.format.DateTimeFormatter G__47386)) ([^java.lang.CharSequence G__47388] (. java.time.Year parse ^java.lang.CharSequence G__47388)))


(defn plus ^java.time.Year ([^java.time.Year G__47389 G__47390 G__47391] (.plus ^java.time.Year G__47389 G__47390 G__47391)) ([^java.time.Year G__47392 G__47393] (.plus ^java.time.Year G__47392 G__47393)))


(defn at-month ^java.time.YearMonth ([^java.time.Year G__47394 G__47395] (.atMonth ^java.time.Year G__47394 G__47395)))


(defn length ([^java.time.Year G__47396] (.length ^java.time.Year G__47396)))


(defn is-valid-month-day ([^java.time.Year G__47397 ^java.time.MonthDay G__47398] (.isValidMonthDay ^java.time.Year G__47397 ^java.time.MonthDay G__47398)))


