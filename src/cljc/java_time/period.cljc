(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Period]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time Period])))
(def zero (. java.time.Period -ZERO))
(clojure.core/defn get-months {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this1795] (jti/getter months this1795)))
(clojure.core/defn of-weeks {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int1796] (. java.time.Period ofWeeks int1796)))
(clojure.core/defn of-days {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int1797] (. java.time.Period ofDays int1797)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this1798] (.isNegative this1798)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"]))} (^java.time.Period [^java.lang.Integer int1799 ^java.lang.Integer int1800 ^java.lang.Integer int1801] (. java.time.Period of int1799 int1800 int1801)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this1802] (.isZero this1802)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Period" "int"] ["java.time.Period" "int"]))} (^java.lang.Object [this1803 G__1804] #? (:cljs (.multipliedBy ^java.time.Period this1803 G__1804) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1804)) (clojure.core/let [G__1804 (clojure.core/int G__1804)] (.multipliedBy ^java.time.Period this1803 G__1804)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1804)) (clojure.core/let [G__1804 (clojure.core/int G__1804)] (.multipliedBy ^java.time.Period this1803 G__1804)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-units {:arglists (quote (["java.time.Period"]))} (^java.util.List [^java.time.Period this1805] (jti/getter units this1805)))
(clojure.core/defn with-days {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this1806 ^java.lang.Integer int1807] (.withDays this1806 int1807)))
(clojure.core/defn plus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"] ["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this1808 G__1809] #? (:cljs (.plus ^java.time.Period this1808 G__1809) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1809)) (clojure.core/let [G__1809 ^"java.time.temporal.TemporalAmount" G__1809] (.plus ^java.time.Period this1808 G__1809)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1809)) (clojure.core/let [G__1809 ^"java.time.temporal.TemporalAmount" G__1809] (.plus ^java.time.Period this1808 G__1809)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn of-months {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int1810] (. java.time.Period ofMonths int1810)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Period"]))} (^java.lang.String [^java.time.Period this1811] (.toString this1811)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1812 ^long long1813] (.plusMonths this1812 long1813)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1814 ^long long1815] (.minusMonths this1814 long1815)))
(clojure.core/defn minus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"] ["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this1816 G__1817] #? (:cljs (.minus ^java.time.Period this1816 G__1817) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1817)) (clojure.core/let [G__1817 ^"java.time.temporal.TemporalAmount" G__1817] (.minus ^java.time.Period this1816 G__1817)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1817)) (clojure.core/let [G__1817 ^"java.time.temporal.TemporalAmount" G__1817] (.minus ^java.time.Period this1816 G__1817)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn add-to {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this1818 ^java.time.temporal.Temporal java-time-temporal-Temporal1819] (.addTo this1818 java-time-temporal-Temporal1819)))
(clojure.core/defn to-total-months {:arglists (quote (["java.time.Period"]))} (^long [^java.time.Period this1820] (.toTotalMonths this1820)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1821 ^long long1822] (.plusDays this1821 long1822)))
(clojure.core/defn of-years {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int1823] (. java.time.Period ofYears int1823)))
(clojure.core/defn get-days {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this1824] (jti/getter days this1824)))
(clojure.core/defn negated {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this1825] #? (:cljs (.negated ^java.time.Period this1825) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.negated ^java.time.Period this1825)) (clojure.core/and) (clojure.core/let [] (.negated ^java.time.Period this1825)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-years {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this1826] (jti/getter years this1826)))
(clojure.core/defn with-years {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this1827 ^java.lang.Integer int1828] (.withYears this1827 int1828)))
(clojure.core/defn normalized {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this1829] #? (:cljs (.normalized ^java.time.Period this1829) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.normalized ^java.time.Period this1829)) (clojure.core/and) (clojure.core/let [] (.normalized ^java.time.Period this1829)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-months {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this1830 ^java.lang.Integer int1831] (.withMonths this1830 int1831)))
(clojure.core/defn between {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))} (^java.time.Period [^java.time.LocalDate java-time-LocalDate1832 ^java.time.LocalDate java-time-LocalDate1833] (. java.time.Period between java-time-LocalDate1832 java-time-LocalDate1833)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount1834] (. java.time.Period from java-time-temporal-TemporalAmount1834)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1835 ^long long1836] (.minusYears this1835 long1836)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this1837] #? (:cljs (jti/getter chronology ^java.time.Period this1837) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.Period this1837)) (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.Period this1837)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Period [^java.lang.CharSequence java-lang-CharSequence1838] (. java.time.Period parse java-lang-CharSequence1838)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this1839] (.hashCode this1839)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this1840 ^java.time.temporal.Temporal java-time-temporal-Temporal1841] (.subtractFrom this1840 java-time-temporal-Temporal1841)))
(clojure.core/defn get {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Period this1842 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit1843] (.get this1842 java-time-temporal-TemporalUnit1843)))
(clojure.core/defn equals {:arglists (quote (["java.time.Period" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Period this1844 ^java.lang.Object java-lang-Object1845] (.equals this1844 java-lang-Object1845)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1846 ^long long1847] (.plusYears this1846 long1847)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this1848 ^long long1849] (.minusDays this1848 long1849)))
