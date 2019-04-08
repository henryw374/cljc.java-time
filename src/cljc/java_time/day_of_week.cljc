(ns cljc.java-time.day-of-week (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [DayOfWeek]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time DayOfWeek])))

(defn is-supported ([^java.time.DayOfWeek G__36437 ^java.time.temporal.TemporalField G__36438] (.isSupported ^java.time.DayOfWeek G__36437 ^java.time.temporal.TemporalField G__36438)))



(defn query ^java.lang.Object ([^java.time.DayOfWeek G__36439 ^java.time.temporal.TemporalQuery G__36440] (.query ^java.time.DayOfWeek G__36439 ^java.time.temporal.TemporalQuery G__36440)))


(defn get-display-name ^java.lang.String ([^java.time.DayOfWeek G__36441 ^java.time.format.TextStyle G__36442 ^java.util.Locale G__36443] (jti/getter displayName ^java.time.DayOfWeek G__36441 ^java.time.format.TextStyle G__36442 ^java.util.Locale G__36443)))


(defn of ^java.time.DayOfWeek ([G__36445] (. java.time.DayOfWeek of G__36445)))


(defn range ^java.time.temporal.ValueRange ([^java.time.DayOfWeek G__36446 ^java.time.temporal.TemporalField G__36447] (.range ^java.time.DayOfWeek G__36446 ^java.time.temporal.TemporalField G__36447)))





(defn get ([^java.time.DayOfWeek G__36448 ^java.time.temporal.TemporalField G__36449] (.get ^java.time.DayOfWeek G__36448 ^java.time.temporal.TemporalField G__36449)))


(defn get-value ([^java.time.DayOfWeek G__36450] (jti/getter value ^java.time.DayOfWeek G__36450)))




(defn adjust-into ^java.time.temporal.Temporal ([^java.time.DayOfWeek G__36451 ^java.time.temporal.Temporal G__36452] (.adjustInto ^java.time.DayOfWeek G__36451 ^java.time.temporal.Temporal G__36452)))


(defn minus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__36453 G__36454] (.minus ^java.time.DayOfWeek G__36453 G__36454)))



(defn value-of ^java.time.DayOfWeek ([^java.lang.String G__36456] (. java.time.DayOfWeek valueOf ^java.lang.String G__36456)))



(defn get-long ([^java.time.DayOfWeek G__36457 ^java.time.temporal.TemporalField G__36458] (jti/getter long ^java.time.DayOfWeek G__36457 ^java.time.temporal.TemporalField G__36458)))


(defn values ^java.time.DayOfWeek<> ([] (. java.time.DayOfWeek values)))


(defn from ^java.time.DayOfWeek ([^java.time.temporal.TemporalAccessor G__36461] (. java.time.DayOfWeek from ^java.time.temporal.TemporalAccessor G__36461)))



(defn plus ^java.time.DayOfWeek ([^java.time.DayOfWeek G__36462 G__36463] (.plus ^java.time.DayOfWeek G__36462 G__36463)))


