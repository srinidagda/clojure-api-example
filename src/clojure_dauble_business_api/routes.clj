(ns clojure-dauble-business-api.routes
    (:require [compojure.core :refer :all]
              [ring.adapter.jetty :as jetty]
              [ring.middleware.cors :refer [wrap-cors]]
             (clojure-dauble-business-api [core :as core]
                                          [test :as t])))
(def app
 (routes core/app t/test))

(def handler
    (-> app
        (wrap-cors
         :access-control-allow-origin [#"http://example.com"]
         :access-control-allow-methods [:get :put :post :delete])))


(jetty/run-jetty handler {:port 3000})
