package game
import java.util._

class Gamer(m: Int) {
  private var money = m
  private var fruits = new ArrayList[String]
  private val random = new Random
  private val fruitsname = Array(
	"リンゴ", "ぶどう", "バナナ", "みかん"
  )
  def getMoney: Int = money
  def bet = {
	val dice = random.nextInt(6) + 1
	if (dice == 1) {
	  money = money + 100
	  println("所持金が増えました。")
	} else if (dice == 2) {
	  money = money / 2
	  println("所持金が半分になりました。")
	} else if (dice == 6) {
	  val f = getFruit
	  println("フルーツ(" + f + ")をもらいました。")
	  fruits.add(f)
	} else {
	  println("何も起こりませんでした。")
	}
  }

  def createMemento: Memento = {
	val m = new Memento(money)
	val it = fruits.iterator
	while (it.hasNext) {
	  val f = it.next.asInstanceOf[String]
	  if (f.startsWith("おいしい")) {
		m.addFruit(f)
	  }
	}
	return m
  }

  def restoreMemento(memento: Memento) = {
	this.money = memento.money
	this.fruits = memento.getFruits
  }

  override def toString: String = "[money = " + money + ", fruits = " + fruits + "]"

  def getFruit: String = {
	val prefix = if(random.nextBoolean) "おいしい" else ""
	return prefix + fruitsname(random.nextInt(fruitsname.length))
  }
}
