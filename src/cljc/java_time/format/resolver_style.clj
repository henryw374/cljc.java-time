(ns cljc.java-time.format.resolver-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.format ResolverStyle)))

(def smart java.time.format.ResolverStyle/SMART)

(def strict java.time.format.ResolverStyle/STRICT)

(def lenient java.time.format.ResolverStyle/LENIENT)

(defn values
  (^"java.lang.Class" []
   (java.time.format.ResolverStyle/values)))

(defn value-of
  (^java.time.format.ResolverStyle [^java.lang.String name]
   (java.time.format.ResolverStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.ResolverStyle/valueOf enum-type name)))

(defn ordinal
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.ordinal this)))

(defn to-string
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.toString this)))

(defn name
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.name this)))

(defn get-declaring-class
  (^java.lang.Class [^java.time.format.ResolverStyle this]
   (.getDeclaringClass this)))

(defn hash-code
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.hashCode this)))

(defn compare-to
  (^java.lang.Integer [^java.time.format.ResolverStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  (^java.lang.Boolean [^java.time.format.ResolverStyle this ^java.lang.Object other]
   (.equals this other)))
