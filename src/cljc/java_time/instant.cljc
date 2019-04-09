(ns cljc.java-time.instant (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Instant]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Instant])))
(def min (. java.time.Instant -MIN))
(def epoch (. java.time.Instant -EPOCH))
(def max (. java.time.Instant -MAX))

(defn compare-to ([^java.time.Instant G__46831 G__46832] (.compareTo ^java.time.Instant G__46831 G__46832)))


(defn is-supported ([^java.time.Instant G__46833 G__46834] (.isSupported ^java.time.Instant G__46833 G__46834)))


(defn query ^java.lang.Object ([^java.time.Instant G__46835 ^java.time.temporal.TemporalQuery G__46836] (.query ^java.time.Instant G__46835 ^java.time.temporal.TemporalQuery G__46836)))




(defn minus-nanos ^java.time.Instant ([^java.time.Instant G__46837 G__46838] (.minusNanos ^java.time.Instant G__46837 G__46838)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Instant G__46839 ^java.time.temporal.TemporalField G__46840] (.range ^java.time.Instant G__46839 ^java.time.temporal.TemporalField G__46840)))


(defn to-epoch-milli ([^java.time.Instant G__46841] (.toEpochMilli ^java.time.Instant G__46841)))


(defn of-epoch-second ^java.time.Instant ([G__46843] (. java.time.Instant ofEpochSecond G__46843)) ([G__46845 G__46846] (. java.time.Instant ofEpochSecond G__46845 G__46846)))



(defn get ([^java.time.Instant G__46847 ^java.time.temporal.TemporalField G__46848] (.get ^java.time.Instant G__46847 ^java.time.temporal.TemporalField G__46848)))


(defn truncated-to ^java.time.Instant ([^java.time.Instant G__46849 ^java.time.temporal.TemporalUnit G__46850] (.truncatedTo ^java.time.Instant G__46849 ^java.time.temporal.TemporalUnit G__46850)))


(defn minus-millis ^java.time.Instant ([^java.time.Instant G__46851 G__46852] (.minusMillis ^java.time.Instant G__46851 G__46852)))


(defn minus-seconds ^java.time.Instant ([^java.time.Instant G__46853 G__46854] (.minusSeconds ^java.time.Instant G__46853 G__46854)))


(defn now ^java.time.Instant ([^java.time.Clock G__46856] (. java.time.Instant now ^java.time.Clock G__46856)) ([] (. java.time.Instant now)))




(defn of-epoch-milli ^java.time.Instant ([G__46859] (. java.time.Instant ofEpochMilli G__46859)))



(defn plus-seconds ^java.time.Instant ([^java.time.Instant G__46860 G__46861] (.plusSeconds ^java.time.Instant G__46860 G__46861)))




(defn until ([^java.time.Instant G__46862 ^java.time.temporal.Temporal G__46863 ^java.time.temporal.TemporalUnit G__46864] (.until ^java.time.Instant G__46862 ^java.time.temporal.Temporal G__46863 ^java.time.temporal.TemporalUnit G__46864)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.Instant G__46865 ^java.time.ZoneOffset G__46866] (.atOffset ^java.time.Instant G__46865 ^java.time.ZoneOffset G__46866)))



(defn is-before ([^java.time.Instant G__46867 ^java.time.Instant G__46868] (.isBefore ^java.time.Instant G__46867 ^java.time.Instant G__46868)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Instant G__46869 ^java.time.temporal.Temporal G__46870] (.adjustInto ^java.time.Instant G__46869 ^java.time.temporal.Temporal G__46870)))


(defn minus ^java.time.Instant ([^java.time.Instant G__46871 G__46872 G__46873] (.minus ^java.time.Instant G__46871 G__46872 G__46873)) ([^java.time.Instant G__46874 G__46875] (.minus ^java.time.Instant G__46874 G__46875)))


(defn plus-nanos ^java.time.Instant ([^java.time.Instant G__46876 G__46877] (.plusNanos ^java.time.Instant G__46876 G__46877)))


(defn get-nano ([^java.time.Instant G__46878] (jti/getter nano ^java.time.Instant G__46878)))


(defn is-after ([^java.time.Instant G__46879 ^java.time.Instant G__46880] (.isAfter ^java.time.Instant G__46879 ^java.time.Instant G__46880)))


(defn to-string ^java.lang.String ([^java.time.Instant G__46881] (.toString ^java.time.Instant G__46881)))



(defn equals ([^java.time.Instant G__46882 ^java.lang.Object G__46883] (.equals ^java.time.Instant G__46882 ^java.lang.Object G__46883)))


(defn plus-millis ^java.time.Instant ([^java.time.Instant G__46884 G__46885] (.plusMillis ^java.time.Instant G__46884 G__46885)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.Instant G__46886 ^java.time.ZoneId G__46887] (.atZone ^java.time.Instant G__46886 ^java.time.ZoneId G__46887)))



(defn hash-code ([^java.time.Instant G__46888] (.hashCode ^java.time.Instant G__46888)))



(defn get-long ([^java.time.Instant G__46889 ^java.time.temporal.TemporalField G__46890] (.getLong ^java.time.Instant G__46889 ^java.time.temporal.TemporalField G__46890)))




(defn with ^java.time.temporal.Temporal ([^java.time.Instant G__46891 G__46892] (.with ^java.time.Instant G__46891 G__46892)) ([^java.time.Instant G__46893 G__46894 G__46895] (.with ^java.time.Instant G__46893 G__46894 G__46895)))


(defn from ^java.time.Instant ([^java.time.temporal.TemporalAccessor G__46897] (. java.time.Instant from ^java.time.temporal.TemporalAccessor G__46897)))


(defn get-epoch-second ([^java.time.Instant G__46898] (jti/getter epochSecond ^java.time.Instant G__46898)))


(defn parse ^java.time.Instant ([^java.lang.CharSequence G__46900] (. java.time.Instant parse ^java.lang.CharSequence G__46900)))


(defn plus ^java.time.temporal.Temporal ([^java.time.Instant G__46901 G__46902 G__46903] (.plus ^java.time.Instant G__46901 G__46902 G__46903)) ([^java.time.Instant G__46904 G__46905] (.plus ^java.time.Instant G__46904 G__46905)))


