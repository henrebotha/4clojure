(ns p002.core
  (:gen-class))

(defn -main
  []
  (def problem-statement
    #(= (- 10 (* 2 3)) %))
  (def solution
    4)
  (print (problem-statement solution)))
