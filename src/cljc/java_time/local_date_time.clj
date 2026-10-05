(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalDateTime]))

(def max java.time.LocalDateTime/MAX)

(def min java.time.LocalDateTime/MIN)

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.ChronoUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^java.time.Instant [^java.time.LocalDateTime this ^java.time.ZoneOffset arg0]
   (.toInstant this arg0)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.LocalDateTime this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long" "int" "java.time.ZoneOffset"]))}
  (^java.time.LocalDateTime [^long arg0 ^java.lang.Integer arg1 ^java.time.ZoneOffset arg2]
   (java.time.LocalDateTime/ofEpochSecond arg0 arg1 arg2)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getHour this)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^java.time.OffsetDateTime [^java.time.LocalDateTime this ^java.time.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"]
                     ["int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDate arg0 ^java.time.LocalTime arg1]
   (java.time.LocalDateTime/of arg0 arg1))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 ^"java.time.Month" arg1
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)
                                           arg5 (clojure.core/int arg5)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4 arg5))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 ^"java.time.Month" arg1
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)
                                           arg5 (clojure.core/int arg5)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4 arg5))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5)
                                        (clojure.core/instance? java.lang.Number arg6))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)
                                           arg5 (clojure.core/int arg5)
                                           arg6 (clojure.core/int arg6)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4 arg5 arg6))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5)
                                        (clojure.core/instance? java.lang.Number arg6))
                        (clojure.core/let [arg0 (clojure.core/int arg0)
                                           arg1 ^"java.time.Month" arg1
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)
                                           arg4 (clojure.core/int arg4)
                                           arg5 (clojure.core/int arg5)
                                           arg6 (clojure.core/int arg6)]
                          (java.time.LocalDateTime/of arg0 arg1 arg2 arg3 arg4 arg5 arg6))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getNano this)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getYear this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.LocalDateTime this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.time.DayOfWeek [^java.time.LocalDateTime this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.String [^java.time.LocalDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime this ^java.time.ZoneId arg0]
   (.atZone this arg0)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.time.LocalTime [^java.time.LocalDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withYear this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withNano this arg0)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^long [^java.time.LocalDateTime this ^java.time.ZoneOffset arg0]
   (.toEpochSecond this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.LocalDateTime [^java.time.temporal.TemporalAccessor arg0]
   (java.time.LocalDateTime/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.LocalDateTime this arg0))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.LocalDateTime this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.time.chrono.Chronology [^java.time.LocalDateTime this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.LocalDateTime [^java.lang.CharSequence arg0]
   (java.time.LocalDateTime/parse arg0))
  (^java.time.LocalDateTime [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.LocalDateTime/parse arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withSecond this arg0)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.time.LocalDate [^java.time.LocalDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.LocalDateTime this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.LocalDateTime []
   (java.time.LocalDateTime/now))
  (^java.time.LocalDateTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.LocalDateTime/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.LocalDateTime/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.time.Month [^java.time.LocalDateTime this]
   (.getMonth this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^java.time.LocalDateTime [^java.time.Instant arg0 ^java.time.ZoneId arg1]
   (java.time.LocalDateTime/ofInstant arg0 arg1)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.LocalDateTime this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long arg0]
   (.minusDays this arg0)))
