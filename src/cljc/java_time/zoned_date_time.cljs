(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZonedDateTime]]))

(defn minus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Instant [^js/JSJoda.ZonedDateTime this]
   (.toInstant this)))

(defn plus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn with-earlier-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(defn get-hour
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hour this)))

(defn minus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId"]
               ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"]
               ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" local-date-time zone))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate date ^js/JSJoda.LocalTime time ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" date time zone))
  (^js/JSJoda.ZonedDateTime
   [^int year ^int month ^int day-of-month ^int hour ^int minute ^int second ^int nano-of-second ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "of" year month day-of-month hour minute second nano-of-second zone)))

(defn with-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.nano this)))

(defn of-local
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"])}
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneId zone ^js/JSJoda.ZoneOffset preferred-offset]
   (js-invoke java.time.ZonedDateTime "ofLocal" local-date-time zone preferred-offset)))

(defn get-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.year this)))

(defn minus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.second this)))

(defn plus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfYear this)))

(defn plus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.ZonedDateTime this]
   (.dayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn with-fixed-offset-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(defn plus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(defn with-zone-same-local
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameLocal this zone)))

(defn with-zone-same-instant
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameInstant this zone)))

(defn plus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn get-offset
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.ZonedDateTime this]
   (.offset this)))

(defn with-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int year]
   (.withYear this year)))

(defn with-nano
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^long [^js/JSJoda.ZonedDateTime this]
   (.toEpochSecond this)))

(defn to-offset-date-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.ZonedDateTime this]
   (.toOffsetDateTime this)))

(defn with-later-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(defn until
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn get-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZonedDateTime this]
   (.zone this)))

(defn with-day-of-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.ZonedDateTime "from" temporal)))

(defn is-after
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.ZonedDateTime this arg0]
   (.isSupported this arg0)))

(defn minus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Chronology [^js/JSJoda.ZonedDateTime this]
   (.chronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.ZonedDateTime "parse" text))
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.ZonedDateTime "parse" text formatter)))

(defn with-second
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int second]
   (.withSecond this second)))

(defn to-local-date
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.ZonedDateTime this]
   (.toLocalDate this)))

(defn get-minute
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.minute this)))

(defn hash-code
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hashCode this)))

(defn with
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"])}
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
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.monthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.compareTo this other)))

(defn of-strict
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofStrict" local-date-time offset zone)))

(defn get-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Month [^js/JSJoda.ZonedDateTime this]
   (.month this)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"]
               ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" instant zone))
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" local-date-time offset zone)))

(defn plus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.ZonedDateTime" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.minusDays this days)))
