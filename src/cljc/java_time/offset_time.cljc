(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time OffsetTime])))
(def min (. java.time.OffsetTime -MIN))
(def max (. java.time.OffsetTime -MAX))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2259 ^long long2260] (.minusMinutes this2259 long2260)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2261 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2262] (.truncatedTo this2261 java-time-temporal-TemporalUnit2262)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetTime this2263 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2264] (.range this2263 java-time-temporal-TemporalField2264)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2265] (jti/getter hour this2265)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2266 ^long long2267] (.minusHours this2266 long2267)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int" "java.time.ZoneOffset"] ["java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.lang.Integer int2268 ^java.lang.Integer int2269 ^java.lang.Integer int2270 ^java.lang.Integer int2271 ^java.time.ZoneOffset java-time-ZoneOffset2272] (. java.time.OffsetTime of int2268 int2269 int2270 int2271 java-time-ZoneOffset2272)) (^java.time.OffsetTime [^java.time.LocalTime java-time-LocalTime2273 ^java.time.ZoneOffset java-time-ZoneOffset2274] (. java.time.OffsetTime of java-time-LocalTime2273 java-time-ZoneOffset2274)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2275 ^java.time.OffsetTime java-time-OffsetTime2276] (.isEqual this2275 java-time-OffsetTime2276)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2277] (jti/getter nano this2277)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2278 ^long long2279] (.minusSeconds this2278 long2279)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2280] (jti/getter second this2280)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2281 ^long long2282] (.plusNanos this2281 long2282)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this2283 G__2284 G__2285] #? (:cljs (.plus ^java.time.OffsetTime this2283 G__2284 G__2285) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2284) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2285)) (clojure.core/let [G__2284 (clojure.core/long G__2284) G__2285 ^"java.time.temporal.TemporalUnit" G__2285] (.plus ^java.time.OffsetTime this2283 G__2284 G__2285)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2284) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2285)) (clojure.core/let [G__2284 (clojure.core/long G__2284) G__2285 ^"java.time.temporal.TemporalUnit" G__2285] (.plus ^java.time.OffsetTime this2283 G__2284 G__2285)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2286 G__2287] #? (:cljs (.plus ^java.time.OffsetTime this2286 G__2287) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2287)) (clojure.core/let [G__2287 ^"java.time.temporal.TemporalAmount" G__2287] (.plus ^java.time.OffsetTime this2286 G__2287)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2287)) (clojure.core/let [G__2287 ^"java.time.temporal.TemporalAmount" G__2287] (.plus ^java.time.OffsetTime this2286 G__2287)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2288 ^java.lang.Integer int2289] (.withHour this2288 int2289)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2290 ^java.lang.Integer int2291] (.withMinute this2290 int2291)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2292 ^long long2293] (.plusMinutes this2292 long2293)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetTime this2294 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2295] (.query this2294 java-time-temporal-TemporalQuery2295)))
(clojure.core/defn at-date {:arglists (quote (["java.time.OffsetTime" "java.time.LocalDate"]))} (^java.time.OffsetDateTime [^java.time.OffsetTime this2296 ^java.time.LocalDate java-time-LocalDate2297] (.atDate this2296 java-time-LocalDate2297)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2298 ^java.time.ZoneOffset java-time-ZoneOffset2299] (.withOffsetSameInstant this2298 java-time-ZoneOffset2299)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.String [^java.time.OffsetTime this2300] (.toString this2300)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2301 ^java.time.OffsetTime java-time-OffsetTime2302] (.isBefore this2301 java-time-OffsetTime2302)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this2303 G__2304 G__2305] #? (:cljs (.minus ^java.time.OffsetTime this2303 G__2304 G__2305) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2304) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2305)) (clojure.core/let [G__2304 (clojure.core/long G__2304) G__2305 ^"java.time.temporal.TemporalUnit" G__2305] (.minus ^java.time.OffsetTime this2303 G__2304 G__2305)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2304) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2305)) (clojure.core/let [G__2304 (clojure.core/long G__2304) G__2305 ^"java.time.temporal.TemporalUnit" G__2305] (.minus ^java.time.OffsetTime this2303 G__2304 G__2305)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2306 G__2307] #? (:cljs (.minus ^java.time.OffsetTime this2306 G__2307) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2307)) (clojure.core/let [G__2307 ^"java.time.temporal.TemporalAmount" G__2307] (.minus ^java.time.OffsetTime this2306 G__2307)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2307)) (clojure.core/let [G__2307 ^"java.time.temporal.TemporalAmount" G__2307] (.minus ^java.time.OffsetTime this2306 G__2307)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2308 ^long long2309] (.plusHours this2308 long2309)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.LocalTime [^java.time.OffsetTime this2310] (.toLocalTime this2310)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetTime this2311 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2312] (.getLong this2311 java-time-temporal-TemporalField2312)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.ZoneOffset [^java.time.OffsetTime this2313] (jti/getter offset this2313)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2314 ^java.lang.Integer int2315] (.withNano this2314 int2315)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetTime this2316 ^java.time.temporal.Temporal java-time-temporal-Temporal2317 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2318] (.until this2316 java-time-temporal-Temporal2317 java-time-temporal-TemporalUnit2318)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2319 ^java.time.ZoneOffset java-time-ZoneOffset2320] (.withOffsetSameLocal this2319 java-time-ZoneOffset2320)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2321] (. java.time.OffsetTime from java-time-temporal-TemporalAccessor2321)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2322 ^java.time.OffsetTime java-time-OffsetTime2323] (.isAfter this2322 java-time-OffsetTime2323)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2324 ^long long2325] (.minusNanos this2324 long2325)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"] ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this2326 G__2327] #? (:cljs (.isSupported ^java.time.OffsetTime this2326 G__2327) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2327)) (clojure.core/let [G__2327 ^"java.time.temporal.TemporalField" G__2327] (.isSupported ^java.time.OffsetTime this2326 G__2327)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2327)) (clojure.core/let [G__2327 ^"java.time.temporal.TemporalUnit" G__2327] (.isSupported ^java.time.OffsetTime this2326 G__2327)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence2328 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2329] (. java.time.OffsetTime parse java-lang-CharSequence2328 java-time-format-DateTimeFormatter2329)) (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence2330] (. java.time.OffsetTime parse java-lang-CharSequence2330)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2331 ^java.lang.Integer int2332] (.withSecond this2331 int2332)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2333] (jti/getter minute this2333)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2334] (.hashCode this2334)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetTime this2335 ^java.time.temporal.Temporal java-time-temporal-Temporal2336] (.adjustInto this2335 java-time-temporal-Temporal2336)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this2337 G__2338] #? (:cljs (.with ^java.time.OffsetTime this2337 G__2338) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2338)) (clojure.core/let [G__2338 ^"java.time.temporal.TemporalAdjuster" G__2338] (.with ^java.time.OffsetTime this2337 G__2338)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2338)) (clojure.core/let [G__2338 ^"java.time.temporal.TemporalAdjuster" G__2338] (.with ^java.time.OffsetTime this2337 G__2338)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2339 G__2340 G__2341] #? (:cljs (.with ^java.time.OffsetTime this2339 G__2340 G__2341) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2340) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2341)) (clojure.core/let [G__2340 ^"java.time.temporal.TemporalField" G__2340 G__2341 (clojure.core/long G__2341)] (.with ^java.time.OffsetTime this2339 G__2340 G__2341)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2340) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2341)) (clojure.core/let [G__2340 ^"java.time.temporal.TemporalField" G__2340 G__2341 (clojure.core/long G__2341)] (.with ^java.time.OffsetTime this2339 G__2340 G__2341)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))} (^java.time.OffsetTime [] (. java.time.OffsetTime now)) (^java.time.OffsetTime [G__2343] #? (:cljs (. java.time.OffsetTime now G__2343) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__2343)) (clojure.core/let [G__2343 ^"java.time.Clock" G__2343] (. java.time.OffsetTime now G__2343)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__2343)) (clojure.core/let [G__2343 ^"java.time.ZoneId" G__2343] (. java.time.OffsetTime now G__2343)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetTime" "java.lang.Object"] ["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Integer [this2344 G__2345] #? (:cljs (.compareTo ^java.time.OffsetTime this2344 G__2345) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2345)) (clojure.core/let [G__2345 ^"java.lang.Object" G__2345] (.compareTo ^java.time.OffsetTime this2344 G__2345)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetTime") G__2345)) (clojure.core/let [G__2345 ^"java.time.OffsetTime" G__2345] (.compareTo ^java.time.OffsetTime this2344 G__2345)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetTime [^java.time.Instant java-time-Instant2346 ^java.time.ZoneId java-time-ZoneId2347] (. java.time.OffsetTime ofInstant java-time-Instant2346 java-time-ZoneId2347)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2348 ^long long2349] (.plusSeconds this2348 long2349)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetTime this2350 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2351] (.get this2350 java-time-temporal-TemporalField2351)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetTime this2352 ^java.lang.Object java-lang-Object2353] (.equals this2352 java-lang-Object2353)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetTime this2354 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2355] (.format this2354 java-time-format-DateTimeFormatter2355)))
