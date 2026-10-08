(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time ZonedDateTime)))

(defn minus-minutes
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  (^java.time.Instant [^java.time.ZonedDateTime this]
   (.toInstant this)))

(defn plus-weeks
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn with-earlier-offset-at-overlap
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(defn get-hour
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getHour this)))

(defn minus-hours
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  (^java.time.ZonedDateTime [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of local-date-time zone))
  (^java.time.ZonedDateTime [^java.time.LocalDate date ^java.time.LocalTime time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of date time zone))
  (^java.time.ZonedDateTime
   [^java.lang.Integer year ^java.lang.Integer month ^java.lang.Integer day-of-month ^java.lang.Integer hour
    ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of year month day-of-month hour minute second nano-of-second zone)))

(defn with-month
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isEqual this other)))

(defn get-nano
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getNano this)))

(defn of-local
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone ^java.time.ZoneOffset preferred-offset]
   (java.time.ZonedDateTime/ofLocal local-date-time zone preferred-offset)))

(defn get-year
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getYear this)))

(defn minus-seconds
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getSecond this)))

(defn plus-nanos
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfYear this)))

(defn plus
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  (^java.lang.Object [^java.time.ZonedDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  (^java.time.DayOfWeek [^java.time.ZonedDateTime this]
   (.getDayOfWeek this)))

(defn to-string
  (^java.lang.String [^java.time.ZonedDateTime this]
   (.toString this)))

(defn plus-months
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isBefore this other)))

(defn minus-months
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn with-fixed-offset-zone
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(defn plus-hours
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(defn with-zone-same-local
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameLocal this zone)))

(defn with-zone-same-instant
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameInstant this zone)))

(defn plus-days
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  (^java.time.LocalTime [^java.time.ZonedDateTime this]
   (.toLocalTime this)))

(defn get-long
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-offset
  (^java.time.ZoneOffset [^java.time.ZonedDateTime this]
   (.getOffset this)))

(defn with-year
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(defn with-nano
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  (^long [^java.time.ZonedDateTime this]
   (.toEpochSecond this)))

(defn to-offset-date-time
  (^java.time.OffsetDateTime [^java.time.ZonedDateTime this]
   (.toOffsetDateTime this)))

(defn with-later-offset-at-overlap
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(defn until
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn get-zone
  (^java.time.ZoneId [^java.time.ZonedDateTime this]
   (.getZone this)))

(defn with-day-of-month
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfMonth this)))

(defn from
  (^java.time.ZonedDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZonedDateTime/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.ZonedDateTime this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  (^java.time.chrono.Chronology [^java.time.ZonedDateTime this]
   (.getChronology this)))

(defn parse
  (^java.time.ZonedDateTime [^java.lang.CharSequence text]
   (java.time.ZonedDateTime/parse text))
  (^java.time.ZonedDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.ZonedDateTime/parse text formatter)))

(defn with-second
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn to-local-date
  (^java.time.LocalDate [^java.time.ZonedDateTime this]
   (.toLocalDate this)))

(defn get-minute
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMinute this)))

(defn hash-code
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.hashCode this)))

(defn with
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.ZonedDateTime []
   (java.time.ZonedDateTime/now))
  (^java.time.ZonedDateTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.ZonedDateTime/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.ZonedDateTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn to-local-date-time
  (^java.time.LocalDateTime [^java.time.ZonedDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMonthValue this)))

(defn with-day-of-year
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.compareTo this other)))

(defn of-strict
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofStrict local-date-time offset zone)))

(defn get-month
  (^java.time.Month [^java.time.ZonedDateTime this]
   (.getMonth this)))

(defn of-instant
  (^java.time.ZonedDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant instant zone))
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant local-date-time offset zone)))

(defn plus-seconds
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.ZonedDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.minusDays this days)))
