# Authoritative build rules for cljc.java-time

test-clj:
			cd js-joda && clojure -Mtest -d ../js-joda-and-java-time/test
test-cljs-joda:
			cd js-joda && rm -rf cljs-test-runner-out && mkdir -p cljs-test-runner-out/gen && clojure -Sverbose -Atest-cljs

test:
			./js-joda-and-java-time/test/bb_test.clj && make test-clj && make test-cljs-joda

pom-joda:
			cd js-joda && rm pom.xml; clojure -Spom; echo "Now use git diff to add back in the non-generated bits of pom"
install-joda:
			cd js-joda && rm -rf target && mvn install
deploy-joda:			
			cd js-joda && mvn deploy

# hooray for stackoverflow
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
