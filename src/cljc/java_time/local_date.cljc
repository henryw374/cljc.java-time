(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDate]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDate])))

(defn compare-to ([^java.time.LocalDate G__35674 G__35675] (.compareTo ^java.time.LocalDate G__35674 G__35675)))


(defn is-supported ([^java.time.LocalDate G__35676 G__35677] (.isSupported ^java.time.LocalDate G__35676 G__35677)))


(defn plus-years ^java.time.LocalDate ([^java.time.LocalDate G__35678 G__35679] (.plusYears ^java.time.LocalDate G__35678 G__35679)))


(defn get-era ^java.time.chrono.Era ([^java.time.LocalDate G__35680] (jti/getter era ^java.time.LocalDate G__35680)))


(defn query ^java.lang.Object ([^java.time.LocalDate G__35681 ^java.time.temporal.TemporalQuery G__35682] (.query ^java.time.LocalDate G__35681 ^java.time.temporal.TemporalQuery G__35682)))


(defn get-day-of-month ([^java.time.LocalDate G__35683] (jti/getter dayOfMonth ^java.time.LocalDate G__35683)))



(defn of ^java.time.LocalDate ([G__35685 G__35686 G__35687] (. java.time.LocalDate of G__35685 G__35686 G__35687)))




(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDate G__35688 ^java.time.temporal.TemporalField G__35689] (.range ^java.time.LocalDate G__35688 ^java.time.temporal.TemporalField G__35689)))



(defn of-epoch-day ^java.time.LocalDate ([G__35691] (. java.time.LocalDate ofEpochDay G__35691)))


(defn at-start-of-day ^java.time.ZonedDateTime ([^java.time.LocalDate G__35692 ^java.time.ZoneId G__35693] (.atStartOfDay ^java.time.LocalDate G__35692 ^java.time.ZoneId G__35693)) ([^java.time.LocalDate G__35694] (.atStartOfDay ^java.time.LocalDate G__35694)))


(defn with-day-of-year ^java.time.LocalDate ([^java.time.LocalDate G__35695 G__35696] (.withDayOfYear ^java.time.LocalDate G__35695 G__35696)))


(defn is-equal ([^java.time.LocalDate G__35697 ^java.time.chrono.ChronoLocalDate G__35698] (.isEqual ^java.time.LocalDate G__35697 ^java.time.chrono.ChronoLocalDate G__35698)))



(defn length-of-month ([^java.time.LocalDate G__35699] (.lengthOfMonth ^java.time.LocalDate G__35699)))




(defn format ^java.lang.String ([^java.time.LocalDate G__35700 ^java.time.format.DateTimeFormatter G__35701] (.format ^java.time.LocalDate G__35700 ^java.time.format.DateTimeFormatter G__35701)))


(defn minus-months ^java.time.LocalDate ([^java.time.LocalDate G__35702 G__35703] (.minusMonths ^java.time.LocalDate G__35702 G__35703)))


(defn get ([^java.time.LocalDate G__35704 ^java.time.temporal.TemporalField G__35705] (.get ^java.time.LocalDate G__35704 ^java.time.temporal.TemporalField G__35705)))


(defn minus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__35706 G__35707] (.minusWeeks ^java.time.LocalDate G__35706 G__35707)))


(defn at-time ^java.time.OffsetDateTime ([^java.time.LocalDate G__35708 G__35709] (.atTime ^java.time.LocalDate G__35708 G__35709)) ([^java.time.LocalDate G__35710 G__35711 G__35712 G__35713 G__35714] (.atTime ^java.time.LocalDate G__35710 G__35711 G__35712 G__35713 G__35714)) ([^java.time.LocalDate G__35715 G__35716 G__35717 G__35718] (.atTime ^java.time.LocalDate G__35715 G__35716 G__35717 G__35718)) ([^java.time.LocalDate G__35719 G__35720 G__35721] (.atTime ^java.time.LocalDate G__35719 G__35720 G__35721)))


(defn now ^java.time.LocalDate ([] (. java.time.LocalDate now)) ([G__35724] (. java.time.LocalDate now G__35724)))


(defn minus-years ^java.time.LocalDate ([^java.time.LocalDate G__35725 G__35726] (.minusYears ^java.time.LocalDate G__35725 G__35726)))


(defn minus-days ^java.time.LocalDate ([^java.time.LocalDate G__35727 G__35728] (.minusDays ^java.time.LocalDate G__35727 G__35728)))



(defn get-day-of-year ([^java.time.LocalDate G__35729] (jti/getter dayOfYear ^java.time.LocalDate G__35729)))


(defn get-month ^java.time.Month ([^java.time.LocalDate G__35730] (jti/getter month ^java.time.LocalDate G__35730)))





(defn until ([^java.time.LocalDate G__35731 ^java.time.temporal.Temporal G__35732 ^java.time.temporal.TemporalUnit G__35733] (.until ^java.time.LocalDate G__35731 ^java.time.temporal.Temporal G__35732 ^java.time.temporal.TemporalUnit G__35733)) ([^java.time.LocalDate G__35734 G__35735] (.until ^java.time.LocalDate G__35734 G__35735)))





