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



;; Yunxi
(defn yunxi-xiong [& args]
  (println "Yunxi Xiong"))

;; Yiran
(defn yiran-chen [& args]
  (println "YIRAN CHEN"))

;; Bruce
(defn bruce-brookshire [& args]
  (println "Bruce Brookshire"))


;; Akan
(defn akan-eyoh [& args]
  (println "Akan Eyoh"))


;; Bailey
(defn bailey-pearson [& args]
  (println "Bailey Pearson"))




;; Keaton
(defn keaton-ufheil [& args]
  (println "Keaton Ufheil"))



;; Payton
(defn payton-odaniels [& args]
  (println "Payton ODaniels"))


;; Daniel
(defn daniel-yan [& args]
  (println "danielyan"))



;; Reid
(defn reid-wilson [& args]
  (println "Reid Wilson"))


;; Xavier
(defn xavier-ryan [& args]
  (println "Xavier Ryan"))


;; Aneesha
(defn aneesha-dasari [& args]
  (println "Aneesha Dasari"))

;; Irfaan
(defn irfaan-khalid [& args]
  (println "irfaan khalid"))

;; Manyao
(defn manyao-peng [& args]
   (println "manyao peng"))

;; Aaron
(defn aaron-joseph[& args]
  (println "aaron joseph"))


;; Jacoby
(defn jacoby-kang [& args]
  (println "jacoby kang"))

;; Jonathan
(defn jonathan-steward [& args]
  (println "jonathan steward"))

;; Darius
(defn darius-jack [& args]
  (println "Darius Jack"))

;; Keola
(defn keola-dunn [& args]
  (str "Keola Dunn"))

;; Davis
(defn davis-zhang [& args]
  (println "Davis Zhang"))

(defn olivia-doran [& args] (println "Olivia Doran"))

(defn jacob-lundy "Prints jacob Lundy" [& args] "Jacob Lundy")

(defn brooks-taylor [& args] (println "Brooks Taylor"))

(defn amanda-brandeen [& args]
  (println "Amanda Brandeen"))

(defn joao-pan [& args] (println "joao pan"))

(defn justin-hastings [& args]
  (println "Justin Hastings"))

(defn lucy-wang [& args] (println "lucy wang"))

(defn emily-markert [& args]
  (println "Emily Markert"))

(defn sameer-puri [& args]
  (println "Sameer Puri"))


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
                                                                          (command ["kevin-zhang"] kevin-zhang)
                                                                          (command ["brooks-taylor"] brooks-taylor)
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
