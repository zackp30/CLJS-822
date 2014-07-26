(ns test.views
  (:require
    [hiccup
     [page :refer [html5]]
     [page :refer [include-js]]]))




(defn index-page []
  (html5
    [:head
     [:title "CLJS-822"]
     (include-js "/js/main.js")]
    [:body
     [:h1 "CLJS-822"]]))




