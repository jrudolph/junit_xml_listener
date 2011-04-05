import _root_.sbt._

trait JUnitXMLReport extends BasicScalaProject {
  //create a listener that writes to the normal output directory
  def junitXmlListener: TestReportListener = new eu.henkelmann.sbt.JUnitXmlTestsListener(outputPath.toString)

  //add the new listener to the already configured ones
  override def testListeners: Seq[TestReportListener] = super.testListeners ++ Seq(junitXmlListener)
}
