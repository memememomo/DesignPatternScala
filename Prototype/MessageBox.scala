import framework._

class MessageBox(decochar: Char) extends Product {
  def use(s: String) = {
	val length = s.getBytes.length
	for (i <- 0 to length + 4)
	  print(decochar)
	println("")
	println(decochar + " " + s + " " + decochar)
	for (i <- 0 to length + 4)
	  print(decochar)
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
