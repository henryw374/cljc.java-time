(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time LocalTime)))

(def max java.time.LocalTime/MAX)

(def noon java.time.LocalTime/NOON)

(def midnight java.time.LocalTime/MIDNIGHT)

(def min java.time.LocalTime/MIN)

(defn minus-minutes
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn truncated-to
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-hour
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getHour this)))

(defn at-offset
  (^java.time.OffsetTime [^java.time.LocalTime this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute]
   (java.time.LocalTime/of hour minute))
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second]
   (java.time.LocalTime/of hour minute second))
  (^java.time.LocalTime
   [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second]
   (java.time.LocalTime/of hour minute second nano-of-second)))

(defn get-nano
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getNano this)))

(defn minus-seconds
  (^java.time.LocalTime [^java.time.LocalTime this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn get-second
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getSecond this)))

(defn plus-nanos
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn query
  (^java.lang.Object [^java.time.LocalTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn at-date
  (^java.time.LocalDateTime [^java.time.LocalTime this ^java.time.LocalDate date]
   (.atDate this date)))

(defn to-string
  (^java.lang.String [^java.time.LocalTime this]
   (.toString this)))

(defn is-before
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isBefore this other)))

(defn minus
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn to-second-of-day
  (^java.lang.Integer [^java.time.LocalTime this]
   (.toSecondOfDay this)))

(defn get-long
  (^long [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-nano
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn until
  (^long [^java.time.LocalTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn of-nano-of-day
  (^java.time.LocalTime [^long nano-of-day]
   (java.time.LocalTime/ofNanoOfDay nano-of-day)))

(defn from
  (^java.time.LocalTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalTime/from temporal)))

(defn is-after
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isAfter this other)))

(defn minus-nanos
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn is-supported
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.LocalTime this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn parse
  (^java.time.LocalTime [^java.lang.CharSequence text]
   (java.time.LocalTime/parse text))
  (^java.time.LocalTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalTime/parse text formatter)))

(defn with-second
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn get-minute
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getMinute this)))

(defn hash-code
  (^java.lang.Integer [^java.time.LocalTime this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.LocalTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalTime []
   (java.time.LocalTime/now))
  (^java.time.LocalTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [^java.time.Clock clock arg0]
                                            (java.time.LocalTime/now clock))
         (instance? java.time.ZoneId arg0) (let [^java.time.ZoneId zone arg0]
                                             (java.time.LocalTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn compare-to
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.LocalTime other]
   (.compareTo this other)))

(defn to-nano-of-day
  (^long [^java.time.LocalTime this]
   (.toNanoOfDay this)))

(defn plus-seconds
  (^java.time.LocalTime [^java.time.LocalTime this ^long secondsto-add]
   (.plusSeconds this secondsto-add)))

(defn get
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn of-second-of-day
  (^java.time.LocalTime [^long second-of-day]
   (java.time.LocalTime/ofSecondOfDay second-of-day)))

(defn equals
  (^java.lang.Boolean [^java.time.LocalTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  (^java.lang.String [^java.time.LocalTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
