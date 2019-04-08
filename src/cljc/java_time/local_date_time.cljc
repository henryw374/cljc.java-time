(ns cljc.java-time.local-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [cljs.java-time :refer [LocalDateTime]])) #? (:clj (:import [java.time LocalDateTime])))

(defn compare-to ([^java.time.LocalDateTime G__26058 G__26059] (.compareTo ^java.time.LocalDateTime G__26058 G__26059)))


(defn is-supported ([^java.time.LocalDateTime G__26060 G__26061] (.isSupported ^java.time.LocalDateTime G__26060 G__26061)))


(defn plus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26062 G__26063] (.plusYears ^java.time.LocalDateTime G__26062 G__26063)))


(defn query ^java.lang.Object ([^java.time.LocalDateTime G__26064 ^java.time.temporal.TemporalQuery G__26065] (.query ^java.time.LocalDateTime G__26064 ^java.time.temporal.TemporalQuery G__26065)))


(defn with-second ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26066 G__26067] (.withSecond ^java.time.LocalDateTime G__26066 G__26067)))


(defn get-second ([^java.time.LocalDateTime G__26068] (jti/getter second ^java.time.LocalDateTime G__26068)))


(defn get-day-of-month ([^java.time.LocalDateTime G__26069] (jti/getter dayOfMonth ^java.time.LocalDateTime G__26069)))


(defn of ^java.time.LocalDateTime ([G__26071 G__26072 G__26073 G__26074 G__26075 G__26076 G__26077] (. java.time.LocalDateTime of G__26071 G__26072 G__26073 G__26074 G__26075 G__26076 G__26077)) ([^java.time.LocalDate G__26079 ^java.time.LocalTime G__26080] (. java.time.LocalDateTime of ^java.time.LocalDate G__26079 ^java.time.LocalTime G__26080)) ([G__26082 G__26083 G__26084 G__26085 G__26086 G__26087] (. java.time.LocalDateTime of G__26082 G__26083 G__26084 G__26085 G__26086 G__26087)) ([G__26089 G__26090 G__26091 G__26092 G__26093] (. java.time.LocalDateTime of G__26089 G__26090 G__26091 G__26092 G__26093)))



(defn minus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26094 G__26095] (.minusNanos ^java.time.LocalDateTime G__26094 G__26095)))


(defn range ^java.time.temporal.ValueRange ([^java.time.LocalDateTime G__26096 ^java.time.temporal.TemporalField G__26097] (.range ^java.time.LocalDateTime G__26096 ^java.time.temporal.TemporalField G__26097)))


(defn with-day-of-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26098 G__26099] (.withDayOfYear ^java.time.LocalDateTime G__26098 G__26099)))


(defn is-equal ([^java.time.LocalDateTime G__26100 ^java.time.chrono.ChronoLocalDateTime G__26101] (.isEqual ^java.time.LocalDateTime G__26100 ^java.time.chrono.ChronoLocalDateTime G__26101)))


(defn of-instant ^java.time.LocalDateTime ([^java.time.Instant G__26103 ^java.time.ZoneId G__26104] (. java.time.LocalDateTime ofInstant ^java.time.Instant G__26103 ^java.time.ZoneId G__26104)))


(defn with-minute ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26105 G__26106] (.withMinute ^java.time.LocalDateTime G__26105 G__26106)))



(defn format ^java.lang.String ([^java.time.LocalDateTime G__26107 ^java.time.format.DateTimeFormatter G__26108] (.format ^java.time.LocalDateTime G__26107 ^java.time.format.DateTimeFormatter G__26108)))



(defn of-epoch-second ^java.time.LocalDateTime ([G__26110 G__26111 ^java.time.ZoneOffset G__26112] (. java.time.LocalDateTime ofEpochSecond G__26110 G__26111 ^java.time.ZoneOffset G__26112)))


(defn minus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26113 G__26114] (.minusMonths ^java.time.LocalDateTime G__26113 G__26114)))


