(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.temporal :refer [TemporalAmount]])) #? (:clj (:import [java.time.temporal TemporalAmount])))

(defn get-units ^java.util.List ([^java.time.temporal.TemporalAmount G__27162] (jti/getter units ^java.time.temporal.TemporalAmount G__27162)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__27163 ^java.time.temporal.Temporal G__27164] (.subtractFrom ^java.time.temporal.TemporalAmount G__27163 ^java.time.temporal.Temporal G__27164)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.temporal.TemporalAmount G__27165 ^java.time.temporal.Temporal G__27166] (.addTo ^java.time.temporal.TemporalAmount G__27165 ^java.time.temporal.Temporal G__27166)))


(defn get ([^java.time.temporal.TemporalAmount G__27167 ^java.time.temporal.TemporalUnit G__27168] (.get ^java.time.temporal.TemporalAmount G__27167 ^java.time.temporal.TemporalUnit G__27168)))

