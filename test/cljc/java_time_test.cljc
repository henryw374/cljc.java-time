(ns cljc.java-time-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.temporal.chrono-field]
            [cljc.java-time.format.date-time-formatter]
            ))

(deftest multi-tail-var-args
  (testing "multi-tail var args example"
    (is (let [a (make-array java.time.temporal.TemporalField 1)]
          (aset a 0 cljc.java-time.temporal.chrono-field/nano-of-second)
          (cljc.java-time.format.date-time-formatter/with-resolver-fields
            cljc.java-time.format.date-time-formatter/iso-instant
            a)))))
