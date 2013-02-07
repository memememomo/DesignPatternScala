object Main {
  def main(args: Array[String]) = {
	if (args.length != 2) {
	  println("Usage: java Main randomseed1 randomseed2")
	  println("Example: java Main 314 15")
	  sys.exit(0)
	}
	val seed1 = Integer.parseInt(args(0))
	val seed2 = Integer.parseInt(args(1))
	val player1 = new Player("Taro", new WinningStrategy(seed1))
	val player2 = new Player("Hana", new ProbStrategy(seed2))
	for (i <- 0 to 10000) {
	  val nextHand1 = player1.nextHand
	  val nextHand2 = player2.nextHand
	  if (nextHand1.isStrongerThan(nextHand2)) {
		println("Winner:" + player1)
		player1.win
		player2.lose
	  } else if (nextHand2.isStrongerThan(nextHand1)) {
		println("Winner:" + player2)
		player1.lose
		player2.win
	  } else {
		println("Even...")
		println(player1.toString)
		println(player2.toString)
	  }
	}
	println("Total result:")
	println(player1.toString)
	println(player2.toString)
  }
}
