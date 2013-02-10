object Main {
  def main(args: Array[String]) = {
	val p = new PrinterProxy("Alice")
	println("名前は現在" + p.getPrinterName + "です。")
	p.setPrinterName("Bob")
	println("名前は現在" + p.getPrinterName + "です。")
	p.print("Hello, world.")
  }
}
