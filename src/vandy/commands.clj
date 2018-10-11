(ns vandy.commands
  (:require [vandy.version]))

; Forward declaration, see https://clojuredocs.org/clojure.core/declare
(declare valid-commands)

(defn help "Returns the generic help for this app" [& args]
  (reduce #(clojure.string/join "\n" [%1 %2])
          (map #(clojure.string/join ": " [(clojure.string/join " " (first %1))
                                           (nth %1 2)]) valid-commands)))


(defn version "Returns app version" [& args] (vandy.version/version))

;;comment test
(defmacro command [ks f]
  [ks f `(:doc (meta (var ~f)))])

(def valid-commands "The set of valid commands, indexed by a 'key-path'" [(command ["help"] help)
                                                                          (command ["version"] version)])

(defn command-to-map [[ks f doc]] (assoc-in {} ks f))

(defn valid-commands-map [] (reduce merge (map command-to-map valid-commands)))


;; Bruce
(defn bruce-brookshire []
  (println "Bruce Brookshire"))


;; Akan
(defn akan-eyoh []
  (println "Akan Eyoh"))


;; Bailey
(defn bailey-pearson []
  (println "Bailey Pearson"
))



;; Keaton
(defn keaton-ufheil []
  (println "Keaton Ufheil")
)


;; Payton
(defn payton-odaniels []
  (println "Payton ODaniels"))


;; Daniel
(defn daniel-yan []
  (println "danielyan")
)  


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
;;
;;

;; Aaron
;;
;;

;; Jacoby
;;
;;
(defn jacoby-kang []
  (println "jacoby kang"))

;; Jonathan
;;
;;

;; Michael
;;
;;

;; Darius
(defn darius-jack []
  (println "Darius Jack"))

;; Bruce
;;
;;

;; Keola
;;
;;

;; Davis
(defn davis-zhang []
  (println "Davis Zhang"))
