# Docker ready Play2 build

```
sbt docker:publishLocal
docker run -p 9000:9000 play-2-3:1.0-SNAPSHOT
```

and you have a running docker container in play. Almost no configuration needed.

# build.sbt

This is the basic build.sbt with a bit of configuration to make docker work

* you need a maintainer for you docker image
* we expose the play ports

```scala

// setting a maintainer which is used for all packaging types
maintainer := "Anastasios Zouzias"

// exposing the play ports
dockerExposedPorts in Docker := Seq(9000, 9443)

// run this with: docker run -p 9000:9000 zouzias/play-2-5:0.1.0-SNAPSHOT
```

# Acknownledgements

This is based on (https://github.com/muuki88/sbt-native-packager-examples/tree/master/play-2.3)[sbt-native-packager-examples]
