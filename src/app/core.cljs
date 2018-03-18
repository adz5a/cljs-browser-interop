(ns app.core
  (:require [react :refer [createElement]]
            [react-dom]))

(enable-console-print!)

(println "hello world")

(def root (.createElement js/document "div"))

(.appendChild (.-body js/document) root)

(react-dom/render (createElement "div" (clj->js {}) "hello world")
                  root)
