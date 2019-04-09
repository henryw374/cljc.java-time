(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDateTime]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time LocalDateTime])))
(def max (. java.time.LocalDateTime -MAX))
(def min (. java.time.LocalDateTime -MIN))

(defn compare-to ([^java.time.LocalDateTime G__55501 G__55502] (.compareTo ^java.time.LocalDateTime G__55501 G__55502)))


(defn is-supported ([^java.time.LocalDateTime G__55503 G__55504] (.isSupported ^java.time.LocalDateTime G__55503 G__55504)))


(defn plus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55505 G__55506] (.plusYears ^java.time.LocalDateTime G__55505 G__55506)))


(defn query ^java.lang.Object ([^java.time.LocalDateTime G__55507 ^java.time.temporal.TemporalQuery G__55508] (.query ^java.time.LocalDateTime G__55507 ^java.time.temporal.TemporalQuery G__55508)))


(defn with-second ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55509 G__55510] (.withSecond ^java.time.LocalDateTime G__55509 G__55510)))


(defn get-second ([^java.time.LocalDateTime G__55511] (jti/getter second ^java.time.LocalDateTime G__55511)))


(defn get-day-of-month ([^java.time.LocalDateTime G__55512] (jti/getter dayOfMonth ^java.time.LocalDateTime G__55512)))


(defn of ^java.time.LocalDateTime ([G__55514 G__55515 G__55516 G__55517 G__55518 G__55519 G__55520] (. java.time.LocalDateTime of G__55514 G__55515 G__55516 G__55517 G__55518 G__55519 G__55520)) ([^java.time.LocalDate G__55522 ^java.time.LocalTime G__55523] (. java.time.LocalDateTime of ^java.time.LocalDate G__55522 ^java.time.LocalTime G__55523)) ([G__55525 G__55526 G__55527 G__55528 G__55529 G__55530] (. java.time.LocalDateTime of G__55525 G__55526 G__55527 G__55528 G__55529 G__55530)) ([G__55532 G__55533 G__55534 G__55535 G__55536] (. java.time.LocalDateTime of G__55532 G__55533 G__55534 G__55535 G__55536)))



(defn minus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55537 G__55538] (.minusNanos ^java.time.LocalDateTime G__55537 G__55538)))


(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDateTime G__55539 ^java.time.temporal.TemporalField G__55540] (.range ^java.time.LocalDateTime G__55539 ^java.time.temporal.TemporalField G__55540)))


(defn with-day-of-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55541 G__55542] (.withDayOfYear ^java.time.LocalDateTime G__55541 G__55542)))


(defn is-equal ([^java.time.LocalDateTime G__55543 ^java.time.chrono.ChronoLocalDateTime G__55544] (.isEqual ^java.time.LocalDateTime G__55543 ^java.time.chrono.ChronoLocalDateTime G__55544)))


(defn of-instant ^java.time.LocalDateTime ([^java.time.Instant G__55546 ^java.time.ZoneId G__55547] (. java.time.LocalDateTime ofInstant ^java.time.Instant G__55546 ^java.time.ZoneId G__55547)))


(defn with-minute ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55548 G__55549] (.withMinute ^java.time.LocalDateTime G__55548 G__55549)))



(defn format ^java.lang.String ([^java.time.LocalDateTime G__55550 ^java.time.format.DateTimeFormatter G__55551] (.format ^java.time.LocalDateTime G__55550 ^java.time.format.DateTimeFormatter G__55551)))



(defn of-epoch-second ^java.time.LocalDateTime ([G__55553 G__55554 ^java.time.ZoneOffset G__55555] (. java.time.LocalDateTime ofEpochSecond G__55553 G__55554 ^java.time.ZoneOffset G__55555)))


(defn minus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55556 G__55557] (.minusMonths ^java.time.LocalDateTime G__55556 G__55557)))


(defn get ([^java.time.LocalDateTime G__55558 ^java.time.temporal.TemporalField G__55559] (.get ^java.time.LocalDateTime G__55558 ^java.time.temporal.TemporalField G__55559)))


(defn truncated-to ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55560 ^java.time.temporal.TemporalUnit G__55561] (.truncatedTo ^java.time.LocalDateTime G__55560 ^java.time.temporal.TemporalUnit G__55561)))


(defn minus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55562 G__55563] (.minusWeeks ^java.time.LocalDateTime G__55562 G__55563)))


(defn minus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55564 G__55565] (.minusSeconds ^java.time.LocalDateTime G__55564 G__55565)))


(defn to-local-time ^java.time.LocalTime ([^java.time.LocalDateTime G__55566] (.toLocalTime ^java.time.LocalDateTime G__55566)))


(defn now ^java.time.LocalDateTime ([G__55568] (. java.time.LocalDateTime now G__55568)) ([] (. java.time.LocalDateTime now)))


(defn minus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55570 G__55571] (.minusYears ^java.time.LocalDateTime G__55570 G__55571)))


(defn minus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55572 G__55573] (.minusDays ^java.time.LocalDateTime G__55572 G__55573)))


(defn plus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55574 G__55575] (.plusHours ^java.time.LocalDateTime G__55574 G__55575)))



(defn get-day-of-year ([^java.time.LocalDateTime G__55576] (jti/getter dayOfYear ^java.time.LocalDateTime G__55576)))


(defn get-month ^java.time.Month ([^java.time.LocalDateTime G__55577] (jti/getter month ^java.time.LocalDateTime G__55577)))


(defn plus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55578 G__55579] (.plusSeconds ^java.time.LocalDateTime G__55578 G__55579)))


