[![Clojars Project](https://img.shields.io/clojars/v/cljc.java-time.svg)](https://clojars.org/cljc.java-time)

[![CircleCI](https://circleci.com/gh/henryw374/cljc.java-time.svg?style=svg)](https://circleci.com/gh/henryw374/cljc.java-time)

# cljc.java-time

A Clojure(Script) library which mirrors the java.time api through kebab-case-named vars.

See [my talk at Clojure/North 2019](https://www.youtube.com/watch?v=UFuL-ZDoB2U) for more background.

## Related Libraries

[tick](https://clojars.org/tick) is a higher level date-time library that uses this one. Even if you're using cljc.java-time directly,
ie not through tick, it has very relevant docs on extra [setup for use with ClojureScript](https://github.com/juxt/tick/blob/master/docs/cljs.adoc)

[time-literals](https://github.com/henryw374/time-literals) is a Clojure(Script) library which provides tagged literals for objects from jsr-310 domain 

## Rationale

This library sits atop `java.time` on the jvm and [cljs.java-time](https://github.com/henryw374/cljs.java-time) on Javascript
platforms. Writing cross-platform code that uses those libraries directly is harder than interop normally is because:

* To call the java.time 'static' methods in a cljc file you need to use the [dot-special-form](https://clojure.org/reference/java_interop#_the_dot_special_form) which is not idiomatic
* The underlying js library has changed the name of the getter methods in java.time (in *almost* all cases)  to remove the 'get' part of the name. There are ways to get around that on a case
by case basis, but this library handles it for you.
 
## How it works

For every class in java.time, there is a clojure namespace. 

For example, corresponding to `java.time.LocalDate`, there is a namespace

`cljc.java-time.local-date`

In that and every other namespace, there is one var per public method/field in the corresponding class.

For example, for the method `java.time.LocalDate/parse`, there is a corresponding function `cljc.java-time.local-date/parse`

Instance methods take the instance as the extra first arg

## Usage

Get it from [Clojars](https://clojars.org/cljc.java-time)

 
In .cljc file
 ```
 (ns my.cljc
   (:require  [cljc.java-time.local-date :as ld])
   
   ;create a date
   (def a-date (ld/parse "2019-01-01"))
   
   ;add some days
   (ld/plus-days a-date 99)
   
 ```
 
## Problems & Irregularities

java.time.Year#isLeap exists as an instance method and a static method. Only the static version has been wrapped.

### Inheritcance/Polymorphism 
The code of this project consists of mechanically generated functions for the java.time methods, even if those methods are 
inherited via superclasses or interfaces. In this project, functions are generated in every class they can be applied to. For example there is
`cljc.java-time.temporal.temporal/is-supported` and also `cljc.java-time.local-date/is-supported`, with the latter being 
essentially unnecessary but included anyway. 
 

## Note
 
### Java 9 

New methods were added in Java 9 - these are not included in this library
 
### ClojureScript

Be aware that the Implementation is not 100%. It's probably 99% though and anything you find missing can be added via pull
request to [js-joda](https://github.com/js-joda/js-joda)
 
## License

Copyright © 2019 [Widd Industries](http://widdindustries.com/about/)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
