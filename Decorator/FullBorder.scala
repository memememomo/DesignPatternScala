class FullBorder(display: Display) extends Border(display) {
  def getColumns: Int = return 1 + display.getColumns + 1
  def getRows: Int = 1 + display.getRows + 1
  def getRowText(row: Int): String = {
	if (row == 0) {
	  return "+" + makeLine('-', display.getColumns) + "+"
	} else if (row == display.getRows + 1) {
	  return "+" + makeLine('-', display.getColumns) + "+"
	} else {
	  return "|" + display.getRowText(row - 1) + "|"
	}
  }
  private def makeLine(ch: Char, count: Int): String = {
	val buf = new StringBuffer
	for (i <- 0 to count)
	  buf.append(ch)
	return buf.toString
  }
}
