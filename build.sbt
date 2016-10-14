name := """adminlte"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.webjars" % "bootstrap" % "3.3.4"
)

includeFilter in (Assets, LessKeys.less) := "main.less" | "skin-blue.less"

//Enable to use node.js
//JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
