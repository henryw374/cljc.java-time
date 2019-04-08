(ns cljc.java-time.zoned-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [ZonedDateTime]])) #? (:clj (:import [java.time ZonedDateTime])))


(defn is-supported ([^java.time.ZonedDateTime G__26209 G__26210] (.isSupported ^java.time.ZonedDateTime G__26209 G__26210)))


(defn plus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26211 G__26212] (.plusYears ^java.time.ZonedDateTime G__26211 G__26212)))


(defn query ^java.lang.Object ([^java.time.ZonedDateTime G__26213 ^java.time.temporal.TemporalQuery G__26214] (.query ^java.time.ZonedDateTime G__26213 ^java.time.temporal.TemporalQuery G__26214)))


(defn with-second ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26215 G__26216] (.withSecond ^java.time.ZonedDateTime G__26215 G__26216)))


(defn with-later-offset-at-overlap ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26217] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime G__26217)))


(defn get-second ([^java.time.ZonedDateTime G__26218] (jti/getter second ^java.time.ZonedDateTime G__26218)))


(defn get-day-of-month ([^java.time.ZonedDateTime G__26219] (jti/getter dayOfMonth ^java.time.ZonedDateTime G__26219)))



(defn of ^java.time.ZonedDateTime ([G__26221 G__26222 G__26223 G__26224 G__26225 G__26226 G__26227 ^java.time.ZoneId G__26228] (. java.time.ZonedDateTime of G__26221 G__26222 G__26223 G__26224 G__26225 G__26226 G__26227 ^java.time.ZoneId G__26228)) ([^java.time.LocalDateTime G__26230 ^java.time.ZoneId G__26231] (. java.time.ZonedDateTime of ^java.time.LocalDateTime G__26230 ^java.time.ZoneId G__26231)) ([^java.time.LocalDate G__26233 ^java.time.LocalTime G__26234 ^java.time.ZoneId G__26235] (. java.time.ZonedDateTime of ^java.time.LocalDate G__26233 ^java.time.LocalTime G__26234 ^java.time.ZoneId G__26235)))


(defn to-offset-date-time ^java.time.OffsetDateTime ([^java.time.ZonedDateTime G__26236] (.toOffsetDateTime ^java.time.ZonedDateTime G__26236)))


(defn minus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26237 G__26238] (.minusNanos ^java.time.ZonedDateTime G__26237 G__26238)))


(defn range ^java.time.temporal.ValueRange ([^java.time.ZonedDateTime G__26239 ^java.time.temporal.TemporalField G__26240] (.range ^java.time.ZonedDateTime G__26239 ^java.time.temporal.TemporalField G__26240)))


(defn with-day-of-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26241 G__26242] (.withDayOfYear ^java.time.ZonedDateTime G__26241 G__26242)))


(defn of-instant ^java.time.ZonedDateTime ([^java.time.Instant G__26244 ^java.time.ZoneId G__26245] (. java.time.ZonedDateTime ofInstant ^java.time.Instant G__26244 ^java.time.ZoneId G__26245)) ([^java.time.LocalDateTime G__26247 ^java.time.ZoneOffset G__26248 ^java.time.ZoneId G__26249] (. java.time.ZonedDateTime ofInstant ^java.time.LocalDateTime G__26247 ^java.time.ZoneOffset G__26248 ^java.time.ZoneId G__26249)))


(defn with-minute ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26250 G__26251] (.withMinute ^java.time.ZonedDateTime G__26250 G__26251)))



(defn format ^java.lang.String ([^java.time.ZonedDateTime G__26252 ^java.time.format.DateTimeFormatter G__26253] (.format ^java.time.ZonedDateTime G__26252 ^java.time.format.DateTimeFormatter G__26253)))


(defn minus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26254 G__26255] (.minusMonths ^java.time.ZonedDateTime G__26254 G__26255)))


(defn get ([^java.time.ZonedDateTime G__26256 ^java.time.temporal.TemporalField G__26257] (.get ^java.time.ZonedDateTime G__26256 ^java.time.temporal.TemporalField G__26257)))


