(ns cljc.java-time.format.decimal-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format DecimalStyle]))

(def standard java.time.format.DecimalStyle/STANDARD)

(clojure.core/defn with-decimal-separator
  {:arglists (quote (["java.time.format.DecimalStyle" "char"]))}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character decimal-separator]
   (.withDecimalSeparator this decimal-separator)))

(clojure.core/defn of
  {:arglists (quote (["java.util.Locale"]))}
  (^java.time.format.DecimalStyle [^java.util.Locale locale]
   (java.time.format.DecimalStyle/of locale)))

(clojure.core/defn with-positive-sign
  {:arglists (quote (["java.time.format.DecimalStyle" "char"]))}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character positive-sign]
   (.withPositiveSign this positive-sign)))

(clojure.core/defn get-decimal-separator
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getDecimalSeparator this)))

(clojure.core/defn of-default-locale
  {:arglists (quote ([]))}
  (^java.time.format.DecimalStyle []
   (java.time.format.DecimalStyle/ofDefaultLocale)))

(clojure.core/defn with-zero-digit
  {:arglists (quote (["java.time.format.DecimalStyle" "char"]))}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character zero-digit]
   (.withZeroDigit this zero-digit)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.String [^java.time.format.DecimalStyle this]
   (.toString this)))

(clojure.core/defn get-zero-digit
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getZeroDigit this)))

(clojure.core/defn with-negative-sign
  {:arglists (quote (["java.time.format.DecimalStyle" "char"]))}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character negative-sign]
   (.withNegativeSign this negative-sign)))

(clojure.core/defn get-available-locales
  {:arglists (quote ([]))}
  (^java.util.Set []
   (java.time.format.DecimalStyle/getAvailableLocales)))

(clojure.core/defn get-positive-sign
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getPositiveSign this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.Integer [^java.time.format.DecimalStyle this]
   (.hashCode this)))

(clojure.core/defn get-negative-sign
  {:arglists (quote (["java.time.format.DecimalStyle"]))}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getNegativeSign this)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.format.DecimalStyle" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.format.DecimalStyle this ^java.lang.Object obj]
   (.equals this obj)))
