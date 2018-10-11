(ns vandy.core
  (:gen-class)
  (:require [vandy.commands :as commands] [clojure.pprint :as pprint]))

(defn vandy-homepage []
  "https://www.vanderbilt.edu")


(defn -main
  "The main function for the app that calls the appropriate command given some arguments."
  [& args]
  (let [command (get-in (commands/valid-commands-map) args)]
    (cond
      (or (nil? command) (not (fn? command))) (println (commands/help))
      :else (println (command args)))))

(defn darius-jack []
  (str "Darius Jack"))
