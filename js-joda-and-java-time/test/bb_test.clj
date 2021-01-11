#!/usr/bin/env bb

(require '[babashka.deps :as deps])

(deps/add-deps '{:deps {cljc.java-time/cljc.java-time {:mvn/version "0.1.12-SNAPSHOT"}}})

(require '[cljc.java-time.instant :as i])
[(i/get-nano (i/now))
 (i/of-epoch-second 23)
  (= (i/parse "2020-11-14T05:59:33.757Z")
        (i/parse "2020-11-14T05:59:33.757Z"))]