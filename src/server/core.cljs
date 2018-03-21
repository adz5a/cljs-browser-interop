(ns server.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(println "hello cruel world")
