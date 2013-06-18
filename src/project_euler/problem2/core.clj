(ns project-euler.problem2.core)

(def fibo 
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))

(defn solve [n]
  (reduce + (take-while (partial > n) (take-nth 3 fibo))))

(println "Answer" (solve 4000000))
