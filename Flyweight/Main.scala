object Main {
  def main(args: Array[String]) = {
	if (args.length == 0) {
	  println("Usage: java Main digits")
	  println("Example: java Main 1212123")
	  sys.exit(0)
	}
	val bs = new BigString(args(0))
	bs.print
  }
}
