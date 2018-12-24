;; functions in this file gets the max between two numbers and more than two numbers
(defn max-of-two [num1 num2]
  (if (> num1 num2) num1 num2))

(defn max-using-max [& args] (apply max args))

(defn max-of-coll [first-number & rest-of-the-numbers]
  (if (= 0 (count rest-of-the-numbers))
    first-number
    (recur (max-of-two first-number (first rest-of-the-numbers)) (rest rest-of-the-numbers)))) 

(defn -main [& args]
  (str (max-of-coll 16 12 13 14 15)))
