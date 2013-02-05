package idcard
import framework._
import java.util._

class IDCardFactory extends Factory {
  val owners = new ArrayList[String]
  def createProduct(owner: String) = new IDCard(owner)
  def registerProduct(product: Product) = owners.add(product.asInstanceOf[IDCard].getOwner)
  def getOwners = owners
}
