[![Clojars Project](https://img.shields.io/clojars/v/cljc.java-time.svg)](https://clojars.org/cljc.java-time)

# cljc.java-time

A Clojure(Script) library which provides the java.time api through kebab-case-named function vars. Using this API, 
you can write non-interop code using everything from java.time and which runs in both Clojure and ClojureScript.

See [my talk at Clojure/North 2019](https://www.youtube.com/watch?v=UFuL-ZDoB2U) for more background.

## Related Libraries

[tick](https://clojars.org/tick) is a higher level date-time library that uses this one. Even if you're using cljc.java-time directly,
ie not through tick, it has very relevant docs on extra [setup for use with ClojureScript](https://juxt.pro/tick/docs/index.html#_clojurescript)

[time-literals](https://github.com/henryw374/time-literals) is a Clojure(Script) library which provides tagged literals for objects from jsr-310 domain 

## Rationale

This library sits atop `java.time` on the jvm and [cljs.java-time](https://github.com/henryw374/cljs.java-time) on Javascript
platforms. Writing code that uses those libraries directly is harder than interop normally is because:

* To call the 'static' methods from Clojurescript you need to use the [dot-special-form](https://clojure.org/reference/java_interop#_the_dot_special_form) which is not idiomatic
* The underlying js library has changed the name of the getter methods in java.time to remove the 'get' part of the name. There are ways to get around that on a case
by case basis, but this library handles it for you.
 
## How it works

For every class in java.time, there is a clojure namespace. 

For example, corresponding to `java.time.LocalDate`, there is a namespace

`cljc.java-time.local-date`

In that and every other namespace, there is one var per public method/field in the corresponding class.

For example, for the method `java.time.LocalDate/parse`, there is a corresponding function `cljc.java-time.local-date/parse`

## Usage

Get it from [Clojars](https://clojars.org/cljc.java-time)

 
In .cljc file
 ```
 (ns my.cljc
   (:require  [cljc.java-time.local-date :as ld])
   
   
   (ld/parse "2019-01-01")
   
 ```
 
## Problems & Irregularities

### Overloaded Java methods with the same arities. 

If there is a java method `foo(String x)` and `foo(boolean x)` then there's
not going to be a direct clojure function or functions that correspond to those. In this case, dropping to interop code
is the option we suggest. For now, if there is such a case in java.time (`ZoneId#of` is one) then no clojure function has
been generated.

### Inheritcance/Polymorphism 
The generated code of this project mechanically generated methods for the java.time classes, even if those methods are 
inherited via superclasses or interfaces. In this project, functions are generated at every 'level'. For example there is
a `cljc.java-time.temporal.temporal/is-supported` and `cljc.java-time.local-date/is-supported`, with the latter being 
essentially unnecessary but included anyway. 
 

## TODO
 
### Keep up to date with java.time 

New methods were added in Java 9 - these are not included in this library
 
### ClojureScript

Be aware that the Implementation is not 100%. It's probably 99% though and anything you find missing can be added via pull
request to [js-joda](https://github.com/js-joda/js-joda)
 
## License

Copyright © 2019 Widd Industries

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
