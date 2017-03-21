(ns closure-example)

(defn messenger-builder [greeting]
  (fn [who] (print greeting who))) ; closes over greeting

;; greeting provided here, then goes out of scope
(def hello-er (messenger-builder "hello"))

; greeting still available because hello-er is closure
(hello-er "world")
;; hello world