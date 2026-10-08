(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time LocalDate)))

(def max java.time.LocalDate/MAX)

(def min java.time.LocalDate/MIN)

(defn minus-weeks
  (^java.time.LocalDate [^java.time.LocalDate this ^long weeks-to-subtract]
   (.minusWeeks this weeks-to-subtract)))

(defn plus-weeks
  (^java.time.LocalDate [^java.time.LocalDate this ^long weeks-to-add]
   (.plusWeeks this weeks-to-add)))

(defn length-of-year
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfYear this)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-era
  (^java.time.chrono.Era [^java.time.LocalDate this]
   (.getEra this)))

(defn of
  {:arglists '(["int" "int" "int"] ["int" "java.time.Month" "int"])}
  (^java.time.LocalDate [arg0 arg1 arg2]
   (cond (and (instance? java.lang.Number arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2))
           (let [year (int arg0)
                 month (int arg1)
                 day-of-month (int arg2)]
             (java.time.LocalDate/of year month day-of-month))
         (and (instance? java.lang.Number arg0)
              (instance? java.time.Month arg1)
              (instance? java.lang.Number arg2))
           (let [year (int arg0)
                 ^java.time.Month month arg1
                 day-of-month (int arg2)]
             (java.time.LocalDate/of year month day-of-month))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isEqual this other)))

(defn get-year
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getYear this)))

(defn to-epoch-day
  (^long [^java.time.LocalDate this]
   (.toEpochDay this)))

(defn get-day-of-year
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfYear this)))

(defn plus
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalDate [^java.time.LocalDate this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  (^java.lang.Boolean [^java.time.LocalDate this]
   (.isLeapYear this)))

(defn query
  (^java.lang.Object [^java.time.LocalDate this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  (^java.time.DayOfWeek [^java.time.LocalDate this]
   (.getDayOfWeek this)))

(defn to-string
  (^java.lang.String [^java.time.LocalDate this]
   (.toString this)))

(defn plus-months
  (^java.time.LocalDate [^java.time.LocalDate this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isBefore this other)))

(defn minus-months
  (^java.time.LocalDate [^java.time.LocalDate this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalDate [^java.time.LocalDate this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-days
  (^java.time.LocalDate [^java.time.LocalDate this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn get-long
  (^long [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-year
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer year]
   (.withYear this year)))

(defn length-of-month
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfMonth this)))

(defn until
  (^java.time.Period [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate end-date-exclusive]
   (.until this end-date-exclusive))
  (^long [^java.time.LocalDate this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn of-epoch-day
  (^java.time.LocalDate [^long epoch-day]
   (java.time.LocalDate/ofEpochDay epoch-day)))

(defn with-day-of-month
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfMonth this)))

(defn from
  (^java.time.LocalDate [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalDate/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"]
               ["java.time.LocalDate" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.LocalDate this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  (^java.time.LocalDate [^java.time.LocalDate this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  (^java.time.chrono.IsoChronology [^java.time.LocalDate this]
   (.getChronology this)))

(defn parse
  (^java.time.LocalDate [^java.lang.CharSequence text]
   (java.time.LocalDate/parse text))
  (^java.time.LocalDate [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalDate/parse text formatter)))

(defn hash-code
  (^java.lang.Integer [^java.time.LocalDate this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.LocalDate this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalDate []
   (java.time.LocalDate/now))
  (^java.time.LocalDate [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.LocalDate/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.LocalDate/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn at-start-of-day
  (^java.time.LocalDateTime [^java.time.LocalDate this]
   (.atStartOfDay this))
  (^java.time.ZonedDateTime [^java.time.LocalDate this ^java.time.ZoneId zone]
   (.atStartOfDay this zone)))

(defn get-month-value
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getMonthValue this)))

(defn with-day-of-year
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.compareTo this other)))

(defn get-month
  (^java.time.Month [^java.time.LocalDate this]
   (.getMonth this)))

(defn of-year-day
  (^java.time.LocalDate [^java.lang.Integer year ^java.lang.Integer day-of-year]
   (java.time.LocalDate/ofYearDay year day-of-year)))

(defn get
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  (^java.lang.Boolean [^java.time.LocalDate this ^java.lang.Object obj]
   (.equals this obj)))

(defn at-time
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["java.time.LocalDate" "java.time.OffsetTime"]
               ["java.time.LocalDate" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int" "int"])}
  (^java.lang.Object [^java.time.LocalDate this arg0]
   (cond (instance? java.time.LocalTime arg0) (let [^java.time.LocalTime time arg0]
                                                (.atTime this time))
         (instance? java.time.OffsetTime arg0) (let [^java.time.OffsetTime time arg0]
                                                 (.atTime this time))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))
  (^java.time.LocalDateTime [^java.time.LocalDate this ^java.lang.Integer hour ^java.lang.Integer minute]
   (.atTime this hour minute))
  (^java.time.LocalDateTime
   [^java.time.LocalDate this ^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second]
   (.atTime this hour minute second))
  (^java.time.LocalDateTime
   [^java.time.LocalDate this ^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second
    ^java.lang.Integer nano-of-second]
   (.atTime this hour minute second nano-of-second)))

(defn format
  (^java.lang.String [^java.time.LocalDate this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^java.time.LocalDate [^java.time.LocalDate this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  (^java.time.LocalDate [^java.time.LocalDate this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
