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

(clojure.core/defn of-pattern
  {:arglists '(["java.lang.String"] ["java.lang.String" "java.util.Locale"])}
  (^js/JSJoda.DateTimeFormatter [^java.lang.String pattern]
   (js-invoke java.time.format.DateTimeFormatter "ofPattern" pattern))
  (^js/JSJoda.DateTimeFormatter [^java.lang.String pattern ^java.util.Locale locale]
   (js-invoke java.time.format.DateTimeFormatter "ofPattern" pattern locale)))

(clojure.core/defn parse-best
  {:arglists '(["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "[Ljava.time.temporal.TemporalQuery;"])}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text ^"java.lang.Class" queries]
   (.parseBest this text queries)))

(clojure.core/defn format-to
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor" "java.lang.Appendable"])}
  (^void [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalAccessor temporal ^java.lang.Appendable appendable]
   (.formatTo this temporal appendable)))

(clojure.core/defn get-decimal-style
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.DecimalStyle [^js/JSJoda.DateTimeFormatter this]
   (.decimalStyle this)))

(clojure.core/defn with-chronology
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.chrono.Chronology"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.Chronology chrono]
   (.withChronology this chrono)))

(clojure.core/defn get-resolver-style
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.ResolverStyle [^js/JSJoda.DateTimeFormatter this]
   (.resolverStyle this)))

(clojure.core/defn with-decimal-style
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.format.DecimalStyle"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.DecimalStyle decimal-style]
   (.withDecimalStyle this decimal-style)))

(clojure.core/defn get-locale
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^java.util.Locale [^js/JSJoda.DateTimeFormatter this]
   (.locale this)))

(clojure.core/defn to-string
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^java.lang.String [^js/JSJoda.DateTimeFormatter this]
   (.toString this)))

(clojure.core/defn parsed-leap-second
  {:arglists '([])}
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.format.DateTimeFormatter "parsedLeapSecond")))

(clojure.core/defn with-zone
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.ZoneId"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.ZoneId zone]
   (.withZone this zone)))

(clojure.core/defn parsed-excess-days
  {:arglists '([])}
  (^js/JSJoda.TemporalQuery []
   (js-invoke java.time.format.DateTimeFormatter "parsedExcessDays")))

(clojure.core/defn get-zone
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.ZoneId [^js/JSJoda.DateTimeFormatter this]
   (.zone this)))

(clojure.core/defn of-localized-date-time
  {:arglists '(["java.time.format.FormatStyle"] ["java.time.format.FormatStyle" "java.time.format.FormatStyle"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" date-time-style))
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-style ^js/JSJoda.FormatStyle time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" date-style time-style)))

(clojure.core/defn get-resolver-fields
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^java.util.Set [^js/JSJoda.DateTimeFormatter this]
   (.resolverFields this)))

(clojure.core/defn get-chronology
  {:arglists '(["java.time.format.DateTimeFormatter"])}
  (^js/JSJoda.Chronology [^js/JSJoda.DateTimeFormatter this]
   (.chronology this)))

(clojure.core/defn parse
  {:arglists '(["java.time.format.DateTimeFormatter" "java.lang.CharSequence"]
               ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]
               ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.time.temporal.TemporalQuery"])}
  (^js/JSJoda.TemporalAccessor [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text]
   (.parse this text))
  (^java.lang.Object [this arg0 arg1]
   (.parse ^js/JSJoda.DateTimeFormatter this arg0 arg1)))

(clojure.core/defn with-locale
  {:arglists '(["java.time.format.DateTimeFormatter" "java.util.Locale"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^java.util.Locale locale]
   (.withLocale this locale)))

(clojure.core/defn with-resolver-fields
  {:arglists '(["java.time.format.DateTimeFormatter" "[Ljava.time.temporal.TemporalField;"]
               ["java.time.format.DateTimeFormatter" "java.util.Set"])}
  (^js/JSJoda.DateTimeFormatter [this arg0]
   (.withResolverFields ^js/JSJoda.DateTimeFormatter this arg0)))

(clojure.core/defn parse-unresolved
  {:arglists '(["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"])}
  (^js/JSJoda.TemporalAccessor
   [^js/JSJoda.DateTimeFormatter this ^java.lang.CharSequence text ^java.text.ParsePosition position]
   (.parseUnresolved this text position)))

(clojure.core/defn of-localized-time
  {:arglists '(["java.time.format.FormatStyle"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle time-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedTime" time-style)))

(clojure.core/defn of-localized-date
  {:arglists '(["java.time.format.FormatStyle"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle date-style]
   (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDate" date-style)))

(clojure.core/defn format
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor"])}
  (^java.lang.String [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalAccessor temporal]
   (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.format this temporal))))

(clojure.core/defn to-format
  {:arglists '(["java.time.format.DateTimeFormatter"]
               ["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalQuery"])}
  (^java.text.Format [^js/JSJoda.DateTimeFormatter this]
   (.toFormat this))
  (^java.text.Format [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.TemporalQuery parse-query]
   (.toFormat this parse-query)))

(clojure.core/defn with-resolver-style
  {:arglists '(["java.time.format.DateTimeFormatter" "java.time.format.ResolverStyle"])}
  (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this ^js/JSJoda.ResolverStyle resolver-style]
   (.withResolverStyle this resolver-style)))
