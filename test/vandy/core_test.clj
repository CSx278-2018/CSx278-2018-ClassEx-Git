(ns vandy.core-test
  (:require [clojure.test :refer :all]
            [vandy.core :refer :all]))

(deftest vandy-homepage-test
  (testing "That the vandy homepage is correctly listed"
    (is (= "https://www.vanderbilt.edu" (vandy-homepage)))))

(deftest vandy-homepage-integration-test
  (testing "That the app prints out the vandy home page as expected"
    (is
     (=  "https://www.vanderbilt.edu\n"
         (with-out-str (-main))))))
