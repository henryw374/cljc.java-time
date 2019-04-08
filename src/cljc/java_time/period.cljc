(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [Period]])) #? (:clj (:import [java.time Period])))

(defn with-years ^java.time.Period ([^java.time.Period G__25877 G__25878] (.withYears ^java.time.Period G__25877 G__25878)))


(defn plus-years ^java.time.Period ([^java.time.Period G__25879 G__25880] (.plusYears ^java.time.Period G__25879 G__25880)))



(defn of-weeks ^java.time.Period ([G__25882] (. java.time.Period ofWeeks G__25882)))


(defn get-units ^java.util.List ([^java.time.Period G__25883] (jti/getter units ^java.time.Period G__25883)))


(defn of ^java.time.Period ([G__25885 G__25886 G__25887] (. java.time.Period of G__25885 G__25886 G__25887)))


(defn is-zero ([^java.time.Period G__25888] (.isZero ^java.time.Period G__25888)))


(defn of-months ^java.time.Period ([G__25890] (. java.time.Period ofMonths G__25890)))



(defn normalized ^java.time.chrono.ChronoPeriod ([^java.time.Period G__25891] (.normalized ^java.time.Period G__25891)))



(defn minus-months ^java.time.Period ([^java.time.Period G__25892 G__25893] (.minusMonths ^java.time.Period G__25892 G__25893)))


(defn get-days ([^java.time.Period G__25894] (jti/getter days ^java.time.Period G__25894)))


(defn get ([^java.time.Period G__25895 ^java.time.temporal.TemporalUnit G__25896] (.get ^java.time.Period G__25895 ^java.time.temporal.TemporalUnit G__25896)))


(defn minus-years ^java.time.Period ([^java.time.Period G__25897 G__25898] (.minusYears ^java.time.Period G__25897 G__25898)))


(defn minus-days ^java.time.Period ([^java.time.Period G__25899 G__25900] (.minusDays ^java.time.Period G__25899 G__25900)))



(defn get-years ([^java.time.Period G__25901] (jti/getter years ^java.time.Period G__25901)))


(defn is-negative ([^java.time.Period G__25902] (.isNegative ^java.time.Period G__25902)))


(defn with-months ^java.time.Period ([^java.time.Period G__25903 G__25904] (.withMonths ^java.time.Period G__25903 G__25904)))


(defn to-total-months ([^java.time.Period G__25905] (.toTotalMonths ^java.time.Period G__25905)))





(defn get-months ([^java.time.Period G__25906] (jti/getter months ^java.time.Period G__25906)))




(defn multiplied-by ^java.time.Period ([^java.time.Period G__25907 G__25908] (.multipliedBy ^java.time.Period G__25907 G__25908)))


(defn minus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__25909 G__25910] (.minus ^java.time.Period G__25909 G__25910)))



(defn between ^java.time.Period ([^java.time.LocalDate G__25912 ^java.time.LocalDate G__25913] (. java.time.Period between ^java.time.LocalDate G__25912 ^java.time.LocalDate G__25913)))


(defn add-to ^java.time.temporal.Temporal ([^java.time.Period G__25914 ^java.time.temporal.Temporal G__25915] (.addTo ^java.time.Period G__25914 ^java.time.temporal.Temporal G__25915)))


(defn get-chronology ^java.time.chrono.IsoChronology ([^java.time.Period G__25916] (jti/getter chronology ^java.time.Period G__25916)))


(defn to-string ^java.lang.String ([^java.time.Period G__25917] (.toString ^java.time.Period G__25917)))


(defn plus-months ^java.time.Period ([^java.time.Period G__25918 G__25919] (.plusMonths ^java.time.Period G__25918 G__25919)))


(defn equals ([^java.time.Period G__25920 ^java.lang.Object G__25921] (.equals ^java.time.Period G__25920 ^java.lang.Object G__25921)))


(defn with-days ^java.time.Period ([^java.time.Period G__25922 G__25923] (.withDays ^java.time.Period G__25922 G__25923)))


(defn plus-days ^java.time.Period ([^java.time.Period G__25924 G__25925] (.plusDays ^java.time.Period G__25924 G__25925)))



(defn hash-code ([^java.time.Period G__25926] (.hashCode ^java.time.Period G__25926)))



(defn of-days ^java.time.Period ([G__25928] (. java.time.Period ofDays G__25928)))


(defn of-years ^java.time.Period ([G__25930] (. java.time.Period ofYears G__25930)))


(defn from ^java.time.Period ([^java.time.temporal.TemporalAmount G__25932] (. java.time.Period from ^java.time.temporal.TemporalAmount G__25932)))



(defn parse ^java.time.Period ([^java.lang.CharSequence G__25934] (. java.time.Period parse ^java.lang.CharSequence G__25934)))


(defn plus ^java.time.chrono.ChronoPeriod ([^java.time.Period G__25935 G__25936] (.plus ^java.time.Period G__25935 G__25936)))


(defn subtract-from ^java.time.temporal.Temporal ([^java.time.Period G__25937 ^java.time.temporal.Temporal G__25938] (.subtractFrom ^java.time.Period G__25937 ^java.time.temporal.Temporal G__25938)))



(defn negated ^java.time.chrono.ChronoPeriod ([^java.time.Period G__25939] (.negated ^java.time.Period G__25939)))


