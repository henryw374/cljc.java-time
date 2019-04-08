(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time OffsetDateTime])))

(defn compare-to ([^java.time.OffsetDateTime G__36270 G__36271] (.compareTo ^java.time.OffsetDateTime G__36270 G__36271)))


(defn is-supported ([^java.time.OffsetDateTime G__36272 G__36273] (.isSupported ^java.time.OffsetDateTime G__36272 G__36273)))


(defn plus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36274 G__36275] (.plusYears ^java.time.OffsetDateTime G__36274 G__36275)))


(defn to-zoned-date-time ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__36276] (.toZonedDateTime ^java.time.OffsetDateTime G__36276)))


(defn query ^java.lang.Object ([^java.time.OffsetDateTime G__36277 ^java.time.temporal.TemporalQuery G__36278] (.query ^java.time.OffsetDateTime G__36277 ^java.time.temporal.TemporalQuery G__36278)))


(defn with-second ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36279 G__36280] (.withSecond ^java.time.OffsetDateTime G__36279 G__36280)))


(defn get-second ([^java.time.OffsetDateTime G__36281] (jti/getter second ^java.time.OffsetDateTime G__36281)))


(defn get-day-of-month ([^java.time.OffsetDateTime G__36282] (jti/getter dayOfMonth ^java.time.OffsetDateTime G__36282)))


(defn of ^java.time.OffsetDateTime ([^java.time.LocalDate G__36284 ^java.time.LocalTime G__36285 ^java.time.ZoneOffset G__36286] (. java.time.OffsetDateTime of ^java.time.LocalDate G__36284 ^java.time.LocalTime G__36285 ^java.time.ZoneOffset G__36286)) ([G__36288 G__36289 G__36290 G__36291 G__36292 G__36293 G__36294 ^java.time.ZoneOffset G__36295] (. java.time.OffsetDateTime of G__36288 G__36289 G__36290 G__36291 G__36292 G__36293 G__36294 ^java.time.ZoneOffset G__36295)) ([^java.time.LocalDateTime G__36297 ^java.time.ZoneOffset G__36298] (. java.time.OffsetDateTime of ^java.time.LocalDateTime G__36297 ^java.time.ZoneOffset G__36298)))


(defn minus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36299 G__36300] (.minusNanos ^java.time.OffsetDateTime G__36299 G__36300)))


(defn range ^java.time.temporal.ValueRange ([^java.time.OffsetDateTime G__36301 ^java.time.temporal.TemporalField G__36302] (.range ^java.time.OffsetDateTime G__36301 ^java.time.temporal.TemporalField G__36302)))


(defn with-day-of-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36303 G__36304] (.withDayOfYear ^java.time.OffsetDateTime G__36303 G__36304)))


(defn is-equal ([^java.time.OffsetDateTime G__36305 ^java.time.OffsetDateTime G__36306] (.isEqual ^java.time.OffsetDateTime G__36305 ^java.time.OffsetDateTime G__36306)))


(defn of-instant ^java.time.OffsetDateTime ([^java.time.Instant G__36308 ^java.time.ZoneId G__36309] (. java.time.OffsetDateTime ofInstant ^java.time.Instant G__36308 ^java.time.ZoneId G__36309)))


(defn with-minute ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36310 G__36311] (.withMinute ^java.time.OffsetDateTime G__36310 G__36311)))


(defn format ^java.lang.String ([^java.time.OffsetDateTime G__36312 ^java.time.format.DateTimeFormatter G__36313] (.format ^java.time.OffsetDateTime G__36312 ^java.time.format.DateTimeFormatter G__36313)))


(defn minus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36314 G__36315] (.minusMonths ^java.time.OffsetDateTime G__36314 G__36315)))


(defn get ([^java.time.OffsetDateTime G__36316 ^java.time.temporal.TemporalField G__36317] (.get ^java.time.OffsetDateTime G__36316 ^java.time.temporal.TemporalField G__36317)))


(defn truncated-to ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36318 ^java.time.temporal.TemporalUnit G__36319] (.truncatedTo ^java.time.OffsetDateTime G__36318 ^java.time.temporal.TemporalUnit G__36319)))


(defn minus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36320 G__36321] (.minusWeeks ^java.time.OffsetDateTime G__36320 G__36321)))


