(ns cljc.java-time.format.resolver-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [ResolverStyle]]))

(def smart (goog.object/get java.time.format.ResolverStyle "SMART"))

(def strict (goog.object/get java.time.format.ResolverStyle "STRICT"))

(def lenient (goog.object/get java.time.format.ResolverStyle "LENIENT"))

(defn values
  (^"java.lang.Class" []
   (js-invoke java.time.format.ResolverStyle "values")))

(defn value-of
  (^js/JSJoda.ResolverStyle [^java.lang.String name]
   (js-invoke java.time.format.ResolverStyle "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.format.ResolverStyle "valueOf" enum-type name)))

(defn ordinal
  (^int [^js/JSJoda.ResolverStyle this]
   (.ordinal this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.ResolverStyle this]
   (.toString this)))

(defn name
  (^java.lang.String [^js/JSJoda.ResolverStyle this]
   (.name this)))

(defn get-declaring-class
  (^java.lang.Class [^js/JSJoda.ResolverStyle this]
   (.declaringClass this)))

(defn hash-code
  (^int [^js/JSJoda.ResolverStyle this]
   (.hashCode this)))

(defn compare-to
  (^int [^js/JSJoda.ResolverStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  (^boolean [^js/JSJoda.ResolverStyle this ^java.lang.Object other]
   (.equals this other)))
