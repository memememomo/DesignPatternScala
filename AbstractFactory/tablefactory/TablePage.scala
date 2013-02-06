package tablefactory
import factory._
import java.util.Iterator

class TablePage(title: String, author: String) extends Page(title, author) {
  def makeHTML: String = {
	val buffer = new StringBuffer
	buffer.append("<html><head><title>" + title + "</title></head>")
	buffer.append("<body>\n")
	buffer.append("<h1>" + title + "</h1>\n")
	buffer.append("<table width=\"80%\" border=\"3\">\n")
	val it = content.iterator
	while (it.hasNext) {
	  val item = it.next.asInstanceOf[Item]
	  buffer.append("<tr>" + item.makeHTML + "</tr>")
	}
	buffer.append("</table>\n")
	buffer.append("<hr><address>" + author + "</address>")
	buffer.append("</body></html>\n")
	return buffer.toString
  }

}
