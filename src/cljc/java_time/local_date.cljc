(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [LocalDate]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time LocalDate])))

(defn compare-to ([^java.time.LocalDate G__34184 G__34185] (.compareTo ^java.time.LocalDate G__34184 G__34185)))


(defn is-supported ([^java.time.LocalDate G__34186 G__34187] (.isSupported ^java.time.LocalDate G__34186 G__34187)))


(defn plus-years ^java.time.LocalDate ([^java.time.LocalDate G__34188 G__34189] (.plusYears ^java.time.LocalDate G__34188 G__34189)))


(defn get-era ^java.time.chrono.Era ([^java.time.LocalDate G__34190] (jti/getter era ^java.time.LocalDate G__34190)))


(defn query ^java.lang.Object ([^java.time.LocalDate G__34191 ^java.time.temporal.TemporalQuery G__34192] (.query ^java.time.LocalDate G__34191 ^java.time.temporal.TemporalQuery G__34192)))


(defn get-day-of-month ([^java.time.LocalDate G__34193] (jti/getter dayOfMonth ^java.time.LocalDate G__34193)))



(defn of ^java.time.LocalDate ([G__34195 G__34196 G__34197] (. java.time.LocalDate of G__34195 G__34196 G__34197)))




(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDate G__34198 ^java.time.temporal.TemporalField G__34199] (.range ^java.time.LocalDate G__34198 ^java.time.temporal.TemporalField G__34199)))



(defn of-epoch-day ^java.time.LocalDate ([G__34201] (. java.time.LocalDate ofEpochDay G__34201)))


(defn at-start-of-day ^java.time.ZonedDateTime ([^java.time.LocalDate G__34202 ^java.time.ZoneId G__34203] (.atStartOfDay ^java.time.LocalDate G__34202 ^java.time.ZoneId G__34203)) ([^java.time.LocalDate G__34204] (.atStartOfDay ^java.time.LocalDate G__34204)))


(defn with-day-of-year ^java.time.LocalDate ([^java.time.LocalDate G__34205 G__34206] (.withDayOfYear ^java.time.LocalDate G__34205 G__34206)))


(defn is-equal ([^java.time.LocalDate G__34207 ^java.time.chrono.ChronoLocalDate G__34208] (.isEqual ^java.time.LocalDate G__34207 ^java.time.chrono.ChronoLocalDate G__34208)))



(defn length-of-month ([^java.time.LocalDate G__34209] (.lengthOfMonth ^java.time.LocalDate G__34209)))




(defn format ^java.lang.String ([^java.time.LocalDate G__34210 ^java.time.format.DateTimeFormatter G__34211] (.format ^java.time.LocalDate G__34210 ^java.time.format.DateTimeFormatter G__34211)))


(defn minus-months ^java.time.LocalDate ([^java.time.LocalDate G__34212 G__34213] (.minusMonths ^java.time.LocalDate G__34212 G__34213)))


(defn get ([^java.time.LocalDate G__34214 ^java.time.temporal.TemporalField G__34215] (.get ^java.time.LocalDate G__34214 ^java.time.temporal.TemporalField G__34215)))


(defn minus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__34216 G__34217] (.minusWeeks ^java.time.LocalDate G__34216 G__34217)))


(defn at-time ^java.time.OffsetDateTime ([^java.time.LocalDate G__34218 G__34219] (.atTime ^java.time.LocalDate G__34218 G__34219)) ([^java.time.LocalDate G__34220 G__34221 G__34222 G__34223 G__34224] (.atTime ^java.time.LocalDate G__34220 G__34221 G__34222 G__34223 G__34224)) ([^java.time.LocalDate G__34225 G__34226 G__34227 G__34228] (.atTime ^java.time.LocalDate G__34225 G__34226 G__34227 G__34228)) ([^java.time.LocalDate G__34229 G__34230 G__34231] (.atTime ^java.time.LocalDate G__34229 G__34230 G__34231)))


(defn now ^java.time.LocalDate ([] (. java.time.LocalDate now)) ([G__34234] (. java.time.LocalDate now G__34234)))


(defn minus-years ^java.time.LocalDate ([^java.time.LocalDate G__34235 G__34236] (.minusYears ^java.time.LocalDate G__34235 G__34236)))


(defn minus-days ^java.time.LocalDate ([^java.time.LocalDate G__34237 G__34238] (.minusDays ^java.time.LocalDate G__34237 G__34238)))



(defn get-day-of-year ([^java.time.LocalDate G__34239] (jti/getter dayOfYear ^java.time.LocalDate G__34239)))


(defn get-month ^java.time.Month ([^java.time.LocalDate G__34240] (jti/getter month ^java.time.LocalDate G__34240)))





(defn until ([^java.time.LocalDate G__34241 ^java.time.temporal.Temporal G__34242 ^java.time.temporal.TemporalUnit G__34243] (.until ^java.time.LocalDate G__34241 ^java.time.temporal.Temporal G__34242 ^java.time.temporal.TemporalUnit G__34243)) ([^java.time.LocalDate G__34244 G__34245] (.until ^java.time.LocalDate G__34244 G__34245)))





