object Main {
  def main(args: Array[String]) = {
	val generator = new RandomNumberGenerator
	val observer1 = new DigitObserver
	val observer2 = new GraphObserver
	generator.addObserver(observer1)
	generator.addObserver(observer2)
	generator.execute
  }
}
