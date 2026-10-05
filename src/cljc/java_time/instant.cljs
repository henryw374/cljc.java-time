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
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalUnit arg0]
   (.truncatedTo this arg0)))

(clojure.core/defn range
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^js/JSJoda.ValueRange [^js/JSJoda.Instant this ^js/JSJoda.TemporalField arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.range this arg0))))

(clojure.core/defn of-epoch-second
  {:arglists (quote (["long"] ["long" "long"]))}
  (^js/JSJoda.Instant [^long arg0]
   (js-invoke java.time.Instant "ofEpochSecond" arg0))
  (^js/JSJoda.Instant [^long arg0 ^long arg1]
   (js-invoke java.time.Instant "ofEpochSecond" arg0 arg1)))

(clojure.core/defn at-offset
  {:arglists (quote (["java.time.Instant" "java.time.ZoneOffset"]))}
  (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneOffset arg0]
   (.atOffset this arg0)))

(clojure.core/defn minus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.minusMillis this arg0)))

(clojure.core/defn get-nano
  {:arglists (quote (["java.time.Instant"]))}
  (^int [^js/JSJoda.Instant this]
   (.nano this)))

(clojure.core/defn plus-millis
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.plusMillis this arg0)))

(clojure.core/defn minus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.minusSeconds this arg0)))

(clojure.core/defn plus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.plusNanos this arg0)))

(clojure.core/defn plus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this arg0)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this arg0 arg1))))

(clojure.core/defn query
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalQuery"]))}
  (^java.lang.Object [^js/JSJoda.Instant this ^js/JSJoda.TemporalQuery arg0]
   (.query this arg0)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.Instant"]))}
  (^java.lang.String [^js/JSJoda.Instant this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant arg0]
   (.isBefore this arg0)))

(clojure.core/defn minus
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"]
                     ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAmount arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this arg0)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0 ^js/JSJoda.TemporalUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this arg0 arg1))))

(clojure.core/defn at-zone
  {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))}
  (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant this ^js/JSJoda.ZoneId arg0]
   (.atZone this arg0)))

(clojure.core/defn of-epoch-milli
  {:arglists (quote (["long"]))}
  (^js/JSJoda.Instant [^long arg0]
   (js-invoke java.time.Instant "ofEpochMilli" arg0)))

(clojure.core/defn get-long
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.TemporalField arg0]
   (.getLong this arg0)))

(clojure.core/defn until
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))}
  (^long [^js/JSJoda.Instant this ^js/JSJoda.Temporal arg0 ^js/JSJoda.TemporalUnit arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.until this arg0 arg1))))

(clojure.core/defn from
  {:arglists (quote (["java.time.temporal.TemporalAccessor"]))}
  (^js/JSJoda.Instant [^js/JSJoda.TemporalAccessor arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (js-invoke java.time.Instant "from" arg0))))

(clojure.core/defn is-after
  {:arglists (quote (["java.time.Instant" "java.time.Instant"]))}
  (^boolean [^js/JSJoda.Instant this ^js/JSJoda.Instant arg0]
   (.isAfter this arg0)))

(clojure.core/defn minus-nanos
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.minusNanos this arg0)))

(clojure.core/defn is-supported
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]
                     ["java.time.Instant" "java.time.temporal.TemporalUnit"]))}
  (^boolean [this arg0]
   (.isSupported ^js/JSJoda.Instant this arg0)))

(clojure.core/defn parse
  {:arglists (quote (["java.lang.CharSequence"]))}
  (^js/JSJoda.Instant [^java.lang.CharSequence arg0]
   (js-invoke java.time.Instant "parse" arg0)))

(clojure.core/defn hash-code
  {:arglists (quote (["java.time.Instant"]))}
  (^int [^js/JSJoda.Instant this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal"]))}
  (^js/JSJoda.Temporal [^js/JSJoda.Instant this ^js/JSJoda.Temporal arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.adjustInto this arg0))))

(clojure.core/defn with
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAdjuster"]
                     ["java.time.Instant" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalAdjuster arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this arg0)))
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this arg0 arg1))))

(clojure.core/defn now
  {:arglists (quote ([] ["java.time.Clock"]))}
  (^js/JSJoda.Instant []
   (js-invoke java.time.Instant "now"))
  (^js/JSJoda.Instant [^js/JSJoda.Clock arg0]
   (js-invoke java.time.Instant "now" arg0)))

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
  (^int [^js/JSJoda.Instant this ^js/JSJoda.Instant arg0]
   (.compareTo this arg0)))

(clojure.core/defn plus-seconds
  {:arglists (quote (["java.time.Instant" "long"]))}
  (^js/JSJoda.Instant [^js/JSJoda.Instant this ^long arg0]
   (.plusSeconds this arg0)))

(clojure.core/defn get
  {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))}
  (^int [^js/JSJoda.Instant this ^js/JSJoda.TemporalField arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.get this arg0))))

(clojure.core/defn equals
  {:arglists (quote (["java.time.Instant" "java.lang.Object"]))}
  (^boolean [^js/JSJoda.Instant this ^java.lang.Object arg0]
   (.equals this arg0)))
