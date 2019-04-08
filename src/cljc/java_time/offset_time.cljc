(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [OffsetTime]])) #? (:clj (:import [java.time OffsetTime])))

(defn compare-to ([^java.time.OffsetTime G__26357 G__26358] (.compareTo ^java.time.OffsetTime G__26357 G__26358)))


(defn is-supported ([^java.time.OffsetTime G__26359 G__26360] (.isSupported ^java.time.OffsetTime G__26359 G__26360)))


(defn query ^java.lang.Object ([^java.time.OffsetTime G__26361 ^java.time.temporal.TemporalQuery G__26362] (.query ^java.time.OffsetTime G__26361 ^java.time.temporal.TemporalQuery G__26362)))


(defn with-second ^java.time.OffsetTime ([^java.time.OffsetTime G__26363 G__26364] (.withSecond ^java.time.OffsetTime G__26363 G__26364)))


(defn get-second ([^java.time.OffsetTime G__26365] (jti/getter second ^java.time.OffsetTime G__26365)))


(defn of ^java.time.OffsetTime ([G__26367 G__26368 G__26369 G__26370 ^java.time.ZoneOffset G__26371] (. java.time.OffsetTime of G__26367 G__26368 G__26369 G__26370 ^java.time.ZoneOffset G__26371)) ([^java.time.LocalTime G__26373 ^java.time.ZoneOffset G__26374] (. java.time.OffsetTime of ^java.time.LocalTime G__26373 ^java.time.ZoneOffset G__26374)))


(defn minus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__26375 G__26376] (.minusNanos ^java.time.OffsetTime G__26375 G__26376)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetTime G__26377 ^java.time.temporal.TemporalField G__26378] (.range ^java.time.OffsetTime G__26377 ^java.time.temporal.TemporalField G__26378)))


(defn is-equal ([^java.time.OffsetTime G__26379 ^java.time.OffsetTime G__26380] (.isEqual ^java.time.OffsetTime G__26379 ^java.time.OffsetTime G__26380)))


(defn of-instant ^java.time.OffsetTime ([^java.time.Instant G__26382 ^java.time.ZoneId G__26383] (. java.time.OffsetTime ofInstant ^java.time.Instant G__26382 ^java.time.ZoneId G__26383)))


(defn with-minute ^java.time.OffsetTime ([^java.time.OffsetTime G__26384 G__26385] (.withMinute ^java.time.OffsetTime G__26384 G__26385)))


(defn format ^java.lang.String ([^java.time.OffsetTime G__26386 ^java.time.format.DateTimeFormatter G__26387] (.format ^java.time.OffsetTime G__26386 ^java.time.format.DateTimeFormatter G__26387)))


(defn get ([^java.time.OffsetTime G__26388 ^java.time.temporal.TemporalField G__26389] (.get ^java.time.OffsetTime G__26388 ^java.time.temporal.TemporalField G__26389)))


(defn truncated-to ^java.time.OffsetTime ([^java.time.OffsetTime G__26390 ^java.time.temporal.TemporalUnit G__26391] (.truncatedTo ^java.time.OffsetTime G__26390 ^java.time.temporal.TemporalUnit G__26391)))


(defn minus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__26392 G__26393] (.minusSeconds ^java.time.OffsetTime G__26392 G__26393)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetTime G__26394] (.toLocalTime ^java.time.OffsetTime G__26394)))


(defn now ^java.time.OffsetTime ([G__26396] (. java.time.OffsetTime now G__26396)) ([] (. java.time.OffsetTime now)))


(defn plus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__26398 G__26399] (.plusHours ^java.time.OffsetTime G__26398 G__26399)))




(defn plus-seconds ^java.time.OffsetTime ([^java.time.OffsetTime G__26400 G__26401] (.plusSeconds ^java.time.OffsetTime G__26400 G__26401)))


(defn plus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__26402 G__26403] (.plusMinutes ^java.time.OffsetTime G__26402 G__26403)))



(defn until ([^java.time.OffsetTime G__26404 ^java.time.temporal.Temporal G__26405 ^java.time.temporal.TemporalUnit G__26406] (.until ^java.time.OffsetTime G__26404 ^java.time.temporal.Temporal G__26405 ^java.time.temporal.TemporalUnit G__26406)))





(defn is-before ([^java.time.OffsetTime G__26407 ^java.time.OffsetTime G__26408] (.isBefore ^java.time.OffsetTime G__26407 ^java.time.OffsetTime G__26408)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetTime G__26409 ^java.time.temporal.Temporal G__26410] (.adjustInto ^java.time.OffsetTime G__26409 ^java.time.temporal.Temporal G__26410)))



