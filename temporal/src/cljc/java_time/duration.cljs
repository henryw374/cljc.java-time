(ns cljc.java-time.duration 
  (:refer-clojure :exclude [get range format min max next name resolve short]))

(extend-protocol IHash
  js/Temporal.Duration
  (-hash [o] (hash (str o))))

(extend-protocol IComparable
  js/Temporal.Duration
  (-compare [x y] (js/Temporal.Duration.compare x y)))

(extend-protocol IEquiv
  js/Temporal.Duration
  (-equiv [o other] (zero? (compare o other))))

(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))}
  (^js [^java.lang.CharSequence java-lang-CharSequence8167]
   (js/Temporal.Duration.from java-lang-CharSequence8167)
   ;(js-invoke java.time.Duration "parse" java-lang-CharSequence8167)
   ))

(def zero (parse "P0D"))

(clojure.core/defn is-negative {:arglists (quote (["java.time.Duration"]))} 
  (^boolean [^js/Temporal.Duration this8116] (neg? (.-sign this8116))))

(clojure.core/defn negated {:arglists (quote (["java.time.Duration"]))} (^js [^js this8159] (.negated this8159)))

;(clojure.core/defn minus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8108 ^long long8109] (.minusMinutes this8108 long8109)))
;(clojure.core/defn to-nanos {:arglists (quote (["java.time.Duration"]))} (^long [^js this8110] (.toNanos this8110)))
;(clojure.core/defn minus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8111 ^long long8112] (.minusMillis this8111 long8112)))
;(clojure.core/defn minus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8113 ^long long8114] (.minusHours this8113 long8114)))
;(clojure.core/defn of-days {:arglists (quote (["long"]))} (^js [^long long8115] (js-invoke java.time.Duration "ofDays" long8115)))

;(clojure.core/defn of {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))} (^js [^long long8117 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit8118] (js-invoke java.time.Duration "of" long8117 java-time-temporal-TemporalUnit8118)))
;(clojure.core/defn is-zero {:arglists (quote (["java.time.Duration"]))} (^boolean [^js this8119] (.isZero this8119)))
;(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8120 ^long long8121] (.multipliedBy this8120 long8121)))
;(clojure.core/defn with-nanos {:arglists (quote (["java.time.Duration" "int"]))} (^js [^js this8122 ^int int8123] (.withNanos this8122 int8123)))
;(clojure.core/defn get-units {:arglists (quote (["java.time.Duration"]))} (^java.util.List [^js this8124] (.units this8124)))
;(clojure.core/defn get-nano {:arglists (quote (["java.time.Duration"]))} (^int [^js this8125] (.nano this8125)))
;(clojure.core/defn plus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8126 ^long long8127] (.plusMillis this8126 long8127)))
;(clojure.core/defn to-minutes {:arglists (quote (["java.time.Duration"]))} (^long [^js this8128] (.toMinutes this8128)))
;(clojure.core/defn minus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8129 ^long long8130] (.minusSeconds this8129 long8130)))
;(clojure.core/defn plus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8131 ^long long8132] (.plusNanos this8131 long8132)))
(clojure.core/defn plus {:arglists
                         (quote (["java.time.Duration" "java.time.Duration"]
                                 ;["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]
                                 ))} 
  (^js [^js this8133 ^js java-time-Duration8134] 
   (.add this8133 java-time-Duration8134)) 
  #_(^js [^js this8135 ^long long8136 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit8137] (.plus this8135 long8136 java-time-temporal-TemporalUnit8137)))
;(clojure.core/defn divided-by {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8138 ^long long8139] (.dividedBy this8138 long8139)))
;(clojure.core/defn plus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8140 ^long long8141] (.plusMinutes this8140 long8141)))

(clojure.core/defn minus {:arglists
                         (quote (["java.time.Duration" "java.time.Duration"]
                                 ;["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]
                                 ))}
  (^js [^js this8133 ^js java-time-Duration8134]
   (.subtract this8133 java-time-Duration8134))
;(clojure.core/defn add-to {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js this8148 ^js/JSJoda.Temporal java-time-temporal-Temporal8149] (.addTo this8148 java-time-temporal-Temporal8149)))
;(clojure.core/defn plus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8150 ^long long8151] (.plusHours this8150 long8151)))
;(clojure.core/defn plus-days {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8152 ^long long8153] (.plusDays this8152 long8153)))
;(clojure.core/defn of-hours {:arglists (quote (["long"]))} (^js [^long long8154] (js-invoke java.time.Duration "ofHours" long8154)))
;(clojure.core/defn to-millis {:arglists (quote (["java.time.Duration"]))} (^long [^js this8155] (.toMillis this8155)))
;(clojure.core/defn to-hours {:arglists (quote (["java.time.Duration"]))} (^long [^js this8156] (.toHours this8156)))
;(clojure.core/defn of-nanos {:arglists (quote (["long"]))} (^js [^long long8157] (js-invoke java.time.Duration "ofNanos" long8157)))
;(clojure.core/defn of-millis {:arglists (quote (["long"]))} (^js [^long long8158] (js-invoke java.time.Duration "ofMillis" long8158)))

;(clojure.core/defn abs {:arglists (quote (["java.time.Duration"]))} (^js [^js this8160] (.abs this8160)))
;(clojure.core/defn between {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^js [^js/JSJoda.Temporal java-time-temporal-Temporal8161 ^js/JSJoda.Temporal java-time-temporal-Temporal8162] (js-invoke java.time.Duration "between" java-time-temporal-Temporal8161 java-time-temporal-Temporal8162)))
;(clojure.core/defn get-seconds {:arglists (quote (["java.time.Duration"]))} (^long [^js this8163] (.seconds this8163)))
;(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^js [^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount8164] (js-invoke java.time.Duration "from" java-time-temporal-TemporalAmount8164)))
;(clojure.core/defn minus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8165 ^long long8166] (.minusNanos this8165 long8166)))
;(clojure.core/defn with-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8169 ^long long8170] (.withSeconds this8169 long8170)))
;(clojure.core/defn of-minutes {:arglists (quote (["long"]))} (^js [^long long8171] (js-invoke java.time.Duration "ofMinutes" long8171)))
;(clojure.core/defn subtract-from {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js this8172 ^js/JSJoda.Temporal java-time-temporal-Temporal8173] (.subtractFrom this8172 java-time-temporal-Temporal8173)))
;(clojure.core/defn compare-to {:arglists (quote (["java.time.Duration" "java.time.Duration"] ["java.time.Duration" "java.lang.Object"]))} (^int [this8174 G__8175] (.compareTo ^js this8174 G__8175)))
;(clojure.core/defn plus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8176 ^long long8177] (.plusSeconds this8176 long8177)))
;(clojure.core/defn get {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))} (^long [^js this8178 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit8179] (.get this8178 java-time-temporal-TemporalUnit8179)))
;(clojure.core/defn of-seconds {:arglists (quote (["long"] ["long" "long"]))} (^js [^long long8182] (js-invoke java.time.Duration "ofSeconds" long8182)) (^js [^long long8183 ^long long8184] (js-invoke java.time.Duration "ofSeconds" long8183 long8184)))
;(clojure.core/defn minus-days {:arglists (quote (["java.time.Duration" "long"]))} (^js [^js this8185 ^long long8186] (.minusDays this8185 long8186)))
;(clojure.core/defn to-days {:arglists (quote (["java.time.Duration"]))} (^long [^js this8187] (.toDays this8187)))

