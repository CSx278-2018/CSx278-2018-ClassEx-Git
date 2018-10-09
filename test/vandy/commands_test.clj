(ns vandy.commands-test
  (:require [clojure.test :refer :all]
            [vandy.commands :as commands]
            [vandy.version :as version]))

(deftest vandy-help-command-test
  (testing "That the help command outputs content in the expected format"
    (not-empty (re-matches  #"(?:(?<commandPath>\\w+(?:[ ]\\w))*?: (?<commandDocstring>\\w+))??" (commands/help)))))

(deftest vandy-version-command-test
  (testing "That the version command outputs the correct version"
    (is (= (version/version) (commands/version)))))
