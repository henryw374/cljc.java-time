(ns cljc.java-time.zoned-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZonedDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time ZonedDateTime])))


(defn is-supported ([^java.time.ZonedDateTime G__46579 G__46580] (.isSupported ^java.time.ZonedDateTime G__46579 G__46580)))


(defn plus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46581 G__46582] (.plusYears ^java.time.ZonedDateTime G__46581 G__46582)))


(defn query ^java.lang.Object ([^java.time.ZonedDateTime G__46583 ^java.time.temporal.TemporalQuery G__46584] (.query ^java.time.ZonedDateTime G__46583 ^java.time.temporal.TemporalQuery G__46584)))


(defn with-second ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46585 G__46586] (.withSecond ^java.time.ZonedDateTime G__46585 G__46586)))


(defn with-later-offset-at-overlap ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46587] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime G__46587)))


(defn get-second ([^java.time.ZonedDateTime G__46588] (jti/getter second ^java.time.ZonedDateTime G__46588)))


(defn get-day-of-month ([^java.time.ZonedDateTime G__46589] (jti/getter dayOfMonth ^java.time.ZonedDateTime G__46589)))



(defn of ^java.time.ZonedDateTime ([G__46591 G__46592 G__46593 G__46594 G__46595 G__46596 G__46597 ^java.time.ZoneId G__46598] (. java.time.ZonedDateTime of G__46591 G__46592 G__46593 G__46594 G__46595 G__46596 G__46597 ^java.time.ZoneId G__46598)) ([^java.time.LocalDateTime G__46600 ^java.time.ZoneId G__46601] (. java.time.ZonedDateTime of ^java.time.LocalDateTime G__46600 ^java.time.ZoneId G__46601)) ([^java.time.LocalDate G__46603 ^java.time.LocalTime G__46604 ^java.time.ZoneId G__46605] (. java.time.ZonedDateTime of ^java.time.LocalDate G__46603 ^java.time.LocalTime G__46604 ^java.time.ZoneId G__46605)))


(defn to-offset-date-time ^java.time.OffsetDateTime ([^java.time.ZonedDateTime G__46606] (.toOffsetDateTime ^java.time.ZonedDateTime G__46606)))


(defn minus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46607 G__46608] (.minusNanos ^java.time.ZonedDateTime G__46607 G__46608)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZonedDateTime G__46609 ^java.time.temporal.TemporalField G__46610] (.range ^java.time.ZonedDateTime G__46609 ^java.time.temporal.TemporalField G__46610)))


(defn with-day-of-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46611 G__46612] (.withDayOfYear ^java.time.ZonedDateTime G__46611 G__46612)))


(defn of-instant ^java.time.ZonedDateTime ([^java.time.Instant G__46614 ^java.time.ZoneId G__46615] (. java.time.ZonedDateTime ofInstant ^java.time.Instant G__46614 ^java.time.ZoneId G__46615)) ([^java.time.LocalDateTime G__46617 ^java.time.ZoneOffset G__46618 ^java.time.ZoneId G__46619] (. java.time.ZonedDateTime ofInstant ^java.time.LocalDateTime G__46617 ^java.time.ZoneOffset G__46618 ^java.time.ZoneId G__46619)))


(defn with-minute ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46620 G__46621] (.withMinute ^java.time.ZonedDateTime G__46620 G__46621)))



(defn format ^java.lang.String ([^java.time.ZonedDateTime G__46622 ^java.time.format.DateTimeFormatter G__46623] (.format ^java.time.ZonedDateTime G__46622 ^java.time.format.DateTimeFormatter G__46623)))


(defn minus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46624 G__46625] (.minusMonths ^java.time.ZonedDateTime G__46624 G__46625)))


(defn get ([^java.time.ZonedDateTime G__46626 ^java.time.temporal.TemporalField G__46627] (.get ^java.time.ZonedDateTime G__46626 ^java.time.temporal.TemporalField G__46627)))


