(ns clojure-dauble-business-api.core
  (:require [compojure.api.sweet :refer :all])
  (:require [ring.util.http-response :refer :all]))

(defapi app
  (GET "/hello" []
    :query-params [name :- String]
    (ok {:message (str "Dear " name ", Hello I am here ")})))
