import sbt._


class JUnitXmlListenerProject(info: ProjectInfo) extends PluginProject(info) {
    override def managedStyle = ManagedStyle.Maven
    lazy val publishTo = Resolver.ssh("Christoph's Maven Repo", "taupo", "/srv/maven/")
}
