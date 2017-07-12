(ns clojure-dauble-business-api.core
  (:require [compojure.api.sweet :refer :all])
  (:require [ring.util.http-response :refer :all])
  (:require [clojure-dauble-business-api.dbdev :as dbdev])
  (:require [yesql.core :refer [defquery]])
  (:require [cheshire.core :as json])
  (:require [ring.util.response :as response])
  (:require [clojure-dauble-business-api.logic :as logic])
  (:require [clojure.tools.logging :as log])
  (:require [clojure-dauble-business-api.domain.artwork :as artwork]))

(defapi app
  (GET "/hello" []
    (log/info "Function begins from here")
    :return [artwork/artwork]
    :summary "Return list of artworks"
    (ok {:artwork (logic/artworks)})))
