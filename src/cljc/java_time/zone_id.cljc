(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [ZoneId]])) #? (:clj (:import [java.time ZoneId])))

(defn get-display-name ^java.lang.String ([^java.time.ZoneId G__26686 ^java.time.format.TextStyle G__26687 ^java.util.Locale G__26688] (jti/getter displayName ^java.time.ZoneId G__26686 ^java.time.format.TextStyle G__26687 ^java.util.Locale G__26688)))




(defn normalized ^java.time.ZoneId ([^java.time.ZoneId G__26689] (.normalized ^java.time.ZoneId G__26689)))




(defn get-available-zone-ids ^java.util.Set ([] (. java.time.ZoneId getAvailableZoneIds)))




(defn to-string ^java.lang.String ([^java.time.ZoneId G__26691] (.toString ^java.time.ZoneId G__26691)))


(defn equals ([^java.time.ZoneId G__26692 ^java.lang.Object G__26693] (.equals ^java.time.ZoneId G__26692 ^java.lang.Object G__26693)))



(defn get-id ^java.lang.String ([^java.time.ZoneId G__26694] (jti/getter id ^java.time.ZoneId G__26694)))


(defn of-offset ^java.time.ZoneId ([^java.lang.String G__26696 ^java.time.ZoneOffset G__26697] (. java.time.ZoneId ofOffset ^java.lang.String G__26696 ^java.time.ZoneOffset G__26697)))


(defn hash-code ([^java.time.ZoneId G__26698] (.hashCode ^java.time.ZoneId G__26698)))



(defn get-rules ^java.time.zone.ZoneRules ([^java.time.ZoneId G__26699] (jti/getter rules ^java.time.ZoneId G__26699)))


(defn from ^java.time.ZoneId ([^java.time.temporal.TemporalAccessor G__26701] (. java.time.ZoneId from ^java.time.temporal.TemporalAccessor G__26701)))


(defn system-default ^java.time.ZoneId ([] (. java.time.ZoneId systemDefault)))


