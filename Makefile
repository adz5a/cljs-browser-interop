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
	rm -rf public/out
	rm public/js/main.js
