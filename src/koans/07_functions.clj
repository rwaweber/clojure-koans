(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
 "Calling a function is like giving it a hug with parentheses"
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

 "One function can beget another"
 (= 9 ((fn [a,b] (+ a b)) 4 5))

 "Functions can also take other functions as input"
 (= 20 (
        (fn [f] (f 4 5))
        ;;note: when using function as argument, do not
        ;;enclose in a pair of parentheses
        ;;no longer expanded out, is only the raw function
        ;;when it is enclosed in parentheses, it is considered"
        ;;more of a macro definition
        (fn [a,b] (* a b))
        ))
 
 "Higher-order functions take function arguments"
 (= 25 (
        ;; interesting line, consuming the latter defined function
        (fn [f] (f 5))        
        ;; assuming an input and squaring it
        (fn [n] (* n n)))
    )

 "But they are often better written using the names of functions"
 (= 25 (
        (fn [f] (f 5))
        ;; could possibly allow for super generic test harnesses
        square)))
