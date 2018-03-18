(require '[lumo.build.api :as b])

(defn build []
  (b/build 
    (b/inputs "src")
    {:main 'app.core ;; entry point namespace
     :asset-path "/out" ;; path to output-dir relative to the
                        ;; root of the web server, used when compiling
                        ;; with no optimizations
     ; :optimizations :simple ;; will only compile namespaces reachable from the main
     :output-dir "public/out" ;; temporary files output
     :output-to "public/js/main.js"}))

(build)
