import sbt._

class HelloWorldProject(info: ProjectInfo) extends DefaultProject(info) {
  val liftVersion = "2.3-SNAPSHOT"
  val scalatoolsSnapshot = ScalaToolsSnapshots 
  
  override def managedStyle = ManagedStyle.Maven
  lazy val publishTo = Resolver.sftp("Bubble Foundry Maven Repo", "maven.bubblefoundry.com", "/home/beachhea/public_html/bubblefoundry/maven")
  // also publish docs and source files
  override def packageDocsJar = defaultJarPath("-javadoc.jar")
  override def packageSrcJar= defaultJarPath("-sources.jar")
  val sourceArtifact = Artifact.sources(artifactID)
  val docsArtifact = Artifact.javadoc(artifactID)
  override def packageToPublishActions = super.packageToPublishActions ++ Seq(packageDocs, packageSrc)
    
  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile"
  ) ++ super.libraryDependencies
}