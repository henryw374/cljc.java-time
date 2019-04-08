(ns cljc.java-time.format.date-time-formatter (:require [cljs.java-time.interop :as jti] #? (:cljs [java-time.format :refer [DateTimeFormatter]])) (:refer-clojure :exclude [get range format]) #? (:clj (:import [java.time.format DateTimeFormatter])))

(defn get-resolver-fields ^java.util.Set ([^java.time.format.DateTimeFormatter G__35464] (jti/getter resolverFields ^java.time.format.DateTimeFormatter G__35464)))











(defn parsed-leap-second ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedLeapSecond)))


(defn format ^java.lang.String ([^java.time.format.DateTimeFormatter G__35466 ^java.time.temporal.TemporalAccessor G__35467] (.format ^java.time.format.DateTimeFormatter G__35466 ^java.time.temporal.TemporalAccessor G__35467)))



(defn of-localized-date-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__35469 ^java.time.format.FormatStyle G__35470] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__35469 ^java.time.format.FormatStyle G__35470)) ([^java.time.format.FormatStyle G__35472] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__35472)))


(defn parse-unresolved ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__35473 ^java.lang.CharSequence G__35474 ^java.text.ParsePosition G__35475] (.parseUnresolved ^java.time.format.DateTimeFormatter G__35473 ^java.lang.CharSequence G__35474 ^java.text.ParsePosition G__35475)))


(defn of-localized-date ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__35477] (. java.time.format.DateTimeFormatter ofLocalizedDate ^java.time.format.FormatStyle G__35477)))



(defn with-locale ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35478 ^java.util.Locale G__35479] (.withLocale ^java.time.format.DateTimeFormatter G__35478 ^java.util.Locale G__35479)))


(defn format-to ([^java.time.format.DateTimeFormatter G__35480 ^java.time.temporal.TemporalAccessor G__35481 ^java.lang.Appendable G__35482] (.formatTo ^java.time.format.DateTimeFormatter G__35480 ^java.time.temporal.TemporalAccessor G__35481 ^java.lang.Appendable G__35482)))


(defn of-pattern ^java.time.format.DateTimeFormatter ([^java.lang.String G__35484 ^java.util.Locale G__35485] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__35484 ^java.util.Locale G__35485)) ([^java.lang.String G__35487] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__35487)))





(defn get-zone ^java.time.ZoneId ([^java.time.format.DateTimeFormatter G__35488] (jti/getter zone ^java.time.format.DateTimeFormatter G__35488)))








(defn with-resolver-fields ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35489 G__35490] (.withResolverFields ^java.time.format.DateTimeFormatter G__35489 G__35490)))



(defn with-resolver-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35491 ^java.time.format.ResolverStyle G__35492] (.withResolverStyle ^java.time.format.DateTimeFormatter G__35491 ^java.time.format.ResolverStyle G__35492)))



(defn get-chronology ^java.time.chrono.Chronology ([^java.time.format.DateTimeFormatter G__35493] (jti/getter chronology ^java.time.format.DateTimeFormatter G__35493)))


(defn to-string ^java.lang.String ([^java.time.format.DateTimeFormatter G__35494] (.toString ^java.time.format.DateTimeFormatter G__35494)))






(defn parsed-excess-days ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedExcessDays)))


(defn with-decimal-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35496 ^java.time.format.DecimalStyle G__35497] (.withDecimalStyle ^java.time.format.DateTimeFormatter G__35496 ^java.time.format.DecimalStyle G__35497)))








(defn with-zone ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35498 ^java.time.ZoneId G__35499] (.withZone ^java.time.format.DateTimeFormatter G__35498 ^java.time.ZoneId G__35499)))


(defn get-resolver-style ^java.time.format.ResolverStyle ([^java.time.format.DateTimeFormatter G__35500] (jti/getter resolverStyle ^java.time.format.DateTimeFormatter G__35500)))


(defn get-decimal-style ^java.time.format.DecimalStyle ([^java.time.format.DateTimeFormatter G__35501] (jti/getter decimalStyle ^java.time.format.DateTimeFormatter G__35501)))


(defn parse ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__35502 ^java.lang.CharSequence G__35503] (.parse ^java.time.format.DateTimeFormatter G__35502 ^java.lang.CharSequence G__35503)) ([^java.time.format.DateTimeFormatter G__35504 G__35505 G__35506] (.parse ^java.time.format.DateTimeFormatter G__35504 G__35505 G__35506)))


(defn get-locale ^java.util.Locale ([^java.time.format.DateTimeFormatter G__35507] (jti/getter locale ^java.time.format.DateTimeFormatter G__35507)))



(defn of-localized-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__35509] (. java.time.format.DateTimeFormatter ofLocalizedTime ^java.time.format.FormatStyle G__35509)))


(defn to-format ^java.text.Format ([^java.time.format.DateTimeFormatter G__35510 ^java.time.temporal.TemporalQuery G__35511] (.toFormat ^java.time.format.DateTimeFormatter G__35510 ^java.time.temporal.TemporalQuery G__35511)) ([^java.time.format.DateTimeFormatter G__35512] (.toFormat ^java.time.format.DateTimeFormatter G__35512)))


(defn parse-best ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__35513 ^java.lang.CharSequence G__35514 ^java.time.temporal.TemporalQuery<> G__35515] (.parseBest ^java.time.format.DateTimeFormatter G__35513 ^java.lang.CharSequence G__35514 ^java.time.temporal.TemporalQuery G__35515)))




(defn with-chronology ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__35516 ^java.time.chrono.Chronology G__35517] (.withChronology ^java.time.format.DateTimeFormatter G__35516 ^java.time.chrono.Chronology G__35517)))

