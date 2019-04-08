(ns cljc.java-time.duration (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [Duration]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Duration])))

(defn compare-to ([^java.time.Duration G__35112 G__35113] (.compareTo ^java.time.Duration G__35112 G__35113)))


(defn to-days ([^java.time.Duration G__35114] (.toDays ^java.time.Duration G__35114)))



(defn to-millis ([^java.time.Duration G__35115] (.toMillis ^java.time.Duration G__35115)))


(defn of-seconds ^java.time.Duration ([G__35117 G__35118] (. java.time.Duration ofSeconds G__35117 G__35118)) ([G__35120] (. java.time.Duration ofSeconds G__35120)))


(defn of-minutes ^java.time.Duration ([G__35122] (. java.time.Duration ofMinutes G__35122)))


(defn get-units ^java.util.List ([^java.time.Duration G__35123] (jti/getter units ^java.time.Duration G__35123)))


(defn of ^java.time.Duration ([G__35125 ^java.time.temporal.TemporalUnit G__35126] (. java.time.Duration of G__35125 ^java.time.temporal.TemporalUnit G__35126)))


(defn is-zero ([^java.time.Duration G__35127] (.isZero ^java.time.Duration G__35127)))


(defn minus-nanos ^java.time.Duration ([^java.time.Duration G__35128 G__35129] (.minusNanos ^java.time.Duration G__35128 G__35129)))


(defn of-hours ^java.time.Duration ([G__35131] (. java.time.Duration ofHours G__35131)))


(defn to-hours ([^java.time.Duration G__35132] (.toHours ^java.time.Duration G__35132)))



(defn to-minutes ([^java.time.Duration G__35133] (.toMinutes ^java.time.Duration G__35133)))


(defn with-nanos ^java.time.Duration ([^java.time.Duration G__35134 G__35135] (.withNanos ^java.time.Duration G__35134 G__35135)))


(defn get ([^java.time.Duration G__35136 ^java.time.temporal.TemporalUnit G__35137] (.get ^java.time.Duration G__35136 ^java.time.temporal.TemporalUnit G__35137)))


(defn minus-millis ^java.time.Duration ([^java.time.Duration G__35138 G__35139] (.minusMillis ^java.time.Duration G__35138 G__35139)))


(defn of-millis ^java.time.Duration ([G__35141] (. java.time.Duration ofMillis G__35141)))



(defn minus-seconds ^java.time.Duration ([^java.time.Duration G__35142 G__35143] (.minusSeconds ^java.time.Duration G__35142 G__35143)))


(defn minus-days ^java.time.Duration ([^java.time.Duration G__35144 G__35145] (.minusDays ^java.time.Duration G__35144 G__35145)))


(defn plus-hours ^java.time.Duration ([^java.time.Duration G__35146 G__35147] (.plusHours ^java.time.Duration G__35146 G__35147)))




(defn is-negative ([^java.time.Duration G__35148] (.isNegative ^java.time.Duration G__35148)))



(defn plus-seconds ^java.time.Duration ([^java.time.Duration G__35149 G__35150] (.plusSeconds ^java.time.Duration G__35149 G__35150)))



(defn plus-minutes ^java.time.Duration ([^java.time.Duration G__35151 G__35152] (.plusMinutes ^java.time.Duration G__35151 G__35152)))




(defn multiplied-by ^java.time.Duration ([^java.time.Duration G__35153 G__35154] (.multipliedBy ^java.time.Duration G__35153 G__35154)))


(defn minus ^java.time.Duration ([^java.time.Duration G__35155 ^java.time.Duration G__35156] (.minus ^java.time.Duration G__35155 ^java.time.Duration G__35156)) ([^java.time.Duration G__35157 G__35158 ^java.time.temporal.TemporalUnit G__35159] (.minus ^java.time.Duration G__35157 G__35158 ^java.time.temporal.TemporalUnit G__35159)))


(defn between ^java.time.Duration ([^java.time.temporal.Temporal G__35161 ^java.time.temporal.Temporal G__35162] (. java.time.Duration between ^java.time.temporal.Temporal G__35161 ^java.time.temporal.Temporal G__35162)))


(defn plus-nanos ^java.time.Duration ([^java.time.Duration G__35163 G__35164] (.plusNanos ^java.time.Duration G__35163 G__35164)))


(defn get-nano ([^java.time.Duration G__35165] (jti/getter nano ^java.time.Duration G__35165)))


(defn to-nanos ([^java.time.Duration G__35166] (.toNanos ^java.time.Duration G__35166)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Duration G__35167 ^java.time.temporal.Temporal G__35168] (.addTo ^java.time.Duration G__35167 ^java.time.temporal.Temporal G__35168)))


(defn to-string ^java.lang.String ([^java.time.Duration G__35169] (.toString ^java.time.Duration G__35169)))



(defn equals ([^java.time.Duration G__35170 ^java.lang.Object G__35171] (.equals ^java.time.Duration G__35170 ^java.lang.Object G__35171)))


(defn of-nanos ^java.time.Duration ([G__35173] (. java.time.Duration ofNanos G__35173)))


(defn plus-millis ^java.time.Duration ([^java.time.Duration G__35174 G__35175] (.plusMillis ^java.time.Duration G__35174 G__35175)))


(defn with-seconds ^java.time.Duration ([^java.time.Duration G__35176 G__35177] (.withSeconds ^java.time.Duration G__35176 G__35177)))


(defn minus-hours ^java.time.Duration ([^java.time.Duration G__35178 G__35179] (.minusHours ^java.time.Duration G__35178 G__35179)))


(defn get-seconds ([^java.time.Duration G__35180] (jti/getter seconds ^java.time.Duration G__35180)))


(defn plus-days ^java.time.Duration ([^java.time.Duration G__35181 G__35182] (.plusDays ^java.time.Duration G__35181 G__35182)))



(defn hash-code ([^java.time.Duration G__35183] (.hashCode ^java.time.Duration G__35183)))



(defn abs ^java.time.Duration ([^java.time.Duration G__35184] (.abs ^java.time.Duration G__35184)))


(defn of-days ^java.time.Duration ([G__35186] (. java.time.Duration ofDays G__35186)))


(defn from ^java.time.Duration ([^java.time.temporal.TemporalAmount G__35188] (. java.time.Duration from ^java.time.temporal.TemporalAmount G__35188)))


(defn parse ^java.time.Duration ([^java.lang.CharSequence G__35190] (. java.time.Duration parse ^java.lang.CharSequence G__35190)))


(defn plus ^java.time.Duration ([^java.time.Duration G__35191 ^java.time.Duration G__35192] (.plus ^java.time.Duration G__35191 ^java.time.Duration G__35192)) ([^java.time.Duration G__35193 G__35194 G__35195] (.plus ^java.time.Duration G__35193 G__35194 G__35195)))


(defn divided-by ^java.time.Duration ([^java.time.Duration G__35196 G__35197] (.dividedBy ^java.time.Duration G__35196 G__35197)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Duration G__35198 ^java.time.temporal.Temporal G__35199] (.subtractFrom ^java.time.Duration G__35198 ^java.time.temporal.Temporal G__35199)))



(defn negated ^java.time.Duration ([^java.time.Duration G__35200] (.negated ^java.time.Duration G__35200)))




(defn minus-minutes ^java.time.Duration ([^java.time.Duration G__35201 G__35202] (.minusMinutes ^java.time.Duration G__35201 G__35202)))

