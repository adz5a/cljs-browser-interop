(ns app.core
  (:require [cljsjs.react :as react :refer [createElement]]
            [cljsjs.react.dom :as react-dom :refer [render]]))

(enable-console-print!)

(println "hello world")


(render
  (createElement "div" #js{} "yolo world")
  (.getElementById js/document "app"))

(defn yell []
  (println "yola"))

(defn on-js-reload []
  (println "reloaded"))
