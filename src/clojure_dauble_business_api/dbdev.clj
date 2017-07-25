(ns clojure-dauble-business-api.dbdev
  (:require [clojure.java.jdbc :as jdbc])
  (:require [yesql.core :refer [defqueries]]))


(def db-spec {:classname "net.sf.log4jdbc.DriverSpy"
              :subprotocol "log4jdbc:postgresql"
              :subname "//localhost:5432/testdb"
              :user "user"
              :password "user123"})

(defqueries "database/artwork/artwork.sql"
  {:connection db-spec})

(defn artwork-by-id[id]
  (artwork-details {:id id}))

(defn artworkslist[]
  (artworks))

(defn create-city
  [name]
  (create-city<! {:name name}))
