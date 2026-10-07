(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time LocalDate)))

(def max java.time.LocalDate/MAX)

(def min java.time.LocalDate/MIN)

(defn minus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long weeks-to-subtract]
   (.minusWeeks this weeks-to-subtract)))

(defn plus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long weeks-to-add]
   (.plusWeeks this weeks-to-add)))

(defn length-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfYear this)))

(defn range
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-era
  {:arglists '(["java.time.LocalDate"])}
  (^java.time.chrono.Era [^java.time.LocalDate this]
   (.getEra this)))

(defn of
  {:arglists '(["int" "int" "int"] ["int" "java.time.Month" "int"])}
  (^java.time.LocalDate [arg0 arg1 arg2]
   (cond
     (and (instance? java.lang.Number arg0) (instance? java.lang.Number arg1) (instance? java.lang.Number arg2))
       (let [year (int arg0) month (int arg1) day-of-month (int arg2)] (java.time.LocalDate/of year month day-of-month))
     (and (instance? java.lang.Number arg0) (instance? java.time.Month arg1) (instance? java.lang.Number arg2))
       (let [year (int arg0)
             month ^"java.time.Month" arg1
             day-of-month (int arg2)]
         (java.time.LocalDate/of year month day-of-month))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn with-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isEqual this other)))

(defn get-year
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getYear this)))

(defn to-epoch-day
  {:arglists '(["java.time.LocalDate"])}
  (^long [^java.time.LocalDate this]
   (.toEpochDay this)))

(defn get-day-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfYear this)))

(defn plus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalDate [^java.time.LocalDate this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Boolean [^java.time.LocalDate this]
   (.isLeapYear this)))

(defn query
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.LocalDate this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.LocalDate"])}
  (^java.time.DayOfWeek [^java.time.LocalDate this]
   (.getDayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.String [^java.time.LocalDate this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalDate [^java.time.LocalDate this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn get-long
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^long [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer year]
   (.withYear this year)))

(defn length-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.lengthOfMonth this)))

(defn until
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]
               ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^java.time.Period [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate end-date-exclusive]
   (.until this end-date-exclusive))
  (^long [^java.time.LocalDate this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn of-epoch-day
  {:arglists '(["long"])}
  (^java.time.LocalDate [^long epoch-day]
   (java.time.LocalDate/ofEpochDay epoch-day)))

(defn with-day-of-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getDayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.LocalDate [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalDate/from temporal)))

(defn is-after
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"]
               ["java.time.LocalDate" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (cond (and (instance? java.time.temporal.TemporalField arg0)) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                                   (.isSupported ^java.time.LocalDate this field))
         (and (instance? java.time.temporal.ChronoUnit arg0)) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                                (.isSupported ^java.time.LocalDate this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn minus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  {:arglists '(["java.time.LocalDate"])}
  (^java.time.chrono.IsoChronology [^java.time.LocalDate this]
   (.getChronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.LocalDate [^java.lang.CharSequence text]
   (java.time.LocalDate/parse text))
  (^java.time.LocalDate [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalDate/parse text formatter)))

(defn hash-code
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.LocalDate" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.LocalDate this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalDate [^java.time.LocalDate this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalDate []
   (java.time.LocalDate/now))
  (^java.time.LocalDate [arg0]
   (cond (and (instance? java.time.Clock arg0)) (let [clock ^"java.time.Clock" arg0] (java.time.LocalDate/now clock))
         (and (instance? java.time.ZoneId arg0)) (let [zone ^"java.time.ZoneId" arg0] (java.time.LocalDate/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn at-start-of-day
  {:arglists '(["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"])}
  (^java.time.LocalDateTime [^java.time.LocalDate this]
   (.atStartOfDay this))
  (^java.time.ZonedDateTime [^java.time.LocalDate this ^java.time.ZoneId zone]
   (.atStartOfDay this zone)))

(defn get-month-value
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this]
   (.getMonthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^java.lang.Integer day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.chrono.ChronoLocalDate other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.LocalDate"])}
  (^java.time.Month [^java.time.LocalDate this]
   (.getMonth this)))

(defn of-year-day
  {:arglists '(["int" "int"])}
  (^java.time.LocalDate [^java.lang.Integer year ^java.lang.Integer day-of-year]
   (java.time.LocalDate/ofYearDay year day-of-year)))

(defn get
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.LocalDate this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.LocalDate" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.LocalDate this ^java.lang.Object obj]
   (.equals this obj)))

(defn at-time
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["java.time.LocalDate" "java.time.OffsetTime"]
               ["java.time.LocalDate" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int" "int"])}
  (^java.lang.Object [this arg0]
   (cond (and (instance? java.time.LocalTime arg0)) (let [time ^"java.time.LocalTime" arg0]
                                                      (.atTime ^java.time.LocalDate this time))
         (and (instance? java.time.OffsetTime arg0)) (let [time ^"java.time.OffsetTime" arg0]
                                                       (.atTime ^java.time.LocalDate this time))
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
  {:arglists '(["java.time.LocalDate" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.LocalDate this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^java.time.LocalDate [^java.time.LocalDate this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
