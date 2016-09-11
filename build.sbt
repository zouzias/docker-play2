name := "play-2.5"
version := "0.1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val nscalatimeVersion = "2.6.0"
  val playstreamsVersion = "2.4.8"
  val akkaVersion = "2.4.10"

  Seq(
    jdbc,
    cache,
    ws exclude("commons-logging", "commons-logging"),
    filters,
    "org.specs2" %% "specs2-core" % "3.8.5" % "test",
    "com.github.nscala-time" %% "nscala-time" % nscalatimeVersion,
    "com.typesafe.play" %% "play-streams-experimental" % playstreamsVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "org.julienrf" %% "play-json-variants" % "1.1.0"
  )
}

// setting a maintainer which is used for all packaging types
maintainer := "Anastasios Zouzias"

dockerRepository := Some("zouzias")
version in Docker := version.value

// exposing the play ports
dockerExposedPorts in Docker := Seq(9000, 9443)

// run this with: docker run -p 9000:9000 play-2-3:1.0-SNAPSHOT
