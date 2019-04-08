(ns cljc.java-time.instant (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [Instant]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Instant])))

(defn compare-to ([^java.time.Instant G__34705 G__34706] (.compareTo ^java.time.Instant G__34705 G__34706)))


(defn is-supported ([^java.time.Instant G__34707 G__34708] (.isSupported ^java.time.Instant G__34707 G__34708)))


(defn query ^java.lang.Object ([^java.time.Instant G__34709 ^java.time.temporal.TemporalQuery G__34710] (.query ^java.time.Instant G__34709 ^java.time.temporal.TemporalQuery G__34710)))




(defn minus-nanos ^java.time.Instant ([^java.time.Instant G__34711 G__34712] (.minusNanos ^java.time.Instant G__34711 G__34712)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Instant G__34713 ^java.time.temporal.TemporalField G__34714] (.range ^java.time.Instant G__34713 ^java.time.temporal.TemporalField G__34714)))


(defn to-epoch-milli ([^java.time.Instant G__34715] (.toEpochMilli ^java.time.Instant G__34715)))


(defn of-epoch-second ^java.time.Instant ([G__34717] (. java.time.Instant ofEpochSecond G__34717)) ([G__34719 G__34720] (. java.time.Instant ofEpochSecond G__34719 G__34720)))



(defn get ([^java.time.Instant G__34721 ^java.time.temporal.TemporalField G__34722] (.get ^java.time.Instant G__34721 ^java.time.temporal.TemporalField G__34722)))


(defn truncated-to ^java.time.Instant ([^java.time.Instant G__34723 ^java.time.temporal.TemporalUnit G__34724] (.truncatedTo ^java.time.Instant G__34723 ^java.time.temporal.TemporalUnit G__34724)))


(defn minus-millis ^java.time.Instant ([^java.time.Instant G__34725 G__34726] (.minusMillis ^java.time.Instant G__34725 G__34726)))


(defn minus-seconds ^java.time.Instant ([^java.time.Instant G__34727 G__34728] (.minusSeconds ^java.time.Instant G__34727 G__34728)))


(defn now ^java.time.Instant ([^java.time.Clock G__34730] (. java.time.Instant now ^java.time.Clock G__34730)) ([] (. java.time.Instant now)))




(defn of-epoch-milli ^java.time.Instant ([G__34733] (. java.time.Instant ofEpochMilli G__34733)))



(defn plus-seconds ^java.time.Instant ([^java.time.Instant G__34734 G__34735] (.plusSeconds ^java.time.Instant G__34734 G__34735)))




(defn until ([^java.time.Instant G__34736 ^java.time.temporal.Temporal G__34737 ^java.time.temporal.TemporalUnit G__34738] (.until ^java.time.Instant G__34736 ^java.time.temporal.Temporal G__34737 ^java.time.temporal.TemporalUnit G__34738)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.Instant G__34739 ^java.time.ZoneOffset G__34740] (.atOffset ^java.time.Instant G__34739 ^java.time.ZoneOffset G__34740)))



(defn is-before ([^java.time.Instant G__34741 ^java.time.Instant G__34742] (.isBefore ^java.time.Instant G__34741 ^java.time.Instant G__34742)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Instant G__34743 ^java.time.temporal.Temporal G__34744] (.adjustInto ^java.time.Instant G__34743 ^java.time.temporal.Temporal G__34744)))


(defn minus ^java.time.Instant ([^java.time.Instant G__34745 G__34746 G__34747] (.minus ^java.time.Instant G__34745 G__34746 G__34747)) ([^java.time.Instant G__34748 G__34749] (.minus ^java.time.Instant G__34748 G__34749)))


(defn plus-nanos ^java.time.Instant ([^java.time.Instant G__34750 G__34751] (.plusNanos ^java.time.Instant G__34750 G__34751)))


(defn get-nano ([^java.time.Instant G__34752] (jti/getter nano ^java.time.Instant G__34752)))


(defn is-after ([^java.time.Instant G__34753 ^java.time.Instant G__34754] (.isAfter ^java.time.Instant G__34753 ^java.time.Instant G__34754)))


(defn to-string ^java.lang.String ([^java.time.Instant G__34755] (.toString ^java.time.Instant G__34755)))



(defn equals ([^java.time.Instant G__34756 ^java.lang.Object G__34757] (.equals ^java.time.Instant G__34756 ^java.lang.Object G__34757)))


(defn plus-millis ^java.time.Instant ([^java.time.Instant G__34758 G__34759] (.plusMillis ^java.time.Instant G__34758 G__34759)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.Instant G__34760 ^java.time.ZoneId G__34761] (.atZone ^java.time.Instant G__34760 ^java.time.ZoneId G__34761)))



(defn hash-code ([^java.time.Instant G__34762] (.hashCode ^java.time.Instant G__34762)))



(defn get-long ([^java.time.Instant G__34763 ^java.time.temporal.TemporalField G__34764] (jti/getter long ^java.time.Instant G__34763 ^java.time.temporal.TemporalField G__34764)))




(defn with ^java.time.temporal.Temporal ([^java.time.Instant G__34765 G__34766] (.with ^java.time.Instant G__34765 G__34766)) ([^java.time.Instant G__34767 G__34768 G__34769] (.with ^java.time.Instant G__34767 G__34768 G__34769)))


(defn from ^java.time.Instant ([^java.time.temporal.TemporalAccessor G__34771] (. java.time.Instant from ^java.time.temporal.TemporalAccessor G__34771)))


(defn get-epoch-second ([^java.time.Instant G__34772] (jti/getter epochSecond ^java.time.Instant G__34772)))


(defn parse ^java.time.Instant ([^java.lang.CharSequence G__34774] (. java.time.Instant parse ^java.lang.CharSequence G__34774)))


(defn plus ^java.time.temporal.Temporal ([^java.time.Instant G__34775 G__34776 G__34777] (.plus ^java.time.Instant G__34775 G__34776 G__34777)) ([^java.time.Instant G__34778 G__34779] (.plus ^java.time.Instant G__34778 G__34779)))


