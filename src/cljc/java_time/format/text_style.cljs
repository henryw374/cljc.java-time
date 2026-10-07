(ns cljc.java-time.format.text-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [TextStyle]]))

(def short (goog.object/get java.time.format.TextStyle "SHORT"))

(def full-standalone (goog.object/get java.time.format.TextStyle "FULL_STANDALONE"))

(def full (goog.object/get java.time.format.TextStyle "FULL"))

(def short-standalone (goog.object/get java.time.format.TextStyle "SHORT_STANDALONE"))

(def narrow (goog.object/get java.time.format.TextStyle "NARROW"))

(def narrow-standalone (goog.object/get java.time.format.TextStyle "NARROW_STANDALONE"))

(defn values
  {:arglists '([])}
  (^"java.lang.Class" []
   (js-invoke java.time.format.TextStyle "values")))

(defn value-of
  {:arglists '(["java.lang.String"] ["java.lang.Class" "java.lang.String"])}
  (^js/JSJoda.TextStyle [^java.lang.String name]
   (js-invoke java.time.format.TextStyle "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.format.TextStyle "valueOf" enum-type name)))

(defn ordinal
  {:arglists '(["java.time.format.TextStyle"])}
  (^int [^js/JSJoda.TextStyle this]
   (.ordinal this)))

(defn as-standalone
  {:arglists '(["java.time.format.TextStyle"])}
  (^js/JSJoda.TextStyle [^js/JSJoda.TextStyle this]
   (.asStandalone this)))

(defn to-string
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.String [^js/JSJoda.TextStyle this]
   (.toString this)))

(defn name
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.String [^js/JSJoda.TextStyle this]
   (.name this)))

(defn get-declaring-class
  {:arglists '(["java.time.format.TextStyle"])}
  (^java.lang.Class [^js/JSJoda.TextStyle this]
   (.declaringClass this)))

(defn as-normal
  {:arglists '(["java.time.format.TextStyle"])}
  (^js/JSJoda.TextStyle [^js/JSJoda.TextStyle this]
   (.asNormal this)))

(defn hash-code
  {:arglists '(["java.time.format.TextStyle"])}
  (^int [^js/JSJoda.TextStyle this]
   (.hashCode this)))

(defn compare-to
  {:arglists '(["java.time.format.TextStyle" "java.lang.Enum"])}
  (^int [^js/JSJoda.TextStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn is-standalone
  {:arglists '(["java.time.format.TextStyle"])}
  (^boolean [^js/JSJoda.TextStyle this]
   (.isStandalone this)))

(defn equals
  {:arglists '(["java.time.format.TextStyle" "java.lang.Object"])}
  (^boolean [^js/JSJoda.TextStyle this ^java.lang.Object other]
   (.equals this other)))
