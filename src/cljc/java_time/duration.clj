(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Duration)))

(def zero java.time.Duration/ZERO)

(defn minus-minutes
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn to-nanos
  (^long [^java.time.Duration this]
   (.toNanos this)))

(defn minus-millis
  (^java.time.Duration [^java.time.Duration this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(defn minus-hours
  (^java.time.Duration [^java.time.Duration this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of-days
  (^java.time.Duration [^long days]
   (java.time.Duration/ofDays days)))

(defn is-negative
  (^java.lang.Boolean [^java.time.Duration this]
   (.isNegative this)))

(defn of
  (^java.time.Duration [^long amount ^java.time.temporal.ChronoUnit unit]
   (java.time.Duration/of amount unit)))

(defn is-zero
  (^java.lang.Boolean [^java.time.Duration this]
   (.isZero this)))

(defn multiplied-by
  (^java.time.Duration [^java.time.Duration this ^long multiplicand]
   (.multipliedBy this multiplicand)))

(defn with-nanos
  (^java.time.Duration [^java.time.Duration this ^java.lang.Integer nano-of-second]
   (.withNanos this nano-of-second)))

(defn get-units
  (^java.util.List [^java.time.Duration this]
   (.getUnits this)))

(defn get-nano
  (^java.lang.Integer [^java.time.Duration this]
   (.getNano this)))

(defn plus-millis
  (^java.time.Duration [^java.time.Duration this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(defn to-minutes
  (^long [^java.time.Duration this]
   (.toMinutes this)))

(defn minus-seconds
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn plus-nanos
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.plus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn divided-by
  (^java.time.Duration [^java.time.Duration this ^long divisor]
   (.dividedBy this divisor)))

(defn plus-minutes
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn to-string
  (^java.lang.String [^java.time.Duration this]
   (.toString this)))

(defn minus
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.minus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn add-to
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(defn plus-hours
  (^java.time.Duration [^java.time.Duration this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn plus-days
  (^java.time.Duration [^java.time.Duration this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-hours
  (^java.time.Duration [^long hours]
   (java.time.Duration/ofHours hours)))

(defn to-millis
  (^long [^java.time.Duration this]
   (.toMillis this)))

(defn to-hours
  (^long [^java.time.Duration this]
   (.toHours this)))

(defn of-nanos
  (^java.time.Duration [^long nanos]
   (java.time.Duration/ofNanos nanos)))

(defn of-millis
  (^java.time.Duration [^long millis]
   (java.time.Duration/ofMillis millis)))

(defn negated
  (^java.time.Duration [^java.time.Duration this]
   (.negated this)))

(defn abs
  (^java.time.Duration [^java.time.Duration this]
   (.abs this)))

(defn between
  (^java.time.Duration [^java.time.temporal.Temporal start-inclusive ^java.time.temporal.Temporal end-exclusive]
   (java.time.Duration/between start-inclusive end-exclusive)))

(defn get-seconds
  (^long [^java.time.Duration this]
   (.getSeconds this)))

(defn from
  (^java.time.Duration [^java.time.temporal.TemporalAmount amount]
   (java.time.Duration/from amount)))

(defn minus-nanos
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn parse
  (^java.time.Duration [^java.lang.CharSequence text]
   (java.time.Duration/parse text)))

(defn hash-code
  (^java.lang.Integer [^java.time.Duration this]
   (.hashCode this)))

(defn with-seconds
  (^java.time.Duration [^java.time.Duration this ^long seconds]
   (.withSeconds this seconds)))

(defn of-minutes
  (^java.time.Duration [^long minutes]
   (java.time.Duration/ofMinutes minutes)))

(defn subtract-from
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(defn compare-to
  (^java.lang.Integer [^java.time.Duration this ^java.time.Duration other-duration]
   (.compareTo this other-duration)))

(defn plus-seconds
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(defn get
  (^long [^java.time.Duration this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(defn equals
  (^java.lang.Boolean [^java.time.Duration this ^java.lang.Object other-duration]
   (.equals this other-duration)))

(defn of-seconds
  (^java.time.Duration [^long seconds]
   (java.time.Duration/ofSeconds seconds))
  (^java.time.Duration [^long seconds ^long nano-adjustment]
   (java.time.Duration/ofSeconds seconds nano-adjustment)))

(defn minus-days
  (^java.time.Duration [^java.time.Duration this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))

(defn to-days
  (^long [^java.time.Duration this]
   (.toDays this)))
