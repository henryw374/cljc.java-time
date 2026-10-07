(ns cljc.java-time.local-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalDateTime]))

(def max java.time.LocalDateTime/MAX)

(def min java.time.LocalDateTime/MIN)

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^java.time.Instant [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.toInstant this offset)))

(clojure.core/defn plus-weeks
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn of-epoch-second
  {:arglists '(["long" "int" "java.time.ZoneOffset"])}
  (^java.time.LocalDateTime [^long epoch-second ^java.lang.Integer nano-of-second ^java.time.ZoneOffset offset]
   (java.time.LocalDateTime/ofEpochSecond epoch-second nano-of-second offset)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getHour this)))

(clojure.core/defn at-offset
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
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
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month (clojure.core/int arg1)
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month ^"java.time.Month" arg1
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month (clojure.core/int arg1)
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)
                                           second (clojure.core/int arg5)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute second))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month ^"java.time.Month" arg1
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)
                                           second (clojure.core/int arg5)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute second))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [arg0 arg1 arg2 arg3 arg4 arg5 arg6]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5)
                                        (clojure.core/instance? java.lang.Number arg6))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month (clojure.core/int arg1)
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)
                                           second (clojure.core/int arg5)
                                           nano-of-second (clojure.core/int arg6)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute second nano-of-second))
                      (clojure.core/and (clojure.core/instance? java.lang.Number arg0)
                                        (clojure.core/instance? java.time.Month arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3)
                                        (clojure.core/instance? java.lang.Number arg4)
                                        (clojure.core/instance? java.lang.Number arg5)
                                        (clojure.core/instance? java.lang.Number arg6))
                        (clojure.core/let [year (clojure.core/int arg0)
                                           month ^"java.time.Month" arg1
                                           day-of-month (clojure.core/int arg2)
                                           hour (clojure.core/int arg3)
                                           minute (clojure.core/int arg4)
                                           second (clojure.core/int arg5)
                                           nano-of-second (clojure.core/int arg6)]
                          (java.time.LocalDateTime/of year month day-of-month hour minute second nano-of-second))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with-month
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getNano this)))

(clojure.core/defn get-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getYear this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.LocalDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn get-day-of-week
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.DayOfWeek [^java.time.LocalDateTime this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.String [^java.time.LocalDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn at-zone
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.LocalDateTime this ^java.time.ZoneId zone]
   (.atZone this zone)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn plus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.LocalTime [^java.time.LocalDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists '(["java.time.LocalDateTime" "java.time.ZoneOffset"])}
  (^long [^java.time.LocalDateTime this ^java.time.ZoneOffset offset]
   (.toEpochSecond this offset)))

(clojure.core/defn until
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.LocalDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-day-of-month
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.LocalDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalDateTime/from temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.LocalDateTime this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.LocalDateTime this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn get-chronology
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.chrono.Chronology [^java.time.LocalDateTime this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.LocalDateTime [^java.lang.CharSequence text]
   (java.time.LocalDateTime/parse text))
  (^java.time.LocalDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalDateTime/parse text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(clojure.core/defn to-local-date
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.LocalDate [^java.time.LocalDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.LocalDateTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalDateTime []
   (java.time.LocalDateTime/now))
  (^java.time.LocalDateTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.LocalDateTime/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.LocalDateTime/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn get-month-value
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists '(["java.time.LocalDateTime" "int"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"])}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.chrono.ChronoLocalDateTime other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists '(["java.time.LocalDateTime"])}
  (^java.time.Month [^java.time.LocalDateTime this]
   (.getMonth this)))

(clojure.core/defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.LocalDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.LocalDateTime/ofInstant instant zone)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists '(["java.time.LocalDateTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.LocalDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.LocalDateTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.LocalDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.LocalDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists '(["java.time.LocalDateTime" "long"])}
  (^java.time.LocalDateTime [^java.time.LocalDateTime this ^long days]
   (.minusDays this days)))
