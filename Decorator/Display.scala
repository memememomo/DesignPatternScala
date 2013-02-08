abstract class Display {
  def getColumns: Int
  def getRows: Int
  def getRowText(row: Int): String
  def show = {
	for (i <- 0 until getRows) {
	  println(getRowText(i))
	}
  }
}
