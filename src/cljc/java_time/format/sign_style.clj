(ns cljc.java-time.format.sign-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format SignStyle]))

(def exceeds-pad java.time.format.SignStyle/EXCEEDS_PAD)

(def normal java.time.format.SignStyle/NORMAL)

(def always java.time.format.SignStyle/ALWAYS)

(def never java.time.format.SignStyle/NEVER)

(def not-negative java.time.format.SignStyle/NOT_NEGATIVE)

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (java.time.format.SignStyle/values)))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^java.time.format.SignStyle [^java.lang.String arg0]
   (java.time.format.SignStyle/valueOf arg0))
  (^java.lang.Enum [^java.lang.Class arg0 ^java.lang.String arg1]
   (java.time.format.SignStyle/valueOf arg0 arg1)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.ordinal this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.Class [^java.time.format.SignStyle this]
   (.getDeclaringClass this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.format.SignStyle" "java.lang.Enum"]))}
  (^java.lang.Integer [^java.time.format.SignStyle this ^java.lang.Enum arg0]
   (.compareTo this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.format.SignStyle this ^java.lang.Object arg0]
   (.equals this arg0)))
