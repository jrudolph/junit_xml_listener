import sbt._


class JUnitXmlListenerProject(info: ProjectInfo) extends PluginProject(info) {
    override def managedStyle = ManagedStyle.Maven    
    lazy val publishTo = Resolver.file("Development Repo", new java.io.File((Path.userHome /"srv"/"maven").toString))
}
