(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [LocalTime]])) #? (:clj (:import [java.time LocalTime])))

(defn compare-to ([^java.time.LocalTime G__26730 G__26731] (.compareTo ^java.time.LocalTime G__26730 G__26731)))


(defn is-supported ([^java.time.LocalTime G__26732 G__26733] (.isSupported ^java.time.LocalTime G__26732 G__26733)))


(defn query ^java.lang.Object ([^java.time.LocalTime G__26734 ^java.time.temporal.TemporalQuery G__26735] (.query ^java.time.LocalTime G__26734 ^java.time.temporal.TemporalQuery G__26735)))


(defn with-second ^java.time.LocalTime ([^java.time.LocalTime G__26736 G__26737] (.withSecond ^java.time.LocalTime G__26736 G__26737)))



(defn get-second ([^java.time.LocalTime G__26738] (jti/getter second ^java.time.LocalTime G__26738)))



(defn of-second-of-day ^java.time.LocalTime ([G__26740] (. java.time.LocalTime ofSecondOfDay G__26740)))



(defn of ^java.time.LocalTime ([G__26742 G__26743] (. java.time.LocalTime of G__26742 G__26743)) ([G__26745 G__26746 G__26747 G__26748] (. java.time.LocalTime of G__26745 G__26746 G__26747 G__26748)) ([G__26750 G__26751 G__26752] (. java.time.LocalTime of G__26750 G__26751 G__26752)))




(defn minus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__26753 G__26754] (.minusNanos ^java.time.LocalTime G__26753 G__26754)))



(defn range ^java.time.temporal.ValueRange ([^java.time.LocalTime G__26755 ^java.time.temporal.TemporalField G__26756] (.range ^java.time.LocalTime G__26755 ^java.time.temporal.TemporalField G__26756)))




(defn with-minute ^java.time.LocalTime ([^java.time.LocalTime G__26757 G__26758] (.withMinute ^java.time.LocalTime G__26757 G__26758)))






(defn format ^java.lang.String ([^java.time.LocalTime G__26759 ^java.time.format.DateTimeFormatter G__26760] (.format ^java.time.LocalTime G__26759 ^java.time.format.DateTimeFormatter G__26760)))


(defn get ([^java.time.LocalTime G__26761 ^java.time.temporal.TemporalField G__26762] (.get ^java.time.LocalTime G__26761 ^java.time.temporal.TemporalField G__26762)))


(defn truncated-to ^java.time.LocalTime ([^java.time.LocalTime G__26763 ^java.time.temporal.TemporalUnit G__26764] (.truncatedTo ^java.time.LocalTime G__26763 ^java.time.temporal.TemporalUnit G__26764)))



(defn of-nano-of-day ^java.time.LocalTime ([G__26766] (. java.time.LocalTime ofNanoOfDay G__26766)))


(defn minus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__26767 G__26768] (.minusSeconds ^java.time.LocalTime G__26767 G__26768)))


(defn now ^java.time.LocalTime ([G__26770] (. java.time.LocalTime now G__26770)) ([] (. java.time.LocalTime now)))


(defn plus-hours ^java.time.LocalTime ([^java.time.LocalTime G__26772 G__26773] (.plusHours ^java.time.LocalTime G__26772 G__26773)))





(defn plus-seconds ^java.time.LocalTime ([^java.time.LocalTime G__26774 G__26775] (.plusSeconds ^java.time.LocalTime G__26774 G__26775)))


(defn plus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__26776 G__26777] (.plusMinutes ^java.time.LocalTime G__26776 G__26777)))



(defn to-nano-of-day ([^java.time.LocalTime G__26778] (.toNanoOfDay ^java.time.LocalTime G__26778)))




(defn until ([^java.time.LocalTime G__26779 ^java.time.temporal.Temporal G__26780 ^java.time.temporal.TemporalUnit G__26781] (.until ^java.time.LocalTime G__26779 ^java.time.temporal.Temporal G__26780 ^java.time.temporal.TemporalUnit G__26781)))



(defn at-offset ^java.time.OffsetTime ([^java.time.LocalTime G__26782 ^java.time.ZoneOffset G__26783] (.atOffset ^java.time.LocalTime G__26782 ^java.time.ZoneOffset G__26783)))



