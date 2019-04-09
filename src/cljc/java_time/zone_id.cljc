(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZoneId]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZoneId])))
(def short-ids (. java.time.ZoneId -SHORT_IDS))

(defn get-display-name ^java.lang.String ([^java.time.ZoneId G__47056 ^java.time.format.TextStyle G__47057 ^java.util.Locale G__47058] (jti/getter displayName ^java.time.ZoneId G__47056 ^java.time.format.TextStyle G__47057 ^java.util.Locale G__47058)))




(defn normalized ^java.time.ZoneId ([^java.time.ZoneId G__47059] (.normalized ^java.time.ZoneId G__47059)))




(defn get-available-zone-ids ^java.util.Set ([] (. java.time.ZoneId getAvailableZoneIds)))




(defn to-string ^java.lang.String ([^java.time.ZoneId G__47061] (.toString ^java.time.ZoneId G__47061)))


(defn equals ([^java.time.ZoneId G__47062 ^java.lang.Object G__47063] (.equals ^java.time.ZoneId G__47062 ^java.lang.Object G__47063)))



(defn get-id ^java.lang.String ([^java.time.ZoneId G__47064] (jti/getter id ^java.time.ZoneId G__47064)))


(defn of-offset ^java.time.ZoneId ([^java.lang.String G__47066 ^java.time.ZoneOffset G__47067] (. java.time.ZoneId ofOffset ^java.lang.String G__47066 ^java.time.ZoneOffset G__47067)))


(defn hash-code ([^java.time.ZoneId G__47068] (.hashCode ^java.time.ZoneId G__47068)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneId G__47069] (jti/getter rules ^java.time.ZoneId G__47069)))


(defn from ^java.time.ZoneId ([^java.time.temporal.TemporalAccessor G__47071] (. java.time.ZoneId from ^java.time.temporal.TemporalAccessor G__47071)))


(defn system-default ^java.time.ZoneId ([] (. java.time.ZoneId systemDefault)))


