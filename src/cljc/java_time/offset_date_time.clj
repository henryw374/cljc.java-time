(ns cljc.java-time.offset-date-time (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time OffsetDateTime]))
(def min java.time.OffsetDateTime/MIN)
(def max java.time.OffsetDateTime/MAX)
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7306 ^long long7307] (.minusMinutes this7306 long7307)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7308 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit7309] (.truncatedTo this7308 java-time-temporal-TemporalUnit7309)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7310 ^long long7311] (.minusWeeks this7310 long7311)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Instant [^java.time.OffsetDateTime this7312] (.toInstant this7312)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7313 ^long long7314] (.plusWeeks this7313 long7314)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this7315 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7316] (.range this7315 java-time-temporal-TemporalField7316)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7317] (.getHour this7317)))
(clojure.core/defn at-zone-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this7318 ^java.time.ZoneId java-time-ZoneId7319] (.atZoneSameInstant this7318 java-time-ZoneId7319)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7320 ^long long7321] (.minusHours this7320 long7321)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"] ["java.time.LocalDateTime" "java.time.ZoneOffset"] ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.lang.Integer int7322 ^java.lang.Integer int7323 ^java.lang.Integer int7324 ^java.lang.Integer int7325 ^java.lang.Integer int7326 ^java.lang.Integer int7327 ^java.lang.Integer int7328 ^java.time.ZoneOffset java-time-ZoneOffset7329] (java.time.OffsetDateTime/of int7322 int7323 int7324 int7325 int7326 int7327 int7328 java-time-ZoneOffset7329)) (^java.time.OffsetDateTime [^java.time.LocalDateTime java-time-LocalDateTime7330 ^java.time.ZoneOffset java-time-ZoneOffset7331] (java.time.OffsetDateTime/of java-time-LocalDateTime7330 java-time-ZoneOffset7331)) (^java.time.OffsetDateTime [^java.time.LocalDate java-time-LocalDate7332 ^java.time.LocalTime java-time-LocalTime7333 ^java.time.ZoneOffset java-time-ZoneOffset7334] (java.time.OffsetDateTime/of java-time-LocalDate7332 java-time-LocalTime7333 java-time-ZoneOffset7334)))
(clojure.core/defn with-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7335 ^java.lang.Integer int7336] (.withMonth this7335 int7336)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this7337 ^java.time.OffsetDateTime java-time-OffsetDateTime7338] (.isEqual this7337 java-time-OffsetDateTime7338)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7339] (.getNano this7339)))
(clojure.core/defn to-offset-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.OffsetTime [^java.time.OffsetDateTime this7340] (.toOffsetTime this7340)))
(clojure.core/defn at-zone-similar-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this7341 ^java.time.ZoneId java-time-ZoneId7342] (.atZoneSimilarLocal this7341 java-time-ZoneId7342)))
(clojure.core/defn get-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7343] (.getYear this7343)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7344 ^long long7345] (.minusSeconds this7344 long7345)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7346] (.getSecond this7346)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7347 ^long long7348] (.plusNanos this7347 long7348)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7349] (.getDayOfYear this7349)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this7350 G__7351 G__7352] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7351) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7352)) (clojure.core/let [G__7351 (clojure.core/long G__7351) G__7352 ^"java.time.temporal.TemporalUnit" G__7352] (.plus ^java.time.OffsetDateTime this7350 G__7351 G__7352)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7351) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7352)) (clojure.core/let [G__7351 (clojure.core/long G__7351) G__7352 ^"java.time.temporal.TemporalUnit" G__7352] (.plus ^java.time.OffsetDateTime this7350 G__7351 G__7352)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7353 G__7354] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7354)) (clojure.core/let [G__7354 ^"java.time.temporal.TemporalAmount" G__7354] (.plus ^java.time.OffsetDateTime this7353 G__7354)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7354)) (clojure.core/let [G__7354 ^"java.time.temporal.TemporalAmount" G__7354] (.plus ^java.time.OffsetDateTime this7353 G__7354)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn time-line-order {:arglists (quote ([]))} (^java.util.Comparator [] (java.time.OffsetDateTime/timeLineOrder)))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7355 ^java.lang.Integer int7356] (.withHour this7355 int7356)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7357 ^java.lang.Integer int7358] (.withMinute this7357 int7358)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7359 ^long long7360] (.plusMinutes this7359 long7360)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetDateTime this7361 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery7362] (.query this7361 java-time-temporal-TemporalQuery7362)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7363 ^java.time.ZoneOffset java-time-ZoneOffset7364] (.withOffsetSameInstant this7363 java-time-ZoneOffset7364)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.DayOfWeek [^java.time.OffsetDateTime this7365] (.getDayOfWeek this7365)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.String [^java.time.OffsetDateTime this7366] (.toString this7366)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7367 ^long long7368] (.plusMonths this7367 long7368)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this7369 ^java.time.OffsetDateTime java-time-OffsetDateTime7370] (.isBefore this7369 java-time-OffsetDateTime7370)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7371 ^long long7372] (.minusMonths this7371 long7372)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this7373 G__7374 G__7375] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7374) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7375)) (clojure.core/let [G__7374 (clojure.core/long G__7374) G__7375 ^"java.time.temporal.TemporalUnit" G__7375] (.minus ^java.time.OffsetDateTime this7373 G__7374 G__7375)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7374) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7375)) (clojure.core/let [G__7374 (clojure.core/long G__7374) G__7375 ^"java.time.temporal.TemporalUnit" G__7375] (.minus ^java.time.OffsetDateTime this7373 G__7374 G__7375)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7376 G__7377] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7377)) (clojure.core/let [G__7377 ^"java.time.temporal.TemporalAmount" G__7377] (.minus ^java.time.OffsetDateTime this7376 G__7377)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7377)) (clojure.core/let [G__7377 ^"java.time.temporal.TemporalAmount" G__7377] (.minus ^java.time.OffsetDateTime this7376 G__7377)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7378 ^long long7379] (.plusHours this7378 long7379)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7380 ^long long7381] (.plusDays this7380 long7381)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalTime [^java.time.OffsetDateTime this7382] (.toLocalTime this7382)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetDateTime this7383 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7384] (.getLong this7383 java-time-temporal-TemporalField7384)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZoneOffset [^java.time.OffsetDateTime this7385] (.getOffset this7385)))
(clojure.core/defn to-zoned-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this7386] (.toZonedDateTime this7386)))
(clojure.core/defn with-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7387 ^java.lang.Integer int7388] (.withYear this7387 int7388)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7389 ^java.lang.Integer int7390] (.withNano this7389 int7390)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^long [^java.time.OffsetDateTime this7391] (.toEpochSecond this7391)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetDateTime this7392 ^java.time.temporal.Temporal java-time-temporal-Temporal7393 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit7394] (.until this7392 java-time-temporal-Temporal7393 java-time-temporal-TemporalUnit7394)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7395 ^java.time.ZoneOffset java-time-ZoneOffset7396] (.withOffsetSameLocal this7395 java-time-ZoneOffset7396)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7397 ^java.lang.Integer int7398] (.withDayOfMonth this7397 int7398)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7399] (.getDayOfMonth this7399)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor7400] (java.time.OffsetDateTime/from java-time-temporal-TemporalAccessor7400)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this7401 ^java.time.OffsetDateTime java-time-OffsetDateTime7402] (.isAfter this7401 java-time-OffsetDateTime7402)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7403 ^long long7404] (.minusNanos this7403 long7404)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this7405 G__7406] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7406)) (clojure.core/let [G__7406 ^"java.time.temporal.TemporalUnit" G__7406] (.isSupported ^java.time.OffsetDateTime this7405 G__7406)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7406)) (clojure.core/let [G__7406 ^"java.time.temporal.TemporalField" G__7406] (.isSupported ^java.time.OffsetDateTime this7405 G__7406)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7407 ^long long7408] (.minusYears this7407 long7408)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence7409 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7410] (java.time.OffsetDateTime/parse java-lang-CharSequence7409 java-time-format-DateTimeFormatter7410)) (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence7411] (java.time.OffsetDateTime/parse java-lang-CharSequence7411)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7412 ^java.lang.Integer int7413] (.withSecond this7412 int7413)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDate [^java.time.OffsetDateTime this7414] (.toLocalDate this7414)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7415] (.getMinute this7415)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7416] (.hashCode this7416)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetDateTime this7417 ^java.time.temporal.Temporal java-time-temporal-Temporal7418] (.adjustInto this7417 java-time-temporal-Temporal7418)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this7419 G__7420] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__7420)) (clojure.core/let [G__7420 ^"java.time.temporal.TemporalAdjuster" G__7420] (.with ^java.time.OffsetDateTime this7419 G__7420)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__7420)) (clojure.core/let [G__7420 ^"java.time.temporal.TemporalAdjuster" G__7420] (.with ^java.time.OffsetDateTime this7419 G__7420)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7421 G__7422 G__7423] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7422) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7423)) (clojure.core/let [G__7422 ^"java.time.temporal.TemporalField" G__7422 G__7423 (clojure.core/long G__7423)] (.with ^java.time.OffsetDateTime this7421 G__7422 G__7423)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7422) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7423)) (clojure.core/let [G__7422 ^"java.time.temporal.TemporalField" G__7422 G__7423 (clojure.core/long G__7423)] (.with ^java.time.OffsetDateTime this7421 G__7422 G__7423)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] [] ["java.time.ZoneId"]))} (^java.time.OffsetDateTime [G__7425] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__7425)) (clojure.core/let [G__7425 ^"java.time.Clock" G__7425] (java.time.OffsetDateTime/now G__7425)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__7425)) (clojure.core/let [G__7425 ^"java.time.ZoneId" G__7425] (java.time.OffsetDateTime/now G__7425)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.OffsetDateTime [] (java.time.OffsetDateTime/now)))
(clojure.core/defn to-local-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDateTime [^java.time.OffsetDateTime this7426] (.toLocalDateTime this7426)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7427] (.getMonthValue this7427)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7428 ^java.lang.Integer int7429] (.withDayOfYear this7428 int7429)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"] ["java.time.OffsetDateTime" "java.lang.Object"]))} (^java.lang.Integer [this7430 G__7431] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetDateTime") G__7431)) (clojure.core/let [G__7431 ^"java.time.OffsetDateTime" G__7431] (.compareTo ^java.time.OffsetDateTime this7430 G__7431)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__7431)) (clojure.core/let [G__7431 ^"java.lang.Object" G__7431] (.compareTo ^java.time.OffsetDateTime this7430 G__7431)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Month [^java.time.OffsetDateTime this7432] (.getMonth this7432)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetDateTime [^java.time.Instant java-time-Instant7433 ^java.time.ZoneId java-time-ZoneId7434] (java.time.OffsetDateTime/ofInstant java-time-Instant7433 java-time-ZoneId7434)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7435 ^long long7436] (.plusSeconds this7435 long7436)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetDateTime this7437 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7438] (.get this7437 java-time-temporal-TemporalField7438)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this7439 ^java.lang.Object java-lang-Object7440] (.equals this7439 java-lang-Object7440)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetDateTime this7441 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7442] (.format this7441 java-time-format-DateTimeFormatter7442)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7443 ^long long7444] (.plusYears this7443 long7444)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this7445 ^long long7446] (.minusDays this7445 long7446)))
