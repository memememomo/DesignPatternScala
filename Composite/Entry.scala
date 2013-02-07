abstract class Entry {
  def getName: String
  def getSize: Int
  def add(entry: Entry): Entry = {
	throw new FileTreatmentException
  }
  def printList: Unit = printList("")
  def printList(prefix: String): Unit
  override def toString: String = getName + " (" + getSize + ")"
}
