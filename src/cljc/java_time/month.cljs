(ns cljc.java-time.month (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time :refer [Month]]))
(def may (goog.object/get java.time.Month "MAY"))
(def december (goog.object/get java.time.Month "DECEMBER"))
(def june (goog.object/get java.time.Month "JUNE"))
(def september (goog.object/get java.time.Month "SEPTEMBER"))
(def february (goog.object/get java.time.Month "FEBRUARY"))
(def january (goog.object/get java.time.Month "JANUARY"))
(def november (goog.object/get java.time.Month "NOVEMBER"))
(def august (goog.object/get java.time.Month "AUGUST"))
(def july (goog.object/get java.time.Month "JULY"))
(def march (goog.object/get java.time.Month "MARCH"))
(def october (goog.object/get java.time.Month "OCTOBER"))
(def april (goog.object/get java.time.Month "APRIL"))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.Month this14803 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14804] (.range this14803 java-time-temporal-TemporalField14804)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.Month "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.Month [^java.lang.String java-lang-String14805] (js-invoke java.time.Month "valueOf" java-lang-String14805)) (^java.lang.Enum [^java.lang.Class java-lang-Class14806 ^java.lang.String java-lang-String14807] (js-invoke java.time.Month "valueOf" java-lang-Class14806 java-lang-String14807)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^js/JSJoda.Month [^int int14808] (js-invoke java.time.Month "of" int14808)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this14809] (.ordinal this14809)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^js/JSJoda.Month [^js/JSJoda.Month this14810] (.firstMonthOfQuarter this14810)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this14811] (.minLength this14811)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this14812 ^long long14813] (.plus this14812 long14813)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.Month this14814 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery14815] (.query this14814 java-time-temporal-TemporalQuery14815)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this14816] (.toString this14816)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this14817 ^boolean boolean14818] (.firstDayOfYear this14817 boolean14818)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this14819 ^long long14820] (.minus this14819 long14820)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.Month this14821 ^js/JSJoda.TextStyle java-time-format-TextStyle14822 ^java.util.Locale java-util-Locale14823] (.displayName this14821 java-time-format-TextStyle14822 java-util-Locale14823)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this14824] (.value this14824)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this14825] (.maxLength this14825)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this14826] (.name this14826)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.Month this14827 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14828] (.getLong this14827 java-time-temporal-TemporalField14828)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this14829 ^boolean boolean14830] (.length this14829 boolean14830)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^js/JSJoda.Month this14831] (.declaringClass this14831)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor14832] (js-invoke java.time.Month "from" java-time-temporal-TemporalAccessor14832)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.Month this14833 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14834] (.isSupported this14833 java-time-temporal-TemporalField14834)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this14835] (.hashCode this14835)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Month this14836 ^js/JSJoda.Temporal java-time-temporal-Temporal14837] (.adjustInto this14836 java-time-temporal-Temporal14837)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Enum"]))} (^int [^js/JSJoda.Month this14838 ^java.lang.Enum java-lang-Enum14839] (.compareTo this14838 java-lang-Enum14839)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.Month this14840 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14841] (.get this14840 java-time-temporal-TemporalField14841)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^boolean [^js/JSJoda.Month this14842 ^java.lang.Object java-lang-Object14843] (.equals this14842 java-lang-Object14843)))
