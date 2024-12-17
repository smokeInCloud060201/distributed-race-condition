

init-namespace:
	kubectl create namespace race-group

build-image:
	docker build -t api:lastest .