(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalDate]))

(def max java.time.LocalDate/MAX)

(def min java.time.LocalDate/MIN)

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn length-of-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.LocalDate this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-era
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.time.chrono.Era [^java.time.LocalDate this]
   (.getEra this)))

(clojure.core/defn of
  {:arglists (quote (["int" "int" "int"] ["int" "java.time.Month" "int"]))}
  (^java.time.LocalDate [arg0 arg1 arg2]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)]
                          (java.time.LocalDate/of arg0 arg1 arg2))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 ^"java.time.Month" arg1
                                           arg2 (clojure.core/int arg2)]
                          (java.time.LocalDate/of arg0 arg1 arg2))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getYear this)))

(clojure.core/defn to-epoch-day
  {:arglists (quote (["java.time.LocalDate"]))}
  (^long [^java.time.LocalDate this]
   (.toEpochDay this)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-leap-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Boolean [^java.time.LocalDate this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.LocalDate this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.time.DayOfWeek [^java.time.LocalDate this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.String [^java.time.LocalDate this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.LocalDate this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer arg0]
   (.withYear this arg0)))

(clojure.core/defn length-of-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]
                     ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Period [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate arg0]
   (.until this arg0))
  (^long [^java.time.LocalDate this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn of-epoch-day
  {:arglists (quote (["long"]))}
  (^java.time.LocalDate [^long arg0]
   (java.time.LocalDate/ofEpochDay arg0)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.LocalDate [^java.time.temporal.TemporalAccessor arg0]
   (java.time.LocalDate/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]
                     ["java.time.LocalDate" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.LocalDate this arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.LocalDate this arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.time.chrono.IsoChronology [^java.time.LocalDate this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.LocalDate [^java.lang.CharSequence arg0]
   (java.time.LocalDate/parse arg0))
  (^java.time.LocalDate [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.LocalDate/parse arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.LocalDate this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.LocalDate []
   (java.time.LocalDate/now))
  (^java.time.LocalDate [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.LocalDate/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.LocalDate/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn at-start-of-day
  {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"]))}
  (^java.time.LocalDateTime [^java.time.LocalDate this]
   (.atStartOfDay this))
  (^java.time.ZonedDateTime [^java.time.LocalDate this ^java.time.ZoneId arg0]
   (.atStartOfDay this arg0)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.time.Month [^java.time.LocalDate this]
   (.getMonth this)))

(clojure.core/defn of-year-day
  {:arglists (quote (["int" "int"]))}
  (^java.time.LocalDate [^java.lang.Integer arg0 ^java.lang.Integer arg1]
   (java.time.LocalDate/ofYearDay arg0 arg1)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalDate" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn at-time
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"]
                     ["java.time.LocalDate" "java.time.OffsetTime"]
                     ["java.time.LocalDate" "int" "int"]
                     ["java.time.LocalDate" "int" "int" "int"]
                     ["java.time.LocalDate" "int" "int" "int" "int"]))}
  (^java.lang.Object [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.LocalTime arg0))
                        (clojure.core/let [arg0 ^"java.time.LocalTime" arg0] (.atTime ^java.time.LocalDate this arg0))
                      (clojure.core/and (clojure.core/instance? java.time.OffsetTime arg0))
                        (clojure.core/let [arg0 ^"java.time.OffsetTime" arg0] (.atTime ^java.time.LocalDate this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [^java.time.LocalDate this ^java.lang.Integer arg0 ^java.lang.Integer arg1]
   (.atTime this arg0 arg1))
  (^java.time.LocalDateTime
   [^java.time.LocalDate this ^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2]
   (.atTime this arg0 arg1 arg2))
  (^java.time.LocalDateTime
   [^java.time.LocalDate this ^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2
    ^java.lang.Integer arg3]
   (.atTime this arg0 arg1 arg2 arg3)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalDate" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.LocalDate this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^java.time.LocalDate [^java.time.LocalDate this ^long arg0]
   (.minusDays this arg0)))
