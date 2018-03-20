.PHONY=install

workspace:
	./tmux.conf

serve:
	yarn serve ./public/

install:
	yarn

lumo-compile:src/*
	yarn lumo -i ./build-lumo.cljs

java-compile:src/*
	java -cp cljs.jar:src clojure.main ./scripts/build.cljs

boot-compile:src/*
	boot cljs target

clean:
	rm -rf public/out
	rm -rf public/js

repl:
	yarn lumo -r
