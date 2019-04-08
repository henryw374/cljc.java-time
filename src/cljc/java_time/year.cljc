(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Year]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Year])))

(defn compare-to ([^java.time.Year G__36693 G__36694] (.compareTo ^java.time.Year G__36693 G__36694)))


(defn is-supported ([^java.time.Year G__36695 G__36696] (.isSupported ^java.time.Year G__36695 G__36696)))


(defn plus-years ^java.time.Year ([^java.time.Year G__36697 G__36698] (.plusYears ^java.time.Year G__36697 G__36698)))


(defn query ^java.lang.Object ([^java.time.Year G__36699 ^java.time.temporal.TemporalQuery G__36700] (.query ^java.time.Year G__36699 ^java.time.temporal.TemporalQuery G__36700)))


(defn of ^java.time.Year ([G__36702] (. java.time.Year of G__36702)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Year G__36703 ^java.time.temporal.TemporalField G__36704] (.range ^java.time.Year G__36703 ^java.time.temporal.TemporalField G__36704)))




(defn format ^java.lang.String ([^java.time.Year G__36705 ^java.time.format.DateTimeFormatter G__36706] (.format ^java.time.Year G__36705 ^java.time.format.DateTimeFormatter G__36706)))


(defn at-day ^java.time.LocalDate ([^java.time.Year G__36707 G__36708] (.atDay ^java.time.Year G__36707 G__36708)))


(defn get ([^java.time.Year G__36709 ^java.time.temporal.TemporalField G__36710] (.get ^java.time.Year G__36709 ^java.time.temporal.TemporalField G__36710)))


(defn now ^java.time.Year ([G__36712] (. java.time.Year now G__36712)) ([] (. java.time.Year now)))


(defn minus-years ^java.time.Year ([^java.time.Year G__36714 G__36715] (.minusYears ^java.time.Year G__36714 G__36715)))



(defn get-value ([^java.time.Year G__36716] (jti/getter value ^java.time.Year G__36716)))



(defn until ([^java.time.Year G__36717 ^java.time.temporal.Temporal G__36718 ^java.time.temporal.TemporalUnit G__36719] (.until ^java.time.Year G__36717 ^java.time.temporal.Temporal G__36718 ^java.time.temporal.TemporalUnit G__36719)))



(defn is-before ([^java.time.Year G__36720 ^java.time.Year G__36721] (.isBefore ^java.time.Year G__36720 ^java.time.Year G__36721)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Year G__36722 ^java.time.temporal.Temporal G__36723] (.adjustInto ^java.time.Year G__36722 ^java.time.temporal.Temporal G__36723)))


(defn minus ^java.time.temporal.Temporal ([^java.time.Year G__36724 G__36725 G__36726] (.minus ^java.time.Year G__36724 G__36725 G__36726)) ([^java.time.Year G__36727 G__36728] (.minus ^java.time.Year G__36727 G__36728)))



(defn is-after ([^java.time.Year G__36729 ^java.time.Year G__36730] (.isAfter ^java.time.Year G__36729 ^java.time.Year G__36730)))


(defn is-leap ([G__36732] (. java.time.Year isLeap G__36732)))


(defn to-string ^java.lang.String ([^java.time.Year G__36733] (.toString ^java.time.Year G__36733)))


(defn at-month-day ^java.time.LocalDate ([^java.time.Year G__36734 ^java.time.MonthDay G__36735] (.atMonthDay ^java.time.Year G__36734 ^java.time.MonthDay G__36735)))


(defn equals ([^java.time.Year G__36736 ^java.lang.Object G__36737] (.equals ^java.time.Year G__36736 ^java.lang.Object G__36737)))




(defn hash-code ([^java.time.Year G__36738] (.hashCode ^java.time.Year G__36738)))



(defn get-long ([^java.time.Year G__36739 ^java.time.temporal.TemporalField G__36740] (jti/getter long ^java.time.Year G__36739 ^java.time.temporal.TemporalField G__36740)))


(defn with ^java.time.temporal.Temporal ([^java.time.Year G__36741 G__36742 G__36743] (.with ^java.time.Year G__36741 G__36742 G__36743)) ([^java.time.Year G__36744 G__36745] (.with ^java.time.Year G__36744 G__36745)))


(defn from ^java.time.Year ([^java.time.temporal.TemporalAccessor G__36747] (. java.time.Year from ^java.time.temporal.TemporalAccessor G__36747)))


(defn parse ^java.time.Year ([^java.lang.CharSequence G__36749 ^java.time.format.DateTimeFormatter G__36750] (. java.time.Year parse ^java.lang.CharSequence G__36749 ^java.time.format.DateTimeFormatter G__36750)) ([^java.lang.CharSequence G__36752] (. java.time.Year parse ^java.lang.CharSequence G__36752)))


(defn plus ^java.time.Year ([^java.time.Year G__36753 G__36754 G__36755] (.plus ^java.time.Year G__36753 G__36754 G__36755)) ([^java.time.Year G__36756 G__36757] (.plus ^java.time.Year G__36756 G__36757)))


(defn at-month ^java.time.YearMonth ([^java.time.Year G__36758 G__36759] (.atMonth ^java.time.Year G__36758 G__36759)))


(defn length ([^java.time.Year G__36760] (.length ^java.time.Year G__36760)))


(defn is-valid-month-day ([^java.time.Year G__36761 ^java.time.MonthDay G__36762] (.isValidMonthDay ^java.time.Year G__36761 ^java.time.MonthDay G__36762)))


