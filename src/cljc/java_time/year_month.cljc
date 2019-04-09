(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [YearMonth]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time YearMonth])))

(defn compare-to ([^java.time.YearMonth G__47399 G__47400] (.compareTo ^java.time.YearMonth G__47399 G__47400)))


(defn is-supported ([^java.time.YearMonth G__47401 G__47402] (.isSupported ^java.time.YearMonth G__47401 G__47402)))


(defn plus-years ^java.time.YearMonth ([^java.time.YearMonth G__47403 G__47404] (.plusYears ^java.time.YearMonth G__47403 G__47404)))


(defn query ^java.lang.Object ([^java.time.YearMonth G__47405 ^java.time.temporal.TemporalQuery G__47406] (.query ^java.time.YearMonth G__47405 ^java.time.temporal.TemporalQuery G__47406)))



(defn of ^java.time.YearMonth ([G__47408 G__47409] (. java.time.YearMonth of G__47408 G__47409)))


(defn range ^java.time.temporal.ValueRange ([^java.time.YearMonth G__47410 ^java.time.temporal.TemporalField G__47411] (.range ^java.time.YearMonth G__47410 ^java.time.temporal.TemporalField G__47411)))



(defn length-of-month ([^java.time.YearMonth G__47412] (.lengthOfMonth ^java.time.YearMonth G__47412)))


(defn format ^java.lang.String ([^java.time.YearMonth G__47413 ^java.time.format.DateTimeFormatter G__47414] (.format ^java.time.YearMonth G__47413 ^java.time.format.DateTimeFormatter G__47414)))


(defn minus-months ^java.time.YearMonth ([^java.time.YearMonth G__47415 G__47416] (.minusMonths ^java.time.YearMonth G__47415 G__47416)))


(defn at-day ^java.time.LocalDate ([^java.time.YearMonth G__47417 G__47418] (.atDay ^java.time.YearMonth G__47417 G__47418)))


(defn get ([^java.time.YearMonth G__47419 ^java.time.temporal.TemporalField G__47420] (.get ^java.time.YearMonth G__47419 ^java.time.temporal.TemporalField G__47420)))


(defn now ^java.time.YearMonth ([G__47422] (. java.time.YearMonth now G__47422)) ([] (. java.time.YearMonth now)))


(defn minus-years ^java.time.YearMonth ([^java.time.YearMonth G__47424 G__47425] (.minusYears ^java.time.YearMonth G__47424 G__47425)))



(defn get-month ^java.time.Month ([^java.time.YearMonth G__47426] (jti/getter month ^java.time.YearMonth G__47426)))


(defn at-end-of-month ^java.time.LocalDate ([^java.time.YearMonth G__47427] (.atEndOfMonth ^java.time.YearMonth G__47427)))



(defn until ([^java.time.YearMonth G__47428 ^java.time.temporal.Temporal G__47429 ^java.time.temporal.TemporalUnit G__47430] (.until ^java.time.YearMonth G__47428 ^java.time.temporal.Temporal G__47429 ^java.time.temporal.TemporalUnit G__47430)))




(defn is-before ([^java.time.YearMonth G__47431 ^java.time.YearMonth G__47432] (.isBefore ^java.time.YearMonth G__47431 ^java.time.YearMonth G__47432)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.YearMonth G__47433 ^java.time.temporal.Temporal G__47434] (.adjustInto ^java.time.YearMonth G__47433 ^java.time.temporal.Temporal G__47434)))


(defn minus ^java.time.YearMonth ([^java.time.YearMonth G__47435 G__47436] (.minus ^java.time.YearMonth G__47435 G__47436)) ([^java.time.YearMonth G__47437 G__47438 G__47439] (.minus ^java.time.YearMonth G__47437 G__47438 G__47439)))


(defn get-year ([^java.time.YearMonth G__47440] (jti/getter year ^java.time.YearMonth G__47440)))


(defn is-after ([^java.time.YearMonth G__47441 ^java.time.YearMonth G__47442] (.isAfter ^java.time.YearMonth G__47441 ^java.time.YearMonth G__47442)))


(defn to-string ^java.lang.String ([^java.time.YearMonth G__47443] (.toString ^java.time.YearMonth G__47443)))


(defn plus-months ^java.time.YearMonth ([^java.time.YearMonth G__47444 G__47445] (.plusMonths ^java.time.YearMonth G__47444 G__47445)))


(defn is-valid-day ([^java.time.YearMonth G__47446 G__47447] (.isValidDay ^java.time.YearMonth G__47446 G__47447)))


(defn equals ([^java.time.YearMonth G__47448 ^java.lang.Object G__47449] (.equals ^java.time.YearMonth G__47448 ^java.lang.Object G__47449)))


(defn get-month-value ([^java.time.YearMonth G__47450] (jti/getter monthValue ^java.time.YearMonth G__47450)))


(defn length-of-year ([^java.time.YearMonth G__47451] (.lengthOfYear ^java.time.YearMonth G__47451)))




(defn hash-code ([^java.time.YearMonth G__47452] (.hashCode ^java.time.YearMonth G__47452)))



(defn get-long ([^java.time.YearMonth G__47453 ^java.time.temporal.TemporalField G__47454] (.getLong ^java.time.YearMonth G__47453 ^java.time.temporal.TemporalField G__47454)))


(defn is-leap-year ([^java.time.YearMonth G__47455] (.isLeapYear ^java.time.YearMonth G__47455)))


(defn with ^java.time.temporal.Temporal ([^java.time.YearMonth G__47456 G__47457 G__47458] (.with ^java.time.YearMonth G__47456 G__47457 G__47458)) ([^java.time.YearMonth G__47459 G__47460] (.with ^java.time.YearMonth G__47459 G__47460)))


(defn from ^java.time.YearMonth ([^java.time.temporal.TemporalAccessor G__47462] (. java.time.YearMonth from ^java.time.temporal.TemporalAccessor G__47462)))


(defn parse ^java.time.YearMonth ([^java.lang.CharSequence G__47464] (. java.time.YearMonth parse ^java.lang.CharSequence G__47464)) ([^java.lang.CharSequence G__47466 ^java.time.format.DateTimeFormatter G__47467] (. java.time.YearMonth parse ^java.lang.CharSequence G__47466 ^java.time.format.DateTimeFormatter G__47467)))


(defn plus ^java.time.YearMonth ([^java.time.YearMonth G__47468 G__47469] (.plus ^java.time.YearMonth G__47468 G__47469)) ([^java.time.YearMonth G__47470 G__47471 G__47472] (.plus ^java.time.YearMonth G__47470 G__47471 G__47472)))


(defn with-year ^java.time.YearMonth ([^java.time.YearMonth G__47473 G__47474] (.withYear ^java.time.YearMonth G__47473 G__47474)))



(defn with-month ^java.time.YearMonth ([^java.time.YearMonth G__47475 G__47476] (.withMonth ^java.time.YearMonth G__47475 G__47476)))

