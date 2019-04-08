(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.temporal :refer [Temporal]])) #? (:clj (:import [java.time.temporal Temporal])))

(defn until ([^java.time.temporal.Temporal G__27142 ^java.time.temporal.Temporal G__27143 ^java.time.temporal.TemporalUnit G__27144] (.until ^java.time.temporal.Temporal G__27142 ^java.time.temporal.Temporal G__27143 ^java.time.temporal.TemporalUnit G__27144)))


(defn minus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__27145 ^java.time.temporal.TemporalAmount G__27146] (.minus ^java.time.temporal.Temporal G__27145 ^java.time.temporal.TemporalAmount G__27146)) ([^java.time.temporal.Temporal G__27147 G__27148 ^java.time.temporal.TemporalUnit G__27149] (.minus ^java.time.temporal.Temporal G__27147 G__27148 ^java.time.temporal.TemporalUnit G__27149)))


(defn with ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__27150 ^java.time.temporal.TemporalField G__27151 G__27152] (.with ^java.time.temporal.Temporal G__27150 ^java.time.temporal.TemporalField G__27151 G__27152)) ([^java.time.temporal.Temporal G__27153 ^java.time.temporal.TemporalAdjuster G__27154] (.with ^java.time.temporal.Temporal G__27153 ^java.time.temporal.TemporalAdjuster G__27154)))


(defn is-supported ([^java.time.temporal.Temporal G__27155 ^java.time.temporal.TemporalUnit G__27156] (.isSupported ^java.time.temporal.Temporal G__27155 ^java.time.temporal.TemporalUnit G__27156)))


(defn plus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__27157 ^java.time.temporal.TemporalAmount G__27158] (.plus ^java.time.temporal.Temporal G__27157 ^java.time.temporal.TemporalAmount G__27158)) ([^java.time.temporal.Temporal G__27159 G__27160 ^java.time.temporal.TemporalUnit G__27161] (.plus ^java.time.temporal.Temporal G__27159 G__27160 ^java.time.temporal.TemporalUnit G__27161)))

