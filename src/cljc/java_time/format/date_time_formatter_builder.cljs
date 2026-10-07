(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [DateTimeFormatterBuilder]]))

^{:column 11, :line 84}
(clojure.core/defn new
  {:arglists ^{:line 84, :column 45} '^{:line 84, :column 52} ([])}
  ^{:line 85, :column 13}
  (^java.time.format.DateTimeFormatterBuilder []
   ^{:line 85, :column 60} (java.time.format.DateTimeFormatterBuilder.)))

(clojure.core/defn to-formatter
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"]
               ["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this ^java.util.Locale locale]
   (.toFormatter this locale)))

(clojure.core/defn append-pattern
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String pattern]
   (.appendPattern this pattern)))

(clojure.core/defn append-value
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.format.SignStyle"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field]
   (.appendValue this field))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int width]
   (.appendValue this field width))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int min-width ^int max-width
    ^js/JSJoda.SignStyle sign-style]
   (.appendValue this field min-width max-width sign-style)))

(clojure.core/defn append-instant
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"] ["java.time.format.DateTimeFormatterBuilder" "int"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int fractional-digits]
   (.appendInstant this fractional-digits)))

(clojure.core/defn append-literal
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "char"]
               ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0]
   (.appendLiteral ^js/JSJoda.DateTimeFormatterBuilder this arg0)))

(clojure.core/defn optional-start
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(clojure.core/defn append-fraction
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"])}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int min-width ^int max-width
    ^boolean decimal-point]
   (.appendFraction this field min-width max-width decimal-point)))

(clojure.core/defn append-optional
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter formatter]
   (.appendOptional this formatter)))

(clojure.core/defn optional-end
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(clojure.core/defn parse-lenient
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(clojure.core/defn pad-next
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "int" "char"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int pad-width]
   (.padNext this pad-width))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int pad-width ^char pad-char]
   (.padNext this pad-width pad-char)))

(clojure.core/defn append-chronology-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(clojure.core/defn append-zone-or-offset-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(clojure.core/defn parse-case-sensitive
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(clojure.core/defn parse-strict
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(clojure.core/defn append-chronology-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style]
   (.appendChronologyText this text-style)))

(clojure.core/defn append-offset-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(clojure.core/defn append-zone-region-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(clojure.core/defn parse-defaulting
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"])}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^long value]
   (.parseDefaulting this field value)))

(clojure.core/defn append-zone-id
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(clojure.core/defn get-localized-date-time-pattern
  {:arglists '(["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology"
                "java.util.Locale"])}
  (^java.lang.String
   [^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style ^js/JSJoda.Chronology chrono
    ^java.util.Locale locale]
   (js-invoke java.time.format.DateTimeFormatterBuilder
              "getLocalizedDateTimePattern"
              date-style
              time-style
              chrono
              locale)))

(clojure.core/defn parse-case-insensitive
  {:arglists '(["java.time.format.DateTimeFormatterBuilder"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(clojure.core/defn append-localized-offset
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle style]
   (.appendLocalizedOffset this style)))

(clojure.core/defn append
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter formatter]
   (.append this formatter)))

(clojure.core/defn append-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field]
   (.appendText this field))
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0 arg1]
   (.appendText ^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1)))

(clojure.core/defn append-localized
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle"
                "java.time.format.FormatStyle"])}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style]
   (.appendLocalized this date-style time-style)))

(clojure.core/defn append-offset
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"])}
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String pattern ^java.lang.String no-offset-text]
   (.appendOffset this pattern no-offset-text)))

(clojure.core/defn append-value-reduced
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.chrono.ChronoLocalDate"])}
  (^js/JSJoda.DateTimeFormatterBuilder [this arg0 arg1 arg2 arg3]
   (.appendValueReduced ^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3)))

(clojure.core/defn append-zone-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style]
   (.appendZoneText this text-style))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style ^java.util.Set preferred-zones]
   (.appendZoneText this text-style preferred-zones)))
