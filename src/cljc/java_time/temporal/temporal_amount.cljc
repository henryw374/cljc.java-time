(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAmount]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAmount])))

(defn get-units ^java.util.List ([^java.time.temporal.TemporalAmount G__47532] (jti/getter units ^java.time.temporal.TemporalAmount G__47532)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__47533 ^java.time.temporal.Temporal G__47534] (.subtractFrom ^java.time.temporal.TemporalAmount G__47533 ^java.time.temporal.Temporal G__47534)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__47535 ^java.time.temporal.Temporal G__47536] (.addTo ^java.time.temporal.TemporalAmount G__47535 ^java.time.temporal.Temporal G__47536)))


(defn get ([^java.time.temporal.TemporalAmount G__47537 ^java.time.temporal.TemporalUnit G__47538] (.get ^java.time.temporal.TemporalAmount G__47537 ^java.time.temporal.TemporalUnit G__47538)))

