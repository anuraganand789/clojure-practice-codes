;; collection used for tests
(def numbers [1 2 3 11 -1 25 99])

;; functions in this file gets the max between two numbers and more than two numbers
(defn max-of-two
  ([num] num)
  ([num1 num2]
   (if (> num1 num2)
     num1
     num2))
  ([n m & more]
   (if (or
        (empty? more)
        (nil? more))
     (max-of-two n m)
     (recur
      (max-of-two n m)
      (first more)
      (rest more)))))

(defn max-using-max [& args] (apply max args))

(defn max-of-coll [first-number & rest-of-the-numbers]
  (if (= 0 (count rest-of-the-numbers))
    first-number
    (recur
     (max-of-two first-number (first rest-of-the-numbers))
     (rest rest-of-the-numbers)))) 

(defn max-using-reduce [all-elements]
  (reduce max all-elements))

(defn max-using-max-of-two [all-elements]
  (reduce max-of-two all-elements))

(defn -main [& args]
  (max-using-max-of-two [22]))
