import java.util.Random

class WinningStrategy(seed: Int) extends Strategy {
  private val random = new Random(seed)
  private var won = false
  private var prevHand: Hand = null
  def nextHand: Hand = {
	if (!won) {
	  prevHand = Hand.getHand(random.nextInt(3))
	}
	return prevHand
  }
  def study(win: Boolean) = won = win
}
