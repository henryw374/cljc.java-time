(ns cljc.java-time.extn.predicates)

(defn clock?            [v] (boolean (goog.object/get v "plainDateISO" )))
(defn duration?         [v] (instance? js/Temporal.Duration v))
(defn instant?          [v] (instance? js/Temporal.Instant v))
(defn local-date?       [v] (instance? js/Temporal.PlainDate v))
(defn local-date-time?  [v] (instance? js/Temporal.PlainDateTime v))
(defn local-time?       [v] (instance? js/Temporal.PlainTime v))
(defn month-day?        [v] (instance? js/Temporal.MonthDay v))
(defn year-month?       [v] (instance? js/Temporal.YearMonth v))
(defn zone-id?          [v] (instance? js/Temporal.TimeZone v))
(defn zoned-date-time?  [v] (instance? js/Temporal.ZonedDateTime v))

;;N/A
;(defn day-of-week?      [v] (instance? DayOfWeek v))
;(defn month?            [v] (instance? Month v))
;(defn year?             [v] (instance? Year v))
;(defn offset-date-time? [v] (instance? OffsetDateTime v))
;(defn offset-time?      [v] (instance? OffsetTime v))
;(defn period?           [v] (instance? Period v))
;(defn zone-offset?      [v] (instance? ZoneOffset v))


;; Since all date, date-time and time instances are local,
;; provide aliases for them without the local prefix
(def date?      local-date?)
(def date-time? local-date-time?)
(def time?      local-time?)