(defn plus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55580 G__55581] (.plusMinutes ^java.time.LocalDateTime G__55580 G__55581)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDateTime G__55582] (.toLocalDate ^java.time.LocalDateTime G__55582)))



(defn until ([^java.time.LocalDateTime G__55583 ^java.time.temporal.Temporal G__55584 ^java.time.temporal.TemporalUnit G__55585] (.until ^java.time.LocalDateTime G__55583 ^java.time.temporal.Temporal G__55584 ^java.time.temporal.TemporalUnit G__55585)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.LocalDateTime G__55586 ^java.time.ZoneOffset G__55587] (.atOffset ^java.time.LocalDateTime G__55586 ^java.time.ZoneOffset G__55587)))




(defn is-before ([^java.time.LocalDateTime G__55588 ^java.time.chrono.ChronoLocalDateTime G__55589] (.isBefore ^java.time.LocalDateTime G__55588 ^java.time.chrono.ChronoLocalDateTime G__55589)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDateTime G__55590 ^java.time.temporal.Temporal G__55591] (.adjustInto ^java.time.LocalDateTime G__55590 ^java.time.temporal.Temporal G__55591)))


(defn get-hour ([^java.time.LocalDateTime G__55592] (jti/getter hour ^java.time.LocalDateTime G__55592)))


(defn minus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__55593 G__55594 G__55595] (.minus ^java.time.LocalDateTime G__55593 G__55594 G__55595)) ([^java.time.LocalDateTime G__55596 G__55597] (.minus ^java.time.LocalDateTime G__55596 G__55597)))


(defn plus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55598 G__55599] (.plusNanos ^java.time.LocalDateTime G__55598 G__55599)))


(defn get-nano ([^java.time.LocalDateTime G__55600] (jti/getter nano ^java.time.LocalDateTime G__55600)))


(defn get-year ([^java.time.LocalDateTime G__55601] (jti/getter year ^java.time.LocalDateTime G__55601)))


(defn with-day-of-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55602 G__55603] (.withDayOfMonth ^java.time.LocalDateTime G__55602 G__55603)))


(defn is-after ([^java.time.LocalDateTime G__55604 ^java.time.chrono.ChronoLocalDateTime G__55605] (.isAfter ^java.time.LocalDateTime G__55604 ^java.time.chrono.ChronoLocalDateTime G__55605)))


(defn to-string ^java.lang.String ([^java.time.LocalDateTime G__55606] (.toString ^java.time.LocalDateTime G__55606)))


(defn plus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55607 G__55608] (.plusMonths ^java.time.LocalDateTime G__55607 G__55608)))


(defn with-hour ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55609 G__55610] (.withHour ^java.time.LocalDateTime G__55609 G__55610)))


(defn equals ([^java.time.LocalDateTime G__55611 ^java.lang.Object G__55612] (.equals ^java.time.LocalDateTime G__55611 ^java.lang.Object G__55612)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__55613 G__55614] (.atZone ^java.time.LocalDateTime G__55613 G__55614)))


(defn get-month-value ([^java.time.LocalDateTime G__55615] (jti/getter monthValue ^java.time.LocalDateTime G__55615)))




(defn with-nano ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55616 G__55617] (.withNano ^java.time.LocalDateTime G__55616 G__55617)))


(defn get-minute ([^java.time.LocalDateTime G__55618] (jti/getter minute ^java.time.LocalDateTime G__55618)))


(defn minus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55619 G__55620] (.minusHours ^java.time.LocalDateTime G__55619 G__55620)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDateTime G__55621] (jti/getter dayOfWeek ^java.time.LocalDateTime G__55621)))


(defn plus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55622 G__55623] (.plusDays ^java.time.LocalDateTime G__55622 G__55623)))


(defn plus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55624 G__55625] (.plusWeeks ^java.time.LocalDateTime G__55624 G__55625)))


(defn hash-code ([^java.time.LocalDateTime G__55626] (.hashCode ^java.time.LocalDateTime G__55626)))



(defn get-long ([^java.time.LocalDateTime G__55627 ^java.time.temporal.TemporalField G__55628] (.getLong ^java.time.LocalDateTime G__55627 ^java.time.temporal.TemporalField G__55628)))


(defn with ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__55629 G__55630 G__55631] (.with ^java.time.LocalDateTime G__55629 G__55630 G__55631)) ([^java.time.LocalDateTime G__55632 G__55633] (.with ^java.time.LocalDateTime G__55632 G__55633)))


(defn from ^java.time.LocalDateTime ([^java.time.temporal.TemporalAccessor G__55635] (. java.time.LocalDateTime from ^java.time.temporal.TemporalAccessor G__55635)))


(defn parse ^java.time.LocalDateTime ([^java.lang.CharSequence G__55637] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__55637)) ([^java.lang.CharSequence G__55639 ^java.time.format.DateTimeFormatter G__55640] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__55639 ^java.time.format.DateTimeFormatter G__55640)))


(defn plus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__55641 G__55642 G__55643] (.plus ^java.time.LocalDateTime G__55641 G__55642 G__55643)) ([^java.time.LocalDateTime G__55644 G__55645] (.plus ^java.time.LocalDateTime G__55644 G__55645)))


(defn with-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55646 G__55647] (.withYear ^java.time.LocalDateTime G__55646 G__55647)))



(defn with-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55648 G__55649] (.withMonth ^java.time.LocalDateTime G__55648 G__55649)))


(defn minus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__55650 G__55651] (.minusMinutes ^java.time.LocalDateTime G__55650 G__55651)))

