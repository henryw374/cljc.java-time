(ns cljc.java-time.format.date-time-formatter
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness]
            [goog.object]
            [java.time.format :refer [DateTimeFormatter]]))

(def iso-local-time (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_TIME"))

(def iso-ordinal-date (goog.object/get java.time.format.DateTimeFormatter "ISO_ORDINAL_DATE"))

(def iso-offset-date (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_DATE"))

(def iso-time (goog.object/get java.time.format.DateTimeFormatter "ISO_TIME"))

(def iso-local-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_DATE_TIME"))

(def iso-instant (goog.object/get java.time.format.DateTimeFormatter "ISO_INSTANT"))

(def rfc-1123-date-time (goog.object/get java.time.format.DateTimeFormatter "RFC_1123_DATE_TIME"))

(def iso-date (goog.object/get java.time.format.DateTimeFormatter "ISO_DATE"))

(def iso-week-date (goog.object/get java.time.format.DateTimeFormatter "ISO_WEEK_DATE"))

(def iso-offset-time (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_TIME"))

(def iso-local-date (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_DATE"))

(def iso-zoned-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_ZONED_DATE_TIME"))

(def iso-offset-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_DATE_TIME"))

(def iso-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_DATE_TIME"))

(def basic-iso-date (goog.object/get java.time.format.DateTimeFormatter "BASIC_ISO_DATE"))

(defn of-pattern
  (^js/JSJoda.DateTimeFormatter [^java.lang.String pattern]
   (js-invoke java.time.format.DateTimeFormatter "ofPattern" pattern))
  (^js/JSJoda.DateTimeFormatter [^java.lang.String pattern ^java.util.Locale locale]
   (js-invoke java.time.format.DateTimeFormatter "ofPattern" pattern locale)))

(defn parse-best
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text ^"java.lang.Class" queries]
   (.parseBest this text queries)))

(defn format-to
  (^void [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalAccessor temporal ^java.lang.Appendable appendable]
   (.formatTo this temporal appendable)))

(defn get-decimal-style
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DateTimeFormatter this]
   (.decimalStyle this)))

(defn with-chronology
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.Chronology chrono]
   (.withChronology this chrono)))

(defn get-resolver-style
  (^js/JSJoda.ResolverStyle [^js/JSJoda.DateTimeFormatter this]
   (.resolverStyle this)))

(defn with-decimal-style
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.DecimalStyle decimal-style]
   (.withDecimalStyle this decimal-style)))

(defn get-locale
  (^java.util.Locale [^js/JSJoda.DateTimeFormatter this]
   (.locale this)))

(defn to-string
  (^java.lang.String [^js/JSJoda.DateTimeFormatter this]
   (.toString this)))

(defn parsed-leap-second
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.format.DateTimeFormatter "parsedLeapSecond")))

(defn with-zone
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.ZoneId zone]
   (.withZone this zone)))

(defn parsed-excess-days
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.format.DateTimeFormatter "parsedExcessDays")))

(defn get-zone
  (^js/JSJoda.ZoneId [^js/JSJoda.DateTimeFormatter this]
   (.zone this)))

(defn of-localized-date-time
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" date-time-style))
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" date-style time-style)))

(defn get-resolver-fields
  (^java.util.Set [^js/JSJoda.DateTimeFormatter this]
   (.resolverFields this)))

(defn get-chronology
  (^js/JSJoda.Chronology [^js/JSJoda.DateTimeFormatter this]
   (.chronology this)))

(defn parse
  {:arglists '(["java.time.format.DateTimeFormatter" "java.lang.CharSequence"]
               ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]
               ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.time.temporal.TemporalQuery"])}
  (^js/JSJoda.TemporalAccessor [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text]
   (.parse this text))
  (^java.lang.Object [^js/JSJoda.DateTimeFormatter this arg0 arg1]
   (.parse this arg0 arg1)))

(defn with-locale
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^java.util.Locale locale]
   (.withLocale this locale)))

(defn with-resolver-fields
  {:arglists '(["java.time.format.DateTimeFormatter" "[Ljava.time.temporal.TemporalField;"]
               ["java.time.format.DateTimeFormatter" "java.util.Set"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this arg0]
   (.withResolverFields this arg0)))

(defn parse-unresolved
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text ^java.text.ParsePosition position]
   (.parseUnresolved this text position)))

(defn of-localized-time
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedTime" time-style)))

(defn of-localized-date
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDate" date-style)))

(defn format
  (^java.lang.String [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.format this temporal))))

(defn to-format
  (^java.text.Format [^js/JSJoda.DateTimeFormatter this]
   (.toFormat this))
  (^java.text.Format [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalQuery parse-query]
   (.toFormat this parse-query)))

(defn with-resolver-style
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.ResolverStyle resolver-style]
   (.withResolverStyle this resolver-style)))
