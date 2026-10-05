(ns cljc.java-time.offset-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [OffsetDateTime]]))

(def min (goog.object/get java.time.OffsetDateTime "MIN"))

(def max (goog.object/get java.time.OffsetDateTime "MAX"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.Instant [^js/JSJoda.OffsetDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.hour this)))

(clojure.core/defn at-zone-same-instant
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneId arg0]
   (.atZoneSameInstant this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]
                     ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]
                     ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime arg0 ^js/JSJoda.ZoneOffset arg1]
   (js-invoke java.time.OffsetDateTime "of" arg0 arg1))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDate arg0 ^js/JSJoda.LocalTime arg1 ^js/JSJoda.ZoneOffset arg2]
   (js-invoke java.time.OffsetDateTime "of" arg0 arg1 arg2))
  (^js/JSJoda.OffsetDateTime
   [^int arg0 ^int arg1 ^int arg2 ^int arg3 ^int arg4 ^int arg5 ^int arg6 ^js/JSJoda.ZoneOffset arg7]
   (js-invoke java.time.OffsetDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5 arg6 arg7)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.nano this)))

(clojure.core/defn to-offset-time
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetDateTime this]
   (.toOffsetTime this)))

(clojure.core/defn at-zone-similar-local
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneId arg0]
   (.atZoneSimilarLocal this arg0)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.year this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn time-line-order
  {:arglists (quote ([]))}
  (^java.util.Comparator []
   (js-invoke java.time.OffsetDateTime "timeLineOrder")))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn with-offset-same-instant
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneOffset arg0]
   (.withOffsetSameInstant this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.OffsetDateTime this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^java.lang.String [^js/JSJoda.OffsetDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.OffsetDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-offset
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.OffsetDateTime this]
   (.offset this)))

(clojure.core/defn to-zoned-date-time
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this]
   (.toZonedDateTime this)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withYear this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withNano this arg0)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^long [^js/JSJoda.OffsetDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.OffsetDateTime this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn with-offset-same-local
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneOffset arg0]
   (.withOffsetSameLocal this arg0)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.OffsetDateTime "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.OffsetDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence arg0]
   (js-invoke java.time.OffsetDateTime "parse" arg0))
  (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.OffsetDateTime "parse" arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withSecond this arg0)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.OffsetDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.OffsetDateTime this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.OffsetDateTime []
   (js-invoke java.time.OffsetDateTime "now"))
  (^js/JSJoda.OffsetDateTime [arg0]
   (js-invoke java.time.OffsetDateTime "now" arg0)))

(clojure.core/defn to-local-date-time
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.OffsetDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.Month [^js/JSJoda.OffsetDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant arg0 ^js/JSJoda.ZoneId arg1]
   (js-invoke java.time.OffsetDateTime "ofInstant" arg0 arg1)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.OffsetDateTime this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long arg0]
   (.minusDays this arg0)))
