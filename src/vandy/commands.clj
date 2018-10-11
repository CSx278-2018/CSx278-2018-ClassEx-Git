(ns vandy.commands
  (:require [vandy.version]))

; Forward declaration, see https://clojuredocs.org/clojure.core/declare
(declare valid-commands)

(defn help "Returns the generic help for this app" [& args]
  (reduce #(clojure.string/join "\n" [%1 %2])
          (map #(clojure.string/join ": " [(clojure.string/join " " (first %1))
                                           (nth %1 2)]) valid-commands)))


(defn version "Returns app version" [& args] (vandy.version/version))


(defn sameer-puri []
  (println "Sameer Puri"))


(defmacro command [ks f]
  [ks f `(:doc (meta (var ~f)))])

(def valid-commands "The set of valid commands, indexed by a 'key-path'" [(command ["help"] help)
                                                                          (command ["version"] version)
                                                                          (command ["brooks-taylor"] brooks-taylor)
                                                                          (command ["sameer-puri"] sameer-puri)
                                                                          (command ["olivia-doran"] olivia-doran)
                                                                          (command ["jacob-lundy"] jacob-lundy)
                                                                          (command ["amanda-brandeen"] amanda-brandeen)
                                                                          (command ["joao-pan"] joao-pan)
                                                                          (command ["justin-hastings"] justin-hastings)
                                                                          (command ["lucy-wang"] lucy-wang)
                                                                          (command ["emily-markert"] emily-markert)])

(defn command-to-map [[ks f doc]] (assoc-in {} ks f))

(defn valid-commands-map [] (reduce merge (map command-to-map valid-commands)))

(defn olivia-doran [] (println "Olivia Doran"))

(defn jacob-lundy "Prints jacob Lundy" [] "Jacob Lundy")

(defn brooks-taylor[] (println "Brooks Taylor"))

(defn amanda-brandeen []
  (println "Amanda Brandeen"))

(defn joao-pan [] (println "joao pan"))

(defn justin-hastings []
  (println "Justin Hastings"))

(defn lucy-wang[] (println "lucy wang"))

(defn emily-markert [] 
  (println "Emily Markert"))
  
