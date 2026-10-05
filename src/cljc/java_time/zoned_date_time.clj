(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZonedDateTime]))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.ChronoUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.Instant [^java.time.ZonedDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn with-earlier-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getHour this)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]
                     ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"]
                     ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime arg0 ^java.time.ZoneId arg1]
   (java.time.ZonedDateTime/of arg0 arg1))
  (^java.time.ZonedDateTime [^java.time.LocalDate arg0 ^java.time.LocalTime arg1 ^java.time.ZoneId arg2]
   (java.time.ZonedDateTime/of arg0 arg1 arg2))
  (^java.time.ZonedDateTime
   [^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2 ^java.lang.Integer arg3
    ^java.lang.Integer arg4 ^java.lang.Integer arg5 ^java.lang.Integer arg6 ^java.time.ZoneId arg7]
   (java.time.ZonedDateTime/of arg0 arg1 arg2 arg3 arg4 arg5 arg6 arg7)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getNano this)))

(clojure.core/defn of-local
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"]))}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime arg0 ^java.time.ZoneId arg1 ^java.time.ZoneOffset arg2]
   (java.time.ZonedDateTime/ofLocal arg0 arg1 arg2)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getYear this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.ZonedDateTime this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.DayOfWeek [^java.time.ZonedDateTime this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.String [^java.time.ZonedDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn with-fixed-offset-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn with-zone-same-local
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId arg0]
   (.withZoneSameLocal this arg0)))

(clojure.core/defn with-zone-same-instant
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId arg0]
   (.withZoneSameInstant this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalTime [^java.time.ZonedDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-offset
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZoneOffset [^java.time.ZonedDateTime this]
   (.getOffset this)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withYear this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withNano this arg0)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^long [^java.time.ZonedDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn to-offset-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.OffsetDateTime [^java.time.ZonedDateTime this]
   (.toOffsetDateTime this)))

(clojure.core/defn with-later-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZoneId [^java.time.ZonedDateTime this]
   (.getZone this)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.ZonedDateTime [^java.time.temporal.TemporalAccessor arg0]
   (java.time.ZonedDateTime/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.ZonedDateTime this arg0))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.ZonedDateTime this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.chrono.Chronology [^java.time.ZonedDateTime this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.ZonedDateTime [^java.lang.CharSequence arg0]
   (java.time.ZonedDateTime/parse arg0))
  (^java.time.ZonedDateTime [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.ZonedDateTime/parse arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withSecond this arg0)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalDate [^java.time.ZonedDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.hashCode this)))

(clojure.core/defn with
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.ZonedDateTime []
   (java.time.ZonedDateTime/now))
  (^java.time.ZonedDateTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.ZonedDateTime/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.ZonedDateTime/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn to-local-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalDateTime [^java.time.ZonedDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn of-strict
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime arg0 ^java.time.ZoneOffset arg1 ^java.time.ZoneId arg2]
   (java.time.ZonedDateTime/ofStrict arg0 arg1 arg2)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.Month [^java.time.ZonedDateTime this]
   (.getMonth this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]
                     ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.Instant arg0 ^java.time.ZoneId arg1]
   (java.time.ZonedDateTime/ofInstant arg0 arg1))
  (^java.time.ZonedDateTime [^java.time.LocalDateTime arg0 ^java.time.ZoneOffset arg1 ^java.time.ZoneId arg2]
   (java.time.ZonedDateTime/ofInstant arg0 arg1 arg2)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZonedDateTime" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.ZonedDateTime this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long arg0]
   (.minusDays this arg0)))
