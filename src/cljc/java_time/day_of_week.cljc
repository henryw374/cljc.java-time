(ns cljc.java-time.day-of-week (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [DayOfWeek]])) #? (:clj (:import [java.time DayOfWeek])))

(defn is-supported ([^java.time.DayOfWeek G__26703 ^java.time.temporal.TemporalField G__26704] (.isSupported ^java.time.DayOfWeek G__26703 ^java.time.temporal.TemporalField G__26704)))



(defn query ^java.lang.Object ([^java.time.DayOfWeek G__26705 ^java.time.temporal.TemporalQuery G__26706] (.query ^java.time.DayOfWeek G__26705 ^java.time.temporal.TemporalQuery G__26706)))


(defn get-display-name ^java.lang.String ([^java.time.DayOfWeek G__26707 ^java.time.format.TextStyle G__26708 ^java.util.Locale G__26709] (jti/getter displayName ^java.time.DayOfWeek G__26707 ^java.time.format.TextStyle G__26708 ^java.util.Locale G__26709)))


(defn of ^java.time.DayOfWeek ([G__26711] (. java.time.DayOfWeek of G__26711)))


(defn range ^java.time.temporal.ValueRange ([^java.time.DayOfWeek G__26712 ^java.time.temporal.TemporalField G__26713] (.range ^java.time.DayOfWeek G__26712 ^java.time.temporal.TemporalField G__26713)))





(defn get ([^java.time.DayOfWeek G__26714 ^java.time.temporal.TemporalField G__26715] (.get ^java.time.DayOfWeek G__26714 ^java.time.temporal.TemporalField G__26715)))


(defn get-value ([^java.time.DayOfWeek G__26716] (jti/getter value ^java.time.DayOfWeek G__26716)))




(defn adjust-into ^java.time.temporal.Temporal ([^java.time.DayOfWeek G__26717 ^java.time.temporal.Temporal G__26718] (.adjustInto ^java.time.DayOfWeek G__26717 ^java.time.temporal.Temporal G__26718)))


(defn minus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__26719 G__26720] (.minus ^java.time.DayOfWeek G__26719 G__26720)))



(defn value-of ^java.time.DayOfWeek ([^java.lang.String G__26722] (. java.time.DayOfWeek valueOf ^java.lang.String G__26722)))



(defn get-long ([^java.time.DayOfWeek G__26723 ^java.time.temporal.TemporalField G__26724] (jti/getter long ^java.time.DayOfWeek G__26723 ^java.time.temporal.TemporalField G__26724)))


(defn values ^java.time.DayOfWeek<> ([] (. java.time.DayOfWeek values)))


(defn from ^java.time.DayOfWeek ([^java.time.temporal.TemporalAccessor G__26727] (. java.time.DayOfWeek from ^java.time.temporal.TemporalAccessor G__26727)))



(defn plus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__26728 G__26729] (.plus ^java.time.DayOfWeek G__26728 G__26729)))