(defn minus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36322 G__36323] (.minusSeconds ^java.time.OffsetDateTime G__36322 G__36323)))


(defn to-local-time ^java.time.LocalTime ([^java.time.OffsetDateTime G__36324] (.toLocalTime ^java.time.OffsetDateTime G__36324)))


(defn now ^java.time.OffsetDateTime ([G__36326] (. java.time.OffsetDateTime now G__36326)) ([] (. java.time.OffsetDateTime now)))


(defn minus-years ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36328 G__36329] (.minusYears ^java.time.OffsetDateTime G__36328 G__36329)))


(defn minus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36330 G__36331] (.minusDays ^java.time.OffsetDateTime G__36330 G__36331)))


(defn plus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36332 G__36333] (.plusHours ^java.time.OffsetDateTime G__36332 G__36333)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.OffsetDateTime G__36334] (.toLocalDateTime ^java.time.OffsetDateTime G__36334)))



(defn get-day-of-year ([^java.time.OffsetDateTime G__36335] (jti/getter dayOfYear ^java.time.OffsetDateTime G__36335)))


(defn get-month ^java.time.Month ([^java.time.OffsetDateTime G__36336] (jti/getter month ^java.time.OffsetDateTime G__36336)))



(defn plus-seconds ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36337 G__36338] (.plusSeconds ^java.time.OffsetDateTime G__36337 G__36338)))


(defn at-zone-same-instant ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__36339 ^java.time.ZoneId G__36340] (.atZoneSameInstant ^java.time.OffsetDateTime G__36339 ^java.time.ZoneId G__36340)))


(defn plus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36341 G__36342] (.plusMinutes ^java.time.OffsetDateTime G__36341 G__36342)))


(defn to-local-date ^java.time.LocalDate ([^java.time.OffsetDateTime G__36343] (.toLocalDate ^java.time.OffsetDateTime G__36343)))



(defn until ([^java.time.OffsetDateTime G__36344 ^java.time.temporal.Temporal G__36345 ^java.time.temporal.TemporalUnit G__36346] (.until ^java.time.OffsetDateTime G__36344 ^java.time.temporal.Temporal G__36345 ^java.time.temporal.TemporalUnit G__36346)))




(defn is-before ([^java.time.OffsetDateTime G__36347 ^java.time.OffsetDateTime G__36348] (.isBefore ^java.time.OffsetDateTime G__36347 ^java.time.OffsetDateTime G__36348)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.OffsetDateTime G__36349 ^java.time.temporal.Temporal G__36350] (.adjustInto ^java.time.OffsetDateTime G__36349 ^java.time.temporal.Temporal G__36350)))


(defn get-hour ([^java.time.OffsetDateTime G__36351] (jti/getter hour ^java.time.OffsetDateTime G__36351)))


(defn minus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36352 G__36353] (.minus ^java.time.OffsetDateTime G__36352 G__36353)) ([^java.time.OffsetDateTime G__36354 G__36355 G__36356] (.minus ^java.time.OffsetDateTime G__36354 G__36355 G__36356)))


(defn plus-nanos ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36357 G__36358] (.plusNanos ^java.time.OffsetDateTime G__36357 G__36358)))


(defn get-nano ([^java.time.OffsetDateTime G__36359] (jti/getter nano ^java.time.OffsetDateTime G__36359)))


(defn get-year ([^java.time.OffsetDateTime G__36360] (jti/getter year ^java.time.OffsetDateTime G__36360)))


(defn with-day-of-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36361 G__36362] (.withDayOfMonth ^java.time.OffsetDateTime G__36361 G__36362)))


(defn is-after ([^java.time.OffsetDateTime G__36363 ^java.time.OffsetDateTime G__36364] (.isAfter ^java.time.OffsetDateTime G__36363 ^java.time.OffsetDateTime G__36364)))


(defn to-string ^java.lang.String ([^java.time.OffsetDateTime G__36365] (.toString ^java.time.OffsetDateTime G__36365)))


(defn plus-months ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36366 G__36367] (.plusMonths ^java.time.OffsetDateTime G__36366 G__36367)))


(defn with-hour ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36368 G__36369] (.withHour ^java.time.OffsetDateTime G__36368 G__36369)))


(defn to-offset-time ^java.time.OffsetTime ([^java.time.OffsetDateTime G__36370] (.toOffsetTime ^java.time.OffsetDateTime G__36370)))


