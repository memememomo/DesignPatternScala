class BookShelfIterator(bookShelf: BookShelf) extends Iterator {
  var index = 0
  def hasNext: Boolean = {
	if (index < bookShelf.getLength) {
	  return true
	} else {
	  return false
	}
  }
  def next: Any = {
	val book = bookShelf.getBookAt(index)
	index += 1
	return book
  }
}
