(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    true)
  (if (= x false)
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(abs 2)
(abs -2)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(divides? 5 25)
(divides? 10 2)
(divides? 11 2)
(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else          ""))

(fizzbuzz 15)
(fizzbuzz 3)
(fizzbuzz 5)
(fizzbuzz 17)

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(range 20)
(map teen? (range 20))

(defn not-teen? [age]
  (not (teen? age)))

(not-teen? 22)
(not-teen? 14)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)   (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else       true))

(generic-doublificate 2)
(generic-doublificate {:a 2})
(generic-doublificate [2, 3])
(generic-doublificate [])
(generic-doublificate '(2, 4))

(defn leap-year? [year]
  (cond
    (divides? 100 year) (if (divides? 400 year) true false)
    (divides? 4 year)   true
    :else               false))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false

; '_______'

