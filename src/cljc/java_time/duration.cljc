(ns cljc.java-time.duration (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Duration]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Duration])))
(def zero (. java.time.Duration -ZERO))

(defn compare-to ([^java.time.Duration G__47238 G__47239] (.compareTo ^java.time.Duration G__47238 G__47239)))


(defn to-days ([^java.time.Duration G__47240] (.toDays ^java.time.Duration G__47240)))



(defn to-millis ([^java.time.Duration G__47241] (.toMillis ^java.time.Duration G__47241)))


(defn of-seconds ^java.time.Duration ([G__47243 G__47244] (. java.time.Duration ofSeconds G__47243 G__47244)) ([G__47246] (. java.time.Duration ofSeconds G__47246)))


(defn of-minutes ^java.time.Duration ([G__47248] (. java.time.Duration ofMinutes G__47248)))


(defn get-units ^java.util.List ([^java.time.Duration G__47249] (jti/getter units ^java.time.Duration G__47249)))


(defn of ^java.time.Duration ([G__47251 ^java.time.temporal.TemporalUnit G__47252] (. java.time.Duration of G__47251 ^java.time.temporal.TemporalUnit G__47252)))


(defn is-zero ([^java.time.Duration G__47253] (.isZero ^java.time.Duration G__47253)))


(defn minus-nanos ^java.time.Duration ([^java.time.Duration G__47254 G__47255] (.minusNanos ^java.time.Duration G__47254 G__47255)))


(defn of-hours ^java.time.Duration ([G__47257] (. java.time.Duration ofHours G__47257)))


(defn to-hours ([^java.time.Duration G__47258] (.toHours ^java.time.Duration G__47258)))



(defn to-minutes ([^java.time.Duration G__47259] (.toMinutes ^java.time.Duration G__47259)))


(defn with-nanos ^java.time.Duration ([^java.time.Duration G__47260 G__47261] (.withNanos ^java.time.Duration G__47260 G__47261)))


(defn get ([^java.time.Duration G__47262 ^java.time.temporal.TemporalUnit G__47263] (.get ^java.time.Duration G__47262 ^java.time.temporal.TemporalUnit G__47263)))


(defn minus-millis ^java.time.Duration ([^java.time.Duration G__47264 G__47265] (.minusMillis ^java.time.Duration G__47264 G__47265)))


(defn of-millis ^java.time.Duration ([G__47267] (. java.time.Duration ofMillis G__47267)))



(defn minus-seconds ^java.time.Duration ([^java.time.Duration G__47268 G__47269] (.minusSeconds ^java.time.Duration G__47268 G__47269)))


(defn minus-days ^java.time.Duration ([^java.time.Duration G__47270 G__47271] (.minusDays ^java.time.Duration G__47270 G__47271)))


(defn plus-hours ^java.time.Duration ([^java.time.Duration G__47272 G__47273] (.plusHours ^java.time.Duration G__47272 G__47273)))




(defn is-negative ([^java.time.Duration G__47274] (.isNegative ^java.time.Duration G__47274)))



(defn plus-seconds ^java.time.Duration ([^java.time.Duration G__47275 G__47276] (.plusSeconds ^java.time.Duration G__47275 G__47276)))



(defn plus-minutes ^java.time.Duration ([^java.time.Duration G__47277 G__47278] (.plusMinutes ^java.time.Duration G__47277 G__47278)))




(defn multiplied-by ^java.time.Duration ([^java.time.Duration G__47279 G__47280] (.multipliedBy ^java.time.Duration G__47279 G__47280)))


(defn minus ^java.time.Duration ([^java.time.Duration G__47281 ^java.time.Duration G__47282] (.minus ^java.time.Duration G__47281 ^java.time.Duration G__47282)) ([^java.time.Duration G__47283 G__47284 ^java.time.temporal.TemporalUnit G__47285] (.minus ^java.time.Duration G__47283 G__47284 ^java.time.temporal.TemporalUnit G__47285)))


(defn between ^java.time.Duration ([^java.time.temporal.Temporal G__47287 ^java.time.temporal.Temporal G__47288] (. java.time.Duration between ^java.time.temporal.Temporal G__47287 ^java.time.temporal.Temporal G__47288)))


(defn plus-nanos ^java.time.Duration ([^java.time.Duration G__47289 G__47290] (.plusNanos ^java.time.Duration G__47289 G__47290)))


(defn get-nano ([^java.time.Duration G__47291] (jti/getter nano ^java.time.Duration G__47291)))


(defn to-nanos ([^java.time.Duration G__47292] (.toNanos ^java.time.Duration G__47292)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Duration G__47293 ^java.time.temporal.Temporal G__47294] (.addTo ^java.time.Duration G__47293 ^java.time.temporal.Temporal G__47294)))


(defn to-string ^java.lang.String ([^java.time.Duration G__47295] (.toString ^java.time.Duration G__47295)))



(defn equals ([^java.time.Duration G__47296 ^java.lang.Object G__47297] (.equals ^java.time.Duration G__47296 ^java.lang.Object G__47297)))


(defn of-nanos ^java.time.Duration ([G__47299] (. java.time.Duration ofNanos G__47299)))


(defn plus-millis ^java.time.Duration ([^java.time.Duration G__47300 G__47301] (.plusMillis ^java.time.Duration G__47300 G__47301)))


(defn with-seconds ^java.time.Duration ([^java.time.Duration G__47302 G__47303] (.withSeconds ^java.time.Duration G__47302 G__47303)))


(defn minus-hours ^java.time.Duration ([^java.time.Duration G__47304 G__47305] (.minusHours ^java.time.Duration G__47304 G__47305)))


(defn get-seconds ([^java.time.Duration G__47306] (jti/getter seconds ^java.time.Duration G__47306)))


(defn plus-days ^java.time.Duration ([^java.time.Duration G__47307 G__47308] (.plusDays ^java.time.Duration G__47307 G__47308)))



(defn hash-code ([^java.time.Duration G__47309] (.hashCode ^java.time.Duration G__47309)))



(defn abs ^java.time.Duration ([^java.time.Duration G__47310] (.abs ^java.time.Duration G__47310)))


(defn of-days ^java.time.Duration ([G__47312] (. java.time.Duration ofDays G__47312)))


(defn from ^java.time.Duration ([^java.time.temporal.TemporalAmount G__47314] (. java.time.Duration from ^java.time.temporal.TemporalAmount G__47314)))


(defn parse ^java.time.Duration ([^java.lang.CharSequence G__47316] (. java.time.Duration parse ^java.lang.CharSequence G__47316)))


(defn plus ^java.time.Duration ([^java.time.Duration G__47317 ^java.time.Duration G__47318] (.plus ^java.time.Duration G__47317 ^java.time.Duration G__47318)) ([^java.time.Duration G__47319 G__47320 G__47321] (.plus ^java.time.Duration G__47319 G__47320 G__47321)))


(defn divided-by ^java.time.Duration ([^java.time.Duration G__47322 G__47323] (.dividedBy ^java.time.Duration G__47322 G__47323)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Duration G__47324 ^java.time.temporal.Temporal G__47325] (.subtractFrom ^java.time.Duration G__47324 ^java.time.temporal.Temporal G__47325)))



(defn negated ^java.time.Duration ([^java.time.Duration G__47326] (.negated ^java.time.Duration G__47326)))




(defn minus-minutes ^java.time.Duration ([^java.time.Duration G__47327 G__47328] (.minusMinutes ^java.time.Duration G__47327 G__47328)))

