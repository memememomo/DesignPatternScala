class SideBorder(display: Display, ch: Char) extends Border(display) {
  val borderChar = ch
  def getColumns: Int = return 1 + display.getColumns + 1
  def getRows: Int = display.getRows
  def getRowText(row: Int): String = return borderChar + display.getRowText(row) + borderChar
}
