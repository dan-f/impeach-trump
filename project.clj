(defproject impeach-trump "0.1.0-SNAPSHOT"
  :description "Twitter bot calling to impeach Donald Trump"
  :url "https://github.com/dan-f/impeach-trump"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot impeach-trump.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
