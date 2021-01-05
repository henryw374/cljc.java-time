(ns cljc.java-time.format.date-time-formatter-builder (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.format :refer [DateTimeFormatterBuilder]]))
(clojure.core/defn to-formatter {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"] ["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this9170 ^java.util.Locale java-util-Locale9171] (.toFormatter this9170 java-util-Locale9171)) (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatterBuilder this9172] (.toFormatter this9172)))
(clojure.core/defn append-pattern {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9173 ^java.lang.String java-lang-String9174] (.appendPattern this9173 java-lang-String9174)))
(clojure.core/defn append-value {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.format.SignStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9175 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9176] (.appendValue this9175 java-time-temporal-TemporalField9176)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9177 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9178 ^int int9179 ^int int9180 ^js/JSJoda.SignStyle java-time-format-SignStyle9181] (.appendValue this9177 java-time-temporal-TemporalField9178 int9179 int9180 java-time-format-SignStyle9181)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9182 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9183 ^int int9184] (.appendValue this9182 java-time-temporal-TemporalField9183 int9184)))
(clojure.core/defn append-instant {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"] ["java.time.format.DateTimeFormatterBuilder" "int"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9185] (.appendInstant this9185)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9186 ^int int9187] (.appendInstant this9186 int9187)))
(clojure.core/defn append-literal {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"] ["java.time.format.DateTimeFormatterBuilder" "char"]))} (^js/JSJoda.DateTimeFormatterBuilder [this9188 G__9189] (.appendLiteral ^js/JSJoda.DateTimeFormatterBuilder this9188 G__9189)))
(clojure.core/defn optional-start {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9190] (.optionalStart this9190)))
(clojure.core/defn append-fraction {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9191 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9192 ^int int9193 ^int int9194 ^boolean boolean9195] (.appendFraction this9191 java-time-temporal-TemporalField9192 int9193 int9194 boolean9195)))
(clojure.core/defn append-optional {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9196 ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter9197] (.appendOptional this9196 java-time-format-DateTimeFormatter9197)))
(clojure.core/defn optional-end {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9198] (.optionalEnd this9198)))
(clojure.core/defn parse-lenient {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9199] (.parseLenient this9199)))
(clojure.core/defn pad-next {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int" "char"] ["java.time.format.DateTimeFormatterBuilder" "int"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9200 ^int int9201 ^char char9202] (.padNext this9200 int9201 char9202)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9203 ^int int9204] (.padNext this9203 int9204)))
(clojure.core/defn append-chronology-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9205] (.appendChronologyId this9205)))
(clojure.core/defn append-zone-or-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9206] (.appendZoneOrOffsetId this9206)))
(clojure.core/defn parse-case-sensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9207] (.parseCaseSensitive this9207)))
(clojure.core/defn parse-strict {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9208] (.parseStrict this9208)))
(clojure.core/defn append-chronology-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9209 ^js/JSJoda.TextStyle java-time-format-TextStyle9210] (.appendChronologyText this9209 java-time-format-TextStyle9210)))
(clojure.core/defn append-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9211] (.appendOffsetId this9211)))
(clojure.core/defn append-zone-region-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9212] (.appendZoneRegionId this9212)))
(clojure.core/defn parse-defaulting {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9213 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9214 ^long long9215] (.parseDefaulting this9213 java-time-temporal-TemporalField9214 long9215)))
(clojure.core/defn append-zone-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9216] (.appendZoneId this9216)))
(clojure.core/defn get-localized-date-time-pattern {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.FormatStyle java-time-format-FormatStyle9217 ^js/JSJoda.FormatStyle java-time-format-FormatStyle9218 ^js/JSJoda.Chronology java-time-chrono-Chronology9219 ^java.util.Locale java-util-Locale9220] (js-invoke java.time.format.DateTimeFormatterBuilder "getLocalizedDateTimePattern" java-time-format-FormatStyle9217 java-time-format-FormatStyle9218 java-time-chrono-Chronology9219 java-util-Locale9220)))
(clojure.core/defn parse-case-insensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9221] (.parseCaseInsensitive this9221)))
(clojure.core/defn append-localized-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9222 ^js/JSJoda.TextStyle java-time-format-TextStyle9223] (.appendLocalizedOffset this9222 java-time-format-TextStyle9223)))
(clojure.core/defn append {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9224 ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter9225] (.append this9224 java-time-format-DateTimeFormatter9225)))
(clojure.core/defn append-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^js/JSJoda.DateTimeFormatterBuilder [this9226 G__9227 G__9228] (.appendText ^js/JSJoda.DateTimeFormatterBuilder this9226 G__9227 G__9228)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9229 ^js/JSJoda.TemporalField java-time-temporal-TemporalField9230] (.appendText this9229 java-time-temporal-TemporalField9230)))
(clojure.core/defn append-localized {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle" "java.time.format.FormatStyle"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9231 ^js/JSJoda.FormatStyle java-time-format-FormatStyle9232 ^js/JSJoda.FormatStyle java-time-format-FormatStyle9233] (.appendLocalized this9231 java-time-format-FormatStyle9232 java-time-format-FormatStyle9233)))
(clojure.core/defn append-generic-zone-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9234 ^js/JSJoda.TextStyle java-time-format-TextStyle9235] (.appendGenericZoneText this9234 java-time-format-TextStyle9235)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9236 ^js/JSJoda.TextStyle java-time-format-TextStyle9237 ^java.util.Set java-util-Set9238] (.appendGenericZoneText this9236 java-time-format-TextStyle9237 java-util-Set9238)))
(clojure.core/defn append-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9239 ^java.lang.String java-lang-String9240 ^java.lang.String java-lang-String9241] (.appendOffset this9239 java-lang-String9240 java-lang-String9241)))
(clojure.core/defn append-value-reduced {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.chrono.ChronoLocalDate"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]))} (^js/JSJoda.DateTimeFormatterBuilder [this9242 G__9243 G__9244 G__9245 G__9246] (.appendValueReduced ^js/JSJoda.DateTimeFormatterBuilder this9242 G__9243 G__9244 G__9245 G__9246)))
(clojure.core/defn append-zone-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"] ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9247 ^js/JSJoda.TextStyle java-time-format-TextStyle9248 ^java.util.Set java-util-Set9249] (.appendZoneText this9247 java-time-format-TextStyle9248 java-util-Set9249)) (^js/JSJoda.DateTimeFormatterBuilder [^js/JSJoda.DateTimeFormatterBuilder this9250 ^js/JSJoda.TextStyle java-time-format-TextStyle9251] (.appendZoneText this9250 java-time-format-TextStyle9251)))
