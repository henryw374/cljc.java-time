(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Duration]))

(def zero java.time.Duration/ZERO)

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(clojure.core/defn to-nanos
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toNanos this)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(clojure.core/defn of-days
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long days]
   (java.time.Duration/ofDays days)))

(clojure.core/defn is-negative
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isNegative this)))

(clojure.core/defn of
  {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^long amount ^java.time.temporal.ChronoUnit unit]
   (java.time.Duration/of amount unit)))

(clojure.core/defn is-zero
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Boolean [^java.time.Duration this]
   (.isZero this)))

(clojure.core/defn multiplied-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long multiplicand]
   (.multipliedBy this multiplicand)))

(clojure.core/defn with-nanos
  {:arglists (quote (["java.time.Duration" "int"]))}
  (^java.time.Duration [^java.time.Duration this ^java.lang.Integer nano-of-second]
   (.withNanos this nano-of-second)))

(clojure.core/defn get-units
  {:arglists (quote (["java.time.Duration"]))}
  (^java.util.List [^java.time.Duration this]
   (.getUnits this)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this]
   (.getNano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(clojure.core/defn to-minutes
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toMinutes this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.plus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn divided-by
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long divisor]
   (.dividedBy this divisor)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.String [^java.time.Duration this]
   (.toString this)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]
                     ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.Duration [^java.time.Duration this ^java.time.Duration duration]
   (.minus this duration))
  (^java.time.Duration [^java.time.Duration this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn add-to
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.addTo this temporal)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(clojure.core/defn plus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long days-to-add]
   (.plusDays this days-to-add)))

(clojure.core/defn of-hours
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long hours]
   (java.time.Duration/ofHours hours)))

(clojure.core/defn to-millis
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toMillis this)))

(clojure.core/defn to-hours
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toHours this)))

(clojure.core/defn of-nanos
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long nanos]
   (java.time.Duration/ofNanos nanos)))

(clojure.core/defn of-millis
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long millis]
   (java.time.Duration/ofMillis millis)))

(clojure.core/defn negated
  {:arglists (quote (["java.time.Duration"]))}
  (^java.time.Duration [^java.time.Duration this]
   (.negated this)))

(clojure.core/defn abs
  {:arglists (quote (["java.time.Duration"]))}
  (^java.time.Duration [^java.time.Duration this]
   (.abs this)))

(clojure.core/defn between
  {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))}
  (^java.time.Duration [^java.time.temporal.Temporal start-inclusive ^java.time.temporal.Temporal end-exclusive]
   (java.time.Duration/between start-inclusive end-exclusive)))

(clojure.core/defn get-seconds
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.getSeconds this)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAmount"]))}
  (^java.time.Duration [^java.time.temporal.TemporalAmount amount]
   (java.time.Duration/from amount)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^java.time.Duration [^java.lang.CharSequence text]
   (java.time.Duration/parse text)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this]
   (.hashCode this)))

(clojure.core/defn with-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long seconds]
   (.withSeconds this seconds)))

(clojure.core/defn of-minutes
  {:arglists (quote (["long"]))}
  (^java.time.Duration [^long minutes]
   (java.time.Duration/ofMinutes minutes)))

(clojure.core/defn subtract-from
  {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.Duration this ^java.time.temporal.Temporal temporal]
   (.subtractFrom this temporal)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Duration" "java.time.Duration"]))}
  (^java.lang.Integer [^java.time.Duration this ^java.time.Duration other-duration]
   (.compareTo this other-duration)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.Duration this ^java.time.temporal.ChronoUnit unit]
   (.get this unit)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Duration" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.Duration this ^java.lang.Object other-duration]
   (.equals this other-duration)))

(clojure.core/defn of-seconds
  {:arglists (quote (["long"] ["long" "long"]))}
  (^java.time.Duration [^long seconds]
   (java.time.Duration/ofSeconds seconds))
  (^java.time.Duration [^long seconds ^long nano-adjustment]
   (java.time.Duration/ofSeconds seconds nano-adjustment)))

(clojure.core/defn minus-days
  {:arglists (quote (["java.time.Duration" "long"]))}
  (^java.time.Duration [^java.time.Duration this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))

(clojure.core/defn to-days
  {:arglists (quote (["java.time.Duration"]))}
  (^long [^java.time.Duration this]
   (.toDays this)))
