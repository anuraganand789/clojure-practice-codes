;; functions in this file gets the max between two numbers and more than two numbers
(defn max-of-two [num1 num2]
  (if (> num1 num2) num1 num2))

(defn max-using-max [& args] (apply max args))

(defn -main [& args]
  (str (max-of-two 12 13)))
