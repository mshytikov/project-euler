(ns project-euler.problem3.core)

(defn first_prime [n]
  (first (filter #(zero? (mod n %)) (range 2 (inc n)))))

(defn primes
  ([n] (primes n 1))
  ([n prime] (lazy-seq (when (> n 1) (cons prime (let [n1 (/ n prime)] (primes n1 (first_prime n1) )))))))


(defn solve [n]
  (last (primes n)))

(println "Answer" (solve 600851475143))
