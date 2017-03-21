(ns destructuring-example)

;; SEQUENTIAL DESTRUCTURING
(def names ["Bob" "Sally" "Joe"])
(let [[first-name] names] 
  first-name)

(let [[_ second-name] names] 
  second-name
  )
(let [[_ & rest-name] names] 
  rest-name
  )

(defn rest-names [[_ & names]]
  names
  )

;; ASSOCIATIVE DESTRUCTURING

(defn draw-point [& {x :x y :y}]
  [x y]
  )
(draw-point :x 5 :y 10 :z 15)

(defn draw-point2 [& {:keys [x y z]}]
  [x y z]
  )
(draw-point2 :x 5 :y 10 :z 15)

(defn draw-point3 [& {:keys [x y z]
                      :or {x 0 y 1 z 2}}]
  [x y z]
  )
(draw-point3 :x 5 :y 10 :z 15)
(draw-point3 :x 5 :y 10)

