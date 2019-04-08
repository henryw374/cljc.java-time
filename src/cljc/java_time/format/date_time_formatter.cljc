(ns cljc.java-time.format.date-time-formatter (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [DateTimeFormatter]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.format DateTimeFormatter])))

(defn get-resolver-fields ^java.util.Set ([^java.time.format.DateTimeFormatter G__36954] (jti/getter resolverFields ^java.time.format.DateTimeFormatter G__36954)))











(defn parsed-leap-second ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedLeapSecond)))


(defn format ^java.lang.String ([^java.time.format.DateTimeFormatter G__36956 ^java.time.temporal.TemporalAccessor G__36957] (.format ^java.time.format.DateTimeFormatter G__36956 ^java.time.temporal.TemporalAccessor G__36957)))



(defn of-localized-date-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__36959 ^java.time.format.FormatStyle G__36960] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__36959 ^java.time.format.FormatStyle G__36960)) ([^java.time.format.FormatStyle G__36962] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__36962)))


(defn parse-unresolved ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__36963 ^java.lang.CharSequence G__36964 ^java.text.ParsePosition G__36965] (.parseUnresolved ^java.time.format.DateTimeFormatter G__36963 ^java.lang.CharSequence G__36964 ^java.text.ParsePosition G__36965)))


(defn of-localized-date ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__36967] (. java.time.format.DateTimeFormatter ofLocalizedDate ^java.time.format.FormatStyle G__36967)))



(defn with-locale ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__36968 ^java.util.Locale G__36969] (.withLocale ^java.time.format.DateTimeFormatter G__36968 ^java.util.Locale G__36969)))


(defn format-to ([^java.time.format.DateTimeFormatter G__36970 ^java.time.temporal.TemporalAccessor G__36971 ^java.lang.Appendable G__36972] (.formatTo ^java.time.format.DateTimeFormatter G__36970 ^java.time.temporal.TemporalAccessor G__36971 ^java.lang.Appendable G__36972)))


(defn of-pattern ^java.time.format.DateTimeFormatter ([^java.lang.String G__36974 ^java.util.Locale G__36975] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__36974 ^java.util.Locale G__36975)) ([^java.lang.String G__36977] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__36977)))





(defn get-zone ^java.time.ZoneId ([^java.time.format.DateTimeFormatter G__36978] (jti/getter zone ^java.time.format.DateTimeFormatter G__36978)))








(defn with-resolver-fields ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__36979 G__36980] (.withResolverFields ^java.time.format.DateTimeFormatter G__36979 G__36980)))



(defn with-resolver-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__36981 ^java.time.format.ResolverStyle G__36982] (.withResolverStyle ^java.time.format.DateTimeFormatter G__36981 ^java.time.format.ResolverStyle G__36982)))



(defn get-chronology ^java.time.chrono.Chronology ([^java.time.format.DateTimeFormatter G__36983] (jti/getter chronology ^java.time.format.DateTimeFormatter G__36983)))


(defn to-string ^java.lang.String ([^java.time.format.DateTimeFormatter G__36984] (.toString ^java.time.format.DateTimeFormatter G__36984)))






(defn parsed-excess-days ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedExcessDays)))


(defn with-decimal-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__36986 ^java.time.format.DecimalStyle G__36987] (.withDecimalStyle ^java.time.format.DateTimeFormatter G__36986 ^java.time.format.DecimalStyle G__36987)))








(defn with-zone ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__36988 ^java.time.ZoneId G__36989] (.withZone ^java.time.format.DateTimeFormatter G__36988 ^java.time.ZoneId G__36989)))


(defn get-resolver-style ^java.time.format.ResolverStyle ([^java.time.format.DateTimeFormatter G__36990] (jti/getter resolverStyle ^java.time.format.DateTimeFormatter G__36990)))


(defn get-decimal-style ^java.time.format.DecimalStyle ([^java.time.format.DateTimeFormatter G__36991] (jti/getter decimalStyle ^java.time.format.DateTimeFormatter G__36991)))


(defn parse ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__36992 ^java.lang.CharSequence G__36993] (.parse ^java.time.format.DateTimeFormatter G__36992 ^java.lang.CharSequence G__36993)) ([^java.time.format.DateTimeFormatter G__36994 G__36995 G__36996] (.parse ^java.time.format.DateTimeFormatter G__36994 G__36995 G__36996)))


(defn get-locale ^java.util.Locale ([^java.time.format.DateTimeFormatter G__36997] (jti/getter locale ^java.time.format.DateTimeFormatter G__36997)))



(defn of-localized-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__36999] (. java.time.format.DateTimeFormatter ofLocalizedTime ^java.time.format.FormatStyle G__36999)))


(defn to-format ^java.text.Format ([^java.time.format.DateTimeFormatter G__37000 ^java.time.temporal.TemporalQuery G__37001] (.toFormat ^java.time.format.DateTimeFormatter G__37000 ^java.time.temporal.TemporalQuery G__37001)) ([^java.time.format.DateTimeFormatter G__37002] (.toFormat ^java.time.format.DateTimeFormatter G__37002)))


(defn parse-best ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__37003 ^java.lang.CharSequence G__37004 ^java.time.temporal.TemporalQuery<> G__37005] (.parseBest ^java.time.format.DateTimeFormatter G__37003 ^java.lang.CharSequence G__37004 ^java.time.temporal.TemporalQuery G__37005)))




(defn with-chronology ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__37006 ^java.time.chrono.Chronology G__37007] (.withChronology ^java.time.format.DateTimeFormatter G__37006 ^java.time.chrono.Chronology G__37007)))

