(ns cljc.java-time.local-date-time-test
  (:require
    [cljc.java-time.local-date-time :as ldt]
    [cljc.java-time.month :refer [january]]
    [clojure.test :refer [deftest is]]))

;; won't pass on JVM. java resolution needs type hints to resolve overloading
;; I suspect others have this problem.
(deftest of-works-in-js-and-jvm
  (is (= (ldt/of 2011 january 3 11 59) (ldt/of 2011 january 3 11 59))))
