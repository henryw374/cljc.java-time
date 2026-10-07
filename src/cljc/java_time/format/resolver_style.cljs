(ns cljc.java-time.format.resolver-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [ResolverStyle]]))

(def smart (goog.object/get java.time.format.ResolverStyle "SMART"))

(def strict (goog.object/get java.time.format.ResolverStyle "STRICT"))

(def lenient (goog.object/get java.time.format.ResolverStyle "LENIENT"))

(clojure.core/defn values
  {:arglists (quote ([]))}
  (^"java.lang.Class" []
   (js-invoke java.time.format.ResolverStyle "values")))

(clojure.core/defn value-of
  {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))}
  (^js/JSJoda.ResolverStyle [^java.lang.String name]
   (js-invoke java.time.format.ResolverStyle "valueOf" name))
  (^java.lang.Enum [^java.lang.Class enum-type ^java.lang.String name]
   (js-invoke java.time.format.ResolverStyle "valueOf" enum-type name)))

(clojure.core/defn ordinal
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^int [^js/JSJoda.ResolverStyle this]
   (.ordinal this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.String [^js/JSJoda.ResolverStyle this]
   (.toString this)))

(clojure.core/defn name
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.String [^js/JSJoda.ResolverStyle this]
   (.name this)))

(clojure.core/defn get-declaring-class
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^java.lang.Class [^js/JSJoda.ResolverStyle this]
   (.declaringClass this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.ResolverStyle"]))}
  (^int [^js/JSJoda.ResolverStyle this]
   (.hashCode this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Enum"]))}
  (^int [^js/JSJoda.ResolverStyle this ^java.lang.Enum o]
   (.compareTo this o)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ResolverStyle this ^java.lang.Object other]
   (.equals this other)))