(defn get ([^java.time.LocalDateTime G__26115 ^java.time.temporal.TemporalField G__26116] (.get ^java.time.LocalDateTime G__26115 ^java.time.temporal.TemporalField G__26116)))


(defn truncated-to ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26117 ^java.time.temporal.TemporalUnit G__26118] (.truncatedTo ^java.time.LocalDateTime G__26117 ^java.time.temporal.TemporalUnit G__26118)))


(defn minus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26119 G__26120] (.minusWeeks ^java.time.LocalDateTime G__26119 G__26120)))


(defn minus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26121 G__26122] (.minusSeconds ^java.time.LocalDateTime G__26121 G__26122)))


(defn to-local-time ^java.time.LocalTime ([^java.time.LocalDateTime G__26123] (.toLocalTime ^java.time.LocalDateTime G__26123)))


(defn now ^java.time.LocalDateTime ([G__26125] (. java.time.LocalDateTime now G__26125)) ([] (. java.time.LocalDateTime now)))


(defn minus-years ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26127 G__26128] (.minusYears ^java.time.LocalDateTime G__26127 G__26128)))


(defn minus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26129 G__26130] (.minusDays ^java.time.LocalDateTime G__26129 G__26130)))


(defn plus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26131 G__26132] (.plusHours ^java.time.LocalDateTime G__26131 G__26132)))



(defn get-day-of-year ([^java.time.LocalDateTime G__26133] (jti/getter dayOfYear ^java.time.LocalDateTime G__26133)))


(defn get-month ^java.time.Month ([^java.time.LocalDateTime G__26134] (jti/getter month ^java.time.LocalDateTime G__26134)))


(defn plus-seconds ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26135 G__26136] (.plusSeconds ^java.time.LocalDateTime G__26135 G__26136)))


(defn plus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26137 G__26138] (.plusMinutes ^java.time.LocalDateTime G__26137 G__26138)))


(defn to-local-date ^java.time.chrono.ChronoLocalDate ([^java.time.LocalDateTime G__26139] (.toLocalDate ^java.time.LocalDateTime G__26139)))



(defn until ([^java.time.LocalDateTime G__26140 ^java.time.temporal.Temporal G__26141 ^java.time.temporal.TemporalUnit G__26142] (.until ^java.time.LocalDateTime G__26140 ^java.time.temporal.Temporal G__26141 ^java.time.temporal.TemporalUnit G__26142)))



(defn at-offset ^java.time.OffsetDateTime ([^java.time.LocalDateTime G__26143 ^java.time.ZoneOffset G__26144] (.atOffset ^java.time.LocalDateTime G__26143 ^java.time.ZoneOffset G__26144)))




(defn is-before ([^java.time.LocalDateTime G__26145 ^java.time.chrono.ChronoLocalDateTime G__26146] (.isBefore ^java.time.LocalDateTime G__26145 ^java.time.chrono.ChronoLocalDateTime G__26146)))


(defn adjust-into ^java.time.temporal.Temporal ([^java.time.LocalDateTime G__26147 ^java.time.temporal.Temporal G__26148] (.adjustInto ^java.time.LocalDateTime G__26147 ^java.time.temporal.Temporal G__26148)))


(defn get-hour ([^java.time.LocalDateTime G__26149] (jti/getter hour ^java.time.LocalDateTime G__26149)))


(defn minus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__26150 G__26151 G__26152] (.minus ^java.time.LocalDateTime G__26150 G__26151 G__26152)) ([^java.time.LocalDateTime G__26153 G__26154] (.minus ^java.time.LocalDateTime G__26153 G__26154)))


(defn plus-nanos ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26155 G__26156] (.plusNanos ^java.time.LocalDateTime G__26155 G__26156)))


(defn get-nano ([^java.time.LocalDateTime G__26157] (jti/getter nano ^java.time.LocalDateTime G__26157)))


(defn get-year ([^java.time.LocalDateTime G__26158] (jti/getter year ^java.time.LocalDateTime G__26158)))


(defn with-day-of-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26159 G__26160] (.withDayOfMonth ^java.time.LocalDateTime G__26159 G__26160)))


