(ns main
  (:require [clojure.browser.repl :as repl]))

(defn ^:export init []
  (js/alert "ohey"))

(repl/connect "http://localhost:9002/repl")

