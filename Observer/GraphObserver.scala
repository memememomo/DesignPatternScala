class GraphObserver extends Observer {
  def update(generator: NumberGenerator) = {
	print("GraphObserver:")
	val count = generator.getNumber
	for (i <- 0 until count)
	  print("*")
	println("")
	try {
	  Thread.sleep(100)
	} catch {
	  case e: InterruptedException => println("")
	}
  }
}