(defn is-before ([^java.time.LocalTime G__26784 ^java.time.LocalTime G__26785] (.isBefore ^java.time.LocalTime G__26784 ^java.time.LocalTime G__26785)))



(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalTime G__26786 ^java.time.temporal.Temporal G__26787] (.adjustInto ^java.time.LocalTime G__26786 ^java.time.temporal.Temporal G__26787)))


(defn get-hour ([^java.time.LocalTime G__26788] (jti/getter hour ^java.time.LocalTime G__26788)))


(defn minus ^java.time.temporal.Temporal ([^java.time.LocalTime G__26789 G__26790] (.minus ^java.time.LocalTime G__26789 G__26790)) ([^java.time.LocalTime G__26791 G__26792 G__26793] (.minus ^java.time.LocalTime G__26791 G__26792 G__26793)))


(defn plus-nanos ^java.time.LocalTime ([^java.time.LocalTime G__26794 G__26795] (.plusNanos ^java.time.LocalTime G__26794 G__26795)))


(defn get-nano ([^java.time.LocalTime G__26796] (jti/getter nano ^java.time.LocalTime G__26796)))



(defn is-after ([^java.time.LocalTime G__26797 ^java.time.LocalTime G__26798] (.isAfter ^java.time.LocalTime G__26797 ^java.time.LocalTime G__26798)))



(defn to-string ^java.lang.String ([^java.time.LocalTime G__26799] (.toString ^java.time.LocalTime G__26799)))


(defn with-hour ^java.time.LocalTime ([^java.time.LocalTime G__26800 G__26801] (.withHour ^java.time.LocalTime G__26800 G__26801)))


(defn equals ([^java.time.LocalTime G__26802 ^java.lang.Object G__26803] (.equals ^java.time.LocalTime G__26802 ^java.lang.Object G__26803)))



(defn with-nano ^java.time.LocalTime ([^java.time.LocalTime G__26804 G__26805] (.withNano ^java.time.LocalTime G__26804 G__26805)))


(defn get-minute ([^java.time.LocalTime G__26806] (jti/getter minute ^java.time.LocalTime G__26806)))


(defn minus-hours ^java.time.LocalTime ([^java.time.LocalTime G__26807 G__26808] (.minusHours ^java.time.LocalTime G__26807 G__26808)))


(defn hash-code ([^java.time.LocalTime G__26809] (.hashCode ^java.time.LocalTime G__26809)))




(defn get-long ([^java.time.LocalTime G__26810 ^java.time.temporal.TemporalField G__26811] (jti/getter long ^java.time.LocalTime G__26810 ^java.time.temporal.TemporalField G__26811)))


(defn with ^java.time.temporal.Temporal ([^java.time.LocalTime G__26812 G__26813] (.with ^java.time.LocalTime G__26812 G__26813)) ([^java.time.LocalTime G__26814 G__26815 G__26816] (.with ^java.time.LocalTime G__26814 G__26815 G__26816)))


(defn from ^java.time.LocalTime ([^java.time.temporal.TemporalAccessor G__26818] (. java.time.LocalTime from ^java.time.temporal.TemporalAccessor G__26818)))


(defn parse ^java.time.LocalTime ([^java.lang.CharSequence G__26820] (. java.time.LocalTime parse ^java.lang.CharSequence G__26820)) ([^java.lang.CharSequence G__26822 ^java.time.format.DateTimeFormatter G__26823] (. java.time.LocalTime parse ^java.lang.CharSequence G__26822 ^java.time.format.DateTimeFormatter G__26823)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalTime G__26824 G__26825 G__26826] (.plus ^java.time.LocalTime G__26824 G__26825 G__26826)) ([^java.time.LocalTime G__26827 G__26828] (.plus ^java.time.LocalTime G__26827 G__26828)))


(defn at-date ^java.time.LocalDateTime ([^java.time.LocalTime G__26829 ^java.time.LocalDate G__26830] (.atDate ^java.time.LocalTime G__26829 ^java.time.LocalDate G__26830)))


(defn to-second-of-day ([^java.time.LocalTime G__26831] (.toSecondOfDay ^java.time.LocalTime G__26831)))



(defn minus-minutes ^java.time.LocalTime ([^java.time.LocalTime G__26832 G__26833] (.minusMinutes ^java.time.LocalTime G__26832 G__26833)))


