(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDateTime]]))

(def max (goog.object/get java.time.LocalDateTime "MAX"))

(def min (goog.object/get java.time.LocalDateTime "MIN"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.Instant [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset arg0]
   (.toInstant this arg0)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long" "int" "java.time.ZoneOffset"]))}
  (^js/JSJoda.LocalDateTime [^long arg0 ^int arg1 ^js/JSJoda.ZoneOffset arg2]
   (js-invoke java.time.LocalDateTime "ofEpochSecond" arg0 arg1 arg2)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.hour this)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"]
                     ["int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate arg0 ^js/JSJoda.LocalTime arg1]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5 arg6)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.nano this)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.year this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDateTime this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^java.lang.String [^js/JSJoda.LocalDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneId arg0]
   (.atZone this arg0)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withYear this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withNano this arg0)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset arg0]
   (.toEpochSecond this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.LocalDateTime "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.Chronology [^js/JSJoda.LocalDateTime this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence arg0]
   (js-invoke java.time.LocalDateTime "parse" arg0))
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.LocalDateTime "parse" arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withSecond this arg0)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.LocalDateTime []
   (js-invoke java.time.LocalDateTime "now"))
  (^js/JSJoda.LocalDateTime [arg0]
   (js-invoke java.time.LocalDateTime "now" arg0)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.Month [^js/JSJoda.LocalDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.Instant arg0 ^js/JSJoda.ZoneId arg1]
   (js-invoke java.time.LocalDateTime "ofInstant" arg0 arg1)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.LocalDateTime this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long arg0]
   (.minusDays this arg0)))
