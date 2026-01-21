(ns nojlight.core
  (:require [nightlight.core]
            [scicloj.clay.v2.api :as clay]))

(defn start-watching []
  (clay/make! {:source-path ["src/nojlight/notebook.clj"]
               :live-reload true}))

;;temp modificatiton to spool up a simple http server.
(defn run-server [& {:keys [ip port] :or {port 8080 ip "0.0.0.0"}}]
  (println [:running-server])
  (start-watching)
  (nightlight.core/dev-start {:port port :main 'nightlight.core :ip ip}))


(defn -main [& args]
  (run-server))
