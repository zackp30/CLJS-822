(defproject test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2268"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]
                 ]
  :plugins [
            [lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.7"]
            ]
  :ring {:handler test.core/app}
  :cljsbuild {
              :builds [{:source-paths ["src-cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
