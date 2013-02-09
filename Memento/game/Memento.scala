package game
import java.util._

class Memento(m: Int) {
  val money = m
  val fruits = new ArrayList[String]
  def getMoney: Int = money
  def addFruit(fruit: String) = fruits.add(fruit)
  def getFruits: ArrayList[String] = fruits.clone.asInstanceOf[ArrayList[String]]
}
