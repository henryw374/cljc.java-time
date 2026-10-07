(ns cljc.java-time.format.decimal-style
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [DecimalStyle]]))

(def standard (goog.object/get java.time.format.DecimalStyle "STANDARD"))

(defn with-decimal-separator
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this ^char decimal-separator]
   (.withDecimalSeparator this decimal-separator)))

(defn of
  {:arglists '(["java.util.Locale"])}
  (^js/JSJoda.DecimalStyle [^java.util.Locale locale]
   (js-invoke java.time.format.DecimalStyle "of" locale)))

(defn with-positive-sign
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this ^char positive-sign]
   (.withPositiveSign this positive-sign)))

(defn get-decimal-separator
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^char [^js/JSJoda.DecimalStyle this]
   (.decimalSeparator this)))

(defn of-default-locale
  {:arglists '([])}
  (^js/JSJoda.DecimalStyle []
   (js-invoke java.time.format.DecimalStyle "ofDefaultLocale")))

(defn with-zero-digit
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this ^char zero-digit]
   (.withZeroDigit this zero-digit)))

(defn to-string
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^java.lang.String [^js/JSJoda.DecimalStyle this]
   (.toString this)))

(defn get-zero-digit
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^char [^js/JSJoda.DecimalStyle this]
   (.zeroDigit this)))

(defn with-negative-sign
  {:arglists '(["java.time.format.DecimalStyle" "char"])}
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this ^char negative-sign]
   (.withNegativeSign this negative-sign)))

(defn get-available-locales
  {:arglists '([])}
  (^java.util.Set []
   (js-invoke java.time.format.DecimalStyle "getAvailableLocales")))

(defn get-positive-sign
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^char [^js/JSJoda.DecimalStyle this]
   (.positiveSign this)))

(defn hash-code
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^int [^js/JSJoda.DecimalStyle this]
   (.hashCode this)))

(defn get-negative-sign
  {:arglists '(["java.time.format.DecimalStyle"])}
  (^char [^js/JSJoda.DecimalStyle this]
   (.negativeSign this)))

(defn equals
  {:arglists '(["java.time.format.DecimalStyle" "java.lang.Object"])}
  (^boolean [^js/JSJoda.DecimalStyle this ^java.lang.Object obj]
   (.equals this obj)))
