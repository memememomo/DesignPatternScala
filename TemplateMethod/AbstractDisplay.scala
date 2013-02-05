abstract class AbstractDisplay {
  def open
  def print
  def close
  final def display = {
	open
	for (i <- 1 to 5)
	  print
	close
  }
}
