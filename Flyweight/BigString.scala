class BigString(string: String) {
  val bigchars = new Array[BigChar](string.length)
  val factory = BigCharFactory.getInstance
  for (i <- 0 until bigchars.length) {
	bigchars(i) = factory.getBigChar(string.charAt(i))
  }
  def print = {
	for (i <- 0 until bigchars.length) {
	  bigchars(i).print
	}
  }
}