(defn truncated-to ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26258 ^java.time.temporal.TemporalUnit G__26259] (.truncatedTo ^java.time.ZonedDateTime G__26258 ^java.time.temporal.TemporalUnit G__26259)))


(defn minus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26260 G__26261] (.minusWeeks ^java.time.ZonedDateTime G__26260 G__26261)))


(defn minus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26262 G__26263] (.minusSeconds ^java.time.ZonedDateTime G__26262 G__26263)))


(defn to-local-time ^java.time.LocalTime ([^java.time.ZonedDateTime G__26264] (.toLocalTime ^java.time.ZonedDateTime G__26264)))


(defn now ^java.time.ZonedDateTime ([G__26266] (. java.time.ZonedDateTime now G__26266)) ([] (. java.time.ZonedDateTime now)))


(defn minus-years ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26268 G__26269] (.minusYears ^java.time.ZonedDateTime G__26268 G__26269)))


(defn minus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26270 G__26271] (.minusDays ^java.time.ZonedDateTime G__26270 G__26271)))


(defn plus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26272 G__26273] (.plusHours ^java.time.ZonedDateTime G__26272 G__26273)))


(defn to-local-date-time ^java.time.LocalDateTime ([^java.time.ZonedDateTime G__26274] (.toLocalDateTime ^java.time.ZonedDateTime G__26274)))



(defn with-fixed-offset-zone ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26275] (.withFixedOffsetZone ^java.time.ZonedDateTime G__26275)))


(defn get-day-of-year ([^java.time.ZonedDateTime G__26276] (jti/getter dayOfYear ^java.time.ZonedDateTime G__26276)))


(defn get-month ^java.time.Month ([^java.time.ZonedDateTime G__26277] (jti/getter month ^java.time.ZonedDateTime G__26277)))





(defn plus-seconds ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26278 G__26279] (.plusSeconds ^java.time.ZonedDateTime G__26278 G__26279)))


(defn plus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26280 G__26281] (.plusMinutes ^java.time.ZonedDateTime G__26280 G__26281)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.ZonedDateTime G__26282] (.toLocalDate ^java.time.ZonedDateTime G__26282)))


(defn get-zone ^java.time.ZoneId ([^java.time.ZonedDateTime G__26283] (jti/getter zone ^java.time.ZonedDateTime G__26283)))



(defn until ([^java.time.ZonedDateTime G__26284 ^java.time.temporal.Temporal G__26285 ^java.time.temporal.TemporalUnit G__26286] (.until ^java.time.ZonedDateTime G__26284 ^java.time.temporal.Temporal G__26285 ^java.time.temporal.TemporalUnit G__26286)))




(defn get-hour ([^java.time.ZonedDateTime G__26287] (jti/getter hour ^java.time.ZonedDateTime G__26287)))


(defn minus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__26288 G__26289] (.minus ^java.time.ZonedDateTime G__26288 G__26289)) ([^java.time.ZonedDateTime G__26290 G__26291 G__26292] (.minus ^java.time.ZonedDateTime G__26290 G__26291 G__26292)))


(defn plus-nanos ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26293 G__26294] (.plusNanos ^java.time.ZonedDateTime G__26293 G__26294)))


(defn get-nano ([^java.time.ZonedDateTime G__26295] (jti/getter nano ^java.time.ZonedDateTime G__26295)))


(defn get-year ([^java.time.ZonedDateTime G__26296] (jti/getter year ^java.time.ZonedDateTime G__26296)))


(defn with-day-of-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26297 G__26298] (.withDayOfMonth ^java.time.ZonedDateTime G__26297 G__26298)))


(defn to-string ^java.lang.String ([^java.time.ZonedDateTime G__26299] (.toString ^java.time.ZonedDateTime G__26299)))


(defn with-zone-same-instant ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26300 G__26301] (.withZoneSameInstant ^java.time.ZonedDateTime G__26300 G__26301)))


(defn plus-months ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26302 G__26303] (.plusMonths ^java.time.ZonedDateTime G__26302 G__26303)))


(defn with-hour ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26304 G__26305] (.withHour ^java.time.ZonedDateTime G__26304 G__26305)))


