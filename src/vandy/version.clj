(ns vandy.version (:gen-class))

; Try to get version from JAR. This will fail if running in lein.
; If that fails, try to get it from the project file.
(defn version []
  (try
    (-> (eval 'version-namespace) .getPackage .getImplementationVersion)
    (catch Throwable t (-> "./project.clj" slurp read-string (nth 2)))))
