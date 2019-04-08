(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [YearMonth]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time YearMonth])))

(defn compare-to ([^java.time.YearMonth G__36763 G__36764] (.compareTo ^java.time.YearMonth G__36763 G__36764)))


(defn is-supported ([^java.time.YearMonth G__36765 G__36766] (.isSupported ^java.time.YearMonth G__36765 G__36766)))


(defn plus-years ^java.time.YearMonth ([^java.time.YearMonth G__36767 G__36768] (.plusYears ^java.time.YearMonth G__36767 G__36768)))


(defn query ^java.lang.Object ([^java.time.YearMonth G__36769 ^java.time.temporal.TemporalQuery G__36770] (.query ^java.time.YearMonth G__36769 ^java.time.temporal.TemporalQuery G__36770)))



(defn of ^java.time.YearMonth ([G__36772 G__36773] (. java.time.YearMonth of G__36772 G__36773)))


(defn range ^java.time.temporal.ValueRange ([^java.time.YearMonth G__36774 ^java.time.temporal.TemporalField G__36775] (.range ^java.time.YearMonth G__36774 ^java.time.temporal.TemporalField G__36775)))



(defn length-of-month ([^java.time.YearMonth G__36776] (.lengthOfMonth ^java.time.YearMonth G__36776)))


(defn format ^java.lang.String ([^java.time.YearMonth G__36777 ^java.time.format.DateTimeFormatter G__36778] (.format ^java.time.YearMonth G__36777 ^java.time.format.DateTimeFormatter G__36778)))


(defn minus-months ^java.time.YearMonth ([^java.time.YearMonth G__36779 G__36780] (.minusMonths ^java.time.YearMonth G__36779 G__36780)))


(defn at-day ^java.time.LocalDate ([^java.time.YearMonth G__36781 G__36782] (.atDay ^java.time.YearMonth G__36781 G__36782)))


(defn get ([^java.time.YearMonth G__36783 ^java.time.temporal.TemporalField G__36784] (.get ^java.time.YearMonth G__36783 ^java.time.temporal.TemporalField G__36784)))


(defn now ^java.time.YearMonth ([G__36786] (. java.time.YearMonth now G__36786)) ([] (. java.time.YearMonth now)))


(defn minus-years ^java.time.YearMonth ([^java.time.YearMonth G__36788 G__36789] (.minusYears ^java.time.YearMonth G__36788 G__36789)))



(defn get-month ^java.time.Month ([^java.time.YearMonth G__36790] (jti/getter month ^java.time.YearMonth G__36790)))


(defn at-end-of-month ^java.time.LocalDate ([^java.time.YearMonth G__36791] (.atEndOfMonth ^java.time.YearMonth G__36791)))



(defn until ([^java.time.YearMonth G__36792 ^java.time.temporal.Temporal G__36793 ^java.time.temporal.TemporalUnit G__36794] (.until ^java.time.YearMonth G__36792 ^java.time.temporal.Temporal G__36793 ^java.time.temporal.TemporalUnit G__36794)))




(defn is-before ([^java.time.YearMonth G__36795 ^java.time.YearMonth G__36796] (.isBefore ^java.time.YearMonth G__36795 ^java.time.YearMonth G__36796)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.YearMonth G__36797 ^java.time.temporal.Temporal G__36798] (.adjustInto ^java.time.YearMonth G__36797 ^java.time.temporal.Temporal G__36798)))


(defn minus ^java.time.YearMonth ([^java.time.YearMonth G__36799 G__36800] (.minus ^java.time.YearMonth G__36799 G__36800)) ([^java.time.YearMonth G__36801 G__36802 G__36803] (.minus ^java.time.YearMonth G__36801 G__36802 G__36803)))


(defn get-year ([^java.time.YearMonth G__36804] (jti/getter year ^java.time.YearMonth G__36804)))


(defn is-after ([^java.time.YearMonth G__36805 ^java.time.YearMonth G__36806] (.isAfter ^java.time.YearMonth G__36805 ^java.time.YearMonth G__36806)))


(defn to-string ^java.lang.String ([^java.time.YearMonth G__36807] (.toString ^java.time.YearMonth G__36807)))


(defn plus-months ^java.time.YearMonth ([^java.time.YearMonth G__36808 G__36809] (.plusMonths ^java.time.YearMonth G__36808 G__36809)))


(defn is-valid-day ([^java.time.YearMonth G__36810 G__36811] (.isValidDay ^java.time.YearMonth G__36810 G__36811)))


(defn equals ([^java.time.YearMonth G__36812 ^java.lang.Object G__36813] (.equals ^java.time.YearMonth G__36812 ^java.lang.Object G__36813)))


(defn get-month-value ([^java.time.YearMonth G__36814] (jti/getter monthValue ^java.time.YearMonth G__36814)))


(defn length-of-year ([^java.time.YearMonth G__36815] (.lengthOfYear ^java.time.YearMonth G__36815)))




(defn hash-code ([^java.time.YearMonth G__36816] (.hashCode ^java.time.YearMonth G__36816)))



(defn get-long ([^java.time.YearMonth G__36817 ^java.time.temporal.TemporalField G__36818] (jti/getter long ^java.time.YearMonth G__36817 ^java.time.temporal.TemporalField G__36818)))


(defn is-leap-year ([^java.time.YearMonth G__36819] (.isLeapYear ^java.time.YearMonth G__36819)))


(defn with ^java.time.temporal.Temporal ([^java.time.YearMonth G__36820 G__36821 G__36822] (.with ^java.time.YearMonth G__36820 G__36821 G__36822)) ([^java.time.YearMonth G__36823 G__36824] (.with ^java.time.YearMonth G__36823 G__36824)))


(defn from ^java.time.YearMonth ([^java.time.temporal.TemporalAccessor G__36826] (. java.time.YearMonth from ^java.time.temporal.TemporalAccessor G__36826)))


(defn parse ^java.time.YearMonth ([^java.lang.CharSequence G__36828] (. java.time.YearMonth parse ^java.lang.CharSequence G__36828)) ([^java.lang.CharSequence G__36830 ^java.time.format.DateTimeFormatter G__36831] (. java.time.YearMonth parse ^java.lang.CharSequence G__36830 ^java.time.format.DateTimeFormatter G__36831)))


(defn plus ^java.time.YearMonth ([^java.time.YearMonth G__36832 G__36833] (.plus ^java.time.YearMonth G__36832 G__36833)) ([^java.time.YearMonth G__36834 G__36835 G__36836] (.plus ^java.time.YearMonth G__36834 G__36835 G__36836)))


(defn with-year ^java.time.YearMonth ([^java.time.YearMonth G__36837 G__36838] (.withYear ^java.time.YearMonth G__36837 G__36838)))



(defn with-month ^java.time.YearMonth ([^java.time.YearMonth G__36839 G__36840] (.withMonth ^java.time.YearMonth G__36839 G__36840)))

