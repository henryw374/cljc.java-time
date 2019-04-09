(ns cljc.java-time.duration (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Duration]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Duration])))
(def zero (. java.time.Duration -ZERO))

(defn compare-to ([^java.time.Duration G__56311 G__56312] (.compareTo ^java.time.Duration G__56311 G__56312)))


(defn to-days ([^java.time.Duration G__56313] (.toDays ^java.time.Duration G__56313)))



(defn to-millis ([^java.time.Duration G__56314] (.toMillis ^java.time.Duration G__56314)))


(defn of-seconds ^java.time.Duration ([G__56316 G__56317] (. java.time.Duration ofSeconds G__56316 G__56317)) ([G__56319] (. java.time.Duration ofSeconds G__56319)))


(defn of-minutes ^java.time.Duration ([G__56321] (. java.time.Duration ofMinutes G__56321)))


(defn get-units ^java.util.List ([^java.time.Duration G__56322] (jti/getter units ^java.time.Duration G__56322)))


(defn of ^java.time.Duration ([G__56324 ^java.time.temporal.TemporalUnit G__56325] (. java.time.Duration of G__56324 ^java.time.temporal.TemporalUnit G__56325)))


(defn is-zero ([^java.time.Duration G__56326] (.isZero ^java.time.Duration G__56326)))


(defn minus-nanos ^java.time.Duration ([^java.time.Duration G__56327 G__56328] (.minusNanos ^java.time.Duration G__56327 G__56328)))


(defn of-hours ^java.time.Duration ([G__56330] (. java.time.Duration ofHours G__56330)))


(defn to-hours ([^java.time.Duration G__56331] (.toHours ^java.time.Duration G__56331)))



(defn to-minutes ([^java.time.Duration G__56332] (.toMinutes ^java.time.Duration G__56332)))


(defn with-nanos ^java.time.Duration ([^java.time.Duration G__56333 G__56334] (.withNanos ^java.time.Duration G__56333 G__56334)))


(defn get ([^java.time.Duration G__56335 ^java.time.temporal.TemporalUnit G__56336] (.get ^java.time.Duration G__56335 ^java.time.temporal.TemporalUnit G__56336)))


(defn minus-millis ^java.time.Duration ([^java.time.Duration G__56337 G__56338] (.minusMillis ^java.time.Duration G__56337 G__56338)))


(defn of-millis ^java.time.Duration ([G__56340] (. java.time.Duration ofMillis G__56340)))



(defn minus-seconds ^java.time.Duration ([^java.time.Duration G__56341 G__56342] (.minusSeconds ^java.time.Duration G__56341 G__56342)))


(defn minus-days ^java.time.Duration ([^java.time.Duration G__56343 G__56344] (.minusDays ^java.time.Duration G__56343 G__56344)))


(defn plus-hours ^java.time.Duration ([^java.time.Duration G__56345 G__56346] (.plusHours ^java.time.Duration G__56345 G__56346)))




(defn is-negative ([^java.time.Duration G__56347] (.isNegative ^java.time.Duration G__56347)))



(defn plus-seconds ^java.time.Duration ([^java.time.Duration G__56348 G__56349] (.plusSeconds ^java.time.Duration G__56348 G__56349)))



(defn plus-minutes ^java.time.Duration ([^java.time.Duration G__56350 G__56351] (.plusMinutes ^java.time.Duration G__56350 G__56351)))




(defn multiplied-by ^java.time.Duration ([^java.time.Duration G__56352 G__56353] (.multipliedBy ^java.time.Duration G__56352 G__56353)))


(defn minus ^java.time.Duration ([^java.time.Duration G__56354 ^java.time.Duration G__56355] (.minus ^java.time.Duration G__56354 ^java.time.Duration G__56355)) ([^java.time.Duration G__56356 G__56357 ^java.time.temporal.TemporalUnit G__56358] (.minus ^java.time.Duration G__56356 G__56357 ^java.time.temporal.TemporalUnit G__56358)))


(defn between ^java.time.Duration ([^java.time.temporal.Temporal G__56360 ^java.time.temporal.Temporal G__56361] (. java.time.Duration between ^java.time.temporal.Temporal G__56360 ^java.time.temporal.Temporal G__56361)))


(defn plus-nanos ^java.time.Duration ([^java.time.Duration G__56362 G__56363] (.plusNanos ^java.time.Duration G__56362 G__56363)))


(defn get-nano ([^java.time.Duration G__56364] (jti/getter nano ^java.time.Duration G__56364)))


(defn to-nanos ([^java.time.Duration G__56365] (.toNanos ^java.time.Duration G__56365)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Duration G__56366 ^java.time.temporal.Temporal G__56367] (.addTo ^java.time.Duration G__56366 ^java.time.temporal.Temporal G__56367)))


(defn to-string ^java.lang.String ([^java.time.Duration G__56368] (.toString ^java.time.Duration G__56368)))



(defn equals ([^java.time.Duration G__56369 ^java.lang.Object G__56370] (.equals ^java.time.Duration G__56369 ^java.lang.Object G__56370)))


(defn of-nanos ^java.time.Duration ([G__56372] (. java.time.Duration ofNanos G__56372)))


(defn plus-millis ^java.time.Duration ([^java.time.Duration G__56373 G__56374] (.plusMillis ^java.time.Duration G__56373 G__56374)))


(defn with-seconds ^java.time.Duration ([^java.time.Duration G__56375 G__56376] (.withSeconds ^java.time.Duration G__56375 G__56376)))


(defn minus-hours ^java.time.Duration ([^java.time.Duration G__56377 G__56378] (.minusHours ^java.time.Duration G__56377 G__56378)))


(defn get-seconds ([^java.time.Duration G__56379] (jti/getter seconds ^java.time.Duration G__56379)))


(defn plus-days ^java.time.Duration ([^java.time.Duration G__56380 G__56381] (.plusDays ^java.time.Duration G__56380 G__56381)))



(defn hash-code ([^java.time.Duration G__56382] (.hashCode ^java.time.Duration G__56382)))



(defn abs ^java.time.Duration ([^java.time.Duration G__56383] (.abs ^java.time.Duration G__56383)))


(defn of-days ^java.time.Duration ([G__56385] (. java.time.Duration ofDays G__56385)))


(defn from ^java.time.Duration ([^java.time.temporal.TemporalAmount G__56387] (. java.time.Duration from ^java.time.temporal.TemporalAmount G__56387)))


(defn parse ^java.time.Duration ([^java.lang.CharSequence G__56389] (. java.time.Duration parse ^java.lang.CharSequence G__56389)))


(defn plus ^java.time.Duration ([^java.time.Duration G__56390 ^java.time.Duration G__56391] (.plus ^java.time.Duration G__56390 ^java.time.Duration G__56391)) ([^java.time.Duration G__56392 G__56393 G__56394] (.plus ^java.time.Duration G__56392 G__56393 G__56394)))


(defn divided-by ^java.time.Duration ([^java.time.Duration G__56395 G__56396] (.dividedBy ^java.time.Duration G__56395 G__56396)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Duration G__56397 ^java.time.temporal.Temporal G__56398] (.subtractFrom ^java.time.Duration G__56397 ^java.time.temporal.Temporal G__56398)))



(defn negated ^java.time.Duration ([^java.time.Duration G__56399] (.negated ^java.time.Duration G__56399)))




(defn minus-minutes ^java.time.Duration ([^java.time.Duration G__56400 G__56401] (.minusMinutes ^java.time.Duration G__56400 G__56401)))

