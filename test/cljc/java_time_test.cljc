(ns cljc.java-time-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.temporal.chrono-field]
            [cljc.java-time.format.date-time-formatter]
            [cljc.java-time.year-month]
            [cljc.java-time.month]
            [cljc.java-time.year]
            ))

#?(:clj
   (deftest multi-tail-var-args
          (testing "multi-tail var args example"
            (is (let [a (make-array java.time.temporal.TemporalField 1)]
                  (aset a 0 cljc.java-time.temporal.chrono-field/nano-of-second)
                  (cljc.java-time.format.date-time-formatter/with-resolver-fields
                    cljc.java-time.format.date-time-formatter/iso-instant
                    a))))))

(deftest normal-multi-tail
  (is (cljc.java-time.year-month/of (int 12) (int 12)))
  (is (cljc.java-time.year-month/of (int 12) cljc.java-time.month/january)))

(deftest get-longs
  (testing "normal getter"
    (is (cljc.java-time.year-month/get-year
          (cljc.java-time.year-month/now))))
  (testing "getLong, which has a different name in jsjoda :-S "
    (is (cljc.java-time.year-month/get-long
          (cljc.java-time.year-month/now)
          cljc.java-time.temporal.chrono-field/month-of-year))))

(deftest leap-year 
  (testing "no obv. way to accommodate both isLeap methods. just going with the static one"
    (is (cljc.java-time.year/is-leap 24))))