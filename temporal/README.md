# Implementation of java.time in Temporal

## Status - just started ... funding welcome ;-) 

Note - Temporal is still stage 2

### Todo 

* Test advanced compilation
* circle ci build
* Think about Period/Duration mismatch - just use js/Temporal.Duration for both?
* Think about lack of Month/Year/Offset* - hopefully no need for those?
* start by tring to implement everything used by tick?
* data literals - in https://github.com/henryw374/time-literals

### Usage

* start repl with dev profile
* start figwheel from cljs ns 
* open dev/public/index.html
* run tests with `(cljs.test/run-all-tests)`