(ns cljc.java-time.format.date-time-formatter-builder
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import (java.time.format DateTimeFormatterBuilder)))

(defn new
  (^java.time.format.DateTimeFormatterBuilder []
   (java.time.format.DateTimeFormatterBuilder.)))

(defn to-formatter
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this]
   (.toFormatter this))
  (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this ^java.util.Locale locale]
   (.toFormatter this locale)))

(defn append-pattern
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String pattern]
   (.appendPattern this pattern)))

(defn append-value
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

(defn append-instant
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendInstant this))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer fractional-digits]
   (.appendInstant this fractional-digits)))

(defn append-literal
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "char"]
               ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this arg0]
   (cond (instance? java.lang.Character arg0) (let [literal (char arg0)]
                                                (.appendLiteral this literal))
         (instance? java.lang.String arg0) (let [^java.lang.String literal arg0]
                                             (.appendLiteral this literal))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn optional-start
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalStart this)))

(defn append-fraction
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^java.lang.Integer min-width
    ^java.lang.Integer max-width ^java.lang.Boolean decimal-point]
   (.appendFraction this field min-width max-width decimal-point)))

(defn append-optional
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter formatter]
   (.appendOptional this formatter)))

(defn optional-end
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.optionalEnd this)))

(defn parse-lenient
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseLenient this)))

(defn pad-next
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer pad-width]
   (.padNext this pad-width))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.Integer pad-width ^java.lang.Character pad-char]
   (.padNext this pad-width pad-char)))

(defn append-chronology-id
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendChronologyId this)))

(defn append-zone-or-offset-id
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneOrOffsetId this)))

(defn parse-case-sensitive
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseSensitive this)))

(defn parse-strict
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseStrict this)))

(defn append-chronology-text
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style]
   (.appendChronologyText this text-style)))

(defn append-offset-id
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendOffsetId this)))

(defn append-zone-region-id
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneRegionId this)))

(defn parse-defaulting
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field ^long value]
   (.parseDefaulting this field value)))

(defn append-zone-id
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.appendZoneId this)))

(defn get-localized-date-time-pattern
  (^java.lang.String
   [^java.time.format.FormatStyle date-style ^java.time.format.FormatStyle time-style
    ^java.time.chrono.Chronology chrono ^java.util.Locale locale]
   (java.time.format.DateTimeFormatterBuilder/getLocalizedDateTimePattern date-style time-style chrono locale)))

(defn parse-case-insensitive
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this]
   (.parseCaseInsensitive this)))

(defn append-localized-offset
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle style]
   (.appendLocalizedOffset this style)))

(defn append
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.DateTimeFormatter formatter]
   (.append this formatter)))

(defn append-text
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"
                "java.time.format.TextStyle"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"])}
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.temporal.TemporalField field]
   (.appendText this field))
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this arg0 arg1]
   (cond (and (instance? java.time.temporal.TemporalField arg0)
              (instance? java.time.format.TextStyle arg1))
           (let [^java.time.temporal.TemporalField field arg0
                 ^java.time.format.TextStyle text-style arg1]
             (.appendText this field text-style))
         (and (instance? java.time.temporal.TemporalField arg0)
              (instance? java.util.Map arg1))
           (let [^java.time.temporal.TemporalField field arg0
                 ^java.util.Map text-lookup arg1]
             (.appendText this field text-lookup))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn append-localized
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.FormatStyle date-style
    ^java.time.format.FormatStyle time-style]
   (.appendLocalized this date-style time-style)))

(defn append-offset
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.lang.String pattern ^java.lang.String no-offset-text]
   (.appendOffset this pattern no-offset-text)))

(defn append-value-reduced
  {:arglists '(["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]
               ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int"
                "java.time.chrono.ChronoLocalDate"])}
  (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this arg0 arg1 arg2 arg3]
   (cond (and (instance? java.time.temporal.TemporalField arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2)
              (instance? java.lang.Number arg3))
           (let [^java.time.temporal.TemporalField field arg0
                 width (int arg1)
                 max-width (int arg2)
                 base-value (int arg3)]
             (.appendValueReduced this field width max-width base-value))
         (and (instance? java.time.temporal.TemporalField arg0)
              (instance? java.lang.Number arg1)
              (instance? java.lang.Number arg2)
              (instance? java.time.chrono.ChronoLocalDate arg3))
           (let [^java.time.temporal.TemporalField field arg0
                 width (int arg1)
                 max-width (int arg2)
                 ^java.time.chrono.ChronoLocalDate base-date arg3]
             (.appendValueReduced this field width max-width base-date))
         :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))

(defn append-zone-text
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style]
   (.appendZoneText this text-style))
  (^java.time.format.DateTimeFormatterBuilder
   [^java.time.format.DateTimeFormatterBuilder this ^java.time.format.TextStyle text-style
    ^java.util.Set preferred-zones]
   (.appendZoneText this text-style preferred-zones)))
