;; Boot only configuration
(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"public"}
  
  :dependencies '[[adzerk/boot-cljs "2.1.4"]])

;; clojure code
;; write your compilation tasks below
(require '[adzerk.boot-cljs :refer [cljs]])

