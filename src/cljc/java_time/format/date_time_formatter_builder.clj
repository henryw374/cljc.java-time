(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format DateTimeFormatterBuilder]))

^{:column 11, :line 84}
(clojure.core/defn new
  {:arglists ^{:line 84, :column 45} (quote ^{:line 84, :column 52} ([]))}
  ^{:line 85, :column 13}
  (^java.time.format.DateTimeFormatterBuilder []
   ^{:line 85, :column 60} (java.time.format.DateTimeFormatterBuilder.)))

(clojure.core/defn to-formatter
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"]))}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this ^java.util.Locale arg0]
   (.toFormatter this arg0)))

(clojure.core/defn append-pattern
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String arg0]
   (.appendPattern this arg0)))

(clojure.core/defn append-value
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "java.time.format.SignStyle"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0]
   (.appendValue this arg0))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0 ^java.lang.Integer arg1]
   (.appendValue this arg0 arg1))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0 ^java.lang.Integer arg1
    ^java.lang.Integer arg2 ^java.time.format.SignStyle arg3]
   (.appendValue this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-instant
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]
                     ["java.time.format.DateTimeFormatterBuilder" "int"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer arg0]
   (.appendInstant this arg0)))

(clojure.core/defn append-literal
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "char"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))}
  (^java.time.format.DateTimeFormatterBuilder [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Character arg0))
                        (clojure.core/let [arg0 ^"java.lang.Character" arg0]
                          (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this arg0))
                      (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [arg0 ^"java.lang.String" arg0]
                          (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this arg0))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn optional-start
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(clojure.core/defn append-fraction
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "boolean"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0 ^java.lang.Integer arg1
    ^java.lang.Integer arg2 ^java.lang.Boolean arg3]
   (.appendFraction this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-optional
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter arg0]
   (.appendOptional this arg0)))

(clojure.core/defn optional-end
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(clojure.core/defn parse-lenient
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(clojure.core/defn pad-next
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "int" "char"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer arg0]
   (.padNext this arg0))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer arg0 ^java.lang.Character arg1]
   (.padNext this arg0 arg1)))

(clojure.core/defn append-chronology-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(clojure.core/defn append-zone-or-offset-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(clojure.core/defn parse-case-sensitive
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(clojure.core/defn parse-strict
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(clojure.core/defn append-chronology-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle arg0]
   (.appendChronologyText this arg0)))

(clojure.core/defn append-offset-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(clojure.core/defn append-zone-region-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(clojure.core/defn parse-defaulting
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0 ^long arg1]
   (.parseDefaulting this arg0 arg1)))

(clojure.core/defn append-zone-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(clojure.core/defn get-localized-date-time-pattern
  {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology"
                      "java.util.Locale"]))}
  (^java.lang.String
   [^java.time.format.FormatStyle arg0 ^java.time.format.FormatStyle arg1 ^java.time.chrono.Chronology arg2
    ^java.util.Locale arg3]
   (java.time.format.DateTimeFormatterBuilder/getLocalizedDateTimePattern arg0 arg1 arg2 arg3)))

(clojure.core/defn parse-case-insensitive
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(clojure.core/defn append-localized-offset
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle arg0]
   (.appendLocalizedOffset this arg0)))

(clojure.core/defn append
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter arg0]
   (.append this arg0)))

(clojure.core/defn append-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                      "java.time.format.TextStyle"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField arg0]
   (.appendText this arg0))
  (^java.time.format.DateTimeFormatterBuilder [this arg0 arg1]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.time.format.TextStyle arg1))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0
                                           arg1 ^"java.time.format.TextStyle" arg1]
                          (.appendText ^java.time.format.DateTimeFormatterBuilder this arg0 arg1))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.util.Map arg1))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0
                                           arg1 ^"java.util.Map" arg1]
                          (.appendText ^java.time.format.DateTimeFormatterBuilder this arg0 arg1))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn append-localized
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle"
                      "java.time.format.FormatStyle"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.FormatStyle arg0
    ^java.time.format.FormatStyle arg1]
   (.appendLocalized this arg0 arg1)))

(clojure.core/defn append-offset
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String arg0 ^java.lang.String arg1]
   (.appendOffset this arg0 arg1)))

(clojure.core/defn append-value-reduced
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "java.time.chrono.ChronoLocalDate"]))}
  (^java.time.format.DateTimeFormatterBuilder [this arg0 arg1 arg2 arg3]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.lang.Number arg3))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)
                                           arg3 (clojure.core/int arg3)]
                          (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.lang.Number arg1)
                                        (clojure.core/instance? java.lang.Number arg2)
                                        (clojure.core/instance? java.time.chrono.ChronoLocalDate arg3))
                        (clojure.core/let [arg0 ^"java.time.temporal.TemporalField" arg0
                                           arg1 (clojure.core/int arg1)
                                           arg2 (clojure.core/int arg2)
                                           arg3 ^"java.time.chrono.ChronoLocalDate" arg3]
                          (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn append-zone-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"]))}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle arg0]
   (.appendZoneText this arg0))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle arg0 ^java.util.Set arg1]
   (.appendZoneText this arg0 arg1)))
