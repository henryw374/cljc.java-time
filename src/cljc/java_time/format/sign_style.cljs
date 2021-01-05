(ns cljc.java-time.format.sign-style (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.format :refer [SignStyle]]))
(def exceeds-pad (goog.object/get java.time.format.SignStyle "EXCEEDS_PAD"))
(def normal (goog.object/get java.time.format.SignStyle "NORMAL"))
(def always (goog.object/get java.time.format.SignStyle "ALWAYS"))
(def never (goog.object/get java.time.format.SignStyle "NEVER"))
(def not-negative (goog.object/get java.time.format.SignStyle "NOT_NEGATIVE"))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.format.SignStyle "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.SignStyle [^java.lang.String java-lang-String9322] (js-invoke java.time.format.SignStyle "valueOf" java-lang-String9322)) (^java.lang.Enum [^java.lang.Class java-lang-Class9323 ^java.lang.String java-lang-String9324] (js-invoke java.time.format.SignStyle "valueOf" java-lang-Class9323 java-lang-String9324)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.SignStyle"]))} (^int [^js/JSJoda.SignStyle this9325] (.ordinal this9325)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^js/JSJoda.SignStyle this9326] (.toString this9326)))
(clojure.core/defn name {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^js/JSJoda.SignStyle this9327] (.name this9327)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Class [^js/JSJoda.SignStyle this9328] (.declaringClass this9328)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.SignStyle"]))} (^int [^js/JSJoda.SignStyle this9329] (.hashCode this9329)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"] ["java.time.format.SignStyle" "java.lang.Enum"]))} (^int [this9330 G__9331] (.compareTo ^js/JSJoda.SignStyle this9330 G__9331)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))} (^boolean [^js/JSJoda.SignStyle this9332 ^java.lang.Object java-lang-Object9333] (.equals this9332 java-lang-Object9333)))
