(ns node.temporal)

(def temporal (js/require "proposal-temporal"))

(set! js/Temporal temporal)
