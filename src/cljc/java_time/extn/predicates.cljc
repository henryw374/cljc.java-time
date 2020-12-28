(ns cljc.java-time.extn.predicates
  (:require #?(:cljs [java.time :refer [Clock
                                        DayOfWeek
                                        Duration
                                        Instant
                                        LocalDate
                                        LocalDateTime
                                        LocalTime
                                        Month
                                        MonthDay
                                        OffsetDateTime
                                        OffsetTime
                                        Period
                                        Year
                                        YearMonth
                                        ZoneId
                                        ZoneOffset
                                        ZonedDateTime]]))
                                         
  #?(:clj (:import [java.time Clock
                              DayOfWeek
                              Duration
                              Instant
                              LocalDate
                              LocalDateTime
                              LocalTime
                              Month
                              MonthDay
                              OffsetDateTime
                              OffsetTime
                              Period
                              Year
                              YearMonth
                              ZoneId
                              ZoneOffset
                              ZonedDateTime])))


(defn clock?            [v] (instance? Clock v))
(defn day-of-week?      [v] (instance? DayOfWeek v))
(defn duration?         [v] (instance? Duration v))
(defn instant?          [v] (instance? Instant v))
(defn local-date?       [v] (instance? LocalDate v))
(defn local-date-time?  [v] (instance? LocalDateTime v))
(defn local-time?       [v] (instance? LocalTime v))
(defn month?            [v] (instance? Month v))
(defn month-day?        [v] (instance? MonthDay v))
(defn offset-date-time? [v] (instance? OffsetDateTime v))
(defn offset-time?      [v] (instance? OffsetTime v))
(defn period?           [v] (instance? Period v))
(defn year?             [v] (instance? Year v))
(defn year-month?       [v] (instance? YearMonth v))
(defn zone-id?          [v] (instance? ZoneId v))
(defn zone-offset?      [v] (instance? ZoneOffset v))
(defn zoned-date-time?  [v] (instance? ZonedDateTime v))

;; Since all date, date-time and time instances are local,
;; provide aliases for them without the local prefix
(def date?      local-date?)
(def date-time? local-date-time?)
(def time?      local-time?)
