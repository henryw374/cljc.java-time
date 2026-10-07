(ns cljc.java-time.instant
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Instant]]))

(def min (goog.object/get java.time.Instant "MIN"))

(def epoch (goog.object/get java.time.Instant "EPOCH"))

(def max (goog.object/get java.time.Instant "MAX"))

(defn truncated-to
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(defn range
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^js/JSJoda.ValueRange [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.range this field))))

(defn of-epoch-second
  {:arglists '(["long"] ["long" "long"])}
  (^js/JSJoda.Instant [^long epoch-second]
   (js-invoke java.time.Instant "ofEpochSecond" epoch-second))
  (^js/JSJoda.Instant [^long epoch-second ^long nano-adjustment]
   (js-invoke java.time.Instant "ofEpochSecond" epoch-second nano-adjustment)))

(defn at-offset
  {:arglists '(["java.time.Instant" "java.time.ZoneOffset"])}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(defn minus-millis
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(defn get-nano
  {:arglists '(["java.time.Instant"])}
  (^int [^js/JSJoda.Instant this]
   (.nano this)))

(defn plus-millis
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(defn minus-seconds
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(defn plus-nanos
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(defn plus
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAmount"]
               ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount amount-to-add]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this amount-to-add)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this amount-to-add unit))))

(defn query
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^js/JSJoda.Instant this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(defn to-string
  {:arglists '(["java.time.Instant"])}
  (^java.lang.String [^js/JSJoda.Instant this]
   (.toString this)))

(defn is-before
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.isBefore this other-instant)))

(defn minus
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAmount"]
               ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this amount-to-subtract)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this amount-to-subtract unit))))

(defn at-zone
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneId zone]
   (.atZone this zone)))

(defn of-epoch-milli
  {:arglists '(["long"])}
  (^js/JSJoda.Instant [^long epoch-milli]
   (js-invoke java.time.Instant "ofEpochMilli" epoch-milli)))

(defn get-long
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(defn until
  {:arglists '(["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.until this end-exclusive unit))))

(defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^js/JSJoda.Instant [^js/JSJoda.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (js-invoke java.time.Instant "from" temporal))))

(defn is-after
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.isAfter this other-instant)))

(defn minus-nanos
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(defn is-supported
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"]
               ["java.time.Instant" "java.time.temporal.TemporalUnit"])}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Instant this arg0)))

(defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^js/JSJoda.Instant [^java.lang.CharSequence text]
   (js-invoke java.time.Instant "parse" text)))

(defn hash-code
  {:arglists '(["java.time.Instant"])}
  (^int [^js/JSJoda.Instant this]
   (.hashCode this)))

(defn adjust-into
  {:arglists '(["java.time.Instant" "java.time.temporal.Temporal"])}
  (^js/JSJoda.Temporal [^js/JSJoda.Instant this ^js/JSJoda.Temporal temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.adjustInto this temporal))))

(defn with
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAdjuster"]
               ["java.time.Instant" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAdjuster adjuster]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this adjuster)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field ^long new-value]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this field new-value))))

(defn now
  {:arglists '([] ["java.time.Clock"])}
  (^js/JSJoda.Instant []
   (js-invoke java.time.Instant "now"))
  (^js/JSJoda.Instant [^js/JSJoda.Clock clock]
   (js-invoke java.time.Instant "now" clock)))

(defn to-epoch-milli
  {:arglists '(["java.time.Instant"])}
  (^long [^js/JSJoda.Instant this]
   (.toEpochMilli this)))

(defn get-epoch-second
  {:arglists '(["java.time.Instant"])}
  (^long [^js/JSJoda.Instant this]
   (.epochSecond this)))

(defn compare-to
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^int [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.compareTo this other-instant)))

(defn plus-seconds
  {:arglists '(["java.time.Instant" "long"])}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(defn get
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^int [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.get this field))))

(defn equals
  {:arglists '(["java.time.Instant" "java.lang.Object"])}
  (^boolean [^js/JSJoda.Instant this ^java.lang.Object other-instant]
   (.equals this other-instant)))
