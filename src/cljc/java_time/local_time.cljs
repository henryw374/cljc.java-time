(ns cljc.java-time.local-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [LocalTime]]))

(def max (goog.object/get java.time.LocalTime "MAX"))

(def noon (goog.object/get java.time.LocalTime "NOON"))

(def midnight (goog.object/get java.time.LocalTime "MIDNIGHT"))

(def min (goog.object/get java.time.LocalTime "MIN"))

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long minutes-to-subtract]
   (.minusMinutes this minutes-to-subtract)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.hour this)))

(clojure.core/defn at-offset
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.LocalTime this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long hours-to-subtract]
   (.minusHours this hours-to-subtract)))

(clojure.core/defn of
  {:arglists '(["int" "int"] ["int" "int" "int"] ["int" "int" "int" "int"])}
  (^js/JSJoda.LocalTime [^int hour ^int minute]
   (js-invoke java.time.LocalTime "of" hour minute))
  (^js/JSJoda.LocalTime [^int hour ^int minute ^int second]
   (js-invoke java.time.LocalTime "of" hour minute second))
  (^js/JSJoda.LocalTime [^int hour ^int minute ^int second ^int nano-of-second]
   (js-invoke java.time.LocalTime "of" hour minute second nano-of-second)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.nano this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(clojure.core/defn get-second
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(clojure.core/defn plus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.LocalTime" "int"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.LocalTime" "int"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long minutes-to-add]
   (.plusMinutes this minutes-to-add)))

(clojure.core/defn query
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn at-date
  {:arglists '(["java.time.LocalTime" "java.time.LocalDate"])}
  (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalTime this ^js/JSJoda.LocalDate date]
   (.atDate this date)))

(clojure.core/defn to-string
  {:arglists '(["java.time.LocalTime"])}
  (^java.lang.String [^js/JSJoda.LocalTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAmount"]
               ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long hours-to-add]
   (.plusHours this hours-to-add)))

(clojure.core/defn to-second-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.toSecondOfDay this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.LocalTime" "int"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn until
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn of-nano-of-day
  {:arglists '(["long"])}
  (^js/JSJoda.LocalTime [^long nano-of-day]
   (js-invoke java.time.LocalTime "ofNanoOfDay" nano-of-day)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.LocalTime "from" temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^boolean [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"]
               ["java.time.LocalTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.LocalTime this arg0)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.LocalTime [^java.lang.CharSequence text]
   (js-invoke java.time.LocalTime "parse" text))
  (^js/JSJoda.LocalTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.LocalTime "parse" text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.LocalTime" "int"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^int second]
   (.withSecond this second)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.LocalTime" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.LocalTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.LocalTime []
   (js-invoke java.time.LocalTime "now"))
  (^js/JSJoda.LocalTime [arg0]
   (js-invoke java.time.LocalTime "now" arg0)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.LocalTime" "java.time.LocalTime"])}
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.LocalTime other]
   (.compareTo this other)))

(clojure.core/defn to-nano-of-day
  {:arglists '(["java.time.LocalTime"])}
  (^long [^js/JSJoda.LocalTime this]
   (.toNanoOfDay this)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.LocalTime" "long"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.LocalTime this ^long secondsto-add]
   (.plusSeconds this secondsto-add)))

(clojure.core/defn get
  {:arglists '(["java.time.LocalTime" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.LocalTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn of-second-of-day
  {:arglists '(["long"])}
  (^js/JSJoda.LocalTime [^long second-of-day]
   (js-invoke java.time.LocalTime "ofSecondOfDay" second-of-day)))

(clojure.core/defn equals
  {:arglists '(["java.time.LocalTime" "java.lang.Object"])}
  (^boolean [^js/JSJoda.LocalTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.LocalTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.LocalTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
