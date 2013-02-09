class DigitObserver extends Observer {
  def update(generator: NumberGenerator) = {
	println("DigitObserver:" + generator.getNumber)
	try {
	  Thread.sleep(100)
	} catch {
	  case e: InterruptedException => println("")
	}
  }
}
