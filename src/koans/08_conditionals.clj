(ns koans.08-conditionals
  (:require [koan-engine.core :refer :all]))

(defn explain-exercise-velocity [exercise-term]
  (case exercise-term
        :bicycling        "pretty fast"
        :jogging          "not super fast"
        :walking          "not fast at all"
        "is that even exercise?"))

(meditations
  "You will face many decisions"
  (= :a (if (false? (= 4 5))
          :a
          :b))

  "Some of them leave you no alternative"
  (= '() (if (> 4 3)
           ;; empty set
           []))

  "Reminder that the empty set is not the same thing as nil"
  (not= '() nil)

  "and that there are multiple notations for the empty set"
  (= '() [])

  "And in such a situation you may have nothing"
  (= nil (if (nil? 0)
          [:a :b :c]))

  "In others your alternative may be interesting"
  (= :glory (if (not (empty? ()))
              :doom
              :glory
              ))

  "You may have a multitude of possible paths"
  (let [x 5]
    (= :your-road (cond (= x __) :road-not-taken
                        (= x __) :another-road-not-taken
                        :else __)))

  "Or your fate may be sealed"
  (= 'doom (if-not (zero? __)
          'doom
          'more-doom))

  "In case of emergency, go fast"
  (= "pretty fast"
     (explain-exercise-velocity __))

  "But admit it when you don't know what to do"
  (= __
     (explain-exercise-velocity :watching-tv)))
