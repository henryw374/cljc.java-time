 (ns gen
   (:require [clojure.reflect :as rf]
             [clojure.set :as set]
             [defwrapper :as df]
             [clojure.string :as string]
             [camel-snake-kebab.core :as csk]
             [clojure.java.io :as io])
   (:import [java.time Period
                       LocalDate
                       LocalTime
                       LocalDateTime
                       ZonedDateTime
                       OffsetTime
                       Instant
                       OffsetDateTime
                       ZoneId
                       ZoneOffset
                       DayOfWeek
                       LocalTime
                       Month
                       MonthDay
                       Duration
                       Year
                       YearMonth
                       Clock
                       ZoneOffset]
            [java.time.format DateTimeFormatter
                              DateTimeFormatterBuilder
                              ResolverStyle
                              DecimalStyle
                              SignStyle
                              TextStyle]
            [java.time.temporal TemporalAdjusters
                                Temporal
                                TemporalAmount
                                ChronoUnit
                                ChronoField
                                IsoFields
                                TemporalAccessor
                                TemporalAdjuster
                                TemporalQuery
                                TemporalQueries
                                TemporalUnit
                                ValueRange
                                TemporalField]))

 (defn header [class-name ns-name sub-p]
   (list 'ns (symbol (str "cljc.java-time." (when sub-p (str sub-p ".")) ns-name))
     (list :require
       ['cljs.java-time.interop :as 'jti]
       (symbol "#?") (list
                       :cljs [(symbol (str "java.time" (when sub-p (str "." sub-p)))) :refer [class-name]]))
     (list :refer-clojure :exclude ['get 'range 'format 'min 'max 'next 'name 'resolve])
     (symbol "#?") (list
                            :clj
                            (list :import [(symbol (str "java.time" (when sub-p (str "." sub-p)))) class-name]))))

 (defn type-hint [x]
   (let [x (string/replace (str x) "<>" "")]
     (when (or (clojure.string/includes? x ".")
             ;(#{"long" "double"} x)
             )
       (symbol (str "^" x)))))

(defn gen-for-class [c sub-p]
  ;; header
  (println (header (.getSimpleName c) (csk/->kebab-case (.getSimpleName c))
             sub-p))
  ;; fields
  (doseq [m (:members (rf/reflect c))]
    (when (and (not (:parameter-types m)) (not-empty (set/intersection #{:public} (:flags m))))
      (println
        (list 'def (csk/->kebab-case (:name m))
          (symbol "#?") (list 
                          :clj (symbol (str (.getName c) "/" (:name m)))
                          :cljs
                          (list '. c (symbol (str "-" (:name m)))))))))
  ;; methods
  (doseq [f (df/defwrapper c)]
    (let [f (if (= 'is-leap (second f))
              '(clojure.core/defn is-leap {:arglists (quote (["long"]))}
                 (^java.lang.Boolean [^long long57050] (. java.time.Year isLeap long57050)))
              f)]
      (pr f))
    (println)))

 (defn generate-library-code! []
   ;todo - chrono and zone packages. needs cljs.java-time also
   (binding [*print-meta* true]
     (doseq [c [Period
                LocalDate
                LocalDateTime
                ZonedDateTime
                OffsetTime
                Instant
                OffsetDateTime
                ZoneId
                DayOfWeek
                LocalTime
                Month
                MonthDay
                Duration
                Year
                YearMonth
                Clock
                ZoneOffset]]

       (let [f (str "./src/cljc/java_time/" (csk/->snake_case (.getSimpleName c)) ".cljc")
             _ (io/make-parents f)
             w (io/writer f)]

         (binding [*out* w]
           (gen-for-class c nil))))
     (doseq [c [TemporalAdjusters
                Temporal
                TemporalAmount
                ChronoUnit
                ChronoField
                IsoFields
                TemporalAccessor
                TemporalAdjuster
                TemporalQuery
                TemporalQueries
                TemporalUnit
                ValueRange
                TemporalField]]
       (let [f (str "./src/cljc/java_time/temporal/" (csk/->snake_case (.getSimpleName c)) ".cljc")
             _ (io/make-parents f)
             w (io/writer f)]
         (binding [*out* w]
           (gen-for-class c "temporal"))))
     (doseq [c [DateTimeFormatter
                DateTimeFormatterBuilder
                ResolverStyle
                DecimalStyle
                SignStyle
                TextStyle]]
       (let [f (str "./src/cljc/java_time/format/" (csk/->snake_case (.getSimpleName c)) ".cljc")
             _ (io/make-parents f)
             w (io/writer f)]
         (binding [*out* w]
           (gen-for-class c "format"))))))

 (comment

   (generate-library-code!)
   (require '[clojure.tools.namespace.repl :as rep])
   (rep/refresh-all)


   )
