.PHONY=install

workspace:
	./tmux.conf

serve:
	yarn serve ./public/

install:
	yarn

java-compile:src/*
	java -cp cljs.jar:src clojure.main ./scripts/build.cljs

clean:
	rm -rf public/out
	rm -rf public/js

repl:
	yarn lumo -r