(defn get-hour ([^java.time.OffsetTime G__26411] (jti/getter hour ^java.time.OffsetTime G__26411)))


(defn minus ^java.time.OffsetTime ([^java.time.OffsetTime G__26412 G__26413] (.minus ^java.time.OffsetTime G__26412 G__26413)) ([^java.time.OffsetTime G__26414 G__26415 G__26416] (.minus ^java.time.OffsetTime G__26414 G__26415 G__26416)))


(defn plus-nanos ^java.time.OffsetTime ([^java.time.OffsetTime G__26417 G__26418] (.plusNanos ^java.time.OffsetTime G__26417 G__26418)))


(defn get-nano ([^java.time.OffsetTime G__26419] (jti/getter nano ^java.time.OffsetTime G__26419)))


(defn is-after ([^java.time.OffsetTime G__26420 ^java.time.OffsetTime G__26421] (.isAfter ^java.time.OffsetTime G__26420 ^java.time.OffsetTime G__26421)))


(defn to-string ^java.lang.String ([^java.time.OffsetTime G__26422] (.toString ^java.time.OffsetTime G__26422)))


(defn with-hour ^java.time.OffsetTime ([^java.time.OffsetTime G__26423 G__26424] (.withHour ^java.time.OffsetTime G__26423 G__26424)))


(defn equals ([^java.time.OffsetTime G__26425 ^java.lang.Object G__26426] (.equals ^java.time.OffsetTime G__26425 ^java.lang.Object G__26426)))



(defn with-nano ^java.time.OffsetTime ([^java.time.OffsetTime G__26427 G__26428] (.withNano ^java.time.OffsetTime G__26427 G__26428)))


(defn get-minute ([^java.time.OffsetTime G__26429] (jti/getter minute ^java.time.OffsetTime G__26429)))


(defn minus-hours ^java.time.OffsetTime ([^java.time.OffsetTime G__26430 G__26431] (.minusHours ^java.time.OffsetTime G__26430 G__26431)))


(defn hash-code ([^java.time.OffsetTime G__26432] (.hashCode ^java.time.OffsetTime G__26432)))



(defn get-long ([^java.time.OffsetTime G__26433 ^java.time.temporal.TemporalField G__26434] (jti/getter long ^java.time.OffsetTime G__26433 ^java.time.temporal.TemporalField G__26434)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetTime G__26435] (jti/getter offset ^java.time.OffsetTime G__26435)))


(defn with-offset-same-instant ^java.time.OffsetTime ([^java.time.OffsetTime G__26436 ^java.time.ZoneOffset G__26437] (.withOffsetSameInstant ^java.time.OffsetTime G__26436 ^java.time.ZoneOffset G__26437)))


(defn with ^java.time.temporal.Temporal ([^java.time.OffsetTime G__26438 G__26439 G__26440] (.with ^java.time.OffsetTime G__26438 G__26439 G__26440)) ([^java.time.OffsetTime G__26441 G__26442] (.with ^java.time.OffsetTime G__26441 G__26442)))


(defn from ^java.time.OffsetTime ([^java.time.temporal.TemporalAccessor G__26444] (. java.time.OffsetTime from ^java.time.temporal.TemporalAccessor G__26444)))


(defn parse ^java.time.OffsetTime ([^java.lang.CharSequence G__26446 ^java.time.format.DateTimeFormatter G__26447] (. java.time.OffsetTime parse ^java.lang.CharSequence G__26446 ^java.time.format.DateTimeFormatter G__26447)) ([^java.lang.CharSequence G__26449] (. java.time.OffsetTime parse ^java.lang.CharSequence G__26449)))


(defn plus ^java.time.temporal.Temporal ([^java.time.OffsetTime G__26450 G__26451] (.plus ^java.time.OffsetTime G__26450 G__26451)) ([^java.time.OffsetTime G__26452 G__26453 G__26454] (.plus ^java.time.OffsetTime G__26452 G__26453 G__26454)))


(defn at-date ^java.time.OffsetDateTime ([^java.time.OffsetTime G__26455 ^java.time.LocalDate G__26456] (.atDate ^java.time.OffsetTime G__26455 ^java.time.LocalDate G__26456)))



(defn with-offset-same-local ^java.time.OffsetTime ([^java.time.OffsetTime G__26457 ^java.time.ZoneOffset G__26458] (.withOffsetSameLocal ^java.time.OffsetTime G__26457 ^java.time.ZoneOffset G__26458)))



(defn minus-minutes ^java.time.OffsetTime ([^java.time.OffsetTime G__26459 G__26460] (.minusMinutes ^java.time.OffsetTime G__26459 G__26460)))

