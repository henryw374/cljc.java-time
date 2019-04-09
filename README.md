# cljc.java-time

A Clojure(Script) library which provides the java.time api through kebab-case-named function vars.

get it from [Clojars](https://clojars.org/cljc.java-time)
 
 In .cljc file
 ```
 (ns my.cljc
   (:require  [cljc.java-time.local-date :as ld])
   
   
   (ld/parse "2019-01-01")
   
 ```

## License

Copyright © 2019 Widd Industries

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
