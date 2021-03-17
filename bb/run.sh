
CLASSPATH=$(clojure -Spath)

rlwrap bb --classpath "$CLASSPATH" --repl
