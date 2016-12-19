(ns p001.core
  (:gen-class))

(defn -main
  []
  (def problem-statement
    #(= % true))
  (def solution
    true)
  (println (problem-statement solution)))