(defn truncated-to ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46628 ^java.time.temporal.TemporalUnit G__46629] (.truncatedTo ^java.time.ZonedDateTime G__46628 ^java.time.temporal.TemporalUnit G__46629)))


(defn minus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46630 G__46631] (.minusWeeks ^java.time.ZonedDateTime G__46630 G__46631)))


(defn minus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46632 G__46633] (.minusSeconds ^java.time.ZonedDateTime G__46632 G__46633)))


(defn to-local-time ^java.time.LocalTime ([^java.time.ZonedDateTime G__46634] (.toLocalTime ^java.time.ZonedDateTime G__46634)))


(defn now ^java.time.ZonedDateTime ([G__46636] (. java.time.ZonedDateTime now G__46636)) ([] (. java.time.ZonedDateTime now)))


(defn minus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46638 G__46639] (.minusYears ^java.time.ZonedDateTime G__46638 G__46639)))


(defn minus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46640 G__46641] (.minusDays ^java.time.ZonedDateTime G__46640 G__46641)))


(defn plus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46642 G__46643] (.plusHours ^java.time.ZonedDateTime G__46642 G__46643)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.ZonedDateTime G__46644] (.toLocalDateTime ^java.time.ZonedDateTime G__46644)))



(defn with-fixed-offset-zone ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46645] (.withFixedOffsetZone ^java.time.ZonedDateTime G__46645)))


(defn get-day-of-year ([^java.time.ZonedDateTime G__46646] (jti/getter dayOfYear ^java.time.ZonedDateTime G__46646)))


(defn get-month ^java.time.Month ([^java.time.ZonedDateTime G__46647] (jti/getter month ^java.time.ZonedDateTime G__46647)))





(defn plus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46648 G__46649] (.plusSeconds ^java.time.ZonedDateTime G__46648 G__46649)))


(defn plus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46650 G__46651] (.plusMinutes ^java.time.ZonedDateTime G__46650 G__46651)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.ZonedDateTime G__46652] (.toLocalDate ^java.time.ZonedDateTime G__46652)))


(defn get-zone ^java.time.ZoneId ([^java.time.ZonedDateTime G__46653] (jti/getter zone ^java.time.ZonedDateTime G__46653)))



(defn until ([^java.time.ZonedDateTime G__46654 ^java.time.temporal.Temporal G__46655 ^java.time.temporal.TemporalUnit G__46656] (.until ^java.time.ZonedDateTime G__46654 ^java.time.temporal.Temporal G__46655 ^java.time.temporal.TemporalUnit G__46656)))




(defn get-hour ([^java.time.ZonedDateTime G__46657] (jti/getter hour ^java.time.ZonedDateTime G__46657)))


(defn minus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__46658 G__46659] (.minus ^java.time.ZonedDateTime G__46658 G__46659)) ([^java.time.ZonedDateTime G__46660 G__46661 G__46662] (.minus ^java.time.ZonedDateTime G__46660 G__46661 G__46662)))


(defn plus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46663 G__46664] (.plusNanos ^java.time.ZonedDateTime G__46663 G__46664)))


(defn get-nano ([^java.time.ZonedDateTime G__46665] (jti/getter nano ^java.time.ZonedDateTime G__46665)))


(defn get-year ([^java.time.ZonedDateTime G__46666] (jti/getter year ^java.time.ZonedDateTime G__46666)))


(defn with-day-of-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46667 G__46668] (.withDayOfMonth ^java.time.ZonedDateTime G__46667 G__46668)))


(defn to-string ^java.lang.String ([^java.time.ZonedDateTime G__46669] (.toString ^java.time.ZonedDateTime G__46669)))


(defn with-zone-same-instant ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46670 G__46671] (.withZoneSameInstant ^java.time.ZonedDateTime G__46670 G__46671)))


(defn plus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46672 G__46673] (.plusMonths ^java.time.ZonedDateTime G__46672 G__46673)))


