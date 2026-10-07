(ns cljc.java-time.format.text-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format TextStyle]))

(def short java.time.format.TextStyle/SHORT)

(def full-standalone java.time.format.TextStyle/FULL_STANDALONE)

(def full java.time.format.TextStyle/FULL)

(def short-standalone java.time.format.TextStyle/SHORT_STANDALONE)

(def narrow java.time.format.TextStyle/NARROW)

(def narrow-standalone java.time.format.TextStyle/NARROW_STANDALONE)

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.format.TextStyle/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.format.TextStyle [^java.lang.String name]
   (java.time.format.TextStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.TextStyle/valueOf enum-type name)))

(defn ordinal
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.Integer [^java.time.format.TextStyle this]
   (.ordinal this)))

(defn as-standalone
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.time.format.TextStyle [^java.time.format.TextStyle this]
   (.asStandalone this)))

(defn to-string
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.String [^java.time.format.TextStyle this]
   (.toString this)))

(defn name
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.String [^java.time.format.TextStyle this]
   (.name this)))

(defn get-declaring-class
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.Class [^java.time.format.TextStyle this]
   (.getDeclaringClass this)))

(defn as-normal
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.time.format.TextStyle [^java.time.format.TextStyle this]
   (.asNormal this)))

(defn hash-code
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.Integer [^java.time.format.TextStyle this]
   (.hashCode this)))

(defn compare-to
  {:arglists '(["java.time.format.TextStyle" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.format.TextStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn is-standalone
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.Boolean [^java.time.format.TextStyle this]
   (.isStandalone this)))

(defn equals
  {:arglists '(["java.time.format.TextStyle" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.format.TextStyle this ^java.lang.Object other]
   (.equals this other)))
