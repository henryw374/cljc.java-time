(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDateTime]]))

(def max (goog.object/get java.time.LocalDateTime "MAX"))

(def min (goog.object/get java.time.LocalDateTime "MIN"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.Instant [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toInstant this offset)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long" "int" "java.time.ZoneOffset"]))}
  (^js/JSJoda.LocalDateTime [^long epoch-second ^int nano-of-second ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.LocalDateTime "ofEpochSecond" epoch-second nano-of-second offset)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.hour this)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"]
                     ["int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int"]
                     ["int" "int" "int" "int" "int" "int" "int"]
                     ["int" "java.time.Month" "int" "int" "int" "int" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate date ^js/JSJoda.LocalTime time]
   (js-invoke java.time.LocalDateTime "of" date time))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5 arg6)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isEqual this other)))

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
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

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
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneId zone]
   (.atZone this zone)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toEpochSecond this offset)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDateTime "from" temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.Chronology [^js/JSJoda.LocalDateTime this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDateTime "parse" text))
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDateTime "parse" text formatter)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.LocalDateTime" "int"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int second]
   (.withSecond this second)))

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
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

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
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.LocalDateTime"]))}
  (^js/JSJoda.Month [^js/JSJoda.LocalDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.LocalDateTime "ofInstant" instant zone)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.LocalDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.LocalDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.LocalDateTime" "long"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.minusDays this days)))
