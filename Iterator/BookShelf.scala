class BookShelf(maxsize: Int) extends Aggregate {
  var books = new Array[Book](maxsize)
  var last = 0
  def getBookAt(index: Int) = books(index)
  def appendBook(book: Book) = {
	books(last) = book
	last += 1
  }
  def getLength: Int = last
  def iterator: Iterator = new BookShelfIterator(this)
}
