[![Clojars Project](https://img.shields.io/clojars/v/cljc.java-time.svg)](https://clojars.org/cljc.java-time)

[![Tests build](https://github.com/henryw374/cljc.java-time/actions/workflows/tests.yaml/badge.svg)](https://github.com/henryw374/cljc.java-time/actions/workflows/tests.yaml)

# cljc.java-time

A Clojure(Script) library which mirrors the java.time api through kebab-case-named vars.

The java.time api is augmented with:
* predicate functions for each entity type: `(cljc.java-time.extn.predicates/instant? x)`
* more helpful error messages for unsupported operations on Instants 

This library uses a pure-JS implementation of java.time, see here [for discussion on whether that affects application performance or build size](https://widdindustries.com/clojurescript-datetime-lib-comparison/)

See [my talk at Clojure/North 2019](https://www.youtube.com/watch?v=UFuL-ZDoB2U) for more background.

This library mostly works on [babashka](https://github.com/borkdude/babashka/). Only 'mostly'
 because babashka doesn't include all classes from java.time. TemporalQuery for example. If a 
 namespace that uses TemporalQuery is required, an error is thrown. 

Temporal, the [new JS platform Date-Time lib](https://github.com/tc39/proposal-temporal)
has been considered for use as an alternative basis of this library instead of js-joda, but although it has
some overlap with java.time, Temporal is different enough that implementing cljc.java-time would be very 
difficult. For a dependency-free Clojure(Script) date-time API, see [Tempo](https://github.com/henryw374/tempo)


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

### .. but I just develop on the JVM Only

Reasons to use this:

* All type hinting is done for you
* `comp`, `apply`, `juxt` and all other clojure.core fns that apply to fns can now be used without anon fns: `#(.foo %)`
* In fact, instead of seeing `#(.foo %)` in someone's code and not knowing what foo is, you'll have a properly namespaced clojure function `foo` - much better!
* predicates, for example `(local-date? x)` 
 
## How it works

For every class in java.time, there is a clojure namespace. 

For example, corresponding to `java.time.LocalDate`, there is a namespace

`cljc.java-time.local-date`

In that and every other namespace, there is one var per public method/field in the corresponding class.

For example, for the method `java.time.LocalDate/parse`, there is a corresponding function `cljc.java-time.local-date/parse`

Instance methods take the instance as the extra first arg

## Usage

Get it from [Clojars](https://clojars.org/cljc.java-time)

Version 0.1.9 and up require minimum Clojurescript version of 1.10.741

 
In .cljc file
```clj
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

A couple of new methods were added to `java.time` in Java 9 - these are not included in this library because according
to the [Clojure Survey](https://clojure.org/news/2020/02/20/state-of-clojure-2020) about half
of Clojure users are still on Java 8 :(
 
### ClojureScript

Be aware that the underlying js implementation is probably only 99% complete. Anything you find missing can be added via pull
request to [js-joda](https://github.com/js-joda/js-joda)

## Development

The code of the project is generated by the `generate-library-code!` function in the 
dev/gen.clj namespace.

### Clojure and Clojurescript 

To run all tests:

```
make test 
```

Start a repl: 

```
 clj -Adev:test:test-cljs
```

For Clojurescript dev, see the dev/cljs.clj file for functions to start test build
in shadow and run tests.

### babashka

Start babashka as follows

deps -A:test -Scommand "bb -cp {{classpath}}" --socket-repl 1666'

and run tests from the repl

one cmd to do this would be preferable
 
## License

Copyright © 2021 [Widd Industries](http://widdindustries.com/about/)

Distributed under the [MIT License](/LICENSE)
