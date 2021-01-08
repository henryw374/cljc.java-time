(ns cljc.java-time.zone-id-test
  (:require [clojure.test :refer [is deftest testing]]
            [cljc.java-time.zone-id :as z]
            [cljc.java-time.extn.predicates :as preds]))

(deftest parsing-test
  (is (preds/zone-id? (z/of "Europe/London"))))

(deftest equals-hash
  (is (= (z/of "Europe/London") (z/of "Europe/London")))
  (is (not= (z/of "Europe/London") (z/of "Europe/Paris")))
  (is (= 1 (get {(z/of "Europe/London") 1} (z/of "Europe/London")))))
