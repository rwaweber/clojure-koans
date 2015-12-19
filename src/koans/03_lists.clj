(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "Lists can be expressed by function or a quoted form"
<<<<<<< HEAD
  (= '(1 2 3 4 5) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first"
  (= 1 (first '(1 2 3 4 5)))

  "As well as the rest"
  (= '(2 3 4 5) (rest '(1 2 3 4 5)))

  "Count your blessings"
  (= 3 (count '(dracula dooku chocula)))

  "Before they are gone"
  (= 0 (count '()))

  "The rest, when nothing is left, is empty"
  (= '() (rest '(100)))

  "Construction by adding an element to the front is easy"
  (= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either"
  (= '(:e :a :b :c :d) (conj '(:a :b :c :d) :e))

  "You can use a list like a stack to get the first element"
  (= :a (peek '(:a :b :c :d :e)))

  "Or the others"
  (= '(:b :c :d :e) (pop '(:a :b :c :d :e)))

  "But watch out if you try to pop nothing"
  (= "No dice!" (try
=======
  (= '(__ __ __ __ __) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first"
  (= __ (first '(1 2 3 4 5)))

  "As well as the rest"
  (= __ (rest '(1 2 3 4 5)))

  "Count your blessings"
  (= __ (count '(dracula dooku chocula)))

  "Before they are gone"
  (= __ (count '()))

  "The rest, when nothing is left, is empty"
  (= __ (rest '(100)))

  "Construction by adding an element to the front is easy"
  (= __ (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either"
  (= __ (conj '(:a :b :c :d) :e))

  "You can use a list like a stack to get the first element"
  (= __ (peek '(:a :b :c :d :e)))

  "Or the others"
  (= __ (pop '(:a :b :c :d :e)))

  "But watch out if you try to pop nothing"
  (= __ (try
>>>>>>> 44f37b5c16a627851d652be3716c72d38b1a3bd0
          (pop '())
          (catch IllegalStateException e
            "No dice!")))

  "The rest of nothing isn't so strict"
<<<<<<< HEAD
  (= '() (try
=======
  (= __ (try
>>>>>>> 44f37b5c16a627851d652be3716c72d38b1a3bd0
          (rest '())
          (catch IllegalStateException e
            "No dice!"))))
