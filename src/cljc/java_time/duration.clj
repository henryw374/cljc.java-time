(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Duration)))

(def zero java.time.Duration/ZERO)

(defn minus-minutes
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn to-nanos
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.toNanos this)))

(defn minus-millis
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(defn minus-hours
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of-days
  {:arglists '(["long"])}
  (^java.time.Duration [^long days]
   (java.time.Duration/ofDays days)))

(defn is-negative
  {:arglists '(["java.time.Duration"])}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isNegative this)))

(defn of
  {:arglists '(["long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Duration [^long amount ^java.time.temporal.ChronoUnit unit]
   (java.time.Duration/of amount unit)))

(defn is-zero
  {:arglists '(["java.time.Duration"])}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isZero this)))

(defn multiplied-by
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long multiplicand]
   (.multipliedBy this multiplicand)))

(defn with-nanos
  {:arglists '(["java.time.Duration" "int"])}
  (^java.time.Duration [^java.time.Duration this ^java.lang.Integer nano-of-second]
   (.withNanos this nano-of-second)))

(defn get-units
  {:arglists '(["java.time.Duration"])}
  (^java.util.List [^java.time.Duration this]
   (.getUnits this)))

(defn get-nano
  {:arglists '(["java.time.Duration"])}
  (^java.lang.Integer [^java.time.Duration this]
   (.getNano this)))

(defn plus-millis
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(defn to-minutes
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.toMinutes this)))

(defn minus-seconds
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn plus-nanos
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  {:arglists '(["java.time.Duration" "java.time.Duration"]
               ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.plus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn divided-by
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long divisor]
   (.dividedBy this divisor)))

(defn plus-minutes
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn to-string
  {:arglists '(["java.time.Duration"])}
  (^java.lang.String [^java.time.Duration this]
   (.toString this)))

(defn minus
  {:arglists '(["java.time.Duration" "java.time.Duration"]
               ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.minus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn add-to
  {:arglists '(["java.time.Duration" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(defn plus-hours
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn plus-days
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-hours
  {:arglists '(["long"])}
  (^java.time.Duration [^long hours]
   (java.time.Duration/ofHours hours)))

(defn to-millis
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.toMillis this)))

(defn to-hours
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.toHours this)))

(defn of-nanos
  {:arglists '(["long"])}
  (^java.time.Duration [^long nanos]
   (java.time.Duration/ofNanos nanos)))

(defn of-millis
  {:arglists '(["long"])}
  (^java.time.Duration [^long millis]
   (java.time.Duration/ofMillis millis)))

(defn negated
  {:arglists '(["java.time.Duration"])}
  (^java.time.Duration [^java.time.Duration this]
   (.negated this)))

(defn abs
  {:arglists '(["java.time.Duration"])}
  (^java.time.Duration [^java.time.Duration this]
   (.abs this)))

(defn between
  {:arglists '(["java.time.temporal.Temporal" "java.time.temporal.Temporal"])}
  (^java.time.Duration [^java.time.temporal.Temporal start-inclusive ^java.time.temporal.Temporal end-exclusive]
   (java.time.Duration/between start-inclusive end-exclusive)))

(defn get-seconds
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.getSeconds this)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAmount"])}
  (^java.time.Duration [^java.time.temporal.TemporalAmount amount]
   (java.time.Duration/from amount)))

(defn minus-nanos
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^java.time.Duration [^java.lang.CharSequence text]
   (java.time.Duration/parse text)))

(defn hash-code
  {:arglists '(["java.time.Duration"])}
  (^java.lang.Integer [^java.time.Duration this]
   (.hashCode this)))

(defn with-seconds
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long seconds]
   (.withSeconds this seconds)))

(defn of-minutes
  {:arglists '(["long"])}
  (^java.time.Duration [^long minutes]
   (java.time.Duration/ofMinutes minutes)))

(defn subtract-from
  {:arglists '(["java.time.Duration" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(defn compare-to
  {:arglists '(["java.time.Duration" "java.time.Duration"])}
  (^java.lang.Integer [^java.time.Duration this ^java.time.Duration other-duration]
   (.compareTo this other-duration)))

(defn plus-seconds
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(defn get
  {:arglists '(["java.time.Duration" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Duration this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(defn equals
  {:arglists '(["java.time.Duration" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Duration this ^java.lang.Object other-duration]
   (.equals this other-duration)))

(defn of-seconds
  {:arglists '(["long"] ["long" "long"])}
  (^java.time.Duration [^long seconds]
   (java.time.Duration/ofSeconds seconds))
  (^java.time.Duration [^long seconds ^long nano-adjustment]
   (java.time.Duration/ofSeconds seconds nano-adjustment)))

(defn minus-days
  {:arglists '(["java.time.Duration" "long"])}
  (^java.time.Duration [^java.time.Duration this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))

(defn to-days
  {:arglists '(["java.time.Duration"])}
  (^long [^java.time.Duration this]
   (.toDays this)))
