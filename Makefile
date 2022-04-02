test-clj:
			clojure -Atest -e deprecated
test-cljs-shadow:
			clojure -Atest-cljs -X com.widdindustries.tiado-cljs2/tests-ci-shadow :compile-mode :release
test-cljs-cljsjs:
			clojure -Atest-cljs -X non-non-shadow-tests/cljsjs :compile-mode :release
test:
			make test-clj && make test-cljs-shadow && make test-cljs-cljsjs
install:
			clojure -M:release install --version $(VERSION)
deploy:
			clojure -M:release --version $(VERSION)
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
