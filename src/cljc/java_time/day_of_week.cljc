(ns cljc.java-time.day-of-week (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [DayOfWeek]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time DayOfWeek])))

(defn is-supported ([^java.time.DayOfWeek G__34947 ^java.time.temporal.TemporalField G__34948] (.isSupported ^java.time.DayOfWeek G__34947 ^java.time.temporal.TemporalField G__34948)))



(defn query ^java.lang.Object ([^java.time.DayOfWeek G__34949 ^java.time.temporal.TemporalQuery G__34950] (.query ^java.time.DayOfWeek G__34949 ^java.time.temporal.TemporalQuery G__34950)))


(defn get-display-name ^java.lang.String ([^java.time.DayOfWeek G__34951 ^java.time.format.TextStyle G__34952 ^java.util.Locale G__34953] (jti/getter displayName ^java.time.DayOfWeek G__34951 ^java.time.format.TextStyle G__34952 ^java.util.Locale G__34953)))


(defn of ^java.time.DayOfWeek ([G__34955] (. java.time.DayOfWeek of G__34955)))


(defn range ^java.time.temporal.ValueRange ([^java.time.DayOfWeek G__34956 ^java.time.temporal.TemporalField G__34957] (.range ^java.time.DayOfWeek G__34956 ^java.time.temporal.TemporalField G__34957)))





(defn get ([^java.time.DayOfWeek G__34958 ^java.time.temporal.TemporalField G__34959] (.get ^java.time.DayOfWeek G__34958 ^java.time.temporal.TemporalField G__34959)))


(defn get-value ([^java.time.DayOfWeek G__34960] (jti/getter value ^java.time.DayOfWeek G__34960)))




(defn adjust-into ^java.time.temporal.Temporal ([^java.time.DayOfWeek G__34961 ^java.time.temporal.Temporal G__34962] (.adjustInto ^java.time.DayOfWeek G__34961 ^java.time.temporal.Temporal G__34962)))


(defn minus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__34963 G__34964] (.minus ^java.time.DayOfWeek G__34963 G__34964)))



(defn value-of ^java.time.DayOfWeek ([^java.lang.String G__34966] (. java.time.DayOfWeek valueOf ^java.lang.String G__34966)))



(defn get-long ([^java.time.DayOfWeek G__34967 ^java.time.temporal.TemporalField G__34968] (jti/getter long ^java.time.DayOfWeek G__34967 ^java.time.temporal.TemporalField G__34968)))


(defn values ^java.time.DayOfWeek<> ([] (. java.time.DayOfWeek values)))


(defn from ^java.time.DayOfWeek ([^java.time.temporal.TemporalAccessor G__34971] (. java.time.DayOfWeek from ^java.time.temporal.TemporalAccessor G__34971)))



(defn plus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__34972 G__34973] (.plus ^java.time.DayOfWeek G__34972 G__34973)))


