class TextBuilder extends Builder {
  var buffer: String = new String
  def makeTitle(title: String) = {
	buffer += "==============================\n"
	buffer += "『" + title + "』\n"
	buffer += "\n"
  }
  def makeString(str: String) = {
	buffer += '■' + str + "\n"
	buffer += "\n"
  }
  def makeItems(items: Array[String]) = {
	for (item <- items)
	  buffer += "　・" + item + "\n"
	buffer += "\n"
  }
  def close = {
	buffer += "==============================\n"
  }
  def getResult = buffer
}
