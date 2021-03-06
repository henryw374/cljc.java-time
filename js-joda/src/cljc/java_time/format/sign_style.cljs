(ns cljc.java-time.format.sign-style (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.format :refer [SignStyle]]))
(def exceeds-pad (goog.object/get java.time.format.SignStyle "EXCEEDS_PAD"))
(def normal (goog.object/get java.time.format.SignStyle "NORMAL"))
(def always (goog.object/get java.time.format.SignStyle "ALWAYS"))
(def never (goog.object/get java.time.format.SignStyle "NEVER"))
(def not-negative (goog.object/get java.time.format.SignStyle "NOT_NEGATIVE"))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.format.SignStyle "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.SignStyle [^java.lang.String java-lang-String27972] (js-invoke java.time.format.SignStyle "valueOf" java-lang-String27972)) (^java.lang.Enum [^java.lang.Class java-lang-Class27973 ^java.lang.String java-lang-String27974] (js-invoke java.time.format.SignStyle "valueOf" java-lang-Class27973 java-lang-String27974)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.SignStyle"]))} (^int [^js/JSJoda.SignStyle this27975] (.ordinal this27975)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^js/JSJoda.SignStyle this27976] (.toString this27976)))
(clojure.core/defn name {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^js/JSJoda.SignStyle this27977] (.name this27977)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Class [^js/JSJoda.SignStyle this27978] (.declaringClass this27978)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.SignStyle"]))} (^int [^js/JSJoda.SignStyle this27979] (.hashCode this27979)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.SignStyle" "java.lang.Enum"]))} (^int [^js/JSJoda.SignStyle this27980 ^java.lang.Enum java-lang-Enum27981] (.compareTo this27980 java-lang-Enum27981)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))} (^boolean [^js/JSJoda.SignStyle this27982 ^java.lang.Object java-lang-Object27983] (.equals this27982 java-lang-Object27983)))
