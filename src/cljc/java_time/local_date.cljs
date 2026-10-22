(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDate]]))

(def max (goog.object/get java.time.LocalDate "MAX"))

(def min (goog.object/get java.time.LocalDate "MIN"))

(defn minus-weeks
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-subtract]
   (.minusWeeks this weeks-to-subtract)))

(defn plus-weeks
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-add]
   (.plusWeeks this weeks-to-add)))

(defn length-of-year
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfYear this)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn get-era
  (^js/JSJoda.Era [^js/JSJoda.LocalDate this]
   (.era this)))

(defn of
  {:arglists '(["int" "int" "int"] ["int" "java.time.Month" "int"])}
  (^js/JSJoda.LocalDate [arg0 arg1 arg2]
   (js-invoke java.time.LocalDate "of" arg0 arg1 arg2)))

(defn with-month
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int month]
   (.withMonth this month)))

(defn is-equal
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isEqual this other)))

(defn get-year
  (^int [^js/JSJoda.LocalDate this]
   (.year this)))

(defn to-epoch-day
  (^long [^js/JSJoda.LocalDate this]
   (.toEpochDay this)))

(defn get-day-of-year
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfYear this)))

(defn plus
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  (^boolean [^js/JSJoda.LocalDate this]
   (.isLeapYear this)))

(defn query
  (^java.lang.Object [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDate this]
   (.dayOfWeek this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.LocalDate this]
   (.toString this)))

(defn plus-months
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isBefore this other)))

(defn minus-months
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-days
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn get-long
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int year]
   (.withYear this year)))

(defn length-of-month
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfMonth this)))

(defn until
  (^js/JSJoda.Period [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate end-date-exclusive]
   (.until this end-date-exclusive))
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn of-epoch-day
  (^js/JSJoda.LocalDate [^long epoch-day]
   (js-invoke java.time.LocalDate "ofEpochDay" epoch-day)))

(defn with-day-of-month
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfMonth this)))

(defn from
  (^js/JSJoda.LocalDate [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDate "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"]
               ["java.time.LocalDate" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.LocalDate this arg0]
   (.isSupported this arg0)))

(defn minus-years
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  (^js/JSJoda.IsoChronology [^js/JSJoda.LocalDate this]
   (.chronology this)))

(defn parse
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDate "parse" text))
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDate "parse" text formatter)))

(defn hash-code
  (^int [^js/JSJoda.LocalDate this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.LocalDate []
   (js-invoke java.time.LocalDate "now"))
  (^js/JSJoda.LocalDate [arg0]
   (js-invoke java.time.LocalDate "now" arg0)))

(defn at-start-of-day
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this]
   (.atStartOfDay this))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate this ^js/JSJoda.ZoneId zone]
   (.atStartOfDay this zone)))

(defn get-month-value
  (^int [^js/JSJoda.LocalDate this]
   (.monthValue this)))

(defn with-day-of-year
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.compareTo this other)))

(defn get-month
  (^js/JSJoda.Month [^js/JSJoda.LocalDate this]
   (.month this)))

(defn of-year-day
  (^js/JSJoda.LocalDate [^int year ^int day-of-year]
   (js-invoke java.time.LocalDate "ofYearDay" year day-of-year)))

(defn get
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  (^boolean [^js/JSJoda.LocalDate this ^java.lang.Object obj]
   (.equals this obj)))

(defn at-time
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["java.time.LocalDate" "java.time.OffsetTime"]
               ["java.time.LocalDate" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int" "int"])}
  (^java.lang.Object [^js/JSJoda.LocalDate this arg0]
   (.atTime this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute]
   (.atTime this hour minute))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute ^int second]
   (.atTime this hour minute second))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute ^int second ^int nano-of-second]
   (.atTime this hour minute second nano-of-second)))

(defn format
  (^java.lang.String [^js/JSJoda.LocalDate this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
