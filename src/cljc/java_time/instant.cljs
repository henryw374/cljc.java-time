(ns cljc.java-time.instant
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time :refer [Instant]]))

(def min (goog.object/get java.time.Instant "MIN"))

(def epoch (goog.object/get java.time.Instant "EPOCH"))

(def max (goog.object/get java.time.Instant "MAX"))

(clojure.core/defn truncated-to
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.range this field))))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long"] ["long" "long"]))}
  (^js/JSJoda.Instant [^long epoch-second]
   (js-invoke java.time.Instant "ofEpochSecond" epoch-second))
  (^js/JSJoda.Instant [^long epoch-second ^long nano-adjustment]
   (js-invoke java.time.Instant "ofEpochSecond" epoch-second nano-adjustment)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.Instant" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Instant"]))}
  (^int [^js/JSJoda.Instant this]
   (.nano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount amount-to-add]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this amount-to-add)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long amount-to-add ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this amount-to-add unit))))

(clojure.core/defn query
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Instant this ^js/JSJoda.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Instant"]))}
  (^java.lang.String [^js/JSJoda.Instant this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.isBefore this other-instant)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount amount-to-subtract]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this amount-to-subtract)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long amount-to-subtract ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this amount-to-subtract unit))))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneId zone]
   (.atZone this zone)))

(clojure.core/defn of-epoch-milli
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Instant [^long epoch-milli]
   (js-invoke java.time.Instant "ofEpochMilli" epoch-milli)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (.getLong this field)))

(clojure.core/defn until
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.Temporal end-exclusive ^js/JSJoda.TemporalUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.until this end-exclusive unit))))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.Instant [^js/JSJoda.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (js-invoke java.time.Instant "from" temporal))))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.isAfter this other-instant)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]
                     ["java.time.Instant" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Instant this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^js/JSJoda.Instant [^java.lang.CharSequence text]
   (js-invoke java.time.Instant "parse" text)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Instant"]))}
  (^int [^js/JSJoda.Instant this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Instant this ^js/JSJoda.Temporal temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.adjustInto this temporal))))

(clojure.core/defn with
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Instant" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAdjuster adjuster]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this adjuster)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field ^long new-value]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this field new-value))))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"]))}
  (^js/JSJoda.Instant []
   (js-invoke java.time.Instant "now"))
  (^js/JSJoda.Instant [^js/JSJoda.Clock clock]
   (js-invoke java.time.Instant "now" clock)))

(clojure.core/defn to-epoch-milli
  {:arglists (quote (["java.time.Instant"]))}
  (^long [^js/JSJoda.Instant this]
   (.toEpochMilli this)))

(clojure.core/defn get-epoch-second
  {:arglists (quote (["java.time.Instant"]))}
  (^long [^js/JSJoda.Instant this]
   (.epochSecond this)))

(clojure.core/defn compare-to
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^int [^js/JSJoda.Instant this ^js/JSJoda.Instant other-instant]
   (.compareTo this other-instant)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Instant this ^js/JSJoda.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.get this field))))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Instant" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Instant this ^java.lang.Object other-instant]
   (.equals this other-instant)))
