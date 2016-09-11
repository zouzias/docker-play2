# Docker ready Play2 build

```
sbt docker:publishLocal
docker run -p 9000:9000 zouzias/play-2-5:0.1.0-SNAPSHOT
```

and you have a running docker container in play. Almost no configuration needed.

You can test the API on your browseer `http://DOCKER_HOST_IP:9000/ping`, you should receive pong.

The docker host ip can be found using `docker-machine ip default` (replace default with the name of the docker host).

### Acknowledgements

This project is based on (https://github.com/muuki88/sbt-native-packager-examples/tree/master/play-2.3)[sbt-native-packager-examples]
