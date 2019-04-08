(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.temporal :refer [Temporal]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal Temporal])))

(defn until ([^java.time.temporal.Temporal G__35386 ^java.time.temporal.Temporal G__35387 ^java.time.temporal.TemporalUnit G__35388] (.until ^java.time.temporal.Temporal G__35386 ^java.time.temporal.Temporal G__35387 ^java.time.temporal.TemporalUnit G__35388)))


(defn minus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__35389 ^java.time.temporal.TemporalAmount G__35390] (.minus ^java.time.temporal.Temporal G__35389 ^java.time.temporal.TemporalAmount G__35390)) ([^java.time.temporal.Temporal G__35391 G__35392 ^java.time.temporal.TemporalUnit G__35393] (.minus ^java.time.temporal.Temporal G__35391 G__35392 ^java.time.temporal.TemporalUnit G__35393)))


(defn with ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__35394 ^java.time.temporal.TemporalField G__35395 G__35396] (.with ^java.time.temporal.Temporal G__35394 ^java.time.temporal.TemporalField G__35395 G__35396)) ([^java.time.temporal.Temporal G__35397 ^java.time.temporal.TemporalAdjuster G__35398] (.with ^java.time.temporal.Temporal G__35397 ^java.time.temporal.TemporalAdjuster G__35398)))


(defn is-supported ([^java.time.temporal.Temporal G__35399 ^java.time.temporal.TemporalUnit G__35400] (.isSupported ^java.time.temporal.Temporal G__35399 ^java.time.temporal.TemporalUnit G__35400)))


(defn plus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__35401 ^java.time.temporal.TemporalAmount G__35402] (.plus ^java.time.temporal.Temporal G__35401 ^java.time.temporal.TemporalAmount G__35402)) ([^java.time.temporal.Temporal G__35403 G__35404 ^java.time.temporal.TemporalUnit G__35405] (.plus ^java.time.temporal.Temporal G__35403 G__35404 ^java.time.temporal.TemporalUnit G__35405)))

