(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZonedDateTime]]))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.Instant [^js/JSJoda.ZonedDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn with-earlier-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hour this)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]
                     ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"]
                     ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime arg0 ^js/JSJoda.ZoneId arg1]
   (js-invoke java.time.ZonedDateTime "of" arg0 arg1))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate arg0 ^js/JSJoda.LocalTime arg1 ^js/JSJoda.ZoneId arg2]
   (js-invoke java.time.ZonedDateTime "of" arg0 arg1 arg2))
  (^js/JSJoda.ZonedDateTime
   [^int arg0 ^int arg1 ^int arg2 ^int arg3 ^int arg4 ^int arg5 ^int arg6 ^js/JSJoda.ZoneId arg7]
   (js-invoke java.time.ZonedDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5 arg6 arg7)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.nano this)))

(clojure.core/defn of-local
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime arg0 ^js/JSJoda.ZoneId arg1 ^js/JSJoda.ZoneOffset arg2]
   (js-invoke java.time.ZonedDateTime "ofLocal" arg0 arg1 arg2)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.year this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.ZonedDateTime this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn with-fixed-offset-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn with-zone-same-local
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId arg0]
   (.withZoneSameLocal this arg0)))

(clojure.core/defn with-zone-same-instant
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId arg0]
   (.withZoneSameInstant this arg0)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn get-offset
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.ZonedDateTime this]
   (.offset this)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withYear this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withNano this arg0)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^long [^js/JSJoda.ZonedDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn to-offset-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.ZonedDateTime this]
   (.toOffsetDateTime this)))

(clojure.core/defn with-later-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZonedDateTime this]
   (.zone this)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.ZonedDateTime "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.ZonedDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.Chronology [^js/JSJoda.ZonedDateTime this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence arg0]
   (js-invoke java.time.ZonedDateTime "parse" arg0))
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.ZonedDateTime "parse" arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withSecond this arg0)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.ZonedDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hashCode this)))

(clojure.core/defn with
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime []
   (js-invoke java.time.ZonedDateTime "now"))
  (^js/JSJoda.ZonedDateTime [arg0]
   (js-invoke java.time.ZonedDateTime "now" arg0)))

(clojure.core/defn to-local-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn of-strict
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime arg0 ^js/JSJoda.ZoneOffset arg1 ^js/JSJoda.ZoneId arg2]
   (js-invoke java.time.ZonedDateTime "ofStrict" arg0 arg1 arg2)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^js/JSJoda.Month [^js/JSJoda.ZonedDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]
                     ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant arg0 ^js/JSJoda.ZoneId arg1]
   (js-invoke java.time.ZonedDateTime "ofInstant" arg0 arg1))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime arg0 ^js/JSJoda.ZoneOffset arg1 ^js/JSJoda.ZoneId arg2]
   (js-invoke java.time.ZonedDateTime "ofInstant" arg0 arg1 arg2)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZonedDateTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.ZonedDateTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long arg0]
   (.minusDays this arg0)))
