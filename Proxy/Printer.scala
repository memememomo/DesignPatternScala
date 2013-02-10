class Printer(n: String) extends Printable {
  var name = n
  heavyJob("Printerのインスタンス(" + name + ")を生成中")
  def this() = {
	this("")
	heavyJob("Printerのインスタンスを生成中")
  }
  def setPrinterName(name: String) = this.name = name
  def getPrinterName: String = name
  def print(string: String) = {
	println("=== " + name + " ===")
	println(string)
  }
  private def heavyJob(msg: String) = {
	println(msg)
	for (i <- 0 until 5) {
	  try {
		Thread.sleep(1000)
	  } catch {
		case e: InterruptedException => ""
	  }
	  System.out.print(".")
	}
	println("完了。")
  }
}
