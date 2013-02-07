class Player(name: String, strategy: Strategy) {
  var wincount: Int = 0
  var losecount: Int = 0
  var gamecount: Int = 0
  def nextHand: Hand = strategy.nextHand
  def win = {
	strategy.study(true)
	wincount += 1
	gamecount += 1
  }
  def lose = {
	strategy.study(false)
	losecount += 1
	gamecount += 1
  }
  def even = {
	gamecount += 1
  }
  override def toString: String = "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]"
}
