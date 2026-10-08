(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDateTime]]))

(def max (goog.object/get java.time.LocalDateTime "MAX"))

(def min (goog.object/get java.time.LocalDateTime "MIN"))

(defn minus-minutes
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  (^js/JSJoda.Instant [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toInstant this offset)))

(defn plus-weeks
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of-epoch-second
  (^js/JSJoda.LocalDateTime [^long epoch-second ^int nano-of-second ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.LocalDateTime "ofEpochSecond" epoch-second nano-of-second offset)))

(defn get-hour
  (^int [^js/JSJoda.LocalDateTime this]
   (.hour this)))

(defn at-offset
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int"]
               ["int" "int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int" "int"]
               ["int" "int" "int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int" "int" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate date ^js/JSJoda.LocalTime time]
   (js-invoke java.time.LocalDateTime "of" date time))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5))
  (^js/JSJoda.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (js-invoke java.time.LocalDateTime "of" arg0 arg1 arg2 arg3 arg4 arg5 arg6)))

(defn with-month
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int month]
   (.withMonth this month)))

(defn is-equal
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isEqual this other)))

(defn get-nano
  (^int [^js/JSJoda.LocalDateTime this]
   (.nano this)))

(defn get-year
  (^int [^js/JSJoda.LocalDateTime this]
   (.year this)))

(defn minus-seconds
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  (^int [^js/JSJoda.LocalDateTime this]
   (.second this)))

(defn plus-nanos
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfYear this)))

(defn plus
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int hour]
   (.withHour this hour)))

(defn with-minute
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  (^java.lang.Object [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDateTime this]
   (.dayOfWeek this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.LocalDateTime this]
   (.toString this)))

(defn plus-months
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isBefore this other)))

(defn minus-months
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-zone
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneId zone]
   (.atZone this zone)))

(defn plus-hours
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long hours]
   (.plusHours this hours)))

(defn plus-days
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalDateTime this]
   (.toLocalTime this)))

(defn get-long
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int year]
   (.withYear this year)))

(defn with-nano
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toEpochSecond this offset)))

(defn until
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn with-day-of-month
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfMonth this)))

(defn from
  (^js/JSJoda.LocalDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDateTime "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.LocalDateTime this arg0]
   (.isSupported this arg0)))

(defn minus-years
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  (^js/JSJoda.Chronology [^js/JSJoda.LocalDateTime this]
   (.chronology this)))

(defn parse
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDateTime "parse" text))
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDateTime "parse" text formatter)))

(defn with-second
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int second]
   (.withSecond this second)))

(defn to-local-date
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDateTime this]
   (.toLocalDate this)))

(defn get-minute
  (^int [^js/JSJoda.LocalDateTime this]
   (.minute this)))

(defn hash-code
  (^int [^js/JSJoda.LocalDateTime this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.LocalDateTime []
   (js-invoke java.time.LocalDateTime "now"))
  (^js/JSJoda.LocalDateTime [arg0]
   (js-invoke java.time.LocalDateTime "now" arg0)))

(defn get-month-value
  (^int [^js/JSJoda.LocalDateTime this]
   (.monthValue this)))

(defn with-day-of-year
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.compareTo this other)))

(defn get-month
  (^js/JSJoda.Month [^js/JSJoda.LocalDateTime this]
   (.month this)))

(defn of-instant
  (^js/JSJoda.LocalDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.LocalDateTime "ofInstant" instant zone)))

(defn plus-seconds
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.LocalDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.LocalDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.minusDays this days)))
