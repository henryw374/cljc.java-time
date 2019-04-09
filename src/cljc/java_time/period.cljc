(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Period]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Period])))
(def zero (. java.time.Period -ZERO))

(defn with-years ^java.time.Period ([^java.time.Period G__46247 G__46248] (.withYears ^java.time.Period G__46247 G__46248)))


(defn plus-years ^java.time.Period ([^java.time.Period G__46249 G__46250] (.plusYears ^java.time.Period G__46249 G__46250)))



(defn of-weeks ^java.time.Period ([G__46252] (. java.time.Period ofWeeks G__46252)))


(defn get-units ^java.util.List ([^java.time.Period G__46253] (jti/getter units ^java.time.Period G__46253)))


(defn of ^java.time.Period ([G__46255 G__46256 G__46257] (. java.time.Period of G__46255 G__46256 G__46257)))


(defn is-zero ([^java.time.Period G__46258] (.isZero ^java.time.Period G__46258)))


(defn of-months ^java.time.Period ([G__46260] (. java.time.Period ofMonths G__46260)))



(defn normalized ^java.time.chrono.ChronoPeriod ([^java.time.Period G__46261] (.normalized ^java.time.Period G__46261)))



(defn minus-months ^java.time.Period ([^java.time.Period G__46262 G__46263] (.minusMonths ^java.time.Period G__46262 G__46263)))


(defn get-days ([^java.time.Period G__46264] (jti/getter days ^java.time.Period G__46264)))


(defn get ([^java.time.Period G__46265 ^java.time.temporal.TemporalUnit G__46266] (.get ^java.time.Period G__46265 ^java.time.temporal.TemporalUnit G__46266)))


(defn minus-years ^java.time.Period ([^java.time.Period G__46267 G__46268] (.minusYears ^java.time.Period G__46267 G__46268)))


(defn minus-days ^java.time.Period ([^java.time.Period G__46269 G__46270] (.minusDays ^java.time.Period G__46269 G__46270)))



(defn get-years ([^java.time.Period G__46271] (jti/getter years ^java.time.Period G__46271)))


(defn is-negative ([^java.time.Period G__46272] (.isNegative ^java.time.Period G__46272)))


(defn with-months ^java.time.Period ([^java.time.Period G__46273 G__46274] (.withMonths ^java.time.Period G__46273 G__46274)))


(defn to-total-months ([^java.time.Period G__46275] (.toTotalMonths ^java.time.Period G__46275)))





(defn get-months ([^java.time.Period G__46276] (jti/getter months ^java.time.Period G__46276)))




(defn multiplied-by ^java.time.Period ([^java.time.Period G__46277 G__46278] (.multipliedBy ^java.time.Period G__46277 G__46278)))


(defn minus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__46279 G__46280] (.minus ^java.time.Period G__46279 G__46280)))



(defn between ^java.time.Period ([^java.time.LocalDate G__46282 ^java.time.LocalDate G__46283] (. java.time.Period between ^java.time.LocalDate G__46282 ^java.time.LocalDate G__46283)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Period G__46284 ^java.time.temporal.Temporal G__46285] (.addTo ^java.time.Period G__46284 ^java.time.temporal.Temporal G__46285)))


(defn get-chronology ^java.time.chrono.IsoChronology ([^java.time.Period G__46286] (jti/getter chronology ^java.time.Period G__46286)))


(defn to-string ^java.lang.String ([^java.time.Period G__46287] (.toString ^java.time.Period G__46287)))


(defn plus-months ^java.time.Period ([^java.time.Period G__46288 G__46289] (.plusMonths ^java.time.Period G__46288 G__46289)))


(defn equals ([^java.time.Period G__46290 ^java.lang.Object G__46291] (.equals ^java.time.Period G__46290 ^java.lang.Object G__46291)))


(defn with-days ^java.time.Period ([^java.time.Period G__46292 G__46293] (.withDays ^java.time.Period G__46292 G__46293)))


(defn plus-days ^java.time.Period ([^java.time.Period G__46294 G__46295] (.plusDays ^java.time.Period G__46294 G__46295)))



(defn hash-code ([^java.time.Period G__46296] (.hashCode ^java.time.Period G__46296)))



(defn of-days ^java.time.Period ([G__46298] (. java.time.Period ofDays G__46298)))


(defn of-years ^java.time.Period ([G__46300] (. java.time.Period ofYears G__46300)))


(defn from ^java.time.Period ([^java.time.temporal.TemporalAmount G__46302] (. java.time.Period from ^java.time.temporal.TemporalAmount G__46302)))



(defn parse ^java.time.Period ([^java.lang.CharSequence G__46304] (. java.time.Period parse ^java.lang.CharSequence G__46304)))


(defn plus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__46305 G__46306] (.plus ^java.time.Period G__46305 G__46306)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Period G__46307 ^java.time.temporal.Temporal G__46308] (.subtractFrom ^java.time.Period G__46307 ^java.time.temporal.Temporal G__46308)))



(defn negated ^java.time.chrono.ChronoPeriod ([^java.time.Period G__46309] (.negated ^java.time.Period G__46309)))