(defn equals ([^java.time.OffsetDateTime G__36371 ^java.lang.Object G__36372] (.equals ^java.time.OffsetDateTime G__36371 ^java.lang.Object G__36372)))



(defn get-month-value ([^java.time.OffsetDateTime G__36373] (jti/getter monthValue ^java.time.OffsetDateTime G__36373)))



(defn with-nano ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36374 G__36375] (.withNano ^java.time.OffsetDateTime G__36374 G__36375)))


(defn get-minute ([^java.time.OffsetDateTime G__36376] (jti/getter minute ^java.time.OffsetDateTime G__36376)))


(defn minus-hours ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36377 G__36378] (.minusHours ^java.time.OffsetDateTime G__36377 G__36378)))


(defn to-instant ^java.time.Instant ([^java.time.OffsetDateTime G__36379] (.toInstant ^java.time.OffsetDateTime G__36379)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.OffsetDateTime G__36380] (jti/getter dayOfWeek ^java.time.OffsetDateTime G__36380)))


(defn plus-days ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36381 G__36382] (.plusDays ^java.time.OffsetDateTime G__36381 G__36382)))


(defn plus-weeks ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36383 G__36384] (.plusWeeks ^java.time.OffsetDateTime G__36383 G__36384)))


(defn hash-code ([^java.time.OffsetDateTime G__36385] (.hashCode ^java.time.OffsetDateTime G__36385)))



(defn get-long ([^java.time.OffsetDateTime G__36386 ^java.time.temporal.TemporalField G__36387] (jti/getter long ^java.time.OffsetDateTime G__36386 ^java.time.temporal.TemporalField G__36387)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.OffsetDateTime G__36388] (jti/getter offset ^java.time.OffsetDateTime G__36388)))


(defn with-offset-same-instant ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36389 ^java.time.ZoneOffset G__36390] (.withOffsetSameInstant ^java.time.OffsetDateTime G__36389 ^java.time.ZoneOffset G__36390)))


(defn time-line-order ^java.util.Comparator ([] (. java.time.OffsetDateTime timeLineOrder)))


(defn with ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36392 G__36393] (.with ^java.time.OffsetDateTime G__36392 G__36393)) ([^java.time.OffsetDateTime G__36394 G__36395 G__36396] (.with ^java.time.OffsetDateTime G__36394 G__36395 G__36396)))


(defn from ^java.time.OffsetDateTime ([^java.time.temporal.TemporalAccessor G__36398] (. java.time.OffsetDateTime from ^java.time.temporal.TemporalAccessor G__36398)))


(defn parse ^java.time.OffsetDateTime ([^java.lang.CharSequence G__36400] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__36400)) ([^java.lang.CharSequence G__36402 ^java.time.format.DateTimeFormatter G__36403] (. java.time.OffsetDateTime parse ^java.lang.CharSequence G__36402 ^java.time.format.DateTimeFormatter G__36403)))


(defn plus ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36404 G__36405] (.plus ^java.time.OffsetDateTime G__36404 G__36405)) ([^java.time.OffsetDateTime G__36406 G__36407 G__36408] (.plus ^java.time.OffsetDateTime G__36406 G__36407 G__36408)))


(defn with-year ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36409 G__36410] (.withYear ^java.time.OffsetDateTime G__36409 G__36410)))


(defn to-epoch-second ([^java.time.OffsetDateTime G__36411] (.toEpochSecond ^java.time.OffsetDateTime G__36411)))


(defn with-offset-same-local ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36412 ^java.time.ZoneOffset G__36413] (.withOffsetSameLocal ^java.time.OffsetDateTime G__36412 ^java.time.ZoneOffset G__36413)))



(defn at-zone-similar-local ^java.time.ZonedDateTime ([^java.time.OffsetDateTime G__36414 ^java.time.ZoneId G__36415] (.atZoneSimilarLocal ^java.time.OffsetDateTime G__36414 ^java.time.ZoneId G__36415)))



(defn with-month ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36416 G__36417] (.withMonth ^java.time.OffsetDateTime G__36416 G__36417)))


(defn minus-minutes ^java.time.OffsetDateTime ([^java.time.OffsetDateTime G__36418 G__36419] (.minusMinutes ^java.time.OffsetDateTime G__36418 G__36419)))

