(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalTime]]))

(def max (goog.object/get java.time.LocalTime "MAX"))

(def noon (goog.object/get java.time.LocalTime "NOON"))

(def midnight (goog.object/get java.time.LocalTime "MIDNIGHT"))

(def min (goog.object/get java.time.LocalTime "MIN"))

(defn minus-minutes
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn truncated-to
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn range
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(defn get-hour
  (^int [^js/JSJoda.LocalTime this]
   (.hour this)))

(defn at-offset
  (^js/JSJoda.OffsetTime [^js/JSJoda.LocalTime this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of
  (^js/JSJoda.LocalTime [^int hour ^int minute]
   (js-invoke java.time.LocalTime "of" hour minute))
  (^js/JSJoda.LocalTime [^int hour ^int minute ^int second]
   (js-invoke java.time.LocalTime "of" hour minute second))
  (^js/JSJoda.LocalTime [^int hour ^int minute ^int second ^int nano-of-second]
   (js-invoke java.time.LocalTime "of" hour minute second nano-of-second)))

(defn get-nano
  (^int [^js/JSJoda.LocalTime this]
   (.nano this)))

(defn minus-seconds
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn get-second
  (^int [^js/JSJoda.LocalTime this]
   (.second this)))

(defn plus-nanos
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int hour]
   (.withHour this hour)))

(defn with-minute
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn query
  (^java.lang.Object [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn at-date
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalTime this ^js/JSJoda.LocalDate date]
   (.atDate this date)))

(defn to-string
  (^java.lang.String [^js/JSJoda.LocalTime this]
   (.toString this)))

(defn is-before
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.isBefore this other)))

(defn minus
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn to-second-of-day
  (^int [^js/JSJoda.LocalTime this]
   (.toSecondOfDay this)))

(defn get-long
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn with-nano
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(defn until
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(defn of-nano-of-day
  (^js/JSJoda.LocalTime [^long nano-of-day]
   (js-invoke java.time.LocalTime "ofNanoOfDay" nano-of-day)))

(defn from
  (^js/JSJoda.LocalTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalTime "from" temporal)))

(defn is-after
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn is-supported
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [^js/JSJoda.LocalTime this arg0]
   (.isSupported this arg0)))

(defn parse
  (^js/JSJoda.LocalTime [^java.lang.CharSequence text]
   (js-invoke java.time.LocalTime "parse" text))
  (^js/JSJoda.LocalTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalTime "parse" text formatter)))

(defn with-second
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int second]
   (.withSecond this second)))

(defn get-minute
  (^int [^js/JSJoda.LocalTime this]
   (.minute this)))

(defn hash-code
  (^int [^js/JSJoda.LocalTime this]
   (.hashCode this)))

(defn adjust-into
  (^js/JSJoda.Temporal [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.LocalTime []
   (js-invoke java.time.LocalTime "now"))
  (^js/JSJoda.LocalTime [arg0]
   (js-invoke java.time.LocalTime "now" arg0)))

(defn compare-to
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.compareTo this other)))

(defn to-nano-of-day
  (^long [^js/JSJoda.LocalTime this]
   (.toNanoOfDay this)))

(defn plus-seconds
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long secondsto-add]
   (.plusSeconds this secondsto-add)))

(defn get
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(defn of-second-of-day
  (^js/JSJoda.LocalTime [^long second-of-day]
   (js-invoke java.time.LocalTime "ofSecondOfDay" second-of-day)))

(defn equals
  (^boolean [^js/JSJoda.LocalTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^js/JSJoda.LocalTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
