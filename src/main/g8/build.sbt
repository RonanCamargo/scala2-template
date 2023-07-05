scalaVersion := "$scala-version$"
organization := "$organization$"
name         := "$name$"

val circeVersion         = "0.14.3"
val catsEffectVersion    = "3.5.1"
val catsVersion          = "2.8.0"
val catsMtlVersion       = "1.2.1"
val mouseVersion         = "1.2.0"
val scalaTestVersion     = "3.2.12"
val mockitoScalaVersion  = "1.17.7"
val monocleVersion       = "3.1.0"
val fs2Version           = "3.2.11"
val shapelessVersion     = "2.3.10"
val quicklensVersion     = "1.9.4"
val monixNewtypesVersion = "0.2.3"
val enumeratumVersion    = "1.7.2"
val scalacheckVersion    = "1.14.1"
val scalaNewtype         = "0.4.4"
val quillDoobieVersion   = "4.6.1"

val kindProjectorVersion = "0.13.2"

addCompilerPlugin("org.typelevel"   % "kind-projector" % kindProjectorVersion cross CrossVersion.full)

libraryDependencies ++= dependencies

lazy val dependencies =
  catsDependencies ++
    opticsDependencies ++
    circeDependencies ++
    testDependencies ++
    fs2Dependencies ++
    shapelessDependencies ++
    newtypesDependencies ++
    enumeratumDependencies ++
    databaseDependencies

lazy val catsDependencies = Seq(
  "org.typelevel" %% "cats-core"   % catsVersion,
  "org.typelevel" %% "cats-mtl"    % catsMtlVersion,
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "org.typelevel" %% "mouse"       % mouseVersion
)

lazy val testDependencies = Seq(
  "org.scalatest"  %% "scalatest"     % scalaTestVersion    % Test,
  "org.scalacheck" %% "scalacheck"    % scalacheckVersion   % Test,
  "org.mockito"    %% "mockito-scala" % mockitoScalaVersion % Test
)

lazy val opticsDependencies = Seq(
  "dev.optics"                 %% "monocle-core"  % monocleVersion,
  "dev.optics"                 %% "monocle-law"   % monocleVersion,
  "dev.optics"                 %% "monocle-macro" % monocleVersion,
  "com.softwaremill.quicklens" %% "quicklens"     % quicklensVersion
)

lazy val circeDependencies = Seq(
  "io.circe" %% "circe-core"           % circeVersion,
  "io.circe" %% "circe-generic"        % circeVersion,
  "io.circe" %% "circe-generic-extras" % circeVersion,
  "io.circe" %% "circe-parser"         % circeVersion
)

lazy val fs2Dependencies = Seq(
  "co.fs2" %% "fs2-core"             % fs2Version,
  "co.fs2" %% "fs2-io"               % fs2Version,
  "co.fs2" %% "fs2-reactive-streams" % fs2Version,
  "co.fs2" %% "fs2-scodec"           % fs2Version
)

lazy val shapelessDependencies = Seq(
  "com.chuusai" %% "shapeless" % shapelessVersion
)

lazy val newtypesDependencies = Seq(
  "io.monix"    %% "newtypes-core"             % monixNewtypesVersion,
  "io.monix"    %% "newtypes-circe-v0-14"      % monixNewtypesVersion,
  "io.monix"    %% "newtypes-pureconfig-v0-17" % monixNewtypesVersion,
  "io.estatico" %% "newtype"                   % scalaNewtype
)

lazy val enumeratumDependencies = Seq(
  "com.beachape" %% "enumeratum"            % enumeratumVersion,
  "com.beachape" %% "enumeratum-circe"      % enumeratumVersion,
  "com.beachape" %% "enumeratum-scalacheck" % enumeratumVersion,
  "com.beachape" %% "enumeratum-quill"      % enumeratumVersion,
  "com.beachape" %% "enumeratum-cats"       % enumeratumVersion,
  "com.beachape" %% "enumeratum-doobie"     % enumeratumVersion
)

lazy val databaseDependencies = Seq(
  "io.getquill" %% "quill-doobie" % quillDoobieVersion
)
