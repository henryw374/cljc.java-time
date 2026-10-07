(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDate]]))

(def max (goog.object/get java.time.LocalDate "MAX"))

(def min (goog.object/get java.time.LocalDate "MIN"))

(defn minus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-subtract]
   (.minusWeeks this weeks-to-subtract)))

(defn plus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-add]
   (.plusWeeks this weeks-to-add)))

(defn length-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfYear this)))

(defn range
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn get-era
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.Era [^js/JSJoda.LocalDate this]
   (.era this)))

(defn of
  {:arglists '(["int" "int" "int"] ["int" "java.time.Month" "int"])}
  (^js/JSJoda.LocalDate [arg0 arg1 arg2]
   (js-invoke java.time.LocalDate "of" arg0 arg1 arg2)))

(defn with-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int month]
   (.withMonth this month)))

(defn is-equal
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isEqual this other)))

(defn get-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.year this)))

(defn to-epoch-day
  {:arglists '(["java.time.LocalDate"])}
  (^long [^js/JSJoda.LocalDate this]
   (.toEpochDay this)))

(defn get-day-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfYear this)))

(defn plus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn is-leap-year
  {:arglists '(["java.time.LocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this]
   (.isLeapYear this)))

(defn query
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn get-day-of-week
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDate this]
   (.dayOfWeek this)))

(defn to-string
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.String [^js/JSJoda.LocalDate this]
   (.toString this)))

(defn plus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-add]
   (.plusMonths this months-to-add)))

(defn is-before
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isBefore this other)))

(defn minus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(defn minus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn get-long
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int year]
   (.withYear this year)))

(defn length-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfMonth this)))

(defn until
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]
               ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate end-date-exclusive]
   (.until this end-date-exclusive))
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn of-epoch-day
  {:arglists '(["long"])}
  (^js/JSJoda.LocalDate [^long epoch-day]
   (js-invoke java.time.LocalDate "ofEpochDay" epoch-day)))

(defn with-day-of-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(defn get-day-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfMonth this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDate "from" temporal)))

(defn is-after
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isAfter this other)))

(defn is-supported
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"]
               ["java.time.LocalDate" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.LocalDate this arg0]
   (.isSupported this arg0)))

(defn minus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(defn get-chronology
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.IsoChronology [^js/JSJoda.LocalDate this]
   (.chronology this)))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDate "parse" text))
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDate "parse" text formatter)))

(defn hash-code
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.LocalDate" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"])}
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
  {:arglists '(["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this]
   (.atStartOfDay this))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate this ^js/JSJoda.ZoneId zone]
   (.atStartOfDay this zone)))

(defn get-month-value
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.monthValue this)))

(defn with-day-of-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(defn compare-to
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.compareTo this other)))

(defn get-month
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.Month [^js/JSJoda.LocalDate this]
   (.month this)))

(defn of-year-day
  {:arglists '(["int" "int"])}
  (^js/JSJoda.LocalDate [^int year ^int day-of-year]
   (js-invoke java.time.LocalDate "ofYearDay" year day-of-year)))

(defn get
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.LocalDate" "java.lang.Object"])}
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
  {:arglists '(["java.time.LocalDate" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.LocalDate this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(defn plus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-add]
   (.plusYears this years-to-add)))

(defn minus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
