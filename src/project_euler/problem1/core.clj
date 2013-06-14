(ns project-euler.problem1.core)

(defn devisible? [divisors n]
 (some zero? (map (partial rem n) divisors)))

(defn solve [divisors n]
  (let [numbers    (range n)
        devisible  (partial devisible? divisors)]
    (reduce + (filter devisible numbers))))

(println "Answer" (solve [3 5] 1000))
