# cljc.java-time

A Clojure(Script) library which provides the java.time api through kebab-case-named function vars.

The most exciting thing about this is that this makes `java.time` api available in Clojurescript and that
you can write code to this api that runs in both Clojure and Clojurescript.

See [my talk at Clojure/North 2019](https://www.youtube.com/watch?v=UFuL-ZDoB2U) for more background.

For every class in java.time, there is a clojure namespace. 

For example, corresponding to java.time.LocalDate, there is a namespace

cljc.java-time.local-date

In the namespace, there is one var per public method/field in the corresponding class.

For example, for the method `java.time.LocalDate/parse`, there is a function `cljc.java-time.local-date/parse`

Get it from [Clojars](https://clojars.org/cljc.java-time)

## Usage
 
In .cljc file
 ```
 (ns my.cljc
   (:require  [cljc.java-time.local-date :as ld])
   
   
   (ld/parse "2019-01-01")
   
 ```

## TODO
 
### java.time version

New methods were added in Java 9 - these are not included in this library
 
### ClojureScript

Be aware that the Implementation is not 100%. It's probably 99%. 
 
## License

Copyright © 2019 Widd Industries

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
