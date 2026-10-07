(ns cljc.java-time.offset-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time OffsetTime)))

(def min java.time.OffsetTime/MIN)

(def max java.time.OffsetTime/MAX)

(defn minus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long minutes]
   (.minusMinutes this minutes)))

(defn truncated-to
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn range
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-hour
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getHour this)))

(defn minus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long hours]
   (.minusHours this hours)))

(defn of
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.LocalTime time ^java.time.ZoneOffset offset]
   (java.time.OffsetTime/of time offset))
  (^java.time.OffsetTime
   [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second
    ^java.time.ZoneOffset offset]
   (java.time.OffsetTime/of hour minute second nano-of-second offset)))

(defn is-equal
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isEqual this other)))

(defn get-nano
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getNano this)))

(defn minus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long seconds]
   (.minusSeconds this seconds)))

(defn get-second
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getSecond this)))

(defn plus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long nanos]
   (.plusNanos this nanos)))

(defn plus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long minutes]
   (.plusMinutes this minutes)))

(defn query
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.OffsetTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn at-date
  {:arglists '(["java.time.OffsetTime" "java.time.LocalDate"])}
  (^java.time.OffsetDateTime [^java.time.OffsetTime this ^java.time.LocalDate date]
   (.atDate this date)))

(defn with-offset-same-instant
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(defn to-string
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.String [^java.time.OffsetTime this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isBefore this other)))

(defn minus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long hours]
   (.plusHours this hours)))

(defn to-local-time
  {:arglists '(["java.time.OffsetTime"])}
  (^java.time.LocalTime [^java.time.OffsetTime this]
   (.toLocalTime this)))

(defn get-long
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn get-offset
  {:arglists '(["java.time.OffsetTime"])}
  (^java.time.ZoneOffset [^java.time.OffsetTime this]
   (.getOffset this)))

(defn with-nano
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn until
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.OffsetTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn with-offset-same-local
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.OffsetTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.OffsetTime/from temporal)))

(defn is-after
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long nanos]
   (.minusNanos this nanos)))

(defn is-supported
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.OffsetTime this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.OffsetTime [^java.lang.CharSequence text]
   (java.time.OffsetTime/parse text))
  (^java.time.OffsetTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.OffsetTime/parse text formatter)))

(defn with-second
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn get-minute
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getMinute this)))

(defn hash-code
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.OffsetTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.OffsetTime []
   (java.time.OffsetTime/now))
  (^java.time.OffsetTime [arg0]
   (cond (instance? java.time.Clock arg0) (let [clock ^"java.time.Clock" arg0]
                                            (java.time.OffsetTime/now clock))
         (instance? java.time.ZoneId arg0) (let [zone ^"java.time.ZoneId" arg0]
                                             (java.time.OffsetTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn compare-to
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.compareTo this other)))

(defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.OffsetTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.OffsetTime/ofInstant instant zone)))

(defn plus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long seconds]
   (.plusSeconds this seconds)))

(defn get
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn equals
  {:arglists '(["java.time.OffsetTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.OffsetTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.OffsetTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
