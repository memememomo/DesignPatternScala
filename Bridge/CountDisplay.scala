class CountDisplay(impl: DisplayImpl) extends Display(impl) {
  def multiDisplay(times: Int) = {
	open
	for (i <- 0 to times)
	  print
	close
  }
}
