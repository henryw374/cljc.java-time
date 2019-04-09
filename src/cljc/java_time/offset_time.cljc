(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetTime])))
(def min (. java.time.OffsetTime -MIN))
(def max (. java.time.OffsetTime -MAX))

(defn compare-to ([^java.time.OffsetTime G__46727 G__46728] (.compareTo ^java.time.OffsetTime G__46727 G__46728)))


(defn is-supported ([^java.time.OffsetTime G__46729 G__46730] (.isSupported ^java.time.OffsetTime G__46729 G__46730)))


(defn query ^java.lang.Object ([^java.time.OffsetTime G__46731 ^java.time.temporal.TemporalQuery G__46732] (.query ^java.time.OffsetTime G__46731 ^java.time.temporal.TemporalQuery G__46732)))


(defn with-second ^java.time.OffsetTime ([^java.time.OffsetTime G__46733 G__46734] (.withSecond ^java.time.OffsetTime G__46733 G__46734)))


(defn get-second ([^java.time.OffsetTime G__46735] (jti/getter second ^java.time.OffsetTime G__46735)))


(defn of ^java.time.OffsetTime ([G__46737 G__46738 G__46739 G__46740 ^java.time.ZoneOffset G__46741] (. java.time.OffsetTime of G__46737 G__46738 G__46739 G__46740 ^java.time.ZoneOffset G__46741)) ([^java.time.LocalTime G__46743 ^java.time.ZoneOffset G__46744] (. java.time.OffsetTime of ^java.time.LocalTime G__46743 ^java.time.ZoneOffset G__46744)))


(defn minus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__46745 G__46746] (.minusNanos ^java.time.OffsetTime G__46745 G__46746)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetTime G__46747 ^java.time.temporal.TemporalField G__46748] (.range ^java.time.OffsetTime G__46747 ^java.time.temporal.TemporalField G__46748)))


(defn is-equal ([^java.time.OffsetTime G__46749 ^java.time.OffsetTime G__46750] (.isEqual ^java.time.OffsetTime G__46749 ^java.time.OffsetTime G__46750)))


(defn of-instant ^java.time.OffsetTime ([^java.time.Instant G__46752 ^java.time.ZoneId G__46753] (. java.time.OffsetTime ofInstant ^java.time.Instant G__46752 ^java.time.ZoneId G__46753)))


(defn with-minute ^java.time.OffsetTime ([^java.time.OffsetTime G__46754 G__46755] (.withMinute ^java.time.OffsetTime G__46754 G__46755)))


(defn format ^java.lang.String ([^java.time.OffsetTime G__46756 ^java.time.format.DateTimeFormatter G__46757] (.format ^java.time.OffsetTime G__46756 ^java.time.format.DateTimeFormatter G__46757)))


(defn get ([^java.time.OffsetTime G__46758 ^java.time.temporal.TemporalField G__46759] (.get ^java.time.OffsetTime G__46758 ^java.time.temporal.TemporalField G__46759)))


(defn truncated-to ^java.time.OffsetTime ([^java.time.OffsetTime G__46760 ^java.time.temporal.TemporalUnit G__46761] (.truncatedTo ^java.time.OffsetTime G__46760 ^java.time.temporal.TemporalUnit G__46761)))


(defn minus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__46762 G__46763] (.minusSeconds ^java.time.OffsetTime G__46762 G__46763)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetTime G__46764] (.toLocalTime ^java.time.OffsetTime G__46764)))


(defn now ^java.time.OffsetTime ([G__46766] (. java.time.OffsetTime now G__46766)) ([] (. java.time.OffsetTime now)))


(defn plus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__46768 G__46769] (.plusHours ^java.time.OffsetTime G__46768 G__46769)))




(defn plus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__46770 G__46771] (.plusSeconds ^java.time.OffsetTime G__46770 G__46771)))


(defn plus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__46772 G__46773] (.plusMinutes ^java.time.OffsetTime G__46772 G__46773)))



(defn until ([^java.time.OffsetTime G__46774 ^java.time.temporal.Temporal G__46775 ^java.time.temporal.TemporalUnit G__46776] (.until ^java.time.OffsetTime G__46774 ^java.time.temporal.Temporal G__46775 ^java.time.temporal.TemporalUnit G__46776)))





(defn is-before ([^java.time.OffsetTime G__46777 ^java.time.OffsetTime G__46778] (.isBefore ^java.time.OffsetTime G__46777 ^java.time.OffsetTime G__46778)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetTime G__46779 ^java.time.temporal.Temporal G__46780] (.adjustInto ^java.time.OffsetTime G__46779 ^java.time.temporal.Temporal G__46780)))



