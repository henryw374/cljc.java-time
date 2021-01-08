(ns cljc.java-time.zone-id 
  (:refer-clojure :exclude [get range format min max next name resolve short]))

(extend-protocol IEquiv
  js/Temporal.TimeZone
  (-equiv [o other] (= (.-id ^js/TemporalThing o) (.-id ^js/TemporalThing other))))

(extend-protocol IHash
  js/Temporal.TimeZone
  (-hash [o] (hash (.-id ^js/TemporalThing o))))

(defn system-default {:arglists (quote ([]))} []
  (js/Temporal.now.timeZone))

(clojure.core/defn of {:arglists (quote (["java.lang.String" "java.util.Map"]
                                         ["java.lang.String"]))}
  #_([^java.lang.String zone-id ^java.util.Map java-util-Map7581]
     (js/Temporal.TimeZone.from zone-id))
  ([zone-id]
   (js/Temporal.TimeZone.from zone-id)))

;todo - create rules obj which delegates to TimeZone nextTransition
;https://tc39.es/proposal-temporal/docs/timezone.html#getNextTransition
;(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneId"]))} (^js/JSJoda.ZoneRules [^js/JSJoda.ZoneId this7589] (.rules this7589)))

;; won't do
;(def short-ids (goog.object/get java.time.ZoneId "SHORT_IDS"))
;(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (js-invoke java.time.ZoneId "getAvailableZoneIds")))
;(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^js/JSJoda.ZoneId [^java.lang.String java-lang-String7583 ^js/JSJoda.ZoneOffset java-time-ZoneOffset7584] (js-invoke java.time.ZoneId "ofOffset" java-lang-String7583 java-time-ZoneOffset7584)))
;(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.ZoneId this7586 ^js/JSJoda.TextStyle java-time-format-TextStyle7587 ^java.util.Locale java-util-Locale7588] (.displayName this7586 java-time-format-TextStyle7587 java-util-Locale7588)))

;(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^js/JSJoda.ZoneId this7590] (.id this7590)))
;(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneId"]))} (^js/JSJoda.ZoneId [^js/JSJoda.ZoneId this7591] (.normalized this7591)))
;(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.ZoneId [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor7592] (js-invoke java.time.ZoneId "from" java-time-temporal-TemporalAccessor7592)))
;(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneId"]))} (^int [^js/JSJoda.ZoneId this7593] (.hashCode this7593)))
;(clojure.core/defn equals {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))} (^boolean [^js/JSJoda.ZoneId this7594 ^java.lang.Object java-lang-Object7595] (.equals this7594 java-lang-Object7595)))
