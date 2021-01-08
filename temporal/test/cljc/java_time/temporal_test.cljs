(ns cljc.java-time.temporal-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.extn.predicates :as preds]
            [cljc.java-time.local-date :as ld]))

(deftest preds
  (is (preds/clock? js/Temporal.now))
  (is (preds/local-date? (ld/now)))
  (is (not (preds/clock? (ld/now)))))

(comment 
  (ld/now)
  )
