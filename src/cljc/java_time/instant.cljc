(ns cljc.java-time.instant (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [Instant]])) #? (:clj (:import [java.time Instant])))

(defn compare-to ([^java.time.Instant G__26461 G__26462] (.compareTo ^java.time.Instant G__26461 G__26462)))


(defn is-supported ([^java.time.Instant G__26463 G__26464] (.isSupported ^java.time.Instant G__26463 G__26464)))


(defn query ^java.lang.Object ([^java.time.Instant G__26465 ^java.time.temporal.TemporalQuery G__26466] (.query ^java.time.Instant G__26465 ^java.time.temporal.TemporalQuery G__26466)))




(defn minus-nanos ^java.time.Instant ([^java.time.Instant G__26467 G__26468] (.minusNanos ^java.time.Instant G__26467 G__26468)))


(defn range ^java.time.temporal.ValueRange ([^java.time.Instant G__26469 ^java.time.temporal.TemporalField G__26470] (.range ^java.time.Instant G__26469 ^java.time.temporal.TemporalField G__26470)))


(defn to-epoch-milli ([^java.time.Instant G__26471] (.toEpochMilli ^java.time.Instant G__26471)))


(defn of-epoch-second ^java.time.Instant ([G__26473] (. java.time.Instant ofEpochSecond G__26473)) ([G__26475 G__26476] (. java.time.Instant ofEpochSecond G__26475 G__26476)))



(defn get ([^java.time.Instant G__26477 ^java.time.temporal.TemporalField G__26478] (.get ^java.time.Instant G__26477 ^java.time.temporal.TemporalField G__26478)))


(defn truncated-to ^java.time.Instant ([^java.time.Instant G__26479 ^java.time.temporal.TemporalUnit G__26480] (.truncatedTo ^java.time.Instant G__26479 ^java.time.temporal.TemporalUnit G__26480)))


(defn minus-millis ^java.time.Instant ([^java.time.Instant G__26481 G__26482] (.minusMillis ^java.time.Instant G__26481 G__26482)))


(defn minus-seconds ^java.time.Instant ([^java.time.Instant G__26483 G__26484] (.minusSeconds ^java.time.Instant G__26483 G__26484)))


(defn now ^java.time.Instant ([^java.time.Clock G__26486] (. java.time.Instant now ^java.time.Clock G__26486)) ([] (. java.time.Instant now)))




(defn of-epoch-milli ^java.time.Instant ([G__26489] (. java.time.Instant ofEpochMilli G__26489)))



(defn plus-seconds ^java.time.Instant ([^java.time.Instant G__26490 G__26491] (.plusSeconds ^java.time.Instant G__26490 G__26491)))




(defn until ([^java.time.Instant G__26492 ^java.time.temporal.Temporal G__26493 ^java.time.temporal.TemporalUnit G__26494] (.until ^java.time.Instant G__26492 ^java.time.temporal.Temporal G__26493 ^java.time.temporal.TemporalUnit G__26494)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.Instant G__26495 ^java.time.ZoneOffset G__26496] (.atOffset ^java.time.Instant G__26495 ^java.time.ZoneOffset G__26496)))



(defn is-before ([^java.time.Instant G__26497 ^java.time.Instant G__26498] (.isBefore ^java.time.Instant G__26497 ^java.time.Instant G__26498)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.Instant G__26499 ^java.time.temporal.Temporal G__26500] (.adjustInto ^java.time.Instant G__26499 ^java.time.temporal.Temporal G__26500)))


(defn minus ^java.time.Instant ([^java.time.Instant G__26501 G__26502 G__26503] (.minus ^java.time.Instant G__26501 G__26502 G__26503)) ([^java.time.Instant G__26504 G__26505] (.minus ^java.time.Instant G__26504 G__26505)))


(defn plus-nanos ^java.time.Instant ([^java.time.Instant G__26506 G__26507] (.plusNanos ^java.time.Instant G__26506 G__26507)))


(defn get-nano ([^java.time.Instant G__26508] (jti/getter nano ^java.time.Instant G__26508)))


(defn is-after ([^java.time.Instant G__26509 ^java.time.Instant G__26510] (.isAfter ^java.time.Instant G__26509 ^java.time.Instant G__26510)))


(defn to-string ^java.lang.String ([^java.time.Instant G__26511] (.toString ^java.time.Instant G__26511)))



(defn equals ([^java.time.Instant G__26512 ^java.lang.Object G__26513] (.equals ^java.time.Instant G__26512 ^java.lang.Object G__26513)))


(defn plus-millis ^java.time.Instant ([^java.time.Instant G__26514 G__26515] (.plusMillis ^java.time.Instant G__26514 G__26515)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.Instant G__26516 ^java.time.ZoneId G__26517] (.atZone ^java.time.Instant G__26516 ^java.time.ZoneId G__26517)))



(defn hash-code ([^java.time.Instant G__26518] (.hashCode ^java.time.Instant G__26518)))



(defn get-long ([^java.time.Instant G__26519 ^java.time.temporal.TemporalField G__26520] (jti/getter long ^java.time.Instant G__26519 ^java.time.temporal.TemporalField G__26520)))




(defn with ^java.time.temporal.Temporal ([^java.time.Instant G__26521 G__26522] (.with ^java.time.Instant G__26521 G__26522)) ([^java.time.Instant G__26523 G__26524 G__26525] (.with ^java.time.Instant G__26523 G__26524 G__26525)))


(defn from ^java.time.Instant ([^java.time.temporal.TemporalAccessor G__26527] (. java.time.Instant from ^java.time.temporal.TemporalAccessor G__26527)))


(defn get-epoch-second ([^java.time.Instant G__26528] (jti/getter epochSecond ^java.time.Instant G__26528)))


(defn parse ^java.time.Instant ([^java.lang.CharSequence G__26530] (. java.time.Instant parse ^java.lang.CharSequence G__26530)))


(defn plus ^java.time.temporal.Temporal ([^java.time.Instant G__26531 G__26532 G__26533] (.plus ^java.time.Instant G__26531 G__26532 G__26533)) ([^java.time.Instant G__26534 G__26535] (.plus ^java.time.Instant G__26534 G__26535)))


