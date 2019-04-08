(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZoneId]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZoneId])))

(defn get-display-name ^java.lang.String ([^java.time.ZoneId G__36420 ^java.time.format.TextStyle G__36421 ^java.util.Locale G__36422] (jti/getter displayName ^java.time.ZoneId G__36420 ^java.time.format.TextStyle G__36421 ^java.util.Locale G__36422)))




(defn normalized ^java.time.ZoneId ([^java.time.ZoneId G__36423] (.normalized ^java.time.ZoneId G__36423)))




(defn get-available-zone-ids ^java.util.Set ([] (. java.time.ZoneId getAvailableZoneIds)))




(defn to-string ^java.lang.String ([^java.time.ZoneId G__36425] (.toString ^java.time.ZoneId G__36425)))


(defn equals ([^java.time.ZoneId G__36426 ^java.lang.Object G__36427] (.equals ^java.time.ZoneId G__36426 ^java.lang.Object G__36427)))



(defn get-id ^java.lang.String ([^java.time.ZoneId G__36428] (jti/getter id ^java.time.ZoneId G__36428)))


(defn of-offset ^java.time.ZoneId ([^java.lang.String G__36430 ^java.time.ZoneOffset G__36431] (. java.time.ZoneId ofOffset ^java.lang.String G__36430 ^java.time.ZoneOffset G__36431)))


(defn hash-code ([^java.time.ZoneId G__36432] (.hashCode ^java.time.ZoneId G__36432)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneId G__36433] (jti/getter rules ^java.time.ZoneId G__36433)))


(defn from ^java.time.ZoneId ([^java.time.temporal.TemporalAccessor G__36435] (. java.time.ZoneId from ^java.time.temporal.TemporalAccessor G__36435)))


(defn system-default ^java.time.ZoneId ([] (. java.time.ZoneId systemDefault)))


