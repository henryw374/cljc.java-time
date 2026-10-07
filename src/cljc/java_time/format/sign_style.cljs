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

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.format.SignStyle "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.SignStyle [^java.lang.String name]
   (js-invoke java.time.format.SignStyle "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.format.SignStyle "valueOf" enum-type name)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^int [^js/JSJoda.SignStyle this]
   (.ordinal this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.String [^js/JSJoda.SignStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.String [^js/JSJoda.SignStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^java.lang.Class [^js/JSJoda.SignStyle this]
   (.declaringClass this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.SignStyle"]))}
  (^int [^js/JSJoda.SignStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.format.SignStyle" "java.lang.Enum"]))}
  (^int [^js/JSJoda.SignStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.SignStyle this ^java.lang.Object other]
   (.equals this other)))
