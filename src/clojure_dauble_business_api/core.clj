(ns clojure-dauble-business-api.core
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [clojure-dauble-business-api.logic :as logic]
            [clojure.tools.logging :as log]
            [clojure-dauble-business-api.domain.artwork]
            [cheshire.core :as json])
  (:import [clojure_dauble_business_api.domain.artwork Artwork]))


(defapi app
  (GET ["/hello/:id", :id #"[0-9]+"] [id :as request]
    (log/info "Function begins from here" request)
    (def jsonString (json/generate-string (get-in request [:headers])))
    (log/info "Create - header value is " (get-in (json/parse-string jsonString true) [:accesstoken]))
    (def artworkData (logic/artwork-id (->> id (re-find #"\d+") Long/parseLong)))
    (def data (if (not-empty artworkData)
               {:data artworkData :status 200}
               {:data [] :status 201}))
   (ok data))
  (POST "/create" params
   (log/info "Create - Function begins from here and body" (get-in params [:params :artwork :name]))
   (log/info "Create - header value is " (get-in params [:headers]))
   (ok {:artwork (logic/create-city (get-in params [:params :artwork :name]))})))
