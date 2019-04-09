(ns cljc.java-time.day-of-week (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [DayOfWeek]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time DayOfWeek])))
(def saturday (. java.time.DayOfWeek -SATURDAY))
(def thursday (. java.time.DayOfWeek -THURSDAY))
(def friday (. java.time.DayOfWeek -FRIDAY))
(def wednesday (. java.time.DayOfWeek -WEDNESDAY))
(def sunday (. java.time.DayOfWeek -SUNDAY))
(def monday (. java.time.DayOfWeek -MONDAY))
(def tuesday (. java.time.DayOfWeek -TUESDAY))

(defn is-supported ([^java.time.DayOfWeek G__47073 ^java.time.temporal.TemporalField G__47074] (.isSupported ^java.time.DayOfWeek G__47073 ^java.time.temporal.TemporalField G__47074)))



(defn query ^java.lang.Object ([^java.time.DayOfWeek G__47075 ^java.time.temporal.TemporalQuery G__47076] (.query ^java.time.DayOfWeek G__47075 ^java.time.temporal.TemporalQuery G__47076)))


(defn get-display-name ^java.lang.String ([^java.time.DayOfWeek G__47077 ^java.time.format.TextStyle G__47078 ^java.util.Locale G__47079] (jti/getter displayName ^java.time.DayOfWeek G__47077 ^java.time.format.TextStyle G__47078 ^java.util.Locale G__47079)))


(defn of ^java.time.DayOfWeek ([G__47081] (. java.time.DayOfWeek of G__47081)))


(defn range ^java.time.temporal.ValueRange ([^java.time.DayOfWeek G__47082 ^java.time.temporal.TemporalField G__47083] (.range ^java.time.DayOfWeek G__47082 ^java.time.temporal.TemporalField G__47083)))





(defn get ([^java.time.DayOfWeek G__47084 ^java.time.temporal.TemporalField G__47085] (.get ^java.time.DayOfWeek G__47084 ^java.time.temporal.TemporalField G__47085)))


(defn get-value ([^java.time.DayOfWeek G__47086] (jti/getter value ^java.time.DayOfWeek G__47086)))




(defn adjust-into ^java.time.temporal.Temporal ([^java.time.DayOfWeek G__47087 ^java.time.temporal.Temporal G__47088] (.adjustInto ^java.time.DayOfWeek G__47087 ^java.time.temporal.Temporal G__47088)))


(defn minus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__47089 G__47090] (.minus ^java.time.DayOfWeek G__47089 G__47090)))



(defn value-of ^java.time.DayOfWeek ([^java.lang.String G__47092] (. java.time.DayOfWeek valueOf ^java.lang.String G__47092)))



(defn get-long ([^java.time.DayOfWeek G__47093 ^java.time.temporal.TemporalField G__47094] (.getLong ^java.time.DayOfWeek G__47093 ^java.time.temporal.TemporalField G__47094)))


(defn values ^java.time.DayOfWeek ([] (. java.time.DayOfWeek values)))


(defn from ^java.time.DayOfWeek ([^java.time.temporal.TemporalAccessor G__47097] (. java.time.DayOfWeek from ^java.time.temporal.TemporalAccessor G__47097)))



(defn plus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__47098 G__47099] (.plus ^java.time.DayOfWeek G__47098 G__47099)))


