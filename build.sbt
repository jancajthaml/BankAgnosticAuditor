name := "BankAgnosticAuditor"

version := "0.1.0-SNAPSHOT"

description := "Bank agnostic auditor - demo project"

scalaVersion := "2.11.8"

lazy val demo = (project in file(".")).settings(
  name := "BankAgnosticAuditor",
  mainClass in Compile := Some("eu.akkamo.Main"),
  libraryDependencies ++= Seq(
    "eu.akkamo" %% "akkamo" % "1.0.2"
  )
).enablePlugins(AkkamoSbtPlugin)
    