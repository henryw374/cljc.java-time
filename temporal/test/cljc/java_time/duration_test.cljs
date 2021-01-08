(ns cljc.java-time.duration-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.extn.predicates :as preds]
            [cljc.java-time.duration :as duration]))

(deftest parsing
  (is (preds/duration? (duration/parse "PT1S"))))

(deftest equals-hash-compare
  (let [make-middle #(duration/parse "PT1S")
        middle (make-middle)
        smallest (duration/negated (duration/parse "PT1S"))
        largest (duration/parse "PT2S")]
    (is (not= middle smallest))
    (is (= middle (make-middle)))
    (is (= (sort [largest smallest middle]) [smallest middle largest]))
    (is (= (hash middle) (hash (make-middle))))
    (is (not= (hash smallest) (hash (make-middle))))))


(comment
  
  )
