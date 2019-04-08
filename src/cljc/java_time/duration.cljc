(ns cljc.java-time.duration (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Duration]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Duration])))

(defn compare-to ([^java.time.Duration G__36602 G__36603] (.compareTo ^java.time.Duration G__36602 G__36603)))


(defn to-days ([^java.time.Duration G__36604] (.toDays ^java.time.Duration G__36604)))



(defn to-millis ([^java.time.Duration G__36605] (.toMillis ^java.time.Duration G__36605)))


(defn of-seconds ^java.time.Duration ([G__36607 G__36608] (. java.time.Duration ofSeconds G__36607 G__36608)) ([G__36610] (. java.time.Duration ofSeconds G__36610)))


(defn of-minutes ^java.time.Duration ([G__36612] (. java.time.Duration ofMinutes G__36612)))


(defn get-units ^java.util.List ([^java.time.Duration G__36613] (jti/getter units ^java.time.Duration G__36613)))


(defn of ^java.time.Duration ([G__36615 ^java.time.temporal.TemporalUnit G__36616] (. java.time.Duration of G__36615 ^java.time.temporal.TemporalUnit G__36616)))


(defn is-zero ([^java.time.Duration G__36617] (.isZero ^java.time.Duration G__36617)))


(defn minus-nanos ^java.time.Duration ([^java.time.Duration G__36618 G__36619] (.minusNanos ^java.time.Duration G__36618 G__36619)))


(defn of-hours ^java.time.Duration ([G__36621] (. java.time.Duration ofHours G__36621)))


(defn to-hours ([^java.time.Duration G__36622] (.toHours ^java.time.Duration G__36622)))



(defn to-minutes ([^java.time.Duration G__36623] (.toMinutes ^java.time.Duration G__36623)))


(defn with-nanos ^java.time.Duration ([^java.time.Duration G__36624 G__36625] (.withNanos ^java.time.Duration G__36624 G__36625)))


(defn get ([^java.time.Duration G__36626 ^java.time.temporal.TemporalUnit G__36627] (.get ^java.time.Duration G__36626 ^java.time.temporal.TemporalUnit G__36627)))


(defn minus-millis ^java.time.Duration ([^java.time.Duration G__36628 G__36629] (.minusMillis ^java.time.Duration G__36628 G__36629)))


(defn of-millis ^java.time.Duration ([G__36631] (. java.time.Duration ofMillis G__36631)))



(defn minus-seconds ^java.time.Duration ([^java.time.Duration G__36632 G__36633] (.minusSeconds ^java.time.Duration G__36632 G__36633)))


(defn minus-days ^java.time.Duration ([^java.time.Duration G__36634 G__36635] (.minusDays ^java.time.Duration G__36634 G__36635)))


(defn plus-hours ^java.time.Duration ([^java.time.Duration G__36636 G__36637] (.plusHours ^java.time.Duration G__36636 G__36637)))




(defn is-negative ([^java.time.Duration G__36638] (.isNegative ^java.time.Duration G__36638)))



(defn plus-seconds ^java.time.Duration ([^java.time.Duration G__36639 G__36640] (.plusSeconds ^java.time.Duration G__36639 G__36640)))



(defn plus-minutes ^java.time.Duration ([^java.time.Duration G__36641 G__36642] (.plusMinutes ^java.time.Duration G__36641 G__36642)))




(defn multiplied-by ^java.time.Duration ([^java.time.Duration G__36643 G__36644] (.multipliedBy ^java.time.Duration G__36643 G__36644)))


(defn minus ^java.time.Duration ([^java.time.Duration G__36645 ^java.time.Duration G__36646] (.minus ^java.time.Duration G__36645 ^java.time.Duration G__36646)) ([^java.time.Duration G__36647 G__36648 ^java.time.temporal.TemporalUnit G__36649] (.minus ^java.time.Duration G__36647 G__36648 ^java.time.temporal.TemporalUnit G__36649)))


(defn between ^java.time.Duration ([^java.time.temporal.Temporal G__36651 ^java.time.temporal.Temporal G__36652] (. java.time.Duration between ^java.time.temporal.Temporal G__36651 ^java.time.temporal.Temporal G__36652)))


(defn plus-nanos ^java.time.Duration ([^java.time.Duration G__36653 G__36654] (.plusNanos ^java.time.Duration G__36653 G__36654)))


(defn get-nano ([^java.time.Duration G__36655] (jti/getter nano ^java.time.Duration G__36655)))


(defn to-nanos ([^java.time.Duration G__36656] (.toNanos ^java.time.Duration G__36656)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Duration G__36657 ^java.time.temporal.Temporal G__36658] (.addTo ^java.time.Duration G__36657 ^java.time.temporal.Temporal G__36658)))


(defn to-string ^java.lang.String ([^java.time.Duration G__36659] (.toString ^java.time.Duration G__36659)))



(defn equals ([^java.time.Duration G__36660 ^java.lang.Object G__36661] (.equals ^java.time.Duration G__36660 ^java.lang.Object G__36661)))


(defn of-nanos ^java.time.Duration ([G__36663] (. java.time.Duration ofNanos G__36663)))


(defn plus-millis ^java.time.Duration ([^java.time.Duration G__36664 G__36665] (.plusMillis ^java.time.Duration G__36664 G__36665)))


(defn with-seconds ^java.time.Duration ([^java.time.Duration G__36666 G__36667] (.withSeconds ^java.time.Duration G__36666 G__36667)))


(defn minus-hours ^java.time.Duration ([^java.time.Duration G__36668 G__36669] (.minusHours ^java.time.Duration G__36668 G__36669)))


(defn get-seconds ([^java.time.Duration G__36670] (jti/getter seconds ^java.time.Duration G__36670)))


(defn plus-days ^java.time.Duration ([^java.time.Duration G__36671 G__36672] (.plusDays ^java.time.Duration G__36671 G__36672)))



(defn hash-code ([^java.time.Duration G__36673] (.hashCode ^java.time.Duration G__36673)))



(defn abs ^java.time.Duration ([^java.time.Duration G__36674] (.abs ^java.time.Duration G__36674)))


(defn of-days ^java.time.Duration ([G__36676] (. java.time.Duration ofDays G__36676)))


(defn from ^java.time.Duration ([^java.time.temporal.TemporalAmount G__36678] (. java.time.Duration from ^java.time.temporal.TemporalAmount G__36678)))


(defn parse ^java.time.Duration ([^java.lang.CharSequence G__36680] (. java.time.Duration parse ^java.lang.CharSequence G__36680)))


(defn plus ^java.time.Duration ([^java.time.Duration G__36681 ^java.time.Duration G__36682] (.plus ^java.time.Duration G__36681 ^java.time.Duration G__36682)) ([^java.time.Duration G__36683 G__36684 G__36685] (.plus ^java.time.Duration G__36683 G__36684 G__36685)))


(defn divided-by ^java.time.Duration ([^java.time.Duration G__36686 G__36687] (.dividedBy ^java.time.Duration G__36686 G__36687)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Duration G__36688 ^java.time.temporal.Temporal G__36689] (.subtractFrom ^java.time.Duration G__36688 ^java.time.temporal.Temporal G__36689)))



(defn negated ^java.time.Duration ([^java.time.Duration G__36690] (.negated ^java.time.Duration G__36690)))




(defn minus-minutes ^java.time.Duration ([^java.time.Duration G__36691 G__36692] (.minusMinutes ^java.time.Duration G__36691 G__36692)))

