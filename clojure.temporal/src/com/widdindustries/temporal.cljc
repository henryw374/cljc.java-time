(ns com.widdindustries.temporal
  (:refer-clojure
    :exclude [+ - * inc dec max min
              range time
              < <= > >= << >>] )
  (:require
    #?@(:clj [[tick.alpha.api :as t]
              [tick.protocols :as p]
              [tick.core :as core]]
        :cljs [[cljc.java-time.duration]
               [cljc.java-time.local-date]])))

(defn +
  "Sum amounts of time.

  Prefer >> for moving forward a date/time"
  ([] cljc.java-time.duration/zero)
  ([arg] arg)
  ([arg & args]
   #?(:clj (reduce p/+ arg args)
      :cljs (reduce (fn [^js r n]
                      (cljc.java-time.duration/plus r n)) arg args))))

(defn - []
  ([] cljc.java-time.duration/zero)
  ([arg] arg)
  ([arg & args]
   #?(:clj (reduce p/+ arg args)
      :cljs (reduce (fn [^js r n]
                      (cljc.java-time.duration/minus r n)) arg args))))

;(defn < [])
;(defn <= [])
;(defn > [])
;(defn >= [])
;(defn date [])
;(defn dec [])
;(defn duration [])
;(defn end [])
;(defn in [])
;(defn inc [])
;(defn instant [])
;(defn max [])
;(defn min [])
;(defn month [])
;(defn new-period [])
;(defn on [])
;(defn range [])
;(defn today [])
;(defn with [])
;(defn year [])

