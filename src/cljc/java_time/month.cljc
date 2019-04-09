(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Month]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Month])))
(def may (. java.time.Month -MAY))
(def december (. java.time.Month -DECEMBER))
(def june (. java.time.Month -JUNE))
(def september (. java.time.Month -SEPTEMBER))
(def february (. java.time.Month -FEBRUARY))
(def january (. java.time.Month -JANUARY))
(def november (. java.time.Month -NOVEMBER))
(def august (. java.time.Month -AUGUST))
(def july (. java.time.Month -JULY))
(def march (. java.time.Month -MARCH))
(def october (. java.time.Month -OCTOBER))
(def april (. java.time.Month -APRIL))

(defn is-supported ([^java.time.Month G__47204 ^java.time.temporal.TemporalField G__47205] (.isSupported ^java.time.Month G__47204 ^java.time.temporal.TemporalField G__47205)))



(defn query ^java.lang.Object ([^java.time.Month G__47206 ^java.time.temporal.TemporalQuery G__47207] (.query ^java.time.Month G__47206 ^java.time.temporal.TemporalQuery G__47207)))


(defn get-display-name ^java.lang.String ([^java.time.Month G__47208 ^java.time.format.TextStyle G__47209 ^java.util.Locale G__47210] (jti/getter displayName ^java.time.Month G__47208 ^java.time.format.TextStyle G__47209 ^java.util.Locale G__47210)))



(defn of ^java.time.Month ([G__47212] (. java.time.Month of G__47212)))




(defn range ^java.time.temporal.ValueRange ([^java.time.Month G__47213 ^java.time.temporal.TemporalField G__47214] (.range ^java.time.Month G__47213 ^java.time.temporal.TemporalField G__47214)))


(defn get ([^java.time.Month G__47215 ^java.time.temporal.TemporalField G__47216] (.get ^java.time.Month G__47215 ^java.time.temporal.TemporalField G__47216)))




(defn first-month-of-quarter ^java.time.Month ([^java.time.Month G__47217] (.firstMonthOfQuarter ^java.time.Month G__47217)))


(defn get-value ([^java.time.Month G__47218] (jti/getter value ^java.time.Month G__47218)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Month G__47219 ^java.time.temporal.Temporal G__47220] (.adjustInto ^java.time.Month G__47219 ^java.time.temporal.Temporal G__47220)))


(defn minus ^java.time.Month ([^java.time.Month G__47221 G__47222] (.minus ^java.time.Month G__47221 G__47222)))



(defn min-length ([^java.time.Month G__47223] (.minLength ^java.time.Month G__47223)))



(defn value-of ^java.time.Month ([^java.lang.String G__47225] (. java.time.Month valueOf ^java.lang.String G__47225)))





(defn get-long ([^java.time.Month G__47226 ^java.time.temporal.TemporalField G__47227] (.getLong ^java.time.Month G__47226 ^java.time.temporal.TemporalField G__47227)))


(defn values ^java.time.Month ([] (. java.time.Month values)))


(defn from ^java.time.Month ([^java.time.temporal.TemporalAccessor G__47230] (. java.time.Month from ^java.time.temporal.TemporalAccessor G__47230)))




(defn plus ^java.time.Month ([^java.time.Month G__47231 G__47232] (.plus ^java.time.Month G__47231 G__47232)))


(defn length ([^java.time.Month G__47233 G__47234] (.length ^java.time.Month G__47233 G__47234)))


(defn max-length ([^java.time.Month G__47235] (.maxLength ^java.time.Month G__47235)))


(defn first-day-of-year ([^java.time.Month G__47236 G__47237] (.firstDayOfYear ^java.time.Month G__47236 G__47237)))


