(ns vandy.core-test
  (:require [clojure.test :refer :all]
            [vandy.core :refer :all]
            [vandy.commands :as commands]))

(deftest vandy-homepage-test
  (testing "That the vandy homepage is correctly listed"
    (is (= "https://www.vanderbilt.edu" (vandy-homepage)))))

(deftest vandy-homepage-help-integration-test
  (testing "That the app prints out the help by default"
    (is
     (=  (commands/help)
         (clojure.string/trim-newline (with-out-str (-main)))))))

(deftest vandy-homepage-version-integration-test
  (testing "That the app prints out the version when called with version"
    (is
     (=  (commands/version)
         (clojure.string/trim-newline (with-out-str (-main "version")))))))
