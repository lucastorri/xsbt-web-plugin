organization := "com.earldouglas"

scalaVersion := "2.11.0"

crossScalaVersions := Seq("2.11.0", "2.10.3")

sbtPlugin := true

scalacOptions += "-deprecation"

incOptions := sbt.inc.IncOptions.Default
