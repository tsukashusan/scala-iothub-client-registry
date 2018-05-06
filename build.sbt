import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "IoTClientRegistry",
    libraryDependencies ++= Seq(scalaTest % Test,
    "com.microsoft.azure.sdk.iot" % "iot-service-client" % "1.13.1")
  )
mainClass in assembly := Some("example.Hello")
javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")