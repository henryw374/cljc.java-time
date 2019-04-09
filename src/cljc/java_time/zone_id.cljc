(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZoneId]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time ZoneId])))
(def short-ids (. java.time.ZoneId -SHORT_IDS))

(defn get-display-name ^java.lang.String ([^java.time.ZoneId G__56129 ^java.time.format.TextStyle G__56130 ^java.util.Locale G__56131] (jti/getter displayName ^java.time.ZoneId G__56129 ^java.time.format.TextStyle G__56130 ^java.util.Locale G__56131)))




(defn normalized ^java.time.ZoneId ([^java.time.ZoneId G__56132] (.normalized ^java.time.ZoneId G__56132)))




(defn get-available-zone-ids ^java.util.Set ([] (. java.time.ZoneId getAvailableZoneIds)))




(defn to-string ^java.lang.String ([^java.time.ZoneId G__56134] (.toString ^java.time.ZoneId G__56134)))


(defn equals ([^java.time.ZoneId G__56135 ^java.lang.Object G__56136] (.equals ^java.time.ZoneId G__56135 ^java.lang.Object G__56136)))



(defn get-id ^java.lang.String ([^java.time.ZoneId G__56137] (jti/getter id ^java.time.ZoneId G__56137)))


(defn of-offset ^java.time.ZoneId ([^java.lang.String G__56139 ^java.time.ZoneOffset G__56140] (. java.time.ZoneId ofOffset ^java.lang.String G__56139 ^java.time.ZoneOffset G__56140)))


(defn hash-code ([^java.time.ZoneId G__56141] (.hashCode ^java.time.ZoneId G__56141)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneId G__56142] (jti/getter rules ^java.time.ZoneId G__56142)))


(defn from ^java.time.ZoneId ([^java.time.temporal.TemporalAccessor G__56144] (. java.time.ZoneId from ^java.time.temporal.TemporalAccessor G__56144)))


(defn system-default ^java.time.ZoneId ([] (. java.time.ZoneId systemDefault)))


