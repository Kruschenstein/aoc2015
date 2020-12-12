(ns aoc2015.day2)
(require '[clojure.string :as str])

(defn sort-dimension [dimension]
  (sort (map #(Integer/parseInt %) (str/split dimension #"x"))))

(defn apply-on-dimensions-and-sum [input function]
  (def dimensions (str/split-lines input))
  (reduce + (map #(apply function (sort-dimension %)) dimensions)))

(defn compute-surface [l w h] (+ (* 3 l w) (* 2 w h) (* 2 h l)))

(defn solve-p1 [input]
  (apply-on-dimensions-and-sum input compute-surface))

(defn compute-ribbon-length [l w h] (+ (* 2 l) (* 2 w) (* l w h)))

(defn solve-p2 [input]
  (apply-on-dimensions-and-sum input compute-ribbon-length))