(defn is-before ([^java.time.LocalDate G__35736 ^java.time.chrono.ChronoLocalDate G__35737] (.isBefore ^java.time.LocalDate G__35736 ^java.time.chrono.ChronoLocalDate G__35737)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDate G__35738 ^java.time.temporal.Temporal G__35739] (.adjustInto ^java.time.LocalDate G__35738 ^java.time.temporal.Temporal G__35739)))


(defn minus ^java.time.LocalDate ([^java.time.LocalDate G__35740 G__35741 G__35742] (.minus ^java.time.LocalDate G__35740 G__35741 G__35742)) ([^java.time.LocalDate G__35743 G__35744] (.minus ^java.time.LocalDate G__35743 G__35744)))



(defn get-year ([^java.time.LocalDate G__35745] (jti/getter year ^java.time.LocalDate G__35745)))


(defn with-day-of-month ^java.time.LocalDate ([^java.time.LocalDate G__35746 G__35747] (.withDayOfMonth ^java.time.LocalDate G__35746 G__35747)))


(defn to-epoch-day ([^java.time.LocalDate G__35748] (.toEpochDay ^java.time.LocalDate G__35748)))


(defn is-after ([^java.time.LocalDate G__35749 ^java.time.chrono.ChronoLocalDate G__35750] (.isAfter ^java.time.LocalDate G__35749 ^java.time.chrono.ChronoLocalDate G__35750)))


(defn of-year-day ^java.time.LocalDate ([G__35752 G__35753] (. java.time.LocalDate ofYearDay G__35752 G__35753)))


(defn get-chronology ^java.time.chrono.Chronology ([^java.time.LocalDate G__35754] (jti/getter chronology ^java.time.LocalDate G__35754)))


(defn to-string ^java.lang.String ([^java.time.LocalDate G__35755] (.toString ^java.time.LocalDate G__35755)))


(defn plus-months ^java.time.LocalDate ([^java.time.LocalDate G__35756 G__35757] (.plusMonths ^java.time.LocalDate G__35756 G__35757)))


(defn equals ([^java.time.LocalDate G__35758 ^java.lang.Object G__35759] (.equals ^java.time.LocalDate G__35758 ^java.lang.Object G__35759)))


(defn get-month-value ([^java.time.LocalDate G__35760] (jti/getter monthValue ^java.time.LocalDate G__35760)))



(defn length-of-year ([^java.time.LocalDate G__35761] (.lengthOfYear ^java.time.LocalDate G__35761)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDate G__35762] (jti/getter dayOfWeek ^java.time.LocalDate G__35762)))


(defn plus-days ^java.time.LocalDate ([^java.time.LocalDate G__35763 G__35764] (.plusDays ^java.time.LocalDate G__35763 G__35764)))



(defn plus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__35765 G__35766] (.plusWeeks ^java.time.LocalDate G__35765 G__35766)))


(defn hash-code ([^java.time.LocalDate G__35767] (.hashCode ^java.time.LocalDate G__35767)))



(defn get-long ([^java.time.LocalDate G__35768 ^java.time.temporal.TemporalField G__35769] (jti/getter long ^java.time.LocalDate G__35768 ^java.time.temporal.TemporalField G__35769)))


(defn is-leap-year ([^java.time.LocalDate G__35770] (.isLeapYear ^java.time.LocalDate G__35770)))


(defn with ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDate G__35771 G__35772] (.with ^java.time.LocalDate G__35771 G__35772)) ([^java.time.LocalDate G__35773 G__35774 G__35775] (.with ^java.time.LocalDate G__35773 G__35774 G__35775)))


(defn from ^java.time.LocalDate ([^java.time.temporal.TemporalAccessor G__35777] (. java.time.LocalDate from ^java.time.temporal.TemporalAccessor G__35777)))


(defn parse ^java.time.LocalDate ([^java.lang.CharSequence G__35779 ^java.time.format.DateTimeFormatter G__35780] (. java.time.LocalDate parse ^java.lang.CharSequence G__35779 ^java.time.format.DateTimeFormatter G__35780)) ([^java.lang.CharSequence G__35782] (. java.time.LocalDate parse ^java.lang.CharSequence G__35782)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalDate G__35783 G__35784 G__35785] (.plus ^java.time.LocalDate G__35783 G__35784 G__35785)) ([^java.time.LocalDate G__35786 G__35787] (.plus ^java.time.LocalDate G__35786 G__35787)))


(defn with-year ^java.time.LocalDate ([^java.time.LocalDate G__35788 G__35789] (.withYear ^java.time.LocalDate G__35788 G__35789)))



(defn with-month ^java.time.LocalDate ([^java.time.LocalDate G__35790 G__35791] (.withMonth ^java.time.LocalDate G__35790 G__35791)))


