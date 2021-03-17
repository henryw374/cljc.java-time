.PHONY: 		watch deploy test dev-docs-cljs

test-clj:
			clojure -Atest -e deprecated
test-cljs:
			rm -rf cljs-test-runner-out && mkdir -p cljs-test-runner-out/gen && clojure -Sverbose -Mtest-cljs

test:
			make test-clj && make test-cljs

pom:
			rm pom.xml; clojure -Spom; echo "Now use git diff to add back in the non-generated bits of pom"
install:
			rm -rf target && mvn install
deploy:			
			mvn deploy

shadow:
	npm install; npx shadow-cljs watch test

# hooray for stackoverflow
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
