(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time :refer [YearMonth]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time YearMonth])))

(defn compare-to ([^java.time.YearMonth G__35273 G__35274] (.compareTo ^java.time.YearMonth G__35273 G__35274)))


(defn is-supported ([^java.time.YearMonth G__35275 G__35276] (.isSupported ^java.time.YearMonth G__35275 G__35276)))


(defn plus-years ^java.time.YearMonth ([^java.time.YearMonth G__35277 G__35278] (.plusYears ^java.time.YearMonth G__35277 G__35278)))


(defn query ^java.lang.Object ([^java.time.YearMonth G__35279 ^java.time.temporal.TemporalQuery G__35280] (.query ^java.time.YearMonth G__35279 ^java.time.temporal.TemporalQuery G__35280)))



(defn of ^java.time.YearMonth ([G__35282 G__35283] (. java.time.YearMonth of G__35282 G__35283)))


(defn range ^java.time.temporal.ValueRange ([^java.time.YearMonth G__35284 ^java.time.temporal.TemporalField G__35285] (.range ^java.time.YearMonth G__35284 ^java.time.temporal.TemporalField G__35285)))



(defn length-of-month ([^java.time.YearMonth G__35286] (.lengthOfMonth ^java.time.YearMonth G__35286)))


(defn format ^java.lang.String ([^java.time.YearMonth G__35287 ^java.time.format.DateTimeFormatter G__35288] (.format ^java.time.YearMonth G__35287 ^java.time.format.DateTimeFormatter G__35288)))


(defn minus-months ^java.time.YearMonth ([^java.time.YearMonth G__35289 G__35290] (.minusMonths ^java.time.YearMonth G__35289 G__35290)))


(defn at-day ^java.time.LocalDate ([^java.time.YearMonth G__35291 G__35292] (.atDay ^java.time.YearMonth G__35291 G__35292)))


(defn get ([^java.time.YearMonth G__35293 ^java.time.temporal.TemporalField G__35294] (.get ^java.time.YearMonth G__35293 ^java.time.temporal.TemporalField G__35294)))


(defn now ^java.time.YearMonth ([G__35296] (. java.time.YearMonth now G__35296)) ([] (. java.time.YearMonth now)))


(defn minus-years ^java.time.YearMonth ([^java.time.YearMonth G__35298 G__35299] (.minusYears ^java.time.YearMonth G__35298 G__35299)))



(defn get-month ^java.time.Month ([^java.time.YearMonth G__35300] (jti/getter month ^java.time.YearMonth G__35300)))


(defn at-end-of-month ^java.time.LocalDate ([^java.time.YearMonth G__35301] (.atEndOfMonth ^java.time.YearMonth G__35301)))



(defn until ([^java.time.YearMonth G__35302 ^java.time.temporal.Temporal G__35303 ^java.time.temporal.TemporalUnit G__35304] (.until ^java.time.YearMonth G__35302 ^java.time.temporal.Temporal G__35303 ^java.time.temporal.TemporalUnit G__35304)))




(defn is-before ([^java.time.YearMonth G__35305 ^java.time.YearMonth G__35306] (.isBefore ^java.time.YearMonth G__35305 ^java.time.YearMonth G__35306)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.YearMonth G__35307 ^java.time.temporal.Temporal G__35308] (.adjustInto ^java.time.YearMonth G__35307 ^java.time.temporal.Temporal G__35308)))


(defn minus ^java.time.YearMonth ([^java.time.YearMonth G__35309 G__35310] (.minus ^java.time.YearMonth G__35309 G__35310)) ([^java.time.YearMonth G__35311 G__35312 G__35313] (.minus ^java.time.YearMonth G__35311 G__35312 G__35313)))


(defn get-year ([^java.time.YearMonth G__35314] (jti/getter year ^java.time.YearMonth G__35314)))


(defn is-after ([^java.time.YearMonth G__35315 ^java.time.YearMonth G__35316] (.isAfter ^java.time.YearMonth G__35315 ^java.time.YearMonth G__35316)))


(defn to-string ^java.lang.String ([^java.time.YearMonth G__35317] (.toString ^java.time.YearMonth G__35317)))


(defn plus-months ^java.time.YearMonth ([^java.time.YearMonth G__35318 G__35319] (.plusMonths ^java.time.YearMonth G__35318 G__35319)))


(defn is-valid-day ([^java.time.YearMonth G__35320 G__35321] (.isValidDay ^java.time.YearMonth G__35320 G__35321)))


(defn equals ([^java.time.YearMonth G__35322 ^java.lang.Object G__35323] (.equals ^java.time.YearMonth G__35322 ^java.lang.Object G__35323)))


(defn get-month-value ([^java.time.YearMonth G__35324] (jti/getter monthValue ^java.time.YearMonth G__35324)))


(defn length-of-year ([^java.time.YearMonth G__35325] (.lengthOfYear ^java.time.YearMonth G__35325)))




(defn hash-code ([^java.time.YearMonth G__35326] (.hashCode ^java.time.YearMonth G__35326)))



(defn get-long ([^java.time.YearMonth G__35327 ^java.time.temporal.TemporalField G__35328] (jti/getter long ^java.time.YearMonth G__35327 ^java.time.temporal.TemporalField G__35328)))


(defn is-leap-year ([^java.time.YearMonth G__35329] (.isLeapYear ^java.time.YearMonth G__35329)))


(defn with ^java.time.temporal.Temporal ([^java.time.YearMonth G__35330 G__35331 G__35332] (.with ^java.time.YearMonth G__35330 G__35331 G__35332)) ([^java.time.YearMonth G__35333 G__35334] (.with ^java.time.YearMonth G__35333 G__35334)))


(defn from ^java.time.YearMonth ([^java.time.temporal.TemporalAccessor G__35336] (. java.time.YearMonth from ^java.time.temporal.TemporalAccessor G__35336)))


(defn parse ^java.time.YearMonth ([^java.lang.CharSequence G__35338] (. java.time.YearMonth parse ^java.lang.CharSequence G__35338)) ([^java.lang.CharSequence G__35340 ^java.time.format.DateTimeFormatter G__35341] (. java.time.YearMonth parse ^java.lang.CharSequence G__35340 ^java.time.format.DateTimeFormatter G__35341)))


(defn plus ^java.time.YearMonth ([^java.time.YearMonth G__35342 G__35343] (.plus ^java.time.YearMonth G__35342 G__35343)) ([^java.time.YearMonth G__35344 G__35345 G__35346] (.plus ^java.time.YearMonth G__35344 G__35345 G__35346)))


(defn with-year ^java.time.YearMonth ([^java.time.YearMonth G__35347 G__35348] (.withYear ^java.time.YearMonth G__35347 G__35348)))



(defn with-month ^java.time.YearMonth ([^java.time.YearMonth G__35349 G__35350] (.withMonth ^java.time.YearMonth G__35349 G__35350)))

