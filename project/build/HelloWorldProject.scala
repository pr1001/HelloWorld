import sbt._

class HelloWorldProject(info: ProjectInfo) extends DefaultProject(info) {
  val liftVersion = "2.3-SNAPSHOT"
  val scalatoolsSnapshot = ScalaToolsSnapshots 
  
  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile"
  ) ++ super.libraryDependencies
}