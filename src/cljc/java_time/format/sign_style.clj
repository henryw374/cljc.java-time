(ns cljc.java-time.format.sign-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.format SignStyle)))

(def exceeds-pad java.time.format.SignStyle/EXCEEDS_PAD)

(def normal java.time.format.SignStyle/NORMAL)

(def always java.time.format.SignStyle/ALWAYS)

(def never java.time.format.SignStyle/NEVER)

(def not-negative java.time.format.SignStyle/NOT_NEGATIVE)

(defn values
  (^"java.lang.Class" []
   (java.time.format.SignStyle/values)))

(defn value-of
  (^java.time.format.SignStyle [^java.lang.String name]
   (java.time.format.SignStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.SignStyle/valueOf enum-type name)))

(defn ordinal
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.ordinal this)))

(defn to-string
  (^java.lang.String [^java.time.format.SignStyle this]
   (.toString this)))

(defn name
  (^java.lang.String [^java.time.format.SignStyle this]
   (.name this)))

(defn get-declaring-class
  (^java.lang.Class [^java.time.format.SignStyle this]
   (.getDeclaringClass this)))

(defn hash-code
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.hashCode this)))

(defn compare-to
  (^java.lang.Integer [^java.time.format.SignStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  (^java.lang.Boolean [^java.time.format.SignStyle this ^java.lang.Object other]
   (.equals this other)))
