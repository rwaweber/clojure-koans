(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
<<<<<<< HEAD
  (= true true)

  "To understand reality, we must compare our expectations against reality"
  (= 2 (+ 1 1))

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 5))

  "Some things may appear different, but be the same"
  (= true (= 2 2/1))

  "You cannot generally float to heavens of integers"
  (= false (= 2 2.0))

  "But a looser equality is also possible"
  (= true (== 2.0 2))

  "Something is not equal to nothing"
  (= true (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!"
  (= false (= "hello" :hello 'hello))

  "Make a keyword with your keyboard"
  (= :hello (keyword :hello))

  "Symbolism is all around us"
  (= 'hello (symbol "hello"))

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank 'butts))
=======
  (= __ true)

  "To understand reality, we must compare our expectations against reality"
  (= __ (+ 1 1))

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 __))

  "Some things may appear different, but be the same"
  (= __ (= 2 2/1))

  "You cannot generally float to heavens of integers"
  (= __ (= 2 2.0))

  "But a looser equality is also possible"
  (= __ (== 2.0 2))

  "Something is not equal to nothing"
  (= __ (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!"
  (= __ (= "hello" :hello 'hello))

  "Make a keyword with your keyboard"
  (= :hello (keyword __))

  "Symbolism is all around us"
  (= 'hello (symbol __))

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank __))
>>>>>>> 44f37b5c16a627851d652be3716c72d38b1a3bd0
