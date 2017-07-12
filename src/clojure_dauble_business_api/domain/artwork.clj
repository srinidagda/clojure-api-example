(ns clojure-dauble-business-api.domain.artwork
  (:require [schema.core :as schema]))

(schema/defschema artwork {:id Integer (schema/optional-key :name) String})
