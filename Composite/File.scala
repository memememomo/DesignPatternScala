class File(name: String, size: Int) extends Entry {
  def getName: String = name
  def getSize: Int = size
  override def printList(prefix: String) = println(prefix + "/" + this)
}
