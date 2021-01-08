# Implementation of java.time in Temporal

## Status - just started ... funding welcome ;-) 

Note - Temporal is still stage 2

### Todo 

* Test advanced compilation
* Think about Period/Duration mismatch - just use js/Temporal.Duration for both?
* Think about lack of Month/Year/Offset* - hopefully no need for those?
* implement everything used by tick?

### Usage

* start repl with dev profile
* start figwheel from cljs ns 
* open dev/public/index.html
* run tests with `(cljs.test/run-all-tests)`