(defn with-hour ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46674 G__46675] (.withHour ^java.time.ZonedDateTime G__46674 G__46675)))


(defn with-zone-same-local ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46676 G__46677] (.withZoneSameLocal ^java.time.ZonedDateTime G__46676 G__46677)))


(defn equals ([^java.time.ZonedDateTime G__46678 ^java.lang.Object G__46679] (.equals ^java.time.ZonedDateTime G__46678 ^java.lang.Object G__46679)))



(defn get-month-value ([^java.time.ZonedDateTime G__46680] (jti/getter monthValue ^java.time.ZonedDateTime G__46680)))


(defn with-nano ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46681 G__46682] (.withNano ^java.time.ZonedDateTime G__46681 G__46682)))


(defn get-minute ([^java.time.ZonedDateTime G__46683] (jti/getter minute ^java.time.ZonedDateTime G__46683)))


(defn of-local ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__46685 ^java.time.ZoneId G__46686 ^java.time.ZoneOffset G__46687] (. java.time.ZonedDateTime ofLocal ^java.time.LocalDateTime G__46685 ^java.time.ZoneId G__46686 ^java.time.ZoneOffset G__46687)))


(defn minus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46688 G__46689] (.minusHours ^java.time.ZonedDateTime G__46688 G__46689)))


(defn with-earlier-offset-at-overlap ^java.time.chrono.ChronoZonedDateTime ([^java.time.ZonedDateTime G__46690] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime G__46690)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.ZonedDateTime G__46691] (jti/getter dayOfWeek ^java.time.ZonedDateTime G__46691)))


(defn plus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46692 G__46693] (.plusDays ^java.time.ZonedDateTime G__46692 G__46693)))


(defn plus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46694 G__46695] (.plusWeeks ^java.time.ZonedDateTime G__46694 G__46695)))


(defn hash-code ([^java.time.ZonedDateTime G__46696] (.hashCode ^java.time.ZonedDateTime G__46696)))



(defn of-strict ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__46698 ^java.time.ZoneOffset G__46699 ^java.time.ZoneId G__46700] (. java.time.ZonedDateTime ofStrict ^java.time.LocalDateTime G__46698 ^java.time.ZoneOffset G__46699 ^java.time.ZoneId G__46700)))


(defn get-long ([^java.time.ZonedDateTime G__46701 ^java.time.temporal.TemporalField G__46702] (.getLong ^java.time.ZonedDateTime G__46701 ^java.time.temporal.TemporalField G__46702)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.ZonedDateTime G__46703] (jti/getter offset ^java.time.ZonedDateTime G__46703)))


(defn with ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__46704 G__46705 G__46706] (.with ^java.time.ZonedDateTime G__46704 G__46705 G__46706)) ([^java.time.ZonedDateTime G__46707 G__46708] (.with ^java.time.ZonedDateTime G__46707 G__46708)))


(defn from ^java.time.ZonedDateTime ([^java.time.temporal.TemporalAccessor G__46710] (. java.time.ZonedDateTime from ^java.time.temporal.TemporalAccessor G__46710)))


(defn parse ^java.time.ZonedDateTime ([^java.lang.CharSequence G__46712] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__46712)) ([^java.lang.CharSequence G__46714 ^java.time.format.DateTimeFormatter G__46715] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__46714 ^java.time.format.DateTimeFormatter G__46715)))


(defn plus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__46716 G__46717 G__46718] (.plus ^java.time.ZonedDateTime G__46716 G__46717 G__46718)) ([^java.time.ZonedDateTime G__46719 G__46720] (.plus ^java.time.ZonedDateTime G__46719 G__46720)))


(defn with-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46721 G__46722] (.withYear ^java.time.ZonedDateTime G__46721 G__46722)))



(defn with-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46723 G__46724] (.withMonth ^java.time.ZonedDateTime G__46723 G__46724)))


(defn minus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__46725 G__46726] (.minusMinutes ^java.time.ZonedDateTime G__46725 G__46726)))

