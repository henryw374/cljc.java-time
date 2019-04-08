(ns cljc.java-time.format.date-time-formatter (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time.format :refer [DateTimeFormatter]])) #? (:clj (:import [java.time.format DateTimeFormatter])))

(defn get-resolver-fields ^java.util.Set ([^java.time.format.DateTimeFormatter G__27220] (jti/getter resolverFields ^java.time.format.DateTimeFormatter G__27220)))











(defn parsed-leap-second ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedLeapSecond)))


(defn format ^java.lang.String ([^java.time.format.DateTimeFormatter G__27222 ^java.time.temporal.TemporalAccessor G__27223] (.format ^java.time.format.DateTimeFormatter G__27222 ^java.time.temporal.TemporalAccessor G__27223)))



(defn of-localized-date-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__27225 ^java.time.format.FormatStyle G__27226] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__27225 ^java.time.format.FormatStyle G__27226)) ([^java.time.format.FormatStyle G__27228] (. java.time.format.DateTimeFormatter ofLocalizedDateTime ^java.time.format.FormatStyle G__27228)))


(defn parse-unresolved ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__27229 ^java.lang.CharSequence G__27230 ^java.text.ParsePosition G__27231] (.parseUnresolved ^java.time.format.DateTimeFormatter G__27229 ^java.lang.CharSequence G__27230 ^java.text.ParsePosition G__27231)))


(defn of-localized-date ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__27233] (. java.time.format.DateTimeFormatter ofLocalizedDate ^java.time.format.FormatStyle G__27233)))



(defn with-locale ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27234 ^java.util.Locale G__27235] (.withLocale ^java.time.format.DateTimeFormatter G__27234 ^java.util.Locale G__27235)))


(defn format-to ([^java.time.format.DateTimeFormatter G__27236 ^java.time.temporal.TemporalAccessor G__27237 ^java.lang.Appendable G__27238] (.formatTo ^java.time.format.DateTimeFormatter G__27236 ^java.time.temporal.TemporalAccessor G__27237 ^java.lang.Appendable G__27238)))


(defn of-pattern ^java.time.format.DateTimeFormatter ([^java.lang.String G__27240 ^java.util.Locale G__27241] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__27240 ^java.util.Locale G__27241)) ([^java.lang.String G__27243] (. java.time.format.DateTimeFormatter ofPattern ^java.lang.String G__27243)))





(defn get-zone ^java.time.ZoneId ([^java.time.format.DateTimeFormatter G__27244] (jti/getter zone ^java.time.format.DateTimeFormatter G__27244)))








(defn with-resolver-fields ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27245 G__27246] (.withResolverFields ^java.time.format.DateTimeFormatter G__27245 G__27246)))



(defn with-resolver-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27247 ^java.time.format.ResolverStyle G__27248] (.withResolverStyle ^java.time.format.DateTimeFormatter G__27247 ^java.time.format.ResolverStyle G__27248)))



(defn get-chronology ^java.time.chrono.Chronology ([^java.time.format.DateTimeFormatter G__27249] (jti/getter chronology ^java.time.format.DateTimeFormatter G__27249)))


(defn to-string ^java.lang.String ([^java.time.format.DateTimeFormatter G__27250] (.toString ^java.time.format.DateTimeFormatter G__27250)))






(defn parsed-excess-days ^java.time.temporal.TemporalQuery ([] (. java.time.format.DateTimeFormatter parsedExcessDays)))


(defn with-decimal-style ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27252 ^java.time.format.DecimalStyle G__27253] (.withDecimalStyle ^java.time.format.DateTimeFormatter G__27252 ^java.time.format.DecimalStyle G__27253)))








(defn with-zone ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27254 ^java.time.ZoneId G__27255] (.withZone ^java.time.format.DateTimeFormatter G__27254 ^java.time.ZoneId G__27255)))


(defn get-resolver-style ^java.time.format.ResolverStyle ([^java.time.format.DateTimeFormatter G__27256] (jti/getter resolverStyle ^java.time.format.DateTimeFormatter G__27256)))


(defn get-decimal-style ^java.time.format.DecimalStyle ([^java.time.format.DateTimeFormatter G__27257] (jti/getter decimalStyle ^java.time.format.DateTimeFormatter G__27257)))


(defn parse ^java.time.temporal.TemporalAccessor ([^java.time.format.DateTimeFormatter G__27258 ^java.lang.CharSequence G__27259] (.parse ^java.time.format.DateTimeFormatter G__27258 ^java.lang.CharSequence G__27259)) ([^java.time.format.DateTimeFormatter G__27260 G__27261 G__27262] (.parse ^java.time.format.DateTimeFormatter G__27260 G__27261 G__27262)))


(defn get-locale ^java.util.Locale ([^java.time.format.DateTimeFormatter G__27263] (jti/getter locale ^java.time.format.DateTimeFormatter G__27263)))



(defn of-localized-time ^java.time.format.DateTimeFormatter ([^java.time.format.FormatStyle G__27265] (. java.time.format.DateTimeFormatter ofLocalizedTime ^java.time.format.FormatStyle G__27265)))


(defn to-format ^java.text.Format ([^java.time.format.DateTimeFormatter G__27266 ^java.time.temporal.TemporalQuery G__27267] (.toFormat ^java.time.format.DateTimeFormatter G__27266 ^java.time.temporal.TemporalQuery G__27267)) ([^java.time.format.DateTimeFormatter G__27268] (.toFormat ^java.time.format.DateTimeFormatter G__27268)))


(defn parse-best ^java.time.temporal.TemporalAccessor 
([^java.time.format.DateTimeFormatter G__27269 
  ^java.lang.CharSequence G__27270 ^java.time.temporal.TemporalQuery G__27271] 
 (.parseBest ^java.time.format.DateTimeFormatter G__27269 ^java.lang.CharSequence G__27270 ^java.time.temporal.TemporalQuery<> G__27271)))




(defn with-chronology ^java.time.format.DateTimeFormatter ([^java.time.format.DateTimeFormatter G__27272 ^java.time.chrono.Chronology G__27273] (.withChronology ^java.time.format.DateTimeFormatter G__27272 ^java.time.chrono.Chronology G__27273)))

