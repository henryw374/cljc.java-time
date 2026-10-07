(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [ZonedDateTime]]))

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Instant [^js/JSJoda.ZonedDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn with-earlier-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hour this)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
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

(clojure.core/defn with-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.nano this)))

(clojure.core/defn of-local
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"])}
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneId zone ^js/JSJoda.ZoneOffset preferred-offset]
   (js-invoke java.time.ZonedDateTime "ofLocal" local-date-time zone preferred-offset)))

(clojure.core/defn get-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.year this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn get-day-of-week
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.ZonedDateTime this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.ZonedDateTime"])}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn with-fixed-offset-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn with-zone-same-local
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameLocal this zone)))

(clojure.core/defn with-zone-same-instant
  {:arglists '(["java.time.ZonedDateTime" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ZoneId zone]
   (.withZoneSameInstant this zone)))

(clojure.core/defn plus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-offset
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.ZonedDateTime this]
   (.offset this)))

(clojure.core/defn with-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists '(["java.time.ZonedDateTime"])}
  (^long [^js/JSJoda.ZonedDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn to-offset-date-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.ZonedDateTime this]
   (.toOffsetDateTime this)))

(clojure.core/defn with-later-offset-at-overlap
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(clojure.core/defn until
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.ZonedDateTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn get-zone
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.ZonedDateTime this]
   (.zone this)))

(clojure.core/defn with-day-of-month
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.ZonedDateTime "from" temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.ZonedDateTime this arg0)))

(clojure.core/defn minus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn get-chronology
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Chronology [^js/JSJoda.ZonedDateTime this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text]
   (js-invoke java.time.ZonedDateTime "parse" text))
  (^js/JSJoda.ZonedDateTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.ZonedDateTime "parse" text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int second]
   (.withSecond this second)))

(clojure.core/defn to-local-date
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.ZonedDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.hashCode this)))

(clojure.core/defn with
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime []
   (js-invoke java.time.ZonedDateTime "now"))
  (^js/JSJoda.ZonedDateTime [arg0]
   (js-invoke java.time.ZonedDateTime "now" arg0)))

(clojure.core/defn to-local-date-time
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.ZonedDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists '(["java.time.ZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists '(["java.time.ZonedDateTime" "int"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"])}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.ChronoZonedDateTime other]
   (.compareTo this other)))

(clojure.core/defn of-strict
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofStrict" local-date-time offset zone)))

(clojure.core/defn get-month
  {:arglists '(["java.time.ZonedDateTime"])}
  (^js/JSJoda.Month [^js/JSJoda.ZonedDateTime this]
   (.month this)))

(clojure.core/defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"]
               ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" instant zone))
  (^js/JSJoda.ZonedDateTime
   [^js/JSJoda.LocalDateTime local-date-time ^js/JSJoda.ZoneOffset offset ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.ZonedDateTime "ofInstant" local-date-time offset zone)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists '(["java.time.ZonedDateTime" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.ZonedDateTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.ZonedDateTime" "java.lang.Object"])}
  (^boolean [^js/JSJoda.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.ZonedDateTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists '(["java.time.ZonedDateTime" "long"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.ZonedDateTime this ^long days]
   (.minusDays this days)))
