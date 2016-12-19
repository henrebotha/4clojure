(ns p003.core
  (:gen-class))

(defn -main
  []
  (def problem-statement
    #(= % (.toUpperCase "hello world")))
  (def solution
    "HELLO WORLD")
  (print (problem-statement solution)))
