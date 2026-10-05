(ns cljc.java-time.format.resolver-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format ResolverStyle]))

(def smart java.time.format.ResolverStyle/SMART)

(def strict java.time.format.ResolverStyle/STRICT)

(def lenient java.time.format.ResolverStyle/LENIENT)

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (java.time.format.ResolverStyle/values)))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^java.time.format.ResolverStyle [^java.lang.String arg0]
   (java.time.format.ResolverStyle/valueOf arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (java.time.format.ResolverStyle/valueOf arg0 arg1)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.ordinal this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.String [^java.time.format.ResolverStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.Class [^java.time.format.ResolverStyle this]
   (.getDeclaringClass this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.Integer [^java.time.format.ResolverStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Enum"]))}
  (^java.lang.Integer [^java.time.format.ResolverStyle this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.format.ResolverStyle this ^java.lang.Object arg0]
   (.equals this arg0)))
