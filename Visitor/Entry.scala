import java.util.Iterator

abstract class Entry extends Element {
  def getName: String
  def getSize: Int
  def add(entry: Entry): Entry = throw new FileTreatmentException
  def iterator: Iterator[Entry] = throw new FileTreatmentException
  override def toString: String = getName + " (" + getSize + ")"
}
