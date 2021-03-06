(ns cljc.java-time.local-date
  (:require [cljc.java-time.extn.predicates :as preds])
  (:refer-clojure :exclude [get range format min max next name resolve short]))

(extend-protocol IEquiv
  js/Temporal.PlainDate 
  (-equiv [o other] (.equals ^js/TemporalThing o other)))

(extend-protocol IHash
  js/Temporal.PlainDate
  (-hash [o] (hash (str o))))

(extend-protocol IComparable
  js/Temporal.PlainDate
  (-compare [x y] (let [d (.-sign ^js/Temporal.Duration (.until ^js/TemporalThing x y))]
                    (or (zero? d) (* -1 d)))))

(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))}
  ([] (js/Temporal.now.plainDateISO))
  ([^js/TemporalThing now-clock-or-zone]
   (if (preds/clock? now-clock-or-zone)
     (.plainDateISO now-clock-or-zone)
     (js/Temporal.now.plainDateISO now-clock-or-zone))))

(defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] 
                               ["java.lang.CharSequence"]))}
  ([^java.lang.CharSequence java-lang-CharSequence6310
    ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter6311]
   (throw (js/Error. "not yet implemented"))
   ;(js-invoke java.time.LocalDate "parse" java-lang-CharSequence6310 java-time-format-DateTimeFormatter6311)
   ) 
  ([^java.lang.CharSequence s]
   (js/Temporal.PlainDate.from s)
   ))

;(def max (goog.object/get java.time.LocalDate "MAX"))
;(def min (goog.object/get java.time.LocalDate "MIN"))
;(clojure.core/defn minus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6246 ^long long6247] (.minusWeeks this6246 long6247)))
;(clojure.core/defn plus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6248 ^long long6249] (.plusWeeks this6248 long6249)))
;(clojure.core/defn length-of-year {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6250] (.lengthOfYear this6250)))
;(clojure.core/defn range {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.LocalDate this6251 ^js/JSJoda.TemporalField java-time-temporal-TemporalField6252] (.range this6251 java-time-temporal-TemporalField6252)))
;(clojure.core/defn get-era {:arglists (quote (["java.time.LocalDate"]))} (^js/JSJoda.Era [^js/JSJoda.LocalDate this6253] (.era this6253)))
;(clojure.core/defn of {:arglists (quote (["int" "int" "int"] ["int" "java.time.Month" "int"]))} (^js/JSJoda.LocalDate [G__6255 G__6256 G__6257] (js-invoke java.time.LocalDate "of" G__6255 G__6256 G__6257)))
;(clojure.core/defn with-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6258 ^int int6259] (.withMonth this6258 int6259)))
;(clojure.core/defn is-equal {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^boolean [^js/JSJoda.LocalDate this6260 ^js/JSJoda.ChronoLocalDate java-time-chrono-ChronoLocalDate6261] (.isEqual this6260 java-time-chrono-ChronoLocalDate6261)))
;(clojure.core/defn get-year {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6262] (.year this6262)))
;(clojure.core/defn to-epoch-day {:arglists (quote (["java.time.LocalDate"]))} (^long [^js/JSJoda.LocalDate this6263] (.toEpochDay this6263)))
;(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6264] (.dayOfYear this6264)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))} 
  (^java.lang.Object [this6265 G__6266 G__6267] (.add ^js/JSJoda.LocalDate this6265 G__6266 G__6267)) 
  (^java.lang.Object [this6268 G__6269] (.add ^js/JSJoda.LocalDate this6268 G__6269)))
;(clojure.core/defn is-leap-year {:arglists (quote (["java.time.LocalDate"]))} (^boolean [^js/JSJoda.LocalDate this6270] (.isLeapYear this6270)))
;(clojure.core/defn query {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.LocalDate this6271 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery6272] (.query this6271 java-time-temporal-TemporalQuery6272)))
;(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.LocalDate"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.LocalDate this6273] (.dayOfWeek this6273)))
;(clojure.core/defn to-string {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.String [^js/JSJoda.LocalDate this6274] (.toString this6274)))
;(clojure.core/defn plus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6275 ^long long6276] (.plusMonths this6275 long6276)))
;(clojure.core/defn is-before {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^boolean [^js/JSJoda.LocalDate this6277 ^js/JSJoda.ChronoLocalDate java-time-chrono-ChronoLocalDate6278] (.isBefore this6277 java-time-chrono-ChronoLocalDate6278)))
;(clojure.core/defn minus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6279 ^long long6280] (.minusMonths this6279 long6280)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"]))} 
  (^java.lang.Object [this6281 G__6282 G__6283] (.subtract ^js/JSJoda.LocalDate this6281 G__6282 G__6283)) 
  (^java.lang.Object [this6284 G__6285] (.subtract ^js/JSJoda.LocalDate this6284 G__6285)))
