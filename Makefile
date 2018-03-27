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

install-clojure:
	curl -O https://download.clojure.org/install/linux-install-1.9.0.358.sh &&\
	chmod +x linux-install-1.9.0.358.sh &&\
	sudo ./linux-install-1.9.0.358.sh

repl:
	clj

repl-cljs:
	clj -m cljs.main

repl-node:
	clj -m cljs.main -re node

run-app-watch:
	clj -m cljs.main -w src -c app.core -r
