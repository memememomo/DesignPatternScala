object Main {
  def main(args: Array[String]) = {
	val alice   = new NoSupport("Alice")
	val bob     = new LimitSupport("Bob", 100)
	val charlie = new SpecialSupport("Charlie", 429)
	val diana   = new LimitSupport("Diana", 200)
	val elmo    = new OddSupport("Elmo")
	val fred    = new LimitSupport("Fred", 300)
	alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)
	for (i <- 0 until 500 by 33)
	  alice.support(new Trouble(i))
  }
}
