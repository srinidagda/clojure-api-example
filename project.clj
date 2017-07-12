(defproject clojure-dauble-business-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :ring {:handler clojure-dauble-business-api.routes/app}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.10"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-defaults "0.2.0"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [yesql/yesql "0.5.3"]
                 [org.postgresql/postgresql "9.4.1212"]
                 [org.clojure/data.json "0.2.6"]
                 [cheshire "5.7.1"]
                 [com.googlecode.log4jdbc/log4jdbc "1.2"]
                 [org.slf4j/slf4j-log4j12 "1.7.21"]
                 [org.clojure/tools.logging "0.3.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]]
  :profiles {:dev {:resource-paths ["resources"]}}
  :plugins [[lein-ring "0.12.0"]]
  :main clojure-dauble-business-api.routes)