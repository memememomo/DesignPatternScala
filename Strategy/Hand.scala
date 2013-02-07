class Hand(h: Int) {
  val handvalue = h
  private final val name = Array("グー", "チョキ", "パー")
  def isStrongerThan(h: Hand): Boolean = fight(h) == 1
  def isWeakerThan(h: Hand): Boolean = fight(h) == -1
  def fight(h: Hand): Int = {
	if (this == h) {
	  return 0
	} else if ((this.handvalue + 1) % 3 == h.handvalue) {
	  return 1
	} else {
	  return -1
	}
  }
  override def toString: String = name(handvalue)
}

object Hand {
  final val HANDVALUE_GUU = 0
  final val HANDVALUE_CHO = 1
  final val HANDVALUE_PAA = 2
  final val hand = Array(
	new Hand(HANDVALUE_GUU),
	new Hand(HANDVALUE_CHO),
	new Hand(HANDVALUE_PAA)
  )
  def getHand(handvalue: Int): Hand = this.hand(handvalue)
}
