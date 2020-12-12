(ns aoc2015.core
  (:gen-class)
  (:require [clojure.java.io :as io]
            [aoc2015.day1 :as day1]
            [aoc2015.day2 :as day2]))

(defn read-resources [resource-name] (slurp (io/resource resource-name)))

(defn -main [& args]
  (def day1 (read-resources "day1"))
  (println "day1.1:" (day1/solve-day-1p1 day1))
  (println "day1.2:" (day1/solve-day-1p2 day1))
  (def day2 (read-resources "day2"))
  (println "day2.1:" (day2/solve-p1 day2))
  (println "day2.2:" (day2/solve-p2 day2)))
