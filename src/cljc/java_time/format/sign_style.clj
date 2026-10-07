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
  {:arglists '([])}
  (^"java.lang.Class" []
   (java.time.format.SignStyle/values)))

(clojure.core/defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^java.time.format.SignStyle [^java.lang.String name]
   (java.time.format.SignStyle/valueOf name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (java.time.format.SignStyle/valueOf enum-type name)))

(clojure.core/defn ordinal
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.ordinal this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.String [^java.time.format.SignStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Class [^java.time.format.SignStyle this]
   (.getDeclaringClass this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.format.SignStyle"])}
  (^java.lang.Integer [^java.time.format.SignStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.format.SignStyle" "java.lang.Enum"])}
  (^java.lang.Integer [^java.time.format.SignStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn equals
  {:arglists '(["java.time.format.SignStyle" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.format.SignStyle this ^java.lang.Object other]
   (.equals this other)))
