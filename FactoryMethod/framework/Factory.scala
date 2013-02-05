package framework

abstract class Factory {
  final def create(owner: String): Product = {
	val p = createProduct(owner)
	registerProduct(p)
	p
  }

  def createProduct(owner: String): Product
  def registerProduct(product: Product)
}
