(ns cljc.java-time.format.date-time-formatter (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [DateTimeFormatter]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.format DateTimeFormatter])))
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

(defn get-resolver-fields ^java.util.Set ([^java.time.format.DateTimeFormatter G__47590] (jti/getter resolverFields ^java.time.format.DateTimeFormatter G__47590)))











(defn parsed-leap-second ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedLeapSecond)))


(defn format ^java.lang.String ([^java.time.format.DateTimeFormatter G__47592 ^java.time.temporal.TemporalAccessor G__47593] (.format ^java.time.format.DateTimeFormatter G__47592 ^java.time.temporal.TemporalAccessor G__47593)))



(defn of-localized-date-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__47595 ^java.time.format.FormatStyle G__47596] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__47595 ^java.time.format.FormatStyle G__47596)) ([^java.time.format.FormatStyle G__47598] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__47598)))


(defn parse-unresolved ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__47599 ^java.lang.CharSequence G__47600 ^java.text.ParsePosition G__47601] (.parseUnresolved ^java.time.format.DateTimeFormatter G__47599 ^java.lang.CharSequence G__47600 ^java.text.ParsePosition G__47601)))


(defn of-localized-date ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__47603] (. java.time.format.DateTimeFormatter ofLocalizedDate ^java.time.format.FormatStyle G__47603)))



(defn with-locale ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47604 ^java.util.Locale G__47605] (.withLocale ^java.time.format.DateTimeFormatter G__47604 ^java.util.Locale G__47605)))


(defn format-to ([^java.time.format.DateTimeFormatter G__47606 ^java.time.temporal.TemporalAccessor G__47607 ^java.lang.Appendable G__47608] (.formatTo ^java.time.format.DateTimeFormatter G__47606 ^java.time.temporal.TemporalAccessor G__47607 ^java.lang.Appendable G__47608)))


(defn of-pattern ^java.time.format.DateTimeFormatter ([^java.lang.String G__47610 ^java.util.Locale G__47611] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__47610 ^java.util.Locale G__47611)) ([^java.lang.String G__47613] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__47613)))





(defn get-zone ^java.time.ZoneId ([^java.time.format.DateTimeFormatter G__47614] (jti/getter zone ^java.time.format.DateTimeFormatter G__47614)))








(defn with-resolver-fields ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47615 G__47616] (.withResolverFields ^java.time.format.DateTimeFormatter G__47615 G__47616)))



(defn with-resolver-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47617 ^java.time.format.ResolverStyle G__47618] (.withResolverStyle ^java.time.format.DateTimeFormatter G__47617 ^java.time.format.ResolverStyle G__47618)))



(defn get-chronology ^java.time.chrono.Chronology ([^java.time.format.DateTimeFormatter G__47619] (jti/getter chronology ^java.time.format.DateTimeFormatter G__47619)))


(defn to-string ^java.lang.String ([^java.time.format.DateTimeFormatter G__47620] (.toString ^java.time.format.DateTimeFormatter G__47620)))






(defn parsed-excess-days ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedExcessDays)))


(defn with-decimal-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47622 ^java.time.format.DecimalStyle G__47623] (.withDecimalStyle ^java.time.format.DateTimeFormatter G__47622 ^java.time.format.DecimalStyle G__47623)))








(defn with-zone ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47624 ^java.time.ZoneId G__47625] (.withZone ^java.time.format.DateTimeFormatter G__47624 ^java.time.ZoneId G__47625)))


(defn get-resolver-style ^java.time.format.ResolverStyle ([^java.time.format.DateTimeFormatter G__47626] (jti/getter resolverStyle ^java.time.format.DateTimeFormatter G__47626)))


(defn get-decimal-style ^java.time.format.DecimalStyle ([^java.time.format.DateTimeFormatter G__47627] (jti/getter decimalStyle ^java.time.format.DateTimeFormatter G__47627)))


(defn parse ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__47628 ^java.lang.CharSequence G__47629] (.parse ^java.time.format.DateTimeFormatter G__47628 ^java.lang.CharSequence G__47629)) ([^java.time.format.DateTimeFormatter G__47630 G__47631 G__47632] (.parse ^java.time.format.DateTimeFormatter G__47630 G__47631 G__47632)))


(defn get-locale ^java.util.Locale ([^java.time.format.DateTimeFormatter G__47633] (jti/getter locale ^java.time.format.DateTimeFormatter G__47633)))



(defn of-localized-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__47635] (. java.time.format.DateTimeFormatter ofLocalizedTime ^java.time.format.FormatStyle G__47635)))


(defn to-format ^java.text.Format ([^java.time.format.DateTimeFormatter G__47636 ^java.time.temporal.TemporalQuery G__47637] (.toFormat ^java.time.format.DateTimeFormatter G__47636 ^java.time.temporal.TemporalQuery G__47637)) ([^java.time.format.DateTimeFormatter G__47638] (.toFormat ^java.time.format.DateTimeFormatter G__47638)))


(defn parse-best ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__47639 ^java.lang.CharSequence G__47640 ^java.time.temporal.TemporalQuery G__47641] (.parseBest ^java.time.format.DateTimeFormatter G__47639 ^java.lang.CharSequence G__47640 ^java.time.temporal.TemporalQuery G__47641)))




(defn with-chronology ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__47642 ^java.time.chrono.Chronology G__47643] (.withChronology ^java.time.format.DateTimeFormatter G__47642 ^java.time.chrono.Chronology G__47643)))

