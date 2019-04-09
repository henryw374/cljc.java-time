(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [YearMonth]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time YearMonth])))

(defn compare-to ([^java.time.YearMonth G__56472 G__56473] (.compareTo ^java.time.YearMonth G__56472 G__56473)))


(defn is-supported ([^java.time.YearMonth G__56474 G__56475] (.isSupported ^java.time.YearMonth G__56474 G__56475)))


(defn plus-years ^java.time.YearMonth ([^java.time.YearMonth G__56476 G__56477] (.plusYears ^java.time.YearMonth G__56476 G__56477)))


(defn query ^java.lang.Object ([^java.time.YearMonth G__56478 ^java.time.temporal.TemporalQuery G__56479] (.query ^java.time.YearMonth G__56478 ^java.time.temporal.TemporalQuery G__56479)))



(defn of ^java.time.YearMonth ([G__56481 G__56482] (. java.time.YearMonth of G__56481 G__56482)))


(defn range ^java.time.temporal.ValueRange ([^java.time.YearMonth G__56483 ^java.time.temporal.TemporalField G__56484] (.range ^java.time.YearMonth G__56483 ^java.time.temporal.TemporalField G__56484)))



(defn length-of-month ([^java.time.YearMonth G__56485] (.lengthOfMonth ^java.time.YearMonth G__56485)))


(defn format ^java.lang.String ([^java.time.YearMonth G__56486 ^java.time.format.DateTimeFormatter G__56487] (.format ^java.time.YearMonth G__56486 ^java.time.format.DateTimeFormatter G__56487)))


(defn minus-months ^java.time.YearMonth ([^java.time.YearMonth G__56488 G__56489] (.minusMonths ^java.time.YearMonth G__56488 G__56489)))


(defn at-day ^java.time.LocalDate ([^java.time.YearMonth G__56490 G__56491] (.atDay ^java.time.YearMonth G__56490 G__56491)))


(defn get ([^java.time.YearMonth G__56492 ^java.time.temporal.TemporalField G__56493] (.get ^java.time.YearMonth G__56492 ^java.time.temporal.TemporalField G__56493)))


(defn now ^java.time.YearMonth ([G__56495] (. java.time.YearMonth now G__56495)) ([] (. java.time.YearMonth now)))


(defn minus-years ^java.time.YearMonth ([^java.time.YearMonth G__56497 G__56498] (.minusYears ^java.time.YearMonth G__56497 G__56498)))



(defn get-month ^java.time.Month ([^java.time.YearMonth G__56499] (jti/getter month ^java.time.YearMonth G__56499)))


(defn at-end-of-month ^java.time.LocalDate ([^java.time.YearMonth G__56500] (.atEndOfMonth ^java.time.YearMonth G__56500)))



(defn until ([^java.time.YearMonth G__56501 ^java.time.temporal.Temporal G__56502 ^java.time.temporal.TemporalUnit G__56503] (.until ^java.time.YearMonth G__56501 ^java.time.temporal.Temporal G__56502 ^java.time.temporal.TemporalUnit G__56503)))




(defn is-before ([^java.time.YearMonth G__56504 ^java.time.YearMonth G__56505] (.isBefore ^java.time.YearMonth G__56504 ^java.time.YearMonth G__56505)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.YearMonth G__56506 ^java.time.temporal.Temporal G__56507] (.adjustInto ^java.time.YearMonth G__56506 ^java.time.temporal.Temporal G__56507)))


(defn minus ^java.time.YearMonth ([^java.time.YearMonth G__56508 G__56509] (.minus ^java.time.YearMonth G__56508 G__56509)) ([^java.time.YearMonth G__56510 G__56511 G__56512] (.minus ^java.time.YearMonth G__56510 G__56511 G__56512)))


(defn get-year ([^java.time.YearMonth G__56513] (jti/getter year ^java.time.YearMonth G__56513)))


(defn is-after ([^java.time.YearMonth G__56514 ^java.time.YearMonth G__56515] (.isAfter ^java.time.YearMonth G__56514 ^java.time.YearMonth G__56515)))


(defn to-string ^java.lang.String ([^java.time.YearMonth G__56516] (.toString ^java.time.YearMonth G__56516)))


(defn plus-months ^java.time.YearMonth ([^java.time.YearMonth G__56517 G__56518] (.plusMonths ^java.time.YearMonth G__56517 G__56518)))


(defn is-valid-day ([^java.time.YearMonth G__56519 G__56520] (.isValidDay ^java.time.YearMonth G__56519 G__56520)))


(defn equals ([^java.time.YearMonth G__56521 ^java.lang.Object G__56522] (.equals ^java.time.YearMonth G__56521 ^java.lang.Object G__56522)))


(defn get-month-value ([^java.time.YearMonth G__56523] (jti/getter monthValue ^java.time.YearMonth G__56523)))


(defn length-of-year ([^java.time.YearMonth G__56524] (.lengthOfYear ^java.time.YearMonth G__56524)))




(defn hash-code ([^java.time.YearMonth G__56525] (.hashCode ^java.time.YearMonth G__56525)))



(defn get-long ([^java.time.YearMonth G__56526 ^java.time.temporal.TemporalField G__56527] (.getLong ^java.time.YearMonth G__56526 ^java.time.temporal.TemporalField G__56527)))


(defn is-leap-year ([^java.time.YearMonth G__56528] (.isLeapYear ^java.time.YearMonth G__56528)))


(defn with ^java.time.temporal.Temporal ([^java.time.YearMonth G__56529 G__56530 G__56531] (.with ^java.time.YearMonth G__56529 G__56530 G__56531)) ([^java.time.YearMonth G__56532 G__56533] (.with ^java.time.YearMonth G__56532 G__56533)))


(defn from ^java.time.YearMonth ([^java.time.temporal.TemporalAccessor G__56535] (. java.time.YearMonth from ^java.time.temporal.TemporalAccessor G__56535)))


(defn parse ^java.time.YearMonth ([^java.lang.CharSequence G__56537] (. java.time.YearMonth parse ^java.lang.CharSequence G__56537)) ([^java.lang.CharSequence G__56539 ^java.time.format.DateTimeFormatter G__56540] (. java.time.YearMonth parse ^java.lang.CharSequence G__56539 ^java.time.format.DateTimeFormatter G__56540)))


(defn plus ^java.time.YearMonth ([^java.time.YearMonth G__56541 G__56542] (.plus ^java.time.YearMonth G__56541 G__56542)) ([^java.time.YearMonth G__56543 G__56544 G__56545] (.plus ^java.time.YearMonth G__56543 G__56544 G__56545)))


(defn with-year ^java.time.YearMonth ([^java.time.YearMonth G__56546 G__56547] (.withYear ^java.time.YearMonth G__56546 G__56547)))



(defn with-month ^java.time.YearMonth ([^java.time.YearMonth G__56548 G__56549] (.withMonth ^java.time.YearMonth G__56548 G__56549)))

