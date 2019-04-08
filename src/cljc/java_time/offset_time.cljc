(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetTime])))

(defn compare-to ([^java.time.OffsetTime G__34601 G__34602] (.compareTo ^java.time.OffsetTime G__34601 G__34602)))


(defn is-supported ([^java.time.OffsetTime G__34603 G__34604] (.isSupported ^java.time.OffsetTime G__34603 G__34604)))


(defn query ^java.lang.Object ([^java.time.OffsetTime G__34605 ^java.time.temporal.TemporalQuery G__34606] (.query ^java.time.OffsetTime G__34605 ^java.time.temporal.TemporalQuery G__34606)))


(defn with-second ^java.time.OffsetTime ([^java.time.OffsetTime G__34607 G__34608] (.withSecond ^java.time.OffsetTime G__34607 G__34608)))


(defn get-second ([^java.time.OffsetTime G__34609] (jti/getter second ^java.time.OffsetTime G__34609)))


(defn of ^java.time.OffsetTime ([G__34611 G__34612 G__34613 G__34614 ^java.time.ZoneOffset G__34615] (. java.time.OffsetTime of G__34611 G__34612 G__34613 G__34614 ^java.time.ZoneOffset G__34615)) ([^java.time.LocalTime G__34617 ^java.time.ZoneOffset G__34618] (. java.time.OffsetTime of ^java.time.LocalTime G__34617 ^java.time.ZoneOffset G__34618)))


(defn minus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__34619 G__34620] (.minusNanos ^java.time.OffsetTime G__34619 G__34620)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetTime G__34621 ^java.time.temporal.TemporalField G__34622] (.range ^java.time.OffsetTime G__34621 ^java.time.temporal.TemporalField G__34622)))


(defn is-equal ([^java.time.OffsetTime G__34623 ^java.time.OffsetTime G__34624] (.isEqual ^java.time.OffsetTime G__34623 ^java.time.OffsetTime G__34624)))


(defn of-instant ^java.time.OffsetTime ([^java.time.Instant G__34626 ^java.time.ZoneId G__34627] (. java.time.OffsetTime ofInstant ^java.time.Instant G__34626 ^java.time.ZoneId G__34627)))


(defn with-minute ^java.time.OffsetTime ([^java.time.OffsetTime G__34628 G__34629] (.withMinute ^java.time.OffsetTime G__34628 G__34629)))


(defn format ^java.lang.String ([^java.time.OffsetTime G__34630 ^java.time.format.DateTimeFormatter G__34631] (.format ^java.time.OffsetTime G__34630 ^java.time.format.DateTimeFormatter G__34631)))


(defn get ([^java.time.OffsetTime G__34632 ^java.time.temporal.TemporalField G__34633] (.get ^java.time.OffsetTime G__34632 ^java.time.temporal.TemporalField G__34633)))


(defn truncated-to ^java.time.OffsetTime ([^java.time.OffsetTime G__34634 ^java.time.temporal.TemporalUnit G__34635] (.truncatedTo ^java.time.OffsetTime G__34634 ^java.time.temporal.TemporalUnit G__34635)))


(defn minus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__34636 G__34637] (.minusSeconds ^java.time.OffsetTime G__34636 G__34637)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetTime G__34638] (.toLocalTime ^java.time.OffsetTime G__34638)))


(defn now ^java.time.OffsetTime ([G__34640] (. java.time.OffsetTime now G__34640)) ([] (. java.time.OffsetTime now)))


(defn plus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__34642 G__34643] (.plusHours ^java.time.OffsetTime G__34642 G__34643)))




(defn plus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__34644 G__34645] (.plusSeconds ^java.time.OffsetTime G__34644 G__34645)))


(defn plus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__34646 G__34647] (.plusMinutes ^java.time.OffsetTime G__34646 G__34647)))



(defn until ([^java.time.OffsetTime G__34648 ^java.time.temporal.Temporal G__34649 ^java.time.temporal.TemporalUnit G__34650] (.until ^java.time.OffsetTime G__34648 ^java.time.temporal.Temporal G__34649 ^java.time.temporal.TemporalUnit G__34650)))





(defn is-before ([^java.time.OffsetTime G__34651 ^java.time.OffsetTime G__34652] (.isBefore ^java.time.OffsetTime G__34651 ^java.time.OffsetTime G__34652)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetTime G__34653 ^java.time.temporal.Temporal G__34654] (.adjustInto ^java.time.OffsetTime G__34653 ^java.time.temporal.Temporal G__34654)))



