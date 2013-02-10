class PrinterProxy(n: String) extends Printable {
  private var name: String = n
  private var real: Printer = null
  def this() = this("")
  def setPrinterName(name: String) = {
	synchronized {
	  if (real != null) {
		real.setPrinterName(name)
	  }
	  this.name = name
	}
  }
  def getPrinterName: String = name
  def print(string: String) = {
	realize
	real.print(string)
  }
  private def realize = {
	synchronized {
	  if (real == null) {
		real = new Printer(name)
	  }
	}
  }
}
