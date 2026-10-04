(ns cljc.java-time.zoned-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time ZonedDateTime]))

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.Instant [^java.time.ZonedDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn with-earlier-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withEarlierOffsetAtOverlap this)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getHour this)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"]
                     ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"]
                     ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of local-date-time zone))
  (^java.time.ZonedDateTime [^java.time.LocalDate date ^java.time.LocalTime time ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of date time zone))
  (^java.time.ZonedDateTime
   [^java.lang.Integer year ^java.lang.Integer month ^java.lang.Integer day-of-month ^java.lang.Integer hour
    ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/of year month day-of-month hour minute second nano-of-second zone)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getNano this)))

(clojure.core/defn of-local
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"]))}
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneId zone ^java.time.ZoneOffset preferred-offset]
   (java.time.ZonedDateTime/ofLocal local-date-time zone preferred-offset)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getYear this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.ZonedDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.DayOfWeek [^java.time.ZonedDateTime this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.String [^java.time.ZonedDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn with-fixed-offset-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withFixedOffsetZone this)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn with-zone-same-local
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameLocal this zone)))

(clojure.core/defn with-zone-same-instant
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.ZoneId zone]
   (.withZoneSameInstant this zone)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalTime [^java.time.ZonedDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-offset
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZoneOffset [^java.time.ZonedDateTime this]
   (.getOffset this)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^long [^java.time.ZonedDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn to-offset-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.OffsetDateTime [^java.time.ZonedDateTime this]
   (.toOffsetDateTime this)))

(clojure.core/defn with-later-offset-at-overlap
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this]
   (.withLaterOffsetAtOverlap this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.ZonedDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.ZoneId [^java.time.ZonedDateTime this]
   (.getZone this)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.ZonedDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.ZonedDateTime/from temporal)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.ZonedDateTime this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.ZonedDateTime this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.chrono.Chronology [^java.time.ZonedDateTime this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.ZonedDateTime [^java.lang.CharSequence text]
   (java.time.ZonedDateTime/parse text))
  (^java.time.ZonedDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.ZonedDateTime/parse text formatter)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(clojure.core/defn to-local-date
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalDate [^java.time.ZonedDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.hashCode this)))

(clojure.core/defn with
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.ZonedDateTime []
   (java.time.ZonedDateTime/now))
  (^java.time.ZonedDateTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.ZonedDateTime/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.ZonedDateTime/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn to-local-date-time
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.LocalDateTime [^java.time.ZonedDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.ZonedDateTime" "int"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.chrono.ChronoZonedDateTime other]
   (.compareTo this other)))

(clojure.core/defn of-strict
  {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofStrict local-date-time offset zone)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.ZonedDateTime"]))}
  (^java.time.Month [^java.time.ZonedDateTime this]
   (.getMonth this)))

(clojure.core/defn of-instant
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]
                     ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))}
  (^java.time.ZonedDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant instant zone))
  (^java.time.ZonedDateTime
   [^java.time.LocalDateTime local-date-time ^java.time.ZoneOffset offset ^java.time.ZoneId zone]
   (java.time.ZonedDateTime/ofInstant local-date-time offset zone)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.ZonedDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.ZonedDateTime" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.ZonedDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists (quote (["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.ZonedDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.ZonedDateTime" "long"]))}
  (^java.time.ZonedDateTime [^java.time.ZonedDateTime this ^long days]
   (.minusDays this days)))
