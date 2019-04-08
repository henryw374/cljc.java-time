(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [ZoneId]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZoneId])))

(defn get-display-name ^java.lang.String ([^java.time.ZoneId G__34930 ^java.time.format.TextStyle G__34931 ^java.util.Locale G__34932] (jti/getter displayName ^java.time.ZoneId G__34930 ^java.time.format.TextStyle G__34931 ^java.util.Locale G__34932)))




(defn normalized ^java.time.ZoneId ([^java.time.ZoneId G__34933] (.normalized ^java.time.ZoneId G__34933)))




(defn get-available-zone-ids ^java.util.Set ([] (. java.time.ZoneId getAvailableZoneIds)))




(defn to-string ^java.lang.String ([^java.time.ZoneId G__34935] (.toString ^java.time.ZoneId G__34935)))


(defn equals ([^java.time.ZoneId G__34936 ^java.lang.Object G__34937] (.equals ^java.time.ZoneId G__34936 ^java.lang.Object G__34937)))



(defn get-id ^java.lang.String ([^java.time.ZoneId G__34938] (jti/getter id ^java.time.ZoneId G__34938)))


(defn of-offset ^java.time.ZoneId ([^java.lang.String G__34940 ^java.time.ZoneOffset G__34941] (. java.time.ZoneId ofOffset ^java.lang.String G__34940 ^java.time.ZoneOffset G__34941)))


(defn hash-code ([^java.time.ZoneId G__34942] (.hashCode ^java.time.ZoneId G__34942)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneId G__34943] (jti/getter rules ^java.time.ZoneId G__34943)))


(defn from ^java.time.ZoneId ([^java.time.temporal.TemporalAccessor G__34945] (. java.time.ZoneId from ^java.time.temporal.TemporalAccessor G__34945)))


(defn system-default ^java.time.ZoneId ([] (. java.time.ZoneId systemDefault)))