(defn is-before ([^java.time.LocalDate G__34246 ^java.time.chrono.ChronoLocalDate G__34247] (.isBefore ^java.time.LocalDate G__34246 ^java.time.chrono.ChronoLocalDate G__34247)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDate G__34248 ^java.time.temporal.Temporal G__34249] (.adjustInto ^java.time.LocalDate G__34248 ^java.time.temporal.Temporal G__34249)))


(defn minus ^java.time.LocalDate ([^java.time.LocalDate G__34250 G__34251 G__34252] (.minus ^java.time.LocalDate G__34250 G__34251 G__34252)) ([^java.time.LocalDate G__34253 G__34254] (.minus ^java.time.LocalDate G__34253 G__34254)))



(defn get-year ([^java.time.LocalDate G__34255] (jti/getter year ^java.time.LocalDate G__34255)))


(defn with-day-of-month ^java.time.LocalDate ([^java.time.LocalDate G__34256 G__34257] (.withDayOfMonth ^java.time.LocalDate G__34256 G__34257)))


(defn to-epoch-day ([^java.time.LocalDate G__34258] (.toEpochDay ^java.time.LocalDate G__34258)))


(defn is-after ([^java.time.LocalDate G__34259 ^java.time.chrono.ChronoLocalDate G__34260] (.isAfter ^java.time.LocalDate G__34259 ^java.time.chrono.ChronoLocalDate G__34260)))


(defn of-year-day ^java.time.LocalDate ([G__34262 G__34263] (. java.time.LocalDate ofYearDay G__34262 G__34263)))


(defn get-chronology ^java.time.chrono.Chronology ([^java.time.LocalDate G__34264] (jti/getter chronology ^java.time.LocalDate G__34264)))


(defn to-string ^java.lang.String ([^java.time.LocalDate G__34265] (.toString ^java.time.LocalDate G__34265)))


(defn plus-months ^java.time.LocalDate ([^java.time.LocalDate G__34266 G__34267] (.plusMonths ^java.time.LocalDate G__34266 G__34267)))


(defn equals ([^java.time.LocalDate G__34268 ^java.lang.Object G__34269] (.equals ^java.time.LocalDate G__34268 ^java.lang.Object G__34269)))


(defn get-month-value ([^java.time.LocalDate G__34270] (jti/getter monthValue ^java.time.LocalDate G__34270)))



(defn length-of-year ([^java.time.LocalDate G__34271] (.lengthOfYear ^java.time.LocalDate G__34271)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDate G__34272] (jti/getter dayOfWeek ^java.time.LocalDate G__34272)))


(defn plus-days ^java.time.LocalDate ([^java.time.LocalDate G__34273 G__34274] (.plusDays ^java.time.LocalDate G__34273 G__34274)))



(defn plus-weeks ^java.time.LocalDate ([^java.time.LocalDate G__34275 G__34276] (.plusWeeks ^java.time.LocalDate G__34275 G__34276)))


(defn hash-code ([^java.time.LocalDate G__34277] (.hashCode ^java.time.LocalDate G__34277)))



(defn get-long ([^java.time.LocalDate G__34278 ^java.time.temporal.TemporalField G__34279] (jti/getter long ^java.time.LocalDate G__34278 ^java.time.temporal.TemporalField G__34279)))


(defn is-leap-year ([^java.time.LocalDate G__34280] (.isLeapYear ^java.time.LocalDate G__34280)))


(defn with ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDate G__34281 G__34282] (.with ^java.time.LocalDate G__34281 G__34282)) ([^java.time.LocalDate G__34283 G__34284 G__34285] (.with ^java.time.LocalDate G__34283 G__34284 G__34285)))


(defn from ^java.time.LocalDate ([^java.time.temporal.TemporalAccessor G__34287] (. java.time.LocalDate from ^java.time.temporal.TemporalAccessor G__34287)))


(defn parse ^java.time.LocalDate ([^java.lang.CharSequence G__34289 ^java.time.format.DateTimeFormatter G__34290] (. java.time.LocalDate parse ^java.lang.CharSequence G__34289 ^java.time.format.DateTimeFormatter G__34290)) ([^java.lang.CharSequence G__34292] (. java.time.LocalDate parse ^java.lang.CharSequence G__34292)))


(defn plus ^java.time.temporal.Temporal ([^java.time.LocalDate G__34293 G__34294 G__34295] (.plus ^java.time.LocalDate G__34293 G__34294 G__34295)) ([^java.time.LocalDate G__34296 G__34297] (.plus ^java.time.LocalDate G__34296 G__34297)))


(defn with-year ^java.time.LocalDate ([^java.time.LocalDate G__34298 G__34299] (.withYear ^java.time.LocalDate G__34298 G__34299)))



(defn with-month ^java.time.LocalDate ([^java.time.LocalDate G__34300 G__34301] (.withMonth ^java.time.LocalDate G__34300 G__34301)))


