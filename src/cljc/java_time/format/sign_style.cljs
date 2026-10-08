(ns cljc.java-time.format.sign-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [SignStyle]]))

(def exceeds-pad (goog.object/get java.time.format.SignStyle "EXCEEDS_PAD"))

(def normal (goog.object/get java.time.format.SignStyle "NORMAL"))

(def always (goog.object/get java.time.format.SignStyle "ALWAYS"))

(def never (goog.object/get java.time.format.SignStyle "NEVER"))

(def not-negative (goog.object/get java.time.format.SignStyle "NOT_NEGATIVE"))

(defn values
  (^"java.lang.Class" []
   (js-invoke java.time.format.SignStyle "values")))

(defn value-of
  (^js/JSJoda.SignStyle [^java.lang.String name]
   (js-invoke java.time.format.SignStyle "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.format.SignStyle "valueOf" enum-type name)))

(defn ordinal
  (^int [^js/JSJoda.SignStyle this]
   (.ordinal this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.SignStyle this]
   (.toString this)))

(defn name
  (^java.lang.String [^js/JSJoda.SignStyle this]
   (.name this)))

(defn get-declaring-class
  (^java.lang.Class [^js/JSJoda.SignStyle this]
   (.declaringClass this)))

(defn hash-code
  (^int [^js/JSJoda.SignStyle this]
   (.hashCode this)))

(defn compare-to
  (^int [^js/JSJoda.SignStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(defn equals
  (^boolean [^js/JSJoda.SignStyle this ^java.lang.Object other]
   (.equals this other)))
