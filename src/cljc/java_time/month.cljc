(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Month]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Month])))
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

(defn is-supported ([^java.time.Month G__56277 ^java.time.temporal.TemporalField G__56278] (.isSupported ^java.time.Month G__56277 ^java.time.temporal.TemporalField G__56278)))



(defn query ^java.lang.Object ([^java.time.Month G__56279 ^java.time.temporal.TemporalQuery G__56280] (.query ^java.time.Month G__56279 ^java.time.temporal.TemporalQuery G__56280)))


(defn get-display-name ^java.lang.String ([^java.time.Month G__56281 ^java.time.format.TextStyle G__56282 ^java.util.Locale G__56283] (jti/getter displayName ^java.time.Month G__56281 ^java.time.format.TextStyle G__56282 ^java.util.Locale G__56283)))



(defn of ^java.time.Month ([G__56285] (. java.time.Month of G__56285)))




(defn range ^java.time.temporal.ValueRange ([^java.time.Month G__56286 ^java.time.temporal.TemporalField G__56287] (.range ^java.time.Month G__56286 ^java.time.temporal.TemporalField G__56287)))


(defn get ([^java.time.Month G__56288 ^java.time.temporal.TemporalField G__56289] (.get ^java.time.Month G__56288 ^java.time.temporal.TemporalField G__56289)))




(defn first-month-of-quarter ^java.time.Month ([^java.time.Month G__56290] (.firstMonthOfQuarter ^java.time.Month G__56290)))


(defn get-value ([^java.time.Month G__56291] (jti/getter value ^java.time.Month G__56291)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Month G__56292 ^java.time.temporal.Temporal G__56293] (.adjustInto ^java.time.Month G__56292 ^java.time.temporal.Temporal G__56293)))


(defn minus ^java.time.Month ([^java.time.Month G__56294 G__56295] (.minus ^java.time.Month G__56294 G__56295)))



(defn min-length ([^java.time.Month G__56296] (.minLength ^java.time.Month G__56296)))



(defn value-of ^java.time.Month ([^java.lang.String G__56298] (. java.time.Month valueOf ^java.lang.String G__56298)))





(defn get-long ([^java.time.Month G__56299 ^java.time.temporal.TemporalField G__56300] (.getLong ^java.time.Month G__56299 ^java.time.temporal.TemporalField G__56300)))


(defn values ^java.time.Month ([] (. java.time.Month values)))


(defn from ^java.time.Month ([^java.time.temporal.TemporalAccessor G__56303] (. java.time.Month from ^java.time.temporal.TemporalAccessor G__56303)))




(defn plus ^java.time.Month ([^java.time.Month G__56304 G__56305] (.plus ^java.time.Month G__56304 G__56305)))


(defn length ([^java.time.Month G__56306 G__56307] (.length ^java.time.Month G__56306 G__56307)))


(defn max-length ([^java.time.Month G__56308] (.maxLength ^java.time.Month G__56308)))


(defn first-day-of-year ([^java.time.Month G__56309 G__56310] (.firstDayOfYear ^java.time.Month G__56309 G__56310)))


