(ns cljc.java-time.duration
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Duration]]))

(def zero (goog.object/get java.time.Duration "ZERO"))

(defn minus-minutes
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn to-nanos
  (^long [^js/JSJoda.Duration this]
   (.toNanos this)))

(defn minus-millis
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(defn minus-hours
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of-days
  (^js/JSJoda.Duration [^long days]
   (js-invoke java.time.Duration "ofDays" days)))

(defn is-negative
  (^boolean [^js/JSJoda.Duration this]
   (.isNegative this)))

(defn of
  (^js/JSJoda.Duration [^long amount ^js/JSJoda.TemporalUnit unit]
   (js-invoke java.time.Duration "of" amount unit)))

(defn is-zero
  (^boolean [^js/JSJoda.Duration this]
   (.isZero this)))

(defn multiplied-by
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long multiplicand]
   (.multipliedBy this multiplicand)))

(defn with-nanos
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^int nano-of-second]
   (.withNanos this nano-of-second)))

(defn get-units
  (^java.util.List [^js/JSJoda.Duration this]
   (.units this)))

(defn get-nano
  (^int [^js/JSJoda.Duration this]
   (.nano this)))

(defn plus-millis
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(defn to-minutes
  (^long [^js/JSJoda.Duration this]
   (.toMinutes this)))

(defn minus-seconds
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn plus-nanos
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^js/JSJoda.Duration duration]
   (.plus this duration))
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn divided-by
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long divisor]
   (.dividedBy this divisor)))

(defn plus-minutes
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn to-string
  (^java.lang.String [^js/JSJoda.Duration this]
   (.toString this)))

(defn minus
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^js/JSJoda.Duration duration]
   (.minus this duration))
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn add-to
  (^js/JSJoda.Temporal [^js/JSJoda.Duration this ^js/JSJoda.Temporal temporal]
   (.addTo this temporal)))

(defn plus-hours
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn plus-days
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long days-to-add]
   (.plusDays this days-to-add)))

(defn of-hours
  (^js/JSJoda.Duration [^long hours]
   (js-invoke java.time.Duration "ofHours" hours)))

(defn to-millis
  (^long [^js/JSJoda.Duration this]
   (.toMillis this)))

(defn to-hours
  (^long [^js/JSJoda.Duration this]
   (.toHours this)))

(defn of-nanos
  (^js/JSJoda.Duration [^long nanos]
   (js-invoke java.time.Duration "ofNanos" nanos)))

(defn of-millis
  (^js/JSJoda.Duration [^long millis]
   (js-invoke java.time.Duration "ofMillis" millis)))

(defn negated
  (^js/JSJoda.Duration [^js/JSJoda.Duration this]
   (.negated this)))

(defn abs
  (^js/JSJoda.Duration [^js/JSJoda.Duration this]
   (.abs this)))

(defn between
  (^js/JSJoda.Duration [^js/JSJoda.Temporal start-inclusive ^js/JSJoda.Temporal end-exclusive]
   (js-invoke java.time.Duration "between" start-inclusive end-exclusive)))

(defn get-seconds
  (^long [^js/JSJoda.Duration this]
   (.seconds this)))

(defn from
  (^js/JSJoda.Duration [^js/JSJoda.TemporalAmount amount]
   (js-invoke java.time.Duration "from" amount)))

(defn minus-nanos
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn parse
  (^js/JSJoda.Duration [^java.lang.CharSequence text]
   (js-invoke java.time.Duration "parse" text)))

(defn hash-code
  (^int [^js/JSJoda.Duration this]
   (.hashCode this)))

(defn with-seconds
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long seconds]
   (.withSeconds this seconds)))

(defn of-minutes
  (^js/JSJoda.Duration [^long minutes]
   (js-invoke java.time.Duration "ofMinutes" minutes)))

(defn subtract-from
  (^js/JSJoda.Temporal [^js/JSJoda.Duration this ^js/JSJoda.Temporal temporal]
   (.subtractFrom this temporal)))

(defn compare-to
  (^int [^js/JSJoda.Duration this ^js/JSJoda.Duration other-duration]
   (.compareTo this other-duration)))

(defn plus-seconds
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(defn get
  (^long [^js/JSJoda.Duration this ^js/JSJoda.TemporalUnit unit]
   (.get this unit)))

(defn equals
  (^boolean [^js/JSJoda.Duration this ^java.lang.Object other-duration]
   (.equals this other-duration)))

(defn of-seconds
  (^js/JSJoda.Duration [^long seconds]
   (js-invoke java.time.Duration "ofSeconds" seconds))
  (^js/JSJoda.Duration [^long seconds ^long nano-adjustment]
   (js-invoke java.time.Duration "ofSeconds" seconds nano-adjustment)))

(defn minus-days
  (^js/JSJoda.Duration [^js/JSJoda.Duration this ^long days-to-subtract]
   (.minusDays this days-to-subtract)))

(defn to-days
  (^long [^js/JSJoda.Duration this]
   (.toDays this)))
