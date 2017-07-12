(ns clojure-dauble-business-api.routes
    (:require [ring.adapter.jetty :as jetty])
    (:require [compojure.core :refer :all]
             (clojure-dauble-business-api [core :as core]
                                          [test :as t])))
(def app
 (routes core/app t/test))

(jetty/run-jetty app {:port 3000})
