import java.util.Random

class ProbStrategy(seed: Int) extends Strategy {
  private val random = new Random(seed)
  private var prevHandValue = 0
  private var currentHandValue = 0
  private val history = Array(
	Array(1, 1, 1),
	Array(1, 1, 1),
	Array(1, 1, 1)
  )
  def nextHand: Hand = {
	val bet = random.nextInt(getSum(currentHandValue))
	var handvalue = 0
	if (bet < history(currentHandValue)(0)) {
	  handvalue = 0
	} else if (bet < history(currentHandValue)(0) + history(currentHandValue)(1)) {
	  handvalue = 1
	} else {
	  handvalue = 2
	}
	prevHandValue = currentHandValue
	currentHandValue = handvalue
	return Hand.getHand(handvalue)
  }
  private def getSum(hv: Int): Int = {
	var sum = 0
	for (h <- history(hv)) {
	  sum += h
	}
	return sum
  }
  def study(win: Boolean) = {
	if (win) {
	  history(prevHandValue)(currentHandValue) += 1
	} else {
	  history(prevHandValue)((currentHandValue + 1) % 3) += 1
	  history(prevHandValue)((currentHandValue + 2) % 3) += 1
	}
  }
}
