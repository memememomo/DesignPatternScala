abstract class Strategy {
  def nextHand: Hand
  def study(win: Boolean)
}
