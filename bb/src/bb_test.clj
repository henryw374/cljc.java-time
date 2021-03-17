(ns bb-test
  (:require ;[babashka.deps :as deps]
            [cljc.java-time.instant :as i]))

;(deps/add-deps '{:deps {cljc.java-time/cljc.java-time {:mvn/version "0.1.15"}}})

[(i/get-nano (i/now))
 (i/of-epoch-second 23)
  (= (i/parse "2020-11-14T05:59:33.757Z")
        (i/parse "2020-11-14T05:59:33.757Z"))]