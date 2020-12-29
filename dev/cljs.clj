(ns cljs
  (:require [figwheel.main.api :as fig]
            ))


(defn figwheel-start! []
  (fig/start {:mode :serve} "jt")
  (println "auto run tests at http://localhost:9504/figwheel-extra-main/auto-testing"))

(defn figwheel-stop! []
  (fig/stop-all))

(defn cljs-repl []
  (fig/cljs-repl "jt"))

(comment

  (figwheel-start!)
  (figwheel-stop!)
  (cljs-repl)


  )
