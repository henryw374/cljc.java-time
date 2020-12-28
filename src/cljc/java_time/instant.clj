(ns cljc.java-time.instant (:import [java.time Instant]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def min java.time.Instant/MIN)
(def epoch java.time.Instant/EPOCH)
(def max java.time.Instant/MAX)
(clojure.core/defn truncated-to {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalUnit"]))} (^java.time.Instant [^java.time.Instant this49371 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit49372] (.truncatedTo this49371 java-time-temporal-TemporalUnit49372)))
(clojure.core/defn range {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Instant this49373 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49374] (.range this49373 java-time-temporal-TemporalField49374)))
(clojure.core/defn of-epoch-second {:arglists (quote (["long" "long"] ["long"]))} (^java.time.Instant [^long long49375 ^long long49376] (. java.time.Instant ofEpochSecond long49375 long49376)) (^java.time.Instant [^long long49377] (. java.time.Instant ofEpochSecond long49377)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.Instant" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.Instant this49378 ^java.time.ZoneOffset java-time-ZoneOffset49379] (.atOffset this49378 java-time-ZoneOffset49379)))
(clojure.core/defn minus-millis {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49380 ^long long49381] (.minusMillis this49380 long49381)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.Instant"]))} (^java.lang.Integer [^java.time.Instant this49382] (.getNano this49382)))
(clojure.core/defn plus-millis {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49383 ^long long49384] (.plusMillis this49383 long49384)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49385 ^long long49386] (.minusSeconds this49385 long49386)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49387 ^long long49388] (.plusNanos this49387 long49388)))
(clojure.core/defn plus {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"] ["java.time.Instant" "java.time.temporal.TemporalAmount"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this49389 G__49390] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__49390)) (clojure.core/let [G__49390 ^"java.time.temporal.TemporalAmount" G__49390] (.plus ^java.time.Instant this49389 G__49390)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__49390)) (clojure.core/let [G__49390 ^"java.time.temporal.TemporalAmount" G__49390] (.plus ^java.time.Instant this49389 G__49390)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this49391 G__49392 G__49393] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49392) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__49393)) (clojure.core/let [G__49392 (clojure.core/long G__49392) G__49393 ^"java.time.temporal.TemporalUnit" G__49393] (.plus ^java.time.Instant this49391 G__49392 G__49393)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49392) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__49393)) (clojure.core/let [G__49392 (clojure.core/long G__49392) G__49393 ^"java.time.temporal.TemporalUnit" G__49393] (.plus ^java.time.Instant this49391 G__49392 G__49393)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn query {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Instant this49394 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery49395] (.query this49394 java-time-temporal-TemporalQuery49395)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Instant"]))} (^java.lang.String [^java.time.Instant this49396] (.toString this49396)))
(clojure.core/defn is-before {:arglists (quote (["java.time.Instant" "java.time.Instant"]))} (^java.lang.Boolean [^java.time.Instant this49397 ^java.time.Instant java-time-Instant49398] (.isBefore this49397 java-time-Instant49398)))
(clojure.core/defn minus {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"] ["java.time.Instant" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this49399 G__49400] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__49400)) (clojure.core/let [G__49400 ^"java.time.temporal.TemporalAmount" G__49400] (.minus ^java.time.Instant this49399 G__49400)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__49400)) (clojure.core/let [G__49400 ^"java.time.temporal.TemporalAmount" G__49400] (.minus ^java.time.Instant this49399 G__49400)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this49401 G__49402 G__49403] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49402) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__49403)) (clojure.core/let [G__49402 (clojure.core/long G__49402) G__49403 ^"java.time.temporal.TemporalUnit" G__49403] (.minus ^java.time.Instant this49401 G__49402 G__49403)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49402) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__49403)) (clojure.core/let [G__49402 (clojure.core/long G__49402) G__49403 ^"java.time.temporal.TemporalUnit" G__49403] (.minus ^java.time.Instant this49401 G__49402 G__49403)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn at-zone {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.Instant this49404 ^java.time.ZoneId java-time-ZoneId49405] (.atZone this49404 java-time-ZoneId49405)))
(clojure.core/defn of-epoch-milli {:arglists (quote (["long"]))} (^java.time.Instant [^long long49406] (. java.time.Instant ofEpochMilli long49406)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^long [^java.time.Instant this49407 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49408] (.getLong this49407 java-time-temporal-TemporalField49408)))
(clojure.core/defn until {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Instant this49409 ^java.time.temporal.Temporal java-time-temporal-Temporal49410 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit49411] (.until this49409 java-time-temporal-Temporal49410 java-time-temporal-TemporalUnit49411)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Instant [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor49412] (. java.time.Instant from java-time-temporal-TemporalAccessor49412)))
(clojure.core/defn is-after {:arglists (quote (["java.time.Instant" "java.time.Instant"]))} (^java.lang.Boolean [^java.time.Instant this49413 ^java.time.Instant java-time-Instant49414] (.isAfter this49413 java-time-Instant49414)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49415 ^long long49416] (.minusNanos this49415 long49416)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"] ["java.time.Instant" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this49417 G__49418] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__49418)) (clojure.core/let [G__49418 ^"java.time.temporal.TemporalField" G__49418] (.isSupported ^java.time.Instant this49417 G__49418)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__49418)) (clojure.core/let [G__49418 ^"java.time.temporal.TemporalUnit" G__49418] (.isSupported ^java.time.Instant this49417 G__49418)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Instant [^java.lang.CharSequence java-lang-CharSequence49419] (. java.time.Instant parse java-lang-CharSequence49419)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Instant"]))} (^java.lang.Integer [^java.time.Instant this49420] (.hashCode this49420)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Instant this49421 ^java.time.temporal.Temporal java-time-temporal-Temporal49422] (.adjustInto this49421 java-time-temporal-Temporal49422)))
(clojure.core/defn with {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField" "long"] ["java.time.Instant" "java.time.temporal.TemporalAdjuster"] ["java.time.Instant" "java.time.temporal.TemporalField" "long"] ["java.time.Instant" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this49423 G__49424 G__49425] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__49424) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49425)) (clojure.core/let [G__49424 ^"java.time.temporal.TemporalField" G__49424 G__49425 (clojure.core/long G__49425)] (.with ^java.time.Instant this49423 G__49424 G__49425)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__49424) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__49425)) (clojure.core/let [G__49424 ^"java.time.temporal.TemporalField" G__49424 G__49425 (clojure.core/long G__49425)] (.with ^java.time.Instant this49423 G__49424 G__49425)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this49426 G__49427] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__49427)) (clojure.core/let [G__49427 ^"java.time.temporal.TemporalAdjuster" G__49427] (.with ^java.time.Instant this49426 G__49427)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__49427)) (clojure.core/let [G__49427 ^"java.time.temporal.TemporalAdjuster" G__49427] (.with ^java.time.Instant this49426 G__49427)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] []))} (^java.time.Instant [^java.time.Clock java-time-Clock49428] (. java.time.Instant now java-time-Clock49428)) (^java.time.Instant [] (. java.time.Instant now)))
(clojure.core/defn to-epoch-milli {:arglists (quote (["java.time.Instant"]))} (^long [^java.time.Instant this49429] (.toEpochMilli this49429)))
(clojure.core/defn get-epoch-second {:arglists (quote (["java.time.Instant"]))} (^long [^java.time.Instant this49430] (.getEpochSecond this49430)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Instant" "java.time.Instant"] ["java.time.Instant" "java.lang.Object"]))} (^java.lang.Integer [this49431 G__49432] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Instant") G__49432)) (clojure.core/let [G__49432 ^"java.time.Instant" G__49432] (.compareTo ^java.time.Instant this49431 G__49432)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__49432)) (clojure.core/let [G__49432 ^"java.lang.Object" G__49432] (.compareTo ^java.time.Instant this49431 G__49432)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.Instant" "long"]))} (^java.time.Instant [^java.time.Instant this49433 ^long long49434] (.plusSeconds this49433 long49434)))
(clojure.core/defn get {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Instant this49435 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49436] (.get this49435 java-time-temporal-TemporalField49436)))
(clojure.core/defn equals {:arglists (quote (["java.time.Instant" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Instant this49437 ^java.lang.Object java-lang-Object49438] (.equals this49437 java-lang-Object49438)))
