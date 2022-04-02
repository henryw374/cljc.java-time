(ns non-shadow-tests
  (:require [com.widdindustries.vanilla-release-compile :as vrc]
            [com.widdindustries.tiadough-cljs2 :as cljs2]))


(defn cljsjs [{:keys [compile-mode]}]
  (cljs2/start-funnel)
  (vrc/build "cljsjs-test"
    {:preloads ['lambdaisland.chui.remote]
     :closure-defines {'lambdaisland.funnel-client/FUNNEL_URI cljs2/funnel-uri}})
  (cljs/)
  )
