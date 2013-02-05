import framework._

class UnderlinePen(ulchar: Char) extends Product {
  def use(s: String) = {
	val length = s.getBytes.length
	println("\"" + s + "\"")
	print(" ")
	for (i <- 0 to length)
	  print(ulchar)
	println("")
  }
  def createClone: Product = {
	var p: Product = null
	try {
	  p = clone().asInstanceOf[Product]
	} catch {
	  case ex: CloneNotSupportedException => ex.printStackTrace
	}
	return p
  }
}
