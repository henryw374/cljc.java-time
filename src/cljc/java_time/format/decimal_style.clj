(ns cljc.java-time.format.decimal-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.format DecimalStyle)))

(def standard java.time.format.DecimalStyle/STANDARD)

(defn with-decimal-separator
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character decimal-separator]
   (.withDecimalSeparator this decimal-separator)))

(defn of
  {:arglists '(["java.util.Locale"])}
  (^java.time.format.DecimalStyle [^java.util.Locale locale]
   (java.time.format.DecimalStyle/of locale)))

(defn with-positive-sign
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character positive-sign]
   (.withPositiveSign this positive-sign)))

(defn get-decimal-separator
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getDecimalSeparator this)))

(defn of-default-locale
  {:arglists '([])}
  (^java.time.format.DecimalStyle []
   (java.time.format.DecimalStyle/ofDefaultLocale)))

(defn with-zero-digit
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character zero-digit]
   (.withZeroDigit this zero-digit)))

(defn to-string
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.String [^java.time.format.DecimalStyle this]
   (.toString this)))

(defn get-zero-digit
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getZeroDigit this)))

(defn with-negative-sign
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this ^java.lang.Character negative-sign]
   (.withNegativeSign this negative-sign)))

(defn get-available-locales
  {:arglists '([])}
  (^java.util.Set []
   (java.time.format.DecimalStyle/getAvailableLocales)))

(defn get-positive-sign
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getPositiveSign this)))

(defn hash-code
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.Integer [^java.time.format.DecimalStyle this]
   (.hashCode this)))

(defn get-negative-sign
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.Character [^java.time.format.DecimalStyle this]
   (.getNegativeSign this)))

(defn equals
  {:arglists '(["java.time.format.DecimalStyle" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.format.DecimalStyle this ^java.lang.Object obj]
   (.equals this obj)))
