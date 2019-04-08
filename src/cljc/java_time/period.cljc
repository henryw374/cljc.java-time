(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Period]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time Period])))

(defn with-years ^java.time.Period ([^java.time.Period G__35611 G__35612] (.withYears ^java.time.Period G__35611 G__35612)))


(defn plus-years ^java.time.Period ([^java.time.Period G__35613 G__35614] (.plusYears ^java.time.Period G__35613 G__35614)))



(defn of-weeks ^java.time.Period ([G__35616] (. java.time.Period ofWeeks G__35616)))


(defn get-units ^java.util.List ([^java.time.Period G__35617] (jti/getter units ^java.time.Period G__35617)))


(defn of ^java.time.Period ([G__35619 G__35620 G__35621] (. java.time.Period of G__35619 G__35620 G__35621)))


(defn is-zero ([^java.time.Period G__35622] (.isZero ^java.time.Period G__35622)))


(defn of-months ^java.time.Period ([G__35624] (. java.time.Period ofMonths G__35624)))



(defn normalized ^java.time.chrono.ChronoPeriod ([^java.time.Period G__35625] (.normalized ^java.time.Period G__35625)))



(defn minus-months ^java.time.Period ([^java.time.Period G__35626 G__35627] (.minusMonths ^java.time.Period G__35626 G__35627)))


(defn get-days ([^java.time.Period G__35628] (jti/getter days ^java.time.Period G__35628)))


(defn get ([^java.time.Period G__35629 ^java.time.temporal.TemporalUnit G__35630] (.get ^java.time.Period G__35629 ^java.time.temporal.TemporalUnit G__35630)))


(defn minus-years ^java.time.Period ([^java.time.Period G__35631 G__35632] (.minusYears ^java.time.Period G__35631 G__35632)))


(defn minus-days ^java.time.Period ([^java.time.Period G__35633 G__35634] (.minusDays ^java.time.Period G__35633 G__35634)))



(defn get-years ([^java.time.Period G__35635] (jti/getter years ^java.time.Period G__35635)))


(defn is-negative ([^java.time.Period G__35636] (.isNegative ^java.time.Period G__35636)))


(defn with-months ^java.time.Period ([^java.time.Period G__35637 G__35638] (.withMonths ^java.time.Period G__35637 G__35638)))


(defn to-total-months ([^java.time.Period G__35639] (.toTotalMonths ^java.time.Period G__35639)))





(defn get-months ([^java.time.Period G__35640] (jti/getter months ^java.time.Period G__35640)))




(defn multiplied-by ^java.time.Period ([^java.time.Period G__35641 G__35642] (.multipliedBy ^java.time.Period G__35641 G__35642)))


(defn minus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__35643 G__35644] (.minus ^java.time.Period G__35643 G__35644)))



(defn between ^java.time.Period ([^java.time.LocalDate G__35646 ^java.time.LocalDate G__35647] (. java.time.Period between ^java.time.LocalDate G__35646 ^java.time.LocalDate G__35647)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Period G__35648 ^java.time.temporal.Temporal G__35649] (.addTo ^java.time.Period G__35648 ^java.time.temporal.Temporal G__35649)))


(defn get-chronology ^java.time.chrono.IsoChronology ([^java.time.Period G__35650] (jti/getter chronology ^java.time.Period G__35650)))


(defn to-string ^java.lang.String ([^java.time.Period G__35651] (.toString ^java.time.Period G__35651)))


(defn plus-months ^java.time.Period ([^java.time.Period G__35652 G__35653] (.plusMonths ^java.time.Period G__35652 G__35653)))


(defn equals ([^java.time.Period G__35654 ^java.lang.Object G__35655] (.equals ^java.time.Period G__35654 ^java.lang.Object G__35655)))


(defn with-days ^java.time.Period ([^java.time.Period G__35656 G__35657] (.withDays ^java.time.Period G__35656 G__35657)))


(defn plus-days ^java.time.Period ([^java.time.Period G__35658 G__35659] (.plusDays ^java.time.Period G__35658 G__35659)))



(defn hash-code ([^java.time.Period G__35660] (.hashCode ^java.time.Period G__35660)))



(defn of-days ^java.time.Period ([G__35662] (. java.time.Period ofDays G__35662)))


(defn of-years ^java.time.Period ([G__35664] (. java.time.Period ofYears G__35664)))


(defn from ^java.time.Period ([^java.time.temporal.TemporalAmount G__35666] (. java.time.Period from ^java.time.temporal.TemporalAmount G__35666)))



(defn parse ^java.time.Period ([^java.lang.CharSequence G__35668] (. java.time.Period parse ^java.lang.CharSequence G__35668)))


(defn plus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__35669 G__35670] (.plus ^java.time.Period G__35669 G__35670)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Period G__35671 ^java.time.temporal.Temporal G__35672] (.subtractFrom ^java.time.Period G__35671 ^java.time.temporal.Temporal G__35672)))



(defn negated ^java.time.chrono.ChronoPeriod ([^java.time.Period G__35673] (.negated ^java.time.Period G__35673)))


