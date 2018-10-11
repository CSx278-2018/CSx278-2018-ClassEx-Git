(ns vandy.commands
  (:require [vandy.version]))

; Forward declaration, see https://clojuredocs.org/clojure.core/declare
(declare valid-commands)

(defn help "Returns the generic help for this app" [& args]
  (reduce #(clojure.string/join "\n" [%1 %2])
          (map #(clojure.string/join ": " [(clojure.string/join " " (first %1))
                                           (nth %1 2)]) valid-commands)))


(defn version "Returns app version" [& args] (vandy.version/version))


(defmacro command [ks f]
  [ks f `(:doc (meta (var ~f)))])

(def valid-commands "The set of valid commands, indexed by a 'key-path'" [(command ["help"] help)
                                                                          (command ["version"] version)])

(defn command-to-map [[ks f doc]] (assoc-in {} ks f))

(defn valid-commands-map [] (reduce merge (map command-to-map valid-commands)))



;; Bruce



;; Akan



;; Bailey




;; Keaton



;; Payton
(defn payton-odaniels []
  (println "Payton ODaniels"))


;; Daniel



;; Reid



;; Xavier
(defn xavier-ryan []
  (println "Xavier Ryan"))


;; Aneesha

