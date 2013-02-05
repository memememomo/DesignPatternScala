package idcard
import framework._

class IDCard(owner: String) extends Product {
  println(owner + "のカードを作ります。")
  def use = println(owner + "のカードを使います。")
  def getOwner: String = owner
}
