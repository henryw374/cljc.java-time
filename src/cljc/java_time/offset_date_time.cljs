(ns cljc.java-time.offset-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [OffsetDateTime]]))

(def min (goog.object/get java.time.OffsetDateTime "MIN"))

(def max (goog.object/get java.time.OffsetDateTime "MAX"))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.Instant [^js/JSJoda.OffsetDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.hour this)))

(clojure.core/defn at-zone-same-instant
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneId zone]
   (.atZoneSameInstant this zone)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]
                     ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]
                     ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime date-time ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.OffsetDateTime "of" date-time offset))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDate date ^js/JSJoda.LocalTime time ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.OffsetDateTime "of" date time offset))
  (^js/JSJoda.OffsetDateTime
   [^int year ^int month ^int day-of-month ^int hour ^int minute ^int second ^int nano-of-second
    ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.OffsetDateTime "of" year month day-of-month hour minute second nano-of-second offset)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime other]
   (.isEqual this other)))

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
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneId zone]
   (.atZoneSimilarLocal this zone)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.year this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn time-line-order
  {:arglists (quote ([]))}
  (^java.util.Comparator []
   (js-invoke java.time.OffsetDateTime "timeLineOrder")))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn with-offset-same-instant
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

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
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.LocalTime [^js/JSJoda.OffsetDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

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
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^long [^js/JSJoda.OffsetDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.OffsetDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-offset-same-local
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.OffsetDateTime "from" temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.OffsetDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.OffsetDateTime "parse" text))
  (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.OffsetDateTime "parse" text formatter)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.OffsetDateTime" "int"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int second]
   (.withSecond this second)))

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
  (^js/JSJoda.Temporal [^js/JSJoda.OffsetDateTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

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
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))}
  (^int [^js/JSJoda.OffsetDateTime this ^js/JSJoda.OffsetDateTime other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.OffsetDateTime"]))}
  (^js/JSJoda.Month [^js/JSJoda.OffsetDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.OffsetDateTime "ofInstant" instant zone)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.OffsetDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.OffsetDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.OffsetDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.OffsetDateTime" "long"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this ^long days]
   (.minusDays this days)))
