name := """play-scala-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.11.7"

libraryDependencies += guice
libraryDependencies ++=Seq(
 "com.h2database" % "h2" % "1.4.194",
"org.webjars" % "jquery" % "2.1.4",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.1.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test)




