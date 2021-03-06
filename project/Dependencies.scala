import sbt._
import Keys._

object Dependencies {

  /* Steal from lift build */
  def crossMapped(mappings: (String, String)*): CrossVersion =
    CrossVersion.binaryMapped(Map(mappings: _*) orElse { case v => v })

  type ModuleMap = String => ModuleID

  /* stop stealing */

  lazy val scalaz_core = "org.scalaz" %% "scalaz-core" % "6.0.4" cross crossMapped("2.9.3" -> "2.9.2")

  val jodaTime = Seq("joda-time" % "joda-time" % "2.3", "org.joda" % "joda-convert" % "1.6")

  val scalacheck = "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"

  lazy val specs = "org.specs2" %% "specs2" % "1.12.4.1" % "test"

  val jackson = Seq("com.fasterxml.jackson.core" % "jackson-databind" % "2.3.1")

  val jacksonScala = "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.3.1"

  val paranamer = "com.thoughtworks.paranamer" % "paranamer" % "2.6"

  lazy val scalap: ModuleMap      = "org.scala-lang"             % "scalap"             % _

  val commonsCodec = "commons-codec"              % "commons-codec"      % "1.9"

  val mockito = "org.mockito"                 % "mockito-all"              % "1.9.5"      % "test"

  val liftCommon = "net.liftweb" %% "lift-common" % "2.5.1" cross crossMapped("2.9.3" -> "2.9.2")

}
