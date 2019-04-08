(ns cljc.java-time.format.resolver-style (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.format :refer [ResolverStyle]])) #? (:clj (:import [java.time.format ResolverStyle])))




(defn values ^java.time.format.ResolverStyle<> ([] (. java.time.format.ResolverStyle values)))



(defn value-of ^java.time.format.ResolverStyle ([^java.lang.String G__27276] (. java.time.format.ResolverStyle valueOf ^java.lang.String G__27276)))


