(ns cljc.java-time.format.resolver-style (:require [java.time.format :refer [ResolverStyle]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def smart (. java.time.format.ResolverStyle -SMART))
(def strict (. java.time.format.ResolverStyle -STRICT))
(def lenient (. java.time.format.ResolverStyle -LENIENT))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.format.ResolverStyle values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.ResolverStyle [^java.lang.String java-lang-String51421] (. java.time.format.ResolverStyle valueOf java-lang-String51421)) (^java.lang.Enum [^java.lang.Class java-lang-Class51422 ^java.lang.String java-lang-String51423] (. java.time.format.ResolverStyle valueOf java-lang-Class51422 java-lang-String51423)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Integer [^java.time.format.ResolverStyle this51424] (.ordinal this51424)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^java.time.format.ResolverStyle this51425] (.toString this51425)))
(clojure.core/defn name {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^java.time.format.ResolverStyle this51426] (.name this51426)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Class [^java.time.format.ResolverStyle this51427] (.declaringClass this51427)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Integer [^java.time.format.ResolverStyle this51428] (.hashCode this51428)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"] ["java.time.format.ResolverStyle" "java.lang.Enum"]))} (^java.lang.Integer [this51429 G__51430] (.compareTo ^java.time.format.ResolverStyle this51429 G__51430)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.ResolverStyle this51431 ^java.lang.Object java-lang-Object51432] (.equals this51431 java-lang-Object51432)))
