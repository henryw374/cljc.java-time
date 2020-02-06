(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDateTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time LocalDateTime])))
(def max (. java.time.LocalDateTime -MAX))
(def min (. java.time.LocalDateTime -MIN))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3587 ^long long3588] (.minusMinutes this3587 long3588)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3589 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3590] (.truncatedTo this3589 java-time-temporal-TemporalUnit3590)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3591 ^long long3592] (.minusWeeks this3591 long3592)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^java.time.Instant [^java.time.LocalDateTime this3593 ^java.time.ZoneOffset java-time-ZoneOffset3594] (.toInstant this3593 java-time-ZoneOffset3594)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3595 ^long long3596] (.plusWeeks this3595 long3596)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalDateTime this3597 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3598] (.range this3597 java-time-temporal-TemporalField3598)))
(clojure.core/defn of-epoch-second {:arglists (quote (["long" "int" "java.time.ZoneOffset"]))} (^java.time.LocalDateTime [^long long3599 ^java.lang.Integer int3600 ^java.time.ZoneOffset java-time-ZoneOffset3601] (. java.time.LocalDateTime ofEpochSecond long3599 int3600 java-time-ZoneOffset3601)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3602] (jti/getter hour this3602)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.LocalDateTime this3603 ^java.time.ZoneOffset java-time-ZoneOffset3604] (.atOffset this3603 java-time-ZoneOffset3604)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3605 ^long long3606] (.minusHours this3605 long3606)))
(clojure.core/defn of {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"] ["int" "int" "int" "int" "int"] ["int" "int" "int" "int" "int" "int"] ["int" "java.time.Month" "int" "int" "int" "int" "int"] ["int" "java.time.Month" "int" "int" "int" "int"] ["int" "java.time.Month" "int" "int" "int"] ["int" "int" "int" "int" "int" "int" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDate java-time-LocalDate3607 ^java.time.LocalTime java-time-LocalTime3608] (. java.time.LocalDateTime of java-time-LocalDate3607 java-time-LocalTime3608)) (^java.time.LocalDateTime [G__3610 G__3611 G__3612 G__3613 G__3614] #? (:cljs (. java.time.LocalDateTime of G__3610 G__3611 G__3612 G__3613 G__3614) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3610) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3611) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3612) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3613) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3614)) (clojure.core/let [G__3610 (clojure.core/int G__3610) G__3611 (clojure.core/int G__3611) G__3612 (clojure.core/int G__3612) G__3613 (clojure.core/int G__3613) G__3614 (clojure.core/int G__3614)] (. java.time.LocalDateTime of G__3610 G__3611 G__3612 G__3613 G__3614)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3610) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__3611) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3612) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3613) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3614)) (clojure.core/let [G__3610 (clojure.core/int G__3610) G__3611 ^"java.time.Month" G__3611 G__3612 (clojure.core/int G__3612) G__3613 (clojure.core/int G__3613) G__3614 (clojure.core/int G__3614)] (. java.time.LocalDateTime of G__3610 G__3611 G__3612 G__3613 G__3614)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.LocalDateTime [G__3616 G__3617 G__3618 G__3619 G__3620 G__3621] #? (:cljs (. java.time.LocalDateTime of G__3616 G__3617 G__3618 G__3619 G__3620 G__3621) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3616) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3617) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3618) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3619) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3620) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3621)) (clojure.core/let [G__3616 (clojure.core/int G__3616) G__3617 (clojure.core/int G__3617) G__3618 (clojure.core/int G__3618) G__3619 (clojure.core/int G__3619) G__3620 (clojure.core/int G__3620) G__3621 (clojure.core/int G__3621)] (. java.time.LocalDateTime of G__3616 G__3617 G__3618 G__3619 G__3620 G__3621)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3616) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__3617) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3618) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3619) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3620) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3621)) (clojure.core/let [G__3616 (clojure.core/int G__3616) G__3617 ^"java.time.Month" G__3617 G__3618 (clojure.core/int G__3618) G__3619 (clojure.core/int G__3619) G__3620 (clojure.core/int G__3620) G__3621 (clojure.core/int G__3621)] (. java.time.LocalDateTime of G__3616 G__3617 G__3618 G__3619 G__3620 G__3621)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.LocalDateTime [G__3623 G__3624 G__3625 G__3626 G__3627 G__3628 G__3629] #? (:cljs (. java.time.LocalDateTime of G__3623 G__3624 G__3625 G__3626 G__3627 G__3628 G__3629) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3623) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__3624) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3625) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3626) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3627) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3628) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3629)) (clojure.core/let [G__3623 (clojure.core/int G__3623) G__3624 ^"java.time.Month" G__3624 G__3625 (clojure.core/int G__3625) G__3626 (clojure.core/int G__3626) G__3627 (clojure.core/int G__3627) G__3628 (clojure.core/int G__3628) G__3629 (clojure.core/int G__3629)] (. java.time.LocalDateTime of G__3623 G__3624 G__3625 G__3626 G__3627 G__3628 G__3629)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3623) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3624) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3625) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3626) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3627) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3628) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__3629)) (clojure.core/let [G__3623 (clojure.core/int G__3623) G__3624 (clojure.core/int G__3624) G__3625 (clojure.core/int G__3625) G__3626 (clojure.core/int G__3626) G__3627 (clojure.core/int G__3627) G__3628 (clojure.core/int G__3628) G__3629 (clojure.core/int G__3629)] (. java.time.LocalDateTime of G__3623 G__3624 G__3625 G__3626 G__3627 G__3628 G__3629)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-month {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3630 ^java.lang.Integer int3631] (.withMonth this3630 int3631)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this3632 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime3633] (.isEqual this3632 java-time-chrono-ChronoLocalDateTime3633)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3634] (jti/getter nano this3634)))
(clojure.core/defn get-year {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3635] (jti/getter year this3635)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3636 ^long long3637] (.minusSeconds this3636 long3637)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3638] (jti/getter second this3638)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3639 ^long long3640] (.plusNanos this3639 long3640)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3641] (jti/getter dayOfYear this3641)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this3642 G__3643 G__3644] #? (:cljs (.plus ^java.time.LocalDateTime this3642 G__3643 G__3644) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3643) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3644)) (clojure.core/let [G__3643 (clojure.core/long G__3643) G__3644 ^"java.time.temporal.TemporalUnit" G__3644] (.plus ^java.time.LocalDateTime this3642 G__3643 G__3644)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3643) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3644)) (clojure.core/let [G__3643 (clojure.core/long G__3643) G__3644 ^"java.time.temporal.TemporalUnit" G__3644] (.plus ^java.time.LocalDateTime this3642 G__3643 G__3644)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3643) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3644)) (clojure.core/let [G__3643 (clojure.core/long G__3643) G__3644 ^"java.time.temporal.TemporalUnit" G__3644] (.plus ^java.time.LocalDateTime this3642 G__3643 G__3644)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this3645 G__3646] #? (:cljs (.plus ^java.time.LocalDateTime this3645 G__3646) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3646)) (clojure.core/let [G__3646 ^"java.time.temporal.TemporalAmount" G__3646] (.plus ^java.time.LocalDateTime this3645 G__3646)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3646)) (clojure.core/let [G__3646 ^"java.time.temporal.TemporalAmount" G__3646] (.plus ^java.time.LocalDateTime this3645 G__3646)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3646)) (clojure.core/let [G__3646 ^"java.time.temporal.TemporalAmount" G__3646] (.plus ^java.time.LocalDateTime this3645 G__3646)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3647 ^java.lang.Integer int3648] (.withHour this3647 int3648)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3649 ^java.lang.Integer int3650] (.withMinute this3649 int3650)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3651 ^long long3652] (.plusMinutes this3651 long3652)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalDateTime this3653 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery3654] (.query this3653 java-time-temporal-TemporalQuery3654)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.DayOfWeek [^java.time.LocalDateTime this3655] (jti/getter dayOfWeek this3655)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.String [^java.time.LocalDateTime this3656] (.toString this3656)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3657 ^long long3658] (.plusMonths this3657 long3658)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this3659 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime3660] (.isBefore this3659 java-time-chrono-ChronoLocalDateTime3660)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3661 ^long long3662] (.minusMonths this3661 long3662)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this3663 G__3664] #? (:cljs (.minus ^java.time.LocalDateTime this3663 G__3664) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3664)) (clojure.core/let [G__3664 ^"java.time.temporal.TemporalAmount" G__3664] (.minus ^java.time.LocalDateTime this3663 G__3664)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3664)) (clojure.core/let [G__3664 ^"java.time.temporal.TemporalAmount" G__3664] (.minus ^java.time.LocalDateTime this3663 G__3664)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__3664)) (clojure.core/let [G__3664 ^"java.time.temporal.TemporalAmount" G__3664] (.minus ^java.time.LocalDateTime this3663 G__3664)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this3665 G__3666 G__3667] #? (:cljs (.minus ^java.time.LocalDateTime this3665 G__3666 G__3667) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3666) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3667)) (clojure.core/let [G__3666 (clojure.core/long G__3666) G__3667 ^"java.time.temporal.TemporalUnit" G__3667] (.minus ^java.time.LocalDateTime this3665 G__3666 G__3667)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3666) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3667)) (clojure.core/let [G__3666 (clojure.core/long G__3666) G__3667 ^"java.time.temporal.TemporalUnit" G__3667] (.minus ^java.time.LocalDateTime this3665 G__3666 G__3667)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3666) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3667)) (clojure.core/let [G__3666 (clojure.core/long G__3666) G__3667 ^"java.time.temporal.TemporalUnit" G__3667] (.minus ^java.time.LocalDateTime this3665 G__3666 G__3667)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn at-zone {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"] ["java.time.LocalDateTime" "java.time.ZoneId"]))} (^java.lang.Object [this3668 G__3669] #? (:cljs (.atZone ^java.time.LocalDateTime this3668 G__3669) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__3669)) (clojure.core/let [G__3669 ^"java.time.ZoneId" G__3669] (.atZone ^java.time.LocalDateTime this3668 G__3669)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__3669)) (clojure.core/let [G__3669 ^"java.time.ZoneId" G__3669] (.atZone ^java.time.LocalDateTime this3668 G__3669)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3670 ^long long3671] (.plusHours this3670 long3671)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3672 ^long long3673] (.plusDays this3672 long3673)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.LocalTime [^java.time.LocalDateTime this3674] (.toLocalTime this3674)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalDateTime this3675 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3676] (.getLong this3675 java-time-temporal-TemporalField3676)))
(clojure.core/defn with-year {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3677 ^java.lang.Integer int3678] (.withYear this3677 int3678)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3679 ^java.lang.Integer int3680] (.withNano this3679 int3680)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^long [^java.time.LocalDateTime this3681 ^java.time.ZoneOffset java-time-ZoneOffset3682] (.toEpochSecond this3681 java-time-ZoneOffset3682)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalDateTime this3683 ^java.time.temporal.Temporal java-time-temporal-Temporal3684 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3685] (.until this3683 java-time-temporal-Temporal3684 java-time-temporal-TemporalUnit3685)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3686 ^java.lang.Integer int3687] (.withDayOfMonth this3686 int3687)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3688] (jti/getter dayOfMonth this3688)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor3689] (. java.time.LocalDateTime from java-time-temporal-TemporalAccessor3689)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this3690 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime3691] (.isAfter this3690 java-time-chrono-ChronoLocalDateTime3691)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3692 ^long long3693] (.minusNanos this3692 long3693)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this3694 G__3695] #? (:cljs (.isSupported ^java.time.LocalDateTime this3694 G__3695) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__3695)) (clojure.core/let [G__3695 ^"java.time.temporal.TemporalUnit" G__3695] (.isSupported ^java.time.LocalDateTime this3694 G__3695)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__3695)) (clojure.core/let [G__3695 ^"java.time.temporal.TemporalField" G__3695] (.isSupported ^java.time.LocalDateTime this3694 G__3695)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3696 ^long long3697] (.minusYears this3696 long3697)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.chrono.Chronology [^java.time.LocalDateTime this3698] (jti/getter chronology this3698)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.LocalDateTime [^java.lang.CharSequence java-lang-CharSequence3699 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter3700] (. java.time.LocalDateTime parse java-lang-CharSequence3699 java-time-format-DateTimeFormatter3700)) (^java.time.LocalDateTime [^java.lang.CharSequence java-lang-CharSequence3701] (. java.time.LocalDateTime parse java-lang-CharSequence3701)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3702 ^java.lang.Integer int3703] (.withSecond this3702 int3703)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.LocalDateTime"] ["java.time.LocalDateTime"]))} (^java.lang.Object [this3704] #? (:cljs (.toLocalDate ^java.time.LocalDateTime this3704) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.LocalDateTime this3704)) (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.LocalDateTime this3704)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3705] (jti/getter minute this3705)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3706] (.hashCode this3706)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalDateTime this3707 ^java.time.temporal.Temporal java-time-temporal-Temporal3708] (.adjustInto this3707 java-time-temporal-Temporal3708)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this3709 G__3710] #? (:cljs (.with ^java.time.LocalDateTime this3709 G__3710) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__3710)) (clojure.core/let [G__3710 ^"java.time.temporal.TemporalAdjuster" G__3710] (.with ^java.time.LocalDateTime this3709 G__3710)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__3710)) (clojure.core/let [G__3710 ^"java.time.temporal.TemporalAdjuster" G__3710] (.with ^java.time.LocalDateTime this3709 G__3710)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__3710)) (clojure.core/let [G__3710 ^"java.time.temporal.TemporalAdjuster" G__3710] (.with ^java.time.LocalDateTime this3709 G__3710)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this3711 G__3712 G__3713] #? (:cljs (.with ^java.time.LocalDateTime this3711 G__3712 G__3713) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__3712) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3713)) (clojure.core/let [G__3712 ^"java.time.temporal.TemporalField" G__3712 G__3713 (clojure.core/long G__3713)] (.with ^java.time.LocalDateTime this3711 G__3712 G__3713)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__3712) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3713)) (clojure.core/let [G__3712 ^"java.time.temporal.TemporalField" G__3712 G__3713 (clojure.core/long G__3713)] (.with ^java.time.LocalDateTime this3711 G__3712 G__3713)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__3712) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__3713)) (clojure.core/let [G__3712 ^"java.time.temporal.TemporalField" G__3712 G__3713 (clojure.core/long G__3713)] (.with ^java.time.LocalDateTime this3711 G__3712 G__3713)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] [] ["java.time.ZoneId"]))} (^java.time.LocalDateTime [G__3715] #? (:cljs (. java.time.LocalDateTime now G__3715) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__3715)) (clojure.core/let [G__3715 ^"java.time.Clock" G__3715] (. java.time.LocalDateTime now G__3715)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__3715)) (clojure.core/let [G__3715 ^"java.time.ZoneId" G__3715] (. java.time.LocalDateTime now G__3715)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.LocalDateTime [] (. java.time.LocalDateTime now)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this3716] (jti/getter monthValue this3716)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3717 ^java.lang.Integer int3718] (.withDayOfYear this3717 int3718)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"] ["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Integer [this3719 G__3720] #? (:cljs (.compareTo ^java.time.LocalDateTime this3719 G__3720) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__3720)) (clojure.core/let [G__3720 ^"java.lang.Object" G__3720] (.compareTo ^java.time.LocalDateTime this3719 G__3720)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDateTime") G__3720)) (clojure.core/let [G__3720 ^"java.time.chrono.ChronoLocalDateTime" G__3720] (.compareTo ^java.time.LocalDateTime this3719 G__3720)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.Month [^java.time.LocalDateTime this3721] (jti/getter month this3721)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.LocalDateTime [^java.time.Instant java-time-Instant3722 ^java.time.ZoneId java-time-ZoneId3723] (. java.time.LocalDateTime ofInstant java-time-Instant3722 java-time-ZoneId3723)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3724 ^long long3725] (.plusSeconds this3724 long3725)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalDateTime this3726 ^java.time.temporal.TemporalField java-time-temporal-TemporalField3727] (.get this3726 java-time-temporal-TemporalField3727)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalDateTime this3728 ^java.lang.Object java-lang-Object3729] (.equals this3728 java-lang-Object3729)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalDateTime this3730 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter3731] (.format this3730 java-time-format-DateTimeFormatter3731)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3732 ^long long3733] (.plusYears this3732 long3733)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this3734 ^long long3735] (.minusDays this3734 long3735)))
