(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAmount]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAmount])))

(defn get-units ^java.util.List ([^java.time.temporal.TemporalAmount G__36896] (jti/getter units ^java.time.temporal.TemporalAmount G__36896)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__36897 ^java.time.temporal.Temporal G__36898] (.subtractFrom ^java.time.temporal.TemporalAmount G__36897 ^java.time.temporal.Temporal G__36898)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__36899 ^java.time.temporal.Temporal G__36900] (.addTo ^java.time.temporal.TemporalAmount G__36899 ^java.time.temporal.Temporal G__36900)))


(defn get ([^java.time.temporal.TemporalAmount G__36901 ^java.time.temporal.TemporalUnit G__36902] (.get ^java.time.temporal.TemporalAmount G__36901 ^java.time.temporal.TemporalUnit G__36902)))

