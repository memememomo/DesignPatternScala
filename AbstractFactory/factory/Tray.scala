package factory
import scala.collection.mutable.ArrayBuffer

abstract class Tray(caption: String) extends Item(caption) {
  val tray = new ArrayBuffer[Item]
  def add(item: Item) = tray += item
}
