(ns clojure-dauble-business-api.core
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [clojure-dauble-business-api.logic :as logic]
            [clojure.tools.logging :as log]
            [clojure-dauble-business-api.domain.artwork])
  (:import [clojure_dauble_business_api.domain.artwork Artwork]))

(defapi app
  (GET "/hello" []
    (log/info "Function begins from here")
    (ok {:artwork (logic/artwork-id 10)}))
  (POST "/create" params
   (log/info "Create - Function begins from here and body" (:name (:artwork (:params params))))
   (ok {:artwork (logic/create-city (:name (:artwork (:params params))))})))
