(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalTime]))

(def max java.time.LocalTime/MAX)

(def noon java.time.LocalTime/NOON)

(def midnight java.time.LocalTime/MIDNIGHT)

(def min java.time.LocalTime/MIN)

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getHour this)))

(clojure.core/defn at-offset
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"])}
  (^java.time.OffsetTime [^java.time.LocalTime this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(clojure.core/defn of
  {:arglists '(["int" "int"] ["int" "int" "int"] ["int" "int" "int" "int"])}
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute]
   (java.time.LocalTime/of hour minute))
  (^java.time.LocalTime [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second]
   (java.time.LocalTime/of hour minute second))
  (^java.time.LocalTime
   [^java.lang.Integer hour ^java.lang.Integer minute ^java.lang.Integer second ^java.lang.Integer nano-of-second]
   (java.time.LocalTime/of hour minute second nano-of-second)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getNano this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(clojure.core/defn get-second
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(clojure.core/defn plus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(clojure.core/defn query
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.LocalTime this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn at-date
  {:arglists '(["java.time.LocalTime" "java.time.LocalDate"])}
  (^java.time.LocalDateTime [^java.time.LocalTime this ^java.time.LocalDate date]
   (.atDate this date)))

(clojure.core/defn to-string
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.String [^java.time.LocalTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^java.time.LocalTime [^java.time.LocalTime this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(clojure.core/defn to-second-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.toSecondOfDay this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^long [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn until
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.LocalTime this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn of-nano-of-day
  {:arglists '(["long"])}
  (^java.time.LocalTime [^long nano-of-day]
   (java.time.LocalTime/ofNanoOfDay nano-of-day)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.LocalTime [^java.time.temporal.TemporalAccessor temporal]
   (java.time.LocalTime/from temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0]
                          (.isSupported ^java.time.LocalTime this field))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
                        (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0]
                          (.isSupported ^java.time.LocalTime this unit))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^java.time.LocalTime [^java.lang.CharSequence text]
   (java.time.LocalTime/parse text))
  (^java.time.LocalTime [^java.lang.CharSequence text ^java.time.format.DateTimeFormatter formatter]
   (java.time.LocalTime/parse text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.LocalTime" "int"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer second]
   (.withSecond this second)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.LocalTime this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^java.time.LocalTime []
   (java.time.LocalTime/now))
  (^java.time.LocalTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [clock ^"java.time.Clock" arg0] (java.time.LocalTime/now clock))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [zone ^"java.time.ZoneId" arg0] (java.time.LocalTime/now zone))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn compare-to
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.LocalTime other]
   (.compareTo this other)))

(clojure.core/defn to-nano-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^long [^java.time.LocalTime this]
   (.toNanoOfDay this)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^java.time.LocalTime [^java.time.LocalTime this ^long secondsto-add]
   (.plusSeconds this secondsto-add)))

(clojure.core/defn get
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.temporal.TemporalField field]
   (.get this field)))

(clojure.core/defn of-second-of-day
  {:arglists '(["long"])}
  (^java.time.LocalTime [^long second-of-day]
   (java.time.LocalTime/ofSecondOfDay second-of-day)))

(clojure.core/defn equals
  {:arglists '(["java.time.LocalTime" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.LocalTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^java.time.LocalTime this ^java.time.format.DateTimeFormatter formatter]
   (.format this formatter)))
