(ns aoc2015.core
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn read-resources [resource-name] (slurp (io/resource resource-name)))

(defn solve-day-1p1 [input]
  (reduce + (map #(if (= % \() 1 (- 1)) input)))

(defn solve-day-1p2 [input]
  (def direction (map #(if (= % \() 1 (- 1)) input))
  (def direction-step-by-step (reduce (fn [acc elem] (conj acc (+ (last acc) elem))) [0] direction))
  (def directions-with-indices (map list direction-step-by-step (range)))
  (second (first (filter (fn [[x i]] (= x (- 1))) directions-with-indices))))

(defn -main [& args]
  (def day1 (read-resources "day1"))
  (println "day1.1:" (solve-day-1p1 day1))
  (println "day1.2:" (solve-day-1p2 day1)))
