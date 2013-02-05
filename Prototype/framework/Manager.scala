package framework
import scala.collection.mutable.Map

class Manager {
  val showcase = Map[String, Product]()
  def register(name: String, proto: Product) = showcase += (name -> proto)
  def create(protoname: String):Product = {
	val p: Product = showcase(protoname)
	return p.createClone
  }
}
