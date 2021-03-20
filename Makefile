.PHONY: 		watch deploy test dev-docs-cljs

test-clj:
			clojure -Atest -e deprecated
test-cljs:
			rm -rf cljs-test-runner-out && mkdir -p cljs-test-runner-out/gen && clojure -Sverbose -Mtest-cljs

test:
			make test-clj && make test-cljs

install:
			clojure -M:release install --version $(VERSION)
deploy:
			clojure -M:release --version $(VERSION)

shadow:
	npm install; npx shadow-cljs watch test

# hooray for stackoverflow
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
