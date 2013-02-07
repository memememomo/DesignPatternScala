class StringDisplayImpl(string: String) extends DisplayImpl {
  val width = string.getBytes.length
  def rawOpen = printLine
  def rawPrint = println("|" + string + "|")
  def rawClose = printLine
  def printLine = {
	print("+")
	for (i <- 0 to width)
	  print("-")
	println("+")
  }
}
