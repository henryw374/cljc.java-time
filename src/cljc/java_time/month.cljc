(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [Month]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Month])))

(defn is-supported ([^java.time.Month G__35078 ^java.time.temporal.TemporalField G__35079] (.isSupported ^java.time.Month G__35078 ^java.time.temporal.TemporalField G__35079)))



(defn query ^java.lang.Object ([^java.time.Month G__35080 ^java.time.temporal.TemporalQuery G__35081] (.query ^java.time.Month G__35080 ^java.time.temporal.TemporalQuery G__35081)))


(defn get-display-name ^java.lang.String ([^java.time.Month G__35082 ^java.time.format.TextStyle G__35083 ^java.util.Locale G__35084] (jti/getter displayName ^java.time.Month G__35082 ^java.time.format.TextStyle G__35083 ^java.util.Locale G__35084)))



(defn of ^java.time.Month ([G__35086] (. java.time.Month of G__35086)))




(defn range ^java.time.temporal.ValueRange ([^java.time.Month G__35087 ^java.time.temporal.TemporalField G__35088] (.range ^java.time.Month G__35087 ^java.time.temporal.TemporalField G__35088)))


(defn get ([^java.time.Month G__35089 ^java.time.temporal.TemporalField G__35090] (.get ^java.time.Month G__35089 ^java.time.temporal.TemporalField G__35090)))




(defn first-month-of-quarter ^java.time.Month ([^java.time.Month G__35091] (.firstMonthOfQuarter ^java.time.Month G__35091)))


(defn get-value ([^java.time.Month G__35092] (jti/getter value ^java.time.Month G__35092)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Month G__35093 ^java.time.temporal.Temporal G__35094] (.adjustInto ^java.time.Month G__35093 ^java.time.temporal.Temporal G__35094)))


(defn minus ^java.time.Month ([^java.time.Month G__35095 G__35096] (.minus ^java.time.Month G__35095 G__35096)))



(defn min-length ([^java.time.Month G__35097] (.minLength ^java.time.Month G__35097)))



(defn value-of ^java.time.Month ([^java.lang.String G__35099] (. java.time.Month valueOf ^java.lang.String G__35099)))





(defn get-long ([^java.time.Month G__35100 ^java.time.temporal.TemporalField G__35101] (jti/getter long ^java.time.Month G__35100 ^java.time.temporal.TemporalField G__35101)))


(defn values ^java.time.Month<> ([] (. java.time.Month values)))


(defn from ^java.time.Month ([^java.time.temporal.TemporalAccessor G__35104] (. java.time.Month from ^java.time.temporal.TemporalAccessor G__35104)))




(defn plus ^java.time.Month ([^java.time.Month G__35105 G__35106] (.plus ^java.time.Month G__35105 G__35106)))


(defn length ([^java.time.Month G__35107 G__35108] (.length ^java.time.Month G__35107 G__35108)))


(defn max-length ([^java.time.Month G__35109] (.maxLength ^java.time.Month G__35109)))


(defn first-day-of-year ([^java.time.Month G__35110 G__35111] (.firstDayOfYear ^java.time.Month G__35110 G__35111)))


