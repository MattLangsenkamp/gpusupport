ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "gpusupport",
    libraryDependencies ++= Seq(
      "ai.djl" % "api" % "0.22.1",
      //"ai.djl.pytorch" % "pytorch-engine" % "0.22.1",
      //"ai.djl.pytorch" % "pytorch-jni" % "2.0.0-0.22.1",
      //"ai.djl.pytorch" % "pytorch-native-cu118-precxx11" % "2.0.0",
      //"net.java.dev.jna" % "jna" % "5.13.0"

      "ai.djl.mxnet" % "mxnet-engine" % "0.22.1" % "runtime"

    )
  )
