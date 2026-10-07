(ns cljc.java-time.format.resolver-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format ResolverStyle]))

(def smart java.time.format.ResolverStyle/SMART)

(def strict java.time.format.ResolverStyle/STRICT)

(def lenient java.time.format.ResolverStyle/LENIENT)

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.format.ResolverStyle/values)))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.format.ResolverStyle [^java.lang.String name]
   (java.time.format.ResolverStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.ResolverStyle/valueOf enum-type name)))

(defn ordinal
  {:arglists '(["java.time.format.ResolverStyle"])}
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.ordinal this)))

(defn to-string
  {:arglists '(["java.time.format.ResolverStyle"])}
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.toString this)))

(defn name
  {:arglists '(["java.time.format.ResolverStyle"])}
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.name this)))

(defn get-declaring-class
  {:arglists '(["java.time.format.ResolverStyle"])}
  (^java.lang.Class [^java.time.format.ResolverStyle this]
   (.getDeclaringClass this)))

(defn hash-code
  {:arglists '(["java.time.format.ResolverStyle"])}
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.hashCode this)))

(defn compare-to
  {:arglists '(["java.time.format.ResolverStyle" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.format.ResolverStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  {:arglists '(["java.time.format.ResolverStyle" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.format.ResolverStyle this ^java.lang.Object other]
   (.equals this other)))
