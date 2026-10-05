(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time LocalTime]))

(def max java.time.LocalTime/MAX)

(def noon java.time.LocalTime/NOON)

(def midnight java.time.LocalTime/MIDNIGHT)

(def min java.time.LocalTime/MIN)

(clojure.core/defn minus-minutes
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.minusMinutes this arg0)))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.ChronoUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^java.time.temporal.ValueRange [^java.time.LocalTime this ^java.time.temporal.TemporalField arg0]
   (.range this arg0)))

(clojure.core/defn get-hour
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getHour this)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))}
  (^java.time.OffsetTime [^java.time.LocalTime this ^java.time.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-hours
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.minusHours this arg0)))

(clojure.core/defn of
  {:arglists (quote (["int" "int"] ["int" "int" "int"] ["int" "int" "int" "int"]))}
  (^java.time.LocalTime [^java.lang.Integer arg0 ^java.lang.Integer arg1]
   (java.time.LocalTime/of arg0 arg1))
  (^java.time.LocalTime [^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2]
   (java.time.LocalTime/of arg0 arg1 arg2))
  (^java.time.LocalTime
   [^java.lang.Integer arg0 ^java.lang.Integer arg1 ^java.lang.Integer arg2 ^java.lang.Integer arg3]
   (java.time.LocalTime/of arg0 arg1 arg2 arg3)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getNano this)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn get-second
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getSecond this)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount arg0]
   (.plus this arg0))
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.plus this arg0 arg1)))

(clojure.core/defn with-hour
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer arg0]
   (.withHour this arg0)))

(clojure.core/defn with-minute
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer arg0]
   (.withMinute this arg0)))

(clojure.core/defn plus-minutes
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.plusMinutes this arg0)))

(clojure.core/defn query
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^java.time.LocalTime this ^java.time.temporal.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn at-date
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))}
  (^java.time.LocalDateTime [^java.time.LocalTime this ^java.time.LocalDate arg0]
   (.atDate this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.String [^java.time.LocalTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
                     ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAmount arg0]
   (.minus this arg0))
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0 ^java.time.temporal.ChronoUnit arg1]
   (.minus this arg0 arg1)))

(clojure.core/defn plus-hours
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.plusHours this arg0)))

(clojure.core/defn to-second-of-day
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.toSecondOfDay this)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^long [^java.time.LocalTime this ^java.time.temporal.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn with-nano
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer arg0]
   (.withNano this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^java.time.LocalTime this ^java.time.temporal.Temporal arg0 ^java.time.temporal.ChronoUnit arg1]
   (.until this arg0 arg1)))

(clojure.core/defn of-nano-of-day
  {:arglists (quote (["long"]))}
  (^java.time.LocalTime [^long arg0]
   (java.time.LocalTime/ofNanoOfDay arg0)))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^java.time.LocalTime [^java.time.temporal.TemporalAccessor arg0]
   (java.time.LocalTime/from arg0)))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.time.LocalTime arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]
                     ["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.LocalTime this arg0))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [arg0 ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.LocalTime this arg0))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))}
  (^java.time.LocalTime [^java.lang.CharSequence arg0]
   (java.time.LocalTime/parse arg0))
  (^java.time.LocalTime [^java.lang.CharSequence arg0 ^java.time.format.DateTimeFormatter arg1]
   (java.time.LocalTime/parse arg0 arg1)))

(clojure.core/defn with-second
  {:arglists (quote (["java.time.LocalTime" "int"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.lang.Integer arg0]
   (.withSecond this arg0)))

(clojure.core/defn get-minute
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.getMinute this)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))}
  (^java.time.temporal.Temporal [^java.time.LocalTime this ^java.time.temporal.Temporal arg0]
   (.adjustInto this arg0)))

(clojure.core/defn with
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalAdjuster arg0]
   (.with this arg0))
  (^java.time.LocalTime [^java.time.LocalTime this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.with this arg0 arg1)))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))}
  (^java.time.LocalTime []
   (java.time.LocalTime/now))
  (^java.time.LocalTime [arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.Clock arg0))
                        (clojure.core/let [arg0 ^"java.time.Clock" arg0] (java.time.LocalTime/now arg0))
                      (clojure.core/and (clojure.core/instance? java.time.ZoneId arg0))
                        (clojure.core/let [arg0 ^"java.time.ZoneId" arg0] (java.time.LocalTime/now arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.LocalTime arg0]
   (.compareTo this arg0)))

(clojure.core/defn to-nano-of-day
  {:arglists (quote (["java.time.LocalTime"]))}
  (^long [^java.time.LocalTime this]
   (.toNanoOfDay this)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.LocalTime" "long"]))}
  (^java.time.LocalTime [^java.time.LocalTime this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))}
  (^java.lang.Integer [^java.time.LocalTime this ^java.time.temporal.TemporalField arg0]
   (.get this arg0)))

(clojure.core/defn of-second-of-day
  {:arglists (quote (["long"]))}
  (^java.time.LocalTime [^long arg0]
   (java.time.LocalTime/ofSecondOfDay arg0)))

(clojure.core/defn equals
  {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))}
  (^java.lang.Boolean [^java.time.LocalTime this ^java.lang.Object arg0]
   (.equals this arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.LocalTime this ^java.time.format.DateTimeFormatter arg0]
   (.format this arg0)))
