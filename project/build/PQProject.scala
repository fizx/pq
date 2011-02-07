import sbt._
import com.twitter.sbt._

class PQProject(info: ProjectInfo) extends StandardProject(info) 
                                           with SubversionPublisher 
                                           with AdhocInlines {
  val slf4j_api = "org.slf4j" % "slf4j-api" % "1.5.2" intransitive()
  val slf4j_jdk14 = "org.slf4j" % "slf4j-jdk14" % "1.5.2" intransitive()

  val twitterActors = "com.twitter" % "twitteractors_2.8.0" % "2.0.1"
  val twitterUtil = "com.twitter" % "util_2.8.0" % "1.2.2"
  
  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5" % "test"
  
  val scalatools = "Scala Tools" at "http://scala-tools.org/repo-releases/"
  val twitter = "Twitter" at "http://maven.twttr.com/"
}