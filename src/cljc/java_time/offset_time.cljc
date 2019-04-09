(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time OffsetTime])))
(def min (. java.time.OffsetTime -MIN))
(def max (. java.time.OffsetTime -MAX))

(defn compare-to ([^java.time.OffsetTime G__55800 G__55801] (.compareTo ^java.time.OffsetTime G__55800 G__55801)))


(defn is-supported ([^java.time.OffsetTime G__55802 G__55803] (.isSupported ^java.time.OffsetTime G__55802 G__55803)))


(defn query ^java.lang.Object ([^java.time.OffsetTime G__55804 ^java.time.temporal.TemporalQuery G__55805] (.query ^java.time.OffsetTime G__55804 ^java.time.temporal.TemporalQuery G__55805)))


(defn with-second ^java.time.OffsetTime ([^java.time.OffsetTime G__55806 G__55807] (.withSecond ^java.time.OffsetTime G__55806 G__55807)))


(defn get-second ([^java.time.OffsetTime G__55808] (jti/getter second ^java.time.OffsetTime G__55808)))


(defn of ^java.time.OffsetTime ([G__55810 G__55811 G__55812 G__55813 ^java.time.ZoneOffset G__55814] (. java.time.OffsetTime of G__55810 G__55811 G__55812 G__55813 ^java.time.ZoneOffset G__55814)) ([^java.time.LocalTime G__55816 ^java.time.ZoneOffset G__55817] (. java.time.OffsetTime of ^java.time.LocalTime G__55816 ^java.time.ZoneOffset G__55817)))


(defn minus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__55818 G__55819] (.minusNanos ^java.time.OffsetTime G__55818 G__55819)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetTime G__55820 ^java.time.temporal.TemporalField G__55821] (.range ^java.time.OffsetTime G__55820 ^java.time.temporal.TemporalField G__55821)))


(defn is-equal ([^java.time.OffsetTime G__55822 ^java.time.OffsetTime G__55823] (.isEqual ^java.time.OffsetTime G__55822 ^java.time.OffsetTime G__55823)))


(defn of-instant ^java.time.OffsetTime ([^java.time.Instant G__55825 ^java.time.ZoneId G__55826] (. java.time.OffsetTime ofInstant ^java.time.Instant G__55825 ^java.time.ZoneId G__55826)))


(defn with-minute ^java.time.OffsetTime ([^java.time.OffsetTime G__55827 G__55828] (.withMinute ^java.time.OffsetTime G__55827 G__55828)))


(defn format ^java.lang.String ([^java.time.OffsetTime G__55829 ^java.time.format.DateTimeFormatter G__55830] (.format ^java.time.OffsetTime G__55829 ^java.time.format.DateTimeFormatter G__55830)))


(defn get ([^java.time.OffsetTime G__55831 ^java.time.temporal.TemporalField G__55832] (.get ^java.time.OffsetTime G__55831 ^java.time.temporal.TemporalField G__55832)))


(defn truncated-to ^java.time.OffsetTime ([^java.time.OffsetTime G__55833 ^java.time.temporal.TemporalUnit G__55834] (.truncatedTo ^java.time.OffsetTime G__55833 ^java.time.temporal.TemporalUnit G__55834)))


(defn minus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__55835 G__55836] (.minusSeconds ^java.time.OffsetTime G__55835 G__55836)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetTime G__55837] (.toLocalTime ^java.time.OffsetTime G__55837)))


(defn now ^java.time.OffsetTime ([G__55839] (. java.time.OffsetTime now G__55839)) ([] (. java.time.OffsetTime now)))


(defn plus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__55841 G__55842] (.plusHours ^java.time.OffsetTime G__55841 G__55842)))




(defn plus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__55843 G__55844] (.plusSeconds ^java.time.OffsetTime G__55843 G__55844)))


(defn plus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__55845 G__55846] (.plusMinutes ^java.time.OffsetTime G__55845 G__55846)))



(defn until ([^java.time.OffsetTime G__55847 ^java.time.temporal.Temporal G__55848 ^java.time.temporal.TemporalUnit G__55849] (.until ^java.time.OffsetTime G__55847 ^java.time.temporal.Temporal G__55848 ^java.time.temporal.TemporalUnit G__55849)))





(defn is-before ([^java.time.OffsetTime G__55850 ^java.time.OffsetTime G__55851] (.isBefore ^java.time.OffsetTime G__55850 ^java.time.OffsetTime G__55851)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetTime G__55852 ^java.time.temporal.Temporal G__55853] (.adjustInto ^java.time.OffsetTime G__55852 ^java.time.temporal.Temporal G__55853)))



