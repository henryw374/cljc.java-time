(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [Month]])) #? (:clj (:import [java.time Month])))

(defn is-supported ([^java.time.Month G__26834 ^java.time.temporal.TemporalField G__26835] (.isSupported ^java.time.Month G__26834 ^java.time.temporal.TemporalField G__26835)))



(defn query ^java.lang.Object ([^java.time.Month G__26836 ^java.time.temporal.TemporalQuery G__26837] (.query ^java.time.Month G__26836 ^java.time.temporal.TemporalQuery G__26837)))


(defn get-display-name ^java.lang.String ([^java.time.Month G__26838 ^java.time.format.TextStyle G__26839 ^java.util.Locale G__26840] (jti/getter displayName ^java.time.Month G__26838 ^java.time.format.TextStyle G__26839 ^java.util.Locale G__26840)))



(defn of ^java.time.Month ([G__26842] (. java.time.Month of G__26842)))




(defn range ^java.time.temporal.ValueRange ([^java.time.Month G__26843 ^java.time.temporal.TemporalField G__26844] (.range ^java.time.Month G__26843 ^java.time.temporal.TemporalField G__26844)))


(defn get ([^java.time.Month G__26845 ^java.time.temporal.TemporalField G__26846] (.get ^java.time.Month G__26845 ^java.time.temporal.TemporalField G__26846)))




(defn first-month-of-quarter ^java.time.Month ([^java.time.Month G__26847] (.firstMonthOfQuarter ^java.time.Month G__26847)))


(defn get-value ([^java.time.Month G__26848] (jti/getter value ^java.time.Month G__26848)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Month G__26849 ^java.time.temporal.Temporal G__26850] (.adjustInto ^java.time.Month G__26849 ^java.time.temporal.Temporal G__26850)))


(defn minus ^java.time.Month ([^java.time.Month G__26851 G__26852] (.minus ^java.time.Month G__26851 G__26852)))



(defn min-length ([^java.time.Month G__26853] (.minLength ^java.time.Month G__26853)))



(defn value-of ^java.time.Month ([^java.lang.String G__26855] (. java.time.Month valueOf ^java.lang.String G__26855)))





(defn get-long ([^java.time.Month G__26856 ^java.time.temporal.TemporalField G__26857] (jti/getter long ^java.time.Month G__26856 ^java.time.temporal.TemporalField G__26857)))


(defn values ^java.time.Month<> ([] (. java.time.Month values)))


(defn from ^java.time.Month ([^java.time.temporal.TemporalAccessor G__26860] (. java.time.Month from ^java.time.temporal.TemporalAccessor G__26860)))




(defn plus ^java.time.Month ([^java.time.Month G__26861 G__26862] (.plus ^java.time.Month G__26861 G__26862)))


(defn length ([^java.time.Month G__26863 G__26864] (.length ^java.time.Month G__26863 G__26864)))


(defn max-length ([^java.time.Month G__26865] (.maxLength ^java.time.Month G__26865)))


(defn first-day-of-year ([^java.time.Month G__26866 G__26867] (.firstDayOfYear ^java.time.Month G__26866 G__26867)))


