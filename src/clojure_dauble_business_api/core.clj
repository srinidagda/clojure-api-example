(ns clojure-dauble-business-api.core
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [clojure-dauble-business-api.logic :as logic]
            [clojure.tools.logging :as log]
            [clojure-dauble-business-api.domain.artwork])
  (:import [clojure_dauble_business_api.domain.artwork Artwork]))

(defapi app
  (GET ["/hello/:id", :id #"[0-9]+"] [id]
    (log/info "Function begins from here" id)
    (ok {:artwork (logic/artwork-id (->> id (re-find #"\d+") Long/parseLong))}))
  (POST "/create" params
   (log/info "Create - Function begins from here and body" (get-in params [:params :artwork :name]))
   (ok {:artwork (logic/create-city (get-in params [:params :artwork :name]))})))
