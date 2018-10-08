(ns vandy.core
  (:gen-class))


(defn vandy-homepage []
  "https://www.vanderbilt.edu")


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (vandy-homepage)))
