import sbt._
import Keys._
import play.sbt.PlayScala

object Common extends Build {

  val commonSettings = Seq(
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.7"
  )

  lazy val root = Project("data-analyzer", file("."))
    .settings(commonSettings: _*)
    .aggregate(analyzer)
    .enablePlugins(PlayScala)

  lazy val analyzer = Project("analyzer", file("modules/analyzer"))
    .settings(commonSettings: _*)
    .configs(IntegrationTest)
    .settings(Defaults.itSettings: _*)

}