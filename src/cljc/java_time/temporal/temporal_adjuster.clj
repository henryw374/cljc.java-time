(ns cljc.java-time.temporal.temporal-adjuster
  (:refer-clojure :exclude [abs get range format min max next name resolve short])
  (:require [cljc.java-time.extn.calendar-awareness])
  (:import [java.time.temporal TemporalAdjuster]))

(clojure.core/defn adjust-into
  {:arglists '(["java.time.temporal.TemporalAdjuster" "java.time.temporal.Temporal"])}
  (^java.time.temporal.Temporal [^java.time.temporal.TemporalAdjuster this ^java.time.temporal.Temporal temporal]
   (.adjustInto this temporal)))
