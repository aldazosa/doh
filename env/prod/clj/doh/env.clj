(ns doh.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[doh started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[doh has shut down successfully]=-"))
   :middleware identity})
