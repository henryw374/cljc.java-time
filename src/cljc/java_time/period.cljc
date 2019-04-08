(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [Period]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Period])))

(defn with-years ^java.time.Period ([^java.time.Period G__34121 G__34122] (.withYears ^java.time.Period G__34121 G__34122)))


(defn plus-years ^java.time.Period ([^java.time.Period G__34123 G__34124] (.plusYears ^java.time.Period G__34123 G__34124)))



(defn of-weeks ^java.time.Period ([G__34126] (. java.time.Period ofWeeks G__34126)))


(defn get-units ^java.util.List ([^java.time.Period G__34127] (jti/getter units ^java.time.Period G__34127)))


(defn of ^java.time.Period ([G__34129 G__34130 G__34131] (. java.time.Period of G__34129 G__34130 G__34131)))


(defn is-zero ([^java.time.Period G__34132] (.isZero ^java.time.Period G__34132)))


(defn of-months ^java.time.Period ([G__34134] (. java.time.Period ofMonths G__34134)))



(defn normalized ^java.time.chrono.ChronoPeriod ([^java.time.Period G__34135] (.normalized ^java.time.Period G__34135)))



(defn minus-months ^java.time.Period ([^java.time.Period G__34136 G__34137] (.minusMonths ^java.time.Period G__34136 G__34137)))


(defn get-days ([^java.time.Period G__34138] (jti/getter days ^java.time.Period G__34138)))


(defn get ([^java.time.Period G__34139 ^java.time.temporal.TemporalUnit G__34140] (.get ^java.time.Period G__34139 ^java.time.temporal.TemporalUnit G__34140)))


(defn minus-years ^java.time.Period ([^java.time.Period G__34141 G__34142] (.minusYears ^java.time.Period G__34141 G__34142)))


(defn minus-days ^java.time.Period ([^java.time.Period G__34143 G__34144] (.minusDays ^java.time.Period G__34143 G__34144)))



(defn get-years ([^java.time.Period G__34145] (jti/getter years ^java.time.Period G__34145)))


(defn is-negative ([^java.time.Period G__34146] (.isNegative ^java.time.Period G__34146)))


(defn with-months ^java.time.Period ([^java.time.Period G__34147 G__34148] (.withMonths ^java.time.Period G__34147 G__34148)))


(defn to-total-months ([^java.time.Period G__34149] (.toTotalMonths ^java.time.Period G__34149)))





(defn get-months ([^java.time.Period G__34150] (jti/getter months ^java.time.Period G__34150)))




(defn multiplied-by ^java.time.Period ([^java.time.Period G__34151 G__34152] (.multipliedBy ^java.time.Period G__34151 G__34152)))


(defn minus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__34153 G__34154] (.minus ^java.time.Period G__34153 G__34154)))



(defn between ^java.time.Period ([^java.time.LocalDate G__34156 ^java.time.LocalDate G__34157] (. java.time.Period between ^java.time.LocalDate G__34156 ^java.time.LocalDate G__34157)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Period G__34158 ^java.time.temporal.Temporal G__34159] (.addTo ^java.time.Period G__34158 ^java.time.temporal.Temporal G__34159)))


(defn get-chronology ^java.time.chrono.IsoChronology ([^java.time.Period G__34160] (jti/getter chronology ^java.time.Period G__34160)))


(defn to-string ^java.lang.String ([^java.time.Period G__34161] (.toString ^java.time.Period G__34161)))


(defn plus-months ^java.time.Period ([^java.time.Period G__34162 G__34163] (.plusMonths ^java.time.Period G__34162 G__34163)))


(defn equals ([^java.time.Period G__34164 ^java.lang.Object G__34165] (.equals ^java.time.Period G__34164 ^java.lang.Object G__34165)))


(defn with-days ^java.time.Period ([^java.time.Period G__34166 G__34167] (.withDays ^java.time.Period G__34166 G__34167)))


(defn plus-days ^java.time.Period ([^java.time.Period G__34168 G__34169] (.plusDays ^java.time.Period G__34168 G__34169)))



(defn hash-code ([^java.time.Period G__34170] (.hashCode ^java.time.Period G__34170)))



(defn of-days ^java.time.Period ([G__34172] (. java.time.Period ofDays G__34172)))


(defn of-years ^java.time.Period ([G__34174] (. java.time.Period ofYears G__34174)))


(defn from ^java.time.Period ([^java.time.temporal.TemporalAmount G__34176] (. java.time.Period from ^java.time.temporal.TemporalAmount G__34176)))



(defn parse ^java.time.Period ([^java.lang.CharSequence G__34178] (. java.time.Period parse ^java.lang.CharSequence G__34178)))


(defn plus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__34179 G__34180] (.plus ^java.time.Period G__34179 G__34180)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Period G__34181 ^java.time.temporal.Temporal G__34182] (.subtractFrom ^java.time.Period G__34181 ^java.time.temporal.Temporal G__34182)))



(defn negated ^java.time.chrono.ChronoPeriod ([^java.time.Period G__34183] (.negated ^java.time.Period G__34183)))


