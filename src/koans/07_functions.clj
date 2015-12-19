(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "Calling a function is like giving it a hug with parentheses"
<<<<<<< HEAD
  (= 81 (square 9))

  "Functions are usually defined before they are used"
  (= 20 (multiply-by-ten 2))

  "But they can also be defined inline, very much like lambdas in racket"
  (= 10 (
         (fn [n] (* 5 n))
         2))

  "Or using an even shorter syntax"
  (= 60 (#(* 15 %) 4))

  "Even anonymous functions may take multiple arguments"
  (= 15 (#(+ %1 %2 %3) 4 5 6))

  "Arguments can also be skipped"
  (= 30 (#(* 15 %2) 1 2))
=======
  (= __ (square 9))

  "Functions are usually defined before they are used"
  (= __ (multiply-by-ten 2))

  "But they can also be defined inline"
  (= __ ((fn [n] (* 5 n)) 2))

  "Or using an even shorter syntax"
  (= __ (#(* 15 %) 4))

  "Even anonymous functions may take multiple arguments"
  (= __ (#(+ %1 %2 %3) 4 5 6))

  "Arguments can also be skipped"
  (= __ (#(* 15 %2) 1 2))
>>>>>>> 44f37b5c16a627851d652be3716c72d38b1a3bd0

  "One function can beget another"
  (= 9 (((fn [] ___)) 4 5))

  "Functions can also take other functions as input"
  (= 20 ((fn [f] (f 4 5))
           ___))

  "Higher-order functions take function arguments"
  (= 25 (___
          (fn [n] (* n n))))

  "But they are often better written using the names of functions"
  (= 25 (___ square)))
