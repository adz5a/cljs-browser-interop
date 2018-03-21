.PHONY=install

workspace:
	./tmux.conf

serve:
	yarn serve ./public/

install:
	yarn

build:public/js/main.js

public/js/main.js:
	yarn lumo -i ./scripts/build.cljs

clean:
	rm -rf node_modules
	lein clean

run-dev:
	lein figwheel
