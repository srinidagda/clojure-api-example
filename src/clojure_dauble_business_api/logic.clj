(ns clojure-dauble-business-api.logic
  (:require [clojure-dauble-business-api.dbdev :as dbdev]
    [cheshire.core :as json]))

(defn artwork-id
  [id]
  (json/generate-string (dbdev/artwork-by-id id)))
(defn artworks[]
  (json/generate-string (dbdev/artworkslist)))
(defn create-city
  [name]
  (json/generate-string (dbdev/create-city name)))