;(clojure.core/defn plus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6286 ^long long6287] (.plusDays this6286 long6287)))
;(clojure.core/defn get-long {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.LocalDate this6288 ^js/JSJoda.TemporalField java-time-temporal-TemporalField6289] (.getLong this6288 java-time-temporal-TemporalField6289)))
;(clojure.core/defn with-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6290 ^int int6291] (.withYear this6290 int6291)))
;(clojure.core/defn length-of-month {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6292] (.lengthOfMonth this6292)))
;(clojure.core/defn until {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^long [^js/JSJoda.LocalDate this6293 ^js/JSJoda.Temporal java-time-temporal-Temporal6294 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit6295] (.until this6293 java-time-temporal-Temporal6294 java-time-temporal-TemporalUnit6295)) (^java.lang.Object [this6296 G__6297] (.until ^js/JSJoda.LocalDate this6296 G__6297)))
;(clojure.core/defn of-epoch-day {:arglists (quote (["long"]))} (^js/JSJoda.LocalDate [^long long6298] (js-invoke java.time.LocalDate "ofEpochDay" long6298)))
;(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6299 ^int int6300] (.withDayOfMonth this6299 int6300)))
;(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6301] (.dayOfMonth this6301)))
;(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.LocalDate [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor6302] (js-invoke java.time.LocalDate "from" java-time-temporal-TemporalAccessor6302)))
;(clojure.core/defn is-after {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^boolean [^js/JSJoda.LocalDate this6303 ^js/JSJoda.ChronoLocalDate java-time-chrono-ChronoLocalDate6304] (.isAfter this6303 java-time-chrono-ChronoLocalDate6304)))
;(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^boolean [this6305 G__6306] (.isSupported ^js/JSJoda.LocalDate this6305 G__6306)))
;(clojure.core/defn minus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6307 ^long long6308] (.minusYears this6307 long6308)))
;(clojure.core/defn get-chronology {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate"]))} (^java.lang.Object [this6309] (.chronology ^js/JSJoda.LocalDate this6309)))

;(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6313] (.hashCode this6313)))
;(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.LocalDate this6314 ^js/JSJoda.Temporal java-time-temporal-Temporal6315] (.adjustInto this6314 java-time-temporal-Temporal6315)))
;(clojure.core/defn with {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this6316 G__6317] (.with ^js/JSJoda.LocalDate this6316 G__6317)) (^java.lang.Object [this6318 G__6319 G__6320] (.with ^js/JSJoda.LocalDate this6318 G__6319 G__6320)))
;(clojure.core/defn at-start-of-day {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate" "java.time.ZoneId"]))} (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this6323] (.atStartOfDay this6323)) (^js/JSJoda.ZonedDateTime [^js/JSJoda.LocalDate this6324 ^js/JSJoda.ZoneId java-time-ZoneId6325] (.atStartOfDay this6324 java-time-ZoneId6325)))
;(clojure.core/defn get-month-value {:arglists (quote (["java.time.LocalDate"]))} (^int [^js/JSJoda.LocalDate this6326] (.monthValue this6326)))
;(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6327 ^int int6328] (.withDayOfYear this6327 int6328)))
;(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"] ["java.time.LocalDate" "java.lang.Object"]))} (^int [this6329 G__6330] (.compareTo ^js/JSJoda.LocalDate this6329 G__6330)))
;(clojure.core/defn get-month {:arglists (quote (["java.time.LocalDate"]))} (^js/JSJoda.Month [^js/JSJoda.LocalDate this6331] (.month this6331)))
;(clojure.core/defn of-year-day {:arglists (quote (["int" "int"]))} (^js/JSJoda.LocalDate [^int int6332 ^int int6333] (js-invoke java.time.LocalDate "ofYearDay" int6332 int6333)))
;(clojure.core/defn get {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.LocalDate this6334 ^js/JSJoda.TemporalField java-time-temporal-TemporalField6335] (.get this6334 java-time-temporal-TemporalField6335)))
;(clojure.core/defn equals {:arglists (quote (["java.time.LocalDate" "java.lang.Object"]))} (^boolean [^js/JSJoda.LocalDate this6336 ^java.lang.Object java-lang-Object6337] (.equals this6336 java-lang-Object6337)))
;(clojure.core/defn at-time {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime"] ["java.time.LocalDate" "int" "int" "int"] ["java.time.LocalDate" "int" "int"] ["java.time.LocalDate" "java.time.LocalTime"] ["java.time.LocalDate" "int" "int" "int" "int"] ["java.time.LocalDate" "java.time.OffsetTime"]))} (^java.lang.Object [this6338 G__6339] (.atTime ^js/JSJoda.LocalDate this6338 G__6339)) (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this6340 ^int int6341 ^int int6342 ^int int6343] (.atTime this6340 int6341 int6342 int6343)) (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this6344 ^int int6345 ^int int6346] (.atTime this6344 int6345 int6346)) (^js/JSJoda.LocalDateTime [^js/JSJoda.LocalDate this6347 ^int int6348 ^int int6349 ^int int6350 ^int int6351] (.atTime this6347 int6348 int6349 int6350 int6351)))
;(clojure.core/defn format {:arglists (quote (["java.time.LocalDate" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^js/JSJoda.LocalDate this6352 ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter6353] (.format this6352 java-time-format-DateTimeFormatter6353)))
;(clojure.core/defn plus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6354 ^long long6355] (.plusYears this6354 long6355)))
;(clojure.core/defn minus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^js/JSJoda.LocalDate [^js/JSJoda.LocalDate this6356 ^long long6357] (.minusDays this6356 long6357)))
