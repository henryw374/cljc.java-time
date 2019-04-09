(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAmount]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time.temporal TemporalAmount])))

(defn get-units ^java.util.List ([^java.time.temporal.TemporalAmount G__56666] (jti/getter units ^java.time.temporal.TemporalAmount G__56666)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__56667 ^java.time.temporal.Temporal G__56668] (.subtractFrom ^java.time.temporal.TemporalAmount G__56667 ^java.time.temporal.Temporal G__56668)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__56669 ^java.time.temporal.Temporal G__56670] (.addTo ^java.time.temporal.TemporalAmount G__56669 ^java.time.temporal.Temporal G__56670)))


(defn get ([^java.time.temporal.TemporalAmount G__56671 ^java.time.temporal.TemporalUnit G__56672] (.get ^java.time.temporal.TemporalAmount G__56671 ^java.time.temporal.TemporalUnit G__56672)))

