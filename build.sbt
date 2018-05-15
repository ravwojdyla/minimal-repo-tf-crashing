import Dependencies._

val tensorFlowVersion = "1.8.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      crossScalaVersions := Seq("2.11.12", "2.12.6"),
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "minimal-repo-tf-crushing",
    libraryDependencies ++= Seq(
      "org.tensorflow" % "tensorflow" % tensorFlowVersion,
      "org.tensorflow" % "proto" % tensorFlowVersion,
      scalaTest % Test
    )
  )