(defn get-hour ([^java.time.OffsetTime G__55854] (jti/getter hour ^java.time.OffsetTime G__55854)))


(defn minus ^java.time.OffsetTime ([^java.time.OffsetTime G__55855 G__55856] (.minus ^java.time.OffsetTime G__55855 G__55856)) ([^java.time.OffsetTime G__55857 G__55858 G__55859] (.minus ^java.time.OffsetTime G__55857 G__55858 G__55859)))


(defn plus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__55860 G__55861] (.plusNanos ^java.time.OffsetTime G__55860 G__55861)))


(defn get-nano ([^java.time.OffsetTime G__55862] (jti/getter nano ^java.time.OffsetTime G__55862)))


(defn is-after ([^java.time.OffsetTime G__55863 ^java.time.OffsetTime G__55864] (.isAfter ^java.time.OffsetTime G__55863 ^java.time.OffsetTime G__55864)))


(defn to-string ^java.lang.String ([^java.time.OffsetTime G__55865] (.toString ^java.time.OffsetTime G__55865)))


(defn with-hour ^java.time.OffsetTime ([^java.time.OffsetTime G__55866 G__55867] (.withHour ^java.time.OffsetTime G__55866 G__55867)))


(defn equals ([^java.time.OffsetTime G__55868 ^java.lang.Object G__55869] (.equals ^java.time.OffsetTime G__55868 ^java.lang.Object G__55869)))



(defn with-nano ^java.time.OffsetTime ([^java.time.OffsetTime G__55870 G__55871] (.withNano ^java.time.OffsetTime G__55870 G__55871)))


(defn get-minute ([^java.time.OffsetTime G__55872] (jti/getter minute ^java.time.OffsetTime G__55872)))


(defn minus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__55873 G__55874] (.minusHours ^java.time.OffsetTime G__55873 G__55874)))


(defn hash-code ([^java.time.OffsetTime G__55875] (.hashCode ^java.time.OffsetTime G__55875)))



(defn get-long ([^java.time.OffsetTime G__55876 ^java.time.temporal.TemporalField G__55877] (.getLong ^java.time.OffsetTime G__55876 ^java.time.temporal.TemporalField G__55877)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetTime G__55878] (jti/getter offset ^java.time.OffsetTime G__55878)))


(defn with-offset-same-instant ^java.time.OffsetTime ([^java.time.OffsetTime G__55879 ^java.time.ZoneOffset G__55880] (.withOffsetSameInstant ^java.time.OffsetTime G__55879 ^java.time.ZoneOffset G__55880)))


(defn with ^java.time.temporal.Temporal ([^java.time.OffsetTime G__55881 G__55882 G__55883] (.with ^java.time.OffsetTime G__55881 G__55882 G__55883)) ([^java.time.OffsetTime G__55884 G__55885] (.with ^java.time.OffsetTime G__55884 G__55885)))


(defn from ^java.time.OffsetTime ([^java.time.temporal.TemporalAccessor G__55887] (. java.time.OffsetTime from ^java.time.temporal.TemporalAccessor G__55887)))


(defn parse ^java.time.OffsetTime ([^java.lang.CharSequence G__55889 ^java.time.format.DateTimeFormatter G__55890] (. java.time.OffsetTime parse ^java.lang.CharSequence G__55889 ^java.time.format.DateTimeFormatter G__55890)) ([^java.lang.CharSequence G__55892] (. java.time.OffsetTime parse ^java.lang.CharSequence G__55892)))


(defn plus ^java.time.temporal.Temporal ([^java.time.OffsetTime G__55893 G__55894] (.plus ^java.time.OffsetTime G__55893 G__55894)) ([^java.time.OffsetTime G__55895 G__55896 G__55897] (.plus ^java.time.OffsetTime G__55895 G__55896 G__55897)))


(defn at-date ^java.time.OffsetDateTime ([^java.time.OffsetTime G__55898 ^java.time.LocalDate G__55899] (.atDate ^java.time.OffsetTime G__55898 ^java.time.LocalDate G__55899)))



(defn with-offset-same-local ^java.time.OffsetTime ([^java.time.OffsetTime G__55900 ^java.time.ZoneOffset G__55901] (.withOffsetSameLocal ^java.time.OffsetTime G__55900 ^java.time.ZoneOffset G__55901)))



(defn minus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__55902 G__55903] (.minusMinutes ^java.time.OffsetTime G__55902 G__55903)))

