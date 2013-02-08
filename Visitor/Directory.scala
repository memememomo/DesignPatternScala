import java.util.Iterator
import java.util.ArrayList

class Directory(name: String) extends Entry {
  val dir = new ArrayList[Entry]

  def getName: String = name
  def getSize: Int = {
	var size = 0
	val it = dir.iterator
	while (it.hasNext) {
	  val entry = it.next.asInstanceOf[Entry]
	  size += entry.getSize
	}
	return size
  }
  override def add(entry: Entry): Entry = {
	dir.add(entry)
	return this
  }
  override def iterator: Iterator[Entry] = dir.iterator
  def accept(v: Visitor) = v.visit(this)
}
