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

 (defn header [class-name ns-name sub-p ext]
   (let [req
          (cond->
              [:require
               ['cljc.java-time.extn.calendar-awareness]]
              (= :cljs ext) (conj [(symbol (str "java.time" (when sub-p (str "." sub-p)))) :refer [class-name]])
            :always seq)]
     (cond-> (vector 'ns (symbol (str "cljc.java-time." (when sub-p (str sub-p ".")) ns-name))
               (list :refer-clojure :exclude ['get 'range 'format 'min 'max 'next 'name 'resolve 'short])
               req)
       (= :clj ext) (conj (list :import [(symbol (str "java.time" (when sub-p (str "." sub-p)))) class-name]))
       :always seq)))

;(header 'Instant "foo" nil :cljs)

 (defn type-hint [x]
   (let [x (string/replace (str x) "<>" "")]
     (when (or (clojure.string/includes? x ".")
             ;(#{"long" "double"} x)
             )
       (symbol (str "^" x)))))

(defn gen-for-class [c sub-p ext]
  ;; header
  (println (header (.getSimpleName c) (csk/->kebab-case (.getSimpleName c))
             sub-p ext))
  ;; fields
  (doseq [m (:members (rf/reflect c))]
    (when (and (not (:parameter-types m)) (not-empty (set/intersection #{:public} (:flags m))))
      (println
        (list 'def (csk/->kebab-case (:name m))
           (if (= :clj ext) 
                           (symbol (str (.getName c) "/" (:name m)))
                          (list '. c (symbol (str "-" (:name m)))))))))
  ;; methods
  (doseq [f (df/defwrapper c ext)]
    (let [f (if (= 'is-leap (second f))
              '(clojure.core/defn is-leap {:arglists (quote (["long"]))}
                 (^java.lang.Boolean [^long long57050] (. java.time.Year isLeap long57050)))
              f)]
      (pr f))
    (println)))
 
 (defn get-and-write [c ext sub-p]
   (let [f (str "./src/cljc/java_time/" (when sub-p (str sub-p "/"))  (csk/->snake_case (.getSimpleName c)) "." (name ext))
         _ (io/make-parents f)
         w (io/writer f)]
     (binding [*out* w]
       (gen-for-class c sub-p ext))))

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
   (get-and-write c :clj nil)
   (get-and-write c :cljs nil))
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
       (get-and-write c :clj "temporal")
       (get-and-write c :cljs "temporal"))
     (doseq [c [DateTimeFormatter
                DateTimeFormatterBuilder
                ResolverStyle
                DecimalStyle
                SignStyle
                TextStyle]]
       (get-and-write c :clj "format")
       (get-and-write c :cljs "format"))))

 (comment

   (generate-library-code!)
   
   (require '[clojure.tools.namespace.repl :as rep])
   (rep/refresh-all)


   )
