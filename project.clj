(def version "0.1.0-SNAPSHOT")
(defproject vandy version
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :manifest {"Implementation-Version" ~version}
  :main ^:skip-aot vandy.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
