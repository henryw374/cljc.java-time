(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDate]]))

(def max (goog.object/get java.time.LocalDate "MAX"))

(def min (goog.object/get java.time.LocalDate "MIN"))

(clojure.core/defn minus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-subtract]
   (.minusWeeks this weeks-to-subtract)))

(clojure.core/defn plus-weeks
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long weeks-to-add]
   (.plusWeeks this weeks-to-add)))

(clojure.core/defn length-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn get-era
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.Era [^js/JSJoda.LocalDate this]
   (.era this)))

(clojure.core/defn of
  {:arglists '(["int" "int" "int"] ["int" "java.time.Month" "int"])}
  (^js/JSJoda.LocalDate [arg0 arg1 arg2]
   (js-invoke java.time.LocalDate "of" arg0 arg1 arg2)))

(clojure.core/defn with-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int month]
   (.withMonth this month)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isEqual this other)))

(clojure.core/defn get-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.year this)))

(clojure.core/defn to-epoch-day
  {:arglists '(["java.time.LocalDate"])}
  (^long [^js/JSJoda.LocalDate this]
   (.toEpochDay this)))

(clojure.core/defn get-day-of-year
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn is-leap-year
  {:arglists '(["java.time.LocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn get-day-of-week
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDate this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.LocalDate"])}
  (^java.lang.String [^js/JSJoda.LocalDate this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-add]
   (.plusMonths this months-to-add)))

(clojure.core/defn is-before
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isBefore this other)))

(clojure.core/defn minus-months
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long months-to-subtract]
   (.minusMonths this months-to-subtract)))

(clojure.core/defn minus
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-add]
   (.plusDays this days-to-add)))

(clojure.core/defn get-long
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int year]
   (.withYear this year)))

(clojure.core/defn length-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]
               ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate end-date-exclusive]
   (.until this end-date-exclusive))
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn of-epoch-day
  {:arglists '(["long"])}
  (^js/JSJoda.LocalDate [^long epoch-day]
   (js-invoke java.time.LocalDate "ofEpochDay" epoch-day)))

(clojure.core/defn with-day-of-month
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-month]
   (.withDayOfMonth this day-of-month)))

(clojure.core/defn get-day-of-month
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalDate "from" temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.isAfter this other)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"]
               ["java.time.LocalDate" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalDate this arg0)))

(clojure.core/defn minus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-subtract]
   (.minusYears this years-to-subtract)))

(clojure.core/defn get-chronology
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.IsoChronology [^js/JSJoda.LocalDate this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text]
   (js-invoke java.time.LocalDate "parse" text))
  (^js/JSJoda.LocalDate [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalDate "parse" text formatter)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.LocalDate" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.LocalDate []
   (js-invoke java.time.LocalDate "now"))
  (^js/JSJoda.LocalDate [arg0]
   (js-invoke java.time.LocalDate "now" arg0)))

(clojure.core/defn at-start-of-day
  {:arglists '(["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this]
   (.atStartOfDay this))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate this ^js/JSJoda.ZoneId zone]
   (.atStartOfDay this zone)))

(clojure.core/defn get-month-value
  {:arglists '(["java.time.LocalDate"])}
  (^int [^js/JSJoda.LocalDate this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists '(["java.time.LocalDate" "int"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int day-of-year]
   (.withDayOfYear this day-of-year)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"])}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate other]
   (.compareTo this other)))

(clojure.core/defn get-month
  {:arglists '(["java.time.LocalDate"])}
  (^js/JSJoda.Month [^js/JSJoda.LocalDate this]
   (.month this)))

(clojure.core/defn of-year-day
  {:arglists '(["int" "int"])}
  (^js/JSJoda.LocalDate [^int year ^int day-of-year]
   (js-invoke java.time.LocalDate "ofYearDay" year day-of-year)))

(clojure.core/defn get
  {:arglists '(["java.time.LocalDate" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.LocalDate" "java.lang.Object"])}
  (^boolean [^js/JSJoda.LocalDate this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn at-time
  {:arglists '(["java.time.LocalDate" "java.time.LocalTime"]
               ["java.time.LocalDate" "java.time.OffsetTime"]
               ["java.time.LocalDate" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int"]
               ["java.time.LocalDate" "int" "int" "int" "int"])}
  (^java.lang.Object [this arg0]
   (.atTime ^js/JSJoda.LocalDate this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute]
   (.atTime this hour minute))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute ^int second]
   (.atTime this hour minute second))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int hour ^int minute ^int second ^int nano-of-second]
   (.atTime this hour minute second nano-of-second)))

(clojure.core/defn format
  {:arglists '(["java.time.LocalDate" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.LocalDate this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))

(clojure.core/defn plus-years
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long years-to-add]
   (.plusYears this years-to-add)))

(clojure.core/defn minus-days
  {:arglists '(["java.time.LocalDate" "long"])}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))
