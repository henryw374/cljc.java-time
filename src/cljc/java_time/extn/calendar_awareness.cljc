(ns cljc.java-time.extn.calendar-awareness
  #?(:cljs (:require-macros [cljc.java-time.extn.calendar-awareness :refer [calendar-aware-cljs]]))
  #?(:clj (:import (java.time.temporal UnsupportedTemporalTypeException))))

(defn
  helpful-exception-messages?
  "If true, the lib will try to add more helpful messages to exceptions" []
  #?(:clj (not= "true" (System/getProperty "cljc.java-time.disable-helpful-exception-messages")))
  )

(comment 
  (System/setProperty "cljc.java-time.disable-helpful-exception-messages" "true")
  (System/setProperty "cljc.java-time.disable-helpful-exception-messages" "false")
  )

(def helpful-exception-message
  "Hi there! - It looks like you might be trying to something with a java.time.Instant that would require it to be 'calendar-aware'.
   You should know that java.time.Instant isn't calendar-aware and so has no facility with working 
   with years, months, days etc. To get around that, consider converting the Instant to a 
   ZonedDateTime first or for formatting/parsing specifically, you might add a zone to your formatter.
    see https://stackoverflow.com/a/27483371/1700930. 
    
    You can disable these custom exceptions by setting -Dcljc.java-time.disable-helpful-exception-messages=true")

(defmacro calendar-aware-clj [f]
  (if-not (helpful-exception-messages?)
    f
    `(try
       ~f
       (catch UnsupportedTemporalTypeException e#
         (throw (UnsupportedTemporalTypeException.
                  (str ~helpful-exception-message
                    "\n original message " (.getMessage e#)
                    "\n cause of exception: " (-> (.getStackTrace e#) first
                                                  str))))))))

(defmacro calendar-aware-cljs [f]
  (if-not (helpful-exception-messages?)
    f
    `(try
       ~f
       (catch js/Error e#
         (throw (js/Error. (str ~helpful-exception-message
                             "\n original message " (goog.object/get e# "message")
                             "\n cause of exception: " (goog.object/get e# "stack"))))))))

(comment
  
  *e
  (-> (goog.object/get *e "stack"))
  (in-ns 'cljc.java-time.extn.calendar-awareness)
  (do
    (require '[cljc.java-time.instant :as i])
    (require '[cljc.java-time.temporal.chrono-unit :as cu])
    (require '[cljc.java-time.temporal.chrono-field :as cf])
    (require '[cljc.java-time.local-date :as ld])
    (require '[cljc.java-time.format.date-time-formatter :as f])
    )
(-> (js/Error. "sdf") (.-message))
  (calendar-aware-cljs (i/plus (i/now) 1 cu/years))
  (i/minus (i/now) 1 cu/years)
  (i/plus (i/now) 1 cu/years)
  (i/range (i/now) cf/minute-of-day)
  (i/until (i/now) (cljc.java-time.local-date/now) cu/years)
  (i/from (ld/now))
  (i/adjust-into (i/now) (ld/now))
  (i/with (i/now) cf/minute-of-day 1)
  (i/get (i/now) cf/minute-of-day)

  (def my-format (f/of-pattern "yyyy-MMM-dd"))
  (cljc.java-time.format.date-time-formatter/format my-format (i/now))

  )