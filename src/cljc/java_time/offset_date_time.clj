(ns cljc.java-time.offset-date-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time OffsetDateTime]))

(def min java.time.OffsetDateTime/MIN)

(def max java.time.OffsetDateTime/MAX)

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn minus-weeks
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.minusWeeks this weeks)))

(clojure.core/defn to-instant
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.Instant [^java.time.OffsetDateTime this]
   (.toInstant this)))

(clojure.core/defn plus-weeks
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long weeks]
   (.plusWeeks this weeks)))

(clojure.core/defn range
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getHour this)))

(clojure.core/defn at-zone-same-instant
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSameInstant this zone)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
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

(clojure.core/defn with-month
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getNano this)))

(clojure.core/defn to-offset-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.OffsetTime [^java.time.OffsetDateTime this]
   (.toOffsetTime this)))

(clojure.core/defn at-zone-similar-local
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this ^java.time.ZoneId zone]
   (.atZoneSimilarLocal this zone)))

(clojure.core/defn get-year
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getYear this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn get-day-of-year
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfYear this)))

(clojure.core/defn plus
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn time-line-order
  {:arglists '([])}
  (^java.util.Comparator []
   (java.time.OffsetDateTime/timeLineOrder)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.OffsetDateTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn with-offset-same-instant
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(clojure.core/defn get-day-of-week
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.DayOfWeek [^java.time.OffsetDateTime this]
   (.getDayOfWeek this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.String [^java.time.OffsetDateTime this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.plusMonths this months)))

(clojure.core/defn is-before
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long months]
   (.minusMonths this months)))

(clojure.core/defn minus
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.OffsetDateTime
   [^java.time.OffsetDateTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn plus-days
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.plusDays this days)))

(clojure.core/defn to-local-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalTime [^java.time.OffsetDateTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-offset
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.ZoneOffset [^java.time.OffsetDateTime this]
   (.getOffset this)))

(clojure.core/defn to-zoned-date-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.ZonedDateTime [^java.time.OffsetDateTime this]
   (.toZonedDateTime this)))

(clojure.core/defn with-year
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer year]
   (.withYear this year)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn to-epoch-second
  {:arglists '(["java.time.OffsetDateTime"])}
  (^long [^java.time.OffsetDateTime this]
   (.toEpochSecond this)))

(clojure.core/defn until
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.OffsetDateTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-offset-same-local
  {:arglists '(["java.time.OffsetDateTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(clojure.core/defn with-day-of-month
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getDayOfMonth this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.OffsetDateTime/from temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.OffsetDateTime this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.OffsetDateTime this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn minus-years
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.minusYears this years)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.OffsetDateTime [^java.lang.CharSequence text]
   (java.time.OffsetDateTime/parse text))
  (^java.time.OffsetDateTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.OffsetDateTime/parse text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer second]
   (.withSecond this second)))

(clojure.core/defn to-local-date
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalDate [^java.time.OffsetDateTime this]
   (.toLocalDate this)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.OffsetDateTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.OffsetDateTime []
   (java.time.OffsetDateTime/now))
  (^java.time.OffsetDateTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.OffsetDateTime/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.OffsetDateTime/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn to-local-date-time
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.LocalDateTime [^java.time.OffsetDateTime this]
   (.toLocalDateTime this)))

(clojure.core/defn get-month-value
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this]
   (.getMonthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists '(["java.time.OffsetDateTime" "int"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.OffsetDateTime" "java.time.OffsetDateTime"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.OffsetDateTime other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists '(["java.time.OffsetDateTime"])}
  (^java.time.Month [^java.time.OffsetDateTime this]
   (.getMonth this)))

(clojure.core/defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.OffsetDateTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.OffsetDateTime/ofInstant instant zone)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists '(["java.time.OffsetDateTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.OffsetDateTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.OffsetDateTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.OffsetDateTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.OffsetDateTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long years]
   (.plusYears this years)))

(clojure.core/defn minus-days
  {:arglists '(["java.time.OffsetDateTime" "long"])}
  (^java.time.OffsetDateTime [^java.time.OffsetDateTime this ^long days]
   (.minusDays this days)))
