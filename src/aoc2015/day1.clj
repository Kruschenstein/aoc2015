(ns aoc2015.day1)

(defn solve-day-1p1 [input]
  (reduce + (map #(if (= % \() 1 (- 1)) input)))

(defn solve-day-1p2 [input]
  (def direction (map #(if (= % \() 1 (- 1)) input))
  (def direction-step-by-step (reductions + direction))
  (def directions-with-indices (map list direction-step-by-step (drop 1 (range))))
  (second (first (filter (fn [[x i]] (= x (- 1))) directions-with-indices))))
