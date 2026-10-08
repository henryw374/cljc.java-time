(ns cljc.java-time.offset-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time OffsetDateTime)))

(def min java.time.OffsetDateTime/MIN)

(def max java.time.OffsetDateTime/MAX)

(defn minus-minutes
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  (^java.time.Instant [^java.time.OffsetDateTime this]
   (.toInstant this)))

(defn plus-weeks
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-hour
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getHour this)))

(defn at-zone-same-instant
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSameInstant this zone)))

(defn minus-hours
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  (^java.time.OffsetDateTime [^java.time.LocalDateTime date-time ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of date-time offset))
  (^java.time.OffsetDateTime [^java.time.LocalDate date ^java.time.LocalTime time ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of date time offset))
  (^java.time.OffsetDateTime
   [^java.lang.Integer year ^java.lang.Integer month ^java.lang.Integer day-of-month ^java.lang.Integer hour
    ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of year month day-of-month hour minute second nano-of-second offset)))

(defn with-month
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isEqual this other)))

(defn get-nano
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getNano this)))

(defn to-offset-time
  (^java.time.OffsetTime [^java.time.OffsetDateTime this]
   (.toOffsetTime this)))

(defn at-zone-similar-local
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSimilarLocal this zone)))

(defn get-year
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getYear this)))

(defn minus-seconds
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getSecond this)))

(defn plus-nanos
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfYear this)))

(defn plus
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn time-line-order
  (^java.util.Comparator []
   (java.time.OffsetDateTime/timeLineOrder)))

(defn with-hour
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  (^java.lang.Object [^java.time.OffsetDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn with-offset-same-instant
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(defn get-day-of-week
  (^java.time.DayOfWeek [^java.time.OffsetDateTime this]
   (.getDayOfWeek this)))

(defn to-string
  (^java.lang.String [^java.time.OffsetDateTime this]
   (.toString this)))

(defn plus-months
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isBefore this other)))

(defn minus-months
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.OffsetDateTime
   [^java.time.OffsetDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.plusHours this hours)))

(defn plus-days
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  (^java.time.LocalTime [^java.time.OffsetDateTime this]
   (.toLocalTime this)))

(defn get-long
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-offset
  (^java.time.ZoneOffset [^java.time.OffsetDateTime this]
   (.getOffset this)))

(defn to-zoned-date-time
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this]
   (.toZonedDateTime this)))

(defn with-year
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(defn with-nano
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  (^long [^java.time.OffsetDateTime this]
   (.toEpochSecond this)))

(defn until
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn with-offset-same-local
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(defn with-day-of-month
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfMonth this)))

(defn from
  (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.OffsetDateTime/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.minusYears this years)))

(defn parse
  (^java.time.OffsetDateTime [^java.lang.CharSequence text]
   (java.time.OffsetDateTime/parse text))
  (^java.time.OffsetDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.OffsetDateTime/parse text formatter)))

(defn with-second
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn to-local-date
  (^java.time.LocalDate [^java.time.OffsetDateTime this]
   (.toLocalDate this)))

(defn get-minute
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMinute this)))

(defn hash-code
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.OffsetDateTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.OffsetDateTime []
   (java.time.OffsetDateTime/now))
  (^java.time.OffsetDateTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.OffsetDateTime/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.OffsetDateTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn to-local-date-time
  (^java.time.LocalDateTime [^java.time.OffsetDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMonthValue this)))

(defn with-day-of-year
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.compareTo this other)))

(defn get-month
  (^java.time.Month [^java.time.OffsetDateTime this]
   (.getMonth this)))

(defn of-instant
  (^java.time.OffsetDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.OffsetDateTime/ofInstant instant zone)))

(defn plus-seconds
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.OffsetDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.minusDays this days)))
