(ns clojure-dauble-business-api.test
  (:require [compojure.api.sweet :refer :all])
  (:require [ring.util.http-response :refer :all]
            [clojure.tools.logging :as log]
            [cheshire.core :as json]))

(defapi test
  (GET "/ping" params
    :query-params [value :- String]
    (log/info "Create - header value is " params)
    (def jsonString (json/generate-string (get-in params [:headers])))
    (log/info "Create - header value is " (get-in (json/parse-string jsonString true) [:accesstoken]))
   (ok {:message (str "Hello " value)})))
