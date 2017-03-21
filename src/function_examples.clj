(ns function-examples)

(defn multiArity 
  ([] (multiArity "hello default"))
  ([msg] (print msg))
)

; Variadic functions and Arity
(defn messenger [greeting & who]
  (print greeting who))
; apply
(defn messenger2 [greeting & who]
  (apply print greeting who)
 )

(let [numbers '(1 2 3)]
  (apply + numbers))