(defn is-after ([^java.time.LocalDateTime G__26161 ^java.time.chrono.ChronoLocalDateTime G__26162] (.isAfter ^java.time.LocalDateTime G__26161 ^java.time.chrono.ChronoLocalDateTime G__26162)))


(defn to-string ^java.lang.String ([^java.time.LocalDateTime G__26163] (.toString ^java.time.LocalDateTime G__26163)))


(defn plus-months ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26164 G__26165] (.plusMonths ^java.time.LocalDateTime G__26164 G__26165)))


(defn with-hour ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26166 G__26167] (.withHour ^java.time.LocalDateTime G__26166 G__26167)))


(defn equals ([^java.time.LocalDateTime G__26168 ^java.lang.Object G__26169] (.equals ^java.time.LocalDateTime G__26168 ^java.lang.Object G__26169)))


(defn at-zone ^java.time.ZonedDateTime ([^java.time.LocalDateTime G__26170 G__26171] (.atZone ^java.time.LocalDateTime G__26170 G__26171)))


(defn get-month-value ([^java.time.LocalDateTime G__26172] (jti/getter monthValue ^java.time.LocalDateTime G__26172)))




(defn with-nano ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26173 G__26174] (.withNano ^java.time.LocalDateTime G__26173 G__26174)))


(defn get-minute ([^java.time.LocalDateTime G__26175] (jti/getter minute ^java.time.LocalDateTime G__26175)))


(defn minus-hours ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26176 G__26177] (.minusHours ^java.time.LocalDateTime G__26176 G__26177)))


(defn get-day-of-week ^java.time.DayOfWeek ([^java.time.LocalDateTime G__26178] (jti/getter dayOfWeek ^java.time.LocalDateTime G__26178)))


(defn plus-days ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26179 G__26180] (.plusDays ^java.time.LocalDateTime G__26179 G__26180)))


(defn plus-weeks ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26181 G__26182] (.plusWeeks ^java.time.LocalDateTime G__26181 G__26182)))


(defn hash-code ([^java.time.LocalDateTime G__26183] (.hashCode ^java.time.LocalDateTime G__26183)))



(defn get-long ([^java.time.LocalDateTime G__26184 ^java.time.temporal.TemporalField G__26185] (jti/getter long ^java.time.LocalDateTime G__26184 ^java.time.temporal.TemporalField G__26185)))


(defn with ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__26186 G__26187 G__26188] (.with ^java.time.LocalDateTime G__26186 G__26187 G__26188)) ([^java.time.LocalDateTime G__26189 G__26190] (.with ^java.time.LocalDateTime G__26189 G__26190)))


(defn from ^java.time.LocalDateTime ([^java.time.temporal.TemporalAccessor G__26192] (. java.time.LocalDateTime from ^java.time.temporal.TemporalAccessor G__26192)))


(defn parse ^java.time.LocalDateTime ([^java.lang.CharSequence G__26194] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__26194)) ([^java.lang.CharSequence G__26196 ^java.time.format.DateTimeFormatter G__26197] (. java.time.LocalDateTime parse ^java.lang.CharSequence G__26196 ^java.time.format.DateTimeFormatter G__26197)))


(defn plus ^java.time.chrono.ChronoLocalDateTime ([^java.time.LocalDateTime G__26198 G__26199 G__26200] (.plus ^java.time.LocalDateTime G__26198 G__26199 G__26200)) ([^java.time.LocalDateTime G__26201 G__26202] (.plus ^java.time.LocalDateTime G__26201 G__26202)))


(defn with-year ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26203 G__26204] (.withYear ^java.time.LocalDateTime G__26203 G__26204)))



(defn with-month ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26205 G__26206] (.withMonth ^java.time.LocalDateTime G__26205 G__26206)))


(defn minus-minutes ^java.time.LocalDateTime ([^java.time.LocalDateTime G__26207 G__26208] (.minusMinutes ^java.time.LocalDateTime G__26207 G__26208)))

