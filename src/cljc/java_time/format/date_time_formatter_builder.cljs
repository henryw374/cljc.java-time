(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [DateTimeFormatterBuilder]]))

(defn new
  (^java.time.format.DateTimeFormatterBuilder []
   (java.time.format.DateTimeFormatterBuilder.)))

(defn to-formatter
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this ^java.util.Locale locale]
   (.toFormatter this locale)))

(defn append-pattern
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String pattern]
   (.appendPattern this pattern)))

(defn append-value
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field]
   (.appendValue this field))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int width]
   (.appendValue this field width))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int min-width ^int max-width
    ^js/JSJoda.SignStyle sign-style]
   (.appendValue this field min-width max-width sign-style)))

(defn append-instant
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int fractional-digits]
   (.appendInstant this fractional-digits)))

(defn append-literal
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "char"]
               ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this arg0]
   (.appendLiteral this arg0)))

(defn optional-start
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(defn append-fraction
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^int min-width ^int max-width
    ^boolean decimal-point]
   (.appendFraction this field min-width max-width decimal-point)))

(defn append-optional
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter formatter]
   (.appendOptional this formatter)))

(defn optional-end
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(defn parse-lenient
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(defn pad-next
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int pad-width]
   (.padNext this pad-width))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^int pad-width ^char pad-char]
   (.padNext this pad-width pad-char)))

(defn append-chronology-id
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(defn append-zone-or-offset-id
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(defn parse-case-sensitive
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(defn parse-strict
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(defn append-chronology-text
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style]
   (.appendChronologyText this text-style)))

(defn append-offset-id
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(defn append-zone-region-id
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(defn parse-defaulting
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field ^long value]
   (.parseDefaulting this field value)))

(defn append-zone-id
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(defn get-localized-date-time-pattern
  (^java.lang.String
   [^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style ^js/JSJoda.Chronology chrono
    ^java.util.Locale locale]
   (js-invoke java.time.format.DateTimeFormatterBuilder
              "getLocalizedDateTimePattern"
              date-style
              time-style
              chrono
              locale)))

(defn parse-case-insensitive
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(defn append-localized-offset
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle style]
   (.appendLocalizedOffset this style)))

(defn append
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.DateTimeFormatter formatter]
   (.append this formatter)))

(defn append-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TemporalField field]
   (.appendText this field))
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1]
   (.appendText this arg0 arg1)))

(defn append-localized
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style]
   (.appendLocalized this date-style time-style)))

(defn append-offset
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^java.lang.String pattern ^java.lang.String no-offset-text]
   (.appendOffset this pattern no-offset-text)))

(defn append-value-reduced
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.chrono.ChronoLocalDate"])}
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3]
   (.appendValueReduced this arg0 arg1 arg2 arg3)))

(defn append-zone-text
  (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style]
   (.appendZoneText this text-style))
  (^js/JSJoda.DateTimeFormatterBuilder
   [^js/JSJoda.DateTimeFormatterBuilder this ^js/JSJoda.TextStyle text-style ^java.util.Set preferred-zones]
   (.appendZoneText this text-style preferred-zones)))
