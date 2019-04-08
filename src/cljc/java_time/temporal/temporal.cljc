(ns cljc.java-time.temporal.temporal (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [Temporal]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.temporal Temporal])))

(defn until ([^java.time.temporal.Temporal G__36876 ^java.time.temporal.Temporal G__36877 ^java.time.temporal.TemporalUnit G__36878] (.until ^java.time.temporal.Temporal G__36876 ^java.time.temporal.Temporal G__36877 ^java.time.temporal.TemporalUnit G__36878)))


(defn minus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__36879 ^java.time.temporal.TemporalAmount G__36880] (.minus ^java.time.temporal.Temporal G__36879 ^java.time.temporal.TemporalAmount G__36880)) ([^java.time.temporal.Temporal G__36881 G__36882 ^java.time.temporal.TemporalUnit G__36883] (.minus ^java.time.temporal.Temporal G__36881 G__36882 ^java.time.temporal.TemporalUnit G__36883)))


(defn with ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__36884 ^java.time.temporal.TemporalField G__36885 G__36886] (.with ^java.time.temporal.Temporal G__36884 ^java.time.temporal.TemporalField G__36885 G__36886)) ([^java.time.temporal.Temporal G__36887 ^java.time.temporal.TemporalAdjuster G__36888] (.with ^java.time.temporal.Temporal G__36887 ^java.time.temporal.TemporalAdjuster G__36888)))


(defn is-supported ([^java.time.temporal.Temporal G__36889 ^java.time.temporal.TemporalUnit G__36890] (.isSupported ^java.time.temporal.Temporal G__36889 ^java.time.temporal.TemporalUnit G__36890)))


(defn plus ^java.time.temporal.Temporal ([^java.time.temporal.Temporal G__36891 ^java.time.temporal.TemporalAmount G__36892] (.plus ^java.time.temporal.Temporal G__36891 ^java.time.temporal.TemporalAmount G__36892)) ([^java.time.temporal.Temporal G__36893 G__36894 ^java.time.temporal.TemporalUnit G__36895] (.plus ^java.time.temporal.Temporal G__36893 G__36894 ^java.time.temporal.TemporalUnit G__36895)))

