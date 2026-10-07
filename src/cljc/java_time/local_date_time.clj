(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time LocalDateTime)))

(def max java.time.LocalDateTime/MAX)

(def min java.time.LocalDateTime/MIN)

(defn minus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn minus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(defn to-instant
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^java.time.Instant [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.toInstant this offset)))

(defn plus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(defn range
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn of-epoch-second
  {:arglists '(["long" "int" "java.time.ZoneOffset"])}
  (^java.time.LocalDateTime [^long epoch-second ^java.lang.Integer nano-of-second ^java.time.ZoneOffset offset]
   (java.time.LocalDateTime/ofEpochSecond epoch-second nano-of-second offset)))

(defn get-hour
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getHour this)))

(defn at-offset
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int"]
               ["int" "int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int" "int"]
               ["int" "int" "int" "int" "int" "int" "int"]
               ["int" "java.time.Month" "int" "int" "int" "int" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDate date ^java.time.LocalTime time]
   (java.time.LocalDateTime/of date time))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4))
           (let [year (int arg0)
                 month (int arg1)
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)]
             (java.time.LocalDateTime/of year month day-of-month hour minute))
         (and (instance? java.lang.Number arg0)
              (instance? java.time.Month arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4))
           (let [year (int arg0)
                 ^java.time.Month month arg1
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)]
             (java.time.LocalDateTime/of year month day-of-month hour minute))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4)
              (instance? java.lang.Number arg5))
           (let [year (int arg0)
                 month (int arg1)
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)
                 second (int arg5)]
             (java.time.LocalDateTime/of year month day-of-month hour minute second))
         (and (instance? java.lang.Number arg0)
              (instance? java.time.Month arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4)
              (instance? java.lang.Number arg5))
           (let [year (int arg0)
                 ^java.time.Month month arg1
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)
                 second (int arg5)]
             (java.time.LocalDateTime/of year month day-of-month hour minute second))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4)
              (instance? java.lang.Number arg5)
              (instance? java.lang.Number arg6))
           (let [year (int arg0)
                 month (int arg1)
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)
                 second (int arg5)
                 nano-of-second (int arg6)]
             (java.time.LocalDateTime/of year month day-of-month hour minute second nano-of-second))
         (and (instance? java.lang.Number arg0)
              (instance? java.time.Month arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3)
              (instance? java.lang.Number arg4)
              (instance? java.lang.Number arg5)
              (instance? java.lang.Number arg6))
           (let [year (int arg0)
                 ^java.time.Month month arg1
                 day-of-month (int arg2)
                 hour (int arg3)
                 minute (int arg4)
                 second (int arg5)
                 nano-of-second (int arg6)]
             (java.time.LocalDateTime/of year month day-of-month hour minute second nano-of-second))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getNano this)))

(defn get-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getYear this)))

(defn minus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getSecond this)))

(defn plus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long nanos]
   (.plusNanos this nanos)))

(defn get-day-of-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfYear this)))

(defn plus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.LocalDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.DayOfWeek [^java.time.LocalDateTime this]
   (.getDayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.String [^java.time.LocalDateTime this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long months]
   (.plusMonths this months)))

(defn is-before
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long months]
   (.minusMonths this months)))

(defn minus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn at-zone
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime this ^java.time.ZoneId zone]
   (.atZone this zone)))

(defn plus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long hours]
   (.plusHours this hours)))

(defn plus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long days]
   (.plusDays this days)))

(defn to-local-time
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.LocalTime [^java.time.LocalDateTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(defn with-nano
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn to-epoch-second
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^long [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.toEpochSecond this offset)))

(defn until
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn with-day-of-month
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.LocalDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalDateTime/from temporal)))

(defn is-after
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long years]
   (.minusYears this years)))

(defn get-chronology
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.chrono.Chronology [^java.time.LocalDateTime this]
   (.getChronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.LocalDateTime [^java.lang.CharSequence text]
   (java.time.LocalDateTime/parse text))
  (^java.time.LocalDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalDateTime/parse text formatter)))

(defn with-second
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn to-local-date
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.LocalDate [^java.time.LocalDateTime this]
   (.toLocalDate this)))

(defn get-minute
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMinute this)))

(defn hash-code
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.LocalDateTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalDateTime []
   (java.time.LocalDateTime/now))
  (^java.time.LocalDateTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.LocalDateTime/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.LocalDateTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn get-month-value
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMonthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.Month [^java.time.LocalDateTime this]
   (.getMonth this)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.LocalDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.LocalDateTime/ofInstant instant zone)))

(defn plus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.LocalDateTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.LocalDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long years]
   (.plusYears this years)))

(defn minus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long days]
   (.minusDays this days)))
