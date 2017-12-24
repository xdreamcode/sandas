name := "sandas"

scalaVersion := "2.11.12"

organization := "io.dreamcode"

//updateOptions := updateOptions.value.withGigahorse(false)
//publishTo := Some("Xavier Nexus" at "http://35.168.35.94:8081/repository/maven-releases/")

//publishTo := {
//  val nexus = "http://35.168.35.94:8081/repository/"
//  if (isSnapshot.value)
//    Some("snapshots" at nexus + "maven-snapshots/")
//  else
//    Some("releases"  at nexus + "maven-releases/")
//}

//credentials += Credentials("Sonatype Nexus Repository Manager", "35.168.35.94", "admin", "admin123")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
