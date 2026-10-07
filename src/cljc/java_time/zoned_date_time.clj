(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time ZonedDateTime)))

(defn minus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.Instant [^java.time.ZonedDateTime this]
   (.toInstant this)))

(defn plus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn with-earlier-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(defn get-hour
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getHour this)))

(defn minus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId"]
               ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"]
               ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of local-date-time zone))
  (^java.time.ZonedDateTime [^java.time.LocalDate date ^java.time.LocalTime time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of date time zone))
  (^java.time.ZonedDateTime
   [^java.lang.Integer year ^java.lang.Integer month ^java.lang.Integer day-of-month ^java.lang.Integer hour
    ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of year month day-of-month hour minute second nano-of-second zone)))

(defn with-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getNano this)))

(defn of-local
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"])}
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone ^java.time.ZoneOffset preferred-offset]
   (java.time.ZonedDateTime/ofLocal local-date-time zone preferred-offset)))

(defn get-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getYear this)))

(defn minus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getSecond this)))

(defn plus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfYear this)))

(defn plus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.ZonedDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.DayOfWeek [^java.time.ZonedDateTime this]
   (.getDayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.String [^java.time.ZonedDateTime this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn with-fixed-offset-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(defn plus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(defn with-zone-same-local
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameLocal this zone)))

(defn with-zone-same-instant
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameInstant this zone)))

(defn plus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.LocalTime [^java.time.ZonedDateTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-offset
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.ZoneOffset [^java.time.ZonedDateTime this]
   (.getOffset this)))

(defn with-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(defn with-nano
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^long [^java.time.ZonedDateTime this]
   (.toEpochSecond this)))

(defn to-offset-date-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.OffsetDateTime [^java.time.ZonedDateTime this]
   (.toOffsetDateTime this)))

(defn with-later-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(defn until
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn get-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.ZoneId [^java.time.ZonedDateTime this]
   (.getZone this)))

(defn with-day-of-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.ZonedDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZonedDateTime/from temporal)))

(defn is-after
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (cond (and (instance? java.time.temporal.TemporalField arg0)) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                                   (.isSupported ^java.time.ZonedDateTime this field))
         (and (instance? java.time.temporal.ChronoUnit arg0)) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                                (.isSupported ^java.time.ZonedDateTime this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.chrono.Chronology [^java.time.ZonedDateTime this]
   (.getChronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.ZonedDateTime [^java.lang.CharSequence text]
   (java.time.ZonedDateTime/parse text))
  (^java.time.ZonedDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.ZonedDateTime/parse text formatter)))

(defn with-second
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn to-local-date
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.LocalDate [^java.time.ZonedDateTime this]
   (.toLocalDate this)))

(defn get-minute
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMinute this)))

(defn hash-code
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.hashCode this)))

(defn with
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.ZonedDateTime []
   (java.time.ZonedDateTime/now))
  (^java.time.ZonedDateTime [arg0]
   (cond (and (instance? java.time.Clock arg0)) (let [clock ^"java.time.Clock" arg0]
                                                  (java.time.ZonedDateTime/now clock))
         (and (instance? java.time.ZoneId arg0)) (let [zone ^"java.time.ZoneId" arg0]
                                                   (java.time.ZonedDateTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn to-local-date-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.LocalDateTime [^java.time.ZonedDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMonthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.compareTo this other)))

(defn of-strict
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofStrict local-date-time offset zone)))

(defn get-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.time.Month [^java.time.ZonedDateTime this]
   (.getMonth this)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"]
               ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant instant zone))
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant local-date-time offset zone)))

(defn plus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.ZonedDateTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.ZonedDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.minusDays this days)))