(defn get-hour ([^java.time.OffsetTime G__46781] (jti/getter hour ^java.time.OffsetTime G__46781)))


(defn minus ^java.time.OffsetTime ([^java.time.OffsetTime G__46782 G__46783] (.minus ^java.time.OffsetTime G__46782 G__46783)) ([^java.time.OffsetTime G__46784 G__46785 G__46786] (.minus ^java.time.OffsetTime G__46784 G__46785 G__46786)))


(defn plus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__46787 G__46788] (.plusNanos ^java.time.OffsetTime G__46787 G__46788)))


(defn get-nano ([^java.time.OffsetTime G__46789] (jti/getter nano ^java.time.OffsetTime G__46789)))


(defn is-after ([^java.time.OffsetTime G__46790 ^java.time.OffsetTime G__46791] (.isAfter ^java.time.OffsetTime G__46790 ^java.time.OffsetTime G__46791)))


(defn to-string ^java.lang.String ([^java.time.OffsetTime G__46792] (.toString ^java.time.OffsetTime G__46792)))


(defn with-hour ^java.time.OffsetTime ([^java.time.OffsetTime G__46793 G__46794] (.withHour ^java.time.OffsetTime G__46793 G__46794)))


(defn equals ([^java.time.OffsetTime G__46795 ^java.lang.Object G__46796] (.equals ^java.time.OffsetTime G__46795 ^java.lang.Object G__46796)))



(defn with-nano ^java.time.OffsetTime ([^java.time.OffsetTime G__46797 G__46798] (.withNano ^java.time.OffsetTime G__46797 G__46798)))


(defn get-minute ([^java.time.OffsetTime G__46799] (jti/getter minute ^java.time.OffsetTime G__46799)))


(defn minus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__46800 G__46801] (.minusHours ^java.time.OffsetTime G__46800 G__46801)))


(defn hash-code ([^java.time.OffsetTime G__46802] (.hashCode ^java.time.OffsetTime G__46802)))



(defn get-long ([^java.time.OffsetTime G__46803 ^java.time.temporal.TemporalField G__46804] (.getLong ^java.time.OffsetTime G__46803 ^java.time.temporal.TemporalField G__46804)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetTime G__46805] (jti/getter offset ^java.time.OffsetTime G__46805)))


(defn with-offset-same-instant ^java.time.OffsetTime ([^java.time.OffsetTime G__46806 ^java.time.ZoneOffset G__46807] (.withOffsetSameInstant ^java.time.OffsetTime G__46806 ^java.time.ZoneOffset G__46807)))


(defn with ^java.time.temporal.Temporal ([^java.time.OffsetTime G__46808 G__46809 G__46810] (.with ^java.time.OffsetTime G__46808 G__46809 G__46810)) ([^java.time.OffsetTime G__46811 G__46812] (.with ^java.time.OffsetTime G__46811 G__46812)))


(defn from ^java.time.OffsetTime ([^java.time.temporal.TemporalAccessor G__46814] (. java.time.OffsetTime from ^java.time.temporal.TemporalAccessor G__46814)))


(defn parse ^java.time.OffsetTime ([^java.lang.CharSequence G__46816 ^java.time.format.DateTimeFormatter G__46817] (. java.time.OffsetTime parse ^java.lang.CharSequence G__46816 ^java.time.format.DateTimeFormatter G__46817)) ([^java.lang.CharSequence G__46819] (. java.time.OffsetTime parse ^java.lang.CharSequence G__46819)))


(defn plus ^java.time.temporal.Temporal ([^java.time.OffsetTime G__46820 G__46821] (.plus ^java.time.OffsetTime G__46820 G__46821)) ([^java.time.OffsetTime G__46822 G__46823 G__46824] (.plus ^java.time.OffsetTime G__46822 G__46823 G__46824)))


(defn at-date ^java.time.OffsetDateTime ([^java.time.OffsetTime G__46825 ^java.time.LocalDate G__46826] (.atDate ^java.time.OffsetTime G__46825 ^java.time.LocalDate G__46826)))



(defn with-offset-same-local ^java.time.OffsetTime ([^java.time.OffsetTime G__46827 ^java.time.ZoneOffset G__46828] (.withOffsetSameLocal ^java.time.OffsetTime G__46827 ^java.time.ZoneOffset G__46828)))



(defn minus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__46829 G__46830] (.minusMinutes ^java.time.OffsetTime G__46829 G__46830)))

