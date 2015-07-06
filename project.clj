(defproject clj-osgi-namespaces-hello-world-user "0.1.0-SNAPSHOT"
  :description "Clojure OSGI Namespaces Hello World User"
  :url "https://github.com/rritoch/clj-osgi-namespaces-hello-world-user"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]  ; Java source is stored separately.
  :test-paths ["test" "src/test/clojure"]
  
  :manifest {"Bundle-ManifestVersion" "2"
             "Bundle-SymbolicName" "clojure-osgi-namespaces-hello-world-user"
             "Bundle-Version" "0.1.0"
             "Bundle-Name" "Clojure OSGI Namespaces Hello World User"
             "Import-Package" "clj_osgi_namespaces_hello_world,com.vnetpublishing.clojure.osgi.namespaces;version=\"0.1.0\",clojure;version=\"1.7.0\",clojure.asm;version=\"1.7.0\",clojure.asm.commons;version=\"1.7.0\",clojure.java.api;version=\"1.7.0\",clojure.lang;version=\"1.7.0\",clojure.core;version=\"1.7.0\",clojure.java.clojure.pprint;version=\"1.7.0\",clojure.reflect;version=\"1.7.0\",clojure.test;version=\"1.7.0\""
             "Clojure-Activator" "clj-osgi-namespaces-hello-world-user.activator"
             "Clojure-Imports" "clojure.core,clj-osgi-namespaces-hello-world.core"
            }
  :resource-paths ["src/main/resource"] ; Non-code files included in classpath/jar.
  :profiles {:dev {:dependencies [[clj-osgi-namespaces "0.1.0-SNAPSHOT"]]
                  }
            })
