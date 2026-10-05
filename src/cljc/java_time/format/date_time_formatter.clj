(ns cljc.java-time.format.date-time-formatter
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format DateTimeFormatter]))

(def iso-local-time java.time.format.DateTimeFormatter/ISO_LOCAL_TIME)

(def iso-ordinal-date java.time.format.DateTimeFormatter/ISO_ORDINAL_DATE)

(def iso-offset-date java.time.format.DateTimeFormatter/ISO_OFFSET_DATE)

(def iso-time java.time.format.DateTimeFormatter/ISO_TIME)

(def iso-local-date-time java.time.format.DateTimeFormatter/ISO_LOCAL_DATE_TIME)

(def iso-instant java.time.format.DateTimeFormatter/ISO_INSTANT)

(def rfc-1123-date-time java.time.format.DateTimeFormatter/RFC_1123_DATE_TIME)

(def iso-date java.time.format.DateTimeFormatter/ISO_DATE)

(def iso-week-date java.time.format.DateTimeFormatter/ISO_WEEK_DATE)

(def iso-offset-time java.time.format.DateTimeFormatter/ISO_OFFSET_TIME)

(def iso-local-date java.time.format.DateTimeFormatter/ISO_LOCAL_DATE)

(def iso-zoned-date-time java.time.format.DateTimeFormatter/ISO_ZONED_DATE_TIME)

(def iso-offset-date-time java.time.format.DateTimeFormatter/ISO_OFFSET_DATE_TIME)

(def iso-date-time java.time.format.DateTimeFormatter/ISO_DATE_TIME)

(def basic-iso-date java.time.format.DateTimeFormatter/BASIC_ISO_DATE)

(clojure.core/defn of-pattern
  {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Locale"]))}
  (^java.time.format.DateTimeFormatter [^java.lang.String arg0]
   (java.time.format.DateTimeFormatter/ofPattern arg0))
  (^java.time.format.DateTimeFormatter [^java.lang.String arg0 ^java.util.Locale arg1]
   (java.time.format.DateTimeFormatter/ofPattern arg0 arg1)))

(clojure.core/defn parse-best
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence"
                      "[Ljava.time.temporal.TemporalQuery;"]))}
  (^java.time.temporal.TemporalAccessor
   [^java.time.format.DateTimeFormatter this ^java.lang.CharSequence arg0 ^"java.lang.Class" arg1]
   (.parseBest this arg0 arg1)))

(clojure.core/defn format-to
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor"
                      "java.lang.Appendable"]))}
  (^java.lang.Object
   [^java.time.format.DateTimeFormatter this ^java.time.temporal.TemporalAccessor arg0 ^java.lang.Appendable arg1]
   (.formatTo this arg0 arg1)))

(clojure.core/defn get-decimal-style
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.time.format.DecimalStyle [^java.time.format.DateTimeFormatter this]
   (.getDecimalStyle this)))

(clojure.core/defn with-chronology
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.chrono.Chronology"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatter this ^java.time.chrono.Chronology arg0]
   (.withChronology this arg0)))

(clojure.core/defn get-resolver-style
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.time.format.ResolverStyle [^java.time.format.DateTimeFormatter this]
   (.getResolverStyle this)))

(clojure.core/defn with-decimal-style
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.format.DecimalStyle"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatter this ^java.time.format.DecimalStyle arg0]
   (.withDecimalStyle this arg0)))

(clojure.core/defn get-locale
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.util.Locale [^java.time.format.DateTimeFormatter this]
   (.getLocale this)))

(clojure.core/defn to-string
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.lang.String [^java.time.format.DateTimeFormatter this]
   (.toString this)))

(clojure.core/defn parsed-leap-second
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalQuery []
   (java.time.format.DateTimeFormatter/parsedLeapSecond)))

(clojure.core/defn with-zone
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.ZoneId"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatter this ^java.time.ZoneId arg0]
   (.withZone this arg0)))

(clojure.core/defn parsed-excess-days
  {:arglists (quote ([]))}
  (^java.time.temporal.TemporalQuery []
   (java.time.format.DateTimeFormatter/parsedExcessDays)))

(clojure.core/defn get-zone
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.time.ZoneId [^java.time.format.DateTimeFormatter this]
   (.getZone this)))

