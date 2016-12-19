(ns p003.core
  (:gen-class))

(defn -main
  []
  (def problem-statement
    #(= % (.toUpperCase "hello world")))
  (def solution
    "HELLO WORLD")
  (println (problem-statement solution)))
