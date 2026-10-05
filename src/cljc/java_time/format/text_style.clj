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

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (java.time.format.TextStyle/values)))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^java.time.format.TextStyle [^java.lang.String arg0]
   (java.time.format.TextStyle/valueOf arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (java.time.format.TextStyle/valueOf arg0 arg1)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.Integer [^java.time.format.TextStyle this]
   (.ordinal this)))

(clojure.core/defn as-standalone
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.time.format.TextStyle [^java.time.format.TextStyle this]
   (.asStandalone this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.String [^java.time.format.TextStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.String [^java.time.format.TextStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.Class [^java.time.format.TextStyle this]
   (.getDeclaringClass this)))

(clojure.core/defn as-normal
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.time.format.TextStyle [^java.time.format.TextStyle this]
   (.asNormal this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.Integer [^java.time.format.TextStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.format.TextStyle" "java.lang.Enum"]))}
  (^java.lang.Integer [^java.time.format.TextStyle this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn is-standalone
  {:arglists (quote (["java.time.format.TextStyle"]))}
  (^java.lang.Boolean [^java.time.format.TextStyle this]
   (.isStandalone this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.format.TextStyle this ^java.lang.Object arg0]
   (.equals this arg0)))
