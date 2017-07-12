(ns clojure-dauble-business-api.test
  (:require [compojure.api.sweet :refer :all])
  (:require [ring.util.http-response :refer :all]))

(defapi test
  (GET "/ping" []
    :query-params [value :- String]
    (ok {:message (str "Hello " value)})))
