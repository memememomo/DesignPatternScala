package framework

trait Product extends Cloneable {
  def use(s: String)
  def createClone: Product
}
