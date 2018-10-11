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

;;YIRAN CHEN
(defn YIRAN_CHEN []
  (println "YIRAN CHEN"))

;; Irfaan
(defn irfaan-khalid []
  (println "irfaan khalid"))

;; Manyao
;;
;;

;; Aaron
(defn aaron-joseph[]
  (println "aaron joseph"))


;; Jacoby
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
(defn keola-dunn []
  (str "Keola Dunn"))

;; Davis
(defn davis-zhang []
  (println "Davis Zhang"))
