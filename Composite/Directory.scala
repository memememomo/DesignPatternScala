import java.util.Iterator
import java.util.ArrayList

class Directory(name: String) extends Entry {
  val directory = new ArrayList[Entry]
  def getName: String = name
  def getSize: Int = {
	var size = 0
	val it = directory.iterator
	while (it.hasNext) {
	  val entry = it.next.asInstanceOf[Entry]
	  size += entry.getSize
	}
	return size
  }

  override def add(entry: Entry): Entry = {
	directory.add(entry)
	return this
  }

  override def printList(prefix: String) = {
	println(prefix + "/" + this)
	val it = directory.iterator
	while (it.hasNext) {
	  val entry = it.next.asInstanceOf[Entry]
	  entry.printList(prefix + "/" + name)
	}
  }
}
