(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Period]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time Period])))
(def zero (. java.time.Period -ZERO))

(defn with-years ^java.time.Period ([^java.time.Period G__55320 G__55321] (.withYears ^java.time.Period G__55320 G__55321)))


(defn plus-years ^java.time.Period ([^java.time.Period G__55322 G__55323] (.plusYears ^java.time.Period G__55322 G__55323)))



(defn of-weeks ^java.time.Period ([G__55325] (. java.time.Period ofWeeks G__55325)))


(defn get-units ^java.util.List ([^java.time.Period G__55326] (jti/getter units ^java.time.Period G__55326)))


(defn of ^java.time.Period ([G__55328 G__55329 G__55330] (. java.time.Period of G__55328 G__55329 G__55330)))


(defn is-zero ([^java.time.Period G__55331] (.isZero ^java.time.Period G__55331)))


(defn of-months ^java.time.Period ([G__55333] (. java.time.Period ofMonths G__55333)))



(defn normalized ^java.time.chrono.ChronoPeriod ([^java.time.Period G__55334] (.normalized ^java.time.Period G__55334)))



(defn minus-months ^java.time.Period ([^java.time.Period G__55335 G__55336] (.minusMonths ^java.time.Period G__55335 G__55336)))


(defn get-days ([^java.time.Period G__55337] (jti/getter days ^java.time.Period G__55337)))


(defn get ([^java.time.Period G__55338 ^java.time.temporal.TemporalUnit G__55339] (.get ^java.time.Period G__55338 ^java.time.temporal.TemporalUnit G__55339)))


(defn minus-years ^java.time.Period ([^java.time.Period G__55340 G__55341] (.minusYears ^java.time.Period G__55340 G__55341)))


(defn minus-days ^java.time.Period ([^java.time.Period G__55342 G__55343] (.minusDays ^java.time.Period G__55342 G__55343)))



(defn get-years ([^java.time.Period G__55344] (jti/getter years ^java.time.Period G__55344)))


(defn is-negative ([^java.time.Period G__55345] (.isNegative ^java.time.Period G__55345)))


(defn with-months ^java.time.Period ([^java.time.Period G__55346 G__55347] (.withMonths ^java.time.Period G__55346 G__55347)))


(defn to-total-months ([^java.time.Period G__55348] (.toTotalMonths ^java.time.Period G__55348)))





(defn get-months ([^java.time.Period G__55349] (jti/getter months ^java.time.Period G__55349)))




(defn multiplied-by ^java.time.Period ([^java.time.Period G__55350 G__55351] (.multipliedBy ^java.time.Period G__55350 G__55351)))


(defn minus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__55352 G__55353] (.minus ^java.time.Period G__55352 G__55353)))



(defn between ^java.time.Period ([^java.time.LocalDate G__55355 ^java.time.LocalDate G__55356] (. java.time.Period between ^java.time.LocalDate G__55355 ^java.time.LocalDate G__55356)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Period G__55357 ^java.time.temporal.Temporal G__55358] (.addTo ^java.time.Period G__55357 ^java.time.temporal.Temporal G__55358)))


(defn get-chronology ^java.time.chrono.IsoChronology ([^java.time.Period G__55359] (jti/getter chronology ^java.time.Period G__55359)))


(defn to-string ^java.lang.String ([^java.time.Period G__55360] (.toString ^java.time.Period G__55360)))


(defn plus-months ^java.time.Period ([^java.time.Period G__55361 G__55362] (.plusMonths ^java.time.Period G__55361 G__55362)))


(defn equals ([^java.time.Period G__55363 ^java.lang.Object G__55364] (.equals ^java.time.Period G__55363 ^java.lang.Object G__55364)))


(defn with-days ^java.time.Period ([^java.time.Period G__55365 G__55366] (.withDays ^java.time.Period G__55365 G__55366)))


(defn plus-days ^java.time.Period ([^java.time.Period G__55367 G__55368] (.plusDays ^java.time.Period G__55367 G__55368)))



(defn hash-code ([^java.time.Period G__55369] (.hashCode ^java.time.Period G__55369)))



(defn of-days ^java.time.Period ([G__55371] (. java.time.Period ofDays G__55371)))


(defn of-years ^java.time.Period ([G__55373] (. java.time.Period ofYears G__55373)))


(defn from ^java.time.Period ([^java.time.temporal.TemporalAmount G__55375] (. java.time.Period from ^java.time.temporal.TemporalAmount G__55375)))



(defn parse ^java.time.Period ([^java.lang.CharSequence G__55377] (. java.time.Period parse ^java.lang.CharSequence G__55377)))


(defn plus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__55378 G__55379] (.plus ^java.time.Period G__55378 G__55379)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Period G__55380 ^java.time.temporal.Temporal G__55381] (.subtractFrom ^java.time.Period G__55380 ^java.time.temporal.Temporal G__55381)))



(defn negated ^java.time.chrono.ChronoPeriod ([^java.time.Period G__55382] (.negated ^java.time.Period G__55382)))


