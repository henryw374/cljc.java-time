(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [Year]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Year])))

(defn compare-to ([^java.time.Year G__35203 G__35204] (.compareTo ^java.time.Year G__35203 G__35204)))


(defn is-supported ([^java.time.Year G__35205 G__35206] (.isSupported ^java.time.Year G__35205 G__35206)))


(defn plus-years ^java.time.Year ([^java.time.Year G__35207 G__35208] (.plusYears ^java.time.Year G__35207 G__35208)))


(defn query ^java.lang.Object ([^java.time.Year G__35209 ^java.time.temporal.TemporalQuery G__35210] (.query ^java.time.Year G__35209 ^java.time.temporal.TemporalQuery G__35210)))


(defn of ^java.time.Year ([G__35212] (. java.time.Year of G__35212)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Year G__35213 ^java.time.temporal.TemporalField G__35214] (.range ^java.time.Year G__35213 ^java.time.temporal.TemporalField G__35214)))




(defn format ^java.lang.String ([^java.time.Year G__35215 ^java.time.format.DateTimeFormatter G__35216] (.format ^java.time.Year G__35215 ^java.time.format.DateTimeFormatter G__35216)))


(defn at-day ^java.time.LocalDate ([^java.time.Year G__35217 G__35218] (.atDay ^java.time.Year G__35217 G__35218)))


(defn get ([^java.time.Year G__35219 ^java.time.temporal.TemporalField G__35220] (.get ^java.time.Year G__35219 ^java.time.temporal.TemporalField G__35220)))


(defn now ^java.time.Year ([G__35222] (. java.time.Year now G__35222)) ([] (. java.time.Year now)))


(defn minus-years ^java.time.Year ([^java.time.Year G__35224 G__35225] (.minusYears ^java.time.Year G__35224 G__35225)))



(defn get-value ([^java.time.Year G__35226] (jti/getter value ^java.time.Year G__35226)))



(defn until ([^java.time.Year G__35227 ^java.time.temporal.Temporal G__35228 ^java.time.temporal.TemporalUnit G__35229] (.until ^java.time.Year G__35227 ^java.time.temporal.Temporal G__35228 ^java.time.temporal.TemporalUnit G__35229)))



(defn is-before ([^java.time.Year G__35230 ^java.time.Year G__35231] (.isBefore ^java.time.Year G__35230 ^java.time.Year G__35231)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Year G__35232 ^java.time.temporal.Temporal G__35233] (.adjustInto ^java.time.Year G__35232 ^java.time.temporal.Temporal G__35233)))


(defn minus ^java.time.temporal.Temporal ([^java.time.Year G__35234 G__35235 G__35236] (.minus ^java.time.Year G__35234 G__35235 G__35236)) ([^java.time.Year G__35237 G__35238] (.minus ^java.time.Year G__35237 G__35238)))



(defn is-after ([^java.time.Year G__35239 ^java.time.Year G__35240] (.isAfter ^java.time.Year G__35239 ^java.time.Year G__35240)))


(defn is-leap ([G__35242] (. java.time.Year isLeap G__35242)))


(defn to-string ^java.lang.String ([^java.time.Year G__35243] (.toString ^java.time.Year G__35243)))


(defn at-month-day ^java.time.LocalDate ([^java.time.Year G__35244 ^java.time.MonthDay G__35245] (.atMonthDay ^java.time.Year G__35244 ^java.time.MonthDay G__35245)))


(defn equals ([^java.time.Year G__35246 ^java.lang.Object G__35247] (.equals ^java.time.Year G__35246 ^java.lang.Object G__35247)))




(defn hash-code ([^java.time.Year G__35248] (.hashCode ^java.time.Year G__35248)))



(defn get-long ([^java.time.Year G__35249 ^java.time.temporal.TemporalField G__35250] (jti/getter long ^java.time.Year G__35249 ^java.time.temporal.TemporalField G__35250)))


(defn with ^java.time.temporal.Temporal ([^java.time.Year G__35251 G__35252 G__35253] (.with ^java.time.Year G__35251 G__35252 G__35253)) ([^java.time.Year G__35254 G__35255] (.with ^java.time.Year G__35254 G__35255)))


(defn from ^java.time.Year ([^java.time.temporal.TemporalAccessor G__35257] (. java.time.Year from ^java.time.temporal.TemporalAccessor G__35257)))


(defn parse ^java.time.Year ([^java.lang.CharSequence G__35259 ^java.time.format.DateTimeFormatter G__35260] (. java.time.Year parse ^java.lang.CharSequence G__35259 ^java.time.format.DateTimeFormatter G__35260)) ([^java.lang.CharSequence G__35262] (. java.time.Year parse ^java.lang.CharSequence G__35262)))


(defn plus ^java.time.Year ([^java.time.Year G__35263 G__35264 G__35265] (.plus ^java.time.Year G__35263 G__35264 G__35265)) ([^java.time.Year G__35266 G__35267] (.plus ^java.time.Year G__35266 G__35267)))


(defn at-month ^java.time.YearMonth ([^java.time.Year G__35268 G__35269] (.atMonth ^java.time.Year G__35268 G__35269)))


(defn length ([^java.time.Year G__35270] (.length ^java.time.Year G__35270)))


(defn is-valid-month-day ([^java.time.Year G__35271 ^java.time.MonthDay G__35272] (.isValidMonthDay ^java.time.Year G__35271 ^java.time.MonthDay G__35272)))


