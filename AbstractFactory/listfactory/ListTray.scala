package listfactory
import factory._
import java.util.Iterator


class ListTray(caption: String) extends Tray(caption) {
  def makeHTML: String = {
	val buffer = new StringBuffer
	buffer.append("<li>\n")
	buffer.append(caption + "\n")
	buffer.append("<ul>\n")
	val it = tray.iterator
	while (it.hasNext) {
	  val item = it.next.asInstanceOf[Item]
	  buffer.append(item.makeHTML)
	}
	buffer.append("</ul>\n")
	buffer.append("</li>\n")
	return buffer.toString
  }
}
