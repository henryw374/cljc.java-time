(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDateTime]]))

(def max (goog.object/get java.time.LocalDateTime "MAX"))

(def min (goog.object/get java.time.LocalDateTime "MIN"))

(defn minus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^js/JSJoda.Instant [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toInstant this offset)))

(defn plus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn of-epoch-second
  {:arglists '(["long" "int" "java.time.ZoneOffset"])}
  (^js/JSJoda.LocalDateTime [^long epoch-second ^int nano-of-second ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.LocalDateTime "ofEpochSecond" epoch-second nano-of-second offset)))

(defn get-hour
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.hour this)))

(defn at-offset
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
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
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.nano this)))

(defn get-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.year this)))

(defn minus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.second this)))

(defn plus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfYear this)))

(defn plus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.LocalDateTime"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDateTime this]
   (.dayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.String [^js/JSJoda.LocalDateTime this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-zone
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneId zone]
   (.atZone this zone)))

(defn plus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long hours]
   (.plusHours this hours)))

(defn plus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  {:arglists '(["java.time.LocalDateTime"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalDateTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int year]
   (.withYear this year)))

(defn with-nano
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.ZoneOffset offset]
   (.toEpochSecond this offset)))

(defn until
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn with-day-of-month
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.dayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDateTime "from" temporal)))

(defn is-after
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^boolean [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalDateTime this arg0)))

(defn minus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  {:arglists '(["java.time.LocalDateTime"])}
  (^js/JSJoda.Chronology [^js/JSJoda.LocalDateTime this]
   (.chronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDateTime "parse" text))
  (^js/JSJoda.LocalDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDateTime "parse" text formatter)))

(defn with-second
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int second]
   (.withSecond this second)))

(defn to-local-date
  {:arglists '(["java.time.LocalDateTime"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDateTime this]
   (.toLocalDate this)))

(defn get-minute
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.minute this)))

(defn hash-code
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDateTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"])}
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
  {:arglists '(["java.time.LocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this]
   (.monthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.ChronoLocalDateTime other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^js/JSJoda.Month [^js/JSJoda.LocalDateTime this]
   (.month this)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.LocalDateTime "ofInstant" instant zone)))

(defn plus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.LocalDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.LocalDateTime" "java.lang.Object"])}
  (^boolean [^js/JSJoda.LocalDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.LocalDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDateTime this ^long days]
   (.minusDays this days)))
