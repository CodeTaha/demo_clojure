(ns collections-example)
 ; lists
 (1 2 3)                       ; gives error
 (quote (1 2 3))
 '(1 2 3)
 (conj '(6 5) 4)
 
 ; Vectors
 [1 2 3]
 '[1 2 3]
 [1 2 (+ 1 2)]
 '[1 2 (+ 1 2)]
 (vector 1 2 3)
 
 (def lst '(2 3))
 (vec (conj lst 1))
 
 (nth [1 2 3] 1)
 
 ; Maps
 
 (def jdoe {:name "John Doe" 
            :address {:zip 400010}}
   )
 (get jdoe :name) ;get value at name key
 (get jdoe :age 21) ; returs default
 (get-in jdoe [:address :zip])
 (get-in jdoe [:address :suite] "Ste 3.")
 
 (assoc-in jdoe [:address :zip] 102150)
 (assoc jdoe :age 34)
 
 (update-in jdoe [:address :zip] inc)
 (contains? jdoe :address)  ; true
 (contains? jdoe :height) ;false
 