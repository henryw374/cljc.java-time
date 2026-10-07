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
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.format.SignStyle/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.format.SignStyle [^java.lang.String name]
   (java.time.format.SignStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.SignStyle/valueOf enum-type name)))

(defn ordinal
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.ordinal this)))

(defn to-string
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.toString this)))

(defn name
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.name this)))

(defn get-declaring-class
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Class [^java.time.format.SignStyle this]
   (.getDeclaringClass this)))

(defn hash-code
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.hashCode this)))

(defn compare-to
  {:arglists '(["java.time.format.SignStyle" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.format.SignStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  {:arglists '(["java.time.format.SignStyle" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.format.SignStyle this ^java.lang.Object other]
   (.equals this other)))
