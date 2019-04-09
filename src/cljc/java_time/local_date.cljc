(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDate]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDate])))
(def max (. java.time.LocalDate -MAX))
(def min (. java.time.LocalDate -MIN))

(defn compare-to ([^java.time.LocalDate G__46310 G__46311] (.compareTo ^java.time.LocalDate G__46310 G__46311)))


(defn is-supported ([^java.time.LocalDate G__46312 G__46313] (.isSupported ^java.time.LocalDate G__46312 G__46313)))


(defn plus-years ^java.time.LocalDate ([^java.time.LocalDate G__46314 G__46315] (.plusYears ^java.time.LocalDate G__46314 G__46315)))


(defn get-era ^java.time.chrono.Era ([^java.time.LocalDate G__46316] (jti/getter era ^java.time.LocalDate G__46316)))


(defn query ^java.lang.Object ([^java.time.LocalDate G__46317 ^java.time.temporal.TemporalQuery G__46318] (.query ^java.time.LocalDate G__46317 ^java.time.temporal.TemporalQuery G__46318)))


(defn get-day-of-month ([^java.time.LocalDate G__46319] (jti/getter dayOfMonth ^java.time.LocalDate G__46319)))



(defn of ^java.time.LocalDate ([G__46321 G__46322 G__46323] (. java.time.LocalDate of G__46321 G__46322 G__46323)))




(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDate G__46324 ^java.time.temporal.TemporalField G__46325] (.range ^java.time.LocalDate G__46324 ^java.time.temporal.TemporalField G__46325)))



(defn of-epoch-day ^java.time.LocalDate ([G__46327] (. java.time.LocalDate ofEpochDay G__46327)))


(defn at-start-of-day ^java.time.ZonedDateTime ([^java.time.LocalDate G__46328 ^java.time.ZoneId G__46329] (.atStartOfDay ^java.time.LocalDate G__46328 ^java.time.ZoneId G__46329)) ([^java.time.LocalDate G__46330] (.atStartOfDay ^java.time.LocalDate G__46330)))


(defn with-day-of-year ^java.time.LocalDate ([^java.time.LocalDate G__46331 G__46332] (.withDayOfYear ^java.time.LocalDate G__46331 G__46332)))


(defn is-equal ([^java.time.LocalDate G__46333 ^java.time.chrono.ChronoLocalDate G__46334] (.isEqual ^java.time.LocalDate G__46333 ^java.time.chrono.ChronoLocalDate G__46334)))



(defn length-of-month ([^java.time.LocalDate G__46335] (.lengthOfMonth ^java.time.LocalDate G__46335)))




(defn format ^java.lang.String ([^java.time.LocalDate G__46336 ^java.time.format.DateTimeFormatter G__46337] (.format ^java.time.LocalDate G__46336 ^java.time.format.DateTimeFormatter G__46337)))


(defn minus-months ^java.time.LocalDate ([^java.time.LocalDate G__46338 G__46339] (.minusMonths ^java.time.LocalDate G__46338 G__46339)))


(defn get ([^java.time.LocalDate G__46340 ^java.time.temporal.TemporalField G__46341] (.get ^java.time.LocalDate G__46340 ^java.time.temporal.TemporalField G__46341)))


(defn minus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__46342 G__46343] (.minusWeeks ^java.time.LocalDate G__46342 G__46343)))


(defn at-time ^java.time.OffsetDateTime ([^java.time.LocalDate G__46344 G__46345] (.atTime ^java.time.LocalDate G__46344 G__46345)) ([^java.time.LocalDate G__46346 G__46347 G__46348 G__46349 G__46350] (.atTime ^java.time.LocalDate G__46346 G__46347 G__46348 G__46349 G__46350)) ([^java.time.LocalDate G__46351 G__46352 G__46353 G__46354] (.atTime ^java.time.LocalDate G__46351 G__46352 G__46353 G__46354)) ([^java.time.LocalDate G__46355 G__46356 G__46357] (.atTime ^java.time.LocalDate G__46355 G__46356 G__46357)))


(defn now ^java.time.LocalDate ([] (. java.time.LocalDate now)) ([G__46360] (. java.time.LocalDate now G__46360)))


(defn minus-years ^java.time.LocalDate ([^java.time.LocalDate G__46361 G__46362] (.minusYears ^java.time.LocalDate G__46361 G__46362)))


(defn minus-days ^java.time.LocalDate ([^java.time.LocalDate G__46363 G__46364] (.minusDays ^java.time.LocalDate G__46363 G__46364)))



(defn get-day-of-year ([^java.time.LocalDate G__46365] (jti/getter dayOfYear ^java.time.LocalDate G__46365)))


(defn get-month ^java.time.Month ([^java.time.LocalDate G__46366] (jti/getter month ^java.time.LocalDate G__46366)))





