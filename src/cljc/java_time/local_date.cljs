(ns cljc.java-time.local-date
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalDate]]))

(def max (goog.object/get java.time.LocalDate "MAX"))

(def min (goog.object/get java.time.LocalDate "MIN"))

(clojure.core/defn minus-weeks
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.minusWeeks this arg0)))

(clojure.core/defn plus-weeks
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.plusWeeks this arg0)))

(clojure.core/defn length-of-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfYear this)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-era
  {:arglists (quote (["java.time.LocalDate"]))}
  (^js/JSJoda.Era [^js/JSJoda.LocalDate this]
   (.era this)))

(clojure.core/defn of
  {:arglists (quote (["int" "int" "int"] ["int" "java.time.Month" "int"]))}
  (^js/JSJoda.LocalDate [arg0 arg1 arg2]
   (js-invoke java.time.LocalDate "of" arg0 arg1 arg2)))

(clojure.core/defn with-month
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int arg0]
   (.withMonth this arg0)))

(clojure.core/defn is-equal
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate arg0]
   (.isEqual this arg0)))

(clojure.core/defn get-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.year this)))

(clojure.core/defn to-epoch-day
  {:arglists (quote (["java.time.LocalDate"]))}
  (^long [^js/JSJoda.LocalDate this]
   (.toEpochDay this)))

(clojure.core/defn get-day-of-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfYear this)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount arg0]
   (.plus this arg0))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn is-leap-year
  {:arglists (quote (["java.time.LocalDate"]))}
  (^boolean [^js/JSJoda.LocalDate this]
   (.isLeapYear this)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn get-day-of-week
  {:arglists (quote (["java.time.LocalDate"]))}
  (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDate this]
   (.dayOfWeek this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalDate"]))}
  (^java.lang.String [^js/JSJoda.LocalDate this]
   (.toString this)))

(clojure.core/defn plus-months
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.plusMonths this arg0)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus-months
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.minusMonths this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAmount arg0]
   (.minus this arg0))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.plusDays this arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-year
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int arg0]
   (.withYear this arg0)))

(clojure.core/defn length-of-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.lengthOfMonth this)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]
                     ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Period [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate arg0]
   (.until this arg0))
  (^long [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn of-epoch-day
  {:arglists (quote (["long"]))}
  (^js/JSJoda.LocalDate [^long arg0]
   (js-invoke java.time.LocalDate "ofEpochDay" arg0)))

(clojure.core/defn with-day-of-month
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int arg0]
   (.withDayOfMonth this arg0)))

(clojure.core/defn get-day-of-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.dayOfMonth this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.TemporalAccessor arg0]
   (js-invoke java.time.LocalDate "from" arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^boolean [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate arg0]
   (.isAfter this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]
                     ["java.time.LocalDate" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalDate this arg0)))

(clojure.core/defn minus-years
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.minusYears this arg0)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.LocalDate"]))}
  (^js/JSJoda.IsoChronology [^js/JSJoda.LocalDate this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.LocalDate [^java.lang.CharSequence arg0]
   (js-invoke java.time.LocalDate "parse" arg0))
  (^js/JSJoda.LocalDate [^java.lang.CharSequence arg0 ^js/JSJoda.DateTimeFormatter arg1]
   (js-invoke java.time.LocalDate "parse" arg0 arg1)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalDate this ^js/JSJoda.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalAdjuster arg0]
   (.with this arg0))
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^js/JSJoda.LocalDate []
   (js-invoke java.time.LocalDate "now"))
  (^js/JSJoda.LocalDate [arg0]
   (js-invoke java.time.LocalDate "now" arg0)))

(clojure.core/defn at-start-of-day
  {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"]))}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this]
   (.atStartOfDay this))
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate this ^js/JSJoda.ZoneId arg0]
   (.atStartOfDay this arg0)))

(clojure.core/defn get-month-value
  {:arglists (quote (["java.time.LocalDate"]))}
  (^int [^js/JSJoda.LocalDate this]
   (.monthValue this)))

(clojure.core/defn with-day-of-year
  {:arglists (quote (["java.time.LocalDate" "int"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^int arg0]
   (.withDayOfYear this arg0)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.ChronoLocalDate arg0]
   (.compareTo this arg0)))

(clojure.core/defn get-month
  {:arglists (quote (["java.time.LocalDate"]))}
  (^js/JSJoda.Month [^js/JSJoda.LocalDate this]
   (.month this)))

(clojure.core/defn of-year-day
  {:arglists (quote (["int" "int"]))}
  (^js/JSJoda.LocalDate [^int arg0 ^int arg1]
   (js-invoke java.time.LocalDate "ofYearDay" arg0 arg1)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.LocalDate this ^js/JSJoda.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalDate" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.LocalDate this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn at-time
  {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"]
                     ["java.time.LocalDate" "java.time.OffsetTime"]
                     ["java.time.LocalDate" "int" "int"]
                     ["java.time.LocalDate" "int" "int" "int"]
                     ["java.time.LocalDate" "int" "int" "int" "int"]))}
  (^java.lang.Object [this arg0]
   (.atTime ^js/JSJoda.LocalDate this arg0))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int arg0 ^int arg1]
   (.atTime this arg0 arg1))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int arg0 ^int arg1 ^int arg2]
   (.atTime this arg0 arg1 arg2))
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this ^int arg0 ^int arg1 ^int arg2 ^int arg3]
   (.atTime this arg0 arg1 arg2 arg3)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalDate" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^js/JSJoda.LocalDate this ^js/JSJoda.DateTimeFormatter arg0]
   (.format this arg0)))

(clojure.core/defn plus-years
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.plusYears this arg0)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.LocalDate" "long"]))}
  (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this ^long arg0]
   (.minusDays this arg0)))
