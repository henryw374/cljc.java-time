(ns cljc.java-time.offset-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time OffsetTime]))

(def min java.time.OffsetTime/MIN)

(def max java.time.OffsetTime/MAX)

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getHour this)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.LocalTime time ^java.time.ZoneOffset offset]
   (java.time.OffsetTime/of time offset))
  (^java.time.OffsetTime
   [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second
    ^java.time.ZoneOffset offset]
   (java.time.OffsetTime/of hour minute second nano-of-second offset)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getNano this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn plus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.OffsetTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn at-date
  {:arglists '(["java.time.OffsetTime" "java.time.LocalDate"])}
  (^java.time.OffsetDateTime [^java.time.OffsetTime this ^java.time.LocalDate date]
   (.atDate this date)))

(clojure.core/defn with-offset-same-instant
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(clojure.core/defn to-string
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.String [^java.time.OffsetTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn to-local-time
  {:arglists '(["java.time.OffsetTime"])}
  (^java.time.LocalTime [^java.time.OffsetTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-offset
  {:arglists '(["java.time.OffsetTime"])}
  (^java.time.ZoneOffset [^java.time.OffsetTime this]
   (.getOffset this)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn until
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.OffsetTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-offset-same-local
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.OffsetTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.OffsetTime/from temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.OffsetTime this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.OffsetTime this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.OffsetTime [^java.lang.CharSequence text]
   (java.time.OffsetTime/parse text))
  (^java.time.OffsetTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.OffsetTime/parse text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.lang.Integer second]
   (.withSecond this second)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.OffsetTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.OffsetTime [^java.time.OffsetTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.OffsetTime []
   (java.time.OffsetTime/now))
  (^java.time.OffsetTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.OffsetTime/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.OffsetTime/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn compare-to
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^java.lang.Integer [^java.time.OffsetTime this ^java.time.OffsetTime other]
   (.compareTo this other)))

(clojure.core/defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.OffsetTime [^java.time.Instant instant ^java.time.ZoneId zone]
   (java.time.OffsetTime/ofInstant instant zone)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^java.time.OffsetTime [^java.time.OffsetTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.OffsetTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.OffsetTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.OffsetTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.OffsetTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.OffsetTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
