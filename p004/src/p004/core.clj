(ns p004.core
  (:gen-class))

(defn -main
  []
  (println (= (list :a :b :c) '(:a :b :c))))
; TODO: this is bad, find a way to do this like the earlier problems
