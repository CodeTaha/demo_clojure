(ns namespaces-example
  (:require [clojure.set :as set])
  (:use [clojure.java.io :only (delete-file)])
  )

; uncomment lines for ref
; require an external ns
;(require 'clojure.set)
; call a function of that ns
;(clojure.set/union #{1 2} #{2 3 4})

; Another way to do it with alias
;(require '[clojure.set :as set])
;(set/union #{1 2} #{3 4 5})

(defn do-union [& sets]
  ;(time ;testing execution times of reduce vs apply
    (reduce set/union sets) ; can use apply as well instead of reduce
    ;)
  )

; this function deletes files given on the system filepaths
(defn delete-old-files [& filepaths]
  (doseq [f files]
    (delete-file f)
    )
  )