(defn with-zone-same-local ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26306 G__26307] (.withZoneSameLocal ^java.time.ZonedDateTime G__26306 G__26307)))


(defn equals ([^java.time.ZonedDateTime G__26308 ^java.lang.Object G__26309] (.equals ^java.time.ZonedDateTime G__26308 ^java.lang.Object G__26309)))



(defn get-month-value ([^java.time.ZonedDateTime G__26310] (jti/getter monthValue ^java.time.ZonedDateTime G__26310)))


(defn with-nano ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26311 G__26312] (.withNano ^java.time.ZonedDateTime G__26311 G__26312)))


(defn get-minute ([^java.time.ZonedDateTime G__26313] (jti/getter minute ^java.time.ZonedDateTime G__26313)))


(defn of-local ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__26315 ^java.time.ZoneId G__26316 ^java.time.ZoneOffset G__26317] (. java.time.ZonedDateTime ofLocal ^java.time.LocalDateTime G__26315 ^java.time.ZoneId G__26316 ^java.time.ZoneOffset G__26317)))


(defn minus-hours ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26318 G__26319] (.minusHours ^java.time.ZonedDateTime G__26318 G__26319)))


(defn with-earlier-offset-at-overlap ^java.time.chrono.ChronoZonedDateTime ([^java.time.ZonedDateTime G__26320] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime G__26320)))



(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.ZonedDateTime G__26321] (jti/getter dayOfWeek ^java.time.ZonedDateTime G__26321)))


(defn plus-days ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26322 G__26323] (.plusDays ^java.time.ZonedDateTime G__26322 G__26323)))


(defn plus-weeks ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26324 G__26325] (.plusWeeks ^java.time.ZonedDateTime G__26324 G__26325)))


(defn hash-code ([^java.time.ZonedDateTime G__26326] (.hashCode ^java.time.ZonedDateTime G__26326)))



(defn of-strict ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__26328 ^java.time.ZoneOffset G__26329 ^java.time.ZoneId G__26330] (. java.time.ZonedDateTime ofStrict ^java.time.LocalDateTime G__26328 ^java.time.ZoneOffset G__26329 ^java.time.ZoneId G__26330)))


(defn get-long ([^java.time.ZonedDateTime G__26331 ^java.time.temporal.TemporalField G__26332] (jti/getter long ^java.time.ZonedDateTime G__26331 ^java.time.temporal.TemporalField G__26332)))


(defn get-offset ^java.time.ZoneOffset ([^java.time.ZonedDateTime G__26333] (jti/getter offset ^java.time.ZonedDateTime G__26333)))


(defn with ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__26334 G__26335 G__26336] (.with ^java.time.ZonedDateTime G__26334 G__26335 G__26336)) ([^java.time.ZonedDateTime G__26337 G__26338] (.with ^java.time.ZonedDateTime G__26337 G__26338)))


(defn from ^java.time.ZonedDateTime ([^java.time.temporal.TemporalAccessor G__26340] (. java.time.ZonedDateTime from ^java.time.temporal.TemporalAccessor G__26340)))


(defn parse ^java.time.ZonedDateTime ([^java.lang.CharSequence G__26342] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__26342)) ([^java.lang.CharSequence G__26344 ^java.time.format.DateTimeFormatter G__26345] (. java.time.ZonedDateTime parse ^java.lang.CharSequence G__26344 ^java.time.format.DateTimeFormatter G__26345)))


(defn plus ^java.time.temporal.Temporal ([^java.time.ZonedDateTime G__26346 G__26347 G__26348] (.plus ^java.time.ZonedDateTime G__26346 G__26347 G__26348)) ([^java.time.ZonedDateTime G__26349 G__26350] (.plus ^java.time.ZonedDateTime G__26349 G__26350)))


(defn with-year ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26351 G__26352] (.withYear ^java.time.ZonedDateTime G__26351 G__26352)))



(defn with-month ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26353 G__26354] (.withMonth ^java.time.ZonedDateTime G__26353 G__26354)))


(defn minus-minutes ^java.time.ZonedDateTime ([^java.time.ZonedDateTime G__26355 G__26356] (.minusMinutes ^java.time.ZonedDateTime G__26355 G__26356)))

