(ns cljc.java-time.format.resolver-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [ResolverStyle]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.format ResolverStyle])))




(defn values ^java.time.format.ResolverStyle<> ([] (. java.time.format.ResolverStyle values)))



(defn value-of ^java.time.format.ResolverStyle ([^java.lang.String G__37010] (. java.time.format.ResolverStyle valueOf ^java.lang.String G__37010)))


