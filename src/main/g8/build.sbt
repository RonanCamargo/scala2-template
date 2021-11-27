scalaVersion := "$scala-version$"
organization := "$organization$"
name         := "$name$"

val circeVersion      = "0.14.1"
val catsEffectVersion = "3.2.9"
val catsVersion       = "$cats-version$"
val catsMtlVersion    = "1.2.1"
val scalaTestVersion  = "3.2.10"
val scalaMockVersion  = "5.1.0"
val monocleVersion    = "3.0.0"

libraryDependencies += "org.typelevel" %% "cats-effect" % catsEffectVersion
libraryDependencies += "org.typelevel" %% "cats-core"   % catsVersion
libraryDependencies += "org.typelevel" %% "cats-mtl"    % catsMtlVersion

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % Test

libraryDependencies ++= Seq("monocle-core", "monocle-macro")
  .map("dev.optics" %% _ % monocleVersion)

libraryDependencies ++= Seq(
  "circe-core",
  "circe-generic",
  "circe-generic-extras",
  "circe-parser"
)
  .map("io.circe" %% _ % circeVersion)
