(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [LocalDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDateTime])))

(defn compare-to ([^java.time.LocalDateTime G__34302 G__34303] (.compareTo ^java.time.LocalDateTime G__34302 G__34303)))


(defn is-supported ([^java.time.LocalDateTime G__34304 G__34305] (.isSupported ^java.time.LocalDateTime G__34304 G__34305)))


(defn plus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34306 G__34307] (.plusYears ^java.time.LocalDateTime G__34306 G__34307)))


(defn query ^java.lang.Object ([^java.time.LocalDateTime G__34308 ^java.time.temporal.TemporalQuery G__34309] (.query ^java.time.LocalDateTime G__34308 ^java.time.temporal.TemporalQuery G__34309)))


(defn with-second ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34310 G__34311] (.withSecond ^java.time.LocalDateTime G__34310 G__34311)))


(defn get-second ([^java.time.LocalDateTime G__34312] (jti/getter second ^java.time.LocalDateTime G__34312)))


(defn get-day-of-month ([^java.time.LocalDateTime G__34313] (jti/getter dayOfMonth ^java.time.LocalDateTime G__34313)))


(defn of ^java.time.LocalDateTime ([G__34315 G__34316 G__34317 G__34318 G__34319 G__34320 G__34321] (. java.time.LocalDateTime of G__34315 G__34316 G__34317 G__34318 G__34319 G__34320 G__34321)) ([^java.time.LocalDate G__34323 ^java.time.LocalTime G__34324] (. java.time.LocalDateTime of ^java.time.LocalDate G__34323 ^java.time.LocalTime G__34324)) ([G__34326 G__34327 G__34328 G__34329 G__34330 G__34331] (. java.time.LocalDateTime of G__34326 G__34327 G__34328 G__34329 G__34330 G__34331)) ([G__34333 G__34334 G__34335 G__34336 G__34337] (. java.time.LocalDateTime of G__34333 G__34334 G__34335 G__34336 G__34337)))



(defn minus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34338 G__34339] (.minusNanos ^java.time.LocalDateTime G__34338 G__34339)))


(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDateTime G__34340 ^java.time.temporal.TemporalField G__34341] (.range ^java.time.LocalDateTime G__34340 ^java.time.temporal.TemporalField G__34341)))


(defn with-day-of-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34342 G__34343] (.withDayOfYear ^java.time.LocalDateTime G__34342 G__34343)))


(defn is-equal ([^java.time.LocalDateTime G__34344 ^java.time.chrono.ChronoLocalDateTime G__34345] (.isEqual ^java.time.LocalDateTime G__34344 ^java.time.chrono.ChronoLocalDateTime G__34345)))


(defn of-instant ^java.time.LocalDateTime ([^java.time.Instant G__34347 ^java.time.ZoneId G__34348] (. java.time.LocalDateTime ofInstant ^java.time.Instant G__34347 ^java.time.ZoneId G__34348)))


(defn with-minute ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34349 G__34350] (.withMinute ^java.time.LocalDateTime G__34349 G__34350)))



(defn format ^java.lang.String ([^java.time.LocalDateTime G__34351 ^java.time.format.DateTimeFormatter G__34352] (.format ^java.time.LocalDateTime G__34351 ^java.time.format.DateTimeFormatter G__34352)))



(defn of-epoch-second ^java.time.LocalDateTime ([G__34354 G__34355 ^java.time.ZoneOffset G__34356] (. java.time.LocalDateTime ofEpochSecond G__34354 G__34355 ^java.time.ZoneOffset G__34356)))


(defn minus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34357 G__34358] (.minusMonths ^java.time.LocalDateTime G__34357 G__34358)))


(defn get ([^java.time.LocalDateTime G__34359 ^java.time.temporal.TemporalField G__34360] (.get ^java.time.LocalDateTime G__34359 ^java.time.temporal.TemporalField G__34360)))


(defn truncated-to ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34361 ^java.time.temporal.TemporalUnit G__34362] (.truncatedTo ^java.time.LocalDateTime G__34361 ^java.time.temporal.TemporalUnit G__34362)))


(defn minus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34363 G__34364] (.minusWeeks ^java.time.LocalDateTime G__34363 G__34364)))


(defn minus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34365 G__34366] (.minusSeconds ^java.time.LocalDateTime G__34365 G__34366)))


(defn to-local-time ^java.time.LocalTime ([^java.time.LocalDateTime G__34367] (.toLocalTime ^java.time.LocalDateTime G__34367)))


(defn now ^java.time.LocalDateTime ([G__34369] (. java.time.LocalDateTime now G__34369)) ([] (. java.time.LocalDateTime now)))


(defn minus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34371 G__34372] (.minusYears ^java.time.LocalDateTime G__34371 G__34372)))


(defn minus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34373 G__34374] (.minusDays ^java.time.LocalDateTime G__34373 G__34374)))


(defn plus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34375 G__34376] (.plusHours ^java.time.LocalDateTime G__34375 G__34376)))



(defn get-day-of-year ([^java.time.LocalDateTime G__34377] (jti/getter dayOfYear ^java.time.LocalDateTime G__34377)))


(defn get-month ^java.time.Month ([^java.time.LocalDateTime G__34378] (jti/getter month ^java.time.LocalDateTime G__34378)))


(defn plus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34379 G__34380] (.plusSeconds ^java.time.LocalDateTime G__34379 G__34380)))


