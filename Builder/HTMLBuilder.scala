import java.io._

class HTMLBuilder extends Builder {
  var filename = new String
  var writer: PrintWriter = null
  def makeTitle(title: String) = {
	filename = title + ".html"
	try {
	  writer = new PrintWriter(new FileWriter(filename))
	} catch {
	  case e: IOException => e.printStackTrace
	}
	writer.println("<html><head><title>" + title + "</title></head><body>")
	writer.println("<h1>" + title + "</h1>")
  }
  def makeString(str: String) {
	writer.println("<p>" + str + "</p>")
  }
  def makeItems(items: Array[String]) = {
	writer.println("<ul>")
	for (item <- items)
	  writer.println("<li>" + item + "</li>")
	writer.println("</ul>")
  }
  def close = {
	writer.println("</body></html>")
	writer.close
  }
  def getResult: String = filename
}
