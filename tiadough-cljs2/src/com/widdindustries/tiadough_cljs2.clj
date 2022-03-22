(ns com.widdindustries.tiadough-cljs2
  (:require [clojure.java.io :as io]
            [clojure.pprint :as pprint]
            [shadow.cljs.devtools.api :as api]
            [shadow.cljs.devtools.server :as server]
            [shadow.cljs.devtools.server.npm-deps :as npm-deps]
            [shadow.cljs.build-report :as build-report]
            [clojure.java.shell :as sh]
            [lambdaisland.funnel :as funnel]
            [shadow.cljs.devtools.config :as config]
            [kaocha.repl]
            [clojure.string :as string]))

(def dev-server-port 9000)
(def funnel-port 9010)
(def funnel-uri (str "ws://localhost:" funnel-port))
(def shadow-local (str "http://localhost:" dev-server-port))
(def test-url (str shadow-local "/browser-test"))

(defonce funnel-server nil)

(defn stop-funnel []
  (when funnel-server
    (.close funnel-server)
    (alter-var-root #'funnel-server (constantly nil))))

(defn start-funnel []
  (System/setProperty "lambdaisland.funnel.uri" funnel-uri)
  (if (and funnel-server @funnel-server)
    nil
    (when-let [server (funnel/start-server (funnel/websocket-server
                                             {:state (atom {})
                                              :port funnel-port}))]
      (funnel/init-logging 1 nil)
      (alter-var-root #'funnel-server (constantly server)))))

(def server-config
  (merge config/default-config
    {:deps     {:aliases [:client :dev]}
     :http     {:port 9020}
     :dev-http {dev-server-port
                {:root "classpath:public"}}
     ;todo - devcards bits
     }))

(defn npm-i []
  (npm-deps/main server-config {})
  (sh/sh "npm" "i"))

(defn stop-server []
  (stop-funnel)
  (server/stop!))

(defn start-server
  ([] (start-server {}))
  ([opts]
   (npm-i)
   (server/start! (merge server-config opts))
   (start-funnel)))

(defn restart-server
  ([] (restart-server {}))
  ([opts]
   (stop-server)
   (start-server opts)))

(defn cljs-ns-available? [ns-sym]
  (-> ns-sym
      str
      (string/replace "." "/")
      (string/replace "-" "_")
      (str ".cljs")
      (io/resource)))

(defn browser-app-config []
  {:build-id        :app-dev
   :target          :browser
   :output-dir      "web-target/public/cljs-out"
   :closure-defines {}
   :devtools        {:watch-dir "web-target/public"
                     :preloads  (cond-> []
                                  (cljs-ns-available? 'devtools.preload)
                                  (conj 'devtools.preload))}
   :asset-path "/cljs-out"})

(defn clean-dir [d]
  (sh/sh "rm" "-rf" d))

(defn clean-npm []
  (clean-dir "node_modules"))

(defn clean-build
  ([] (clean-build ""))
  ([path]
   (clean-dir (str "web-target/public/" path))))

(defn clean-shadow-cache []
  (clean-dir ".shadow-cljs/builds"))

(defn prod-build
  ([build]
   (prod-build build {:source-maps true}))
  ([build opts]
   (start-server opts)
   (api/stop-worker :app-dev)
   (clean-build (name (get build :build-id build)))
   (api/release* build opts)
   nil))

(defn watch
  ([build] (watch build {}))
  ([build opts]
   (start-server opts)
   (api/stop-worker (get build :build-id build))
   (clean-build (name (get build :build-id build)))
   (api/watch build (merge {:verbose false} opts))))

(defn stop-watch [build]
  (api/stop-worker (get build :build-id build)))

(defn repl
  ([] (repl :app-dev))
  ([build-name]
   (api/repl build-name)))

(defn browser-test-config []
  {:build-id :browser-test-build
   :target :browser-test
   :runner-ns 'kaocha.cljs2.shadow-runner
   :test-dir "web-target/public/browser-test"
   :asset-path "/browser-test/js"
   :build-options {}
   :closure-defines {'lambdaisland.funnel-client/FUNNEL_URI funnel-uri}
   :devtools {:preloads (cond-> ['lambdaisland.chui.remote ]
                          (cljs-ns-available? 'devtools.preload)
                          (conj 'devtools.preload))
              }})

(def compile-fns
  {:watch watch
   :once api/compile*
   :release api/release*})

(defn browser-test-build [compile-mode opts]
  (.mkdirs (io/file "web-target" "public" "browser-test"))
  (spit "web-target/public/browser-test/index.html"
    "<!DOCTYPE html>
    <html><head>
    <title>kaocha.cljs2.shadow-runner</title>
    <meta charset=\"utf-8\">
    </head>
    <body>
    <script src=\"/browser-test/js/test.js\"></script><script>kaocha.cljs2.shadow_runner.init();</script></body></html>"
    )
  ((get compile-fns compile-mode)
   (browser-test-config) opts)
  (println "for tests, open " test-url))

(defn run-tests []
  (kaocha.repl/run
    :browser-tests
    #:kaocha{:tests
             [#:kaocha.testable{:id   :browser-tests
                                :type :kaocha.type/cljs2}]}))

(def ^:dynamic *chrome-command*
  (case (System/getProperty "os.name")
    "Mac OS X" "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"
    "chrome"))

(defn chrome-headless-proc [url]
  (let [[cmd opts] (#'sh/parse-args [*chrome-command* "--disable-gpu"
                                "--remote-debugging-socket-fd=0"
                                "--headless" "--remote-debugging-port=0"
                                "--no-sandbox" "--enable-logging"
                                url])]
    (.exec (Runtime/getRuntime)
      ^"[Ljava.lang.String;" (into-array cmd)
      (#'sh/as-env-strings (:env opts))
      (io/as-file (:dir opts)))))

(defn compile-and-run-tests-headless* [compile-mode]
  (start-server)
  (browser-test-build compile-mode {})
  (let [chrome (chrome-headless-proc test-url)]
    (Thread/sleep 2000)
    (try
      (run-tests)
      (finally
        ;(println "killing pid " (.pid chrome))
        (.destroyForcibly chrome)))))

(defn tests-ci [{:keys [compile-mode]}]
  (let [result (compile-and-run-tests-headless* compile-mode)]
    (if (or (some pos? ((juxt :kaocha.result/error :kaocha.result/fail :kaocha.result/pending)
                          result)))
      (System/exit 1)
      (System/exit 0))))