(defn plus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34381 G__34382] (.plusMinutes ^java.time.LocalDateTime G__34381 G__34382)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDateTime G__34383] (.toLocalDate ^java.time.LocalDateTime G__34383)))



(defn until ([^java.time.LocalDateTime G__34384 ^java.time.temporal.Temporal G__34385 ^java.time.temporal.TemporalUnit G__34386] (.until ^java.time.LocalDateTime G__34384 ^java.time.temporal.Temporal G__34385 ^java.time.temporal.TemporalUnit G__34386)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.LocalDateTime G__34387 ^java.time.ZoneOffset G__34388] (.atOffset ^java.time.LocalDateTime G__34387 ^java.time.ZoneOffset G__34388)))




(defn is-before ([^java.time.LocalDateTime G__34389 ^java.time.chrono.ChronoLocalDateTime G__34390] (.isBefore ^java.time.LocalDateTime G__34389 ^java.time.chrono.ChronoLocalDateTime G__34390)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDateTime G__34391 ^java.time.temporal.Temporal G__34392] (.adjustInto ^java.time.LocalDateTime G__34391 ^java.time.temporal.Temporal G__34392)))


(defn get-hour ([^java.time.LocalDateTime G__34393] (jti/getter hour ^java.time.LocalDateTime G__34393)))


(defn minus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__34394 G__34395 G__34396] (.minus ^java.time.LocalDateTime G__34394 G__34395 G__34396)) ([^java.time.LocalDateTime G__34397 G__34398] (.minus ^java.time.LocalDateTime G__34397 G__34398)))


(defn plus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34399 G__34400] (.plusNanos ^java.time.LocalDateTime G__34399 G__34400)))


(defn get-nano ([^java.time.LocalDateTime G__34401] (jti/getter nano ^java.time.LocalDateTime G__34401)))


(defn get-year ([^java.time.LocalDateTime G__34402] (jti/getter year ^java.time.LocalDateTime G__34402)))


(defn with-day-of-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34403 G__34404] (.withDayOfMonth ^java.time.LocalDateTime G__34403 G__34404)))


(defn is-after ([^java.time.LocalDateTime G__34405 ^java.time.chrono.ChronoLocalDateTime G__34406] (.isAfter ^java.time.LocalDateTime G__34405 ^java.time.chrono.ChronoLocalDateTime G__34406)))


(defn to-string ^java.lang.String ([^java.time.LocalDateTime G__34407] (.toString ^java.time.LocalDateTime G__34407)))


(defn plus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34408 G__34409] (.plusMonths ^java.time.LocalDateTime G__34408 G__34409)))


(defn with-hour ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34410 G__34411] (.withHour ^java.time.LocalDateTime G__34410 G__34411)))


(defn equals ([^java.time.LocalDateTime G__34412 ^java.lang.Object G__34413] (.equals ^java.time.LocalDateTime G__34412 ^java.lang.Object G__34413)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__34414 G__34415] (.atZone ^java.time.LocalDateTime G__34414 G__34415)))


(defn get-month-value ([^java.time.LocalDateTime G__34416] (jti/getter monthValue ^java.time.LocalDateTime G__34416)))




(defn with-nano ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34417 G__34418] (.withNano ^java.time.LocalDateTime G__34417 G__34418)))


(defn get-minute ([^java.time.LocalDateTime G__34419] (jti/getter minute ^java.time.LocalDateTime G__34419)))


(defn minus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34420 G__34421] (.minusHours ^java.time.LocalDateTime G__34420 G__34421)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDateTime G__34422] (jti/getter dayOfWeek ^java.time.LocalDateTime G__34422)))


(defn plus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34423 G__34424] (.plusDays ^java.time.LocalDateTime G__34423 G__34424)))


(defn plus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34425 G__34426] (.plusWeeks ^java.time.LocalDateTime G__34425 G__34426)))


(defn hash-code ([^java.time.LocalDateTime G__34427] (.hashCode ^java.time.LocalDateTime G__34427)))



(defn get-long ([^java.time.LocalDateTime G__34428 ^java.time.temporal.TemporalField G__34429] (jti/getter long ^java.time.LocalDateTime G__34428 ^java.time.temporal.TemporalField G__34429)))


(defn with ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__34430 G__34431 G__34432] (.with ^java.time.LocalDateTime G__34430 G__34431 G__34432)) ([^java.time.LocalDateTime G__34433 G__34434] (.with ^java.time.LocalDateTime G__34433 G__34434)))


(defn from ^java.time.LocalDateTime ([^java.time.temporal.TemporalAccessor G__34436] (. java.time.LocalDateTime from ^java.time.temporal.TemporalAccessor G__34436)))


(defn parse ^java.time.LocalDateTime ([^java.lang.CharSequence G__34438] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__34438)) ([^java.lang.CharSequence G__34440 ^java.time.format.DateTimeFormatter G__34441] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__34440 ^java.time.format.DateTimeFormatter G__34441)))


(defn plus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__34442 G__34443 G__34444] (.plus ^java.time.LocalDateTime G__34442 G__34443 G__34444)) ([^java.time.LocalDateTime G__34445 G__34446] (.plus ^java.time.LocalDateTime G__34445 G__34446)))


(defn with-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34447 G__34448] (.withYear ^java.time.LocalDateTime G__34447 G__34448)))



(defn with-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34449 G__34450] (.withMonth ^java.time.LocalDateTime G__34449 G__34450)))


(defn minus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__34451 G__34452] (.minusMinutes ^java.time.LocalDateTime G__34451 G__34452)))

