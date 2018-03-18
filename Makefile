.PHONY=install

workspace:
	./tmux.conf

serve:
	yarn serve ./public/

install:
	yarn

build:src/*
	yarn lumo -i ./scripts/build.cljs

clean:
	rm -rf public/out
	rm public/js/main.js

repl:
	yarn lumo -r
