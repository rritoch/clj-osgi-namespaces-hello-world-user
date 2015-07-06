(ns clj-osgi-namespaces-hello-world-user.activator
  (:use [clj-osgi-namespaces-hello-world.core]))

(defn start
  [bundle-context]
    (hello-other))

(defn stop
  [bundle-context]
    (goodbye-other))