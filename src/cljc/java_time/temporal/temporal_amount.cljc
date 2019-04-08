(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.temporal :refer [TemporalAmount]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal TemporalAmount])))

(defn get-units ^java.util.List ([^java.time.temporal.TemporalAmount G__35406] (jti/getter units ^java.time.temporal.TemporalAmount G__35406)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__35407 ^java.time.temporal.Temporal G__35408] (.subtractFrom ^java.time.temporal.TemporalAmount G__35407 ^java.time.temporal.Temporal G__35408)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__35409 ^java.time.temporal.Temporal G__35410] (.addTo ^java.time.temporal.TemporalAmount G__35409 ^java.time.temporal.Temporal G__35410)))


(defn get ([^java.time.temporal.TemporalAmount G__35411 ^java.time.temporal.TemporalUnit G__35412] (.get ^java.time.temporal.TemporalAmount G__35411 ^java.time.temporal.TemporalUnit G__35412)))

