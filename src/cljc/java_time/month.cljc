(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Month]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Month])))

(defn is-supported ([^java.time.Month G__36568 ^java.time.temporal.TemporalField G__36569] (.isSupported ^java.time.Month G__36568 ^java.time.temporal.TemporalField G__36569)))



(defn query ^java.lang.Object ([^java.time.Month G__36570 ^java.time.temporal.TemporalQuery G__36571] (.query ^java.time.Month G__36570 ^java.time.temporal.TemporalQuery G__36571)))


(defn get-display-name ^java.lang.String ([^java.time.Month G__36572 ^java.time.format.TextStyle G__36573 ^java.util.Locale G__36574] (jti/getter displayName ^java.time.Month G__36572 ^java.time.format.TextStyle G__36573 ^java.util.Locale G__36574)))



(defn of ^java.time.Month ([G__36576] (. java.time.Month of G__36576)))




(defn range ^java.time.temporal.ValueRange ([^java.time.Month G__36577 ^java.time.temporal.TemporalField G__36578] (.range ^java.time.Month G__36577 ^java.time.temporal.TemporalField G__36578)))


(defn get ([^java.time.Month G__36579 ^java.time.temporal.TemporalField G__36580] (.get ^java.time.Month G__36579 ^java.time.temporal.TemporalField G__36580)))




(defn first-month-of-quarter ^java.time.Month ([^java.time.Month G__36581] (.firstMonthOfQuarter ^java.time.Month G__36581)))


(defn get-value ([^java.time.Month G__36582] (jti/getter value ^java.time.Month G__36582)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Month G__36583 ^java.time.temporal.Temporal G__36584] (.adjustInto ^java.time.Month G__36583 ^java.time.temporal.Temporal G__36584)))


(defn minus ^java.time.Month ([^java.time.Month G__36585 G__36586] (.minus ^java.time.Month G__36585 G__36586)))



(defn min-length ([^java.time.Month G__36587] (.minLength ^java.time.Month G__36587)))



(defn value-of ^java.time.Month ([^java.lang.String G__36589] (. java.time.Month valueOf ^java.lang.String G__36589)))





(defn get-long ([^java.time.Month G__36590 ^java.time.temporal.TemporalField G__36591] (jti/getter long ^java.time.Month G__36590 ^java.time.temporal.TemporalField G__36591)))


(defn values ^java.time.Month<> ([] (. java.time.Month values)))


(defn from ^java.time.Month ([^java.time.temporal.TemporalAccessor G__36594] (. java.time.Month from ^java.time.temporal.TemporalAccessor G__36594)))




(defn plus ^java.time.Month ([^java.time.Month G__36595 G__36596] (.plus ^java.time.Month G__36595 G__36596)))


(defn length ([^java.time.Month G__36597 G__36598] (.length ^java.time.Month G__36597 G__36598)))


(defn max-length ([^java.time.Month G__36599] (.maxLength ^java.time.Month G__36599)))


(defn first-day-of-year ([^java.time.Month G__36600 G__36601] (.firstDayOfYear ^java.time.Month G__36600 G__36601)))