(clojure.core/defn of-localized-date-time
  {:arglists (quote (["java.time.format.FormatStyle"] ["java.time.format.FormatStyle" "java.time.format.FormatStyle"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.FormatStyle arg0]
   (java.time.format.DateTimeFormatter/ofLocalizedDateTime arg0))
  (^java.time.format.DateTimeFormatter [^java.time.format.FormatStyle arg0 ^java.time.format.FormatStyle arg1]
   (java.time.format.DateTimeFormatter/ofLocalizedDateTime arg0 arg1)))

(clojure.core/defn get-resolver-fields
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.util.Set [^java.time.format.DateTimeFormatter this]
   (.getResolverFields this)))

(clojure.core/defn get-chronology
  {:arglists (quote (["java.time.format.DateTimeFormatter"]))}
  (^java.time.chrono.Chronology [^java.time.format.DateTimeFormatter this]
   (.getChronology this)))

(clojure.core/defn parse
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence"]
                     ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]
                     ["java.time.format.DateTimeFormatter" "java.lang.CharSequence"
                      "java.time.temporal.TemporalQuery"]))}
  (^java.time.temporal.TemporalAccessor [^java.time.format.DateTimeFormatter this ^java.lang.CharSequence arg0]
   (.parse this arg0))
  (^java.lang.Object [this arg0 arg1]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.CharSequence arg0)
                                        (clojure.core/instance? java.text.ParsePosition arg1))
                        (clojure.core/let [arg0 ^"java.lang.CharSequence" arg0
                                           arg1 ^"java.text.ParsePosition" arg1]
                          (.parse ^java.time.format.DateTimeFormatter this arg0 arg1))
                      (clojure.core/and (clojure.core/instance? java.lang.CharSequence arg0)
                                        (clojure.core/instance? java.time.temporal.TemporalQuery arg1))
                        (clojure.core/let [arg0 ^"java.lang.CharSequence" arg0
                                           arg1 ^"java.time.temporal.TemporalQuery" arg1]
                          (.parse ^java.time.format.DateTimeFormatter this arg0 arg1))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn with-locale
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.util.Locale"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatter this ^java.util.Locale arg0]
   (.withLocale this arg0)))

(clojure.core/defn with-resolver-fields
  {:arglists (quote (["java.time.format.DateTimeFormatter" "[Ljava.time.temporal.TemporalField;"]
                     ["java.time.format.DateTimeFormatter" "java.util.Set"]))}
  (^java.time.format.DateTimeFormatter [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/= java.time.temporal.TemporalField
                                                        (.getComponentType (clojure.core/class arg0))))
                        (clojure.core/let [arg0 ^"[Ljava.time.temporal.TemporalField;" arg0]
                          (.withResolverFields ^java.time.format.DateTimeFormatter this arg0))
                      (clojure.core/and (clojure.core/instance? java.util.Set arg0))
                        (clojure.core/let [arg0 ^"java.util.Set" arg0]
                          (.withResolverFields ^java.time.format.DateTimeFormatter this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn parse-unresolved
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]))}
  (^java.time.temporal.TemporalAccessor
   [^java.time.format.DateTimeFormatter this ^java.lang.CharSequence arg0 ^java.text.ParsePosition arg1]
   (.parseUnresolved this arg0 arg1)))

(clojure.core/defn of-localized-time
  {:arglists (quote (["java.time.format.FormatStyle"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.FormatStyle arg0]
   (java.time.format.DateTimeFormatter/ofLocalizedTime arg0)))

(clojure.core/defn of-localized-date
  {:arglists (quote (["java.time.format.FormatStyle"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.FormatStyle arg0]
   (java.time.format.DateTimeFormatter/ofLocalizedDate arg0)))

(clojure.core/defn format
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor"]))}
  (^java.lang.String [^java.time.format.DateTimeFormatter this ^java.time.temporal.TemporalAccessor arg0]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-clj (.format this arg0))))

(clojure.core/defn to-format
  {:arglists (quote (["java.time.format.DateTimeFormatter"]
                     ["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalQuery"]))}
  (^java.text.Format [^java.time.format.DateTimeFormatter this]
   (.toFormat this))
  (^java.text.Format [^java.time.format.DateTimeFormatter this ^java.time.temporal.TemporalQuery arg0]
   (.toFormat this arg0)))

(clojure.core/defn with-resolver-style
  {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.format.ResolverStyle"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatter this ^java.time.format.ResolverStyle arg0]
   (.withResolverStyle this arg0)))
