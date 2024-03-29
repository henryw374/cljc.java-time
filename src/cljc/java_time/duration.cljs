(ns cljc.java-time.duration (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time :refer [Duration]]))
(def zero (goog.object/get java.time.Duration "ZERO"))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15016 ^long long15017] (.minusMinutes this15016 long15017)))
(clojure.core/defn to-nanos {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15018] (.toNanos this15018)))
(clojure.core/defn minus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15019 ^long long15020] (.minusMillis this15019 long15020)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15021 ^long long15022] (.minusHours this15021 long15022)))
(clojure.core/defn of-days {:arglists (quote (["long"]))} (^js/JSJoda.Duration [^long long15023] (js-invoke java.time.Duration "ofDays" long15023)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Duration"]))} (^boolean [^js/JSJoda.Duration this15024] (.isNegative this15024)))
(clojure.core/defn of {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Duration [^long long15025 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit15026] (js-invoke java.time.Duration "of" long15025 java-time-temporal-TemporalUnit15026)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Duration"]))} (^boolean [^js/JSJoda.Duration this15027] (.isZero this15027)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15028 ^long long15029] (.multipliedBy this15028 long15029)))
(clojure.core/defn with-nanos {:arglists (quote (["java.time.Duration" "int"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15030 ^int int15031] (.withNanos this15030 int15031)))
(clojure.core/defn get-units {:arglists (quote (["java.time.Duration"]))} (^java.util.List [^js/JSJoda.Duration this15032] (.units this15032)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.Duration"]))} (^int [^js/JSJoda.Duration this15033] (.nano this15033)))
(clojure.core/defn plus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15034 ^long long15035] (.plusMillis this15034 long15035)))
(clojure.core/defn to-minutes {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15036] (.toMinutes this15036)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15037 ^long long15038] (.minusSeconds this15037 long15038)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15039 ^long long15040] (.plusNanos this15039 long15040)))
(clojure.core/defn plus {:arglists (quote (["java.time.Duration" "java.time.Duration"] ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15041 ^js/JSJoda.Duration java-time-Duration15042] (.plus this15041 java-time-Duration15042)) (^js/JSJoda.Duration [^js/JSJoda.Duration this15043 ^long long15044 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit15045] (.plus this15043 long15044 java-time-temporal-TemporalUnit15045)))
(clojure.core/defn divided-by {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15046 ^long long15047] (.dividedBy this15046 long15047)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15048 ^long long15049] (.plusMinutes this15048 long15049)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Duration"]))} (^java.lang.String [^js/JSJoda.Duration this15050] (.toString this15050)))
(clojure.core/defn minus {:arglists (quote (["java.time.Duration" "java.time.Duration"] ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15051 ^js/JSJoda.Duration java-time-Duration15052] (.minus this15051 java-time-Duration15052)) (^js/JSJoda.Duration [^js/JSJoda.Duration this15053 ^long long15054 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit15055] (.minus this15053 long15054 java-time-temporal-TemporalUnit15055)))
(clojure.core/defn add-to {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Duration this15056 ^js/JSJoda.Temporal java-time-temporal-Temporal15057] (.addTo this15056 java-time-temporal-Temporal15057)))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15058 ^long long15059] (.plusHours this15058 long15059)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15060 ^long long15061] (.plusDays this15060 long15061)))
(clojure.core/defn of-hours {:arglists (quote (["long"]))} (^js/JSJoda.Duration [^long long15062] (js-invoke java.time.Duration "ofHours" long15062)))
(clojure.core/defn to-millis {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15063] (.toMillis this15063)))
(clojure.core/defn to-hours {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15064] (.toHours this15064)))
(clojure.core/defn of-nanos {:arglists (quote (["long"]))} (^js/JSJoda.Duration [^long long15065] (js-invoke java.time.Duration "ofNanos" long15065)))
(clojure.core/defn of-millis {:arglists (quote (["long"]))} (^js/JSJoda.Duration [^long long15066] (js-invoke java.time.Duration "ofMillis" long15066)))
(clojure.core/defn negated {:arglists (quote (["java.time.Duration"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15067] (.negated this15067)))
(clojure.core/defn abs {:arglists (quote (["java.time.Duration"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15068] (.abs this15068)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^js/JSJoda.Duration [^js/JSJoda.Temporal java-time-temporal-Temporal15069 ^js/JSJoda.Temporal java-time-temporal-Temporal15070] (js-invoke java.time.Duration "between" java-time-temporal-Temporal15069 java-time-temporal-Temporal15070)))
(clojure.core/defn get-seconds {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15071] (.seconds this15071)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^js/JSJoda.Duration [^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount15072] (js-invoke java.time.Duration "from" java-time-temporal-TemporalAmount15072)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15073 ^long long15074] (.minusNanos this15073 long15074)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^js/JSJoda.Duration [^java.lang.CharSequence java-lang-CharSequence15075] (js-invoke java.time.Duration "parse" java-lang-CharSequence15075)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Duration"]))} (^int [^js/JSJoda.Duration this15076] (.hashCode this15076)))
(clojure.core/defn with-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15077 ^long long15078] (.withSeconds this15077 long15078)))
(clojure.core/defn of-minutes {:arglists (quote (["long"]))} (^js/JSJoda.Duration [^long long15079] (js-invoke java.time.Duration "ofMinutes" long15079)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Duration this15080 ^js/JSJoda.Temporal java-time-temporal-Temporal15081] (.subtractFrom this15080 java-time-temporal-Temporal15081)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Duration" "java.time.Duration"]))} (^int [^js/JSJoda.Duration this15082 ^js/JSJoda.Duration java-time-Duration15083] (.compareTo this15082 java-time-Duration15083)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15084 ^long long15085] (.plusSeconds this15084 long15085)))
(clojure.core/defn get {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))} (^long [^js/JSJoda.Duration this15086 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit15087] (.get this15086 java-time-temporal-TemporalUnit15087)))
(clojure.core/defn equals {:arglists (quote (["java.time.Duration" "java.lang.Object"]))} (^boolean [^js/JSJoda.Duration this15088 ^java.lang.Object java-lang-Object15089] (.equals this15088 java-lang-Object15089)))
(clojure.core/defn of-seconds {:arglists (quote (["long" "long"] ["long"]))} (^js/JSJoda.Duration [^long long15090 ^long long15091] (js-invoke java.time.Duration "ofSeconds" long15090 long15091)) (^js/JSJoda.Duration [^long long15092] (js-invoke java.time.Duration "ofSeconds" long15092)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Duration" "long"]))} (^js/JSJoda.Duration [^js/JSJoda.Duration this15093 ^long long15094] (.minusDays this15093 long15094)))
(clojure.core/defn to-days {:arglists (quote (["java.time.Duration"]))} (^long [^js/JSJoda.Duration this15095] (.toDays this15095)))
