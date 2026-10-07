(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalTime]))

(def max java.time.LocalTime/MAX)

(def noon java.time.LocalTime/NOON)

(def midnight java.time.LocalTime/MIDNIGHT)

(def min java.time.LocalTime/MIN)

(defn minus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(defn truncated-to
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(defn range
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(defn get-hour
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getHour this)))

(defn at-offset
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.LocalTime this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(defn of
  {:arglists '(["int" "int"] ["int" "int" "int"] ["int" "int" "int" "int"])}
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute]
   (java.time.LocalTime/of hour minute))
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second]
   (java.time.LocalTime/of hour minute second))
  (^java.time.LocalTime
   [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second]
   (java.time.LocalTime/of hour minute second nano-of-second)))

(defn get-nano
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getNano this)))

(defn minus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn get-second
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getSecond this)))

(defn plus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(defn with-hour
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(defn with-minute
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(defn plus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(defn query
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.LocalTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(defn at-date
  {:arglists '(["java.time.LocalTime" "java.time.LocalDate"])}
  (^java.time.LocalDateTime [^java.time.LocalTime this ^java.time.LocalDate date]
   (.atDate this date)))

(defn to-string
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.String [^java.time.LocalTime this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isBefore this other)))

(defn minus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(defn plus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(defn to-second-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.toSecondOfDay this)))

(defn get-long
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(defn with-nano
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(defn until
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.LocalTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(defn of-nano-of-day
  {:arglists '(["long"])}
  (^java.time.LocalTime [^long nano-of-day]
   (java.time.LocalTime/ofNanoOfDay nano-of-day)))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.LocalTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalTime/from temporal)))

(defn is-after
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isAfter this other)))

(defn minus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn is-supported
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (cond (and (instance? java.time.temporal.TemporalField arg0)) (let [field ^"java.time.temporal.TemporalField" arg0]
                                                                   (.isSupported ^java.time.LocalTime this field))
         (and (instance? java.time.temporal.ChronoUnit arg0)) (let [unit ^"java.time.temporal.ChronoUnit" arg0]
                                                                (.isSupported ^java.time.LocalTime this unit))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.LocalTime [^java.lang.CharSequence text]
   (java.time.LocalTime/parse text))
  (^java.time.LocalTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalTime/parse text formatter)))

(defn with-second
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer second]
   (.withSecond this second)))

(defn get-minute
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getMinute this)))

(defn hash-code
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.LocalTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(defn with
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalTime []
   (java.time.LocalTime/now))
  (^java.time.LocalTime [arg0]
   (cond (and (instance? java.time.Clock arg0)) (let [clock ^"java.time.Clock" arg0] (java.time.LocalTime/now clock))
         (and (instance? java.time.ZoneId arg0)) (let [zone ^"java.time.ZoneId" arg0] (java.time.LocalTime/now zone))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn compare-to
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.LocalTime other]
   (.compareTo this other)))

(defn to-nano-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^long [^java.time.LocalTime this]
   (.toNanoOfDay this)))

(defn plus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long secondsto-add]
   (.plusSeconds this secondsto-add)))

(defn get
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(defn of-second-of-day
  {:arglists '(["long"])}
  (^java.time.LocalTime [^long second-of-day]
   (java.time.LocalTime/ofSecondOfDay second-of-day)))

(defn equals
  {:arglists '(["java.time.LocalTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.lang.Object obj]
   (.equals this obj)))

(defn format
  {:arglists '(["java.time.LocalTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.LocalTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