(defn get-hour ([^java.time.OffsetTime G__34655] (jti/getter hour ^java.time.OffsetTime G__34655)))


(defn minus ^java.time.OffsetTime ([^java.time.OffsetTime G__34656 G__34657] (.minus ^java.time.OffsetTime G__34656 G__34657)) ([^java.time.OffsetTime G__34658 G__34659 G__34660] (.minus ^java.time.OffsetTime G__34658 G__34659 G__34660)))


(defn plus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__34661 G__34662] (.plusNanos ^java.time.OffsetTime G__34661 G__34662)))


(defn get-nano ([^java.time.OffsetTime G__34663] (jti/getter nano ^java.time.OffsetTime G__34663)))


(defn is-after ([^java.time.OffsetTime G__34664 ^java.time.OffsetTime G__34665] (.isAfter ^java.time.OffsetTime G__34664 ^java.time.OffsetTime G__34665)))


(defn to-string ^java.lang.String ([^java.time.OffsetTime G__34666] (.toString ^java.time.OffsetTime G__34666)))


(defn with-hour ^java.time.OffsetTime ([^java.time.OffsetTime G__34667 G__34668] (.withHour ^java.time.OffsetTime G__34667 G__34668)))


(defn equals ([^java.time.OffsetTime G__34669 ^java.lang.Object G__34670] (.equals ^java.time.OffsetTime G__34669 ^java.lang.Object G__34670)))



(defn with-nano ^java.time.OffsetTime ([^java.time.OffsetTime G__34671 G__34672] (.withNano ^java.time.OffsetTime G__34671 G__34672)))


(defn get-minute ([^java.time.OffsetTime G__34673] (jti/getter minute ^java.time.OffsetTime G__34673)))


(defn minus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__34674 G__34675] (.minusHours ^java.time.OffsetTime G__34674 G__34675)))


(defn hash-code ([^java.time.OffsetTime G__34676] (.hashCode ^java.time.OffsetTime G__34676)))



(defn get-long ([^java.time.OffsetTime G__34677 ^java.time.temporal.TemporalField G__34678] (jti/getter long ^java.time.OffsetTime G__34677 ^java.time.temporal.TemporalField G__34678)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetTime G__34679] (jti/getter offset ^java.time.OffsetTime G__34679)))


(defn with-offset-same-instant ^java.time.OffsetTime ([^java.time.OffsetTime G__34680 ^java.time.ZoneOffset G__34681] (.withOffsetSameInstant ^java.time.OffsetTime G__34680 ^java.time.ZoneOffset G__34681)))


(defn with ^java.time.temporal.Temporal ([^java.time.OffsetTime G__34682 G__34683 G__34684] (.with ^java.time.OffsetTime G__34682 G__34683 G__34684)) ([^java.time.OffsetTime G__34685 G__34686] (.with ^java.time.OffsetTime G__34685 G__34686)))


(defn from ^java.time.OffsetTime ([^java.time.temporal.TemporalAccessor G__34688] (. java.time.OffsetTime from ^java.time.temporal.TemporalAccessor G__34688)))


(defn parse ^java.time.OffsetTime ([^java.lang.CharSequence G__34690 ^java.time.format.DateTimeFormatter G__34691] (. java.time.OffsetTime parse ^java.lang.CharSequence G__34690 ^java.time.format.DateTimeFormatter G__34691)) ([^java.lang.CharSequence G__34693] (. java.time.OffsetTime parse ^java.lang.CharSequence G__34693)))


(defn plus ^java.time.temporal.Temporal ([^java.time.OffsetTime G__34694 G__34695] (.plus ^java.time.OffsetTime G__34694 G__34695)) ([^java.time.OffsetTime G__34696 G__34697 G__34698] (.plus ^java.time.OffsetTime G__34696 G__34697 G__34698)))


(defn at-date ^java.time.OffsetDateTime ([^java.time.OffsetTime G__34699 ^java.time.LocalDate G__34700] (.atDate ^java.time.OffsetTime G__34699 ^java.time.LocalDate G__34700)))



(defn with-offset-same-local ^java.time.OffsetTime ([^java.time.OffsetTime G__34701 ^java.time.ZoneOffset G__34702] (.withOffsetSameLocal ^java.time.OffsetTime G__34701 ^java.time.ZoneOffset G__34702)))



(defn minus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__34703 G__34704] (.minusMinutes ^java.time.OffsetTime G__34703 G__34704)))

