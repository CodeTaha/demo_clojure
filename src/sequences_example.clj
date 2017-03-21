(ns sequences-example)

(def s [1 2 3])
(seq s)
(first (seq s))
(rest (seq s))
(cons 4 (rest (seq s)))
(range 2)
(range 1 13 2)

(def fibs
  (map first(iterate (fn [[a b]]
                       [b (+ a b)])[0 1])))

(take 5 fibs)
(drop 7 fibs)
(map inc (take 5 fibs))  