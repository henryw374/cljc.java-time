(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZonedDateTime]]))

(defn minus-minutes
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  (^js/JSJoda.Instant [^js/JSJoda.ZonedDateTime this]
   (.toInstant this)))

(defn plus-weeks
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn with-earlier-offset-at-overlap
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(defn get-hour
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hour this)))

(defn minus-hours
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" local-date-time zone))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate date ^js/JSJoda.LocalTime time ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" date time zone))
  (^js/JSJoda.ZonedDateTime
   [^int year ^int month ^int day-of-month ^int hour ^int minute ^int second ^int nano-of-second ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" year month day-of-month hour minute second nano-of-second zone)))

(defn with-month
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int month]
   (.withMonth this month)))

(defn is-equal
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isEqual this other)))

(defn get-nano
  (^int [^js/JSJoda.ZonedDateTime this]
   (.nano this)))

(defn of-local
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneId zone ^js/JSJoda.ZoneOffset preferred-offset]
   (js-invoke java.time.ZonedDateTime "ofLocal" local-date-time zone preferred-offset)))

(defn get-year
  (^int [^js/JSJoda.ZonedDateTime this]
   (.year this)))

(defn minus-seconds
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  (^int [^js/JSJoda.ZonedDateTime this]
   (.second this)))

(defn plus-nanos
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfYear this)))

(defn plus
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int hour]
   (.withHour this hour)))

(defn with-minute
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  (^java.lang.Object [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  (^js/JSJoda.DayOfWeek [^js/JSJoda.ZonedDateTime this]
   (.dayOfWeek this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.ZonedDateTime this]
   (.toString this)))

(defn plus-months
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isBefore this other)))

(defn minus-months
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn with-fixed-offset-zone
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(defn plus-hours
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(defn with-zone-same-local
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameLocal this zone)))

(defn with-zone-same-instant
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameInstant this zone)))

(defn plus-days
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  (^js/JSJoda.LocalTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalTime this)))

(defn get-long
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn get-offset
  (^js/JSJoda.ZoneOffset [^js/JSJoda.ZonedDateTime this]
   (.offset this)))

(defn with-year
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int year]
   (.withYear this year)))

(defn with-nano
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  (^long [^js/JSJoda.ZonedDateTime this]
   (.toEpochSecond this)))

(defn to-offset-date-time
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.ZonedDateTime this]
   (.toOffsetDateTime this)))

(defn with-later-offset-at-overlap
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(defn until
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn get-zone
  (^js/JSJoda.ZoneId [^js/JSJoda.ZonedDateTime this]
   (.zone this)))

(defn with-day-of-month
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfMonth this)))

(defn from
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.ZonedDateTime "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.ZonedDateTime this arg0]
   (.isSupported this arg0)))

(defn minus-years
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  (^js/JSJoda.Chronology [^js/JSJoda.ZonedDateTime this]
   (.chronology this)))

(defn parse
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.ZonedDateTime "parse" text))
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.ZonedDateTime "parse" text formatter)))

(defn with-second
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int second]
   (.withSecond this second)))

(defn to-local-date
  (^js/JSJoda.LocalDate [^js/JSJoda.ZonedDateTime this]
   (.toLocalDate this)))

(defn get-minute
  (^int [^js/JSJoda.ZonedDateTime this]
   (.minute this)))

(defn hash-code
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hashCode this)))

(defn with
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime []
   (js-invoke java.time.ZonedDateTime "now"))
  (^js/JSJoda.ZonedDateTime [arg0]
   (js-invoke java.time.ZonedDateTime "now" arg0)))

(defn to-local-date-time
  (^js/JSJoda.LocalDateTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  (^int [^js/JSJoda.ZonedDateTime this]
   (.monthValue this)))

(defn with-day-of-year
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.compareTo this other)))

(defn of-strict
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofStrict" local-date-time offset zone)))

(defn get-month
  (^js/JSJoda.Month [^js/JSJoda.ZonedDateTime this]
   (.month this)))

(defn of-instant
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" instant zone))
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" local-date-time offset zone)))

(defn plus-seconds
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.ZonedDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.minusDays this days)))
