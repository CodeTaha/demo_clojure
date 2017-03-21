(ns flow-control)

(if true :truthy :falsey) ; true
(if (Object.) :truthy :falsey) ; tru
(if [] :truthy :falsey) ; true

(if false :truthy :falsey) ;false
(if nil :truthy :falsey) ; false
(if (seq []) :truthy :falsey) ; false

(str "2 is" (if (even? 2) "even" "odd"))

(if (even? 6)
  (do (println "even") true)
  (do (println "odd") false))

(if-let [x (even? 4)]
  (println x)
  (println "some odd value"))

(defn show-evens [coll]
  (if-let [evens (seq(filter even? coll))]
    (println (str "the evens are:" evens))
    (println "There were no evens")
  ))
(show-evens [])
(show-evens [1 2 3])
(show-evens [1 3 5])

(let [x 20]
  (cond
    (< x 2) "x is less than 2"
    (> x 10) "x is greater than 10"
    :else "x is between 2 and 10"
    ))

(defn str-binary [n]
  (cond 
    (= n 0) "zero"
    (= n 1) "one"
    :else "unknown")
  )
(str-binary 02)

(defn str-binary2 [n]
  (condp = n 
    0 "zero"
    1 "one"
    "unknown")
  )
(str-binary2 03)

(defn str-binary3 [n]
  (case n 
    0 "zero"
    1 "one"
    "unknown")
  )
(str-binary3 1)

(defn factorial
  ([n] (factorial 1 n) )
  ([accum n]
    (if (zero? n)
      accum
      (factorial (*' accum n) (dec n)))
      )
  )

(factorial 0)
(factorial 20)
(factorial 15000); stack overflow will occur

; to solve stackoverflow use recur
(defn factorial_with_recur
  ([n] (factorial_with_recur 1 n) )
  ([accum n]
    (if (zero? n)
      accum
      (recur (*' accum n) (dec n)))
      )
  )

(factorial_with_recur 20)
(factorial_with_recur 50000)

(try
  (/ 2 0)
  (catch ArithmeticException e "divide by zero 0 " e)
  (finally
    (println "cleanup"))
  )