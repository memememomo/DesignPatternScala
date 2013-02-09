import java.util.ArrayList
import java.util.Iterator

abstract class NumberGenerator {
  private val observers = new ArrayList[Observer]
  def addObserver(observer: Observer) = observers.add(observer)
  def deleteObserver(observer: Observer) = observers.remove(observer)
  def notifyObservers = {
	val it = observers.iterator
	while (it.hasNext) {
	  val o = it.next.asInstanceOf[Observer]
	  o.update(this)
	}
  }
  def getNumber: Int
  def execute
}
