(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.format DateTimeFormatterBuilder]))

^{:column 11, :line 84}
(clojure.core/defn new
  {:arglists ^{:line 84, :column 45} '^{:line 84, :column 52} ([])}
  ^{:line 85, :column 13}
  (^java.time.format.DateTimeFormatterBuilder []
   ^{:line 85, :column 60} (java.time.format.DateTimeFormatterBuilder.)))

(clojure.core/defn to-formatter
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"]
               ["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"])}
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this ^java.util.Locale locale]
   (.toFormatter this locale)))

(clojure.core/defn append-pattern
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String pattern]
   (.appendPattern this pattern)))

(clojure.core/defn append-value
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.format.SignStyle"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field]
   (.appendValue this field))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^java.lang.Integer width]
   (.appendValue this field width))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^java.lang.Integer min-width
    ^java.lang.Integer max-width ^java.time.format.SignStyle sign-style]
   (.appendValue this field min-width max-width sign-style)))

(clojure.core/defn append-instant
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"] ["java.time.format.DateTimeFormatterBuilder" "int"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer fractional-digits]
   (.appendInstant this fractional-digits)))

(clojure.core/defn append-literal
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "char"]
               ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^java.time.format.DateTimeFormatterBuilder [this arg0]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.Character arg0))
                        (clojure.core/let [literal ^"java.lang.Character" arg0]
                          (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this literal))
                      (clojure.core/and (clojure.core/instance? java.lang.String arg0))
                        (clojure.core/let [literal ^"java.lang.String" arg0]
                          (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this literal))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn optional-start
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(clojure.core/defn append-fraction
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^java.lang.Integer min-width
    ^java.lang.Integer max-width ^java.lang.Boolean decimal-point]
   (.appendFraction this field min-width max-width decimal-point)))

(clojure.core/defn append-optional
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter formatter]
   (.appendOptional this formatter)))

(clojure.core/defn optional-end
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(clojure.core/defn parse-lenient
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(clojure.core/defn pad-next
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "int" "char"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer pad-width]
   (.padNext this pad-width))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer pad-width ^java.lang.Character pad-char]
   (.padNext this pad-width pad-char)))

(clojure.core/defn append-chronology-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(clojure.core/defn append-zone-or-offset-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(clojure.core/defn parse-case-sensitive
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(clojure.core/defn parse-strict
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(clojure.core/defn append-chronology-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style]
   (.appendChronologyText this text-style)))

(clojure.core/defn append-offset-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(clojure.core/defn append-zone-region-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(clojure.core/defn parse-defaulting
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^long value]
   (.parseDefaulting this field value)))

(clojure.core/defn append-zone-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(clojure.core/defn get-localized-date-time-pattern
  {:arglists '(["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology"
                "java.util.Locale"])}
  (^java.lang.String
   [^java.time.format.FormatStyle date-style ^java.time.format.FormatStyle time-style
    ^java.time.chrono.Chronology chrono ^java.util.Locale locale]
   (java.time.format.DateTimeFormatterBuilder/getLocalizedDateTimePattern date-style time-style chrono locale)))

(clojure.core/defn parse-case-insensitive
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(clojure.core/defn append-localized-offset
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle style]
   (.appendLocalizedOffset this style)))

(clojure.core/defn append
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter formatter]
   (.append this formatter)))

(clojure.core/defn append-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field]
   (.appendText this field))
  (^java.time.format.DateTimeFormatterBuilder [this arg0 arg1]
   (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.time.format.TextStyle arg1))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0
                                           text-style ^"java.time.format.TextStyle" arg1]
                          (.appendText ^java.time.format.DateTimeFormatterBuilder this field text-style))
                      (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                                        (clojure.core/instance? java.util.Map arg1))
                        (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0
                                           text-lookup ^"java.util.Map" arg1]
                          (.appendText ^java.time.format.DateTimeFormatterBuilder this field text-lookup))
                      :else (throw (java.lang.IllegalArgumentException.
                                     "no corresponding java.time method with these args")))))

(clojure.core/defn append-localized
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle"
                "java.time.format.FormatStyle"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.FormatStyle date-style
    ^java.time.format.FormatStyle time-style]
   (.appendLocalized this date-style time-style)))

(clojure.core/defn append-offset
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String pattern ^java.lang.String no-offset-text]
   (.appendOffset this pattern no-offset-text)))

(clojure.core/defn append-value-reduced
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.chrono.ChronoLocalDate"])}
  (^java.time.format.DateTimeFormatterBuilder [this arg0 arg1 arg2 arg3]
   (clojure.core/cond
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                       (clojure.core/instance? java.lang.Number arg1)
                       (clojure.core/instance? java.lang.Number arg2)
                       (clojure.core/instance? java.lang.Number arg3))
       (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0
                          width (clojure.core/int arg1)
                          max-width (clojure.core/int arg2)
                          base-value (clojure.core/int arg3)]
         (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this field width max-width base-value))
     (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField arg0)
                       (clojure.core/instance? java.lang.Number arg1)
                       (clojure.core/instance? java.lang.Number arg2)
                       (clojure.core/instance? java.time.chrono.ChronoLocalDate arg3))
       (clojure.core/let [field ^"java.time.temporal.TemporalField" arg0
                          width (clojure.core/int arg1)
                          max-width (clojure.core/int arg2)
                          base-date ^"java.time.chrono.ChronoLocalDate" arg3]
         (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this field width max-width base-date))
     :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(clojure.core/defn append-zone-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style]
   (.appendZoneText this text-style))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style
    ^java.util.Set preferred-zones]
   (.appendZoneText this text-style preferred-zones)))
