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
                                                                          (command ["kevin-zhang"] kevin-zhang)(command ["brooks-taylor"] brooks-taylor)
                                                                          (command ["sameer-puri"] sameer-puri)
                                                                          (command ["olivia-doran"] olivia-doran)
                                                                          (command ["jacob-lundy"] jacob-lundy)
                                                                          (command ["amanda-brandeen"] amanda-brandeen)
                                                                          (command ["joao-pan"] joao-pan)
                                                                          (command ["justin-hastings"] justin-hastings)
                                                                          (command ["lucy-wang"] lucy-wang)
                                                                          (command ["emily-markert"] emily-markert)
                                                                          (command ["xavier-ryan"] xavier-ryan)])


(defn command-to-map [[ks f doc]] (assoc-in {} ks f))

(defn valid-commands-map [] (reduce merge (map command-to-map valid-commands)))

;; Yunxi
(defn yunxi-xiong []
  (println "Yunxi Xiong"))

;; Yiran
(defn yiran-chen []
  (println "YIRAN CHEN"))

;; Bruce
(defn bruce-brookshire []
  (println "Bruce Brookshire"))


;; Akan
(defn akan-eyoh []
  (println "Akan Eyoh"))


;; Bailey
(defn bailey-pearson []
  (println "Bailey Pearson"))




;; Keaton
(defn keaton-ufheil []
  (println "Keaton Ufheil"))



;; Payton
(defn payton-odaniels []
  (println "Payton ODaniels"))


;; Daniel
(defn daniel-yan []
  (println "danielyan"))



;; Reid
(defn reid-wilson []
  (println "Reid Wilson"))


;; Xavier
(defn xavier-ryan []
  (println "Xavier Ryan"))


;; Aneesha
(defn aneesha-dasari []
  (println "Aneesha Dasari"))

;; Irfaan
(defn irfaan-khalid []
  (println "irfaan khalid"))

;; Manyao
(defn manyao-peng []
   (println "manyao peng"))

;; Aaron
(defn aaron-joseph[]
  (println "aaron joseph"))


;; Jacoby
(defn jacoby-kang []
  (println "jacoby kang"))

;; Jonathan
(defn jonathan-steward []
  (println "jonathan steward"))

;; Darius
(defn darius-jack []
  (println "Darius Jack"))

;; Keola
(defn keola-dunn []
  (str "Keola Dunn"))

;; Davis
(defn davis-zhang []
  (println "Davis Zhang"))

(defn olivia-doran [] (println "Olivia Doran"))

(defn jacob-lundy "Prints jacob Lundy" [] "Jacob Lundy")

(defn brooks-taylor [] (println "Brooks Taylor"))

(defn amanda-brandeen []
  (println "Amanda Brandeen"))

(defn joao-pan [] (println "joao pan"))

(defn justin-hastings []
  (println "Justin Hastings"))

(defn lucy-wang[] (println "lucy wang"))

(defn emily-markert []
  (println "Emily Markert"))

(defn sameer-puri []
  (println "Sameer Puri"))
