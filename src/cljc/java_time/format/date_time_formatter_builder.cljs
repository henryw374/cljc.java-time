(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [DateTimeFormatterBuilder]]))

^{:column 11, :line 84}
(clojure.core/defn new
  {:arglists ^{:line 84, :column 45} (quote ^{:line 84, :column 52} ([]))}
  ^{:line 85, :column 13}
  (^java.time.format.DateTimeFormatterBuilder []
   ^{:line 85, :column 60} (java.time.format.DateTimeFormatterBuilder.)))

(clojure.core/defn to-formatter
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"]))}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this ^java.util.Locale arg0]
   (.toFormatter this arg0)))

(clojure.core/defn append-pattern
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String arg0]
   (.appendPattern this arg0)))

(clojure.core/defn append-value
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "java.time.format.SignStyle"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0]
   (.appendValue this arg0))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0 ^int arg1]
   (.appendValue this arg0 arg1))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0 ^int arg1 ^int arg2
    ^js/JSJoda.SignStyle arg3]
   (.appendValue this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-instant
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]
                     ["java.time.format.DateTimeFormatterBuilder" "int"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int arg0]
   (.appendInstant this arg0)))

(clojure.core/defn append-literal
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "char"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0]
   (.appendLiteral ^js/JSJoda.DateTimeFormatterBuilder this arg0)))

(clojure.core/defn optional-start
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(clojure.core/defn append-fraction
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "boolean"]))}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0 ^int arg1 ^int arg2 ^boolean arg3]
   (.appendFraction this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-optional
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter arg0]
   (.appendOptional this arg0)))

(clojure.core/defn optional-end
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(clojure.core/defn parse-lenient
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(clojure.core/defn pad-next
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "int" "char"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int arg0]
   (.padNext this arg0))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int arg0 ^char arg1]
   (.padNext this arg0 arg1)))

(clojure.core/defn append-chronology-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(clojure.core/defn append-zone-or-offset-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(clojure.core/defn parse-case-sensitive
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(clojure.core/defn parse-strict
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(clojure.core/defn append-chronology-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle arg0]
   (.appendChronologyText this arg0)))

(clojure.core/defn append-offset-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(clojure.core/defn append-zone-region-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(clojure.core/defn parse-defaulting
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0 ^long arg1]
   (.parseDefaulting this arg0 arg1)))

(clojure.core/defn append-zone-id
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(clojure.core/defn get-localized-date-time-pattern
  {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology"
                      "java.util.Locale"]))}
  (^java.lang.String
   [^js/JSJoda.FormatStyle arg0 ^js/JSJoda.FormatStyle arg1 ^js/JSJoda.Chronology arg2 ^java.util.Locale arg3]
   (js-invoke java.time.format.DateTimeFormatterBuilder "getLocalizedDateTimePattern" arg0 arg1 arg2 arg3)))

(clojure.core/defn parse-case-insensitive
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(clojure.core/defn append-localized-offset
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle arg0]
   (.appendLocalizedOffset this arg0)))

(clojure.core/defn append
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter arg0]
   (.append this arg0)))

(clojure.core/defn append-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                      "java.time.format.TextStyle"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField arg0]
   (.appendText this arg0))
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0 arg1]
   (.appendText ^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1)))

(clojure.core/defn append-localized
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle"
                      "java.time.format.FormatStyle"]))}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.FormatStyle arg0 ^js/JSJoda.FormatStyle arg1]
   (.appendLocalized this arg0 arg1)))

(clojure.core/defn append-offset
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String arg0 ^java.lang.String arg1]
   (.appendOffset this arg0 arg1)))

(clojure.core/defn append-value-reduced
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                      "java.time.chrono.ChronoLocalDate"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0 arg1 arg2 arg3]
   (.appendValueReduced ^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-zone-text
  {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]
                     ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"]))}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle arg0]
   (.appendZoneText this arg0))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle arg0 ^java.util.Set arg1]
   (.appendZoneText this arg0 arg1)))
