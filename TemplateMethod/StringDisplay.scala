class StringDisplay(string: String) extends AbstractDisplay {
  val width = string.getBytes().length
  def open = printLine
  def print = println("|" + string + "|")
  def close = printLine
  private def printLine = {
	System.out.print("+")
	for (i <- 0 to width)
	  System.out.print("-")
	println("+")
  }
}
