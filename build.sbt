name := "akkademy-db"

version := "1.0"

scalaVersion := "2.11.11"

lazy val akkaVersion = "2.5.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test")