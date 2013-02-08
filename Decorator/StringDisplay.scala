class StringDisplay(string: String) extends Display {
  def getColumns: Int = string.getBytes.length
  def getRows: Int = 1
  def getRowText(row: Int): String = {
	if (row == 0) {
	  return string
	} else {
	  return ""
	}
  }
}
