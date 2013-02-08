class File(name: String, size: Int) extends Entry {
  def getName: String = name
  def getSize: Int = size
  def accept(v: Visitor) = v.visit(this)
}
