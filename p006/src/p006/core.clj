(ns p006.core
  (:gen-class))

(defn -main
  []
  ; (def problem-statement
  ;   #(= [%] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))
  ;
  ; (def solution
  ;   (:a :b :c))
  ; (println problem-statement solution))
  (println (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))
