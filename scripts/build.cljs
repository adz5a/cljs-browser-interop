(require '[cljs.build.api :as b])
(require '[cljs.repl :as repl])
(require '[cljs.repl.browser])

(def output-dir "public/out")
(def output-to "public/js/main.js")
(def asset-path "/out")

(def dir-options {:main 'app.core ;; entry point namespace
                  :asset-path asset-path;; path to output-dir relative to the root of the web server,
                                     ;; used when compiling
                                     ;; with no optimizations
                  ; :optimizations :simple ;; will only compile namespaces reachable from the main
                  :output-dir output-dir;; temporary files output
                  :output-to output-to})


(defn build []
  (b/build 
    "src"
    (assoc dir-options 
     :verbose false
     :browser-repl true
     :npm-deps {:react "16.2.0"
                :react-dom "16.2.0"})))


(defn repl []
  (repl/repl (cljs.repl.browser/repl-env)
             :watch "src"
             :output-dir output-dir))


(build)
(repl)