(defn until ([^java.time.LocalDate G__46367 ^java.time.temporal.Temporal G__46368 ^java.time.temporal.TemporalUnit G__46369] (.until ^java.time.LocalDate G__46367 ^java.time.temporal.Temporal G__46368 ^java.time.temporal.TemporalUnit G__46369)) ([^java.time.LocalDate G__46370 G__46371] (.until ^java.time.LocalDate G__46370 G__46371)))





(defn is-before ([^java.time.LocalDate G__46372 ^java.time.chrono.ChronoLocalDate G__46373] (.isBefore ^java.time.LocalDate G__46372 ^java.time.chrono.ChronoLocalDate G__46373)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDate G__46374 ^java.time.temporal.Temporal G__46375] (.adjustInto ^java.time.LocalDate G__46374 ^java.time.temporal.Temporal G__46375)))


(defn minus ^java.time.LocalDate ([^java.time.LocalDate G__46376 G__46377 G__46378] (.minus ^java.time.LocalDate G__46376 G__46377 G__46378)) ([^java.time.LocalDate G__46379 G__46380] (.minus ^java.time.LocalDate G__46379 G__46380)))



(defn get-year ([^java.time.LocalDate G__46381] (jti/getter year ^java.time.LocalDate G__46381)))


(defn with-day-of-month ^java.time.LocalDate ([^java.time.LocalDate G__46382 G__46383] (.withDayOfMonth ^java.time.LocalDate G__46382 G__46383)))


(defn to-epoch-day ([^java.time.LocalDate G__46384] (.toEpochDay ^java.time.LocalDate G__46384)))


(defn is-after ([^java.time.LocalDate G__46385 ^java.time.chrono.ChronoLocalDate G__46386] (.isAfter ^java.time.LocalDate G__46385 ^java.time.chrono.ChronoLocalDate G__46386)))


(defn of-year-day ^java.time.LocalDate ([G__46388 G__46389] (. java.time.LocalDate ofYearDay G__46388 G__46389)))


(defn get-chronology ^java.time.chrono.Chronology ([^java.time.LocalDate G__46390] (jti/getter chronology ^java.time.LocalDate G__46390)))


(defn to-string ^java.lang.String ([^java.time.LocalDate G__46391] (.toString ^java.time.LocalDate G__46391)))


(defn plus-months ^java.time.LocalDate ([^java.time.LocalDate G__46392 G__46393] (.plusMonths ^java.time.LocalDate G__46392 G__46393)))


(defn equals ([^java.time.LocalDate G__46394 ^java.lang.Object G__46395] (.equals ^java.time.LocalDate G__46394 ^java.lang.Object G__46395)))


(defn get-month-value ([^java.time.LocalDate G__46396] (jti/getter monthValue ^java.time.LocalDate G__46396)))



(defn length-of-year ([^java.time.LocalDate G__46397] (.lengthOfYear ^java.time.LocalDate G__46397)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDate G__46398] (jti/getter dayOfWeek ^java.time.LocalDate G__46398)))


(defn plus-days ^java.time.LocalDate ([^java.time.LocalDate G__46399 G__46400] (.plusDays ^java.time.LocalDate G__46399 G__46400)))



(defn plus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__46401 G__46402] (.plusWeeks ^java.time.LocalDate G__46401 G__46402)))


(defn hash-code ([^java.time.LocalDate G__46403] (.hashCode ^java.time.LocalDate G__46403)))



(defn get-long ([^java.time.LocalDate G__46404 ^java.time.temporal.TemporalField G__46405] (.getLong ^java.time.LocalDate G__46404 ^java.time.temporal.TemporalField G__46405)))


(defn is-leap-year ([^java.time.LocalDate G__46406] (.isLeapYear ^java.time.LocalDate G__46406)))


(defn with ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDate G__46407 G__46408] (.with ^java.time.LocalDate G__46407 G__46408)) ([^java.time.LocalDate G__46409 G__46410 G__46411] (.with ^java.time.LocalDate G__46409 G__46410 G__46411)))


(defn from ^java.time.LocalDate ([^java.time.temporal.TemporalAccessor G__46413] (. java.time.LocalDate from ^java.time.temporal.TemporalAccessor G__46413)))


(defn parse ^java.time.LocalDate ([^java.lang.CharSequence G__46415 ^java.time.format.DateTimeFormatter G__46416] (. java.time.LocalDate parse ^java.lang.CharSequence G__46415 ^java.time.format.DateTimeFormatter G__46416)) ([^java.lang.CharSequence G__46418] (. java.time.LocalDate parse ^java.lang.CharSequence G__46418)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalDate G__46419 G__46420 G__46421] (.plus ^java.time.LocalDate G__46419 G__46420 G__46421)) ([^java.time.LocalDate G__46422 G__46423] (.plus ^java.time.LocalDate G__46422 G__46423)))


(defn with-year ^java.time.LocalDate ([^java.time.LocalDate G__46424 G__46425] (.withYear ^java.time.LocalDate G__46424 G__46425)))



(defn with-month ^java.time.LocalDate ([^java.time.LocalDate G__46426 G__46427] (.withMonth ^java.time.LocalDate G__46426 G__46427)))


