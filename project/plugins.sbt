resolvers ++= Seq("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "scalaz-bintray"                  at "http://dl.bintray.com/scalaz/releases"
)

// Swagger integration
addSbtPlugin("com.iheart" % "sbt-play-swagger" % "0.5.3-PLAY2.4")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.8")

// Required for "sbt assembly"
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

// other useful plugins
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

// sbt native packager

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.1")
