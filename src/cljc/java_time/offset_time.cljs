(ns cljc.java-time.offset-time
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [OffsetTime]]))

(def min (goog.object/get java.time.OffsetTime "MIN"))

(def max (goog.object/get java.time.OffsetTime "MAX"))

(clojure.core/defn minus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long minutes]
   (.minusMinutes this minutes)))

(clojure.core/defn truncated-to
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField field]
   (.range this field)))

(clojure.core/defn get-hour
  {:arglists '(["java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this]
   (.hour this)))

(clojure.core/defn minus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long hours]
   (.minusHours this hours)))

(clojure.core/defn of
  {:arglists '(["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.LocalTime time ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.OffsetTime "of" time offset))
  (^js/JSJoda.OffsetTime [^int hour ^int minute ^int second ^int nano-of-second ^js/JSJoda.ZoneOffset offset]
   (js-invoke java.time.OffsetTime "of" hour minute second nano-of-second offset)))

(clojure.core/defn is-equal
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime other]
   (.isEqual this other)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this]
   (.nano this)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long seconds]
   (.minusSeconds this seconds)))

(clojure.core/defn get-second
  {:arglists '(["java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this]
   (.second this)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long nanos]
   (.plusNanos this nanos)))

(clojure.core/defn plus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAmount amount-to-add]
   (.plus this amount-to-add))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (.plus this amount-to-add unit)))

(clojure.core/defn with-hour
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int hour]
   (.withHour this hour)))

(clojure.core/defn with-minute
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int minute]
   (.withMinute this minute)))

(clojure.core/defn plus-minutes
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long minutes]
   (.plusMinutes this minutes)))

(clojure.core/defn query
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn at-date
  {:arglists '(["java.time.OffsetTime" "java.time.LocalDate"])}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetTime this ^js/JSJoda.LocalDate date]
   (.atDate this date)))

(clojure.core/defn with-offset-same-instant
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.ZoneOffset offset]
   (.withOffsetSameInstant this offset)))

(clojure.core/defn to-string
  {:arglists '(["java.time.OffsetTime"])}
  (^java.lang.String [^js/JSJoda.OffsetTime this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime other]
   (.isBefore this other)))

(clojure.core/defn minus
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]
               ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (.minus this amount-to-subtract))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (.minus this amount-to-subtract unit)))

(clojure.core/defn plus-hours
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long hours]
   (.plusHours this hours)))

(clojure.core/defn to-local-time
  {:arglists '(["java.time.OffsetTime"])}
  (^js/JSJoda.LocalTime [^js/JSJoda.OffsetTime this]
   (.toLocalTime this)))

(clojure.core/defn get-long
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn get-offset
  {:arglists '(["java.time.OffsetTime"])}
  (^js/JSJoda.ZoneOffset [^js/JSJoda.OffsetTime this]
   (.offset this)))

(clojure.core/defn with-nano
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int nano-of-second]
   (.withNano this nano-of-second)))

(clojure.core/defn until
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.OffsetTime this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (.until this end-exclusive unit)))

(clojure.core/defn with-offset-same-local
  {:arglists '(["java.time.OffsetTime" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.ZoneOffset offset]
   (.withOffsetSameLocal this offset)))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.TemporalAccessor temporal]
   (js-invoke java.time.OffsetTime "from" temporal)))

(clojure.core/defn is-after
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^boolean [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime other]
   (.isAfter this other)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long nanos]
   (.minusNanos this nanos)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.OffsetTime this arg0)))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.OffsetTime [^java.lang.CharSequence text]
   (js-invoke java.time.OffsetTime "parse" text))
  (^js/JSJoda.OffsetTime [^java.lang.CharSequence text ^js/JSJoda.DateTimeFormatter formatter]
   (js-invoke java.time.OffsetTime "parse" text formatter)))

(clojure.core/defn with-second
  {:arglists '(["java.time.OffsetTime" "int"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^int second]
   (.withSecond this second)))

(clojure.core/defn get-minute
  {:arglists '(["java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this]
   (.minute this)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.OffsetTime this ^js/JSJoda.Temporal temporal]
   (.adjustInto this temporal)))

(clojure.core/defn with
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"]
               ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalAdjuster adjuster]
   (.with this adjuster))
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField field ^long new-value]
   (.with this field new-value)))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"] ["java.time.ZoneId"])}
  (^js/JSJoda.OffsetTime []
   (js-invoke java.time.OffsetTime "now"))
  (^js/JSJoda.OffsetTime [arg0]
   (js-invoke java.time.OffsetTime "now" arg0)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.OffsetTime" "java.time.OffsetTime"])}
  (^int [^js/JSJoda.OffsetTime this ^js/JSJoda.OffsetTime other]
   (.compareTo this other)))

(clojure.core/defn of-instant
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.Instant instant ^js/JSJoda.ZoneId zone]
   (js-invoke java.time.OffsetTime "ofInstant" instant zone)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.OffsetTime" "long"])}
  (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetTime this ^long seconds]
   (.plusSeconds this seconds)))

(clojure.core/defn get
  {:arglists '(["java.time.OffsetTime" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.OffsetTime this ^js/JSJoda.TemporalField field]
   (.get this field)))

(clojure.core/defn equals
  {:arglists '(["java.time.OffsetTime" "java.lang.Object"])}
  (^boolean [^js/JSJoda.OffsetTime this ^java.lang.Object obj]
   (.equals this obj)))

(clojure.core/defn format
  {:arglists '(["java.time.OffsetTime" "java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.OffsetTime this ^js/JSJoda.DateTimeFormatter formatter]
   (.format this formatter)))
