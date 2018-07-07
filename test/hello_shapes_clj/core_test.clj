(ns hello-shapes-clj.core-test
  (:require [clojure.test :refer :all]
            [hello-shapes-clj.core :refer :all]))

(deftest test-square-area
  (testing "square area"
    (is (= (area :square 4) 16) ) ))

(deftest test-circle-area
  (testing "circle area"
    (is (= (area :circle 3) (* 3 3 Math/PI) ) )))

(deftest test-triangle-area
  (testing "triangle area"
    (is (= (area :triangle 3 5) (/ 15 2) ) )))