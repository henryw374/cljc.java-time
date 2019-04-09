(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [Temporal]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal Temporal])))

(defn until ([^java.time.temporal.Temporal G__47512 ^java.time.temporal.Temporal G__47513 ^java.time.temporal.TemporalUnit G__47514] (.until ^java.time.temporal.Temporal G__47512 ^java.time.temporal.Temporal G__47513 ^java.time.temporal.TemporalUnit G__47514)))


(defn minus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__47515 ^java.time.temporal.TemporalAmount G__47516] (.minus ^java.time.temporal.Temporal G__47515 ^java.time.temporal.TemporalAmount G__47516)) ([^java.time.temporal.Temporal G__47517 G__47518 ^java.time.temporal.TemporalUnit G__47519] (.minus ^java.time.temporal.Temporal G__47517 G__47518 ^java.time.temporal.TemporalUnit G__47519)))


(defn with ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__47520 ^java.time.temporal.TemporalField G__47521 G__47522] (.with ^java.time.temporal.Temporal G__47520 ^java.time.temporal.TemporalField G__47521 G__47522)) ([^java.time.temporal.Temporal G__47523 ^java.time.temporal.TemporalAdjuster G__47524] (.with ^java.time.temporal.Temporal G__47523 ^java.time.temporal.TemporalAdjuster G__47524)))


(defn is-supported ([^java.time.temporal.Temporal G__47525 ^java.time.temporal.TemporalUnit G__47526] (.isSupported ^java.time.temporal.Temporal G__47525 ^java.time.temporal.TemporalUnit G__47526)))


(defn plus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__47527 ^java.time.temporal.TemporalAmount G__47528] (.plus ^java.time.temporal.Temporal G__47527 ^java.time.temporal.TemporalAmount G__47528)) ([^java.time.temporal.Temporal G__47529 G__47530 ^java.time.temporal.TemporalUnit G__47531] (.plus ^java.time.temporal.Temporal G__47529 G__47530 ^java.time.temporal.TemporalUnit G__47531)))

