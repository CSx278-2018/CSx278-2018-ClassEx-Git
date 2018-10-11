(ns vandy.commands
  (:require [vandy.version]))

; Forward declaration, see https://clojuredocs.org/clojure.core/declare
(declare valid-commands)

(defn help "Returns the generic help for this app" [& args]
  (reduce #(clojure.string/join "\n" [%1 %2])
          (map #(clojure.string/join ": " [(clojure.string/join " " (first %1))
                                           (nth %1 2)]) valid-commands)))


(defn version "Returns app version" [& args] (vandy.version/version))

(defn luke-mills "Returns lukemills" [& args] "lukemills")

(defn david-torres "Returns davidtorres" [& args] "davidtorres")

(defn anvit-gupta "Returns anvitgupta" [& args] "anvitgupta")

(defn max-engel "Returns maxengel" [& args] "maxengel")

(defn naveen-varadharaj "Returns naveenvaradharaj" [& args] "navenvaradharaj")

(defn sachit-bhat "Returns sachitbhat" [& args] "sachitbhat")

(defn grum-woldemichael "Returns grumwoldemichael" [& args] "grumwoldemichael")

(defn kevin-zhang "Returns kevinzhang" [& args] "kevinzhang")



(defmacro command [ks f]
  [ks f `(:doc (meta (var ~f)))])

(def valid-commands "The set of valid commands, indexed by a 'key-path'" [(command ["help"] help)
                                                                          (command ["version"] version)
                                                                          (command ["luke-mills"] luke-mills)
                                                                          (command ["david-torres"] david-torres)
                                                                          (command ["anvit-gupta"] anvit-gupta)
                                                                          (command ["max-engel"] max-engel)
                                                                          (command ["naveen-varadharaj"] naveen-varadharaj)
                                                                          (command ["sachit-bhat"] sachit-bhat)
                                                                          (command ["grum-woldemichael"] grum-woldemichael)
                                                                          (command ["kevin-zhang"] kevin-zhang)])




(defn command-to-map [[ks f doc]] (assoc-in {} ks f))

(defn valid-commands-map [] (reduce merge (map command-to-map valid-commands)))
