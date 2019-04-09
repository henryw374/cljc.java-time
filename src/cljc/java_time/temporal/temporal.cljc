(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [Temporal]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time.temporal Temporal])))

(defn until ([^java.time.temporal.Temporal G__56646 ^java.time.temporal.Temporal G__56647 ^java.time.temporal.TemporalUnit G__56648] (.until ^java.time.temporal.Temporal G__56646 ^java.time.temporal.Temporal G__56647 ^java.time.temporal.TemporalUnit G__56648)))


(defn minus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__56649 ^java.time.temporal.TemporalAmount G__56650] (.minus ^java.time.temporal.Temporal G__56649 ^java.time.temporal.TemporalAmount G__56650)) ([^java.time.temporal.Temporal G__56651 G__56652 ^java.time.temporal.TemporalUnit G__56653] (.minus ^java.time.temporal.Temporal G__56651 G__56652 ^java.time.temporal.TemporalUnit G__56653)))


(defn with ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__56654 ^java.time.temporal.TemporalField G__56655 G__56656] (.with ^java.time.temporal.Temporal G__56654 ^java.time.temporal.TemporalField G__56655 G__56656)) ([^java.time.temporal.Temporal G__56657 ^java.time.temporal.TemporalAdjuster G__56658] (.with ^java.time.temporal.Temporal G__56657 ^java.time.temporal.TemporalAdjuster G__56658)))


(defn is-supported ([^java.time.temporal.Temporal G__56659 ^java.time.temporal.TemporalUnit G__56660] (.isSupported ^java.time.temporal.Temporal G__56659 ^java.time.temporal.TemporalUnit G__56660)))


(defn plus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__56661 ^java.time.temporal.TemporalAmount G__56662] (.plus ^java.time.temporal.Temporal G__56661 ^java.time.temporal.TemporalAmount G__56662)) ([^java.time.temporal.Temporal G__56663 G__56664 ^java.time.temporal.TemporalUnit G__56665] (.plus ^java.time.temporal.Temporal G__56663 G__56664 ^java.time.temporal.TemporalUnit G__56665)))

