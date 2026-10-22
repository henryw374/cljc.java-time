(ns cljc.java-time.instant
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time Instant)))

(def min java.time.Instant/MIN)

(def epoch java.time.Instant/EPOCH)

(def max java.time.Instant/MAX)

(defn truncated-to
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn range
  (^java.time.temporal.ValueRange [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.range this field))))

(defn of-epoch-second
  (^java.time.Instant [^long epoch-second]
   (java.time.Instant/ofEpochSecond epoch-second))
  (^java.time.Instant [^long epoch-second ^long nano-adjustment]
   (java.time.Instant/ofEpochSecond epoch-second nano-adjustment)))

(defn at-offset
  (^java.time.OffsetDateTime [^java.time.Instant this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-millis
  (^java.time.Instant [^java.time.Instant this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(defn get-nano
  (^java.lang.Integer [^java.time.Instant this]
   (.getNano this)))

(defn plus-millis
  (^java.time.Instant [^java.time.Instant this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(defn minus-seconds
  (^java.time.Instant [^java.time.Instant this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn plus-nanos
  (^java.time.Instant [^java.time.Instant this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount amount-to-add]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this amount-to-add)))
  (^java.time.Instant [^java.time.Instant this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this amount-to-add unit))))

(defn query
  (^java.lang.Object [^java.time.Instant this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn to-string
  (^java.lang.String [^java.time.Instant this]
   (.toString this)))

(defn is-before
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant other-instant]
   (.isBefore this other-instant)))

(defn minus
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this amount-to-subtract)))
  (^java.time.Instant [^java.time.Instant this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this amount-to-subtract unit))))

(defn at-zone
  (^java.time.ZonedDateTime [^java.time.Instant this ^java.time.ZoneId zone]
   (.atZone this zone)))

(defn of-epoch-milli
  (^java.time.Instant [^long epoch-milli]
   (java.time.Instant/ofEpochMilli epoch-milli)))

(defn get-long
  (^long [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn until
  (^long [^java.time.Instant this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.until this end-exclusive unit))))

(defn from
  (^java.time.Instant [^java.time.temporal.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (java.time.Instant/from temporal))))

(defn is-after
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant other-instant]
   (.isAfter this other-instant)))

(defn minus-nanos
  (^java.time.Instant [^java.time.Instant this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn is-supported
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"]
               ["java.time.Instant" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [^java.time.Instant this arg0]
   (cond (instance? java.time.temporal.TemporalField arg0) (let [^java.time.temporal.TemporalField field arg0]
                                                             (.isSupported this field))
         (instance? java.time.temporal.ChronoUnit arg0) (let [^java.time.temporal.ChronoUnit unit arg0]
                                                          (.isSupported this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn parse
  (^java.time.Instant [^java.lang.CharSequence text]
   (java.time.Instant/parse text)))

(defn hash-code
  (^java.lang.Integer [^java.time.Instant this]
   (.hashCode this)))

(defn adjust-into
  (^java.time.temporal.Temporal [^java.time.Instant this ^java.time.temporal.Temporal temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.adjustInto this temporal))))

(defn with
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAdjuster adjuster]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this adjuster)))
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalField field ^long new-value]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this field new-value))))

(defn now
  (^java.time.Instant []
   (java.time.Instant/now))
  (^java.time.Instant [^java.time.Clock clock]
   (java.time.Instant/now clock)))

(defn to-epoch-milli
  (^long [^java.time.Instant this]
   (.toEpochMilli this)))

(defn get-epoch-second
  (^long [^java.time.Instant this]
   (.getEpochSecond this)))

(defn compare-to
  (^java.lang.Integer [^java.time.Instant this ^java.time.Instant other-instant]
   (.compareTo this other-instant)))

(defn plus-seconds
  (^java.time.Instant [^java.time.Instant this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(defn get
  (^java.lang.Integer [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.get this field))))

(defn equals
  (^java.lang.Boolean [^java.time.Instant this ^java.lang.Object other-instant]
   (.equals this other-instant)))
