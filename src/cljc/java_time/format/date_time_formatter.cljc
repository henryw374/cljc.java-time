(ns cljc.java-time.format.date-time-formatter (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [DateTimeFormatter]])) (:refer-clojure :exclude [get range format min max next]) #? (:clj (:import [java.time.format DateTimeFormatter])))
(def iso-local-time (. java.time.format.DateTimeFormatter -ISO_LOCAL_TIME))
(def iso-ordinal-date (. java.time.format.DateTimeFormatter -ISO_ORDINAL_DATE))
(def iso-offset-date (. java.time.format.DateTimeFormatter -ISO_OFFSET_DATE))
(def iso-time (. java.time.format.DateTimeFormatter -ISO_TIME))
(def iso-local-date-time (. java.time.format.DateTimeFormatter -ISO_LOCAL_DATE_TIME))
(def iso-instant (. java.time.format.DateTimeFormatter -ISO_INSTANT))
(def rfc-1123-date-time (. java.time.format.DateTimeFormatter -RFC_1123_DATE_TIME))
(def iso-date (. java.time.format.DateTimeFormatter -ISO_DATE))
(def iso-week-date (. java.time.format.DateTimeFormatter -ISO_WEEK_DATE))
(def iso-offset-time (. java.time.format.DateTimeFormatter -ISO_OFFSET_TIME))
(def iso-local-date (. java.time.format.DateTimeFormatter -ISO_LOCAL_DATE))
(def iso-zoned-date-time (. java.time.format.DateTimeFormatter -ISO_ZONED_DATE_TIME))
(def iso-offset-date-time (. java.time.format.DateTimeFormatter -ISO_OFFSET_DATE_TIME))
(def iso-date-time (. java.time.format.DateTimeFormatter -ISO_DATE_TIME))
(def basic-iso-date (. java.time.format.DateTimeFormatter -BASIC_ISO_DATE))

(defn get-resolver-fields ^java.util.Set ([^java.time.format.DateTimeFormatter G__56724] (jti/getter resolverFields ^java.time.format.DateTimeFormatter G__56724)))











(defn parsed-leap-second ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedLeapSecond)))


(defn format ^java.lang.String ([^java.time.format.DateTimeFormatter G__56726 ^java.time.temporal.TemporalAccessor G__56727] (.format ^java.time.format.DateTimeFormatter G__56726 ^java.time.temporal.TemporalAccessor G__56727)))



(defn of-localized-date-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__56729 ^java.time.format.FormatStyle G__56730] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__56729 ^java.time.format.FormatStyle G__56730)) ([^java.time.format.FormatStyle G__56732] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__56732)))


(defn parse-unresolved ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__56733 ^java.lang.CharSequence G__56734 ^java.text.ParsePosition G__56735] (.parseUnresolved ^java.time.format.DateTimeFormatter G__56733 ^java.lang.CharSequence G__56734 ^java.text.ParsePosition G__56735)))


(defn of-localized-date ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__56737] (. java.time.format.DateTimeFormatter ofLocalizedDate ^java.time.format.FormatStyle G__56737)))



(defn with-locale ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56738 ^java.util.Locale G__56739] (.withLocale ^java.time.format.DateTimeFormatter G__56738 ^java.util.Locale G__56739)))


(defn format-to ([^java.time.format.DateTimeFormatter G__56740 ^java.time.temporal.TemporalAccessor G__56741 ^java.lang.Appendable G__56742] (.formatTo ^java.time.format.DateTimeFormatter G__56740 ^java.time.temporal.TemporalAccessor G__56741 ^java.lang.Appendable G__56742)))


(defn of-pattern ^java.time.format.DateTimeFormatter ([^java.lang.String G__56744 ^java.util.Locale G__56745] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__56744 ^java.util.Locale G__56745)) ([^java.lang.String G__56747] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__56747)))





(defn get-zone ^java.time.ZoneId ([^java.time.format.DateTimeFormatter G__56748] (jti/getter zone ^java.time.format.DateTimeFormatter G__56748)))








(defn with-resolver-fields ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56749 G__56750] (.withResolverFields ^java.time.format.DateTimeFormatter G__56749 G__56750)))



(defn with-resolver-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56751 ^java.time.format.ResolverStyle G__56752] (.withResolverStyle ^java.time.format.DateTimeFormatter G__56751 ^java.time.format.ResolverStyle G__56752)))



(defn get-chronology ^java.time.chrono.Chronology ([^java.time.format.DateTimeFormatter G__56753] (jti/getter chronology ^java.time.format.DateTimeFormatter G__56753)))


(defn to-string ^java.lang.String ([^java.time.format.DateTimeFormatter G__56754] (.toString ^java.time.format.DateTimeFormatter G__56754)))






(defn parsed-excess-days ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedExcessDays)))


(defn with-decimal-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56756 ^java.time.format.DecimalStyle G__56757] (.withDecimalStyle ^java.time.format.DateTimeFormatter G__56756 ^java.time.format.DecimalStyle G__56757)))








(defn with-zone ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56758 ^java.time.ZoneId G__56759] (.withZone ^java.time.format.DateTimeFormatter G__56758 ^java.time.ZoneId G__56759)))


(defn get-resolver-style ^java.time.format.ResolverStyle ([^java.time.format.DateTimeFormatter G__56760] (jti/getter resolverStyle ^java.time.format.DateTimeFormatter G__56760)))


(defn get-decimal-style ^java.time.format.DecimalStyle ([^java.time.format.DateTimeFormatter G__56761] (jti/getter decimalStyle ^java.time.format.DateTimeFormatter G__56761)))


(defn parse ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__56762 ^java.lang.CharSequence G__56763] (.parse ^java.time.format.DateTimeFormatter G__56762 ^java.lang.CharSequence G__56763)) ([^java.time.format.DateTimeFormatter G__56764 G__56765 G__56766] (.parse ^java.time.format.DateTimeFormatter G__56764 G__56765 G__56766)))


(defn get-locale ^java.util.Locale ([^java.time.format.DateTimeFormatter G__56767] (jti/getter locale ^java.time.format.DateTimeFormatter G__56767)))



(defn of-localized-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__56769] (. java.time.format.DateTimeFormatter ofLocalizedTime ^java.time.format.FormatStyle G__56769)))


(defn to-format ^java.text.Format ([^java.time.format.DateTimeFormatter G__56770 ^java.time.temporal.TemporalQuery G__56771] (.toFormat ^java.time.format.DateTimeFormatter G__56770 ^java.time.temporal.TemporalQuery G__56771)) ([^java.time.format.DateTimeFormatter G__56772] (.toFormat ^java.time.format.DateTimeFormatter G__56772)))


(defn parse-best ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__56773 ^java.lang.CharSequence G__56774 ^java.time.temporal.TemporalQuery G__56775] (.parseBest ^java.time.format.DateTimeFormatter G__56773 ^java.lang.CharSequence G__56774 ^java.time.temporal.TemporalQuery G__56775)))




(defn with-chronology ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__56776 ^java.time.chrono.Chronology G__56777] (.withChronology ^java.time.format.DateTimeFormatter G__56776 ^java.time.chrono.Chronology G__56777)))

