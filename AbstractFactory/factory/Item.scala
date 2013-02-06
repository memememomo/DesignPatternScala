package factory

abstract class Item(caption: String) {
  def makeHTML: String
}
