(ns cljc.java-time.offset-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time OffsetDateTime)))

(def min java.time.OffsetDateTime/MIN)

(def max java.time.OffsetDateTime/MAX)

(defn minus-minutes
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.Instant [^java.time.OffsetDateTime this]
   (.toInstant this)))

(defn plus-weeks
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-hour
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getHour this)))

(defn at-zone-same-instant
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSameInstant this zone)))

(defn minus-hours
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"]
               ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]
               ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.LocalDateTime date-time ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of date-time offset))
  (^java.time.OffsetDateTime [^java.time.LocalDate date ^java.time.LocalTime time ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of date time offset))
  (^java.time.OffsetDateTime
   [^java.lang.Integer year ^java.lang.Integer month ^java.lang.Integer day-of-month ^java.lang.Integer hour
    ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second ^java.time.ZoneOffset offset]
   (java.time.OffsetDateTime/of year month day-of-month hour minute second nano-of-second offset)))

(defn with-month
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getNano this)))

(defn to-offset-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.OffsetTime [^java.time.OffsetDateTime this]
   (.toOffsetTime this)))

(defn at-zone-similar-local
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSimilarLocal this zone)))

(defn get-year
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getYear this)))

(defn minus-seconds
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getSecond this)))

(defn plus-nanos
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfYear this)))

(defn plus
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn time-line-order
  {:arglists '([])}
  (^java.util.Comparator []
   (java.time.OffsetDateTime/timeLineOrder)))

(defn with-hour
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.OffsetDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn with-offset-same-instant
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(defn get-day-of-week
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.DayOfWeek [^java.time.OffsetDateTime this]
   (.getDayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.String [^java.time.OffsetDateTime this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.OffsetDateTime
   [^java.time.OffsetDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.plusHours this hours)))

(defn plus-days
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalTime [^java.time.OffsetDateTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-offset
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.ZoneOffset [^java.time.OffsetDateTime this]
   (.getOffset this)))

(defn to-zoned-date-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this]
   (.toZonedDateTime this)))

(defn with-year
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(defn with-nano
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  {:arglists '(["java.time.OffsetDateTime"])}
  (^long [^java.time.OffsetDateTime this]
   (.toEpochSecond this)))

(defn until
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn with-offset-same-local
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(defn with-day-of-month
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.OffsetDateTime/from temporal)))

(defn is-after
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                             (.isSupported ^java.time.OffsetDateTime this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                          (.isSupported ^java.time.OffsetDateTime this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.minusYears this years)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.OffsetDateTime [^java.lang.CharSequence text]
   (java.time.OffsetDateTime/parse text))
  (^java.time.OffsetDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.OffsetDateTime/parse text formatter)))

(defn with-second
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn to-local-date
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalDate [^java.time.OffsetDateTime this]
   (.toLocalDate this)))

(defn get-minute
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMinute this)))

(defn hash-code
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.OffsetDateTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.OffsetDateTime []
   (java.time.OffsetDateTime/now))
  (^java.time.OffsetDateTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [clock ^"java.time.Clock" arg0]
                                            (java.time.OffsetDateTime/now clock))
         (instance? java.time.ZoneId arg0) (let [zone ^"java.time.ZoneId" arg0]
                                             (java.time.OffsetDateTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn to-local-date-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalDateTime [^java.time.OffsetDateTime this]
   (.toLocalDateTime this)))

(defn get-month-value
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMonthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.Month [^java.time.OffsetDateTime this]
   (.getMonth this)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.OffsetDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.OffsetDateTime/ofInstant instant zone)))

(defn plus-seconds
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.OffsetDateTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.OffsetDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.minusDays this days)))
