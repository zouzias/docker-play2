## Docker ready Play 2 Application build

Clone the project, install SBT, setup Docker and type
```
sbt docker:publishLocal
docker run -p 9000:9000 zouzias/play-2-4:0.1.0-SNAPSHOT
```

and you have a running docker container in play. Almost no configuration needed.

You can test the API on your browseer `http://DOCKER_HOST_IP:9000/ping`, you should receive pong.

The docker host ip can be found using `docker-machine ip default` (replace default with the name of the docker host).


## Enumerator Examples

* Enumerator.apply: `curl -N http://DOCKER_HOST_IP:9000/enum`
* Enumerator.generateM: `curl -N http://DOCKER_HOST_IP:9000/generateM`
* Enumerator.repeatM: `curl -N http://DOCKER_HOST_IP:9000/repeatM`
* Enumerator.interleave: `curl -N http://DOCKER_HOST_IP:9000/interleave`
* Enumerator.andThen: `curl -N http://DOCKER_HOST_IP:9000/andThen`

Go to `http://DOCKER_HOST_IP:9000/docs/swagger-ui/index.html?url=/assets/swagger.json#!/routes/get_ping``

### Acknowledgements

This project is based on [https://github.com/muuki88/sbt-native-packager-examples/tree/master/play-2.3](sbt-native-packager-examples)
