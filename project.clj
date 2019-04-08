(defproject cljc.java-time "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cljs.java-time "0.1.8"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/clojure "1.10.0"]
                                  [camel-snake-kebab "0.4.0"]
                                  [medley "0.8.4"]
                                  [org.clojure/tools.namespace "0.2.11"]]}})
