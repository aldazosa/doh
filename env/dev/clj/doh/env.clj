(ns doh.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [doh.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[doh started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[doh has shut down successfully]=-"))
   :middleware wrap-dev})
