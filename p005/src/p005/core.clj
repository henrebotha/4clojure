(ns p005.core
  (:gen-class))

(defn -main
  []
  (def problem-statements
    [
      #(= % (conj '(2 3 4) 1))
      #(= % (conj '(3 4) 2 1))])

  (defn solution
    [func]
    (func '(1 2 3 4)))
  (println
    (every?
      identity
      (map solution problem-statements))))
