(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDate]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time LocalDate])))
(def max (. java.time.LocalDate -MAX))
(def min (. java.time.LocalDate -MIN))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1850 ^long long1851] (.minusWeeks this1850 long1851)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1852 ^long long1853] (.plusWeeks this1852 long1853)))
(clojure.core/defn length-of-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1854] (.lengthOfYear this1854)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalDate this1855 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1856] (.range this1855 java-time-temporal-TemporalField1856)))
(clojure.core/defn get-era {:arglists (quote (["java.time.LocalDate"]))} (^java.time.chrono.Era [^java.time.LocalDate this1857] (jti/getter era this1857)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"] ["int" "java.time.Month" "int"]))} (^java.time.LocalDate [G__1859 G__1860 G__1861] #? (:cljs (. java.time.LocalDate of G__1859 G__1860 G__1861) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1859) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1860) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1861)) (clojure.core/let [G__1859 (clojure.core/int G__1859) G__1860 (clojure.core/int G__1860) G__1861 (clojure.core/int G__1861)] (. java.time.LocalDate of G__1859 G__1860 G__1861)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1859) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__1860) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__1861)) (clojure.core/let [G__1859 (clojure.core/int G__1859) G__1860 ^"java.time.Month" G__1860 G__1861 (clojure.core/int G__1861)] (. java.time.LocalDate of G__1859 G__1860 G__1861)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1862 ^java.lang.Integer int1863] (.withMonth this1862 int1863)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1864 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1865] (.isEqual this1864 java-time-chrono-ChronoLocalDate1865)))
(clojure.core/defn get-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1866] (jti/getter year this1866)))
(clojure.core/defn to-epoch-day {:arglists (quote (["java.time.LocalDate"]))} (^long [^java.time.LocalDate this1867] (.toEpochDay this1867)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1868] (jti/getter dayOfYear this1868)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this1869 G__1870 G__1871] #? (:cljs (.plus ^java.time.LocalDate this1869 G__1870 G__1871) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1870) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1871)) (clojure.core/let [G__1870 (clojure.core/long G__1870) G__1871 ^"java.time.temporal.TemporalUnit" G__1871] (.plus ^java.time.LocalDate this1869 G__1870 G__1871)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1870) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1871)) (clojure.core/let [G__1870 (clojure.core/long G__1870) G__1871 ^"java.time.temporal.TemporalUnit" G__1871] (.plus ^java.time.LocalDate this1869 G__1870 G__1871)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1870) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1871)) (clojure.core/let [G__1870 (clojure.core/long G__1870) G__1871 ^"java.time.temporal.TemporalUnit" G__1871] (.plus ^java.time.LocalDate this1869 G__1870 G__1871)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1872 G__1873] #? (:cljs (.plus ^java.time.LocalDate this1872 G__1873) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1873)) (clojure.core/let [G__1873 ^"java.time.temporal.TemporalAmount" G__1873] (.plus ^java.time.LocalDate this1872 G__1873)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1873)) (clojure.core/let [G__1873 ^"java.time.temporal.TemporalAmount" G__1873] (.plus ^java.time.LocalDate this1872 G__1873)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1873)) (clojure.core/let [G__1873 ^"java.time.temporal.TemporalAmount" G__1873] (.plus ^java.time.LocalDate this1872 G__1873)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-leap-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1874] (.isLeapYear this1874)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalDate this1875 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery1876] (.query this1875 java-time-temporal-TemporalQuery1876)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.LocalDate"]))} (^java.time.DayOfWeek [^java.time.LocalDate this1877] (jti/getter dayOfWeek this1877)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.String [^java.time.LocalDate this1878] (.toString this1878)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1879 ^long long1880] (.plusMonths this1879 long1880)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1881 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1882] (.isBefore this1881 java-time-chrono-ChronoLocalDate1882)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1883 ^long long1884] (.minusMonths this1883 long1884)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this1885 G__1886 G__1887] #? (:cljs (.minus ^java.time.LocalDate this1885 G__1886 G__1887) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1886) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1887)) (clojure.core/let [G__1886 (clojure.core/long G__1886) G__1887 ^"java.time.temporal.TemporalUnit" G__1887] (.minus ^java.time.LocalDate this1885 G__1886 G__1887)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1886) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1887)) (clojure.core/let [G__1886 (clojure.core/long G__1886) G__1887 ^"java.time.temporal.TemporalUnit" G__1887] (.minus ^java.time.LocalDate this1885 G__1886 G__1887)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1886) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1887)) (clojure.core/let [G__1886 (clojure.core/long G__1886) G__1887 ^"java.time.temporal.TemporalUnit" G__1887] (.minus ^java.time.LocalDate this1885 G__1886 G__1887)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1888 G__1889] #? (:cljs (.minus ^java.time.LocalDate this1888 G__1889) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1889)) (clojure.core/let [G__1889 ^"java.time.temporal.TemporalAmount" G__1889] (.minus ^java.time.LocalDate this1888 G__1889)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1889)) (clojure.core/let [G__1889 ^"java.time.temporal.TemporalAmount" G__1889] (.minus ^java.time.LocalDate this1888 G__1889)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1889)) (clojure.core/let [G__1889 ^"java.time.temporal.TemporalAmount" G__1889] (.minus ^java.time.LocalDate this1888 G__1889)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1890 ^long long1891] (.plusDays this1890 long1891)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalDate this1892 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1893] (.getLong this1892 java-time-temporal-TemporalField1893)))
(clojure.core/defn with-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1894 ^java.lang.Integer int1895] (.withYear this1894 int1895)))
(clojure.core/defn length-of-month {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1896] (.lengthOfMonth this1896)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"] ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Object [this1897 G__1898] #? (:cljs (.until ^java.time.LocalDate this1897 G__1898) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1898)) (clojure.core/let [G__1898 ^"java.time.chrono.ChronoLocalDate" G__1898] (.until ^java.time.LocalDate this1897 G__1898)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1898)) (clojure.core/let [G__1898 ^"java.time.chrono.ChronoLocalDate" G__1898] (.until ^java.time.LocalDate this1897 G__1898)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^long [^java.time.LocalDate this1899 ^java.time.temporal.Temporal java-time-temporal-Temporal1900 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit1901] (.until this1899 java-time-temporal-Temporal1900 java-time-temporal-TemporalUnit1901)))
(clojure.core/defn of-epoch-day {:arglists (quote (["long"]))} (^java.time.LocalDate [^long long1902] (. java.time.LocalDate ofEpochDay long1902)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1903 ^java.lang.Integer int1904] (.withDayOfMonth this1903 int1904)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1905] (jti/getter dayOfMonth this1905)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalDate [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor1906] (. java.time.LocalDate from java-time-temporal-TemporalAccessor1906)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1907 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1908] (.isAfter this1907 java-time-chrono-ChronoLocalDate1908)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this1909 G__1910] #? (:cljs (.isSupported ^java.time.LocalDate this1909 G__1910) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1910)) (clojure.core/let [G__1910 ^"java.time.temporal.TemporalUnit" G__1910] (.isSupported ^java.time.LocalDate this1909 G__1910)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1910)) (clojure.core/let [G__1910 ^"java.time.temporal.TemporalField" G__1910] (.isSupported ^java.time.LocalDate this1909 G__1910)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1911 ^long long1912] (.minusYears this1911 long1912)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate"]))} (^java.lang.Object [this1913] #? (:cljs (jti/getter chronology ^java.time.LocalDate this1913) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.LocalDate this1913)) (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.LocalDate this1913)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.LocalDate [^java.lang.CharSequence java-lang-CharSequence1914 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter1915] (. java.time.LocalDate parse java-lang-CharSequence1914 java-time-format-DateTimeFormatter1915)) (^java.time.LocalDate [^java.lang.CharSequence java-lang-CharSequence1916] (. java.time.LocalDate parse java-lang-CharSequence1916)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1917] (.hashCode this1917)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalDate this1918 ^java.time.temporal.Temporal java-time-temporal-Temporal1919] (.adjustInto this1918 java-time-temporal-Temporal1919)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this1920 G__1921 G__1922] #? (:cljs (.with ^java.time.LocalDate this1920 G__1921 G__1922) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1921) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1922)) (clojure.core/let [G__1921 ^"java.time.temporal.TemporalField" G__1921 G__1922 (clojure.core/long G__1922)] (.with ^java.time.LocalDate this1920 G__1921 G__1922)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1921) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1922)) (clojure.core/let [G__1921 ^"java.time.temporal.TemporalField" G__1921 G__1922 (clojure.core/long G__1922)] (.with ^java.time.LocalDate this1920 G__1921 G__1922)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1921) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1922)) (clojure.core/let [G__1921 ^"java.time.temporal.TemporalField" G__1921 G__1922 (clojure.core/long G__1922)] (.with ^java.time.LocalDate this1920 G__1921 G__1922)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1923 G__1924] #? (:cljs (.with ^java.time.LocalDate this1923 G__1924) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1924)) (clojure.core/let [G__1924 ^"java.time.temporal.TemporalAdjuster" G__1924] (.with ^java.time.LocalDate this1923 G__1924)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1924)) (clojure.core/let [G__1924 ^"java.time.temporal.TemporalAdjuster" G__1924] (.with ^java.time.LocalDate this1923 G__1924)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1924)) (clojure.core/let [G__1924 ^"java.time.temporal.TemporalAdjuster" G__1924] (.with ^java.time.LocalDate this1923 G__1924)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))} (^java.time.LocalDate [] (. java.time.LocalDate now)) (^java.time.LocalDate [G__1926] #? (:cljs (. java.time.LocalDate now G__1926) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__1926)) (clojure.core/let [G__1926 ^"java.time.Clock" G__1926] (. java.time.LocalDate now G__1926)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__1926)) (clojure.core/let [G__1926 ^"java.time.ZoneId" G__1926] (. java.time.LocalDate now G__1926)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn at-start-of-day {:arglists (quote (["java.time.LocalDate" "java.time.ZoneId"] ["java.time.LocalDate"]))} (^java.time.ZonedDateTime [^java.time.LocalDate this1927 ^java.time.ZoneId java-time-ZoneId1928] (.atStartOfDay this1927 java-time-ZoneId1928)) (^java.time.LocalDateTime [^java.time.LocalDate this1929] (.atStartOfDay this1929)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1930] (jti/getter monthValue this1930)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1931 ^java.lang.Integer int1932] (.withDayOfYear this1931 int1932)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalDate" "java.lang.Object"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Integer [this1933 G__1934] #? (:cljs (.compareTo ^java.time.LocalDate this1933 G__1934) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__1934)) (clojure.core/let [G__1934 ^"java.lang.Object" G__1934] (.compareTo ^java.time.LocalDate this1933 G__1934)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1934)) (clojure.core/let [G__1934 ^"java.time.chrono.ChronoLocalDate" G__1934] (.compareTo ^java.time.LocalDate this1933 G__1934)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.LocalDate"]))} (^java.time.Month [^java.time.LocalDate this1935] (jti/getter month this1935)))
(clojure.core/defn of-year-day {:arglists (quote (["int" "int"]))} (^java.time.LocalDate [^java.lang.Integer int1936 ^java.lang.Integer int1937] (. java.time.LocalDate ofYearDay int1936 int1937)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalDate this1938 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1939] (.get this1938 java-time-temporal-TemporalField1939)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalDate" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalDate this1940 ^java.lang.Object java-lang-Object1941] (.equals this1940 java-lang-Object1941)))
(clojure.core/defn at-time {:arglists (quote (["java.time.LocalDate" "int" "int" "int" "int"] ["java.time.LocalDate" "int" "int"] ["java.time.LocalDate" "int" "int" "int"] ["java.time.LocalDate" "java.time.OffsetTime"] ["java.time.LocalDate" "java.time.LocalTime"] ["java.time.LocalDate" "java.time.LocalTime"]))} (^java.time.LocalDateTime [^java.time.LocalDate this1942 ^java.lang.Integer int1943 ^java.lang.Integer int1944 ^java.lang.Integer int1945 ^java.lang.Integer int1946] (.atTime this1942 int1943 int1944 int1945 int1946)) (^java.time.LocalDateTime [^java.time.LocalDate this1947 ^java.lang.Integer int1948 ^java.lang.Integer int1949] (.atTime this1947 int1948 int1949)) (^java.time.LocalDateTime [^java.time.LocalDate this1950 ^java.lang.Integer int1951 ^java.lang.Integer int1952 ^java.lang.Integer int1953] (.atTime this1950 int1951 int1952 int1953)) (^java.lang.Object [this1954 G__1955] #? (:cljs (.atTime ^java.time.LocalDate this1954 G__1955) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetTime") G__1955)) (clojure.core/let [G__1955 ^"java.time.OffsetTime" G__1955] (.atTime ^java.time.LocalDate this1954 G__1955)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__1955)) (clojure.core/let [G__1955 ^"java.time.LocalTime" G__1955] (.atTime ^java.time.LocalDate this1954 G__1955)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__1955)) (clojure.core/let [G__1955 ^"java.time.LocalTime" G__1955] (.atTime ^java.time.LocalDate this1954 G__1955)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn format {:arglists (quote (["java.time.LocalDate" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalDate this1956 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter1957] (.format this1956 java-time-format-DateTimeFormatter1957)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1958 ^long long1959] (.plusYears this1958 long1959)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1960 ^long long1961] (.minusDays this1960 long1961)))
