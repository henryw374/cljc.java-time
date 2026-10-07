(ns cljc.java-time.instant
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time Instant]))

(def min java.time.Instant/MIN)

(def epoch java.time.Instant/EPOCH)

(def max java.time.Instant/MAX)

(clojure.core/defn truncated-to
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalUnit"])}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.ChronoUnit unit]
   (.truncatedTo this unit)))

(clojure.core/defn range
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^java.time.temporal.ValueRange [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.range this field))))

(clojure.core/defn of-epoch-second
  {:arglists '(["long"] ["long" "long"])}
  (^java.time.Instant [^long epoch-second]
   (java.time.Instant/ofEpochSecond epoch-second))
  (^java.time.Instant [^long epoch-second ^long nano-adjustment]
   (java.time.Instant/ofEpochSecond epoch-second nano-adjustment)))

(clojure.core/defn at-offset
  {:arglists '(["java.time.Instant" "java.time.ZoneOffset"])}
  (^java.time.OffsetDateTime [^java.time.Instant this ^java.time.ZoneOffset offset]
   (.atOffset this offset)))

(clojure.core/defn minus-millis
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long millis-to-subtract]
   (.minusMillis this millis-to-subtract)))

(clojure.core/defn get-nano
  {:arglists '(["java.time.Instant"])}
  (^java.lang.Integer [^java.time.Instant this]
   (.getNano this)))

(clojure.core/defn plus-millis
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long millis-to-add]
   (.plusMillis this millis-to-add)))

(clojure.core/defn minus-seconds
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long seconds-to-subtract]
   (.minusSeconds this seconds-to-subtract)))

(clojure.core/defn plus-nanos
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long nanos-to-add]
   (.plusNanos this nanos-to-add)))

(clojure.core/defn plus
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAmount"]
               ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount amount-to-add]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this amount-to-add)))
  (^java.time.Instant [^java.time.Instant this ^long amount-to-add ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.plus this amount-to-add unit))))

(clojure.core/defn query
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalQuery"])}
  (^java.lang.Object [^java.time.Instant this ^java.time.temporal.TemporalQuery query]
   (.query this query)))

(clojure.core/defn to-string
  {:arglists '(["java.time.Instant"])}
  (^java.lang.String [^java.time.Instant this]
   (.toString this)))

(clojure.core/defn is-before
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant other-instant]
   (.isBefore this other-instant)))

(clojure.core/defn minus
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAmount"]
               ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"])}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAmount amount-to-subtract]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this amount-to-subtract)))
  (^java.time.Instant [^java.time.Instant this ^long amount-to-subtract ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.minus this amount-to-subtract unit))))

(clojure.core/defn at-zone
  {:arglists '(["java.time.Instant" "java.time.ZoneId"])}
  (^java.time.ZonedDateTime [^java.time.Instant this ^java.time.ZoneId zone]
   (.atZone this zone)))

(clojure.core/defn of-epoch-milli
  {:arglists '(["long"])}
  (^java.time.Instant [^long epoch-milli]
   (java.time.Instant/ofEpochMilli epoch-milli)))

(clojure.core/defn get-long
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^long [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (.getLong this field)))

(clojure.core/defn until
  {:arglists '(["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"])}
  (^long [^java.time.Instant this ^java.time.temporal.Temporal end-exclusive ^java.time.temporal.ChronoUnit unit]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.until this end-exclusive unit))))

(clojure.core/defn from
  {:arglists '(["java.time.temporal.TemporalAccessor"])}
  (^java.time.Instant [^java.time.temporal.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (java.time.Instant/from temporal))))

(clojure.core/defn is-after
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^java.lang.Boolean [^java.time.Instant this ^java.time.Instant other-instant]
   (.isAfter this other-instant)))

(clojure.core/defn minus-nanos
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long nanos-to-subtract]
   (.minusNanos this nanos-to-subtract)))

(clojure.core/defn is-supported
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"]
               ["java.time.Instant" "java.time.temporal.TemporalUnit"])}
  (^java.lang.Boolean [this arg0]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0))
       (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0] (.isSupported ^java.time.Instant this field))
     (clojure.core/and (clojure.core/instance? java.time.temporal.ChronoUnit arg0))
       (clojure.core/let [unit ^"java.time.temporal.ChronoUnit" arg0] (.isSupported ^java.time.Instant this unit))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn parse
  {:arglists '(["java.lang.CharSequence"])}
  (^java.time.Instant [^java.lang.CharSequence text]
   (java.time.Instant/parse text)))

(clojure.core/defn hash-code
  {:arglists '(["java.time.Instant"])}
  (^java.lang.Integer [^java.time.Instant this]
   (.hashCode this)))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.Instant" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.Instant this ^java.time.temporal.Temporal temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.adjustInto this temporal))))

(clojure.core/defn with
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalAdjuster"]
               ["java.time.Instant" "java.time.temporal.TemporalField" "long"])}
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalAdjuster adjuster]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this adjuster)))
  (^java.time.Instant [^java.time.Instant this ^java.time.temporal.TemporalField field ^long new-value]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.with this field new-value))))

(clojure.core/defn now
  {:arglists '([] ["java.time.Clock"])}
  (^java.time.Instant []
   (java.time.Instant/now))
  (^java.time.Instant [^java.time.Clock clock]
   (java.time.Instant/now clock)))

(clojure.core/defn to-epoch-milli
  {:arglists '(["java.time.Instant"])}
  (^long [^java.time.Instant this]
   (.toEpochMilli this)))

(clojure.core/defn get-epoch-second
  {:arglists '(["java.time.Instant"])}
  (^long [^java.time.Instant this]
   (.getEpochSecond this)))

(clojure.core/defn compare-to
  {:arglists '(["java.time.Instant" "java.time.Instant"])}
  (^java.lang.Integer [^java.time.Instant this ^java.time.Instant other-instant]
   (.compareTo this other-instant)))

(clojure.core/defn plus-seconds
  {:arglists '(["java.time.Instant" "long"])}
  (^java.time.Instant [^java.time.Instant this ^long seconds-to-add]
   (.plusSeconds this seconds-to-add)))

(clojure.core/defn get
  {:arglists '(["java.time.Instant" "java.time.temporal.TemporalField"])}
  (^java.lang.Integer [^java.time.Instant this ^java.time.temporal.TemporalField field]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.get this field))))

(clojure.core/defn equals
  {:arglists '(["java.time.Instant" "java.lang.Object"])}
  (^java.lang.Boolean [^java.time.Instant this ^java.lang.Object other-instant]
   (.equals this other-instant)))
