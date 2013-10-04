/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 10/4/13
 * Time: 6:19 PM
 */
class JHSB {

  private var counters: Metadata = null
  private var cross_properties: Array[Any] = Array.empty[Any]

  def getCounters = counters
  def setCounters(counters: Metadata) = {this.counters = counters}

  def getCross_properties = cross_properties
  def setCross_properties(cross_properties: Array[Any]) = {this.cross_properties = cross_properties}

}
