(ns test.core
  (:use compojure.core
        test.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "404 - not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))
