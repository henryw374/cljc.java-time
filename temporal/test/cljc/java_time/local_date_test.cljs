(ns cljc.java-time.local-date-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.extn.predicates :as preds]
            [cljc.java-time.local-date :as ld]
            [cljc.java-time.duration :as duration]
            [cljc.java-time.zone-id :as z]))

(deftest now
  (is (preds/local-date? (ld/now)))
  ;todo - test zone that'll return different date to the sys default?
  (is (preds/local-date? (ld/now (z/system-default))))
  (is (= "2020-02-02"
        (str (ld/now
               #js{:plainDateISO (fn [] (ld/parse "2020-02-02"))})))))

(deftest equals-hash-compare
  (let [middle (ld/now)
        earliest (ld/minus middle (duration/parse "P1D"))
        latest (ld/plus middle (duration/parse "P1D"))]
    (is (not= middle earliest))
    (is (= middle (ld/now)))
    ;(compare earliest middle)
    (is (= (sort [latest earliest middle]) [earliest middle latest]))
    (is (= (hash middle) (hash (ld/now))))
    (is (not= (hash earliest) (hash (ld/now))))))


(comment
  
  )
