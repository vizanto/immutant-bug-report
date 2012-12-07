(ns immutant.init
  (:use [immutant.web :as web]))


; (server/load-views (util/app-relative "src//views"))
; (web/start "/" (server/gen-handler {:mode :dev :ns '}))

(web/start "/" #(do {:status 200
    :headers {}
    :body (str "Hello bug: " %)}))
